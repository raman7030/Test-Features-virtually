package l;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: alphabetic */
/* JADX WARN: Method from annotation default annotation not found: asm */
/* JADX INFO: renamed from: l.۫۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAVL */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC12261 {
    String[] ignores() default {};

    Class mappingTo() default Void.class;

    EnumC4500 naming() default EnumC4500.CamelCase;

    String[] orders() default {};

    EnumC13671[] parseFeatures() default {};

    Class[] seeAlso() default {};

    EnumC20837[] serialzeFeatures() default {};

    String typeKey() default "";

    String typeName() default "";
}
