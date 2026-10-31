package l;

/* JADX INFO: renamed from: l.ۙ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17T0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4900 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19720 f15478 = new C19720();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C8367 f15474 = new C8367();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C4488 f15476 = new C4488();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f15475 = m14261("default");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f15473 = m14261("comment");

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int f15477 = m14261("number");

    static {
        m14261("string");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m14261(String str) {
        int iMo24837;
        if (str == null) {
            return 0;
        }
        boolean zStartsWith = str.startsWith("!!");
        if (zStartsWith) {
            str = str.substring(2);
        }
        C8367 c8367 = f15474;
        synchronized (c8367) {
            iMo24837 = c8367.mo24837(-1, str);
            if (iMo24837 == -1) {
                iMo24837 = c8367.size() + 1;
                c8367.mo21965(iMo24837, (Object) str);
                f15476.mo2318(iMo24837, str);
            }
            if (zStartsWith) {
                iMo24837 = -iMo24837;
            }
        }
        return iMo24837;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m14260(String str) {
        int iMo24837;
        if (str == null) {
            return f15475;
        }
        C8367 c8367 = f15474;
        synchronized (c8367) {
            iMo24837 = c8367.mo24837(f15475, str);
        }
        return iMo24837;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m14262(int i) {
        if (i == 0) {
            return null;
        }
        synchronized (f15474) {
            try {
                if (i < 0) {
                    String str = (String) f15476.get(-i);
                    C11003.requireNonNull(str);
                    return "!!".concat(str);
                }
                String str2 = (String) f15476.get(i);
                C11003.requireNonNull(str2);
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14265(String str, C21834 c21834) {
        this.f15478.mo2318(m14261(str), c21834);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 m14263(int i) {
        return (C21834) this.f15478.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14264() {
        this.f15478.clear();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m14267() {
        return this.f15478.size();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18559 m14266() {
        return this.f15478.mo5869();
    }
}
