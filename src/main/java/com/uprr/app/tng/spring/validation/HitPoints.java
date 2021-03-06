package com.uprr.app.tng.spring.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * Created by david on 1/23/17.
 */
@NotNull(message = "{validation.hp.null}")
@IntegerRange(min = 1, max = 100, message = "{validation.hp.out_of_range}")
@Target({
    FIELD,
    PARAMETER,
    METHOD,
    ANNOTATION_TYPE,
    LOCAL_VARIABLE
})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
@Documented
public @interface HitPoints {
    String message() default  "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
