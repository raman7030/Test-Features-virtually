package l;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: l.۫۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71PH */
/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.CLASS)
public @interface InterfaceC12287 {
    boolean flatten() default true;
}
