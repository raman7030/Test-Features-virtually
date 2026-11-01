package p067l;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.᩻ܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes.dex */
public final class C25027 extends AbstractC19663 {

    /* JADX INFO: renamed from: ֫֫ */
    public final int f79892;

    /* JADX INFO: renamed from: ۗ */
    public final boolean f79893;

    /* JADX INFO: renamed from: ۛ */
    public final boolean f79894;

    /* JADX INFO: renamed from: ۜ֫ */
    public final boolean f79895;

    /* JADX INFO: renamed from: ۟ */
    public final C24376 f79896;

    /* JADX INFO: renamed from: ۤ */
    public final boolean f79897;

    /* JADX INFO: renamed from: ۧ֫ */
    public final int f79898;

    /* JADX INFO: renamed from: ۨ */
    public final boolean f79899;

    /* JADX INFO: renamed from: ۫ */
    public final int f79900;

    /* JADX INFO: renamed from: ۬ */
    public final int f79901;

    /* JADX INFO: renamed from: ܰ */
    public final boolean f79902;

    /* JADX INFO: renamed from: ܳ֫ */
    public final int f79903;

    /* JADX INFO: renamed from: ܽ֫ */
    public final int f79904;

    /* JADX INFO: renamed from: ܿ֫ */
    public final int f79905;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final int f79906;

    /* JADX INFO: renamed from: ᩷֫ */
    public final boolean f79907;

    /* JADX INFO: renamed from: ᩺ */
    public final boolean f79908;

    /* JADX INFO: renamed from: ᩻֫ */
    public final int f79909;

    @Override // p067l.AbstractC19663
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28351(AbstractC19663 abstractC19663) {
        C25027 c25027 = (C25027) abstractC19663;
        if (!this.f79893 && !C12826.equals(this.f59793.f28528, c25027.f59793.f28528)) {
            return false;
        }
        if (this.f79896.f77178) {
            return true;
        }
        return this.f79907 == c25027.f79907 && this.f79895 == c25027.f79895;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:132:0x0181  */
    /* JADX WARN: Code duplicated, block: B:139:0x018e  */
    /* JADX WARN: Code duplicated, block: B:31:0x004e  */
    /* JADX WARN: Code duplicated, block: B:51:0x007c  */
    public C25027(int i, C15020 c15020, int i2, C24376 c24376, int i3, String str, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        int iM20640;
        int i6;
        int i7;
        C10307 c10307;
        int i8;
        int i9;
        int i10;
        C10307 c10308;
        int i11;
        int i12;
        int i13;
        super(i, c15020, i2);
        this.f79896 = c24376;
        boolean z4 = c24376.f77182;
        AbstractC16192 abstractC16192 = c24376.f38561;
        AbstractC16192 abstractC16193 = c24376.f38581;
        int i14 = z4 ? 24 : 16;
        int i15 = 1;
        this.f79893 = c24376.f77175 && (i4 & i14) != 0;
        if (!z || (((i11 = (c10308 = this.f59793).f28547) != -1 && i11 > c24376.f38558) || ((i12 = c10308.f28523) != -1 && i12 > c24376.f38575))) {
            z2 = false;
        } else {
            float f = c10308.f28510;
            if ((f == -1.0f || f <= c24376.f38566) && ((i13 = c10308.f28541) == -1 || i13 <= c24376.f38567)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.f79899 = z2;
        if (!z || (((i8 = (c10307 = this.f59793).f28547) != -1 && i8 < c24376.f38555) || ((i9 = c10307.f28523) != -1 && i9 < c24376.f38580))) {
            z3 = false;
        } else {
            float f2 = c10307.f28510;
            if ((f2 == -1.0f || f2 >= c24376.f38579) && ((i10 = c10307.f28541) == -1 || i10 >= c24376.f38560)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.f79908 = z3;
        this.f79902 = C12832.m29414(i3, false);
        C10307 c10309 = this.f59793;
        float f3 = c10309.f28510;
        this.f79894 = f3 != -1.0f && f3 >= 10.0f;
        this.f79901 = c10309.f28541;
        int i16 = c10309.f28547;
        this.f79892 = (i16 == -1 || (i7 = c10309.f28523) == -1) ? -1 : i16 * i7;
        int i17 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i17 >= abstractC16193.size()) {
                i17 = Integer.MAX_VALUE;
                iM20640 = 0;
                break;
            } else {
                iM20640 = C8934.m20640(this.f59793, (String) abstractC16193.get(i17), false);
                if (iM20640 > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.f79898 = i17;
        this.f79904 = iM20640;
        int i18 = this.f59793.f28522;
        int i19 = c24376.f38559;
        int i20 = C8934.f24196;
        this.f79905 = (i18 == 0 || i18 != i19) ? Integer.bitCount(i18 & i19) : Integer.MAX_VALUE;
        int i21 = this.f59793.f28522;
        this.f79897 = i21 == 0 || (i21 & 1) != 0;
        this.f79903 = C8934.m20640(this.f59793, str, C8934.m20642(str) == null);
        for (int i22 = 0; i22 < abstractC16192.size(); i22++) {
            String str2 = this.f59793.f28528;
            if (str2 != null && str2.equals(abstractC16192.get(i22))) {
                i5 = i22;
                break;
            }
        }
        this.f79906 = i5;
        this.f79907 = (i3 & MLKEMEngine.KyberPolyBytes) == 128;
        this.f79895 = (i3 & 64) == 64;
        C10307 c103010 = this.f59793;
        String str3 = c103010.f28528;
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
        this.f79900 = i6;
        boolean z5 = this.f79899;
        C24376 c24377 = this.f79896;
        if ((c103010.f28522 & 16384) != 0 || !C12832.m29414(i3, c24377.f77172) || (!z5 && !c24377.f77171)) {
            i15 = 0;
        } else if (C12832.m29414(i3, false) && this.f79908 && z5 && c103010.f28541 != -1 && !c24377.f38576 && !c24377.f38578 && (i14 & i3) != 0) {
            i15 = 2;
        }
        this.f79909 = i15;
    }

    @Override // p067l.AbstractC19663
    /* JADX INFO: renamed from: ֫ */
    public final int mo28349() {
        return this.f79909;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m54957(C25027 c25027, C25027 c25028) {
        AbstractC8543 abstractC8543Mo19899 = AbstractC8543.m19894().mo19900(c25027.f79902, c25028.f79902).mo19899(Integer.valueOf(c25027.f79898), Integer.valueOf(c25028.f79898), AbstractC12093.m27883().mo24451()).mo19897(c25027.f79904, c25028.f79904).mo19897(c25027.f79905, c25028.f79905).mo19900(c25027.f79897, c25028.f79897).mo19897(c25027.f79903, c25028.f79903).mo19900(c25027.f79894, c25028.f79894).mo19900(c25027.f79899, c25028.f79899).mo19900(c25027.f79908, c25028.f79908).mo19899(Integer.valueOf(c25027.f79906), Integer.valueOf(c25028.f79906), AbstractC12093.m27883().mo24451());
        boolean z = c25027.f79907;
        AbstractC8543 abstractC8543Mo19900 = abstractC8543Mo19899.mo19900(z, c25028.f79907);
        boolean z2 = c25027.f79895;
        AbstractC8543 abstractC8543Mo19901 = abstractC8543Mo19900.mo19900(z2, c25028.f79895);
        if (z && z2) {
            abstractC8543Mo19901 = abstractC8543Mo19901.mo19897(c25027.f79900, c25028.f79900);
        }
        return abstractC8543Mo19901.mo19896();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m54956(C25027 c25027, C25027 c25028) {
        AbstractC12093 abstractC12093Mo24451;
        boolean z = c25027.f79899;
        int i = c25027.f79901;
        if (z && c25027.f79902) {
            abstractC12093Mo24451 = C8934.f24197;
        } else {
            abstractC12093Mo24451 = C8934.f24197.mo24451();
        }
        AbstractC8543 abstractC8543M19894 = AbstractC8543.m19894();
        if (c25027.f79896.f38578) {
            abstractC8543M19894 = abstractC8543M19894.mo19899(Integer.valueOf(i), Integer.valueOf(c25028.f79901), C8934.f24197.mo24451());
        }
        return abstractC8543M19894.mo19899(Integer.valueOf(c25027.f79892), Integer.valueOf(c25028.f79892), abstractC12093Mo24451).mo19899(Integer.valueOf(i), Integer.valueOf(c25028.f79901), abstractC12093Mo24451).mo19896();
    }
}
