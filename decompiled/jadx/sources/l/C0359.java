package l;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: l.֡ۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0359 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖۖܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f1768;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f1769;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C5191 f1770;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f1771;

    static {
        ApplicationC12518.m30701(3);
        f1768 = new short[]{3086, -4594, -4599, -4594, -4589};
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public native void mo1009();

    public C0359(ActivityC17169 activityC17169, AbstractC15440 abstractC15440) {
        this.f1771 = activityC17169;
        this.f1769 = abstractC15440;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f1771);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01da A[PHI: r3 r4 r10 r11 r13 r14 r18
      0x01da: PHI (r3v11 android.content.Intent) = 
      (r3v1 android.content.Intent)
      (r3v1 android.content.Intent)
      (r3v1 android.content.Intent)
      (r3v1 android.content.Intent)
      (r3v5 android.content.Intent)
      (r3v1 android.content.Intent)
     binds: [B:53:0x01d8, B:16:0x0078, B:13:0x006d, B:71:0x01da, B:89:0x01da, B:86:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x01da: PHI (r4v7 java.lang.String) = 
      (r4v1 java.lang.String)
      (r4v1 java.lang.String)
      (r4v1 java.lang.String)
      (r4v1 java.lang.String)
      (r4v1 java.lang.String)
      (r4v8 java.lang.String)
     binds: [B:53:0x01d8, B:16:0x0078, B:13:0x006d, B:71:0x01da, B:89:0x01da, B:86:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x01da: PHI (r10v7 int) = (r10v2 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int) binds: [B:53:0x01d8, B:16:0x0078, B:13:0x006d, B:71:0x01da, B:89:0x01da, B:86:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x01da: PHI (r11v7 short) = (r11v2 short), (r11v1 short), (r11v1 short), (r11v1 short), (r11v1 short), (r11v1 short) binds: [B:53:0x01d8, B:16:0x0078, B:13:0x006d, B:71:0x01da, B:89:0x01da, B:86:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x01da: PHI (r13v8 short[]) = (r13v1 short[]), (r13v1 short[]), (r13v1 short[]), (r13v1 short[]), (r13v2 short[]), (r13v1 short[]) binds: [B:53:0x01d8, B:16:0x0078, B:13:0x006d, B:71:0x01da, B:89:0x01da, B:86:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x01da: PHI (r14v8 int) = (r14v1 int), (r14v1 int), (r14v1 int), (r14v1 int), (r14v2 int), (r14v1 int) binds: [B:53:0x01d8, B:16:0x0078, B:13:0x006d, B:71:0x01da, B:89:0x01da, B:86:0x01da] A[DONT_GENERATE, DONT_INLINE]
      0x01da: PHI (r18v31 int) = (r18v8 int), (r18v15 int), (r18v16 int), (r18v19 int), (r18v21 int), (r18v32 int) binds: [B:53:0x01d8, B:16:0x0078, B:13:0x006d, B:71:0x01da, B:89:0x01da, B:86:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x020f A[PHI: r8 r9 r18
      0x020f: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:57:0x020d, B:18:0x007c, B:16:0x0078, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x020f: PHI (r9v3 int) = (r9v2 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:57:0x020d, B:18:0x007c, B:16:0x0078, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x020f: PHI (r18v22 int) = (r18v7 int), (r18v14 int), (r18v15 int), (r18v24 int) binds: [B:57:0x020d, B:18:0x007c, B:16:0x0078, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0261 A[PHI: r5 r6 r7 r18
      0x0261: PHI (r5v3 short[]) = (r5v2 short[]), (r5v1 short[]), (r5v1 short[]) binds: [B:65:0x025f, B:61:0x023f, B:88:0x0261] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r6v3 char) = (r6v2 char), (r6v1 char), (r6v1 char) binds: [B:65:0x025f, B:61:0x023f, B:88:0x0261] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r7v3 short) = (r7v1 short), (r7v2 short), (r7v1 short) binds: [B:65:0x025f, B:61:0x023f, B:88:0x0261] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r18v20 int) = (r18v5 int), (r18v6 int), (r18v21 int) binds: [B:65:0x025f, B:61:0x023f, B:88:0x0261] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public void mo1006() {
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        int i4;
        C0359 c0359 = this;
        ActivityC17169 activityC17169 = null;
        String strM11162 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short s2 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = -929632226;
        int i11 = C3911.f12484;
        int i12 = C3746.f11829;
        int iM2567 = C0630.m2566("᩻֨") ^ i11;
        int i13 = ((iM2567 ^ i12) * 13081) ^ 1841494669;
        int i14 = iM2567 ^ (-155580321);
        Intent intent = null;
        C12534 c12534 = null;
        while (true) {
            int i15 = i14 ^ (i13 & (((i10 ^ i12) * (-32235)) >> 31));
            switch (i15) {
                case -1934804181:
                case 1742167181:
                    i15 = i15;
                    i5 = s * s;
                    i6 = 191130625;
                    if (C1916.f6442) {
                        iM2566 = C2105.m6981("᩸ۤ") ^ i11;
                        i13 = ((iM2566 ^ i12) * (-9035)) ^ 335066353;
                        i = -951456880;
                    } else {
                        iM2566 = (C0630.m2566("ۢ᩺") + i11) * (-87);
                        i13 = ((iM2566 ^ i12) * (-22205)) ^ (-400792630);
                        i = -1501748463;
                    }
                    i2 = iM2566 ^ i;
                    i10 = i15;
                    i14 = i2;
                    c0359 = this;
                    break;
                case -1929983617:
                case 274339015:
                    i15 = i15;
                    sArr = f1768;
                    c = 0;
                    if (C1504.f5354) {
                        int iM6982 = C2105.m6981("ۤᩳ") ^ i11;
                        i13 = ((iM6982 ^ i12) * (-27259)) ^ 1345885956;
                        i2 = iM6982 ^ (-42631368);
                        i10 = i15;
                        intent = null;
                    } else {
                        iM2566 = C0630.m2566("ܽܶ") ^ i11;
                        i13 = ((iM2566 ^ i12) * 30541) ^ (-1830225126);
                        i = 1337222392;
                        i2 = iM2566 ^ i;
                        i10 = i15;
                    }
                    i14 = i2;
                    c0359 = this;
                    break;
                case -1453873804:
                case -54231557:
                    i15 = i15;
                    s = sArr[c];
                    if (C0050.f910 >= 0) {
                        int iM6983 = C2105.m6981("ۤᩳ") ^ i11;
                        i13 = ((iM6983 ^ i12) * (-27259)) ^ 1345885956;
                        i2 = iM6983 ^ (-42631368);
                        i10 = i15;
                        intent = null;
                    } else {
                        iM2566 = (C2105.m6981("ۤۤ") + i12) * 43;
                        i13 = ((iM2566 ^ i11) * (-26461)) ^ (-422189760);
                        i = -905347876;
                        i2 = iM2566 ^ i;
                        i10 = i15;
                    }
                    i14 = i2;
                    c0359 = this;
                    break;
                case -1439771308:
                case 564786921:
                    i15 = i15;
                    int i16 = i5 + i6;
                    i7 = i16 + i16;
                    s2 = 13825;
                    if (C0382.f1805) {
                        iM2566 = C0630.m2566("ۡܿ") ^ i12;
                        i13 = ((iM2566 ^ i11) * 10711) ^ 757346337;
                        i = -2000338217;
                    } else {
                        iM2566 = C0630.m2566("ܰۜ") ^ i12;
                        i13 = ((iM2566 ^ i11) * 14101) ^ (-1678305176);
                        i = 1050396917;
                    }
                    i2 = iM2566 ^ i;
                    i10 = i15;
                    i14 = i2;
                    c0359 = this;
                    break;
                case -1436284683:
                case 363173558:
                    i8 = 29087;
                    iM2566 = C2105.m6981("᩺᩺") ^ i11;
                    i13 = ((iM2566 ^ i12) * 11637) ^ (-836572605);
                    i = -1603283119;
                    i2 = iM2566 ^ i;
                    i10 = i15;
                    i14 = i2;
                    c0359 = this;
                    break;
                case -1230785875:
                case 221674439:
                    i15 = i15;
                    ServiceC13018.f38963 = c12534;
                    activityC17169 = c0359.f1771;
                    if (!C2272.f7362) {
                        iM6981 = (C2105.m6981("᩷ܺ") ^ i11) * (-87);
                        i3 = ((iM6981 ^ i12) * 4949) ^ 1134900766;
                        i4 = -74332227;
                        int i17 = i15;
                        i14 = iM6981 ^ i4;
                        i13 = i3;
                        i10 = i17;
                    } else {
                        iM2566 = C2105.m6981("ۨۗ") ^ i11;
                        i13 = ((iM2566 ^ i12) * 32279) ^ 705035661;
                        i = 1506665692;
                        i2 = iM2566 ^ i;
                        i10 = i15;
                        i14 = i2;
                        c0359 = this;
                    }
                    break;
                case -1228809920:
                case 26512489:
                    i15 = i15;
                    if (C3019.m9255() > 0) {
                        intent = new Intent(activityC17169, (Class<?>) ServiceC13018.class);
                        sArr2 = f1768;
                        i9 = 1;
                        if (!C1420.m4913()) {
                            iM6981 = C2105.m6981("۟ۘ") ^ i12;
                            i3 = ((iM6981 ^ i11) * (-21491)) ^ (-603622679);
                            i4 = 1491485141;
                            int i18 = i15;
                            i14 = iM6981 ^ i4;
                            i13 = i3;
                            i10 = i18;
                        } else {
                            iM2566 = C0630.m2566("ܰۜ") ^ i12;
                            i13 = ((iM2566 ^ i11) * 14101) ^ (-1678305176);
                            i = 1050396917;
                            i2 = iM2566 ^ i;
                            i10 = i15;
                            i14 = i2;
                            c0359 = this;
                        }
                    } else {
                        int iM6984 = C2105.m6981("ۤᩳ") ^ i11;
                        i13 = ((iM6984 ^ i12) * (-27259)) ^ 1345885956;
                        i2 = iM6984 ^ (-42631368);
                        i10 = i15;
                        intent = null;
                        i14 = i2;
                        c0359 = this;
                    }
                    break;
                case -1087496666:
                case -36003486:
                    i15 = i15;
                    RunnableC0588.m2441();
                    if (C4117.f13076 > 0) {
                        iM2566 = (C0630.m2566("ۢ᩺") + i11) * (-87);
                        i13 = ((iM2566 ^ i12) * (-22205)) ^ (-400792630);
                        i = -1501748463;
                    } else {
                        iM2566 = C0630.m2566("ܰۜ") ^ i12;
                        i13 = ((iM2566 ^ i11) * 14101) ^ (-1678305176);
                        i = 1050396917;
                    }
                    i2 = iM2566 ^ i;
                    i10 = i15;
                    i14 = i2;
                    c0359 = this;
                    break;
                case -872897158:
                case 460344707:
                    i15 = i15;
                    if (C1047.f3863 < 0) {
                        iM2566 = C0630.m2566("ܰۜ") ^ i12;
                        i13 = ((iM2566 ^ i11) * 14101) ^ (-1678305176);
                        i = 1050396917;
                    } else {
                        iM2566 = C2105.m6981("ۨۗ") ^ i11;
                        i13 = ((iM2566 ^ i12) * 32279) ^ 705035661;
                        i = 1506665692;
                    }
                    i2 = iM2566 ^ i;
                    i10 = i15;
                    i14 = i2;
                    c0359 = this;
                    break;
                case -723757777:
                case -300100020:
                    i15 = i15;
                    int i19 = s + s2;
                    if ((i19 * i19) - i7 <= 0) {
                        iM2566 = C2105.m6981("ۡۛ") ^ i11;
                        i13 = ((iM2566 ^ i12) * 26035) ^ (-118021368);
                        i = -401846725;
                    } else {
                        iM2566 = C0630.m2566("ۗ᩸") ^ i12;
                        i13 = ((iM2566 ^ i11) * (-17831)) ^ 720789258;
                        i = -859984239;
                    }
                    i2 = iM2566 ^ i;
                    i10 = i15;
                    i14 = i2;
                    c0359 = this;
                    break;
                case -645378786:
                case 771862372:
                    C1005.m3501();
                    C5695.m16023();
                    break;
                case -620015784:
                case 1480746428:
                    i15 = i15;
                    C2958.m9034();
                    C1005.m3501();
                    iM2566 = (C0630.m2566("ۢ᩺") + i11) * (-87);
                    i13 = ((iM2566 ^ i12) * (-22205)) ^ (-400792630);
                    i = -1501748463;
                    i2 = iM2566 ^ i;
                    i10 = i15;
                    i14 = i2;
                    c0359 = this;
                    break;
                case 250590260:
                case 666500258:
                    i8 = 61031;
                    iM2566 = C2105.m6981("᩺᩺") ^ i11;
                    i13 = ((iM2566 ^ i12) * 11637) ^ (-836572605);
                    i = -1603283119;
                    i2 = iM2566 ^ i;
                    i10 = i15;
                    i14 = i2;
                    c0359 = this;
                    break;
                case 462858530:
                case 1437481821:
                    if (!C0422.m1963()) {
                        i15 = i15;
                        iM2566 = (C0630.m2566("ۢ᩺") + i11) * (-87);
                        i13 = ((iM2566 ^ i12) * (-22205)) ^ (-400792630);
                        i = -1501748463;
                        i2 = iM2566 ^ i;
                        i10 = i15;
                        i14 = i2;
                        c0359 = this;
                    } else {
                        iM6981 = C2105.m6981("᩸ۗ") ^ i12;
                        i15 = i15;
                        i3 = ((iM6981 ^ i11) * (-14475)) ^ 111728898;
                        i4 = -1390225728;
                        int i110 = i15;
                        i14 = iM6981 ^ i4;
                        i13 = i3;
                        i10 = i110;
                    }
                    break;
                case 765788471:
                case 1183825412:
                    i15 = i15;
                    C12534 c12535 = new C12534(0, c0359.f1770);
                    if (C3911.m11924() <= 0) {
                        c12534 = c12535;
                        iM2566 = C2105.m6981("ۨۗ") ^ i11;
                        i13 = ((iM2566 ^ i12) * 32279) ^ 705035661;
                        i = 1506665692;
                        i2 = iM2566 ^ i;
                    } else {
                        int iM2568 = C0630.m2566("۟ۚ") ^ i12;
                        int i20 = ((iM2568 ^ i11) * (-2363)) ^ (-645106307);
                        i2 = iM2568 ^ (-797302381);
                        c12534 = c12535;
                        i13 = i20;
                    }
                    i10 = i15;
                    i14 = i2;
                    c0359 = this;
                    break;
                case 1088168489:
                case 1298044333:
                    intent.putExtra(strM11162, true);
                    activityC17169.startService(intent);
                    activityC17169.f52607.f11863 = true;
                    break;
                case 1637925434:
                case 1917067419:
                    i15 = i15;
                    ServiceC13018.f38961 = activityC17169.f52607.f11862;
                    if (C1047.f3863 < 0) {
                        iM6981 = (C2105.m6981("ۡۖ") ^ i12) * (-77);
                        i3 = ((iM6981 ^ i11) * (-3555)) ^ 1149232248;
                        i4 = -1504712048;
                        int i111 = i15;
                        i14 = iM6981 ^ i4;
                        i13 = i3;
                        i10 = i111;
                    } else {
                        iM2566 = C0630.m2566("ܰۜ") ^ i12;
                        i13 = ((iM2566 ^ i11) * 14101) ^ (-1678305176);
                        i = 1050396917;
                        i2 = iM2566 ^ i;
                        i10 = i15;
                        i14 = i2;
                        c0359 = this;
                    }
                    break;
                default:
                    i15 = i15;
                    strM11162 = C3663.m11162(sArr2, i9, 4, i8);
                    if (C2167.f7158 < 0) {
                        iM6981 = C2105.m6981("ۙܿ") ^ i11;
                        i3 = ((iM6981 ^ i12) * (-25371)) ^ (-937390838);
                        i4 = -1505763398;
                        int i112 = i15;
                        i14 = iM6981 ^ i4;
                        i13 = i3;
                        i10 = i112;
                    } else {
                        iM2566 = C0630.m2566("ܰۜ") ^ i12;
                        i13 = ((iM2566 ^ i11) * 14101) ^ (-1678305176);
                        i = 1050396917;
                        i2 = iM2566 ^ i;
                        i10 = i15;
                        i14 = i2;
                        c0359 = this;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f1771.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
