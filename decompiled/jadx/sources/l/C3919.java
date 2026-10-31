package l;

import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAIZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3919 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object f12502 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Object f12503;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Object f12504;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Object f12505;

    static {
        EnumC20759 enumC20759 = EnumC20759.NONE;
        f12504 = C14407.m34432(enumC20759, new C9564());
        f12505 = C14407.m34432(enumC20759, new C8858());
        f12503 = C14407.m34432(enumC20759, new C15912());
        C14407.m34432(enumC20759, new C2508());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ܿ۠᩵] */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Class m11955() {
        return (Class) f12504.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l.ܿ۠᩵] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.ܿ۠᩵] */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final ArrayList m11956() {
        Field field;
        try {
            Object value = f12505.getValue();
            if (value != null && (field = (Field) f12503.getValue()) != null) {
                Object obj = field.get(value);
                C11233.m27800(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>");
                return (ArrayList) obj;
            }
        } catch (Throwable unused) {
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m11952() {
        Class clsM11955 = m11955();
        if (clsM11955 != null) {
            return clsM11955.getMethod("getInstance", null).invoke(null, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Field m11953() throws NoSuchFieldException {
        Class clsM11955 = m11955();
        if (clsM11955 == null) {
            return null;
        }
        Field declaredField = clsM11955.getDeclaredField("mViews");
        declaredField.setAccessible(true);
        return declaredField;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Field m11954() throws NoSuchFieldException {
        Class clsM11955 = m11955();
        if (clsM11955 == null) {
            return null;
        }
        Field declaredField = clsM11955.getDeclaredField("mParams");
        declaredField.setAccessible(true);
        return declaredField;
    }
}
