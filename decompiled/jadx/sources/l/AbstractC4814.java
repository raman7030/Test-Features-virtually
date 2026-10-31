package l;

/* JADX INFO: renamed from: l.ۙᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PBHV */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4814 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8342 f15232;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22453 f15233;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12512 f15234;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f15235;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f15236;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo10371();

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC6225 mo10372(int i, int i2, C20274 c20274, C13985 c13985);

    /* JADX INFO: renamed from: ܿ */
    public abstract String mo10373();

    public AbstractC4814(C22453 c22453, C12512 c12512, int i, C8342 c8342) {
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (c8342 == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        this.f15233 = c22453;
        this.f15234 = c12512;
        this.f15235 = i;
        this.f15232 = c8342;
        this.f15236 = -1;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m14037() {
        m14035();
        return this.f15236;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m14035() {
        if (this.f15236 < 0) {
            int iMo10371 = mo10371();
            int iM14034 = m14034();
            int iM36434 = this.f15235 + 2;
            C22453 c22453 = this.f15233;
            C11186 c11186M50388 = c22453.m50388();
            C10396 c10396M50387 = c22453.m50387();
            for (int i = 0; i < iM14034; i++) {
                try {
                    int iM27753 = c11186M50388.m27753(iM36434);
                    int iM27754 = c11186M50388.m27753(iM36434 + 2);
                    int iM27755 = c11186M50388.m27753(iM36434 + 4);
                    C13217 c13217 = (C13217) c10396M50387.get(iM27754);
                    C13217 c13218 = (C13217) c10396M50387.get(iM27755);
                    C15396 c15396 = new C15396(c22453, iMo10371, iM36434 + 6, this.f15232);
                    iM36434 = c15396.m36434();
                    C13985 c13985M36435 = c15396.m36435();
                    c13985M36435.mo20349();
                    mo10372(i, iM27753, new C20274(c13217, c13218), c13985M36435);
                } catch (C23158 e) {
                    e.m21602("...while parsing " + mo10373() + "s[" + i + "]");
                    throw e;
                } catch (RuntimeException e2) {
                    C23158 c23158 = new C23158(null, e2);
                    c23158.m21602("...while parsing " + mo10373() + "s[" + i + "]");
                    throw c23158;
                }
            }
            this.f15236 = iM36434;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m14034() {
        return this.f15233.m50388().m27753(this.f15235);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12512 m14036() {
        return this.f15234;
    }
}
