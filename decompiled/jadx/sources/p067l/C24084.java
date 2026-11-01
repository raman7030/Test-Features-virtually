package p067l;

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
public final class C24084 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۧ֨᩷, reason: not valid java name and contains not printable characters */
    private static final short[] f83038 = {2985, 10955, 2781, 9184};

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ RunnableC20062 f76469;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC15366 f76470;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ List f76471;

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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        int iM55680;
        int i;
        int i2;
        int i3 = C1229.f82066;
        int i4 = C0873.f81841;
        int iM55979 = C0946.m55979("ۡۢ") ^ i3;
        int i5 = ((iM55979 ^ i4) * (-6393)) ^ (-1733357848);
        String strM56373 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55979 ^ 1539576319;
        ActivityC15366 activityC15366 = null;
        int iM55681 = 0;
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
                    if (C1048.f81963) {
                        iM55680 = C0946.m55979("ۨۘ") ^ i4;
                        i = ((iM55680 ^ i3) * 3255) ^ (-1920954042);
                        i2 = -2063062578;
                    } else {
                        iM55680 = C0946.m55979("ܳܺ") ^ i3;
                        i = ((iM55680 ^ i4) * (-1729)) ^ (-1056441238);
                        i2 = -929296728;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1592384130:
                case -703466621:
                    C1036.m56257();
                    if (ServiceConnectionC1013.m56157() > 0) {
                        iM55680 = C0946.m55979("ܳܺ") ^ i3;
                        i = ((iM55680 ^ i4) * (-1729)) ^ (-1056441238);
                        i2 = -929296728;
                    } else {
                        iM55680 = C0873.m55680("ۙۢ") ^ i3;
                        i = ((iM55680 ^ i4) * 20847) ^ (-1554071224);
                        i2 = 349303639;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1524261906:
                case 1987376844:
                    s = sArr[c];
                    if (C0894.m55769() >= 0) {
                        iM55680 = (C0873.m55680("֨֡") + i3) * 51;
                        i = ((iM55680 ^ i4) * 4071) ^ (-549673418);
                        i2 = 1306796902;
                    } else {
                        iM55680 = C0946.m55979("᩸ᩴ") ^ i4;
                        i = ((iM55680 ^ i3) * 20495) ^ 854149407;
                        i2 = 1288485516;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1490005256:
                case 2037132680:
                    C0890.m55740();
                    if (C1036.m56257() > 0) {
                        iM55680 = (C0873.m55680("֨֡") + i3) * 51;
                        i = ((iM55680 ^ i4) * 4071) ^ (-549673418);
                        i2 = 1306796902;
                    } else {
                        iM55680 = C0946.m55979("ۨۘ") ^ i4;
                        i = ((iM55680 ^ i3) * 3255) ^ (-1920954042);
                        i2 = -2063062578;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1191110199:
                case 1397559908:
                    m22243(activityC15366, iM55681 ^ i7);
                    break;
                case -1093026471:
                case 1267983471:
                    i9 = i8 + 1;
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0946.m55979("ۘۘ") + i4) * 61;
                        i = ((iM55680 ^ i3) * 15537) ^ 744805092;
                        i2 = 1246544173;
                    } else {
                        iM55680 = C0873.m55680("ۘۙ") ^ i3;
                        i = ((iM55680 ^ i4) * 10487) ^ (-144749430);
                        i2 = -1510965260;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1039160776:
                case 335569330:
                    s2 = 1;
                    if (C0894.f81854 >= 0) {
                        iM55680 = C0946.m55979("ܳܺ") ^ i3;
                        i = ((iM55680 ^ i4) * (-1729)) ^ (-1056441238);
                        i2 = -929296728;
                    } else {
                        iM55680 = C0946.m55979("۟ܺ") ^ i4;
                        i = ((iM55680 ^ i3) * 23663) ^ (-1901573953);
                        i2 = -1757547482;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1038760982:
                case 663567448:
                    i10 = 29033;
                    iM55680 = (i3 - C0946.m55979("᩵ܳ")) * 35;
                    i = ((iM55680 ^ i4) * (-17263)) ^ (-2119788975);
                    i2 = 717904282;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -846346405:
                case 444732610:
                    int i13 = s + s2;
                    if ((i13 * i13) - i9 >= 0) {
                        iM55680 = (i3 - C0946.m55979("ۡۡ")) * 69;
                        i = ((iM55680 ^ i4) * 6521) ^ (-588255825);
                        i2 = -769332261;
                    } else {
                        iM55680 = C0946.m55979("ۖ۬") ^ i4;
                        i = ((iM55680 ^ i3) * 20333) ^ 1674709736;
                        i2 = 344535396;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -743733205:
                case 1502034478:
                    i11 = 1;
                    if (C0906.f81862 >= 0) {
                        iM55680 = C0946.m55979("ܳܺ") ^ i3;
                        i = ((iM55680 ^ i4) * (-1729)) ^ (-1056441238);
                        i2 = -929296728;
                    } else {
                        iM55680 = C0946.m55979("۠ܽ") ^ i3;
                        i = ((iM55680 ^ i4) * (-30703)) ^ 846047227;
                        i2 = -126659219;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -592283130:
                case 1952389902:
                    c = 0;
                    if (C0992.m56107() <= 0) {
                        iM55680 = C0946.m55979("ܳܺ") ^ i3;
                        i = ((iM55680 ^ i4) * (-1729)) ^ (-1056441238);
                        i2 = -929296728;
                    } else {
                        iM55680 = (C0873.m55680("᩺ۧ") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM55680 ^ i3) * (-6197)) ^ (-299650104);
                        i2 = 1275880919;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -541582728:
                case 1698388345:
                    C0854.m55595();
                    C0866.m55645();
                    iM55680 = (C0873.m55680("֨֡") + i3) * 51;
                    i = ((iM55680 ^ i4) * 4071) ^ (-549673418);
                    i2 = 1306796902;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -525550339:
                case 2041807681:
                    activityC15366 = this.f76470;
                    sArr2 = f83038;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = (C0873.m55680("֨֡") + i3) * 51;
                        i = ((iM55680 ^ i4) * 4071) ^ (-549673418);
                        i2 = 1306796902;
                    } else {
                        iM55680 = C0873.m55680("ۖ۠") ^ i4;
                        i = ((iM55680 ^ i3) * 645) ^ 816979314;
                        i2 = -1994670681;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -365688679:
                case 1680252049:
                    sArr = f83038;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = (C0946.m55979("ۘۘ") + i4) * 61;
                        i = ((iM55680 ^ i3) * 15537) ^ 744805092;
                        i2 = 1246544173;
                    } else {
                        iM55680 = (i3 - C0873.m55680("᩶ܰ")) * 15;
                        i = ((iM55680 ^ i4) * (-2097)) ^ 275771331;
                        i2 = 414451725;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -65558278:
                case 377428790:
                    i8 = s * 2;
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = (C0946.m55979("ۘۘ") + i4) * 61;
                        i = ((iM55680 ^ i3) * 15537) ^ 744805092;
                        i2 = 1246544173;
                    } else {
                        iM55680 = C0946.m55979("ܰᩳ") ^ i3;
                        i = ((iM55680 ^ i4) * (-16251)) ^ (-157869956);
                        i2 = -94119829;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 889593464:
                case 2084410227:
                    iM55681 = C0873.m55680(strM56373);
                    i7 = 2121613477;
                    if (C0992.m56107() <= 0) {
                        iM55680 = C0946.m55979("ۨۘ") ^ i4;
                        i = ((iM55680 ^ i3) * 3255) ^ (-1920954042);
                        i2 = -2063062578;
                    } else {
                        iM55680 = C0873.m55680("ܽܽ") ^ i4;
                        i = ((iM55680 ^ i3) * 31353) ^ (-103554892);
                        i2 = -474934993;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 1056930214:
                case 1213233786:
                    C1964.m56597();
                    C1044.m56286();
                    break;
                case 1233341559:
                case 1346099088:
                    strM56373 = C1124.m56373(sArr2, i11, 3, i10);
                    if (C1404.m56468()) {
                        iM55680 = C0946.m55979("ۛܿ") ^ i4;
                        i = ((iM55680 ^ i3) * 32027) ^ (-857915956);
                        i2 = 646817777;
                    } else {
                        iM55680 = C0946.m55979("ۨۘ") ^ i4;
                        i = ((iM55680 ^ i3) * 3255) ^ (-1920954042);
                        i2 = -2063062578;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    i10 = 9461;
                    iM55680 = (i3 - C0946.m55979("᩵ܳ")) * 35;
                    i = ((iM55680 ^ i4) * (-17263)) ^ (-2119788975);
                    i2 = 717904282;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        ActivityC15366 activityC15366 = null;
        AbstractC17043 abstractC17043 = null;
        String strM38647 = null;
        EnumC15361[] enumC15361Arr = null;
        EnumC15361 enumC15361 = null;
        char c = 0;
        C22739 c22739M16894 = null;
        Iterator itM55925 = null;
        C10674 c10674 = null;
        int i = 722707339;
        int i2 = C0877.f81843;
        int i3 = C0992.f81922;
        int iM55979 = (i3 - C0946.m55979("ۗܶ")) * (-15);
        int i4 = ((iM55979 ^ i2) * 4309) ^ (-213418338);
        int i5 = 664466716;
        while (true) {
            i = ((((i ^ i2) * (-16955)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -1824248128:
                case -591360538:
                    C0866.m55645();
                    if (C1046.f81962 > 0) {
                        iM55979 = (i2 - C0873.m55680("۠᩺")) * 11;
                        i4 = ((iM55979 ^ i3) * (-10547)) ^ (-247023594);
                        i5 = 627036334;
                    } else {
                        iM55979 = C0946.m55979("֡᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14035) ^ (-205602720);
                        i5 = -959982295;
                    }
                    break;
                case -1733161838:
                case 2139827974:
                    enumC15361 = EnumC15361.OrderedField;
                    c = 0;
                    if (C0898.f81858 <= 0) {
                        iM55979 = (i2 - C0873.m55680("ۧᩳ")) * 21;
                        i4 = ((iM55979 ^ i3) * 11213) ^ 610426263;
                        i5 = 1890182755;
                    } else {
                        iM55979 = (C0946.m55979("۫֡") ^ i3) * 57;
                        i4 = ((iM55979 ^ i2) * (-13447)) ^ (-696396658);
                        i5 = 1509401811;
                    }
                    break;
                case -1565741684:
                case 575439497:
                    abstractC17043 = activityC15366.f43905;
                    if (RunnableC1014.m56177()) {
                        iM55979 = C0873.m55680("ۤ۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-29719)) ^ (-1887196087);
                        i5 = -1073717467;
                    } else {
                        iM55979 = C0946.m55979("֡᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14035) ^ (-205602720);
                        i5 = -959982295;
                    }
                    break;
                case -1323596571:
                case -545405128:
                    enumC15361Arr[c] = enumC15361;
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0873.m55680("᩸ܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 29543) ^ (-170846714);
                        i5 = 664390534;
                    } else {
                        iM55979 = C0946.m55979("֫ᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-3289)) ^ (-1749315777);
                        i5 = 1097562536;
                    }
                    break;
                case -1006984881:
                case 873412285:
                    activityC15366 = this.f76470;
                    if (C0863.m55643()) {
                        iM55979 = (C0873.m55680("ܳ֨") ^ i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM55979 ^ i2) * 27853) ^ 1745028700;
                        i5 = -2135567501;
                    } else {
                        iM55979 = C0873.m55680("ۚ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 325) ^ 1048730499;
                        i5 = 282602977;
                    }
                    break;
                case -995973746:
                case 1039047602:
                    activityC15366.f43905.m38668(c22739M16894.mo16897());
                    break;
                case -934204396:
                case 1313839536:
                    strM38647 = abstractC17043.m38647();
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0946.m55979("֡᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14035) ^ (-205602720);
                        i5 = -959982295;
                    } else {
                        iM55979 = (i2 - C0873.m55680("۠ܽ")) * 51;
                        i4 = ((iM55979 ^ i3) * (-19677)) ^ (-1249894152);
                        i5 = 671001222;
                    }
                    break;
                case -925420719:
                case -902071859:
                    C1964.m56597();
                    if (!C0927.f81875) {
                        iM55979 = C0873.m55680("ۚ᩷") ^ i3;
                        i4 = ((iM55979 ^ i2) * 325) ^ 1048730499;
                        i5 = 282602977;
                    } else {
                        iM55979 = C0946.m55979("֡᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14035) ^ (-205602720);
                        i5 = -959982295;
                    }
                    break;
                case -819680867:
                case 1180666529:
                    c22739M16894 = AbstractC7316.m16894(strM38647, enumC15361Arr);
                    itM55925 = RunnableC0938.m55925(this.f76471);
                    iM55979 = C0873.m55680("᩹ۘ") ^ i2;
                    i4 = ((iM55979 ^ i3) * 26939) ^ (-37378138);
                    i5 = -686687307;
                    break;
                case -625375582:
                case 443757210:
                    if (C0930.m55885() <= 0) {
                        iM55979 = (i2 - C0873.m55680("۠᩺")) * 11;
                        i4 = ((iM55979 ^ i3) * (-10547)) ^ (-247023594);
                        i5 = 627036334;
                    } else {
                        iM55979 = (C0946.m55979("֨ۡ") + i2) * 63;
                        i4 = ((iM55979 ^ i3) * 17973) ^ 406176237;
                        i5 = -637802527;
                    }
                    break;
                case -597712181:
                case 1532847620:
                    if (C0892.m55749()) {
                        iM55979 = C0873.m55680("ܶۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 17801) ^ (-875650487);
                        i5 = 2105276015;
                    } else {
                        iM55979 = C0873.m55680("᩸ܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 29543) ^ (-170846714);
                        i5 = 664390534;
                    }
                    break;
                case -214693351:
                case -122639642:
                    if (C1929.f83011 != 0) {
                        iM55979 = (i2 - C0873.m55680("۠᩺")) * 11;
                        i4 = ((iM55979 ^ i3) * (-10547)) ^ (-247023594);
                        i5 = 627036334;
                    } else {
                        iM55979 = (C0946.m55979("۠ۤ") + i3) * 99;
                        i4 = ((iM55979 ^ i2) * 29649) ^ 600330486;
                        i5 = 203143961;
                    }
                    break;
                case -42382644:
                case 507509951:
                    C0949.m56012();
                    iM55979 = C0946.m55979("֡᩸") ^ i2;
                    i4 = ((iM55979 ^ i3) * 14035) ^ (-205602720);
                    i5 = -959982295;
                    break;
                case 379466542:
                case 2120804294:
                    enumC15361Arr = new EnumC15361[1];
                    if (C0877.f81843 >= 0) {
                        iM55979 = (i2 - C0873.m55680("ۧᩳ")) * 21;
                        i4 = ((iM55979 ^ i3) * 11213) ^ 610426263;
                        i5 = 1890182755;
                    } else {
                        iM55979 = C0873.m55680("ۢ۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * 20475) ^ 1651528548;
                        i5 = -1842709813;
                    }
                    break;
                case 530208205:
                case 1216874435:
                    C0873.m55678();
                    break;
                case 628213463:
                case 1499323095:
                    if (C0866.m55647(itM55925)) {
                        iM55979 = C0946.m55979("ۘۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-4511)) ^ 495623136;
                        i5 = -1468112373;
                    } else {
                        iM55979 = (i3 - C0946.m55979("۬ܰ")) * 93;
                        i4 = ((iM55979 ^ i2) * 4429) ^ 1370812305;
                        i5 = 1857032270;
                    }
                    break;
                case 640787231:
                case 663924379:
                    c10674 = (C10674) C0955.m56035(itM55925);
                    if (c10674.f29536 != null) {
                        iM55979 = C0873.m55680("ۗ֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * 29895) ^ (-1208663614);
                        i5 = -1072943628;
                    } else {
                        iM55979 = C0873.m55680("᩹ۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 26939) ^ (-37378138);
                        i5 = -686687307;
                    }
                    break;
                case 753644484:
                case 939787023:
                    if (C0854.m55595() >= 0) {
                        iM55979 = C0873.m55680("᩸ܳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 29543) ^ (-170846714);
                        i5 = 664390534;
                    } else {
                        iM55979 = C0946.m55979("֡᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * 14035) ^ (-205602720);
                        i5 = -959982295;
                    }
                    break;
                case 766344622:
                case 1035720029:
                    c22739M16894.m50886(c10674.m24566(), c10674.f29536);
                    iM55979 = C0873.m55680("᩹ۘ") ^ i2;
                    i4 = ((iM55979 ^ i3) * 26939) ^ (-37378138);
                    i5 = -686687307;
                    break;
                default:
                    if (C0946.m55980() != 0) {
                        iM55979 = (i2 - C0873.m55680("۠᩺")) * 11;
                        i4 = ((iM55979 ^ i3) * (-10547)) ^ (-247023594);
                        i5 = 627036334;
                    } else {
                        iM55979 = C0873.m55680("᩷ۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 5325) ^ 375437103;
                        i5 = 1326325571;
                    }
                    break;
            }
            return;
        }
    }

    public C24084(ActivityC15366 activityC15366, ArrayList arrayList, RunnableC20062 runnableC20062) {
        int i = -522836681;
        int i2 = C1404.f82149;
        int i3 = C1044.f81959;
        this.f76470 = activityC15366;
        this.f76471 = arrayList;
        this.f76469 = runnableC20062;
        int iM55979 = (C0946.m55979("֡ۜ") ^ i2) * (-117);
        int i4 = ((iM55979 ^ i3) * 4071) ^ 1056534053;
        int i5 = -455758339;
        while (true) {
            i = (iM55979 ^ i5) ^ (i4 & (((i ^ i3) * 12873) >> 31));
            switch (i) {
                case -2021353978:
                case 633395486:
                    return;
                case -1964491801:
                case 681257516:
                    C0873.m55678();
                    if (C0955.f81898) {
                        iM55979 = C0873.m55680("ܳۙ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 19269) ^ 806546305;
                        i5 = 952514246;
                    } else {
                        iM55979 = (C0946.m55979("ۘܳ") ^ i2) * (-13);
                        i4 = ((iM55979 ^ i3) * 12215) ^ 66996438;
                        i5 = 1835742149;
                    }
                    break;
                case -1641963881:
                case -320014340:
                    C0877.m55696();
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = (C0946.m55979("ۜ᩻") + i3) * (-101);
                        i4 = ((iM55979 ^ i2) * (-11155)) ^ 1956324977;
                        i5 = 1244102243;
                    } else {
                        iM55979 = C0873.m55680("ܺᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 28105) ^ 889196731;
                        i5 = -1177166966;
                    }
                    break;
                case -1098559770:
                case -329336048:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0946.m55979("᩷ۢ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 12671) ^ 322984218;
                        i5 = 45093236;
                    } else {
                        iM55979 = C0946.m55979("۟ۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-2117)) ^ 665231994;
                        i5 = 266296380;
                    }
                    break;
                case 472720749:
                case 1421483264:
                    C1046.m56302();
                    throw new RuntimeException();
                case 1032217282:
                case 2039800046:
                    C1044.m56286();
                    C1025.m56230();
                    iM55979 = (C0946.m55979("ۘܳ") ^ i2) * (-13);
                    i4 = ((iM55979 ^ i3) * 12215) ^ 66996438;
                    i5 = 1835742149;
                    break;
                default:
                    C0955.m56025();
                    if (C0873.f81841 > 0) {
                        iM55979 = (C0946.m55979("ۜ᩻") + i3) * (-101);
                        i4 = ((iM55979 ^ i2) * (-11155)) ^ 1956324977;
                        i5 = 1244102243;
                    } else {
                        iM55979 = (C0946.m55979("ۘܳ") ^ i2) * (-13);
                        i4 = ((iM55979 ^ i3) * 12215) ^ 66996438;
                        i5 = 1835742149;
                    }
                    break;
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        ActivityC15366 activityC15366 = null;
        int i = -112336228;
        int i2 = RunnableC0938.f81886;
        int i3 = C1053.f81965;
        int iM55979 = (C0946.m55979("֨ۜ") ^ i2) * (-121);
        int i4 = ((iM55979 ^ i3) * 23185) ^ (-582176411);
        int i5 = 514376614;
        while (true) {
            i = ((((i ^ i3) * 24585) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2012263250:
                case 1813300882:
                    C1028.m56247();
                    C1964.m56597();
                    break;
                case -1985827146:
                case 1357996374:
                    activityC15366 = this.f76470;
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0946.m55979("᩵۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-23793)) ^ 1835051566;
                        i5 = -1436235429;
                    } else {
                        iM55979 = (C0873.m55680("֫ᩴ") ^ i2) * 21;
                        i4 = ((iM55979 ^ i3) * 12113) ^ (-342181491);
                        i5 = 1213272388;
                    }
                    break;
                case -1965961373:
                case -1110254887:
                    if (C1071.m56343() != 0) {
                        iM55979 = C0946.m55979("᩵۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-23793)) ^ 1835051566;
                        i5 = -1436235429;
                    } else {
                        iM55979 = C0946.m55979("᩺ۙ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27189) ^ 645591057;
                        i5 = 807665479;
                    }
                    break;
                case -1439246896:
                case 2055383351:
                    if (C0906.m55809() <= 0) {
                        iM55979 = C0946.m55979("᩷ۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-30433)) ^ 878677458;
                        i5 = 230258511;
                    } else {
                        iM55979 = (C0873.m55680("ۨ۠") ^ i2) * 35;
                        i4 = ((iM55979 ^ i3) * (-19021)) ^ (-1895998297);
                        i5 = -873159463;
                    }
                    break;
                case -1431755893:
                case 545171140:
                    if (C0947.f81895) {
                        iM55979 = C0946.m55979("ۖ۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-1645)) ^ (-1681799563);
                        i5 = 803051195;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ᩴۚ")) * (-39);
                        i4 = ((iM55979 ^ i3) * (-7189)) ^ 1163294441;
                        i5 = -1643989619;
                    }
                    break;
                case -1103195301:
                case -680367114:
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0946.m55979("۟ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-32425)) ^ (-223031809);
                        i5 = -677149503;
                    } else {
                        iM55979 = C0873.m55680("᩵ᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 28893) ^ 1085543568;
                        i5 = -34318554;
                    }
                    break;
                case -1074681733:
                case 892780977:
                    C1044.m56272(activityC15366, exc, null);
                    break;
                case -469798434:
                case 1867297058:
                    C0894.m55769();
                    if (C0845.f81821 >= 0) {
                        iM55979 = C0946.m55979("᩷ۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-30433)) ^ 878677458;
                        i5 = 230258511;
                    } else {
                        iM55979 = C0873.m55680("᩵ᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 28893) ^ 1085543568;
                        i5 = -34318554;
                    }
                    break;
                case 75296240:
                case 1598000736:
                    if (RunnableC1014.m56177()) {
                        iM55979 = C0873.m55680("֨ۘ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 8445) ^ (-1133202381);
                        i5 = 305064226;
                    } else {
                        iM55979 = C0873.m55680("᩵ᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 28893) ^ 1085543568;
                        i5 = -34318554;
                    }
                    break;
                case 355177332:
                case 1980946571:
                    if (C1229.m56410() != 0) {
                        iM55979 = C0946.m55979("۟ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-32425)) ^ (-223031809);
                        i5 = -677149503;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ܽ۠")) * (-91);
                        i4 = ((iM55979 ^ i2) * (-22327)) ^ (-1770179132);
                        i5 = 1139881309;
                    }
                    break;
                case 592778674:
                case 972890479:
                    if (C0898.f81858 <= 0) {
                        iM55979 = C0946.m55979("᩷ۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-30433)) ^ 878677458;
                        i5 = 230258511;
                    } else {
                        iM55979 = (i2 - C0873.m55680("ۗ֫")) * (-71);
                        i4 = ((iM55979 ^ i3) * (-15733)) ^ (-750054680);
                        i5 = -1580299238;
                    }
                    break;
                case 734523484:
                case 1428708366:
                    if (C0955.f81898) {
                        iM55979 = C0946.m55979("᩵۬") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-23793)) ^ 1835051566;
                        i5 = -1436235429;
                    } else {
                        iM55979 = C0873.m55680("᩵᩶") ^ i3;
                        i4 = ((iM55979 ^ i2) * 6811) ^ (-1291367157);
                        i5 = -1987199664;
                    }
                    break;
                case 938454596:
                case 1489259561:
                    if (C1124.m56367() >= 0) {
                        iM55979 = C0946.m55979("۟ܶ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-32425)) ^ (-223031809);
                        i5 = -677149503;
                    } else {
                        iM55979 = (C0946.m55979("ۚۡ") ^ i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM55979 ^ i2) * 2435) ^ (-1115531450);
                        i5 = 511429617;
                    }
                    break;
                case 971400503:
                case 1137858059:
                    C0898.m55800();
                    iM55979 = C0873.m55680("᩵ᩳ") ^ i2;
                    i4 = ((iM55979 ^ i3) * 28893) ^ 1085543568;
                    i5 = -34318554;
                    break;
                case 998518118:
                case 1231807603:
                    if (!C1024.f81946) {
                        iM55979 = C0946.m55979("᩷ۧ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-30433)) ^ 878677458;
                        i5 = 230258511;
                    } else {
                        iM55979 = C0946.m55979("ۖ۠") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-1645)) ^ (-1681799563);
                        i5 = 803051195;
                    }
                    break;
                default:
                    if (C0898.f81858 <= 0) {
                        iM55979 = C0873.m55680("᩵ᩳ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 28893) ^ 1085543568;
                        i5 = -34318554;
                    } else {
                        iM55979 = C0946.m55979("ۗ᩸") ^ i3;
                        i4 = ((iM55979 ^ i2) * 22685) ^ (-1882398793);
                        i5 = 1689102079;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f76469.run();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C0854.m55601(this);
    }
}
