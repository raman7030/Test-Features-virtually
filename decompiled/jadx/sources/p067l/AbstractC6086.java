package p067l;

/* JADX INFO: renamed from: l.ۘۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 71RN */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6086 {

    /* JADX INFO: renamed from: ᩸ */
    public final C2582 f15296 = new C2582();

    public abstract int length();

    /* JADX INFO: renamed from: ֫ */
    public abstract byte mo13853(int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo13857(int i);

    /* JADX INFO: renamed from: ܽ */
    public abstract long mo13860(int i);

    /* JADX INFO: renamed from: ᩻ */
    public abstract int mo13863(int i);

    /* JADX INFO: renamed from: ۜ */
    public int mo13855(int i) {
        int iMo13857 = mo13857(i);
        if (iMo13857 >= 0) {
            return iMo13857;
        }
        throw new C17034(null, "Encountered small uint that is out of range at offset 0x%x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m13858(int i) {
        int iMo13857 = mo13857(i);
        if (iMo13857 >= -1) {
            return iMo13857;
        }
        throw new C17034(null, "Encountered optional uint that is out of range at offset 0x%x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m13856(int i) {
        return mo13863(i) & 65535;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m13862(int i) {
        return mo13853(i) & 255;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m13861(int i) {
        long jMo13860 = mo13860(i);
        if (jMo13860 < 0 || jMo13860 > 2147483647L) {
            throw new C17034(null, "Encountered out-of-range ulong at offset 0x%x", Integer.valueOf(i));
        }
        return (int) jMo13860;
    }

    /* JADX INFO: renamed from: ܺ */
    public final C20168 m13859(int i) {
        C20168 c20168 = (C20168) this.f15296.m3892();
        if (c20168 != null) {
            c20168.m45645(i);
            c20168.m45642();
            return c20168;
        }
        return new C20168(this, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13854(C20168 c20168) {
        this.f15296.m3890(c20168);
    }
}
