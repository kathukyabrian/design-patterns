package tech.meliora.natujenge.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
// SOURCE - retained only on the source level - ignored by the compiler
// CLASS - retained by the compiler at compile time but is ignored by JVM
// RUNTIME - retained by JVM so it can  be used in runtime env
@Target(ElementType.TYPE)
// TYPE is for class level
// FIELD is for field level
// CONSTRUCTOR - constructor
// ANNOTATION_TYPE - annotation
// LOCAL_VARIABLE - local variable
// METHOD - method
// PACKAGE - package
// PARAMETER - parameter
public @interface Service {


}
