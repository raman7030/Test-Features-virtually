package p067l;

import android.text.TextUtils;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.۫ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes4.dex */
public final class C14318 extends AbstractC19663 implements Comparable {

    /* JADX INFO: renamed from: ֫֫ */
    public final int f40918;

    /* JADX INFO: renamed from: ۗ */
    public final boolean f40919;

    /* JADX INFO: renamed from: ۛ */
    public final boolean f40920;

    /* JADX INFO: renamed from: ۜ֫ */
    public final int f40921;

    /* JADX INFO: renamed from: ۟ */
    public final String f40922;

    /* JADX INFO: renamed from: ۡ֫ */
    public final boolean f40923;

    /* JADX INFO: renamed from: ۢ֫ */
    public final boolean f40924;

    /* JADX INFO: renamed from: ۤ */
    public final boolean f40925;

    /* JADX INFO: renamed from: ۧ֫ */
    public final int f40926;

    /* JADX INFO: renamed from: ۨ */
    public final boolean f40927;

    /* JADX INFO: renamed from: ۫ */
    public final int f40928;

    /* JADX INFO: renamed from: ۬ */
    public final int f40929;

    /* JADX INFO: renamed from: ܰ */
    public final boolean f40930;

    /* JADX INFO: renamed from: ܳ֫ */
    public final int f40931;

    /* JADX INFO: renamed from: ܽ֫ */
    public final C24376 f40932;

    /* JADX INFO: renamed from: ܿ֫ */
    public final int f40933;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final int f40934;

    /* JADX INFO: renamed from: ᩷֫ */
    public final int f40935;

    /* JADX INFO: renamed from: ᩺ */
    public final boolean f40936;

    /* JADX INFO: renamed from: ᩻֫ */
    public final int f40937;

    @Override // p067l.AbstractC19663
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28351(AbstractC19663 abstractC19663) {
        int i;
        String str;
        int i2;
        C14318 c14318 = (C14318) abstractC19663;
        C10307 c10307 = c14318.f59793;
        C24376 c24376 = this.f40932;
        boolean z = c24376.f77181;
        C10307 c10308 = this.f59793;
        if (!z && ((i2 = c10308.f28539) == -1 || i2 != c10307.f28539)) {
            return false;
        }
        if (!this.f40919 && ((str = c10308.f28528) == null || !TextUtils.equals(str, c10307.f28528))) {
            return false;
        }
        if (!c24376.f77166 && ((i = c10308.f28538) == -1 || i != c10307.f28538)) {
            return false;
        }
        if (c24376.f77174) {
            return true;
        }
        return this.f40923 == c14318.f40923 && this.f40924 == c14318.f40924;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0145  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0120  */
    /* JADX WARN: Code duplicated, block: B:90:0x0122  */
    /* JADX WARN: Code duplicated, block: B:93:0x012b  */
    /* JADX WARN: Code duplicated, block: B:94:0x012d  */
    public C14318(int i, C15020 c15020, int i2, C24376 c24376, int i3, boolean z, C14988 c14988, int i4) {
        int i5;
        int iM20640;
        boolean z2;
        int iM20641;
        boolean z3;
        boolean z4;
        boolean z5;
        C12339 c12339;
        super(i, c15020, i2);
        this.f40932 = c24376;
        boolean z6 = c24376.f77173;
        AbstractC16192 abstractC16192 = c24376.f38565;
        AbstractC16192 abstractC16193 = c24376.f38556;
        int i6 = z6 ? 24 : 16;
        int i7 = 1;
        this.f40919 = c24376.f77170 && (i4 & i6) != 0;
        this.f40922 = C8934.m20642(this.f59793.f28517);
        this.f40930 = C12832.m29414(i3, false);
        int i8 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i8 >= abstractC16193.size()) {
                i8 = Integer.MAX_VALUE;
                iM20640 = 0;
                break;
            } else {
                iM20640 = C8934.m20640(this.f59793, (String) abstractC16193.get(i8), false);
                if (iM20640 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f40934 = i8;
        this.f40933 = iM20640;
        int i9 = this.f59793.f28522;
        int i10 = c24376.f38574;
        this.f40937 = (i9 == 0 || i9 != i10) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        C10307 c10307 = this.f59793;
        int i11 = c10307.f28522;
        this.f40925 = i11 == 0 || (i11 & 1) != 0;
        this.f40920 = (c10307.f28542 & 1) != 0;
        String str = c10307.f28528;
        if (str != null) {
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac4":
                case "audio/iamf":
                    z2 = true;
                    break;
                default:
                    z2 = false;
                    break;
            }
        } else {
            z2 = false;
        }
        this.f40927 = z2;
        int i12 = c10307.f28539;
        this.f40928 = i12;
        this.f40921 = c10307.f28538;
        int i13 = c10307.f28541;
        this.f40929 = i13;
        this.f40936 = (i13 == -1 || i13 <= c24376.f38564) && (i12 == -1 || i12 <= c24376.f38582) && c14988.apply(c10307);
        String[] strArrM13020 = C5792.m13020();
        int i14 = 0;
        while (true) {
            if (i14 < strArrM13020.length) {
                iM20641 = C8934.m20640(this.f59793, strArrM13020[i14], false);
                if (iM20641 <= 0) {
                    i14++;
                }
            } else {
                i14 = Integer.MAX_VALUE;
                iM20641 = 0;
            }
        }
        this.f40918 = i14;
        this.f40926 = iM20641;
        for (int i15 = 0; i15 < abstractC16192.size(); i15++) {
            String str2 = this.f59793.f28528;
            if (str2 != null && str2.equals(abstractC16192.get(i15))) {
                i5 = i15;
                this.f40931 = i5;
                if ((i3 & MLKEMEngine.KyberPolyBytes) == 128) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f40923 = z3;
                if ((i3 & 64) == 64) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f40924 = z4;
                boolean z7 = this.f40936;
                C24376 c24377 = this.f40932;
                z5 = c24377.f77172;
                c12339 = c24377.f38557;
                if (!C12832.m29414(i3, z5) && (z7 || c24377.f77180)) {
                    c12339.getClass();
                    if (C12832.m29414(i3, false) && z7 && this.f59793.f28541 != -1 && !c24377.f38576 && !c24377.f38578 && ((c24377.f77179 || !z) && (i6 & i3) != 0)) {
                        i7 = 2;
                    }
                } else {
                    i7 = 0;
                }
                this.f40935 = i7;
            }
        }
        this.f40931 = i5;
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 128) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f40923 = z3;
        if ((i3 & 64) == 64) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f40924 = z4;
        boolean z8 = this.f40936;
        C24376 c24378 = this.f40932;
        z5 = c24378.f77172;
        c12339 = c24378.f38557;
        if (C12832.m29414(i3, z5)) {
            i7 = 0;
        } else {
            c12339.getClass();
            if (C12832.m29414(i3, false)) {
                i7 = 2;
            }
        }
        this.f40935 = i7;
    }

    @Override // p067l.AbstractC19663
    /* JADX INFO: renamed from: ֫ */
    public final int mo28349() {
        return this.f40935;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C14318 c14318) {
        AbstractC12093 abstractC12093Mo24451;
        boolean z = this.f40930;
        boolean z2 = this.f40936;
        if (z2 && z) {
            abstractC12093Mo24451 = C8934.f24197;
        } else {
            abstractC12093Mo24451 = C8934.f24197.mo24451();
        }
        AbstractC8543 abstractC8543M19894 = AbstractC8543.m19894();
        boolean z3 = c14318.f40930;
        int i = c14318.f40929;
        AbstractC8543 abstractC8543Mo19899 = abstractC8543M19894.mo19900(z, z3).mo19899(Integer.valueOf(this.f40934), Integer.valueOf(c14318.f40934), AbstractC12093.m27883().mo24451()).mo19897(this.f40933, c14318.f40933).mo19897(this.f40937, c14318.f40937).mo19900(this.f40920, c14318.f40920).mo19900(this.f40925, c14318.f40925).mo19899(Integer.valueOf(this.f40918), Integer.valueOf(c14318.f40918), AbstractC12093.m27883().mo24451()).mo19897(this.f40926, c14318.f40926).mo19900(z2, c14318.f40936).mo19899(Integer.valueOf(this.f40931), Integer.valueOf(c14318.f40931), AbstractC12093.m27883().mo24451());
        boolean z4 = this.f40932.f38578;
        int i2 = this.f40929;
        if (z4) {
            abstractC8543Mo19899 = abstractC8543Mo19899.mo19899(Integer.valueOf(i2), Integer.valueOf(i), C8934.f24197.mo24451());
        }
        AbstractC8543 abstractC8543Mo198910 = abstractC8543Mo19899.mo19900(this.f40923, c14318.f40923).mo19900(this.f40924, c14318.f40924).mo19900(this.f40927, c14318.f40927).mo19899(Integer.valueOf(this.f40928), Integer.valueOf(c14318.f40928), abstractC12093Mo24451).mo19899(Integer.valueOf(this.f40921), Integer.valueOf(c14318.f40921), abstractC12093Mo24451);
        if (C12826.equals(this.f40922, c14318.f40922)) {
            abstractC8543Mo198910 = abstractC8543Mo198910.mo19899(Integer.valueOf(i2), Integer.valueOf(i), abstractC12093Mo24451);
        }
        return abstractC8543Mo198910.mo19896();
    }
}
