package kg.megacom.validation;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;

@RestController
@Validated
public class ValidationController {
    @GetMapping("/validatePathVariable/{id}")
    ResponseEntity<String> validatePathVariable(
            @PathVariable("id") @Min(5) int id) {
        return ResponseEntity.ok("valid");
    }

    @GetMapping("/validateRequestParameter")
    ResponseEntity<String> validateRequestParameter(
            @RequestParam("param") @Min(5) int param) {
        return ResponseEntity.ok("valid");
    }


}
