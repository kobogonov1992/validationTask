//package kg.megacom.validation.validation;
//
//import javax.validation.Constraint;
//import javax.validation.Payload;
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
//@Target({ElementType.METHOD,ElementType.FIELD,ElementType.TYPE,ElementType.ANNOTATION_TYPE}) // Allowed to use @ on class level, but we can choose even Method or field
//@Retention(RetentionPolicy.RUNTIME) // Retention policy for runtime, we can choose compile time as well
//@Constraint(validatedBy = AgeValidation.class ) // Valid logic
//public @interface Age {
//    String message() default "Age error";
//    Class <?>[]groups() default { };
//    public abstract Class<? extends Payload>[] payload() default {};
//}