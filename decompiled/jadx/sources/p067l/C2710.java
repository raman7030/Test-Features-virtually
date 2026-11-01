package p067l;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: l.֡ۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2710 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖۖܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f81829;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractC17043 f4548;

    /* JADX INFO: renamed from: ܳ */
    public C7302 f4549;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ActivityC18686 f4550;

    static {
        ApplicationC14266.m56479(3);
        f81829 = new short[]{3086, -4594, -4599, -4594, -4589};
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public native void mo3405();

    public C2710(ActivityC18686 activityC18686, AbstractC17043 abstractC17043) {
        this.f4550 = activityC18686;
        this.f4548 = abstractC17043;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22242(this.f4550);
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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public void mo3402() {
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        int i4;
        C2710 c2710 = this;
        ActivityC18686 activityC18686 = null;
        String strM56203 = null;
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
        int i11 = C1036.f81953;
        int i12 = C1028.f81950;
        int iM55681 = C0873.m55680("᩻֨") ^ i11;
        int i13 = ((iM55681 ^ i12) * 13081) ^ 1841494669;
        int i14 = iM55681 ^ (-155580321);
        Intent intent = null;
        C14281 c14281 = null;
        while (true) {
            int i15 = i14 ^ (i13 & (((i10 ^ i12) * (-32235)) >> 31));
            switch (i15) {
                case -1934804181:
                case 1742167181:
                    i15 = i15;
                    i5 = s * s;
                    i6 = 191130625;
                    if (C0937.f81884) {
                        iM55680 = C0946.m55979("᩸ۤ") ^ i11;
                        i13 = ((iM55680 ^ i12) * (-9035)) ^ 335066353;
                        i = -951456880;
                    } else {
                        iM55680 = (C0873.m55680("ۢ᩺") + i11) * (-87);
                        i13 = ((iM55680 ^ i12) * (-22205)) ^ (-400792630);
                        i = -1501748463;
                    }
                    i2 = iM55680 ^ i;
                    i10 = i15;
                    i14 = i2;
                    c2710 = this;
                    break;
                case -1929983617:
                case 274339015:
                    i15 = i15;
                    sArr = f81829;
                    c = 0;
                    if (C0917.f81868) {
                        int iM559710 = C0946.m55979("ۤᩳ") ^ i11;
                        i13 = ((iM559710 ^ i12) * (-27259)) ^ 1345885956;
                        i2 = iM559710 ^ (-42631368);
                        i10 = i15;
                        intent = null;
                    } else {
                        iM55680 = C0873.m55680("ܽܶ") ^ i11;
                        i13 = ((iM55680 ^ i12) * 30541) ^ (-1830225126);
                        i = 1337222392;
                        i2 = iM55680 ^ i;
                        i10 = i15;
                    }
                    i14 = i2;
                    c2710 = this;
                    break;
                case -1453873804:
                case -54231557:
                    i15 = i15;
                    s = sArr[c];
                    if (C0845.f81821 >= 0) {
                        int iM559711 = C0946.m55979("ۤᩳ") ^ i11;
                        i13 = ((iM559711 ^ i12) * (-27259)) ^ 1345885956;
                        i2 = iM559711 ^ (-42631368);
                        i10 = i15;
                        intent = null;
                    } else {
                        iM55680 = (C0946.m55979("ۤۤ") + i12) * 43;
                        i13 = ((iM55680 ^ i11) * (-26461)) ^ (-422189760);
                        i = -905347876;
                        i2 = iM55680 ^ i;
                        i10 = i15;
                    }
                    i14 = i2;
                    c2710 = this;
                    break;
                case -1439771308:
                case 564786921:
                    i15 = i15;
                    int i16 = i5 + i6;
                    i7 = i16 + i16;
                    s2 = 13825;
                    if (C0861.f81831) {
                        iM55680 = C0873.m55680("ۡܿ") ^ i12;
                        i13 = ((iM55680 ^ i11) * 10711) ^ 757346337;
                        i = -2000338217;
                    } else {
                        iM55680 = C0873.m55680("ܰۜ") ^ i12;
                        i13 = ((iM55680 ^ i11) * 14101) ^ (-1678305176);
                        i = 1050396917;
                    }
                    i2 = iM55680 ^ i;
                    i10 = i15;
                    i14 = i2;
                    c2710 = this;
                    break;
                case -1436284683:
                case 363173558:
                    i8 = 29087;
                    iM55680 = C0946.m55979("᩺᩺") ^ i11;
                    i13 = ((iM55680 ^ i12) * 11637) ^ (-836572605);
                    i = -1603283119;
                    i2 = iM55680 ^ i;
                    i10 = i15;
                    i14 = i2;
                    c2710 = this;
                    break;
                case -1230785875:
                case 221674439:
                    i15 = i15;
                    ServiceC14741.f42010 = c14281;
                    activityC18686 = c2710.f4550;
                    if (!C0955.f81898) {
                        iM55979 = (C0946.m55979("᩷ܺ") ^ i11) * (-87);
                        i3 = ((iM55979 ^ i12) * 4949) ^ 1134900766;
                        i4 = -74332227;
                        int i17 = i15;
                        i14 = iM55979 ^ i4;
                        i13 = i3;
                        i10 = i17;
                    } else {
                        iM55680 = C0946.m55979("ۨۗ") ^ i11;
                        i13 = ((iM55680 ^ i12) * 32279) ^ 705035661;
                        i = 1506665692;
                        i2 = iM55680 ^ i;
                        i10 = i15;
                        i14 = i2;
                        c2710 = this;
                    }
                    break;
                case -1228809920:
                case 26512489:
                    i15 = i15;
                    if (C0992.m56107() > 0) {
                        intent = new Intent(activityC18686, (Class<?>) ServiceC14741.class);
                        sArr2 = f81829;
                        i9 = 1;
                        if (!C0912.m55833()) {
                            iM55979 = C0946.m55979("۟ۘ") ^ i12;
                            i3 = ((iM55979 ^ i11) * (-21491)) ^ (-603622679);
                            i4 = 1491485141;
                            int i18 = i15;
                            i14 = iM55979 ^ i4;
                            i13 = i3;
                            i10 = i18;
                        } else {
                            iM55680 = C0873.m55680("ܰۜ") ^ i12;
                            i13 = ((iM55680 ^ i11) * 14101) ^ (-1678305176);
                            i = 1050396917;
                            i2 = iM55680 ^ i;
                            i10 = i15;
                            i14 = i2;
                            c2710 = this;
                        }
                    } else {
                        int iM559712 = C0946.m55979("ۤᩳ") ^ i11;
                        i13 = ((iM559712 ^ i12) * (-27259)) ^ 1345885956;
                        i2 = iM559712 ^ (-42631368);
                        i10 = i15;
                        intent = null;
                        i14 = i2;
                        c2710 = this;
                    }
                    break;
                case -1087496666:
                case -36003486:
                    i15 = i15;
                    RunnableC0871.m55672();
                    if (C1046.f81962 > 0) {
                        iM55680 = (C0873.m55680("ۢ᩺") + i11) * (-87);
                        i13 = ((iM55680 ^ i12) * (-22205)) ^ (-400792630);
                        i = -1501748463;
                    } else {
                        iM55680 = C0873.m55680("ܰۜ") ^ i12;
                        i13 = ((iM55680 ^ i11) * 14101) ^ (-1678305176);
                        i = 1050396917;
                    }
                    i2 = iM55680 ^ i;
                    i10 = i15;
                    i14 = i2;
                    c2710 = this;
                    break;
                case -872897158:
                case 460344707:
                    i15 = i15;
                    if (C0894.f81854 < 0) {
                        iM55680 = C0873.m55680("ܰۜ") ^ i12;
                        i13 = ((iM55680 ^ i11) * 14101) ^ (-1678305176);
                        i = 1050396917;
                    } else {
                        iM55680 = C0946.m55979("ۨۗ") ^ i11;
                        i13 = ((iM55680 ^ i12) * 32279) ^ 705035661;
                        i = 1506665692;
                    }
                    i2 = iM55680 ^ i;
                    i10 = i15;
                    i14 = i2;
                    c2710 = this;
                    break;
                case -723757777:
                case -300100020:
                    i15 = i15;
                    int i19 = s + s2;
                    if ((i19 * i19) - i7 <= 0) {
                        iM55680 = C0946.m55979("ۡۛ") ^ i11;
                        i13 = ((iM55680 ^ i12) * 26035) ^ (-118021368);
                        i = -401846725;
                    } else {
                        iM55680 = C0873.m55680("ۗ᩸") ^ i12;
                        i13 = ((iM55680 ^ i11) * (-17831)) ^ 720789258;
                        i = -859984239;
                    }
                    i2 = iM55680 ^ i;
                    i10 = i15;
                    i14 = i2;
                    c2710 = this;
                    break;
                case -645378786:
                case 771862372:
                    C0892.m55749();
                    C1124.m56367();
                    break;
                case -620015784:
                case 1480746428:
                    i15 = i15;
                    C0989.m56095();
                    C0892.m55749();
                    iM55680 = (C0873.m55680("ۢ᩺") + i11) * (-87);
                    i13 = ((iM55680 ^ i12) * (-22205)) ^ (-400792630);
                    i = -1501748463;
                    i2 = iM55680 ^ i;
                    i10 = i15;
                    i14 = i2;
                    c2710 = this;
                    break;
                case 250590260:
                case 666500258:
                    i8 = 61031;
                    iM55680 = C0946.m55979("᩺᩺") ^ i11;
                    i13 = ((iM55680 ^ i12) * 11637) ^ (-836572605);
                    i = -1603283119;
                    i2 = iM55680 ^ i;
                    i10 = i15;
                    i14 = i2;
                    c2710 = this;
                    break;
                case 462858530:
                case 1437481821:
                    if (!C0863.m55643()) {
                        i15 = i15;
                        iM55680 = (C0873.m55680("ۢ᩺") + i11) * (-87);
                        i13 = ((iM55680 ^ i12) * (-22205)) ^ (-400792630);
                        i = -1501748463;
                        i2 = iM55680 ^ i;
                        i10 = i15;
                        i14 = i2;
                        c2710 = this;
                    } else {
                        iM55979 = C0946.m55979("᩸ۗ") ^ i12;
                        i15 = i15;
                        i3 = ((iM55979 ^ i11) * (-14475)) ^ 111728898;
                        i4 = -1390225728;
                        int i110 = i15;
                        i14 = iM55979 ^ i4;
                        i13 = i3;
                        i10 = i110;
                    }
                    break;
                case 765788471:
                case 1183825412:
                    i15 = i15;
                    C14281 c14282 = new C14281(0, c2710.f4549);
                    if (C1036.m56257() <= 0) {
                        c14281 = c14282;
                        iM55680 = C0946.m55979("ۨۗ") ^ i11;
                        i13 = ((iM55680 ^ i12) * 32279) ^ 705035661;
                        i = 1506665692;
                        i2 = iM55680 ^ i;
                    } else {
                        int iM55682 = C0873.m55680("۟ۚ") ^ i12;
                        int i20 = ((iM55682 ^ i11) * (-2363)) ^ (-645106307);
                        i2 = iM55682 ^ (-797302381);
                        c14281 = c14282;
                        i13 = i20;
                    }
                    i10 = i15;
                    i14 = i2;
                    c2710 = this;
                    break;
                case 1088168489:
                case 1298044333:
                    intent.putExtra(strM56203, true);
                    activityC18686.startService(intent);
                    activityC18686.f55788.f14669 = true;
                    break;
                case 1637925434:
                case 1917067419:
                    i15 = i15;
                    ServiceC14741.f42008 = activityC18686.f55788.f14668;
                    if (C0894.f81854 < 0) {
                        iM55979 = (C0946.m55979("ۡۖ") ^ i12) * (-77);
                        i3 = ((iM55979 ^ i11) * (-3555)) ^ 1149232248;
                        i4 = -1504712048;
                        int i111 = i15;
                        i14 = iM55979 ^ i4;
                        i13 = i3;
                        i10 = i111;
                    } else {
                        iM55680 = C0873.m55680("ܰۜ") ^ i12;
                        i13 = ((iM55680 ^ i11) * 14101) ^ (-1678305176);
                        i = 1050396917;
                        i2 = iM55680 ^ i;
                        i10 = i15;
                        i14 = i2;
                        c2710 = this;
                    }
                    break;
                default:
                    i15 = i15;
                    strM56203 = C1024.m56203(sArr2, i9, 4, i8);
                    if (C0949.f81897 < 0) {
                        iM55979 = C0946.m55979("ۙܿ") ^ i11;
                        i3 = ((iM55979 ^ i12) * (-25371)) ^ (-937390838);
                        i4 = -1505763398;
                        int i112 = i15;
                        i14 = iM55979 ^ i4;
                        i13 = i3;
                        i10 = i112;
                    } else {
                        iM55680 = C0873.m55680("ܰۜ") ^ i12;
                        i13 = ((iM55680 ^ i11) * 14101) ^ (-1678305176);
                        i = 1050396917;
                        i2 = iM55680 ^ i;
                        i10 = i15;
                        i14 = i2;
                        c2710 = this;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f4550.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
