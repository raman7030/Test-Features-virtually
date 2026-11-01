package p067l;

/* JADX INFO: renamed from: l.ۙ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17T0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7026 {

    /* JADX INFO: renamed from: ֫ */
    public final C21111 f18311 = new C21111();

    /* JADX INFO: renamed from: ܳ */
    public static final C10321 f18307 = new C10321();

    /* JADX INFO: renamed from: ܿ */
    public static final C6634 f18309 = new C6634();

    /* JADX INFO: renamed from: ܽ */
    public static final int f18308 = m16158("default");

    /* JADX INFO: renamed from: ۧ */
    public static final int f18306 = m16158("comment");

    /* JADX INFO: renamed from: ᩳ */
    public static final int f18310 = m16158("number");

    static {
        m16158("string");
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m16158(String str) {
        int iMo26852;
        if (str == null) {
            return 0;
        }
        boolean zStartsWith = str.startsWith("!!");
        if (zStartsWith) {
            str = str.substring(2);
        }
        C10321 c10321 = f18307;
        synchronized (c10321) {
            iMo26852 = c10321.mo26852(-1, str);
            if (iMo26852 == -1) {
                iMo26852 = c10321.size() + 1;
                c10321.mo23936(iMo26852, (Object) str);
                f18309.mo4686(iMo26852, str);
            }
            if (zStartsWith) {
                iMo26852 = -iMo26852;
            }
        }
        return iMo26852;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m16157(String str) {
        int iMo26852;
        if (str == null) {
            return f18308;
        }
        C10321 c10321 = f18307;
        synchronized (c10321) {
            iMo26852 = c10321.mo26852(f18308, str);
        }
        return iMo26852;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m16159(int i) {
        if (i == 0) {
            return null;
        }
        synchronized (f18307) {
            try {
                if (i < 0) {
                    String str = (String) f18309.get(-i);
                    C12826.requireNonNull(str);
                    return "!!".concat(str);
                }
                String str2 = (String) f18309.get(i);
                C12826.requireNonNull(str2);
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16162(String str, C23120 c23120) {
        this.f18311.mo4686(m16158(str), c23120);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23120 m16160(int i) {
        return (C23120) this.f18311.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16161() {
        this.f18311.clear();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m16164() {
        return this.f18311.size();
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC20007 m16163() {
        return this.f18311.mo8079();
    }
}
