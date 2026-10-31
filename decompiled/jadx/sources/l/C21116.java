package l;

/* JADX INFO: renamed from: l.᩷᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M1T7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21116 extends AbstractC17587 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C14764 f68106;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7004 f68107;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C22817 f68108;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C14764 f68109;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC5593 f68110;

    public C21116(C22817 c22817, AbstractC5593 abstractC5593, int i, int i2, int i3) {
        super(i3);
        this.f68109 = new C14764(this);
        this.f68106 = new C14764(this);
        this.f68108 = c22817;
        this.f68110 = abstractC5593;
        this.f68107 = new C7004(this, i, i2);
        mo8553();
    }

    @Override // l.AbstractC17587
    /* JADX INFO: renamed from: ֫ */
    public final void mo8553() {
        super.mo8553();
        this.f68107.m18941();
        this.f68109.mo24895();
        this.f68106.mo24895();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m48081() {
        return this.f53746[0] == -1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48080() throws C22609 {
        int i;
        int iM35068;
        C22817 c22817 = this.f68108;
        c22817.m50926();
        while (true) {
            boolean zM50924 = c22817.m50924();
            AbstractC5593 abstractC5593 = this.f68110;
            if (zM50924) {
                int iM50915 = c22817.m50915() & this.f53747;
                short[][] sArr = this.f53753;
                C0653 c0653 = this.f53750;
                if (abstractC5593.m15878(sArr[c0653.m2666()], iM50915) == 0) {
                    this.f68107.m18940();
                } else {
                    int iM15878 = abstractC5593.m15878(this.f53752, c0653.m2666());
                    int iM35069 = 1;
                    int[] iArr = this.f53746;
                    if (iM15878 == 0) {
                        c0653.m2669();
                        iArr[3] = iArr[2];
                        iArr[2] = iArr[1];
                        iArr[1] = iArr[0];
                        iM35068 = this.f68109.m35068(iM50915);
                        int iM15879 = abstractC5593.m15879(this.f53748[iM35068 < 6 ? iM35068 - 2 : 3]);
                        if (iM15879 < 4) {
                            iArr[0] = iM15879;
                        } else {
                            int i2 = iM15879 >> 1;
                            int i3 = (2 | (iM15879 & 1)) << (i2 - 1);
                            iArr[0] = i3;
                            if (iM15879 < 14) {
                                short[] sArr2 = this.f53751[iM15879 - 4];
                                int i4 = 1;
                                int i5 = 0;
                                int i6 = 0;
                                while (true) {
                                    int iM158710 = abstractC5593.m15878(sArr2, i4);
                                    i4 = (i4 << 1) | iM158710;
                                    int i7 = i6 + 1;
                                    i5 |= iM158710 << i6;
                                    if (i4 >= sArr2.length) {
                                        break;
                                    } else {
                                        i6 = i7;
                                    }
                                }
                                iArr[0] = i3 | i5;
                            } else {
                                int iM15877 = i3 | (abstractC5593.m15877(i2 - 5) << 4);
                                iArr[0] = iM15877;
                                int i8 = 1;
                                int i9 = 0;
                                int i10 = 0;
                                while (true) {
                                    short[] sArr3 = this.f53744;
                                    int iM158711 = abstractC5593.m15878(sArr3, i8);
                                    i8 = (i8 << 1) | iM158711;
                                    int i11 = i10 + 1;
                                    i9 |= iM158711 << i10;
                                    if (i8 >= sArr3.length) {
                                        break;
                                    } else {
                                        i10 = i11;
                                    }
                                }
                                iArr[0] = iM15877 | i9;
                            }
                        }
                    } else {
                        if (abstractC5593.m15878(this.f53749, c0653.m2666()) == 0) {
                            if (abstractC5593.m15878(this.f53755[c0653.m2666()], iM50915) == 0) {
                                c0653.m2673();
                            }
                            iM35068 = iM35069;
                        } else {
                            if (abstractC5593.m15878(this.f53745, c0653.m2666()) == 0) {
                                i = iArr[1];
                            } else {
                                if (abstractC5593.m15878(this.f53754, c0653.m2666()) == 0) {
                                    i = iArr[2];
                                } else {
                                    i = iArr[3];
                                    iArr[3] = iArr[2];
                                }
                                iArr[2] = iArr[1];
                            }
                            iArr[1] = iArr[0];
                            iArr[0] = i;
                        }
                        c0653.m2671();
                        iM35069 = this.f68106.m35068(iM50915);
                        iM35068 = iM35069;
                    }
                    c22817.m50919(iArr[0], iM35068);
                }
            } else {
                abstractC5593.mo4772();
                return;
            }
        }
    }
}
