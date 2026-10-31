package l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩺۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9A5 */
/* JADX INFO: loaded from: classes.dex */
public final class C22849 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۧ֨᩷, reason: not valid java name and contains not printable characters */
    private static final short[] f73737 = {2985, 10955, 2781, 9184};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC18617 f73738;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC13676 f73739;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f73740;

    /* JADX WARN: Code duplicated, block: B:27:0x00c4 A[PHI: r3 r4 r5
      0x00c4: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:26:0x00c2, B:22:0x00a0, B:14:0x007c, B:11:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:26:0x00c2, B:22:0x00a0, B:14:0x007c, B:11:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:26:0x00c2, B:22:0x00a0, B:14:0x007c, B:11:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01de A[PHI: r2 r8 r13
      0x01de: PHI (r2v4 l.ܰ۟ܽ) = (r2v2 l.ܰ۟ܽ), (r2v3 l.ܰ۟ܽ), (r2v2 l.ܰ۟ܽ), (r2v2 l.ܰ۟ܽ) binds: [B:56:0x01dc, B:34:0x0112, B:16:0x0080, B:14:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:56:0x01dc, B:34:0x0112, B:16:0x0080, B:14:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:56:0x01dc, B:34:0x0112, B:16:0x0080, B:14:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0211 A[PHI: r7 r11 r14
      0x0211: PHI (r7v4 char) = (r7v3 char), (r7v2 char), (r7v2 char), (r7v2 char), (r7v2 char) binds: [B:60:0x020f, B:44:0x0180, B:30:0x00f3, B:11:0x0072, B:7:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r11v4 short) = (r11v2 short), (r11v3 short), (r11v2 short), (r11v2 short), (r11v2 short) binds: [B:60:0x020f, B:44:0x0180, B:30:0x00f3, B:11:0x0072, B:7:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:60:0x020f, B:44:0x0180, B:30:0x00f3, B:11:0x0072, B:7:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0242 A[PHI: r9 r10 r19
      0x0242: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:64:0x0240, B:52:0x01bd, B:48:0x019e] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:64:0x0240, B:52:0x01bd, B:48:0x019e] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:64:0x0240, B:52:0x01bd, B:48:0x019e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        int iM2566;
        int i;
        int i2;
        int i3 = C7811.f24123;
        int i4 = C0630.f2410;
        int iM6981 = C2105.m6981("ۡۢ") ^ i3;
        int i5 = ((iM6981 ^ i4) * (-6393)) ^ (-1733357848);
        String strM16034 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6981 ^ 1539576319;
        ActivityC13676 activityC13676 = null;
        int iM2567 = 0;
        int i7 = 0;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1192809828;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * 11215) >> 31));
            switch (i12) {
                case -1962339287:
                case -1524503239:
                    if (C4159.f13567) {
                        iM2566 = C2105.m6981("ۨۘ") ^ i4;
                        i = ((iM2566 ^ i3) * 3255) ^ (-1920954042);
                        i2 = -2063062578;
                    } else {
                        iM2566 = C2105.m6981("ܳܺ") ^ i3;
                        i = ((iM2566 ^ i4) * (-1729)) ^ (-1056441238);
                        i2 = -929296728;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1592384130:
                case -703466621:
                    C3911.m11924();
                    if (ServiceConnectionC3453.m10564() > 0) {
                        iM2566 = C2105.m6981("ܳܺ") ^ i3;
                        i = ((iM2566 ^ i4) * (-1729)) ^ (-1056441238);
                        i2 = -929296728;
                    } else {
                        iM2566 = C0630.m2566("ۙۢ") ^ i3;
                        i = ((iM2566 ^ i4) * 20847) ^ (-1554071224);
                        i2 = 349303639;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1524261906:
                case 1987376844:
                    s = sArr[c];
                    if (C1047.m3599() >= 0) {
                        iM2566 = (C0630.m2566("֨֡") + i3) * 51;
                        i = ((iM2566 ^ i4) * 4071) ^ (-549673418);
                        i2 = 1306796902;
                    } else {
                        iM2566 = C2105.m6981("᩸ᩴ") ^ i4;
                        i = ((iM2566 ^ i3) * 20495) ^ 854149407;
                        i2 = 1288485516;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1490005256:
                case 2037132680:
                    C0964.m3413();
                    if (C3911.m11924() > 0) {
                        iM2566 = (C0630.m2566("֨֡") + i3) * 51;
                        i = ((iM2566 ^ i4) * 4071) ^ (-549673418);
                        i2 = 1306796902;
                    } else {
                        iM2566 = C2105.m6981("ۨۘ") ^ i4;
                        i = ((iM2566 ^ i3) * 3255) ^ (-1920954042);
                        i2 = -2063062578;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1191110199:
                case 1397559908:
                    m20267(activityC13676, iM2567 ^ i7);
                    break;
                case -1093026471:
                case 1267983471:
                    i9 = i8 + 1;
                    if (C3911.f12484 >= 0) {
                        iM2566 = (C2105.m6981("ۘۘ") + i4) * 61;
                        i = ((iM2566 ^ i3) * 15537) ^ 744805092;
                        i2 = 1246544173;
                    } else {
                        iM2566 = C0630.m2566("ۘۙ") ^ i3;
                        i = ((iM2566 ^ i4) * 10487) ^ (-144749430);
                        i2 = -1510965260;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1039160776:
                case 335569330:
                    s2 = 1;
                    if (C1047.f3863 >= 0) {
                        iM2566 = C2105.m6981("ܳܺ") ^ i3;
                        i = ((iM2566 ^ i4) * (-1729)) ^ (-1056441238);
                        i2 = -929296728;
                    } else {
                        iM2566 = C2105.m6981("۟ܺ") ^ i4;
                        i = ((iM2566 ^ i3) * 23663) ^ (-1901573953);
                        i2 = -1757547482;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1038760982:
                case 663567448:
                    i10 = 29033;
                    iM2566 = (i3 - C2105.m6981("᩵ܳ")) * 35;
                    i = ((iM2566 ^ i4) * (-17263)) ^ (-2119788975);
                    i2 = 717904282;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -846346405:
                case 444732610:
                    int i13 = s + s2;
                    if ((i13 * i13) - i9 >= 0) {
                        iM2566 = (i3 - C2105.m6981("ۡۡ")) * 69;
                        i = ((iM2566 ^ i4) * 6521) ^ (-588255825);
                        i2 = -769332261;
                    } else {
                        iM2566 = C2105.m6981("ۖ۬") ^ i4;
                        i = ((iM2566 ^ i3) * 20333) ^ 1674709736;
                        i2 = 344535396;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -743733205:
                case 1502034478:
                    i11 = 1;
                    if (C1294.f4556 >= 0) {
                        iM2566 = C2105.m6981("ܳܺ") ^ i3;
                        i = ((iM2566 ^ i4) * (-1729)) ^ (-1056441238);
                        i2 = -929296728;
                    } else {
                        iM2566 = C2105.m6981("۠ܽ") ^ i3;
                        i = ((iM2566 ^ i4) * (-30703)) ^ 846047227;
                        i2 = -126659219;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -592283130:
                case 1952389902:
                    c = 0;
                    if (C3019.m9255() <= 0) {
                        iM2566 = C2105.m6981("ܳܺ") ^ i3;
                        i = ((iM2566 ^ i4) * (-1729)) ^ (-1056441238);
                        i2 = -929296728;
                    } else {
                        iM2566 = (C0630.m2566("᩺ۧ") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2566 ^ i3) * (-6197)) ^ (-299650104);
                        i2 = 1275880919;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -541582728:
                case 1698388345:
                    C0237.m1481();
                    C0483.m2121();
                    iM2566 = (C0630.m2566("֨֡") + i3) * 51;
                    i = ((iM2566 ^ i4) * 4071) ^ (-549673418);
                    i2 = 1306796902;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -525550339:
                case 2041807681:
                    activityC13676 = this.f73739;
                    sArr2 = f73737;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C0630.m2566("֨֡") + i3) * 51;
                        i = ((iM2566 ^ i4) * 4071) ^ (-549673418);
                        i2 = 1306796902;
                    } else {
                        iM2566 = C0630.m2566("ۖ۠") ^ i4;
                        i = ((iM2566 ^ i3) * 645) ^ 816979314;
                        i2 = -1994670681;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -365688679:
                case 1680252049:
                    sArr = f73737;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = (C2105.m6981("ۘۘ") + i4) * 61;
                        i = ((iM2566 ^ i3) * 15537) ^ 744805092;
                        i2 = 1246544173;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩶ܰ")) * 15;
                        i = ((iM2566 ^ i4) * (-2097)) ^ 275771331;
                        i2 = 414451725;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -65558278:
                case 377428790:
                    i8 = s * 2;
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM2566 = (C2105.m6981("ۘۘ") + i4) * 61;
                        i = ((iM2566 ^ i3) * 15537) ^ 744805092;
                        i2 = 1246544173;
                    } else {
                        iM2566 = C2105.m6981("ܰᩳ") ^ i3;
                        i = ((iM2566 ^ i4) * (-16251)) ^ (-157869956);
                        i2 = -94119829;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 889593464:
                case 2084410227:
                    iM2567 = C0630.m2566(strM16034);
                    i7 = 2121613477;
                    if (C3019.m9255() <= 0) {
                        iM2566 = C2105.m6981("ۨۘ") ^ i4;
                        i = ((iM2566 ^ i3) * 3255) ^ (-1920954042);
                        i2 = -2063062578;
                    } else {
                        iM2566 = C0630.m2566("ܽܽ") ^ i4;
                        i = ((iM2566 ^ i3) * 31353) ^ (-103554892);
                        i2 = -474934993;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1056930214:
                case 1213233786:
                    C22628.m50615();
                    C4075.m12263();
                    break;
                case 1233341559:
                case 1346099088:
                    strM16034 = C5695.m16034(sArr2, i11, 3, i10);
                    if (C11340.m28031()) {
                        iM2566 = C2105.m6981("ۛܿ") ^ i4;
                        i = ((iM2566 ^ i3) * 32027) ^ (-857915956);
                        i2 = 646817777;
                    } else {
                        iM2566 = C2105.m6981("ۨۘ") ^ i4;
                        i = ((iM2566 ^ i3) * 3255) ^ (-1920954042);
                        i2 = -2063062578;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    i10 = 9461;
                    iM2566 = (i3 - C2105.m6981("᩵ܳ")) * 35;
                    i = ((iM2566 ^ i4) * (-17263)) ^ (-2119788975);
                    i2 = 717904282;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        ActivityC13676 activityC13676 = null;
        AbstractC15440 abstractC15440 = null;
        String strM36489 = null;
        EnumC13671[] enumC13671Arr = null;
        EnumC13671 enumC13671 = null;
        char c = 0;
        C21434 c21434M14984 = null;
        Iterator itM6374 = null;
        C8739 c8739 = null;
        int i = 722707339;
        int i2 = C0714.f2697;
        int i3 = C3019.f9544;
        int iM6981 = (i3 - C2105.m6981("ۗܶ")) * (-15);
        int i4 = ((iM6981 ^ i2) * 4309) ^ (-213418338);
        int i5 = 664466716;
        while (true) {
            i = ((((i ^ i2) * (-16955)) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -1824248128:
                case -591360538:
                    C0483.m2121();
                    if (C4117.f13076 > 0) {
                        iM6981 = (i2 - C0630.m2566("۠᩺")) * 11;
                        i4 = ((iM6981 ^ i3) * (-10547)) ^ (-247023594);
                        i5 = 627036334;
                    } else {
                        iM6981 = C2105.m6981("֡᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14035) ^ (-205602720);
                        i5 = -959982295;
                    }
                    break;
                case -1733161838:
                case 2139827974:
                    enumC13671 = EnumC13671.OrderedField;
                    c = 0;
                    if (C1128.f4106 <= 0) {
                        iM6981 = (i2 - C0630.m2566("ۧᩳ")) * 21;
                        i4 = ((iM6981 ^ i3) * 11213) ^ 610426263;
                        i5 = 1890182755;
                    } else {
                        iM6981 = (C2105.m6981("۫֡") ^ i3) * 57;
                        i4 = ((iM6981 ^ i2) * (-13447)) ^ (-696396658);
                        i5 = 1509401811;
                    }
                    break;
                case -1565741684:
                case 575439497:
                    abstractC15440 = activityC13676.f40825;
                    if (RunnableC3474.m10630()) {
                        iM6981 = C0630.m2566("ۤ۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-29719)) ^ (-1887196087);
                        i5 = -1073717467;
                    } else {
                        iM6981 = C2105.m6981("֡᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14035) ^ (-205602720);
                        i5 = -959982295;
                    }
                    break;
                case -1323596571:
                case -545405128:
                    enumC13671Arr[c] = enumC13671;
                    if (C3432.f10845 >= 0) {
                        iM6981 = C0630.m2566("᩸ܳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 29543) ^ (-170846714);
                        i5 = 664390534;
                    } else {
                        iM6981 = C2105.m6981("֫ᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-3289)) ^ (-1749315777);
                        i5 = 1097562536;
                    }
                    break;
                case -1006984881:
                case 873412285:
                    activityC13676 = this.f73739;
                    if (C0422.m1963()) {
                        iM6981 = (C0630.m2566("ܳ֨") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM6981 ^ i2) * 27853) ^ 1745028700;
                        i5 = -2135567501;
                    } else {
                        iM6981 = C0630.m2566("ۚ᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * 325) ^ 1048730499;
                        i5 = 282602977;
                    }
                    break;
                case -995973746:
                case 1039047602:
                    activityC13676.f40825.m36510(c21434M14984.mo14987());
                    break;
                case -934204396:
                case 1313839536:
                    strM36489 = abstractC15440.m36489();
                    if (C3245.f10203 <= 0) {
                        iM6981 = C2105.m6981("֡᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14035) ^ (-205602720);
                        i5 = -959982295;
                    } else {
                        iM6981 = (i2 - C0630.m2566("۠ܽ")) * 51;
                        i4 = ((iM6981 ^ i3) * (-19677)) ^ (-1249894152);
                        i5 = 671001222;
                    }
                    break;
                case -925420719:
                case -902071859:
                    C22628.m50615();
                    if (!C1711.f5919) {
                        iM6981 = C0630.m2566("ۚ᩷") ^ i3;
                        i4 = ((iM6981 ^ i2) * 325) ^ 1048730499;
                        i5 = 282602977;
                    } else {
                        iM6981 = C2105.m6981("֡᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14035) ^ (-205602720);
                        i5 = -959982295;
                    }
                    break;
                case -819680867:
                case 1180666529:
                    c21434M14984 = AbstractC5206.m14984(strM36489, enumC13671Arr);
                    itM6374 = RunnableC1937.m6374(this.f73740);
                    iM6981 = C0630.m2566("᩹ۘ") ^ i2;
                    i4 = ((iM6981 ^ i3) * 26939) ^ (-37378138);
                    i5 = -686687307;
                    break;
                case -625375582:
                case 443757210:
                    if (C1773.m5908() <= 0) {
                        iM6981 = (i2 - C0630.m2566("۠᩺")) * 11;
                        i4 = ((iM6981 ^ i3) * (-10547)) ^ (-247023594);
                        i5 = 627036334;
                    } else {
                        iM6981 = (C2105.m6981("֨ۡ") + i2) * 63;
                        i4 = ((iM6981 ^ i3) * 17973) ^ 406176237;
                        i5 = -637802527;
                    }
                    break;
                case -597712181:
                case 1532847620:
                    if (C1005.m3501()) {
                        iM6981 = C0630.m2566("ܶۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 17801) ^ (-875650487);
                        i5 = 2105276015;
                    } else {
                        iM6981 = C0630.m2566("᩸ܳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 29543) ^ (-170846714);
                        i5 = 664390534;
                    }
                    break;
                case -214693351:
                case -122639642:
                    if (C21923.f70183 != 0) {
                        iM6981 = (i2 - C0630.m2566("۠᩺")) * 11;
                        i4 = ((iM6981 ^ i3) * (-10547)) ^ (-247023594);
                        i5 = 627036334;
                    } else {
                        iM6981 = (C2105.m6981("۠ۤ") + i3) * 99;
                        i4 = ((iM6981 ^ i2) * 29649) ^ 600330486;
                        i5 = 203143961;
                    }
                    break;
                case -42382644:
                case 507509951:
                    C2167.m7155();
                    iM6981 = C2105.m6981("֡᩸") ^ i2;
                    i4 = ((iM6981 ^ i3) * 14035) ^ (-205602720);
                    i5 = -959982295;
                    break;
                case 379466542:
                case 2120804294:
                    enumC13671Arr = new EnumC13671[1];
                    if (C0714.f2697 >= 0) {
                        iM6981 = (i2 - C0630.m2566("ۧᩳ")) * 21;
                        i4 = ((iM6981 ^ i3) * 11213) ^ 610426263;
                        i5 = 1890182755;
                    } else {
                        iM6981 = C0630.m2566("ۢ۟") ^ i3;
                        i4 = ((iM6981 ^ i2) * 20475) ^ 1651528548;
                        i5 = -1842709813;
                    }
                    break;
                case 530208205:
                case 1216874435:
                    C0630.m2564();
                    break;
                case 628213463:
                case 1499323095:
                    if (C0483.m2123(itM6374)) {
                        iM6981 = C2105.m6981("ۘۡ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-4511)) ^ 495623136;
                        i5 = -1468112373;
                    } else {
                        iM6981 = (i3 - C2105.m6981("۬ܰ")) * 93;
                        i4 = ((iM6981 ^ i2) * 4429) ^ 1370812305;
                        i5 = 1857032270;
                    }
                    break;
                case 640787231:
                case 663924379:
                    c8739 = (C8739) C2272.m7513(itM6374);
                    if (c8739.f26611 != null) {
                        iM6981 = C0630.m2566("ۗ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 29895) ^ (-1208663614);
                        i5 = -1072943628;
                    } else {
                        iM6981 = C0630.m2566("᩹ۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 26939) ^ (-37378138);
                        i5 = -686687307;
                    }
                    break;
                case 753644484:
                case 939787023:
                    if (C0237.m1481() >= 0) {
                        iM6981 = C0630.m2566("᩸ܳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 29543) ^ (-170846714);
                        i5 = 664390534;
                    } else {
                        iM6981 = C2105.m6981("֡᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 14035) ^ (-205602720);
                        i5 = -959982295;
                    }
                    break;
                case 766344622:
                case 1035720029:
                    c21434M14984.m48549(c8739.m22597(), c8739.f26611);
                    iM6981 = C0630.m2566("᩹ۘ") ^ i2;
                    i4 = ((iM6981 ^ i3) * 26939) ^ (-37378138);
                    i5 = -686687307;
                    break;
                default:
                    if (C2105.m6982() != 0) {
                        iM6981 = (i2 - C0630.m2566("۠᩺")) * 11;
                        i4 = ((iM6981 ^ i3) * (-10547)) ^ (-247023594);
                        i5 = 627036334;
                    } else {
                        iM6981 = C0630.m2566("᩷ۖ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 5325) ^ 375437103;
                        i5 = 1326325571;
                    }
                    break;
            }
            return;
        }
    }

    public C22849(ActivityC13676 activityC13676, ArrayList arrayList, RunnableC18617 runnableC18617) {
        int i = -522836681;
        int i2 = C11340.f33930;
        int i3 = C4075.f12947;
        this.f73739 = activityC13676;
        this.f73740 = arrayList;
        this.f73738 = runnableC18617;
        int iM6981 = (C2105.m6981("֡ۜ") ^ i2) * (-117);
        int i4 = ((iM6981 ^ i3) * 4071) ^ 1056534053;
        int i5 = -455758339;
        while (true) {
            i = (iM6981 ^ i5) ^ (i4 & (((i ^ i3) * 12873) >> 31));
            switch (i) {
                case -2021353978:
                case 633395486:
                    return;
                case -1964491801:
                case 681257516:
                    C0630.m2564();
                    if (C2272.f7362) {
                        iM6981 = C0630.m2566("ܳۙ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 19269) ^ 806546305;
                        i5 = 952514246;
                    } else {
                        iM6981 = (C2105.m6981("ۘܳ") ^ i2) * (-13);
                        i4 = ((iM6981 ^ i3) * 12215) ^ 66996438;
                        i5 = 1835742149;
                    }
                    break;
                case -1641963881:
                case -320014340:
                    C0714.m2805();
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (C2105.m6981("ۜ᩻") + i3) * (-101);
                        i4 = ((iM6981 ^ i2) * (-11155)) ^ 1956324977;
                        i5 = 1244102243;
                    } else {
                        iM6981 = C0630.m2566("ܺᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 28105) ^ 889196731;
                        i5 = -1177166966;
                    }
                    break;
                case -1098559770:
                case -329336048:
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C2105.m6981("᩷ۢ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 12671) ^ 322984218;
                        i5 = 45093236;
                    } else {
                        iM6981 = C2105.m6981("۟ۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-2117)) ^ 665231994;
                        i5 = 266296380;
                    }
                    break;
                case 472720749:
                case 1421483264:
                    C4117.m12364();
                    throw new RuntimeException();
                case 1032217282:
                case 2039800046:
                    C4075.m12263();
                    C3683.m11222();
                    iM6981 = (C2105.m6981("ۘܳ") ^ i2) * (-13);
                    i4 = ((iM6981 ^ i3) * 12215) ^ 66996438;
                    i5 = 1835742149;
                    break;
                default:
                    C2272.m7503();
                    if (C0630.f2410 > 0) {
                        iM6981 = (C2105.m6981("ۜ᩻") + i3) * (-101);
                        i4 = ((iM6981 ^ i2) * (-11155)) ^ 1956324977;
                        i5 = 1244102243;
                    } else {
                        iM6981 = (C2105.m6981("ۘܳ") ^ i2) * (-13);
                        i4 = ((iM6981 ^ i3) * 12215) ^ 66996438;
                        i5 = 1835742149;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        ActivityC13676 activityC13676 = null;
        int i = -112336228;
        int i2 = RunnableC1937.f6483;
        int i3 = C4263.f13799;
        int iM6981 = (C2105.m6981("֨ۜ") ^ i2) * (-121);
        int i4 = ((iM6981 ^ i3) * 23185) ^ (-582176411);
        int i5 = 514376614;
        while (true) {
            i = ((((i ^ i3) * 24585) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2012263250:
                case 1813300882:
                    C3746.m11369();
                    C22628.m50615();
                    break;
                case -1985827146:
                case 1357996374:
                    activityC13676 = this.f73739;
                    if (C2167.f7158 >= 0) {
                        iM6981 = C2105.m6981("᩵۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-23793)) ^ 1835051566;
                        i5 = -1436235429;
                    } else {
                        iM6981 = (C0630.m2566("֫ᩴ") ^ i2) * 21;
                        i4 = ((iM6981 ^ i3) * 12113) ^ (-342181491);
                        i5 = 1213272388;
                    }
                    break;
                case -1965961373:
                case -1110254887:
                    if (C4616.m13552() != 0) {
                        iM6981 = C2105.m6981("᩵۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-23793)) ^ 1835051566;
                        i5 = -1436235429;
                    } else {
                        iM6981 = C2105.m6981("᩺ۙ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 27189) ^ 645591057;
                        i5 = 807665479;
                    }
                    break;
                case -1439246896:
                case 2055383351:
                    if (C1294.m4372() <= 0) {
                        iM6981 = C2105.m6981("᩷ۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-30433)) ^ 878677458;
                        i5 = 230258511;
                    } else {
                        iM6981 = (C0630.m2566("ۨ۠") ^ i2) * 35;
                        i4 = ((iM6981 ^ i3) * (-19021)) ^ (-1895998297);
                        i5 = -873159463;
                    }
                    break;
                case -1431755893:
                case 545171140:
                    if (C2126.f7087) {
                        iM6981 = C2105.m6981("ۖ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1645)) ^ (-1681799563);
                        i5 = 803051195;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ᩴۚ")) * (-39);
                        i4 = ((iM6981 ^ i3) * (-7189)) ^ 1163294441;
                        i5 = -1643989619;
                    }
                    break;
                case -1103195301:
                case -680367114:
                    if (C1047.f3863 >= 0) {
                        iM6981 = C2105.m6981("۟ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32425)) ^ (-223031809);
                        i5 = -677149503;
                    } else {
                        iM6981 = C0630.m2566("᩵ᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 28893) ^ 1085543568;
                        i5 = -34318554;
                    }
                    break;
                case -1074681733:
                case 892780977:
                    C4075.m12246(activityC13676, exc, null);
                    break;
                case -469798434:
                case 1867297058:
                    C1047.m3599();
                    if (C0050.f910 >= 0) {
                        iM6981 = C2105.m6981("᩷ۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-30433)) ^ 878677458;
                        i5 = 230258511;
                    } else {
                        iM6981 = C0630.m2566("᩵ᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 28893) ^ 1085543568;
                        i5 = -34318554;
                    }
                    break;
                case 75296240:
                case 1598000736:
                    if (RunnableC3474.m10630()) {
                        iM6981 = C0630.m2566("֨ۘ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 8445) ^ (-1133202381);
                        i5 = 305064226;
                    } else {
                        iM6981 = C0630.m2566("᩵ᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 28893) ^ 1085543568;
                        i5 = -34318554;
                    }
                    break;
                case 355177332:
                case 1980946571:
                    if (C7811.m20844() != 0) {
                        iM6981 = C2105.m6981("۟ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32425)) ^ (-223031809);
                        i5 = -677149503;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ܽ۠")) * (-91);
                        i4 = ((iM6981 ^ i2) * (-22327)) ^ (-1770179132);
                        i5 = 1139881309;
                    }
                    break;
                case 592778674:
                case 972890479:
                    if (C1128.f4106 <= 0) {
                        iM6981 = C2105.m6981("᩷ۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-30433)) ^ 878677458;
                        i5 = 230258511;
                    } else {
                        iM6981 = (i2 - C0630.m2566("ۗ֫")) * (-71);
                        i4 = ((iM6981 ^ i3) * (-15733)) ^ (-750054680);
                        i5 = -1580299238;
                    }
                    break;
                case 734523484:
                case 1428708366:
                    if (C2272.f7362) {
                        iM6981 = C2105.m6981("᩵۬") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-23793)) ^ 1835051566;
                        i5 = -1436235429;
                    } else {
                        iM6981 = C0630.m2566("᩵᩶") ^ i3;
                        i4 = ((iM6981 ^ i2) * 6811) ^ (-1291367157);
                        i5 = -1987199664;
                    }
                    break;
                case 938454596:
                case 1489259561:
                    if (C5695.m16023() >= 0) {
                        iM6981 = C2105.m6981("۟ܶ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-32425)) ^ (-223031809);
                        i5 = -677149503;
                    } else {
                        iM6981 = (C2105.m6981("ۚۡ") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM6981 ^ i2) * 2435) ^ (-1115531450);
                        i5 = 511429617;
                    }
                    break;
                case 971400503:
                case 1137858059:
                    C1128.m3851();
                    iM6981 = C0630.m2566("᩵ᩳ") ^ i2;
                    i4 = ((iM6981 ^ i3) * 28893) ^ 1085543568;
                    i5 = -34318554;
                    break;
                case 998518118:
                case 1231807603:
                    if (!C3663.f11553) {
                        iM6981 = C2105.m6981("᩷ۧ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-30433)) ^ 878677458;
                        i5 = 230258511;
                    } else {
                        iM6981 = C2105.m6981("ۖ۠") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-1645)) ^ (-1681799563);
                        i5 = 803051195;
                    }
                    break;
                default:
                    if (C1128.f4106 <= 0) {
                        iM6981 = C0630.m2566("᩵ᩳ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 28893) ^ 1085543568;
                        i5 = -34318554;
                    } else {
                        iM6981 = C2105.m6981("ۗ᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * 22685) ^ (-1882398793);
                        i5 = 1689102079;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f73738.run();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C0237.m1487(this);
    }
}
