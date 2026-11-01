package p067l;

/* JADX INFO: renamed from: l.᩻᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8DA */
/* JADX INFO: loaded from: classes.dex */
public final class C25159 extends C6956 implements InterfaceC22400 {

    /* JADX INFO: renamed from: ֡ */
    public C11078 f80499;

    /* JADX INFO: renamed from: ֨ */
    public int f80500;

    /* JADX INFO: renamed from: ۖ */
    public final C14332 f80501;

    /* JADX INFO: renamed from: ۘ */
    public final C10309 f80502;

    /* JADX INFO: renamed from: ۚ */
    public final C5203 f80503;

    /* JADX INFO: renamed from: ۜ */
    public final C14332 f80504;

    /* JADX INFO: renamed from: ۠ */
    public final C11671 f80505;

    /* JADX INFO: renamed from: ۡ */
    public final C10309 f80506;

    /* JADX INFO: renamed from: ۢ */
    public final C24390 f80507;

    /* JADX INFO: renamed from: ܶ */
    public int f80508;

    /* JADX INFO: renamed from: ܺ */
    public final C8297 f80509;

    /* JADX INFO: renamed from: ᩴ */
    public final C10309 f80510;

    /* JADX INFO: renamed from: ᩵ */
    public int f80511;

    /* JADX INFO: renamed from: ᩷ */
    public final C10309 f80512;

    /* JADX INFO: renamed from: ᩸ */
    public final C11000 f80513;

    public C25159(short[] sArr) {
        this.f80503 = new C5203(sArr);
        C24390 c24390 = new C24390();
        this.f80507 = c24390;
        C11671 c11671 = new C11671();
        this.f80505 = c11671;
        C11000 c11000 = new C11000();
        this.f80513 = c11000;
        C14332 c14332 = new C14332();
        this.f80504 = c14332;
        C14332 c14333 = new C14332();
        this.f80501 = c14333;
        C10309 c10309 = c14333.f40991;
        this.f80502 = c10309;
        C8297 c8297 = new C8297();
        C10309 c103010 = new C10309("Frequency");
        c8297.f21982 = c103010;
        c8297.m55058(c103010);
        c103010.m23923(40.0d, 400.0d, 6000.0d);
        C10309 c103011 = new C10309(1, "Amplitude", 1.0d);
        c8297.f21980 = c103011;
        c8297.m55058(c103011);
        C10309 c103012 = new C10309("Q");
        c8297.f21975 = c103012;
        c8297.m55058(c103012);
        c103012.m23923(0.1d, 1.0d, 10.0d);
        this.f80509 = c8297;
        C10309 c103013 = c24390.f59985;
        this.f80512 = c103013;
        C24390 c24391 = new C24390();
        C10309 c103014 = c24391.f59984;
        this.f80510 = c103014;
        C21709 c21709 = new C21709();
        C10309 c103015 = c21709.f59985;
        this.f80506 = c103015;
        C10309 c103016 = c24391.f59985;
        C24390 c24392 = new C24390();
        m15940(c24391);
        m15940(c24390);
        m15940(c24392);
        m15940(c11671);
        m15940(c11000);
        m15940(c14332);
        m15940(c14333);
        m15940(c8297);
        m15940(c21709);
        c14333.f48086.m38618(0, c21709.f59984, 0);
        c21709.f59983.m38618(0, c8297.f21982, 0);
        c24391.f59983.m38618(0, c11671.f32554, 0);
        c24390.f59983.m38618(0, c24392.f59984, 0);
        c24392.f59983.m38618(0, c14332.f40991, 0);
        m55057(c103013, "Amplitude");
        m55057(c103014, "Frequency");
        m55057(c103015, "Cutoff");
        m15942(c103015, "Timbre");
        m55057(c103016, "FreqScaler");
        m55057(c10309, "FilterEnvDepth");
        c14333.m32933(this, "Filter");
        c14332.m32933(this, "Amp");
        c103014.m23926(c11671.f32554);
        c103016.m23923(0.2d, 1.0d, 4.0d);
        c103015.m23926(c8297.f21982);
        c10309.m23923(-4000.0d, 2000.0d, 4000.0d);
        c11671.f32559.m23922(0.5d);
        c14332.f48085.m4807(this);
        c24392.f59985.m23923(1.0d, 1.0d, 4.0d);
        m15942(c24392.f59985, "Pressure");
        mo8715(0);
    }

    @Override // p067l.InterfaceC22400
    /* JADX INFO: renamed from: ֫ */
    public final void mo8716(C22559 c22559) {
        if (this.f80499 == null) {
            return;
        }
        this.f80504.f48085.m4803(c22559);
        this.f80501.f48085.m4803(c22559);
        C11078 c11078 = this.f80499;
        c11078.getClass();
        int i = c11078.f30679;
        if ((i & 2) == 0 || (i & 1) == 0) {
            return;
        }
        int i2 = c11078.f30681;
        int i3 = i2 + 1;
        int i4 = this.f80508;
        if (i3 < i4) {
            int i5 = this.f80500 + i2;
            C20368 c20368 = this.f80505.f32563;
            c20368.m51435(c22559, c20368.m45971(this.f80503, i5, i4 - i5));
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    @Override // p067l.InterfaceC22400
    /* JADX INFO: renamed from: ֫ */
    public final void mo8714(double d, double d2, C22559 c22559) {
        C11078 c11078;
        int i;
        C11671 c11671;
        C20368 c20368;
        C11000 c11000;
        int i2;
        C24390 c24390;
        int i3;
        C5203 c5203;
        int i4;
        int i5;
        double dM5317 = C3111.m5317(d);
        C11078 c11078M40376 = this.f80499;
        int i6 = (int) (0.5d + dM5317);
        if (c11078M40376 == null || c11078M40376.f30683 > i6 || c11078M40376.f30678 < i6) {
            int iM40377 = C17782.m40377(this.f80511);
            int i7 = iM40377;
            c11078M40376 = C17782.m40376(iM40377);
            while (true) {
                if ((c11078M40376.f30683 <= i6 && c11078M40376.f30678 >= i6) || (c11078M40376.f30679 & 32768) != 0) {
                    break;
                }
                i7++;
                c11078M40376 = C17782.m40376(i7);
            }
        }
        int i8 = c11078M40376.f30682;
        int i9 = c11078M40376.f30679 & 2;
        C14332 c14332 = this.f80501;
        C14332 c14333 = this.f80504;
        if (i9 == 0) {
            if (i8 >= 150) {
                c11078M40376 = null;
            } else {
                this.f80500 = C17782.m40379(i8);
                this.f80508 = C17782.m40378(i8);
            }
            c11078 = c11078M40376;
            this.f80499 = c11078;
            if (c11078 == null) {
                return;
            }
            i = c11078.f30679;
            double dPow = Math.pow(2.0d, C6406.m14667(c11078.f30676, 0.01d, dM5317, 12.0d)) * 22050.0d;
            double d3 = ((double) c11078.f30677) * 3.0517578125E-5d * d2 * d2 * 10.0d;
            this.f80510.m23924(dPow, c22559);
            this.f80512.m23924(d3, c22559);
            c14333.f48085.m4806(c22559);
            c14332.f48085.m4806(c22559);
            c11671 = this.f80505;
            C17013 c17013 = c11671.f32558;
            c20368 = c11671.f32563;
            c17013.m40213();
            c11000 = this.f80513;
            c11000.f30459.m40213();
            i2 = i & 2;
            c24390 = this.f80507;
            if (i2 != 0) {
                c11000.f30459.m38618(0, c24390.f59984, 0);
                return;
            }
            c11671.f32558.m38618(0, c24390.f59984, 0);
            c20368.m45973(c22559);
            i3 = i & 1;
            c5203 = this.f80503;
            if (i3 != 0) {
                i4 = this.f80500;
                i5 = c11078.f30680 + i4;
                int i10 = (c11078.f30681 + i4) - i5;
                if (i5 > i4) {
                    c20368.m51435(c22559, c20368.m45971(c5203, i4, i5 - i4));
                }
                c20368.m45972(c5203, i5, i10, c22559);
                return;
            }
            c20368.m51435(c22559, c20368.m45971(c5203, this.f80500, this.f80508));
        }
        this.f80500 = -1;
        this.f80508 = 0;
        C22478 c22478M40374 = C17782.m40374(c11078M40376.f30675);
        m55205(c22478M40374.f70897, c14333, c22559);
        m55205(c22478M40374.f70898, c14332, c22559);
        short s = c22478M40374.f70899;
        C10309 c10309 = this.f80506;
        if (s > 0) {
            c10309.m23922(C3111.m5318(((double) s) * 0.01d));
        } else {
            c10309.m23922(4000.0d);
        }
        c11078 = c11078M40376;
        this.f80499 = c11078;
        if (c11078 == null) {
            return;
        }
        i = c11078.f30679;
        double dPow2 = Math.pow(2.0d, C6406.m14667(c11078.f30676, 0.01d, dM5317, 12.0d)) * 22050.0d;
        double d4 = ((double) c11078.f30677) * 3.0517578125E-5d * d2 * d2 * 10.0d;
        this.f80510.m23924(dPow2, c22559);
        this.f80512.m23924(d4, c22559);
        c14333.f48085.m4806(c22559);
        c14332.f48085.m4806(c22559);
        c11671 = this.f80505;
        C17013 c17014 = c11671.f32558;
        c20368 = c11671.f32563;
        c17014.m40213();
        c11000 = this.f80513;
        c11000.f30459.m40213();
        i2 = i & 2;
        c24390 = this.f80507;
        if (i2 != 0) {
            c11000.f30459.m38618(0, c24390.f59984, 0);
            return;
        }
        c11671.f32558.m38618(0, c24390.f59984, 0);
        c20368.m45973(c22559);
        i3 = i & 1;
        c5203 = this.f80503;
        if (i3 != 0) {
            i4 = this.f80500;
            i5 = c11078.f30680 + i4;
            int i11 = (c11078.f30681 + i4) - i5;
            if (i5 > i4) {
                c20368.m51435(c22559, c20368.m45971(c5203, i4, i5 - i4));
            }
            c20368.m45972(c5203, i5, i11, c22559);
            return;
        }
        c20368.m51435(c22559, c20368.m45971(c5203, this.f80500, this.f80508));
    }

    @Override // p067l.InterfaceC8988
    /* JADX INFO: renamed from: ᩳ */
    public final C17013 mo8718() {
        return this.f80504.f48086;
    }

    @Override // p067l.InterfaceC22400
    /* JADX INFO: renamed from: ֫ */
    public final void mo8715(int i) {
        if (this.f80511 == i) {
            return;
        }
        C14332 c14332 = this.f80504;
        c14332.f40997.m23922(0.1d);
        c14332.f40992.m23922(0.9d);
        c14332.f40987.m23922(0.1d);
        c14332.f40996.m23922(0.1d);
        C14332 c14333 = this.f80501;
        c14333.f40997.m23922(0.01d);
        c14333.f40992.m23922(0.6d);
        c14333.f40987.m23922(0.4d);
        c14333.f40996.m23922(1.0d);
        C8297 c8297 = this.f80509;
        c8297.f21975.m23922(1.0d);
        C10309 c10309 = this.f80506;
        c10309.m23922(5000.0d);
        C10309 c103010 = this.f80502;
        c103010.m23922(500.0d);
        this.f80499 = null;
        this.f80511 = i;
        if (i == 0) {
            c14332.f40997.m23922(0.1d);
            c14332.f40992.m23922(0.9d);
            c14332.f40987.m23922(0.1d);
            c14332.f40996.m23922(0.1d);
            c10309.m23922(300.0d);
            c103010.m23922(500.0d);
            c8297.f21975.m23922(3.0d);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m55205(C11749 c11749, C14332 c14332, C22559 c22559) {
        c14332.f40997.m23924(Math.max(0.005d, 4194304.0d / ((double) (c11749.f32808 * 22050))), c22559);
        c14332.f40992.m23924((Math.log(3.0517578125E-5d) * 128.0d) / (Math.log(((double) c11749.f32809) / 32768.0d) * 22050.0d), c22559);
        c14332.f40987.m23924(((double) c11749.f32811) * 3.0517578125E-5d, c22559);
        c14332.f40996.m23924(Math.max(0.02d, (Math.log(3.0517578125E-5d) * 128.0d) / (Math.log(((double) c11749.f32810) / 32768.0d) * 22050.0d)), c22559);
    }
}
