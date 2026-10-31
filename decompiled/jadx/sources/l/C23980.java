package l;

/* JADX INFO: renamed from: l.᩻᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8DA */
/* JADX INFO: loaded from: classes.dex */
public final class C23980 extends C4827 implements InterfaceC21077 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C9164 f77747;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f77748;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12588 f77749;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C8355 f77750;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2983 f77751;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12588 f77752;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C9788 f77753;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C8355 f77754;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C23171 f77755;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f77756;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6238 f77757;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C8355 f77758;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f77759;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8355 f77760;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9082 f77761;

    public C23980(short[] sArr) {
        this.f77751 = new C2983(sArr);
        C23171 c23171 = new C23171();
        this.f77755 = c23171;
        C9788 c9788 = new C9788();
        this.f77753 = c9788;
        C9082 c9082 = new C9082();
        this.f77761 = c9082;
        C12588 c12588 = new C12588();
        this.f77752 = c12588;
        C12588 c12589 = new C12588();
        this.f77749 = c12589;
        C8355 c8355 = c12589.f37963;
        this.f77750 = c8355;
        C6238 c6238 = new C6238();
        C8355 c8356 = new C8355("Frequency");
        c6238.f19117 = c8356;
        c6238.m52649(c8356);
        c8356.m21953(40.0d, 400.0d, 6000.0d);
        C8355 c8357 = new C8355(1, "Amplitude", 1.0d);
        c6238.f19115 = c8357;
        c6238.m52649(c8357);
        C8355 c8358 = new C8355("Q");
        c6238.f19110 = c8358;
        c6238.m52649(c8358);
        c8358.m21953(0.1d, 1.0d, 10.0d);
        this.f77757 = c6238;
        C8355 c8359 = c23171.f56768;
        this.f77760 = c8359;
        C23171 c23172 = new C23171();
        C8355 c83510 = c23172.f56767;
        this.f77758 = c83510;
        C20350 c20350 = new C20350();
        C8355 c83511 = c20350.f56768;
        this.f77754 = c83511;
        C8355 c83512 = c23172.f56768;
        C23171 c23173 = new C23171();
        m14060(c23172);
        m14060(c23171);
        m14060(c23173);
        m14060(c9788);
        m14060(c9082);
        m14060(c12588);
        m14060(c12589);
        m14060(c6238);
        m14060(c20350);
        c12589.f44973.m36460(0, c20350.f56767, 0);
        c20350.f56766.m36460(0, c6238.f19117, 0);
        c23172.f56766.m36460(0, c9788.f29602, 0);
        c23171.f56766.m36460(0, c23173.f56767, 0);
        c23173.f56766.m36460(0, c12588.f37963, 0);
        m52648(c8359, "Amplitude");
        m52648(c83510, "Frequency");
        m52648(c83511, "Cutoff");
        m14062(c83511, "Timbre");
        m52648(c83512, "FreqScaler");
        m52648(c8355, "FilterEnvDepth");
        c12589.m30856(this, "Filter");
        c12588.m30856(this, "Amp");
        c83510.m21956(c9788.f29602);
        c83512.m21953(0.2d, 1.0d, 4.0d);
        c83511.m21956(c6238.f19117);
        c8355.m21953(-4000.0d, 2000.0d, 4000.0d);
        c9788.f29607.m21952(0.5d);
        c12588.f44972.m2452(this);
        c23173.f56768.m21953(1.0d, 1.0d, 4.0d);
        m14062(c23173.f56768, "Pressure");
        mo6589(0);
    }

    @Override // l.InterfaceC21077
    /* JADX INFO: renamed from: ֫ */
    public final void mo6590(C21245 c21245) {
        if (this.f77747 == null) {
            return;
        }
        this.f77752.f44972.m2448(c21245);
        this.f77749.f44972.m2448(c21245);
        C9164 c9164 = this.f77747;
        c9164.getClass();
        int i = c9164.f27739;
        if ((i & 2) == 0 || (i & 1) == 0) {
            return;
        }
        int i2 = c9164.f27741;
        int i3 = i2 + 1;
        int i4 = this.f77756;
        if (i3 < i4) {
            int i5 = this.f77748 + i2;
            C18939 c18939 = this.f77753.f29611;
            c18939.m49086(c21245, c18939.m43705(this.f77751, i5, i4 - i5));
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    @Override // l.InterfaceC21077
    /* JADX INFO: renamed from: ֫ */
    public final void mo6588(double d, double d2, C21245 c21245) {
        C9164 c9164;
        int i;
        C9788 c9788;
        C18939 c18939;
        C9082 c9082;
        int i2;
        C23171 c23171;
        int i3;
        C2983 c2983;
        int i4;
        int i5;
        double dM2988 = C0782.m2988(d);
        C9164 c9164M38164 = this.f77747;
        int i6 = (int) (0.5d + dM2988);
        if (c9164M38164 == null || c9164M38164.f27743 > i6 || c9164M38164.f27738 < i6) {
            int iM38165 = C16218.m38165(this.f77759);
            int i7 = iM38165;
            c9164M38164 = C16218.m38164(iM38165);
            while (true) {
                if ((c9164M38164.f27743 <= i6 && c9164M38164.f27738 >= i6) || (c9164M38164.f27739 & 32768) != 0) {
                    break;
                }
                i7++;
                c9164M38164 = C16218.m38164(i7);
            }
        }
        int i8 = c9164M38164.f27742;
        int i9 = c9164M38164.f27739 & 2;
        C12588 c12588 = this.f77749;
        C12588 c12589 = this.f77752;
        if (i9 == 0) {
            if (i8 >= 150) {
                c9164M38164 = null;
            } else {
                this.f77748 = C16218.m38167(i8);
                this.f77756 = C16218.m38166(i8);
            }
            c9164 = c9164M38164;
            this.f77747 = c9164;
            if (c9164 == null) {
                return;
            }
            i = c9164.f27739;
            double dPow = Math.pow(2.0d, C4248.m12787(c9164.f27736, 0.01d, dM2988, 12.0d)) * 22050.0d;
            double d3 = ((double) c9164.f27737) * 3.0517578125E-5d * d2 * d2 * 10.0d;
            this.f77758.m21954(dPow, c21245);
            this.f77760.m21954(d3, c21245);
            c12589.f44972.m2451(c21245);
            c12588.f44972.m2451(c21245);
            c9788 = this.f77753;
            C15409 c15409 = c9788.f29606;
            c18939 = c9788.f29611;
            c15409.m38022();
            c9082 = this.f77761;
            c9082.f27522.m38022();
            i2 = i & 2;
            c23171 = this.f77755;
            if (i2 != 0) {
                c9082.f27522.m36460(0, c23171.f56767, 0);
                return;
            }
            c9788.f29606.m36460(0, c23171.f56767, 0);
            c18939.m43707(c21245);
            i3 = i & 1;
            c2983 = this.f77751;
            if (i3 != 0) {
                i4 = this.f77748;
                i5 = c9164.f27740 + i4;
                int i10 = (c9164.f27741 + i4) - i5;
                if (i5 > i4) {
                    c18939.m49086(c21245, c18939.m43705(c2983, i4, i5 - i4));
                }
                c18939.m43706(c2983, i5, i10, c21245);
                return;
            }
            c18939.m49086(c21245, c18939.m43705(c2983, this.f77748, this.f77756));
        }
        this.f77748 = -1;
        this.f77756 = 0;
        C21159 c21159M38162 = C16218.m38162(c9164M38164.f27735);
        m52799(c21159M38162.f68214, c12589, c21245);
        m52799(c21159M38162.f68215, c12588, c21245);
        short s = c21159M38162.f68216;
        C8355 c8355 = this.f77754;
        if (s > 0) {
            c8355.m21952(C0782.m2989(((double) s) * 0.01d));
        } else {
            c8355.m21952(4000.0d);
        }
        c9164 = c9164M38164;
        this.f77747 = c9164;
        if (c9164 == null) {
            return;
        }
        i = c9164.f27739;
        double dPow2 = Math.pow(2.0d, C4248.m12787(c9164.f27736, 0.01d, dM2988, 12.0d)) * 22050.0d;
        double d4 = ((double) c9164.f27737) * 3.0517578125E-5d * d2 * d2 * 10.0d;
        this.f77758.m21954(dPow2, c21245);
        this.f77760.m21954(d4, c21245);
        c12589.f44972.m2451(c21245);
        c12588.f44972.m2451(c21245);
        c9788 = this.f77753;
        C15409 c154010 = c9788.f29606;
        c18939 = c9788.f29611;
        c154010.m38022();
        c9082 = this.f77761;
        c9082.f27522.m38022();
        i2 = i & 2;
        c23171 = this.f77755;
        if (i2 != 0) {
            c9082.f27522.m36460(0, c23171.f56767, 0);
            return;
        }
        c9788.f29606.m36460(0, c23171.f56767, 0);
        c18939.m43707(c21245);
        i3 = i & 1;
        c2983 = this.f77751;
        if (i3 != 0) {
            i4 = this.f77748;
            i5 = c9164.f27740 + i4;
            int i11 = (c9164.f27741 + i4) - i5;
            if (i5 > i4) {
                c18939.m49086(c21245, c18939.m43705(c2983, i4, i5 - i4));
            }
            c18939.m43706(c2983, i5, i11, c21245);
            return;
        }
        c18939.m49086(c21245, c18939.m43705(c2983, this.f77748, this.f77756));
    }

    @Override // l.InterfaceC6965
    /* JADX INFO: renamed from: ᩳ */
    public final C15409 mo6592() {
        return this.f77752.f44973;
    }

    @Override // l.InterfaceC21077
    /* JADX INFO: renamed from: ֫ */
    public final void mo6589(int i) {
        if (this.f77759 == i) {
            return;
        }
        C12588 c12588 = this.f77752;
        c12588.f37969.m21952(0.1d);
        c12588.f37964.m21952(0.9d);
        c12588.f37959.m21952(0.1d);
        c12588.f37968.m21952(0.1d);
        C12588 c12589 = this.f77749;
        c12589.f37969.m21952(0.01d);
        c12589.f37964.m21952(0.6d);
        c12589.f37959.m21952(0.4d);
        c12589.f37968.m21952(1.0d);
        C6238 c6238 = this.f77757;
        c6238.f19110.m21952(1.0d);
        C8355 c8355 = this.f77754;
        c8355.m21952(5000.0d);
        C8355 c8356 = this.f77750;
        c8356.m21952(500.0d);
        this.f77747 = null;
        this.f77759 = i;
        if (i == 0) {
            c12588.f37969.m21952(0.1d);
            c12588.f37964.m21952(0.9d);
            c12588.f37959.m21952(0.1d);
            c12588.f37968.m21952(0.1d);
            c8355.m21952(300.0d);
            c8356.m21952(500.0d);
            c6238.f19110.m21952(3.0d);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52799(C9870 c9870, C12588 c12588, C21245 c21245) {
        c12588.f37969.m21954(Math.max(0.005d, 4194304.0d / ((double) (c9870.f29851 * 22050))), c21245);
        c12588.f37964.m21954((Math.log(3.0517578125E-5d) * 128.0d) / (Math.log(((double) c9870.f29852) / 32768.0d) * 22050.0d), c21245);
        c12588.f37959.m21954(((double) c9870.f29854) * 3.0517578125E-5d, c21245);
        c12588.f37968.m21954(Math.max(0.02d, (Math.log(3.0517578125E-5d) * 128.0d) / (Math.log(((double) c9870.f29853) / 32768.0d) * 22050.0d)), c21245);
    }
}
