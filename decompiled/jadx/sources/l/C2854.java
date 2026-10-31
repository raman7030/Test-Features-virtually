package l;

/* JADX INFO: renamed from: l.ۖ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes2.dex */
public final class C2854 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16258 f9110;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f9111;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Class m8741() {
        int i;
        C16258 c16258 = f9110;
        if (c16258 == null) {
            if (f9111) {
                c16258 = null;
            } else {
                try {
                    c16258 = new C16258();
                } catch (SecurityException unused) {
                    c16258 = null;
                }
                f9110 = c16258;
                f9111 = true;
            }
        }
        if (c16258 == null) {
            return null;
        }
        Class[] classContext = c16258.getClassContext();
        String name = C2854.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m8742(String str) {
        System.err.println("SLF4J: " + str);
    }
}
