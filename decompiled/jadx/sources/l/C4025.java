package l;

/* JADX INFO: renamed from: l.ۘܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5JX */
/* JADX INFO: loaded from: classes2.dex */
public final class C4025 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12110(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12109(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12105(long j, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(C10375.m26179(str, Long.valueOf(j)));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12107(Object obj, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(C10375.m26179(str, obj));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12108(String str, int i, int i2, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(C10375.m26179(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12111(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(C10375.m26179(str, obj, obj2));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m12116(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m12115(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m12113(long j, String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(C10375.m26179(str, Long.valueOf(j)));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m12114(Object obj, String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(C10375.m26179(str, obj));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12106(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12103(int i, int i2) {
        String strM26179;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM26179 = C10375.m26179("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(C19370.m44628(i2, "negative size: "));
                }
                strM26179 = C10375.m26179("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM26179);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m12112(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m12102(i, i2, "index"));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m12102(int i, int i2, String str) {
        if (i < 0) {
            return C10375.m26179("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C10375.m26179("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(C19370.m44628(i2, "negative size: "));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12104(int i, int i2, int i3) {
        String strM12102;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM12102 = m12102(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                strM12102 = m12102(i2, i3, "end index");
            } else {
                strM12102 = C10375.m26179("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM12102);
        }
    }
}
