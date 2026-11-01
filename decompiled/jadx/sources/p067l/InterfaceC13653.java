package p067l;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: l.ۨᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB98 */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC13653 {
    EnumC15663 cls() default EnumC15663.AUTOMATIC;

    EnumC4245 elementType() default EnumC4245.ANY;

    int index() default 0;

    Class listElementType() default Object.class;

    boolean optional() default false;

    int tagNumber() default -1;

    EnumC9629 tagging() default EnumC9629.NORMAL;

    EnumC4245 type();
}
