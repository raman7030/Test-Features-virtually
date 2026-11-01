package p067l;

import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAIZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6093 {

    /* JADX INFO: renamed from: ֫ */
    public static final Object f15310 = null;

    /* JADX INFO: renamed from: ۧ */
    public static final Object f15311;

    /* JADX INFO: renamed from: ܽ */
    public static final Object f15312;

    /* JADX INFO: renamed from: ᩳ */
    public static final Object f15313;

    static {
        EnumC22098 enumC22098 = EnumC22098.NONE;
        f15312 = C16061.m36566(enumC22098, new C11458());
        f15313 = C16061.m36566(enumC22098, new C10787());
        f15311 = C16061.m36566(enumC22098, new C17491());
        C16061.m36566(enumC22098, new C4752());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ܿ۠᩵] */
    /* JADX INFO: renamed from: ܿ */
    public static Class m13875() {
        return (Class) f15312.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l.ܿ۠᩵] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.ܿ۠᩵] */
    /* JADX INFO: renamed from: ᩳ */
    public static final ArrayList m13876() {
        Field field;
        try {
            Object value = f15313.getValue();
            if (value != null && (field = (Field) f15311.getValue()) != null) {
                Object obj = field.get(value);
                C13045.m29862(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>");
                return (ArrayList) obj;
            }
        } catch (Throwable unused) {
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m13872() {
        Class clsM13875 = m13875();
        if (clsM13875 != null) {
            return clsM13875.getMethod("getInstance", null).invoke(null, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static Field m13873() throws NoSuchFieldException {
        Class clsM13875 = m13875();
        if (clsM13875 == null) {
            return null;
        }
        Field declaredField = clsM13875.getDeclaredField("mViews");
        declaredField.setAccessible(true);
        return declaredField;
    }

    /* JADX INFO: renamed from: ܽ */
    public static Field m13874() throws NoSuchFieldException {
        Class clsM13875 = m13875();
        if (clsM13875 == null) {
            return null;
        }
        Field declaredField = clsM13875.getDeclaredField("mParams");
        declaredField.setAccessible(true);
        return declaredField;
    }
}
