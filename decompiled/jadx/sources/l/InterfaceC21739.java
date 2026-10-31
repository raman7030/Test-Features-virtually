package l;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: l.᩸ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4831 */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC21739 {
    boolean nullSafe() default true;

    Class value();
}
