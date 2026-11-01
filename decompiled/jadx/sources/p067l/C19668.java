package p067l;

import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: l.ᩳܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB5A */
/* JADX INFO: loaded from: classes4.dex */
public final class C19668 {
    /* JADX INFO: renamed from: ֫ */
    public static Annotation m44678(Class cls) {
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            if (InterfaceC23041.class.equals(annotation.annotationType())) {
                return (Annotation) InterfaceC23041.class.cast(annotation);
            }
        }
        return null;
    }
}
