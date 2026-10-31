package l;

import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: l.ᩳܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB5A */
/* JADX INFO: loaded from: classes4.dex */
public final class C18202 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Annotation m42417(Class cls) {
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            if (InterfaceC21751.class.equals(annotation.annotationType())) {
                return (Annotation) InterfaceC21751.class.cast(annotation);
            }
        }
        return null;
    }
}
