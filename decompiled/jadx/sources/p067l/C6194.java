package p067l;

/* JADX INFO: renamed from: l.ۘܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5JX */
/* JADX INFO: loaded from: classes2.dex */
public final class C6194 {
    /* JADX INFO: renamed from: ֫ */
    public static void m14030(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14029(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14025(long j, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(C12229.m28208(str, Long.valueOf(j)));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14027(Object obj, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(C12229.m28208(str, obj));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14028(String str, int i, int i2, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(C12229.m28208(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14031(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(C12229.m28208(str, obj, obj2));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m14036(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m14035(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m14033(long j, String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(C12229.m28208(str, Long.valueOf(j)));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m14034(Object obj, String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(C12229.m28208(str, obj));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14026(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14023(int i, int i2) {
        String strM28208;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM28208 = C12229.m28208("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(C20778.m46922(i2, "negative size: "));
                }
                strM28208 = C12229.m28208("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM28208);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m14032(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m14022(i, i2, "index"));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m14022(int i, int i2, String str) {
        if (i < 0) {
            return C12229.m28208("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C12229.m28208("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(C20778.m46922(i2, "negative size: "));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14024(int i, int i2, int i3) {
        String strM14022;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM14022 = m14022(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                strM14022 = m14022(i2, i3, "end index");
            } else {
                strM14022 = C12229.m28208("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM14022);
        }
    }
}
