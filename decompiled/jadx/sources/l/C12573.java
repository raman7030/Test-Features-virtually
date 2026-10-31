package l;

import android.text.TextUtils;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.۫ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes4.dex */
public final class C12573 extends AbstractC18197 implements Comparable {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final int f37892;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f37893;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f37894;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final int f37895;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f37896;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final boolean f37897;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final boolean f37898;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f37899;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final int f37900;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f37901;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f37902;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f37903;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f37904;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final int f37905;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final C23156 f37906;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final int f37907;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final int f37908;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final int f37909;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f37910;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final int f37911;

    @Override // l.AbstractC18197
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo26321(AbstractC18197 abstractC18197) {
        int i;
        String str;
        int i2;
        C12573 c12573 = (C12573) abstractC18197;
        C8353 c8353 = c12573.f56580;
        C23156 c23156 = this.f37906;
        boolean z = c23156.f74435;
        C8353 c8354 = this.f56580;
        if (!z && ((i2 = c8354.f25625) == -1 || i2 != c8353.f25625)) {
            return false;
        }
        if (!this.f37893 && ((str = c8354.f25614) == null || !TextUtils.equals(str, c8353.f25614))) {
            return false;
        }
        if (!c23156.f74420 && ((i = c8354.f25624) == -1 || i != c8353.f25624)) {
            return false;
        }
        if (c23156.f74428) {
            return true;
        }
        return this.f37897 == c12573.f37897 && this.f37898 == c12573.f37898;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0145  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0120  */
    /* JADX WARN: Code duplicated, block: B:90:0x0122  */
    /* JADX WARN: Code duplicated, block: B:93:0x012b  */
    /* JADX WARN: Code duplicated, block: B:94:0x012d  */
    public C12573(int i, C13312 c13312, int i2, C23156 c23156, int i3, boolean z, C13278 c13278, int i4) {
        int i5;
        int iM18691;
        boolean z2;
        int iM18692;
        boolean z3;
        boolean z4;
        boolean z5;
        C10491 c10491;
        super(i, c13312, i2);
        this.f37906 = c23156;
        boolean z6 = c23156.f74427;
        AbstractC14545 abstractC14545 = c23156.f35555;
        AbstractC14545 abstractC14546 = c23156.f35546;
        int i6 = z6 ? 24 : 16;
        int i7 = 1;
        this.f37893 = c23156.f74424 && (i4 & i6) != 0;
        this.f37896 = C6908.m18693(this.f56580.f25603);
        this.f37904 = C11010.m27352(i3, false);
        int i8 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i8 >= abstractC14546.size()) {
                i8 = Integer.MAX_VALUE;
                iM18691 = 0;
                break;
            } else {
                iM18691 = C6908.m18691(this.f56580, (String) abstractC14546.get(i8), false);
                if (iM18691 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f37908 = i8;
        this.f37907 = iM18691;
        int i9 = this.f56580.f25608;
        int i10 = c23156.f35564;
        this.f37911 = (i9 == 0 || i9 != i10) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        C8353 c8353 = this.f56580;
        int i11 = c8353.f25608;
        this.f37899 = i11 == 0 || (i11 & 1) != 0;
        this.f37894 = (c8353.f25628 & 1) != 0;
        String str = c8353.f25614;
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
        this.f37901 = z2;
        int i12 = c8353.f25625;
        this.f37902 = i12;
        this.f37895 = c8353.f25624;
        int i13 = c8353.f25627;
        this.f37903 = i13;
        this.f37910 = (i13 == -1 || i13 <= c23156.f35554) && (i12 == -1 || i12 <= c23156.f35572) && c13278.apply(c8353);
        String[] strArrM11044 = C3603.m11044();
        int i14 = 0;
        while (true) {
            if (i14 < strArrM11044.length) {
                iM18692 = C6908.m18691(this.f56580, strArrM11044[i14], false);
                if (iM18692 <= 0) {
                    i14++;
                }
            } else {
                i14 = Integer.MAX_VALUE;
                iM18692 = 0;
            }
        }
        this.f37892 = i14;
        this.f37900 = iM18692;
        for (int i15 = 0; i15 < abstractC14545.size(); i15++) {
            String str2 = this.f56580.f25614;
            if (str2 != null && str2.equals(abstractC14545.get(i15))) {
                i5 = i15;
                this.f37905 = i5;
                if ((i3 & MLKEMEngine.KyberPolyBytes) == 128) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f37897 = z3;
                if ((i3 & 64) == 64) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f37898 = z4;
                boolean z7 = this.f37910;
                C23156 c23157 = this.f37906;
                z5 = c23157.f74426;
                c10491 = c23157.f35547;
                if (!C11010.m27352(i3, z5) && (z7 || c23157.f74434)) {
                    c10491.getClass();
                    if (C11010.m27352(i3, false) && z7 && this.f56580.f25627 != -1 && !c23157.f35566 && !c23157.f35568 && ((c23157.f74433 || !z) && (i6 & i3) != 0)) {
                        i7 = 2;
                    }
                } else {
                    i7 = 0;
                }
                this.f37909 = i7;
            }
        }
        this.f37905 = i5;
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 128) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f37897 = z3;
        if ((i3 & 64) == 64) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f37898 = z4;
        boolean z8 = this.f37910;
        C23156 c23158 = this.f37906;
        z5 = c23158.f74426;
        c10491 = c23158.f35547;
        if (C11010.m27352(i3, z5)) {
            i7 = 0;
        } else {
            c10491.getClass();
            if (C11010.m27352(i3, false)) {
                i7 = 2;
            }
        }
        this.f37909 = i7;
    }

    @Override // l.AbstractC18197
    /* JADX INFO: renamed from: ֫ */
    public final int mo26319() {
        return this.f37909;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C12573 c12573) {
        AbstractC10232 abstractC10232Mo22482;
        boolean z = this.f37904;
        boolean z2 = this.f37910;
        if (z2 && z) {
            abstractC10232Mo22482 = C6908.f21318;
        } else {
            abstractC10232Mo22482 = C6908.f21318.mo22482();
        }
        AbstractC6497 abstractC6497M17946 = AbstractC6497.m17946();
        boolean z3 = c12573.f37904;
        int i = c12573.f37903;
        AbstractC6497 abstractC6497Mo17951 = abstractC6497M17946.mo17952(z, z3).mo17951(Integer.valueOf(this.f37908), Integer.valueOf(c12573.f37908), AbstractC10232.m25861().mo22482()).mo17949(this.f37907, c12573.f37907).mo17949(this.f37911, c12573.f37911).mo17952(this.f37894, c12573.f37894).mo17952(this.f37899, c12573.f37899).mo17951(Integer.valueOf(this.f37892), Integer.valueOf(c12573.f37892), AbstractC10232.m25861().mo22482()).mo17949(this.f37900, c12573.f37900).mo17952(z2, c12573.f37910).mo17951(Integer.valueOf(this.f37905), Integer.valueOf(c12573.f37905), AbstractC10232.m25861().mo22482());
        boolean z4 = this.f37906.f35568;
        int i2 = this.f37903;
        if (z4) {
            abstractC6497Mo17951 = abstractC6497Mo17951.mo17951(Integer.valueOf(i2), Integer.valueOf(i), C6908.f21318.mo22482());
        }
        AbstractC6497 abstractC6497Mo17952 = abstractC6497Mo17951.mo17952(this.f37897, c12573.f37897).mo17952(this.f37898, c12573.f37898).mo17952(this.f37901, c12573.f37901).mo17951(Integer.valueOf(this.f37902), Integer.valueOf(c12573.f37902), abstractC10232Mo22482).mo17951(Integer.valueOf(this.f37895), Integer.valueOf(c12573.f37895), abstractC10232Mo22482);
        if (C11003.equals(this.f37896, c12573.f37896)) {
            abstractC6497Mo17952 = abstractC6497Mo17952.mo17951(Integer.valueOf(i2), Integer.valueOf(i), abstractC10232Mo22482);
        }
        return abstractC6497Mo17952.mo17948();
    }
}
