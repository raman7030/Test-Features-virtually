package p067l;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: parseFeatures */
/* JADX INFO: renamed from: l.۬۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAUW */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC14691 {
    String[] alternateNames() default {};

    boolean deserialize() default true;

    String format() default "";

    String name() default "";

    int ordinal() default 0;

    boolean serialize() default true;

    EnumC22172[] serialzeFeatures() default {};
}
