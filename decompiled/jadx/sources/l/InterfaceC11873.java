package l;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: l.ۨᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB98 */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC11873 {
    EnumC13988 cls() default EnumC13988.AUTOMATIC;

    EnumC1974 elementType() default EnumC1974.ANY;

    int index() default 0;

    Class listElementType() default Object.class;

    boolean optional() default false;

    int tagNumber() default -1;

    EnumC7639 tagging() default EnumC7639.NORMAL;

    EnumC1974 type();
}
