package net.engio.mbassy.listener;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.engio.mbassy.dispatch.ReflectiveHandlerInvocation;

/* JADX INFO: loaded from: classes.dex */
@Inherited
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Handler {
    String condition() default "";

    Invoke delivery() default Invoke.Synchronously;

    boolean enabled() default true;

    Filter[] filters() default {};

    Class invocation() default ReflectiveHandlerInvocation.class;

    int priority() default 0;

    boolean rejectSubtypes() default false;
}
