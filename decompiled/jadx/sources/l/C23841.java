package l;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.᩻ܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes.dex */
public final class C23841 extends AbstractC18197 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final int f77142;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f77143;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f77144;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final boolean f77145;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C23156 f77146;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f77147;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final int f77148;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f77149;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f77150;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f77151;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f77152;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final int f77153;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final int f77154;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final int f77155;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final int f77156;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final boolean f77157;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f77158;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final int f77159;

    @Override // l.AbstractC18197
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo26321(AbstractC18197 abstractC18197) {
        C23841 c23841 = (C23841) abstractC18197;
        if (!this.f77143 && !C11003.equals(this.f56580.f25614, c23841.f56580.f25614)) {
            return false;
        }
        if (this.f77146.f74432) {
            return true;
        }
        return this.f77157 == c23841.f77157 && this.f77145 == c23841.f77145;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:132:0x0181  */
    /* JADX WARN: Code duplicated, block: B:139:0x018e  */
    /* JADX WARN: Code duplicated, block: B:31:0x004e  */
    /* JADX WARN: Code duplicated, block: B:51:0x007c  */
    public C23841(int i, C13312 c13312, int i2, C23156 c23156, int i3, String str, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        int iM18691;
        int i6;
        int i7;
        C8353 c8353;
        int i8;
        int i9;
        int i10;
        C8353 c8354;
        int i11;
        int i12;
        int i13;
        super(i, c13312, i2);
        this.f77146 = c23156;
        boolean z4 = c23156.f74436;
        AbstractC14545 abstractC14545 = c23156.f35551;
        AbstractC14545 abstractC14546 = c23156.f35571;
        int i14 = z4 ? 24 : 16;
        int i15 = 1;
        this.f77143 = c23156.f74429 && (i4 & i14) != 0;
        if (!z || (((i11 = (c8354 = this.f56580).f25633) != -1 && i11 > c23156.f35548) || ((i12 = c8354.f25609) != -1 && i12 > c23156.f35565))) {
            z2 = false;
        } else {
            float f = c8354.f25596;
            if ((f == -1.0f || f <= c23156.f35556) && ((i13 = c8354.f25627) == -1 || i13 <= c23156.f35557)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.f77149 = z2;
        if (!z || (((i8 = (c8353 = this.f56580).f25633) != -1 && i8 < c23156.f35545) || ((i9 = c8353.f25609) != -1 && i9 < c23156.f35570))) {
            z3 = false;
        } else {
            float f2 = c8353.f25596;
            if ((f2 == -1.0f || f2 >= c23156.f35569) && ((i10 = c8353.f25627) == -1 || i10 >= c23156.f35550)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.f77158 = z3;
        this.f77152 = C11010.m27352(i3, false);
        C8353 c8355 = this.f56580;
        float f3 = c8355.f25596;
        this.f77144 = f3 != -1.0f && f3 >= 10.0f;
        this.f77151 = c8355.f25627;
        int i16 = c8355.f25633;
        this.f77142 = (i16 == -1 || (i7 = c8355.f25609) == -1) ? -1 : i16 * i7;
        int i17 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i17 >= abstractC14546.size()) {
                i17 = Integer.MAX_VALUE;
                iM18691 = 0;
                break;
            } else {
                iM18691 = C6908.m18691(this.f56580, (String) abstractC14546.get(i17), false);
                if (iM18691 > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.f77148 = i17;
        this.f77154 = iM18691;
        int i18 = this.f56580.f25608;
        int i19 = c23156.f35549;
        int i20 = C6908.f21317;
        this.f77155 = (i18 == 0 || i18 != i19) ? Integer.bitCount(i18 & i19) : Integer.MAX_VALUE;
        int i21 = this.f56580.f25608;
        this.f77147 = i21 == 0 || (i21 & 1) != 0;
        this.f77153 = C6908.m18691(this.f56580, str, C6908.m18693(str) == null);
        for (int i22 = 0; i22 < abstractC14545.size(); i22++) {
            String str2 = this.f56580.f25614;
            if (str2 != null && str2.equals(abstractC14545.get(i22))) {
                i5 = i22;
                break;
            }
        }
        this.f77156 = i5;
        this.f77157 = (i3 & MLKEMEngine.KyberPolyBytes) == 128;
        this.f77145 = (i3 & 64) == 64;
        C8353 c8356 = this.f56580;
        String str3 = c8356.f25614;
        if (str3 != null) {
            i6 = 4;
            switch (str3) {
                case "video/dolby-vision":
                    i6 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i6 = 3;
                    break;
                case "video/avc":
                    i6 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i6 = 2;
                    break;
                default:
                    i6 = 0;
                    break;
            }
        } else {
            i6 = 0;
        }
        this.f77150 = i6;
        boolean z5 = this.f77149;
        C23156 c23157 = this.f77146;
        if ((c8356.f25608 & 16384) != 0 || !C11010.m27352(i3, c23157.f74426) || (!z5 && !c23157.f74425)) {
            i15 = 0;
        } else if (C11010.m27352(i3, false) && this.f77158 && z5 && c8356.f25627 != -1 && !c23157.f35566 && !c23157.f35568 && (i14 & i3) != 0) {
            i15 = 2;
        }
        this.f77159 = i15;
    }

    @Override // l.AbstractC18197
    /* JADX INFO: renamed from: ֫ */
    public final int mo26319() {
        return this.f77159;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m52548(C23841 c23841, C23841 c23842) {
        AbstractC6497 abstractC6497Mo17951 = AbstractC6497.m17946().mo17952(c23841.f77152, c23842.f77152).mo17951(Integer.valueOf(c23841.f77148), Integer.valueOf(c23842.f77148), AbstractC10232.m25861().mo22482()).mo17949(c23841.f77154, c23842.f77154).mo17949(c23841.f77155, c23842.f77155).mo17952(c23841.f77147, c23842.f77147).mo17949(c23841.f77153, c23842.f77153).mo17952(c23841.f77144, c23842.f77144).mo17952(c23841.f77149, c23842.f77149).mo17952(c23841.f77158, c23842.f77158).mo17951(Integer.valueOf(c23841.f77156), Integer.valueOf(c23842.f77156), AbstractC10232.m25861().mo22482());
        boolean z = c23841.f77157;
        AbstractC6497 abstractC6497Mo17952 = abstractC6497Mo17951.mo17952(z, c23842.f77157);
        boolean z2 = c23841.f77145;
        AbstractC6497 abstractC6497Mo17953 = abstractC6497Mo17952.mo17952(z2, c23842.f77145);
        if (z && z2) {
            abstractC6497Mo17953 = abstractC6497Mo17953.mo17949(c23841.f77150, c23842.f77150);
        }
        return abstractC6497Mo17953.mo17948();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m52547(C23841 c23841, C23841 c23842) {
        AbstractC10232 abstractC10232Mo22482;
        boolean z = c23841.f77149;
        int i = c23841.f77151;
        if (z && c23841.f77152) {
            abstractC10232Mo22482 = C6908.f21318;
        } else {
            abstractC10232Mo22482 = C6908.f21318.mo22482();
        }
        AbstractC6497 abstractC6497M17946 = AbstractC6497.m17946();
        if (c23841.f77146.f35568) {
            abstractC6497M17946 = abstractC6497M17946.mo17951(Integer.valueOf(i), Integer.valueOf(c23842.f77151), C6908.f21318.mo22482());
        }
        return abstractC6497M17946.mo17951(Integer.valueOf(c23841.f77142), Integer.valueOf(c23842.f77142), abstractC10232Mo22482).mo17951(Integer.valueOf(i), Integer.valueOf(c23842.f77151), abstractC10232Mo22482).mo17948();
    }
}
