package p067l;

/* JADX INFO: renamed from: l.۠۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M45G */
/* JADX INFO: loaded from: classes3.dex */
public final class C10013 {

    /* JADX INFO: renamed from: ֫ */
    public final C3307[] f27714;

    /* JADX INFO: renamed from: ۧ */
    public final int f27715;

    public C10013(int i, C3307... c3307Arr) {
        this.f27715 = i;
        this.f27714 = c3307Arr;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m23329() {
        return this.f27715;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m23330() {
        int iM5754 = 0;
        for (C3307 c3307 : this.f27714) {
            iM5754 += c3307.m5754();
        }
        return iM5754;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m23331() {
        return m23330() * this.f27715;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3307[] m23328() {
        return this.f27714;
    }
}
