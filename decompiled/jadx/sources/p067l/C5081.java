package p067l;

/* JADX INFO: renamed from: l.ۖ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes2.dex */
public final class C5081 {

    /* JADX INFO: renamed from: ֫ */
    public static C17820 f11910;

    /* JADX INFO: renamed from: ۧ */
    public static boolean f11911;

    /* JADX INFO: renamed from: ֫ */
    public static Class m10808() {
        int i;
        C17820 c17820 = f11910;
        if (c17820 == null) {
            if (f11911) {
                c17820 = null;
            } else {
                try {
                    c17820 = new C17820();
                } catch (SecurityException unused) {
                    c17820 = null;
                }
                f11910 = c17820;
                f11911 = true;
            }
        }
        if (c17820 == null) {
            return null;
        }
        Class[] classContext = c17820.getClassContext();
        String name = C5081.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m10809(String str) {
        System.err.println("SLF4J: " + str);
    }
}
