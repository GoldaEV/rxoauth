package cz.ackee.rxoauth

/**
 * Annotation that marks [Retrofit] interface method with info that auth check will not be
 * performed for this response. Useful for login/logout endpoints.
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class IgnoreAuth