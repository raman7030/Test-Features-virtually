package p067l;

/* JADX INFO: renamed from: l.ۙᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PBHV */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6944 {

    /* JADX INFO: renamed from: ֫ */
    public final C10297 f18065;

    /* JADX INFO: renamed from: ۧ */
    public final C23708 f18066;

    /* JADX INFO: renamed from: ܽ */
    public final C14260 f18067;

    /* JADX INFO: renamed from: ܿ */
    public final int f18068;

    /* JADX INFO: renamed from: ᩳ */
    public int f18069;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo12410();

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC8285 mo12411(int i, int i2, C21637 c21637, C15660 c15660);

    /* JADX INFO: renamed from: ܿ */
    public abstract String mo12412();

    public AbstractC6944(C23708 c23708, C14260 c14260, int i, C10297 c10297) {
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (c10297 == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        this.f18066 = c23708;
        this.f18067 = c14260;
        this.f18068 = i;
        this.f18065 = c10297;
        this.f18069 = -1;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m15917() {
        m15915();
        return this.f18069;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m15915() {
        if (this.f18069 < 0) {
            int iMo12410 = mo12410();
            int iM15914 = m15914();
            int iM38592 = this.f18068 + 2;
            C23708 c23708 = this.f18066;
            C13000 c13000M52729 = c23708.m52729();
            C12249 c12249M52728 = c23708.m52728();
            for (int i = 0; i < iM15914; i++) {
                try {
                    int iM29815 = c13000M52729.m29815(iM38592);
                    int iM29816 = c13000M52729.m29815(iM38592 + 2);
                    int iM29817 = c13000M52729.m29815(iM38592 + 4);
                    C14930 c14930 = (C14930) c12249M52728.get(iM29816);
                    C14930 c14931 = (C14930) c12249M52728.get(iM29817);
                    C17001 c17001 = new C17001(c23708, iMo12410, iM38592 + 6, this.f18065);
                    iM38592 = c17001.m38592();
                    C15660 c15660M38593 = c17001.m38593();
                    c15660M38593.mo22326();
                    mo12411(i, iM29815, new C21637(c14930, c14931), c15660M38593);
                } catch (C24378 e) {
                    e.m23570("...while parsing " + mo12412() + "s[" + i + "]");
                    throw e;
                } catch (RuntimeException e2) {
                    C24378 c24378 = new C24378(null, e2);
                    c24378.m23570("...while parsing " + mo12412() + "s[" + i + "]");
                    throw c24378;
                }
            }
            this.f18069 = iM38592;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m15914() {
        return this.f18066.m52729().m29815(this.f18068);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C14260 m15916() {
        return this.f18067;
    }
}
