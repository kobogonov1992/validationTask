package kg.megacom.validation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;
import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Controller
public class WebController implements WebMvcConfigurer {

    private List<PersonForm> persons;

    public WebController( List<PersonForm> persons) {
        this.persons = persons;
    }

    @GetMapping("/persons")
    public String getAllPersons(@Valid Model model){
        model.addAttribute("persons",persons);
        return "persons";
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }


    @GetMapping("/")
    public String showForm(PersonForm personForm) {
        return "form";
    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid @ModelAttribute("personForm") PersonForm personForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form";
        }
        persons.add(personForm);
        return "redirect:/persons";
    }


    @InitBinder
//     Эта аннотация использует метод WebDataBinder которая extends DataBinder
//     DataBinder определяется в контроллере для привязки параметров вэб-запроса с объектами Java Bean
//     Также используют для  custom validation Bean
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class,
                new DateEditor());
    }


//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        binder.registerCustomEditor(LocalDate.class, new PropertyEditorSupport() {
//            @Override
//            public void setAsText(String text) throws IllegalArgumentException{
//                setValue(LocalDate.parse(text, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//            }
//
//            @Override
//            public String getAsText() throws IllegalArgumentException {
//                return DateTimeFormatter.ofPattern("yyyy-MM-dd").format((LocalDate) getValue());
//            }
//        });
//    }
}
