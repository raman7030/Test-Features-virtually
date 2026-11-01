package p067l;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: renamed from: l.ܺܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U87V */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17643 {

    /* JADX INFO: renamed from: ֫ */
    public static final AbstractC17643 f52705;

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo25212(Object obj, AccessibleObject accessibleObject);

    static {
        AbstractC17643 c11610;
        if (C13641.m31021()) {
            try {
                c11610 = new C11610(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
                c11610 = null;
            }
        } else {
            c11610 = null;
        }
        if (c11610 == null) {
            c11610 = new C10939();
        }
        f52705 = c11610;
    }
}
