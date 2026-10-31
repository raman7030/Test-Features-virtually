package l;

/* JADX INFO: renamed from: l.ۡܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: MA0S */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8990 extends AbstractC6167 implements InterfaceC6873 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f27318 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f27321 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f27319 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f27323 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f27322 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f27320 = 0;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo12171();

    /* JADX INFO: renamed from: ܳ */
    public abstract void mo12172(C13222 c13222);

    /* JADX INFO: renamed from: ᩳ */
    public abstract void mo12173(C13222 c13222);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9696 mo23231() {
        String strConcat;
        if (this.f27320 == 0) {
            return null;
        }
        int i = this.f27320;
        int i2 = 0;
        int i3 = 9;
        while (i3 >= i2) {
            int i4 = (i2 + i3) / 2;
            int i5 = InterfaceC20985.f67773[i4];
            if (i > i5) {
                i2 = i4 + 1;
            } else {
                if (i >= i5) {
                    strConcat = InterfaceC20985.f67772[i4];
                    return new C9696(strConcat);
                }
                i3 = i4 - 1;
            }
        }
        strConcat = "0x".concat(C12085.m29467(i, 8));
        return new C9696(strConcat);
    }

    @Override // l.AbstractC6167
    /* JADX INFO: renamed from: ۧ */
    public final void mo2235(C13222 c13222) {
        int i = c13222.f39586;
        c13222.m32059(16);
        int i2 = 0;
        if (this.f27318 == 0) {
            int i3 = c13222.f39586;
            c13222.m32069(0);
            c13222.m32067(0);
            c13222.m32067(mo12171());
            i2 = i3;
        }
        mo12172(c13222);
        int i4 = c13222.f39586 - i;
        this.f27319 = i4;
        if (this.f27318 == 0) {
            c13222.f39586 = i2;
            int i5 = i4 - i2;
            this.f27322 = i5;
            c13222.m32069(i5);
        }
        c13222.f39586 = i;
        m23233(c13222);
        c13222.f39586 = i + this.f27319;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m23233(C13222 c13222) {
        c13222.m32064(5);
        c13222.m32064(0);
        c13222.m32064(this.f27318);
        c13222.m32064(this.f27321);
        c13222.m32069(16);
        c13222.m32067(this.f27319);
        c13222.m32067(0);
        c13222.m32069(this.f27323);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m23232(C13222 c13222) throws C12517 {
        if (c13222.m32065() != 5 || c13222.m32065() != 0) {
            throw new C12517("DCERPC version not supported");
        }
        this.f27318 = c13222.m32065();
        this.f27321 = c13222.m32065();
        if (c13222.m32058() != 16) {
            throw new C12517("Data representation not supported");
        }
        this.f27319 = c13222.m32062();
        if (c13222.m32062() != 0) {
            throw new C12517("DCERPC authentication not supported");
        }
        this.f27323 = c13222.m32058();
    }

    @Override // l.AbstractC6167
    /* JADX INFO: renamed from: ֫ */
    public final void mo2234(C13222 c13222) throws C12517 {
        m23232(c13222);
        int i = this.f27318;
        if (i != 12 && i != 2 && i != 3 && i != 13) {
            throw new C12517("Unexpected ptype: " + this.f27318);
        }
        if (i == 2 || i == 3) {
            this.f27322 = c13222.m32058();
            c13222.m32062();
            c13222.m32062();
        }
        int i2 = this.f27318;
        if (i2 == 3 || i2 == 13) {
            this.f27320 = c13222.m32058();
        } else {
            mo12173(c13222);
        }
    }
}
