package p067l;

/* JADX INFO: renamed from: l.ۡܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: MA0S */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10913 extends AbstractC8230 implements InterfaceC8901 {

    /* JADX INFO: renamed from: ۗ */
    public int f30252 = -1;

    /* JADX INFO: renamed from: ᩶ */
    public int f30255 = 0;

    /* JADX INFO: renamed from: ۙ */
    public int f30253 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public int f30257 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public int f30256 = 0;

    /* JADX INFO: renamed from: ۬ */
    public int f30254 = 0;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo14092();

    /* JADX INFO: renamed from: ܳ */
    public abstract void mo14093(C14935 c14935);

    /* JADX INFO: renamed from: ᩳ */
    public abstract void mo14094(C14935 c14935);

    /* JADX INFO: renamed from: ۧ */
    public C11584 mo25175() {
        String strConcat;
        if (this.f30254 == 0) {
            return null;
        }
        int i = this.f30254;
        int i2 = 0;
        int i3 = 9;
        while (i3 >= i2) {
            int i4 = (i2 + i3) / 2;
            int i5 = InterfaceC22313.f70458[i4];
            if (i > i5) {
                i2 = i4 + 1;
            } else {
                if (i >= i5) {
                    strConcat = InterfaceC22313.f70457[i4];
                    return new C11584(strConcat);
                }
                i3 = i4 - 1;
            }
        }
        strConcat = "0x".concat(C13854.m31529(i, 8));
        return new C11584(strConcat);
    }

    @Override // p067l.AbstractC8230
    /* JADX INFO: renamed from: ۧ */
    public final void mo4602(C14935 c14935) {
        int i = c14935.f42650;
        c14935.m34157(16);
        int i2 = 0;
        if (this.f30252 == 0) {
            int i3 = c14935.f42650;
            c14935.m34167(0);
            c14935.m34165(0);
            c14935.m34165(mo14092());
            i2 = i3;
        }
        mo14093(c14935);
        int i4 = c14935.f42650 - i;
        this.f30253 = i4;
        if (this.f30252 == 0) {
            c14935.f42650 = i2;
            int i5 = i4 - i2;
            this.f30256 = i5;
            c14935.m34167(i5);
        }
        c14935.f42650 = i;
        m25177(c14935);
        c14935.f42650 = i + this.f30253;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m25177(C14935 c14935) {
        c14935.m34162(5);
        c14935.m34162(0);
        c14935.m34162(this.f30252);
        c14935.m34162(this.f30255);
        c14935.m34167(16);
        c14935.m34165(this.f30253);
        c14935.m34165(0);
        c14935.m34167(this.f30257);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m25176(C14935 c14935) throws C14265 {
        if (c14935.m34163() != 5 || c14935.m34163() != 0) {
            throw new C14265("DCERPC version not supported");
        }
        this.f30252 = c14935.m34163();
        this.f30255 = c14935.m34163();
        if (c14935.m34156() != 16) {
            throw new C14265("Data representation not supported");
        }
        this.f30253 = c14935.m34160();
        if (c14935.m34160() != 0) {
            throw new C14265("DCERPC authentication not supported");
        }
        this.f30257 = c14935.m34156();
    }

    @Override // p067l.AbstractC8230
    /* JADX INFO: renamed from: ֫ */
    public final void mo4601(C14935 c14935) throws C14265 {
        m25176(c14935);
        int i = this.f30252;
        if (i != 12 && i != 2 && i != 3 && i != 13) {
            throw new C14265("Unexpected ptype: " + this.f30252);
        }
        if (i == 2 || i == 3) {
            this.f30256 = c14935.m34156();
            c14935.m34160();
            c14935.m34160();
        }
        int i2 = this.f30252;
        if (i2 == 3 || i2 == 13) {
            this.f30254 = c14935.m34156();
        } else {
            mo14094(c14935);
        }
    }
}
