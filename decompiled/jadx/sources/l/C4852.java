package l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۙ᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4852 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ᩻֫᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f15327 = {3837, 21379, 21388, 21387, 21391, 21379, 21398, 21387, 21389, 21388, 7919, -13829, -13836, -13837, -13833, -13829, -13842, -13837, -13835, -13836, 23983, -20012, 22917, -22637, 19851, -22579, -25445, 16634, -25653, 22645, 22326, 21736, -26086, 19276, -23143, -16698, -23701, -18713, -30984, 23174, -22221, -18618, 18004, -28113, 7486, 26557, 26546, 26549, 26545, 26557, 26536, 26549, 26547, 26546, 993, -12198, -12203, -12206, -12202, -12198, -12209, -12206, -12204, -12203};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ObjectAnimator f15328;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC3441 f15329;

    /* JADX WARN: Code duplicated, block: B:57:0x01ac A[PHI: r0 r4
      0x01ac: PHI (r0v4 short[]) = (r0v3 short[]), (r0v1 short[]), (r0v1 short[]) binds: [B:56:0x01aa, B:44:0x014a, B:11:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x01ac: PHI (r4v4 int) = (r4v1 int), (r4v3 int), (r4v1 int) binds: [B:56:0x01aa, B:44:0x014a, B:11:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01e1 A[PHI: r7 r8
      0x01e1: PHI (r7v3 short[]) = (r7v1 short[]), (r7v2 short[]), (r7v1 short[]) binds: [B:60:0x01df, B:29:0x00b5, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x01e1: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int) binds: [B:60:0x01df, B:29:0x00b5, B:15:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x020c A[PHI: r1
      0x020c: PHI (r1v3 char) = (r1v2 char), (r1v1 char), (r1v1 char) binds: [B:52:0x018b, B:10:0x0041, B:6:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x023c A[PHI: r2 r3 r5
      0x023c: PHI (r2v3 short) = (r2v1 short), (r2v2 short), (r2v1 short) binds: [B:66:0x023a, B:48:0x016d, B:40:0x0129] A[DONT_GENERATE, DONT_INLINE]
      0x023c: PHI (r3v3 int) = (r3v1 int), (r3v2 int), (r3v1 int) binds: [B:66:0x023a, B:48:0x016d, B:40:0x0129] A[DONT_GENERATE, DONT_INLINE]
      0x023c: PHI (r5v2 short) = (r5v1 short), (r5v1 short), (r5v3 short) binds: [B:66:0x023a, B:48:0x016d, B:40:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (l.C3663.m11168() < 0) goto L10;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAnimationCancel(Animator animator) {
        int iM2566;
        int i;
        int i2;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 504097618;
        int i9 = AbstractC2021.f6743;
        int i10 = C1128.f4106;
        int iM6981 = (i9 - C2105.m6981("ۘۨ")) * (-69);
        int i11 = ((iM6981 ^ i10) * (-19927)) ^ 1497696345;
        int i12 = iM6981 ^ 130013628;
        while (true) {
            i8 = ((((i8 ^ i10) * (-28027)) >> 31) & i11) ^ i12;
            switch (i8) {
                case -2051967394:
                case 1010665187:
                    s2 = 23230;
                    if (C2126.m7040()) {
                        iM2566 = C2105.m6981("᩹᩹") ^ i10;
                        i = ((iM2566 ^ i9) * (-29627)) ^ (-15256016);
                        i2 = 957457333;
                    } else {
                        iM2566 = C2105.m6981("᩶ۨ") ^ i9;
                        i = ((iM2566 ^ i10) * 20821) ^ (-1211589922);
                        i2 = -1023296142;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1959913150:
                case 610336604:
                    sArr = f15327;
                    if (C1916.f6442) {
                        iM2566 = (i9 - C0630.m2566("۬ۙ")) * (-103);
                        i = ((iM2566 ^ i10) * 2823) ^ (-606664676);
                        i2 = -1815030351;
                    } else {
                        iM2566 = (C0630.m2566("ܺۧ") + i9) * 99;
                        i = ((iM2566 ^ i10) * (-13785)) ^ (-146635104);
                        i2 = 284757628;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1799896276:
                case -807565148:
                    if (C0050.m940() > 0) {
                        iM2566 = (i10 - C0630.m2566("ᩴۨ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2566 ^ i9) * (-16113)) ^ 563551034;
                        i2 = -1792454356;
                        i12 = iM2566 ^ i2;
                        i11 = i;
                    }
                    iM2566 = C0630.m2566("ܿ۫") ^ i9;
                    i = ((iM2566 ^ i10) * (-28999)) ^ (-1057404361);
                    i2 = -19212253;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1792444604:
                case 1249071876:
                    i4 = 134908225 + i3;
                    if (C2520.f8000 >= 0) {
                        iM2566 = (C0630.m2566("ܺۧ") + i9) * 99;
                        i = ((iM2566 ^ i10) * (-13785)) ^ (-146635104);
                        i2 = 284757628;
                    } else {
                        iM2566 = (i10 - C0630.m2566("ᩴۧ")) * (-43);
                        i = ((iM2566 ^ i9) * 7075) ^ (-1051178541);
                        i2 = -1369432358;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1784759391:
                case -244330453:
                    i5 = 5145;
                    iM2566 = C0630.m2566("ᩳۗ") ^ i9;
                    i = ((iM2566 ^ i10) * (-3699)) ^ (-202546679);
                    i2 = 1063759007;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1784149565:
                case -1735036112:
                    if (i4 - (s * s2) >= 0) {
                        iM2566 = C2105.m6981("ۛ۫") ^ i9;
                        i = ((iM2566 ^ i10) * (-20861)) ^ 244143219;
                        i2 = 1075013220;
                    } else {
                        iM2566 = (i10 - C0630.m2566("ܰۖ")) * (-57);
                        i = ((iM2566 ^ i9) * 12935) ^ (-225587599);
                        i2 = -1890329137;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1610133834:
                case 1936236024:
                    i7 = 9;
                    if (C2272.f7362) {
                        iM2566 = C0630.m2566("ܿ۫") ^ i9;
                        i = ((iM2566 ^ i10) * (-28999)) ^ (-1057404361);
                        i2 = -19212253;
                    } else {
                        iM2566 = (C2105.m6981("ۜ۫") ^ i10) * 13;
                        i = ((iM2566 ^ i9) * 16697) ^ 755459383;
                        i2 = 1343185177;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1543666499:
                case -962346795:
                    if (C3663.f11553) {
                        iM2566 = C2105.m6981("᩹᩹") ^ i10;
                        i = ((iM2566 ^ i9) * (-29627)) ^ (-15256016);
                        i2 = 957457333;
                    } else {
                        iM2566 = (C0630.m2566("֫ۖ") ^ i10) * (-31);
                        i = ((iM2566 ^ i9) * 9441) ^ (-1229451847);
                        i2 = -1445961005;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1469009876:
                case 155308756:
                    C0964.m3413();
                    C0964.m3413();
                    iM2566 = C2105.m6981("ܰ᩹") ^ i9;
                    i = ((iM2566 ^ i10) * (-1005)) ^ 300251156;
                    i2 = 812574855;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1434495479:
                case -1301705577:
                    c = 0;
                    if (C1773.f6144 <= 0) {
                        iM2566 = C2105.m6981("ܰ᩹") ^ i9;
                        i = ((iM2566 ^ i10) * (-1005)) ^ 300251156;
                        i2 = 812574855;
                    } else {
                        iM2566 = C0630.m2566("ܺۖ") ^ i10;
                        i = ((iM2566 ^ i9) * (-24763)) ^ (-1033258687);
                        i2 = 10423768;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1416131566:
                case 1775114712:
                    sArr2 = f15327;
                    i6 = 1;
                    if (C1711.m5736() <= 0) {
                        iM2566 = (i10 - C0630.m2566("ᩴۨ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2566 ^ i9) * (-16113)) ^ 563551034;
                        i2 = -1792454356;
                    } else {
                        iM2566 = C0630.m2566("᩸᩵") ^ i10;
                        i = ((iM2566 ^ i9) * (-13305)) ^ (-1785944652);
                        i2 = -1468004477;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -774050638:
                case 1889433948:
                    if (C3537.f11231 >= 0) {
                        iM2566 = (i10 - C0630.m2566("ᩴۨ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2566 ^ i9) * (-16113)) ^ 563551034;
                        i2 = -1792454356;
                    } else {
                        iM2566 = C0630.m2566("ܿۛ") ^ i10;
                        i = ((iM2566 ^ i9) * 4043) ^ (-937914493);
                        i2 = 753147880;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -373188883:
                case 1051741826:
                    RunnableC0588.m2430(animator, C1711.m5726(sArr2, i6, i7, i5));
                    break;
                case -17090464:
                case 103069307:
                    C4616.m13552();
                    break;
                case 15647294:
                case 136047820:
                    s = sArr[c];
                    i3 = s * s;
                    if (C0483.f2088 >= 0) {
                        iM2566 = C2105.m6981("᩹᩹") ^ i10;
                        i = ((iM2566 ^ i9) * (-29627)) ^ (-15256016);
                        i2 = 957457333;
                    } else {
                        iM2566 = C0630.m2566("᩹ۘ") ^ i9;
                        i = ((iM2566 ^ i10) * 29713) ^ 694571572;
                        i2 = -1014971464;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case 381235863:
                case 1128257493:
                    i5 = 21474;
                    iM2566 = C0630.m2566("ᩳۗ") ^ i9;
                    i = ((iM2566 ^ i10) * (-3699)) ^ (-202546679);
                    i2 = 1063759007;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case 831974237:
                case 1836818106:
                    if (!C0422.m1963()) {
                        iM2566 = (C0630.m2566("ܺۧ") + i9) * 99;
                        i = ((iM2566 ^ i10) * (-13785)) ^ (-146635104);
                        i2 = 284757628;
                        i12 = iM2566 ^ i2;
                        i11 = i;
                    }
                    iM2566 = C2105.m6981("ܰ᩹") ^ i9;
                    i = ((iM2566 ^ i10) * (-1005)) ^ 300251156;
                    i2 = 812574855;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case 881835391:
                case 1724161613:
                    C3746.m11369();
                    C2126.m7040();
                    break;
                default:
                    if (C3432.m10477() <= 0) {
                        iM2566 = C2105.m6981("ܰ᩹") ^ i9;
                        i = ((iM2566 ^ i10) * (-1005)) ^ 300251156;
                        i2 = 812574855;
                    } else {
                        iM2566 = (C0630.m2566("֨᩶") + i9) * (-99);
                        i = ((iM2566 ^ i10) * 6341) ^ 1416358487;
                        i2 = 186780913;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        if (l.C1773.f6144 > 0) goto L15;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAnimationStart(Animator animator) {
        int i;
        int i2;
        int iM6981;
        int i3;
        int i4;
        int iM6982;
        int i5;
        int i6;
        int iM2566;
        int i7;
        int i8;
        int i9;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        short[] sArr = null;
        int i15 = 0;
        int i16 = 0;
        int i17 = 414240164;
        int i18 = C0422.f1886;
        int i19 = ServiceConnectionC3453.f10921;
        int iM2567 = (i18 - C0630.m2566("ۘᩴ")) * 123;
        int i20 = ((iM2567 ^ i19) * 2057) ^ 326501267;
        int i21 = iM2567 ^ (-161457731);
        short[] sArr2 = null;
        while (true) {
            i17 = i21 ^ (i20 & (((i17 ^ i19) * (-13557)) >> 31));
            switch (i17) {
                case -1899559224:
                case -1623486930:
                    C3683.m11210(animator, C2126.m7036(sArr, i15, i16, i14));
                    break;
                case -1796851008:
                case -257009517:
                    i2 = i11;
                    i10 = s + s2;
                    if (C0050.f910 >= 0) {
                        iM6982 = (i18 - C0630.m2566("ܳۚ")) * (-77);
                        i5 = ((iM6982 ^ i19) * (-1117)) ^ (-606047143);
                        i6 = -592107609;
                    } else {
                        iM6982 = C0630.m2566("ۨܳ") ^ i18;
                        i5 = ((iM6982 ^ i19) * (-13133)) ^ (-1260453778);
                        i6 = -1545907319;
                    }
                    i21 = iM6982 ^ i6;
                    i20 = i5;
                    i11 = i2;
                    break;
                case -1722220226:
                case -1321337348:
                    i = i10;
                    i2 = i11;
                    sArr2 = f15327;
                    if (C3683.f11629 < 0) {
                        iM6981 = (C2105.m6981("ܽ۬") ^ i19) * (-47);
                        i3 = ((iM6981 ^ i18) * 12829) ^ 1905301266;
                        i4 = -2008834023;
                        i21 = iM6981 ^ i4;
                        i20 = i3;
                        i11 = i2;
                        i10 = i;
                    } else {
                        i11 = i2;
                        iM2566 = C0630.m2566("ܶۗ") ^ i19;
                        i7 = ((iM2566 ^ i18) * (-327)) ^ (-1559547674);
                        i8 = -2005573871;
                        i21 = iM2566 ^ i8;
                        i20 = i7;
                        i10 = i;
                    }
                    break;
                case -1405422924:
                case -95466511:
                    C2958.m9034();
                    C0382.m1848();
                    break;
                case -1385471635:
                case -985625594:
                    i = i10;
                    i2 = i11;
                    if (C4263.f13799 > 0) {
                        iM6981 = C2105.m6981("᩺۬") ^ i18;
                        i3 = ((iM6981 ^ i19) * 32269) ^ (-989540315);
                        i4 = -2119075443;
                        i21 = iM6981 ^ i4;
                        i20 = i3;
                        i11 = i2;
                        i10 = i;
                    } else {
                        i10 = i;
                        iM6982 = (i18 - C0630.m2566("ܳۚ")) * (-77);
                        i5 = ((iM6982 ^ i19) * (-1117)) ^ (-606047143);
                        i6 = -592107609;
                        i21 = iM6982 ^ i6;
                        i20 = i5;
                        i11 = i2;
                    }
                    break;
                case -1326730916:
                case -1170671304:
                    i9 = 53307;
                    int iM6983 = C2105.m6981("۠֨") ^ i19;
                    int i22 = i9;
                    i21 = iM6983 ^ 134463211;
                    i20 = ((iM6983 ^ i18) * (-26671)) ^ (-1655372889);
                    i14 = i22;
                    break;
                case -1154429501:
                case -436667357:
                    i11 = i10 * i10;
                    i12 = s * s;
                    if (C11340.m28031()) {
                        iM2566 = (i19 - C0630.m2566("ۚۛ")) * 89;
                        i = i10;
                        i7 = ((iM2566 ^ i18) * 26249) ^ (-879437653);
                        i8 = 1823242100;
                    } else {
                        i = i10;
                        iM2566 = C0630.m2566("ܶۗ") ^ i19;
                        i7 = ((iM2566 ^ i18) * (-327)) ^ (-1559547674);
                        i8 = -2005573871;
                    }
                    i21 = iM2566 ^ i8;
                    i20 = i7;
                    i10 = i;
                    break;
                case -666763565:
                case 1456363313:
                    i = i10;
                    i2 = i11;
                    s = sArr2[c];
                    s2 = 2216;
                    if (C7106.m19120() <= 0) {
                        iM6981 = (i19 - C0630.m2566("ۘۚ")) * 27;
                        i3 = ((iM6981 ^ i18) * 4031) ^ (-19413024);
                        i4 = 1379220270;
                    } else {
                        iM6981 = C2105.m6981("ۜܶ") ^ i19;
                        i3 = ((iM6981 ^ i18) * 6931) ^ 2045071074;
                        i4 = 475625017;
                    }
                    i21 = iM6981 ^ i4;
                    i20 = i3;
                    i11 = i2;
                    i10 = i;
                    break;
                case -616730371:
                case -453734061:
                    sArr = f15327;
                    if (C1047.m3599() >= 0) {
                        i = i10;
                        i2 = i11;
                        i15 = 55;
                        iM6981 = (i18 - C0630.m2566("ܰܽ")) * (-97);
                        i3 = ((iM6981 ^ i19) * 24047) ^ 1028643609;
                        i4 = 2004986386;
                        i21 = iM6981 ^ i4;
                        i20 = i3;
                        i11 = i2;
                        i10 = i;
                    } else {
                        int iM6984 = (C2105.m6981("᩸ۖ") ^ i18) * (-111);
                        i21 = iM6984 ^ (-572830742);
                        i20 = ((iM6984 ^ i19) * 32579) ^ 1115618704;
                        i15 = 55;
                    }
                    break;
                case -557983994:
                case 251057466:
                    i = i10;
                    i2 = i11;
                    if (C2272.f7362) {
                        iM6981 = (i18 - C0630.m2566("ܰܽ")) * (-97);
                        i3 = ((iM6981 ^ i19) * 24047) ^ 1028643609;
                        i4 = 2004986386;
                    } else {
                        iM6981 = (C0630.m2566("ۤ᩶") ^ i19) * 73;
                        i3 = ((iM6981 ^ i18) * 22521) ^ (-1410131664);
                        i4 = 1462764788;
                    }
                    i21 = iM6981 ^ i4;
                    i20 = i3;
                    i11 = i2;
                    i10 = i;
                    break;
                case -486767926:
                case 1563897705:
                    if (C1773.f6144 > 0) {
                        i = i10;
                        iM2566 = C0630.m2566("ܶۗ") ^ i19;
                        i7 = ((iM2566 ^ i18) * (-327)) ^ (-1559547674);
                        i8 = -2005573871;
                        i21 = iM2566 ^ i8;
                        i20 = i7;
                        i10 = i;
                    } else {
                        int iM2568 = (i19 - C0630.m2566("ᩴۨ")) * (-53);
                        i21 = iM2568 ^ (-1269402955);
                        i20 = ((iM2568 ^ i18) * (-10519)) ^ 771035148;
                    }
                    break;
                case -479470416:
                case 1157830369:
                    C1916.m6308();
                    if (C4075.f12947 >= 0) {
                        i = i10;
                        i2 = i11;
                        iM6981 = (i18 - C0630.m2566("ܰܽ")) * (-97);
                        i3 = ((iM6981 ^ i19) * 24047) ^ 1028643609;
                        i4 = 2004986386;
                        i21 = iM6981 ^ i4;
                        i20 = i3;
                        i11 = i2;
                        i10 = i;
                    }
                    i = i10;
                    i2 = i11;
                    iM6981 = (i19 - C0630.m2566("ۘۚ")) * 27;
                    i3 = ((iM6981 ^ i18) * 4031) ^ (-19413024);
                    i4 = 1379220270;
                    i21 = iM6981 ^ i4;
                    i20 = i3;
                    i11 = i2;
                    i10 = i;
                    break;
                case -396572810:
                case 1686260736:
                    C2105.m6982();
                    C3746.m11369();
                    i = i10;
                    i2 = i11;
                    iM6981 = (i19 - C0630.m2566("ۘۚ")) * 27;
                    i3 = ((iM6981 ^ i18) * 4031) ^ (-19413024);
                    i4 = 1379220270;
                    i21 = iM6981 ^ i4;
                    i20 = i3;
                    i11 = i2;
                    i10 = i;
                    break;
                case -286751451:
                case 1164516168:
                    if (C3663.f11553) {
                        i = i10;
                        i2 = i11;
                        i16 = 9;
                        iM6981 = (i18 - C0630.m2566("ܰܽ")) * (-97);
                        i3 = ((iM6981 ^ i19) * 24047) ^ 1028643609;
                        i4 = 2004986386;
                        i21 = iM6981 ^ i4;
                        i20 = i3;
                        i11 = i2;
                        i10 = i;
                    } else {
                        int iM2569 = C0630.m2566("ۖۡ") ^ i18;
                        i21 = iM2569 ^ (-2016405532);
                        i20 = ((iM2569 ^ i19) * (-24489)) ^ 1562360784;
                        i16 = 9;
                    }
                    break;
                case -153090442:
                case 1415702546:
                    i = i10;
                    i2 = i11;
                    c = '6';
                    if (C0050.f910 < 0) {
                        iM6981 = C0630.m2566("۠ۙ") ^ i18;
                        i3 = ((iM6981 ^ i19) * (-11927)) ^ 1761828138;
                        i4 = -1062574549;
                        i21 = iM6981 ^ i4;
                        i20 = i3;
                        i11 = i2;
                        i10 = i;
                    } else {
                        i10 = i;
                        iM6982 = (i18 - C0630.m2566("ܳۚ")) * (-77);
                        i5 = ((iM6982 ^ i19) * (-1117)) ^ (-606047143);
                        i6 = -592107609;
                        i21 = iM6982 ^ i6;
                        i20 = i5;
                        i11 = i2;
                    }
                    break;
                case -122458722:
                case 224170947:
                    RunnableC1937.m6387();
                    break;
                case 39427944:
                case 267856483:
                    int i23 = i12 + i13;
                    if (i11 - (i23 + i23) > 0) {
                        iM6982 = (C2105.m6981("֨۠") + i19) * 85;
                        i2 = i11;
                        i5 = ((iM6982 ^ i18) * 8237) ^ (-1227483573);
                        i6 = -1957687151;
                    } else {
                        i2 = i11;
                        iM6982 = (C0630.m2566("֫ܺ") + i18) * (-53);
                        i5 = ((iM6982 ^ i19) * (-3489)) ^ (-1484497020);
                        i6 = 1830664296;
                    }
                    i21 = iM6982 ^ i6;
                    i20 = i5;
                    i11 = i2;
                    break;
                case 409961543:
                case 633400921:
                    i9 = 55244;
                    int iM6985 = C2105.m6981("۠֨") ^ i19;
                    int i24 = i9;
                    i21 = iM6985 ^ 134463211;
                    i20 = ((iM6985 ^ i18) * (-26671)) ^ (-1655372889);
                    i14 = i24;
                    break;
                default:
                    i2 = i11;
                    i13 = 4910656;
                    if (C7106.m19120() > 0) {
                        iM6982 = C2105.m6981("ۙۛ") ^ i18;
                        i5 = ((iM6982 ^ i19) * 21415) ^ 2018742062;
                        i6 = 387756608;
                        i21 = iM6982 ^ i6;
                        i20 = i5;
                        i11 = i2;
                    } else {
                        i = i10;
                        iM6981 = (i19 - C0630.m2566("ۘۚ")) * 27;
                        i3 = ((iM6981 ^ i18) * 4031) ^ (-19413024);
                        i4 = 1379220270;
                        i21 = iM6981 ^ i4;
                        i20 = i3;
                        i11 = i2;
                        i10 = i;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0162 A[PHI: r2 r3 r5
      0x0162: PHI (r2v3 short) = (r2v2 short), (r2v1 short) binds: [B:46:0x0160, B:38:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r3v3 int) = (r3v2 int), (r3v1 int) binds: [B:46:0x0160, B:38:0x0107] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r5v2 short) = (r5v1 short), (r5v3 short) binds: [B:46:0x0160, B:38:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01ea A[PHI: r0 r7 r8
      0x01ea: PHI (r0v4 short[]) = (r0v1 short[]), (r0v3 short[]), (r0v1 short[]), (r0v1 short[]) binds: [B:58:0x01e8, B:54:0x01c8, B:19:0x005c, B:6:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x01ea: PHI (r7v2 short[]) = (r7v1 short[]), (r7v1 short[]), (r7v1 short[]), (r7v4 short[]) binds: [B:58:0x01e8, B:54:0x01c8, B:19:0x005c, B:6:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x01ea: PHI (r8v2 int) = (r8v1 int), (r8v1 int), (r8v1 int), (r8v4 int) binds: [B:58:0x01e8, B:54:0x01c8, B:19:0x005c, B:6:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0235 A[PHI: r9
      0x0235: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:66:0x0233, B:62:0x0218, B:26:0x007e, B:11:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int iM2566;
        int i;
        int i2;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = -297494501;
        int i9 = C4117.f13076;
        int i10 = C3537.f11231;
        int iM2567 = (i9 - C0630.m2566("ۚۜ")) * 15;
        int i11 = ((iM2567 ^ i10) * (-32211)) ^ (-68844726);
        int i12 = iM2567 ^ 1397717962;
        while (true) {
            i8 = ((((i8 ^ i10) * (-18271)) >> 31) & i11) ^ i12;
            switch (i8) {
                case -2046165052:
                case 526990878:
                    if ((s * s2) - i4 > 0) {
                        iM2566 = (C2105.m6981("۬᩵") ^ i9) * 89;
                        i = ((iM2566 ^ i10) * 11721) ^ (-1601901062);
                        i2 = -1627432940;
                    } else {
                        iM2566 = (i10 - C0630.m2566("ۗ֨")) * (-41);
                        i = ((iM2566 ^ i9) * 11869) ^ 415326837;
                        i2 = -1784766945;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1894110291:
                case 1837170168:
                    sArr = f15327;
                    if (C1711.f5919) {
                        iM2566 = C2105.m6981("ܿ֫") ^ i9;
                        i = ((iM2566 ^ i10) * 7521) ^ (-1336885842);
                        i2 = -1317273852;
                    } else {
                        iM2566 = (C2105.m6981("᩵ܰ") + i9) * (-19);
                        i = ((iM2566 ^ i10) * (-20817)) ^ (-612197505);
                        i2 = 1392683156;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1876693874:
                case -599314479:
                    s = sArr[c];
                    i3 = s * s;
                    if (C3019.f9544 >= 0) {
                        iM2566 = (C2105.m6981("ۨܰ") ^ i10) * (-121);
                        i = ((iM2566 ^ i9) * 1203) ^ (-881428630);
                        i2 = -674842182;
                    } else {
                        iM2566 = (C0630.m2566("᩹ܿ") + i9) * (-101);
                        i = ((iM2566 ^ i10) * 20801) ^ 476056986;
                        i2 = 359222338;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1799656494:
                case -569024630:
                    i7 = 9;
                    if (C0798.f2919) {
                        iM2566 = (C2105.m6981("۫֨") + i9) * (-85);
                        i = ((iM2566 ^ i10) * 565) ^ (-1232886575);
                        i2 = 1675619659;
                    } else {
                        iM2566 = C2105.m6981("ۙ᩷") ^ i9;
                        i = ((iM2566 ^ i10) * 30861) ^ (-1057468376);
                        i2 = -1190989241;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1292290198:
                case -842474172:
                    i5 = 43488;
                    iM2566 = C0630.m2566("ܶۚ") ^ i10;
                    i = ((iM2566 ^ i9) * 8087) ^ (-2025269317);
                    i2 = -918603048;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1183388518:
                case 1872745551:
                    s2 = 11500;
                    if (C3245.f10203 <= 0) {
                        iM2566 = (C2105.m6981("ۨܰ") ^ i10) * (-121);
                        i = ((iM2566 ^ i9) * 1203) ^ (-881428630);
                        i2 = -674842182;
                    } else {
                        iM2566 = (C2105.m6981("ܳ۟") ^ i9) * (-79);
                        i = ((iM2566 ^ i10) * 15337) ^ 409220355;
                        i2 = -1311016705;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -1042897163:
                case 149589940:
                    if (C2167.f7158 >= 0) {
                        iM2566 = (C2105.m6981("۫֨") + i9) * (-85);
                        i = ((iM2566 ^ i10) * 565) ^ (-1232886575);
                        i2 = 1675619659;
                        i12 = iM2566 ^ i2;
                        i11 = i;
                    }
                    iM2566 = C0630.m2566("۟۟") ^ i10;
                    i = ((iM2566 ^ i9) * 18369) ^ 1622229311;
                    i2 = 785760488;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -953495743:
                case -573655730:
                    c = ',';
                    if (C0483.f2088 >= 0) {
                        iM2566 = C2105.m6981("᩸ᩳ") ^ i10;
                        i = ((iM2566 ^ i9) * (-1981)) ^ 1432305889;
                        i2 = 1038606660;
                    } else {
                        iM2566 = C2105.m6981("ۢ֡") ^ i10;
                        i = ((iM2566 ^ i9) * 16525) ^ (-407198027);
                        i2 = 234813796;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -733604323:
                case 256809938:
                    i4 = 33062500 + i3;
                    if (C7811.f24123 >= 0) {
                        iM2566 = C0630.m2566("۟۟") ^ i10;
                        i = ((iM2566 ^ i9) * 18369) ^ 1622229311;
                        i2 = 785760488;
                    } else {
                        iM2566 = (i10 - C2105.m6981("ۢۙ")) * (-17);
                        i = ((iM2566 ^ i9) * (-219)) ^ 510670103;
                        i2 = 2103122674;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -574038490:
                case 1183599905:
                    if (C0714.f2697 >= 0) {
                        iM2566 = (C2105.m6981("۫֨") + i9) * (-85);
                        i = ((iM2566 ^ i10) * 565) ^ (-1232886575);
                        i2 = 1675619659;
                    } else {
                        iM2566 = (C0630.m2566("᩵ۧ") ^ i9) * (-77);
                        i = ((iM2566 ^ i10) * 19459) ^ 1062839254;
                        i2 = 307175280;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -556406864:
                case -9693374:
                    ServiceConnectionC3453.m10564();
                    C0050.m940();
                    break;
                case -407731217:
                case 1505678400:
                    C1773.m5908();
                    C2105.m6982();
                    iM2566 = C0630.m2566("۟۟") ^ i10;
                    i = ((iM2566 ^ i9) * 18369) ^ 1622229311;
                    i2 = 785760488;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -329407499:
                case 1838300886:
                    C7106.m19120();
                    if (C2520.f8000 < 0) {
                        iM2566 = C2105.m6981("ܿ֫") ^ i9;
                        i = ((iM2566 ^ i10) * 7521) ^ (-1336885842);
                        i2 = -1317273852;
                        i12 = iM2566 ^ i2;
                        i11 = i;
                    }
                    iM2566 = C0630.m2566("۟۟") ^ i10;
                    i = ((iM2566 ^ i9) * 18369) ^ 1622229311;
                    i2 = 785760488;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -306798445:
                case 1367739809:
                    if (C3683.m11222()) {
                        iM2566 = C2105.m6981("ܿ֫") ^ i9;
                        i = ((iM2566 ^ i10) * 7521) ^ (-1336885842);
                        i2 = -1317273852;
                    } else {
                        iM2566 = C2105.m6981("ܺۚ") ^ i10;
                        i = ((iM2566 ^ i9) * (-28361)) ^ (-1173833314);
                        i2 = -1137109166;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -301167002:
                case -146652161:
                    if (RunnableC1108.m3790()) {
                        iM2566 = (C2105.m6981("۫֨") + i9) * (-85);
                        i = ((iM2566 ^ i10) * 565) ^ (-1232886575);
                        i2 = 1675619659;
                    } else {
                        iM2566 = C2105.m6981("ᩴ֨") ^ i10;
                        i = ((iM2566 ^ i9) * (-4635)) ^ 675844783;
                        i2 = 1007457645;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case -271874466:
                case 2120940481:
                    C3683.m11210(animator, C1047.m3603(sArr2, i6, i7, i5));
                    break;
                case -52331680:
                case 342186093:
                    i5 = 26588;
                    iM2566 = C0630.m2566("ܶۚ") ^ i10;
                    i = ((iM2566 ^ i9) * 8087) ^ (-2025269317);
                    i2 = -918603048;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                case 524182312:
                case 1293516199:
                    if (!RunnableC1108.m3790()) {
                        iM2566 = C2105.m6981("᩸ᩳ") ^ i10;
                        i = ((iM2566 ^ i9) * (-1981)) ^ 1432305889;
                        i2 = 1038606660;
                        i12 = iM2566 ^ i2;
                        i11 = i;
                    }
                    iM2566 = C0630.m2566("۟۟") ^ i10;
                    i = ((iM2566 ^ i9) * 18369) ^ 1622229311;
                    i2 = 785760488;
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
                default:
                    sArr2 = f15327;
                    i6 = 45;
                    if (C3911.f12484 >= 0) {
                        iM2566 = C2105.m6981("ܿ֫") ^ i9;
                        i = ((iM2566 ^ i10) * 7521) ^ (-1336885842);
                        i2 = -1317273852;
                    } else {
                        iM2566 = C0630.m2566("᩻ᩳ") ^ i9;
                        i = ((iM2566 ^ i10) * (-19991)) ^ (-1024688411);
                        i2 = -1032733139;
                    }
                    i12 = iM2566 ^ i2;
                    i11 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0250 A[PHI: r15 r26
      0x0250: PHI (r15v4 com.google.android.material.textfield.TextInputLayout) = 
      (r15v2 com.google.android.material.textfield.TextInputLayout)
      (r15v3 com.google.android.material.textfield.TextInputLayout)
      (r15v2 com.google.android.material.textfield.TextInputLayout)
     binds: [B:117:0x0250, B:40:0x024e, B:30:0x01ac] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r26v3 int) = (r26v2 int), (r26v2 int), (r26v4 int) binds: [B:117:0x0250, B:40:0x024e, B:30:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int iM6981;
        int i;
        int i2;
        short[] sArr;
        int iM6982;
        int i3;
        int iM6983;
        int i4;
        int i5;
        TextView textView;
        short[] sArr2;
        AbstractActivityC3346 abstractActivityC3346;
        int iM6984;
        int i6;
        int i7;
        short[] sArr3;
        int iM6985;
        int i8;
        int i9;
        AbstractActivityC3346 abstractActivityC3347;
        int i10;
        int i11;
        int iM6986;
        this = this;
        short s = 0;
        int i12 = -1959501726;
        int i13 = C0714.f2697;
        int i14 = C0422.f1886;
        int iM2566 = C0630.m2566("᩷᩵") ^ i13;
        int i15 = ((iM2566 ^ i14) * 14605) ^ (-472431889);
        int i16 = iM2566 ^ (-352173975);
        TextInputLayout textInputLayout = null;
        AbstractActivityC3346 abstractActivityC3348 = null;
        AbstractActivityC3346 abstractActivityC3349 = null;
        AbstractActivityC3346 abstractActivityC33410 = null;
        TextInputLayout textInputLayout2 = null;
        AbstractActivityC3346 abstractActivityC33411 = null;
        String strM6385 = null;
        String str = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        ViewOnClickListenerC3441 viewOnClickListenerC3441 = null;
        boolean z = false;
        int iM6987 = 0;
        int i17 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int iM2567 = 0;
        int iM6988 = 0;
        int iM2568 = 0;
        int iM2569 = 0;
        int iM6989 = 0;
        short s2 = 0;
        int i18 = 0;
        TextView textView2 = null;
        TextInputLayout textInputLayout3 = null;
        TextInputLayout textInputLayout4 = null;
        int i19 = 0;
        int i20 = 0;
        TextView textView3 = null;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i14) * (-7363)) >> 31));
            switch (i12) {
                case -2138401402:
                case -123214300:
                    C1420.m4913();
                    if (C3537.f11231 >= 0) {
                        iM6981 = (i13 - C2105.m6981("ܶܶ")) * 31;
                        i = ((iM6981 ^ i14) * 3995) ^ (-46647346);
                        i2 = -1322282157;
                        i16 = iM6981 ^ i2;
                        i15 = i;
                    } else {
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                        abstractActivityC33410 = abstractActivityC33410;
                        textView2 = textView2;
                        textInputLayout3 = textInputLayout3;
                        abstractActivityC3349 = abstractActivityC3349;
                        sArr6 = sArr6;
                        z = z;
                        sArr = sArr4;
                        int iM25610 = C0630.m2566("ۡ᩶") ^ i13;
                        int i21 = ((iM25610 ^ i14) * 4297) ^ 625199219;
                        i16 = iM25610 ^ 1687771015;
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                        sArr4 = sArr;
                        z = z;
                        abstractActivityC33410 = abstractActivityC33410;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        i15 = i21;
                        abstractActivityC3349 = abstractActivityC3349;
                        this = this;
                        textInputLayout3 = textInputLayout3;
                    }
                    break;
                case -2072740937:
                case 1120937435:
                    sArr6 = sArr6;
                    textView2 = viewOnClickListenerC3441.f10883;
                    iM2567 = C0630.m2566(C4616.m13542(f15327, 26, 3, i20));
                    iM6984 = (i14 - C2105.m6981("ۡ۟")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i6 = ((iM6984 ^ i13) * 27725) ^ (-738953421);
                    i7 = 1515735250;
                    i16 = iM6984 ^ i7;
                    i15 = i6;
                    z = z;
                    abstractActivityC33410 = abstractActivityC33410;
                    sArr6 = sArr6;
                    abstractActivityC3349 = abstractActivityC3349;
                    textInputLayout3 = textInputLayout3;
                    break;
                case -2056425564:
                case -855349830:
                    iM6987 = 2116953319 ^ C2105.m6981(str);
                    if (!C1005.m3501()) {
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                        abstractActivityC33410 = abstractActivityC33410;
                        textView2 = textView2;
                        textInputLayout3 = textInputLayout3;
                        abstractActivityC3349 = abstractActivityC3349;
                        sArr6 = sArr6;
                        z = z;
                        sArr = sArr4;
                        int iM25611 = C0630.m2566("ۡ᩶") ^ i13;
                        int i22 = ((iM25611 ^ i14) * 4297) ^ 625199219;
                        i16 = iM25611 ^ 1687771015;
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                        sArr4 = sArr;
                        z = z;
                        abstractActivityC33410 = abstractActivityC33410;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        i15 = i22;
                        abstractActivityC3349 = abstractActivityC3349;
                        this = this;
                        textInputLayout3 = textInputLayout3;
                    } else {
                        iM6981 = (C2105.m6981("ۙᩳ") ^ i13) * (-123);
                        i = ((iM6981 ^ i14) * 10533) ^ (-1509352141);
                        i2 = -410338762;
                        i16 = iM6981 ^ i2;
                        i15 = i;
                    }
                    break;
                case -2001880470:
                case 1351988803:
                    viewOnClickListenerC3441.f10880.setErrorEnabled(z2);
                    viewOnClickListenerC3441.f10887.setErrorEnabled(z2);
                    C22628.m50603(this.f15328);
                    break;
                case -1982815911:
                case 1536421802:
                    abstractActivityC33410 = abstractActivityC33410;
                    textView = textView2;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC3349 = abstractActivityC3349;
                    sArr2 = sArr6;
                    boolean z5 = z;
                    short[] sArr8 = sArr4;
                    int i23 = i18;
                    int iM25612 = C0630.m2566(C3432.m10488(sArr8, i23, 3, i20)) ^ 2099869265;
                    sArr5 = f15327;
                    if (C7106.m19120() > 0) {
                        int iM69810 = C2105.m6981("֫ܳ") ^ i14;
                        i15 = ((iM69810 ^ i13) * 11621) ^ (-1075989726);
                        i16 = iM69810 ^ 897896207;
                        textView2 = textView;
                        sArr4 = sArr8;
                        i18 = i23;
                        z = z5;
                        abstractActivityC33410 = abstractActivityC33410;
                        sArr6 = sArr2;
                        i17 = iM25612;
                        abstractActivityC3349 = abstractActivityC3349;
                        textInputLayout3 = textInputLayout3;
                    } else {
                        sArr4 = sArr8;
                        i18 = i23;
                        z = z5;
                        i17 = iM25612;
                        iM6986 = (C2105.m6981("ۙۤ") ^ i14) * (-31);
                        i11 = ((iM6986 ^ i13) * 13083) ^ 352965807;
                        i10 = 2079459180;
                        i16 = iM6986 ^ i10;
                        i15 = i11;
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                        abstractActivityC3349 = abstractActivityC3349;
                        sArr6 = sArr2;
                        textView2 = textView;
                        textInputLayout3 = textInputLayout3;
                        abstractActivityC33410 = abstractActivityC33410;
                    }
                    break;
                case -1973966064:
                case 1508631080:
                    if (C3019.f9544 >= 0) {
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                        abstractActivityC33410 = abstractActivityC33410;
                        textView2 = textView2;
                        textInputLayout3 = textInputLayout3;
                        abstractActivityC3349 = abstractActivityC3349;
                        sArr6 = sArr6;
                        z = z;
                        sArr = sArr4;
                        int iM25613 = C0630.m2566("ۡ᩶") ^ i13;
                        int i24 = ((iM25613 ^ i14) * 4297) ^ 625199219;
                        i16 = iM25613 ^ 1687771015;
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                        sArr4 = sArr;
                        z = z;
                        abstractActivityC33410 = abstractActivityC33410;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        i15 = i24;
                        abstractActivityC3349 = abstractActivityC3349;
                        this = this;
                        textInputLayout3 = textInputLayout3;
                    } else {
                        iM6981 = (C0630.m2566("᩶᩵") + i14) * 81;
                        i = ((iM6981 ^ i13) * (-28967)) ^ 1831876794;
                        i2 = -763501533;
                        i16 = iM6981 ^ i2;
                        i15 = i;
                    }
                    break;
                case -1963949812:
                case 822213091:
                    C4117.m12364();
                    break;
                case -1850781832:
                case 1991383898:
                    AbstractActivityC3346 abstractActivityC33412 = abstractActivityC33410;
                    TextView textView4 = textView2;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC3349 = abstractActivityC3349;
                    short s3 = s2;
                    short[] sArr9 = sArr6;
                    ViewOnClickListenerC3441 viewOnClickListenerC3442 = viewOnClickListenerC3441;
                    boolean z6 = z;
                    short[] sArr10 = sArr4;
                    int i25 = s3 + s;
                    if ((s3 * 29040) - (i25 * i25) > 0) {
                        iM6983 = C0630.m2566("ۙ۬") ^ i14;
                        i4 = ((iM6983 ^ i13) * (-13711)) ^ 855093113;
                        i5 = -838205654;
                    } else {
                        iM6983 = (C2105.m6981("۬ᩳ") ^ i13) * (-17);
                        i4 = ((iM6983 ^ i14) * 32241) ^ 1689576411;
                        i5 = -1785137771;
                    }
                    i16 = iM6983 ^ i5;
                    s2 = s3;
                    i15 = i4;
                    sArr4 = sArr10;
                    viewOnClickListenerC3441 = viewOnClickListenerC3442;
                    z = z6;
                    abstractActivityC33410 = abstractActivityC33412;
                    sArr6 = sArr9;
                    textView2 = textView4;
                    this = this;
                    abstractActivityC3349 = abstractActivityC3349;
                    textInputLayout3 = textInputLayout3;
                    break;
                case -1745169217:
                case -416936900:
                    abstractActivityC33410 = abstractActivityC33410;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC3349 = abstractActivityC3349;
                    sArr6 = sArr6;
                    z = z;
                    TextView textView5 = textView2;
                    C0630.m2570(textView5, iM2567 ^ 2118256484);
                    textInputLayout = viewOnClickListenerC3441.f10880;
                    if (RunnableC3474.f10992 > 0) {
                        int iM25614 = (i13 - C0630.m2566("ۙۨ")) * (-121);
                        i16 = iM25614 ^ (-1645780364);
                        textView2 = textView5;
                        i15 = ((iM25614 ^ i14) * 6621) ^ (-846473533);
                        z = z;
                        abstractActivityC33410 = abstractActivityC33410;
                        sArr6 = sArr6;
                        abstractActivityC3349 = abstractActivityC3349;
                        textInputLayout3 = textInputLayout3;
                    } else {
                        textView2 = textView5;
                        sArr = sArr4;
                        int iM25615 = C0630.m2566("ۡ᩶") ^ i13;
                        int i26 = ((iM25615 ^ i14) * 4297) ^ 625199219;
                        i16 = iM25615 ^ 1687771015;
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                        sArr4 = sArr;
                        z = z;
                        abstractActivityC33410 = abstractActivityC33410;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        i15 = i26;
                        abstractActivityC3349 = abstractActivityC3349;
                        this = this;
                        textInputLayout3 = textInputLayout3;
                    }
                    break;
                case -1714720531:
                case -88950992:
                    textView3 = viewOnClickListenerC3441.f10883;
                    abstractActivityC33410 = abstractActivityC33410;
                    iM2568 = C0630.m2566(C1504.m5177(f15327, 35, 3, i20));
                    int iM69811 = C2105.m6981("᩷ۤ") ^ i14;
                    i16 = iM69811 ^ 1384744763;
                    i15 = ((iM69811 ^ i13) * 16493) ^ 427747504;
                    abstractActivityC33410 = abstractActivityC33410;
                    break;
                case -1373517627:
                case 1644145708:
                    EditText editTextM5905 = C1773.m5905(viewOnClickListenerC3441.f10887);
                    C2167.m7151(editTextM5905);
                    editTextM5905.setInputType(33);
                    viewOnClickListenerC3441.f10887.setEndIconVisible(z2);
                    iM6981 = (C0630.m2566("۬ۤ") + i13) * 97;
                    i = ((iM6981 ^ i14) * (-8273)) ^ 2102788965;
                    i2 = 1692497183;
                    i16 = iM6981 ^ i2;
                    i15 = i;
                    break;
                case -1362752582:
                case 1247936375:
                    C2105.m6978(textView3, iM2568 ^ 2128578606);
                    textInputLayout4 = viewOnClickListenerC3441.f10880;
                    if (C3911.m11924() <= 0) {
                        iM6981 = (i13 - C2105.m6981("ܶܶ")) * 31;
                        i = ((iM6981 ^ i14) * 3995) ^ (-46647346);
                        i2 = -1322282157;
                    } else {
                        iM6981 = C0630.m2566("ۤ֡") ^ i13;
                        i = ((iM6981 ^ i14) * 9493) ^ 1659027191;
                        i2 = -826568970;
                    }
                    i16 = iM6981 ^ i2;
                    i15 = i;
                    break;
                case -1171045876:
                case 2000080688:
                    abstractActivityC33410 = abstractActivityC33410;
                    textView = textView2;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC3349 = abstractActivityC3349;
                    sArr2 = sArr6;
                    z = true;
                    viewOnClickListenerC3441.f10878 = !z3;
                    z4 = viewOnClickListenerC3441.f10878;
                    sArr4 = f15327;
                    i18 = 20;
                    if (C0798.f2919) {
                        iM6986 = (C2105.m6981("ۙۤ") ^ i14) * (-31);
                        i11 = ((iM6986 ^ i13) * 13083) ^ 352965807;
                        i10 = 2079459180;
                    } else {
                        iM6986 = C0630.m2566("ܽܳ") ^ i13;
                        i11 = ((iM6986 ^ i14) * (-24063)) ^ (-890413959);
                        i10 = -706997727;
                    }
                    i16 = iM6986 ^ i10;
                    i15 = i11;
                    viewOnClickListenerC3441 = viewOnClickListenerC3441;
                    abstractActivityC3349 = abstractActivityC3349;
                    sArr6 = sArr2;
                    textView2 = textView;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC33410 = abstractActivityC33410;
                    break;
                case -1010017504:
                case 651776782:
                    abstractActivityC3347 = abstractActivityC3349;
                    textInputLayout3 = textInputLayout3;
                    textInputLayout3.setHint(C0050.m946(abstractActivityC3347, iM6988 ^ 2119941246));
                    C0630.m2570(viewOnClickListenerC3441.f10886, i17);
                    C2105.m6978(viewOnClickListenerC3441.f10884, i19);
                    int iM25616 = C0630.m2566("ۜۛ") ^ i14;
                    abstractActivityC3346 = abstractActivityC3347;
                    i16 = iM25616 ^ 747920563;
                    i15 = ((iM25616 ^ i13) * 12797) ^ 1614741561;
                    abstractActivityC3349 = abstractActivityC3346;
                    abstractActivityC33410 = abstractActivityC33410;
                    textInputLayout3 = textInputLayout3;
                    break;
                case -971784059:
                case 1475780480:
                    textInputLayout2.setHint(C0050.m946(abstractActivityC33411, iM2569 ^ 2130704234));
                    C0630.m2570(viewOnClickListenerC3441.f10886, i19);
                    C2105.m6978(viewOnClickListenerC3441.f10884, i17);
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC3347 = abstractActivityC3349;
                    int iM25617 = C0630.m2566("ۜۛ") ^ i14;
                    abstractActivityC3346 = abstractActivityC3347;
                    i16 = iM25617 ^ 747920563;
                    i15 = ((iM25617 ^ i13) * 12797) ^ 1614741561;
                    abstractActivityC3349 = abstractActivityC3346;
                    abstractActivityC33410 = abstractActivityC33410;
                    textInputLayout3 = textInputLayout3;
                    break;
                case -956154130:
                case 360784187:
                    abstractActivityC33410 = abstractActivityC33410;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC3349 = abstractActivityC3349;
                    z = z;
                    sArr3 = sArr6;
                    iM6989 = C2105.m6981(strM6385) ^ 2099621244;
                    if (C3911.f12484 < 0) {
                        iM6985 = C2105.m6981("ܰۢ") ^ i13;
                        i8 = ((iM6985 ^ i14) * 21827) ^ 1761417588;
                        i9 = -1739945109;
                        i16 = iM6985 ^ i9;
                        i15 = i8;
                        sArr6 = sArr3;
                        z = z;
                        abstractActivityC33410 = abstractActivityC33410;
                        abstractActivityC3349 = abstractActivityC3349;
                        textInputLayout3 = textInputLayout3;
                    } else {
                        sArr2 = sArr3;
                        textView = textView2;
                        z = z;
                        iM6986 = (C2105.m6981("ۙۤ") ^ i14) * (-31);
                        i11 = ((iM6986 ^ i13) * 13083) ^ 352965807;
                        i10 = 2079459180;
                        i16 = iM6986 ^ i10;
                        i15 = i11;
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                        abstractActivityC3349 = abstractActivityC3349;
                        sArr6 = sArr2;
                        textView2 = textView;
                        textInputLayout3 = textInputLayout3;
                        abstractActivityC33410 = abstractActivityC33410;
                    }
                    break;
                case -895596462:
                case 1258404849:
                    abstractActivityC33410 = abstractActivityC33410;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC3349 = abstractActivityC3349;
                    sArr6 = sArr6;
                    z = z;
                    sArr = sArr4;
                    textView2 = textView2;
                    RunnableC0588.m2430(animator, C0483.m2128(f15327, 11, 9, i20));
                    viewOnClickListenerC3441 = this.f15329;
                    z3 = viewOnClickListenerC3441.f10878;
                    if (C1047.f3863 >= 0) {
                        int iM25618 = C0630.m2566("ۡ᩶") ^ i13;
                        int i27 = ((iM25618 ^ i14) * 4297) ^ 625199219;
                        i16 = iM25618 ^ 1687771015;
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                        sArr4 = sArr;
                        z = z;
                        abstractActivityC33410 = abstractActivityC33410;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        i15 = i27;
                        abstractActivityC3349 = abstractActivityC3349;
                        this = this;
                    } else {
                        int iM25619 = (C0630.m2566("ۡۧ") + i14) * 47;
                        i16 = iM25619 ^ 694876709;
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                        i15 = ((iM25619 ^ i13) * 7617) ^ (-1284136952);
                        sArr4 = sArr;
                        z = z;
                        abstractActivityC33410 = abstractActivityC33410;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        abstractActivityC3349 = abstractActivityC3349;
                    }
                    textInputLayout3 = textInputLayout3;
                    break;
                case -791561463:
                case 405314896:
                    C2272.m7503();
                    C22628.m50615();
                    iM6981 = (C0630.m2566("᩶᩵") + i14) * 81;
                    i = ((iM6981 ^ i13) * (-28967)) ^ 1831876794;
                    i2 = -763501533;
                    i16 = iM6981 ^ i2;
                    i15 = i;
                    break;
                case -689805544:
                case 791823582:
                    i20 = 59188;
                    iM6982 = C2105.m6981("ۖۚ") ^ i13;
                    i15 = ((iM6982 ^ i14) * 23465) ^ 1827086907;
                    i3 = -984712408;
                    i16 = iM6982 ^ i3;
                    sArr4 = sArr4;
                    viewOnClickListenerC3441 = viewOnClickListenerC3441;
                    z = z;
                    abstractActivityC33410 = abstractActivityC33410;
                    sArr6 = sArr6;
                    textView2 = textView2;
                    abstractActivityC3349 = abstractActivityC3349;
                    textInputLayout3 = textInputLayout3;
                    break;
                case -687441697:
                case 422155987:
                    i20 = 51610;
                    iM6982 = C2105.m6981("ۖۚ") ^ i13;
                    i15 = ((iM6982 ^ i14) * 23465) ^ 1827086907;
                    i3 = -984712408;
                    i16 = iM6982 ^ i3;
                    sArr4 = sArr4;
                    viewOnClickListenerC3441 = viewOnClickListenerC3441;
                    z = z;
                    abstractActivityC33410 = abstractActivityC33410;
                    sArr6 = sArr6;
                    textView2 = textView2;
                    abstractActivityC3349 = abstractActivityC3349;
                    textInputLayout3 = textInputLayout3;
                    break;
                case -522763971:
                case 1666992128:
                    iM2569 = C0630.m2566(C3537.m10748(sArr7, 41, 3, i20));
                    if (C1294.f4556 >= 0) {
                        iM6981 = (i13 - C2105.m6981("ܶܶ")) * 31;
                        i = ((iM6981 ^ i14) * 3995) ^ (-46647346);
                        i2 = -1322282157;
                    } else {
                        iM6981 = C2105.m6981("ܳ۫") ^ i13;
                        i = ((iM6981 ^ i14) * (-18655)) ^ (-517921663);
                        i2 = -642161787;
                    }
                    i16 = iM6981 ^ i2;
                    i15 = i;
                    break;
                case -449167358:
                case 584194200:
                    abstractActivityC33410 = abstractActivityC33410;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC3349 = abstractActivityC3349;
                    z = z;
                    sArr3 = sArr6;
                    iM6988 = C2105.m6981(C21923.m49334(sArr3, 32, 3, i20));
                    if (C0237.f1507 == 0) {
                        iM6985 = C0630.m2566("ۡ᩻") ^ i13;
                        i8 = ((iM6985 ^ i14) * (-13797)) ^ (-1043515476);
                        i9 = 1300475527;
                        i16 = iM6985 ^ i9;
                        i15 = i8;
                        sArr6 = sArr3;
                        z = z;
                        abstractActivityC33410 = abstractActivityC33410;
                        abstractActivityC3349 = abstractActivityC3349;
                        textInputLayout3 = textInputLayout3;
                    } else {
                        sArr6 = sArr3;
                        textView2 = textView2;
                        sArr = sArr4;
                        int iM256110 = C0630.m2566("ۡ᩶") ^ i13;
                        int i28 = ((iM256110 ^ i14) * 4297) ^ 625199219;
                        i16 = iM256110 ^ 1687771015;
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                        sArr4 = sArr;
                        z = z;
                        abstractActivityC33410 = abstractActivityC33410;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        i15 = i28;
                        abstractActivityC3349 = abstractActivityC3349;
                        this = this;
                        textInputLayout3 = textInputLayout3;
                    }
                    break;
                case -915840:
                case 762264294:
                    abstractActivityC33410 = abstractActivityC33410;
                    TextView textView6 = textView2;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC3346 = abstractActivityC3349;
                    short[] sArr11 = sArr6;
                    boolean z7 = z;
                    short[] sArr12 = sArr5;
                    int iM25620 = C0630.m2566(C3663.m11162(sArr12, 23, 3, i20)) ^ 2126477062;
                    if (z4) {
                        int iM25621 = C0630.m2566("ۡۢ") ^ i13;
                        i15 = ((iM25621 ^ i14) * (-7809)) ^ (-1409125986);
                        i16 = iM25621 ^ 1962766604;
                    } else {
                        int iM25622 = C0630.m2566("ۖ۟") ^ i13;
                        i16 = iM25622 ^ 171686755;
                        i15 = ((iM25622 ^ i14) * 16691) ^ 245040643;
                    }
                    sArr5 = sArr12;
                    i19 = iM25620;
                    z = z7;
                    sArr6 = sArr11;
                    textView2 = textView6;
                    abstractActivityC3349 = abstractActivityC3346;
                    abstractActivityC33410 = abstractActivityC33410;
                    textInputLayout3 = textInputLayout3;
                    break;
                case 5996692:
                case 1089753046:
                    AbstractActivityC3346 abstractActivityC33413 = viewOnClickListenerC3441.f10885;
                    String strM3789 = RunnableC1108.m3789(f15327, 38, 3, i20);
                    int iM69812 = C2105.m6981("᩺ۗ") ^ i14;
                    i = ((iM69812 ^ i13) * 21521) ^ (-1526279025);
                    i16 = iM69812 ^ (-1652222152);
                    abstractActivityC33410 = abstractActivityC33413;
                    str = strM3789;
                    i15 = i;
                    break;
                case 164170275:
                case 880788685:
                    z2 = false;
                    if (viewOnClickListenerC3441.f10878) {
                        iM6981 = C0630.m2566("ۘ֡") ^ i13;
                        i = ((iM6981 ^ i14) * (-1811)) ^ (-1650787880);
                        i2 = 544082705;
                    } else {
                        iM6981 = (i14 - C2105.m6981("ۤ᩻")) * (-35);
                        i = ((iM6981 ^ i13) * 32151) ^ (-2126940794);
                        i2 = -1658670785;
                    }
                    i16 = iM6981 ^ i2;
                    i15 = i;
                    break;
                case 181672765:
                case 1550543858:
                    EditText editTextM2132 = C0483.m2132(viewOnClickListenerC3441.f10887);
                    C0714.m2808(editTextM2132);
                    editTextM2132.setInputType(129);
                    viewOnClickListenerC3441.f10887.setEndIconVisible(z);
                    iM6981 = (C0630.m2566("۬ۤ") + i13) * 97;
                    i = ((iM6981 ^ i14) * (-8273)) ^ 2102788965;
                    i2 = 1692497183;
                    i16 = iM6981 ^ i2;
                    i15 = i;
                    break;
                case 354077388:
                case 2015349237:
                    textInputLayout4.setHint(C0422.m1958(abstractActivityC33410, iM6987));
                    textInputLayout2 = viewOnClickListenerC3441.f10887;
                    abstractActivityC33411 = viewOnClickListenerC3441.f10885;
                    sArr7 = f15327;
                    iM6981 = C2105.m6981("ۨ۬") ^ i14;
                    i = ((iM6981 ^ i13) * 6711) ^ (-1857431531);
                    i2 = -130228424;
                    i16 = iM6981 ^ i2;
                    i15 = i;
                    break;
                case 369456324:
                case 1631275578:
                    AbstractActivityC3346 abstractActivityC33414 = abstractActivityC33410;
                    boolean z8 = z;
                    AbstractActivityC3346 abstractActivityC33415 = abstractActivityC3348;
                    int i29 = iM6989;
                    TextInputLayout textInputLayout5 = textInputLayout;
                    textInputLayout5.setHint(C0422.m1958(abstractActivityC33415, i29));
                    textInputLayout3 = viewOnClickListenerC3441.f10887;
                    AbstractActivityC3346 abstractActivityC33416 = viewOnClickListenerC3441.f10885;
                    sArr6 = f15327;
                    int iM69813 = (i14 - C2105.m6981("۫ܺ")) * (-63);
                    abstractActivityC3348 = abstractActivityC33415;
                    i15 = ((iM69813 ^ i13) * (-31825)) ^ (-559282149);
                    i16 = iM69813 ^ 996888784;
                    iM6989 = i29;
                    textInputLayout = textInputLayout5;
                    abstractActivityC33410 = abstractActivityC33414;
                    abstractActivityC3349 = abstractActivityC33416;
                    z = z8;
                    break;
                case 551756790:
                case 2080047906:
                    abstractActivityC3348 = viewOnClickListenerC3441.f10885;
                    sArr6 = sArr6;
                    strM6385 = RunnableC1937.m6385(f15327, 29, 3, i20);
                    iM6984 = (i14 - C0630.m2566("᩻ۗ")) * 29;
                    i6 = ((iM6984 ^ i13) * (-13633)) ^ (-672081951);
                    i7 = -943066134;
                    i16 = iM6984 ^ i7;
                    i15 = i6;
                    z = z;
                    abstractActivityC33410 = abstractActivityC33410;
                    sArr6 = sArr6;
                    abstractActivityC3349 = abstractActivityC3349;
                    textInputLayout3 = textInputLayout3;
                    break;
                case 1549742239:
                case 1699615914:
                    abstractActivityC33410 = abstractActivityC33410;
                    textView2 = textView2;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC3349 = abstractActivityC3349;
                    sArr6 = sArr6;
                    viewOnClickListenerC3441 = viewOnClickListenerC3441;
                    z = z;
                    sArr4 = sArr4;
                    s2 = f15327[10];
                    s = 7260;
                    if (RunnableC0588.f2309 >= 0) {
                        iM6982 = C2105.m6981("᩻۠") ^ i14;
                        i15 = ((iM6982 ^ i13) * (-13189)) ^ (-1432269798);
                        i3 = 12641684;
                    } else {
                        iM6982 = (C2105.m6981("ۛ֨") ^ i14) * 85;
                        i15 = ((iM6982 ^ i13) * 16443) ^ 77827225;
                        i3 = -677997340;
                    }
                    i16 = iM6982 ^ i3;
                    sArr4 = sArr4;
                    viewOnClickListenerC3441 = viewOnClickListenerC3441;
                    z = z;
                    abstractActivityC33410 = abstractActivityC33410;
                    sArr6 = sArr6;
                    textView2 = textView2;
                    abstractActivityC3349 = abstractActivityC3349;
                    textInputLayout3 = textInputLayout3;
                    break;
                default:
                    if (C0237.f1507 == 0) {
                        abstractActivityC33410 = abstractActivityC33410;
                        textView2 = textView2;
                        textInputLayout3 = textInputLayout3;
                        abstractActivityC3349 = abstractActivityC3349;
                        sArr6 = sArr6;
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                        z = z;
                        sArr4 = sArr4;
                        iM6982 = C2105.m6981("᩻۠") ^ i14;
                        i15 = ((iM6982 ^ i13) * (-13189)) ^ (-1432269798);
                        i3 = 12641684;
                        i16 = iM6982 ^ i3;
                        sArr4 = sArr4;
                        viewOnClickListenerC3441 = viewOnClickListenerC3441;
                        z = z;
                        abstractActivityC33410 = abstractActivityC33410;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        abstractActivityC3349 = abstractActivityC3349;
                        textInputLayout3 = textInputLayout3;
                    } else {
                        iM6981 = (C0630.m2566("᩶᩵") + i14) * 81;
                        i = ((iM6981 ^ i13) * (-28967)) ^ 1831876794;
                        i2 = -763501533;
                        i16 = iM6981 ^ i2;
                        i15 = i;
                    }
                    break;
            }
            return;
        }
    }

    public C4852(ViewOnClickListenerC3441 viewOnClickListenerC3441, ObjectAnimator objectAnimator) {
        int i = -367695613;
        int i2 = C0050.f910;
        int i3 = ServiceConnectionC3453.f10921;
        int iM6981 = C2105.m6981("ۡ۟") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-9927)) ^ (-222969840);
        int i5 = 393251016;
        while (true) {
            i = ((((i ^ i2) * 16211) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2140729380:
                case 191926738:
                    if (C4263.m12819() >= 0) {
                        iM6981 = (C0630.m2566("ܶ᩶") + i3) * 93;
                        i4 = ((iM6981 ^ i2) * 20015) ^ 1150669147;
                        i5 = -728587530;
                    } else {
                        iM6981 = C0630.m2566("۬ܶ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 4435) ^ (-1424902431);
                        i5 = 203039594;
                    }
                    break;
                case -1684919511:
                case -255859733:
                    if (C2520.m8026()) {
                        iM6981 = C0630.m2566("֨۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-11601)) ^ 775801841;
                        i5 = 828153357;
                    } else {
                        iM6981 = C2105.m6981("ۜ֡") ^ i3;
                        i4 = ((iM6981 ^ i2) * 3231) ^ (-433877537);
                        i5 = -1531681852;
                    }
                    break;
                case -1639911446:
                case -1308867831:
                    ServiceConnectionC3453.m10564();
                    throw new RuntimeException();
                case -1637331855:
                case 77842621:
                    if (C1711.f5919) {
                        iM6981 = (C2105.m6981("᩹᩶") + i3) * (-35);
                        i4 = ((iM6981 ^ i2) * 11383) ^ (-1999829751);
                        i5 = -568921832;
                    } else {
                        iM6981 = C2105.m6981("ܰ᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * 28199) ^ (-1398645144);
                        i5 = 1474867244;
                    }
                    break;
                case -1507844544:
                case 821961136:
                    if (C1128.f4106 <= 0) {
                        iM6981 = (C0630.m2566("۟ܺ") + i2) * 71;
                        i4 = ((iM6981 ^ i3) * 4241) ^ 1162776345;
                        i5 = -1941382208;
                    } else {
                        iM6981 = C2105.m6981("ۘ۬") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-28741)) ^ 1527960880;
                        i5 = 558175453;
                    }
                    break;
                case -1420995537:
                case -940631870:
                    if (C2520.f8000 >= 0) {
                        iM6981 = C0630.m2566("֨۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-11601)) ^ 775801841;
                        i5 = 828153357;
                    } else {
                        iM6981 = C0630.m2566("᩶ۡ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 14427) ^ (-1818199332);
                        i5 = -1918097751;
                    }
                    break;
                case -1196630860:
                case -839305871:
                    if (C4075.f12947 >= 0) {
                        iM6981 = (C2105.m6981("᩹᩶") + i3) * (-35);
                        i4 = ((iM6981 ^ i2) * 11383) ^ (-1999829751);
                        i5 = -568921832;
                    } else {
                        iM6981 = C2105.m6981("۬۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 30269) ^ 298021394;
                        i5 = 905883432;
                    }
                    break;
                case -1113167352:
                case -1023649466:
                    if (C22628.m50615() != 0) {
                        iM6981 = C0630.m2566("֨۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-11601)) ^ 775801841;
                        i5 = 828153357;
                    } else {
                        iM6981 = (C2105.m6981("᩹᩶") + i3) * (-35);
                        i4 = ((iM6981 ^ i2) * 11383) ^ (-1999829751);
                        i5 = -568921832;
                    }
                    break;
                case -946229074:
                case 1741226860:
                    if (C7811.f24123 >= 0) {
                        iM6981 = (C0630.m2566("ܶ᩶") + i3) * 93;
                        i4 = ((iM6981 ^ i2) * 20015) ^ 1150669147;
                        i5 = -728587530;
                    } else {
                        iM6981 = C0630.m2566("۬ᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-4159)) ^ 1666367451;
                        i5 = 1685165419;
                    }
                    break;
                case -843957575:
                case 903039964:
                    if (C2105.f7037 != 0) {
                        iM6981 = (C0630.m2566("۟ܺ") + i2) * 71;
                        i4 = ((iM6981 ^ i3) * 4241) ^ 1162776345;
                        i5 = -1941382208;
                    } else {
                        iM6981 = C0630.m2566("֡۟") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-27709)) ^ (-672219935);
                        i5 = 1821396978;
                    }
                    break;
                case -653687001:
                case 15662081:
                    C3432.m10477();
                    iM6981 = (C0630.m2566("۟ܺ") + i2) * 71;
                    i4 = ((iM6981 ^ i3) * 4241) ^ 1162776345;
                    i5 = -1941382208;
                    break;
                case -595347498:
                case 1202934177:
                    if (C4117.f13076 <= 0) {
                        iM6981 = C2105.m6981("۬۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 30269) ^ 298021394;
                        i5 = 905883432;
                    } else {
                        iM6981 = (C0630.m2566("۟ܺ") + i2) * 71;
                        i4 = ((iM6981 ^ i3) * 4241) ^ 1162776345;
                        i5 = -1941382208;
                    }
                    break;
                case -74997338:
                case 359241867:
                    this.f15329 = viewOnClickListenerC3441;
                    if (C0714.f2697 >= 0) {
                        iM6981 = C2105.m6981("۬۫") ^ i3;
                        i4 = ((iM6981 ^ i2) * 30269) ^ 298021394;
                        i5 = 905883432;
                    } else {
                        iM6981 = (C0630.m2566("۬۬") ^ i2) * (-51);
                        i4 = ((iM6981 ^ i3) * 17227) ^ (-1878359483);
                        i5 = -1710967233;
                    }
                    break;
                case 1102648478:
                case 1633216754:
                    if (C0382.f1805) {
                        iM6981 = C2105.m6981("ܶ᩸") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-20667)) ^ (-838184033);
                        i5 = 993810407;
                    } else {
                        iM6981 = (C0630.m2566("ܶ᩶") + i3) * 93;
                        i4 = ((iM6981 ^ i2) * 20015) ^ 1150669147;
                        i5 = -728587530;
                    }
                    break;
                case 1212370161:
                case 1393263980:
                    if (C2520.f8000 >= 0) {
                        iM6981 = C0630.m2566("֨۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-11601)) ^ 775801841;
                        i5 = 828153357;
                    } else {
                        iM6981 = C2105.m6981("ۧ᩵") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-31227)) ^ (-1463127195);
                        i5 = 1657643348;
                    }
                    break;
                default:
                    this.f15328 = objectAnimator;
                    return;
            }
        }
    }
}
