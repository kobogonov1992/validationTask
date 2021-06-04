//package kg.megacom.validation.validation;
//
//import kg.megacom.validation.PersonForm;
//
//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//import java.time.LocalDate;
//import java.time.Period;
//
//public class AgeValidation implements ConstraintValidator<Age, PersonForm> {
//
//    @Override
//    public boolean isValid(PersonForm personForm, ConstraintValidatorContext constraintValidatorContext) {
//        Period p =  Period.between(personForm.getBirthday(),LocalDate.now());
//
//        return p.getYears()==personForm.getAge();
//    }
//
//    @Override
//    public void initialize(Age constraintAnnotation) {
//
//    }
//}
//
