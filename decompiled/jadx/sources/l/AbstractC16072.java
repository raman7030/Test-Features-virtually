package l;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: renamed from: l.ܺܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U87V */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16072 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC16072 f49542;

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo23268(Object obj, AccessibleObject accessibleObject);

    static {
        AbstractC16072 c9724;
        if (C11861.m28970()) {
            try {
                c9724 = new C9724(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
                c9724 = null;
            }
        } else {
            c9724 = null;
        }
        if (c9724 == null) {
            c9724 = new C9018();
        }
        f49542 = c9724;
    }
}
