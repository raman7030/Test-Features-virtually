package p067l;

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
public final class C6980 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ᩻֫᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f81981 = {3837, 21379, 21388, 21387, 21391, 21379, 21398, 21387, 21389, 21388, 7919, -13829, -13836, -13837, -13833, -13829, -13842, -13837, -13835, -13836, 23983, -20012, 22917, -22637, 19851, -22579, -25445, 16634, -25653, 22645, 22326, 21736, -26086, 19276, -23143, -16698, -23701, -18713, -30984, 23174, -22221, -18618, 18004, -28113, 7486, 26557, 26546, 26549, 26545, 26557, 26536, 26549, 26547, 26546, 993, -12198, -12203, -12206, -12202, -12198, -12209, -12206, -12204, -12203};

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ObjectAnimator f18159;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ViewOnClickListenerC5639 f18160;

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
    
        if (p067l.C1024.m56209() < 0) goto L10;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAnimationCancel(Animator animator) {
        int iM55680;
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
        int i9 = AbstractC0942.f81890;
        int i10 = C0898.f81858;
        int iM55979 = (i9 - C0946.m55979("ۘۨ")) * (-69);
        int i11 = ((iM55979 ^ i10) * (-19927)) ^ 1497696345;
        int i12 = iM55979 ^ 130013628;
        while (true) {
            i8 = ((((i8 ^ i10) * (-28027)) >> 31) & i11) ^ i12;
            switch (i8) {
                case -2051967394:
                case 1010665187:
                    s2 = 23230;
                    if (C0947.m55997()) {
                        iM55680 = C0946.m55979("᩹᩹") ^ i10;
                        i = ((iM55680 ^ i9) * (-29627)) ^ (-15256016);
                        i2 = 957457333;
                    } else {
                        iM55680 = C0946.m55979("᩶ۨ") ^ i9;
                        i = ((iM55680 ^ i10) * 20821) ^ (-1211589922);
                        i2 = -1023296142;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1959913150:
                case 610336604:
                    sArr = f81981;
                    if (C0937.f81884) {
                        iM55680 = (i9 - C0873.m55680("۬ۙ")) * (-103);
                        i = ((iM55680 ^ i10) * 2823) ^ (-606664676);
                        i2 = -1815030351;
                    } else {
                        iM55680 = (C0873.m55680("ܺۧ") + i9) * 99;
                        i = ((iM55680 ^ i10) * (-13785)) ^ (-146635104);
                        i2 = 284757628;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1799896276:
                case -807565148:
                    if (C0845.m55584() > 0) {
                        iM55680 = (i10 - C0873.m55680("ᩴۨ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i9) * (-16113)) ^ 563551034;
                        i2 = -1792454356;
                        i12 = iM55680 ^ i2;
                        i11 = i;
                    }
                    iM55680 = C0873.m55680("ܿ۫") ^ i9;
                    i = ((iM55680 ^ i10) * (-28999)) ^ (-1057404361);
                    i2 = -19212253;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1792444604:
                case 1249071876:
                    i4 = 134908225 + i3;
                    if (C0967.f81910 >= 0) {
                        iM55680 = (C0873.m55680("ܺۧ") + i9) * 99;
                        i = ((iM55680 ^ i10) * (-13785)) ^ (-146635104);
                        i2 = 284757628;
                    } else {
                        iM55680 = (i10 - C0873.m55680("ᩴۧ")) * (-43);
                        i = ((iM55680 ^ i9) * 7075) ^ (-1051178541);
                        i2 = -1369432358;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1784759391:
                case -244330453:
                    i5 = 5145;
                    iM55680 = C0873.m55680("ᩳۗ") ^ i9;
                    i = ((iM55680 ^ i10) * (-3699)) ^ (-202546679);
                    i2 = 1063759007;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1784149565:
                case -1735036112:
                    if (i4 - (s * s2) >= 0) {
                        iM55680 = C0946.m55979("ۛ۫") ^ i9;
                        i = ((iM55680 ^ i10) * (-20861)) ^ 244143219;
                        i2 = 1075013220;
                    } else {
                        iM55680 = (i10 - C0873.m55680("ܰۖ")) * (-57);
                        i = ((iM55680 ^ i9) * 12935) ^ (-225587599);
                        i2 = -1890329137;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1610133834:
                case 1936236024:
                    i7 = 9;
                    if (C0955.f81898) {
                        iM55680 = C0873.m55680("ܿ۫") ^ i9;
                        i = ((iM55680 ^ i10) * (-28999)) ^ (-1057404361);
                        i2 = -19212253;
                    } else {
                        iM55680 = (C0946.m55979("ۜ۫") ^ i10) * 13;
                        i = ((iM55680 ^ i9) * 16697) ^ 755459383;
                        i2 = 1343185177;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1543666499:
                case -962346795:
                    if (C1024.f81946) {
                        iM55680 = C0946.m55979("᩹᩹") ^ i10;
                        i = ((iM55680 ^ i9) * (-29627)) ^ (-15256016);
                        i2 = 957457333;
                    } else {
                        iM55680 = (C0873.m55680("֫ۖ") ^ i10) * (-31);
                        i = ((iM55680 ^ i9) * 9441) ^ (-1229451847);
                        i2 = -1445961005;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1469009876:
                case 155308756:
                    C0890.m55740();
                    C0890.m55740();
                    iM55680 = C0946.m55979("ܰ᩹") ^ i9;
                    i = ((iM55680 ^ i10) * (-1005)) ^ 300251156;
                    i2 = 812574855;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1434495479:
                case -1301705577:
                    c = 0;
                    if (C0930.f81879 <= 0) {
                        iM55680 = C0946.m55979("ܰ᩹") ^ i9;
                        i = ((iM55680 ^ i10) * (-1005)) ^ 300251156;
                        i2 = 812574855;
                    } else {
                        iM55680 = C0873.m55680("ܺۖ") ^ i10;
                        i = ((iM55680 ^ i9) * (-24763)) ^ (-1033258687);
                        i2 = 10423768;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1416131566:
                case 1775114712:
                    sArr2 = f81981;
                    i6 = 1;
                    if (C0927.m55873() <= 0) {
                        iM55680 = (i10 - C0873.m55680("ᩴۨ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i9) * (-16113)) ^ 563551034;
                        i2 = -1792454356;
                    } else {
                        iM55680 = C0873.m55680("᩸᩵") ^ i10;
                        i = ((iM55680 ^ i9) * (-13305)) ^ (-1785944652);
                        i2 = -1468004477;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -774050638:
                case 1889433948:
                    if (C1017.f81942 >= 0) {
                        iM55680 = (i10 - C0873.m55680("ᩴۨ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i9) * (-16113)) ^ 563551034;
                        i2 = -1792454356;
                    } else {
                        iM55680 = C0873.m55680("ܿۛ") ^ i10;
                        i = ((iM55680 ^ i9) * 4043) ^ (-937914493);
                        i2 = 753147880;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -373188883:
                case 1051741826:
                    RunnableC0871.m55661(animator, C0927.m55863(sArr2, i6, i7, i5));
                    break;
                case -17090464:
                case 103069307:
                    C1071.m56343();
                    break;
                case 15647294:
                case 136047820:
                    s = sArr[c];
                    i3 = s * s;
                    if (C0866.f81837 >= 0) {
                        iM55680 = C0946.m55979("᩹᩹") ^ i10;
                        i = ((iM55680 ^ i9) * (-29627)) ^ (-15256016);
                        i2 = 957457333;
                    } else {
                        iM55680 = C0873.m55680("᩹ۘ") ^ i9;
                        i = ((iM55680 ^ i10) * 29713) ^ 694571572;
                        i2 = -1014971464;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case 381235863:
                case 1128257493:
                    i5 = 21474;
                    iM55680 = C0873.m55680("ᩳۗ") ^ i9;
                    i = ((iM55680 ^ i10) * (-3699)) ^ (-202546679);
                    i2 = 1063759007;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case 831974237:
                case 1836818106:
                    if (!C0863.m55643()) {
                        iM55680 = (C0873.m55680("ܺۧ") + i9) * 99;
                        i = ((iM55680 ^ i10) * (-13785)) ^ (-146635104);
                        i2 = 284757628;
                        i12 = iM55680 ^ i2;
                        i11 = i;
                    }
                    iM55680 = C0946.m55979("ܰ᩹") ^ i9;
                    i = ((iM55680 ^ i10) * (-1005)) ^ 300251156;
                    i2 = 812574855;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case 881835391:
                case 1724161613:
                    C1028.m56247();
                    C0947.m55997();
                    break;
                default:
                    if (C1012.m56134() <= 0) {
                        iM55680 = C0946.m55979("ܰ᩹") ^ i9;
                        i = ((iM55680 ^ i10) * (-1005)) ^ 300251156;
                        i2 = 812574855;
                    } else {
                        iM55680 = (C0873.m55680("֨᩶") + i9) * (-99);
                        i = ((iM55680 ^ i10) * 6341) ^ 1416358487;
                        i2 = 186780913;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        if (p067l.C0930.f81879 > 0) goto L15;
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAnimationStart(Animator animator) {
        int i;
        int i2;
        int iM55979;
        int i3;
        int i4;
        int iM559710;
        int i5;
        int i6;
        int iM55680;
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
        int i18 = C0863.f81833;
        int i19 = ServiceConnectionC1013.f81940;
        int iM55681 = (i18 - C0873.m55680("ۘᩴ")) * 123;
        int i20 = ((iM55681 ^ i19) * 2057) ^ 326501267;
        int i21 = iM55681 ^ (-161457731);
        short[] sArr2 = null;
        while (true) {
            i17 = i21 ^ (i20 & (((i17 ^ i19) * (-13557)) >> 31));
            switch (i17) {
                case -1899559224:
                case -1623486930:
                    C1025.m56218(animator, C0947.m55993(sArr, i15, i16, i14));
                    break;
                case -1796851008:
                case -257009517:
                    i2 = i11;
                    i10 = s + s2;
                    if (C0845.f81821 >= 0) {
                        iM559710 = (i18 - C0873.m55680("ܳۚ")) * (-77);
                        i5 = ((iM559710 ^ i19) * (-1117)) ^ (-606047143);
                        i6 = -592107609;
                    } else {
                        iM559710 = C0873.m55680("ۨܳ") ^ i18;
                        i5 = ((iM559710 ^ i19) * (-13133)) ^ (-1260453778);
                        i6 = -1545907319;
                    }
                    i21 = iM559710 ^ i6;
                    i20 = i5;
                    i11 = i2;
                    break;
                case -1722220226:
                case -1321337348:
                    i = i10;
                    i2 = i11;
                    sArr2 = f81981;
                    if (C1025.f81947 < 0) {
                        iM55979 = (C0946.m55979("ܽ۬") ^ i19) * (-47);
                        i3 = ((iM55979 ^ i18) * 12829) ^ 1905301266;
                        i4 = -2008834023;
                        i21 = iM55979 ^ i4;
                        i20 = i3;
                        i11 = i2;
                        i10 = i;
                    } else {
                        i11 = i2;
                        iM55680 = C0873.m55680("ܶۗ") ^ i19;
                        i7 = ((iM55680 ^ i18) * (-327)) ^ (-1559547674);
                        i8 = -2005573871;
                        i21 = iM55680 ^ i8;
                        i20 = i7;
                        i10 = i;
                    }
                    break;
                case -1405422924:
                case -95466511:
                    C0989.m56095();
                    C0861.m55626();
                    break;
                case -1385471635:
                case -985625594:
                    i = i10;
                    i2 = i11;
                    if (C1053.f81965 > 0) {
                        iM55979 = C0946.m55979("᩺۬") ^ i18;
                        i3 = ((iM55979 ^ i19) * 32269) ^ (-989540315);
                        i4 = -2119075443;
                        i21 = iM55979 ^ i4;
                        i20 = i3;
                        i11 = i2;
                        i10 = i;
                    } else {
                        i10 = i;
                        iM559710 = (i18 - C0873.m55680("ܳۚ")) * (-77);
                        i5 = ((iM559710 ^ i19) * (-1117)) ^ (-606047143);
                        i6 = -592107609;
                        i21 = iM559710 ^ i6;
                        i20 = i5;
                        i11 = i2;
                    }
                    break;
                case -1326730916:
                case -1170671304:
                    i9 = 53307;
                    int iM559711 = C0946.m55979("۠֨") ^ i19;
                    int i22 = i9;
                    i21 = iM559711 ^ 134463211;
                    i20 = ((iM559711 ^ i18) * (-26671)) ^ (-1655372889);
                    i14 = i22;
                    break;
                case -1154429501:
                case -436667357:
                    i11 = i10 * i10;
                    i12 = s * s;
                    if (C1404.m56468()) {
                        iM55680 = (i19 - C0873.m55680("ۚۛ")) * 89;
                        i = i10;
                        i7 = ((iM55680 ^ i18) * 26249) ^ (-879437653);
                        i8 = 1823242100;
                    } else {
                        i = i10;
                        iM55680 = C0873.m55680("ܶۗ") ^ i19;
                        i7 = ((iM55680 ^ i18) * (-327)) ^ (-1559547674);
                        i8 = -2005573871;
                    }
                    i21 = iM55680 ^ i8;
                    i20 = i7;
                    i10 = i;
                    break;
                case -666763565:
                case 1456363313:
                    i = i10;
                    i2 = i11;
                    s = sArr2[c];
                    s2 = 2216;
                    if (C1194.m56396() <= 0) {
                        iM55979 = (i19 - C0873.m55680("ۘۚ")) * 27;
                        i3 = ((iM55979 ^ i18) * 4031) ^ (-19413024);
                        i4 = 1379220270;
                    } else {
                        iM55979 = C0946.m55979("ۜܶ") ^ i19;
                        i3 = ((iM55979 ^ i18) * 6931) ^ 2045071074;
                        i4 = 475625017;
                    }
                    i21 = iM55979 ^ i4;
                    i20 = i3;
                    i11 = i2;
                    i10 = i;
                    break;
                case -616730371:
                case -453734061:
                    sArr = f81981;
                    if (C0894.m55769() >= 0) {
                        i = i10;
                        i2 = i11;
                        i15 = 55;
                        iM55979 = (i18 - C0873.m55680("ܰܽ")) * (-97);
                        i3 = ((iM55979 ^ i19) * 24047) ^ 1028643609;
                        i4 = 2004986386;
                        i21 = iM55979 ^ i4;
                        i20 = i3;
                        i11 = i2;
                        i10 = i;
                    } else {
                        int iM559712 = (C0946.m55979("᩸ۖ") ^ i18) * (-111);
                        i21 = iM559712 ^ (-572830742);
                        i20 = ((iM559712 ^ i19) * 32579) ^ 1115618704;
                        i15 = 55;
                    }
                    break;
                case -557983994:
                case 251057466:
                    i = i10;
                    i2 = i11;
                    if (C0955.f81898) {
                        iM55979 = (i18 - C0873.m55680("ܰܽ")) * (-97);
                        i3 = ((iM55979 ^ i19) * 24047) ^ 1028643609;
                        i4 = 2004986386;
                    } else {
                        iM55979 = (C0873.m55680("ۤ᩶") ^ i19) * 73;
                        i3 = ((iM55979 ^ i18) * 22521) ^ (-1410131664);
                        i4 = 1462764788;
                    }
                    i21 = iM55979 ^ i4;
                    i20 = i3;
                    i11 = i2;
                    i10 = i;
                    break;
                case -486767926:
                case 1563897705:
                    if (C0930.f81879 > 0) {
                        i = i10;
                        iM55680 = C0873.m55680("ܶۗ") ^ i19;
                        i7 = ((iM55680 ^ i18) * (-327)) ^ (-1559547674);
                        i8 = -2005573871;
                        i21 = iM55680 ^ i8;
                        i20 = i7;
                        i10 = i;
                    } else {
                        int iM55682 = (i19 - C0873.m55680("ᩴۨ")) * (-53);
                        i21 = iM55682 ^ (-1269402955);
                        i20 = ((iM55682 ^ i18) * (-10519)) ^ 771035148;
                    }
                    break;
                case -479470416:
                case 1157830369:
                    C0937.m55918();
                    if (C1044.f81959 >= 0) {
                        i = i10;
                        i2 = i11;
                        iM55979 = (i18 - C0873.m55680("ܰܽ")) * (-97);
                        i3 = ((iM55979 ^ i19) * 24047) ^ 1028643609;
                        i4 = 2004986386;
                        i21 = iM55979 ^ i4;
                        i20 = i3;
                        i11 = i2;
                        i10 = i;
                    }
                    i = i10;
                    i2 = i11;
                    iM55979 = (i19 - C0873.m55680("ۘۚ")) * 27;
                    i3 = ((iM55979 ^ i18) * 4031) ^ (-19413024);
                    i4 = 1379220270;
                    i21 = iM55979 ^ i4;
                    i20 = i3;
                    i11 = i2;
                    i10 = i;
                    break;
                case -396572810:
                case 1686260736:
                    C0946.m55980();
                    C1028.m56247();
                    i = i10;
                    i2 = i11;
                    iM55979 = (i19 - C0873.m55680("ۘۚ")) * 27;
                    i3 = ((iM55979 ^ i18) * 4031) ^ (-19413024);
                    i4 = 1379220270;
                    i21 = iM55979 ^ i4;
                    i20 = i3;
                    i11 = i2;
                    i10 = i;
                    break;
                case -286751451:
                case 1164516168:
                    if (C1024.f81946) {
                        i = i10;
                        i2 = i11;
                        i16 = 9;
                        iM55979 = (i18 - C0873.m55680("ܰܽ")) * (-97);
                        i3 = ((iM55979 ^ i19) * 24047) ^ 1028643609;
                        i4 = 2004986386;
                        i21 = iM55979 ^ i4;
                        i20 = i3;
                        i11 = i2;
                        i10 = i;
                    } else {
                        int iM55683 = C0873.m55680("ۖۡ") ^ i18;
                        i21 = iM55683 ^ (-2016405532);
                        i20 = ((iM55683 ^ i19) * (-24489)) ^ 1562360784;
                        i16 = 9;
                    }
                    break;
                case -153090442:
                case 1415702546:
                    i = i10;
                    i2 = i11;
                    c = '6';
                    if (C0845.f81821 < 0) {
                        iM55979 = C0873.m55680("۠ۙ") ^ i18;
                        i3 = ((iM55979 ^ i19) * (-11927)) ^ 1761828138;
                        i4 = -1062574549;
                        i21 = iM55979 ^ i4;
                        i20 = i3;
                        i11 = i2;
                        i10 = i;
                    } else {
                        i10 = i;
                        iM559710 = (i18 - C0873.m55680("ܳۚ")) * (-77);
                        i5 = ((iM559710 ^ i19) * (-1117)) ^ (-606047143);
                        i6 = -592107609;
                        i21 = iM559710 ^ i6;
                        i20 = i5;
                        i11 = i2;
                    }
                    break;
                case -122458722:
                case 224170947:
                    RunnableC0938.m55938();
                    break;
                case 39427944:
                case 267856483:
                    int i23 = i12 + i13;
                    if (i11 - (i23 + i23) > 0) {
                        iM559710 = (C0946.m55979("֨۠") + i19) * 85;
                        i2 = i11;
                        i5 = ((iM559710 ^ i18) * 8237) ^ (-1227483573);
                        i6 = -1957687151;
                    } else {
                        i2 = i11;
                        iM559710 = (C0873.m55680("֫ܺ") + i18) * (-53);
                        i5 = ((iM559710 ^ i19) * (-3489)) ^ (-1484497020);
                        i6 = 1830664296;
                    }
                    i21 = iM559710 ^ i6;
                    i20 = i5;
                    i11 = i2;
                    break;
                case 409961543:
                case 633400921:
                    i9 = 55244;
                    int iM559713 = C0946.m55979("۠֨") ^ i19;
                    int i24 = i9;
                    i21 = iM559713 ^ 134463211;
                    i20 = ((iM559713 ^ i18) * (-26671)) ^ (-1655372889);
                    i14 = i24;
                    break;
                default:
                    i2 = i11;
                    i13 = 4910656;
                    if (C1194.m56396() > 0) {
                        iM559710 = C0946.m55979("ۙۛ") ^ i18;
                        i5 = ((iM559710 ^ i19) * 21415) ^ 2018742062;
                        i6 = 387756608;
                        i21 = iM559710 ^ i6;
                        i20 = i5;
                        i11 = i2;
                    } else {
                        i = i10;
                        iM55979 = (i19 - C0873.m55680("ۘۚ")) * 27;
                        i3 = ((iM55979 ^ i18) * 4031) ^ (-19413024);
                        i4 = 1379220270;
                        i21 = iM55979 ^ i4;
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
        int iM55680;
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
        int i9 = C1046.f81962;
        int i10 = C1017.f81942;
        int iM55681 = (i9 - C0873.m55680("ۚۜ")) * 15;
        int i11 = ((iM55681 ^ i10) * (-32211)) ^ (-68844726);
        int i12 = iM55681 ^ 1397717962;
        while (true) {
            i8 = ((((i8 ^ i10) * (-18271)) >> 31) & i11) ^ i12;
            switch (i8) {
                case -2046165052:
                case 526990878:
                    if ((s * s2) - i4 > 0) {
                        iM55680 = (C0946.m55979("۬᩵") ^ i9) * 89;
                        i = ((iM55680 ^ i10) * 11721) ^ (-1601901062);
                        i2 = -1627432940;
                    } else {
                        iM55680 = (i10 - C0873.m55680("ۗ֨")) * (-41);
                        i = ((iM55680 ^ i9) * 11869) ^ 415326837;
                        i2 = -1784766945;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1894110291:
                case 1837170168:
                    sArr = f81981;
                    if (C0927.f81875) {
                        iM55680 = C0946.m55979("ܿ֫") ^ i9;
                        i = ((iM55680 ^ i10) * 7521) ^ (-1336885842);
                        i2 = -1317273852;
                    } else {
                        iM55680 = (C0946.m55979("᩵ܰ") + i9) * (-19);
                        i = ((iM55680 ^ i10) * (-20817)) ^ (-612197505);
                        i2 = 1392683156;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1876693874:
                case -599314479:
                    s = sArr[c];
                    i3 = s * s;
                    if (C0992.f81922 >= 0) {
                        iM55680 = (C0946.m55979("ۨܰ") ^ i10) * (-121);
                        i = ((iM55680 ^ i9) * 1203) ^ (-881428630);
                        i2 = -674842182;
                    } else {
                        iM55680 = (C0873.m55680("᩹ܿ") + i9) * (-101);
                        i = ((iM55680 ^ i10) * 20801) ^ 476056986;
                        i2 = 359222338;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1799656494:
                case -569024630:
                    i7 = 9;
                    if (C0882.f81846) {
                        iM55680 = (C0946.m55979("۫֨") + i9) * (-85);
                        i = ((iM55680 ^ i10) * 565) ^ (-1232886575);
                        i2 = 1675619659;
                    } else {
                        iM55680 = C0946.m55979("ۙ᩷") ^ i9;
                        i = ((iM55680 ^ i10) * 30861) ^ (-1057468376);
                        i2 = -1190989241;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1292290198:
                case -842474172:
                    i5 = 43488;
                    iM55680 = C0873.m55680("ܶۚ") ^ i10;
                    i = ((iM55680 ^ i9) * 8087) ^ (-2025269317);
                    i2 = -918603048;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1183388518:
                case 1872745551:
                    s2 = 11500;
                    if (C1003.f81929 <= 0) {
                        iM55680 = (C0946.m55979("ۨܰ") ^ i10) * (-121);
                        i = ((iM55680 ^ i9) * 1203) ^ (-881428630);
                        i2 = -674842182;
                    } else {
                        iM55680 = (C0946.m55979("ܳ۟") ^ i9) * (-79);
                        i = ((iM55680 ^ i10) * 15337) ^ 409220355;
                        i2 = -1311016705;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -1042897163:
                case 149589940:
                    if (C0949.f81897 >= 0) {
                        iM55680 = (C0946.m55979("۫֨") + i9) * (-85);
                        i = ((iM55680 ^ i10) * 565) ^ (-1232886575);
                        i2 = 1675619659;
                        i12 = iM55680 ^ i2;
                        i11 = i;
                    }
                    iM55680 = C0873.m55680("۟۟") ^ i10;
                    i = ((iM55680 ^ i9) * 18369) ^ 1622229311;
                    i2 = 785760488;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -953495743:
                case -573655730:
                    c = ',';
                    if (C0866.f81837 >= 0) {
                        iM55680 = C0946.m55979("᩸ᩳ") ^ i10;
                        i = ((iM55680 ^ i9) * (-1981)) ^ 1432305889;
                        i2 = 1038606660;
                    } else {
                        iM55680 = C0946.m55979("ۢ֡") ^ i10;
                        i = ((iM55680 ^ i9) * 16525) ^ (-407198027);
                        i2 = 234813796;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -733604323:
                case 256809938:
                    i4 = 33062500 + i3;
                    if (C1229.f82066 >= 0) {
                        iM55680 = C0873.m55680("۟۟") ^ i10;
                        i = ((iM55680 ^ i9) * 18369) ^ 1622229311;
                        i2 = 785760488;
                    } else {
                        iM55680 = (i10 - C0946.m55979("ۢۙ")) * (-17);
                        i = ((iM55680 ^ i9) * (-219)) ^ 510670103;
                        i2 = 2103122674;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -574038490:
                case 1183599905:
                    if (C0877.f81843 >= 0) {
                        iM55680 = (C0946.m55979("۫֨") + i9) * (-85);
                        i = ((iM55680 ^ i10) * 565) ^ (-1232886575);
                        i2 = 1675619659;
                    } else {
                        iM55680 = (C0873.m55680("᩵ۧ") ^ i9) * (-77);
                        i = ((iM55680 ^ i10) * 19459) ^ 1062839254;
                        i2 = 307175280;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -556406864:
                case -9693374:
                    ServiceConnectionC1013.m56157();
                    C0845.m55584();
                    break;
                case -407731217:
                case 1505678400:
                    C0930.m55885();
                    C0946.m55980();
                    iM55680 = C0873.m55680("۟۟") ^ i10;
                    i = ((iM55680 ^ i9) * 18369) ^ 1622229311;
                    i2 = 785760488;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -329407499:
                case 1838300886:
                    C1194.m56396();
                    if (C0967.f81910 < 0) {
                        iM55680 = C0946.m55979("ܿ֫") ^ i9;
                        i = ((iM55680 ^ i10) * 7521) ^ (-1336885842);
                        i2 = -1317273852;
                        i12 = iM55680 ^ i2;
                        i11 = i;
                    }
                    iM55680 = C0873.m55680("۟۟") ^ i10;
                    i = ((iM55680 ^ i9) * 18369) ^ 1622229311;
                    i2 = 785760488;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -306798445:
                case 1367739809:
                    if (C1025.m56230()) {
                        iM55680 = C0946.m55979("ܿ֫") ^ i9;
                        i = ((iM55680 ^ i10) * 7521) ^ (-1336885842);
                        i2 = -1317273852;
                    } else {
                        iM55680 = C0946.m55979("ܺۚ") ^ i10;
                        i = ((iM55680 ^ i9) * (-28361)) ^ (-1173833314);
                        i2 = -1137109166;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -301167002:
                case -146652161:
                    if (RunnableC0897.m55784()) {
                        iM55680 = (C0946.m55979("۫֨") + i9) * (-85);
                        i = ((iM55680 ^ i10) * 565) ^ (-1232886575);
                        i2 = 1675619659;
                    } else {
                        iM55680 = C0946.m55979("ᩴ֨") ^ i10;
                        i = ((iM55680 ^ i9) * (-4635)) ^ 675844783;
                        i2 = 1007457645;
                    }
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case -271874466:
                case 2120940481:
                    C1025.m56218(animator, C0894.m55773(sArr2, i6, i7, i5));
                    break;
                case -52331680:
                case 342186093:
                    i5 = 26588;
                    iM55680 = C0873.m55680("ܶۚ") ^ i10;
                    i = ((iM55680 ^ i9) * 8087) ^ (-2025269317);
                    i2 = -918603048;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                case 524182312:
                case 1293516199:
                    if (!RunnableC0897.m55784()) {
                        iM55680 = C0946.m55979("᩸ᩳ") ^ i10;
                        i = ((iM55680 ^ i9) * (-1981)) ^ 1432305889;
                        i2 = 1038606660;
                        i12 = iM55680 ^ i2;
                        i11 = i;
                    }
                    iM55680 = C0873.m55680("۟۟") ^ i10;
                    i = ((iM55680 ^ i9) * 18369) ^ 1622229311;
                    i2 = 785760488;
                    i12 = iM55680 ^ i2;
                    i11 = i;
                    break;
                default:
                    sArr2 = f81981;
                    i6 = 45;
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0946.m55979("ܿ֫") ^ i9;
                        i = ((iM55680 ^ i10) * 7521) ^ (-1336885842);
                        i2 = -1317273852;
                    } else {
                        iM55680 = C0873.m55680("᩻ᩳ") ^ i9;
                        i = ((iM55680 ^ i10) * (-19991)) ^ (-1024688411);
                        i2 = -1032733139;
                    }
                    i12 = iM55680 ^ i2;
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
        int iM55979;
        int i;
        int i2;
        short[] sArr;
        int iM559710;
        int i3;
        int iM559711;
        int i4;
        int i5;
        TextView textView;
        short[] sArr2;
        AbstractActivityC5549 abstractActivityC5549;
        int iM559712;
        int i6;
        int i7;
        short[] sArr3;
        int iM559713;
        int i8;
        int i9;
        AbstractActivityC5549 abstractActivityC55410;
        int i10;
        int i11;
        int iM559714;
        this = this;
        short s = 0;
        int i12 = -1959501726;
        int i13 = C0877.f81843;
        int i14 = C0863.f81833;
        int iM55680 = C0873.m55680("᩷᩵") ^ i13;
        int i15 = ((iM55680 ^ i14) * 14605) ^ (-472431889);
        int i16 = iM55680 ^ (-352173975);
        TextInputLayout textInputLayout = null;
        AbstractActivityC5549 abstractActivityC55411 = null;
        AbstractActivityC5549 abstractActivityC55412 = null;
        AbstractActivityC5549 abstractActivityC55413 = null;
        TextInputLayout textInputLayout2 = null;
        AbstractActivityC5549 abstractActivityC55414 = null;
        String strM55936 = null;
        String str = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        ViewOnClickListenerC5639 viewOnClickListenerC5639 = null;
        boolean z = false;
        int iM559715 = 0;
        int i17 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int iM55681 = 0;
        int iM559716 = 0;
        int iM55682 = 0;
        int iM55683 = 0;
        int iM559717 = 0;
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
                    C0912.m55833();
                    if (C1017.f81942 >= 0) {
                        iM55979 = (i13 - C0946.m55979("ܶܶ")) * 31;
                        i = ((iM55979 ^ i14) * 3995) ^ (-46647346);
                        i2 = -1322282157;
                        i16 = iM55979 ^ i2;
                        i15 = i;
                    } else {
                        viewOnClickListenerC5639 = viewOnClickListenerC5639;
                        abstractActivityC55413 = abstractActivityC55413;
                        textView2 = textView2;
                        textInputLayout3 = textInputLayout3;
                        abstractActivityC55412 = abstractActivityC55412;
                        sArr6 = sArr6;
                        z = z;
                        sArr = sArr4;
                        int iM55684 = C0873.m55680("ۡ᩶") ^ i13;
                        int i21 = ((iM55684 ^ i14) * 4297) ^ 625199219;
                        i16 = iM55684 ^ 1687771015;
                        viewOnClickListenerC5639 = viewOnClickListenerC5639;
                        sArr4 = sArr;
                        z = z;
                        abstractActivityC55413 = abstractActivityC55413;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        i15 = i21;
                        abstractActivityC55412 = abstractActivityC55412;
                        this = this;
                        textInputLayout3 = textInputLayout3;
                    }
                    break;
                case -2072740937:
                case 1120937435:
                    sArr6 = sArr6;
                    textView2 = viewOnClickListenerC5639.f13685;
                    iM55681 = C0873.m55680(C1071.m56336(f81981, 26, 3, i20));
                    iM559712 = (i14 - C0946.m55979("ۡ۟")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i6 = ((iM559712 ^ i13) * 27725) ^ (-738953421);
                    i7 = 1515735250;
                    i16 = iM559712 ^ i7;
                    i15 = i6;
                    z = z;
                    abstractActivityC55413 = abstractActivityC55413;
                    sArr6 = sArr6;
                    abstractActivityC55412 = abstractActivityC55412;
                    textInputLayout3 = textInputLayout3;
                    break;
                case -2056425564:
                case -855349830:
                    iM559715 = 2116953319 ^ C0946.m55979(str);
                    if (!C0892.m55749()) {
                        viewOnClickListenerC5639 = viewOnClickListenerC5639;
                        abstractActivityC55413 = abstractActivityC55413;
                        textView2 = textView2;
                        textInputLayout3 = textInputLayout3;
                        abstractActivityC55412 = abstractActivityC55412;
                        sArr6 = sArr6;
                        z = z;
                        sArr = sArr4;
                        int iM55685 = C0873.m55680("ۡ᩶") ^ i13;
                        int i22 = ((iM55685 ^ i14) * 4297) ^ 625199219;
                        i16 = iM55685 ^ 1687771015;
                        viewOnClickListenerC5639 = viewOnClickListenerC5639;
                        sArr4 = sArr;
                        z = z;
                        abstractActivityC55413 = abstractActivityC55413;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        i15 = i22;
                        abstractActivityC55412 = abstractActivityC55412;
                        this = this;
                        textInputLayout3 = textInputLayout3;
                    } else {
                        iM55979 = (C0946.m55979("ۙᩳ") ^ i13) * (-123);
                        i = ((iM55979 ^ i14) * 10533) ^ (-1509352141);
                        i2 = -410338762;
                        i16 = iM55979 ^ i2;
                        i15 = i;
                    }
                    break;
                case -2001880470:
                case 1351988803:
                    viewOnClickListenerC5639.f13682.setErrorEnabled(z2);
                    viewOnClickListenerC5639.f13689.setErrorEnabled(z2);
                    C1964.m56585(this.f18159);
                    break;
                case -1982815911:
                case 1536421802:
                    abstractActivityC55413 = abstractActivityC55413;
                    textView = textView2;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC55412 = abstractActivityC55412;
                    sArr2 = sArr6;
                    boolean z5 = z;
                    short[] sArr8 = sArr4;
                    int i23 = i18;
                    int iM55686 = C0873.m55680(C1012.m56144(sArr8, i23, 3, i20)) ^ 2099869265;
                    sArr5 = f81981;
                    if (C1194.m56396() > 0) {
                        int iM559718 = C0946.m55979("֫ܳ") ^ i14;
                        i15 = ((iM559718 ^ i13) * 11621) ^ (-1075989726);
                        i16 = iM559718 ^ 897896207;
                        textView2 = textView;
                        sArr4 = sArr8;
                        i18 = i23;
                        z = z5;
                        abstractActivityC55413 = abstractActivityC55413;
                        sArr6 = sArr2;
                        i17 = iM55686;
                        abstractActivityC55412 = abstractActivityC55412;
                        textInputLayout3 = textInputLayout3;
                    } else {
                        sArr4 = sArr8;
                        i18 = i23;
                        z = z5;
                        i17 = iM55686;
                        iM559714 = (C0946.m55979("ۙۤ") ^ i14) * (-31);
                        i11 = ((iM559714 ^ i13) * 13083) ^ 352965807;
                        i10 = 2079459180;
                        i16 = iM559714 ^ i10;
                        i15 = i11;
                        viewOnClickListenerC5639 = viewOnClickListenerC5639;
                        abstractActivityC55412 = abstractActivityC55412;
                        sArr6 = sArr2;
                        textView2 = textView;
                        textInputLayout3 = textInputLayout3;
                        abstractActivityC55413 = abstractActivityC55413;
                    }
                    break;
                case -1973966064:
                case 1508631080:
                    if (C0992.f81922 >= 0) {
                        viewOnClickListenerC5639 = viewOnClickListenerC5639;
                        abstractActivityC55413 = abstractActivityC55413;
                        textView2 = textView2;
                        textInputLayout3 = textInputLayout3;
                        abstractActivityC55412 = abstractActivityC55412;
                        sArr6 = sArr6;
                        z = z;
                        sArr = sArr4;
                        int iM55687 = C0873.m55680("ۡ᩶") ^ i13;
                        int i24 = ((iM55687 ^ i14) * 4297) ^ 625199219;
                        i16 = iM55687 ^ 1687771015;
                        viewOnClickListenerC5639 = viewOnClickListenerC5639;
                        sArr4 = sArr;
                        z = z;
                        abstractActivityC55413 = abstractActivityC55413;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        i15 = i24;
                        abstractActivityC55412 = abstractActivityC55412;
                        this = this;
                        textInputLayout3 = textInputLayout3;
                    } else {
                        iM55979 = (C0873.m55680("᩶᩵") + i14) * 81;
                        i = ((iM55979 ^ i13) * (-28967)) ^ 1831876794;
                        i2 = -763501533;
                        i16 = iM55979 ^ i2;
                        i15 = i;
                    }
                    break;
                case -1963949812:
                case 822213091:
                    C1046.m56302();
                    break;
                case -1850781832:
                case 1991383898:
                    AbstractActivityC5549 abstractActivityC55415 = abstractActivityC55413;
                    TextView textView4 = textView2;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC55412 = abstractActivityC55412;
                    short s3 = s2;
                    short[] sArr9 = sArr6;
                    ViewOnClickListenerC5639 viewOnClickListenerC56310 = viewOnClickListenerC5639;
                    boolean z6 = z;
                    short[] sArr10 = sArr4;
                    int i25 = s3 + s;
                    if ((s3 * 29040) - (i25 * i25) > 0) {
                        iM559711 = C0873.m55680("ۙ۬") ^ i14;
                        i4 = ((iM559711 ^ i13) * (-13711)) ^ 855093113;
                        i5 = -838205654;
                    } else {
                        iM559711 = (C0946.m55979("۬ᩳ") ^ i13) * (-17);
                        i4 = ((iM559711 ^ i14) * 32241) ^ 1689576411;
                        i5 = -1785137771;
                    }
                    i16 = iM559711 ^ i5;
                    s2 = s3;
                    i15 = i4;
                    sArr4 = sArr10;
                    viewOnClickListenerC5639 = viewOnClickListenerC56310;
                    z = z6;
                    abstractActivityC55413 = abstractActivityC55415;
                    sArr6 = sArr9;
                    textView2 = textView4;
                    this = this;
                    abstractActivityC55412 = abstractActivityC55412;
                    textInputLayout3 = textInputLayout3;
                    break;
                case -1745169217:
                case -416936900:
                    abstractActivityC55413 = abstractActivityC55413;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC55412 = abstractActivityC55412;
                    sArr6 = sArr6;
                    z = z;
                    TextView textView5 = textView2;
                    C0873.m55684(textView5, iM55681 ^ 2118256484);
                    textInputLayout = viewOnClickListenerC5639.f13682;
                    if (RunnableC1014.f81941 > 0) {
                        int iM55688 = (i13 - C0873.m55680("ۙۨ")) * (-121);
                        i16 = iM55688 ^ (-1645780364);
                        textView2 = textView5;
                        i15 = ((iM55688 ^ i14) * 6621) ^ (-846473533);
                        z = z;
                        abstractActivityC55413 = abstractActivityC55413;
                        sArr6 = sArr6;
                        abstractActivityC55412 = abstractActivityC55412;
                        textInputLayout3 = textInputLayout3;
                    } else {
                        textView2 = textView5;
                        sArr = sArr4;
                        int iM55689 = C0873.m55680("ۡ᩶") ^ i13;
                        int i26 = ((iM55689 ^ i14) * 4297) ^ 625199219;
                        i16 = iM55689 ^ 1687771015;
                        viewOnClickListenerC5639 = viewOnClickListenerC5639;
                        sArr4 = sArr;
                        z = z;
                        abstractActivityC55413 = abstractActivityC55413;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        i15 = i26;
                        abstractActivityC55412 = abstractActivityC55412;
                        this = this;
                        textInputLayout3 = textInputLayout3;
                    }
                    break;
                case -1714720531:
                case -88950992:
                    textView3 = viewOnClickListenerC5639.f13685;
                    abstractActivityC55413 = abstractActivityC55413;
                    iM55682 = C0873.m55680(C0917.m55852(f81981, 35, 3, i20));
                    int iM559719 = C0946.m55979("᩷ۤ") ^ i14;
                    i16 = iM559719 ^ 1384744763;
                    i15 = ((iM559719 ^ i13) * 16493) ^ 427747504;
                    abstractActivityC55413 = abstractActivityC55413;
                    break;
                case -1373517627:
                case 1644145708:
                    EditText editTextM55882 = C0930.m55882(viewOnClickListenerC5639.f13689);
                    C0949.m56008(editTextM55882);
                    editTextM55882.setInputType(33);
                    viewOnClickListenerC5639.f13689.setEndIconVisible(z2);
                    iM55979 = (C0873.m55680("۬ۤ") + i13) * 97;
                    i = ((iM55979 ^ i14) * (-8273)) ^ 2102788965;
                    i2 = 1692497183;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    break;
                case -1362752582:
                case 1247936375:
                    C0946.m55976(textView3, iM55682 ^ 2128578606);
                    textInputLayout4 = viewOnClickListenerC5639.f13682;
                    if (C1036.m56257() <= 0) {
                        iM55979 = (i13 - C0946.m55979("ܶܶ")) * 31;
                        i = ((iM55979 ^ i14) * 3995) ^ (-46647346);
                        i2 = -1322282157;
                    } else {
                        iM55979 = C0873.m55680("ۤ֡") ^ i13;
                        i = ((iM55979 ^ i14) * 9493) ^ 1659027191;
                        i2 = -826568970;
                    }
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    break;
                case -1171045876:
                case 2000080688:
                    abstractActivityC55413 = abstractActivityC55413;
                    textView = textView2;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC55412 = abstractActivityC55412;
                    sArr2 = sArr6;
                    z = true;
                    viewOnClickListenerC5639.f13680 = !z3;
                    z4 = viewOnClickListenerC5639.f13680;
                    sArr4 = f81981;
                    i18 = 20;
                    if (C0882.f81846) {
                        iM559714 = (C0946.m55979("ۙۤ") ^ i14) * (-31);
                        i11 = ((iM559714 ^ i13) * 13083) ^ 352965807;
                        i10 = 2079459180;
                    } else {
                        iM559714 = C0873.m55680("ܽܳ") ^ i13;
                        i11 = ((iM559714 ^ i14) * (-24063)) ^ (-890413959);
                        i10 = -706997727;
                    }
                    i16 = iM559714 ^ i10;
                    i15 = i11;
                    viewOnClickListenerC5639 = viewOnClickListenerC5639;
                    abstractActivityC55412 = abstractActivityC55412;
                    sArr6 = sArr2;
                    textView2 = textView;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC55413 = abstractActivityC55413;
                    break;
                case -1010017504:
                case 651776782:
                    abstractActivityC55410 = abstractActivityC55412;
                    textInputLayout3 = textInputLayout3;
                    textInputLayout3.setHint(C0845.m55590(abstractActivityC55410, iM559716 ^ 2119941246));
                    C0873.m55684(viewOnClickListenerC5639.f13688, i17);
                    C0946.m55976(viewOnClickListenerC5639.f13686, i19);
                    int iM556810 = C0873.m55680("ۜۛ") ^ i14;
                    abstractActivityC5549 = abstractActivityC55410;
                    i16 = iM556810 ^ 747920563;
                    i15 = ((iM556810 ^ i13) * 12797) ^ 1614741561;
                    abstractActivityC55412 = abstractActivityC5549;
                    abstractActivityC55413 = abstractActivityC55413;
                    textInputLayout3 = textInputLayout3;
                    break;
                case -971784059:
                case 1475780480:
                    textInputLayout2.setHint(C0845.m55590(abstractActivityC55414, iM55683 ^ 2130704234));
                    C0873.m55684(viewOnClickListenerC5639.f13688, i19);
                    C0946.m55976(viewOnClickListenerC5639.f13686, i17);
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC55410 = abstractActivityC55412;
                    int iM556811 = C0873.m55680("ۜۛ") ^ i14;
                    abstractActivityC5549 = abstractActivityC55410;
                    i16 = iM556811 ^ 747920563;
                    i15 = ((iM556811 ^ i13) * 12797) ^ 1614741561;
                    abstractActivityC55412 = abstractActivityC5549;
                    abstractActivityC55413 = abstractActivityC55413;
                    textInputLayout3 = textInputLayout3;
                    break;
                case -956154130:
                case 360784187:
                    abstractActivityC55413 = abstractActivityC55413;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC55412 = abstractActivityC55412;
                    z = z;
                    sArr3 = sArr6;
                    iM559717 = C0946.m55979(strM55936) ^ 2099621244;
                    if (C1036.f81953 < 0) {
                        iM559713 = C0946.m55979("ܰۢ") ^ i13;
                        i8 = ((iM559713 ^ i14) * 21827) ^ 1761417588;
                        i9 = -1739945109;
                        i16 = iM559713 ^ i9;
                        i15 = i8;
                        sArr6 = sArr3;
                        z = z;
                        abstractActivityC55413 = abstractActivityC55413;
                        abstractActivityC55412 = abstractActivityC55412;
                        textInputLayout3 = textInputLayout3;
                    } else {
                        sArr2 = sArr3;
                        textView = textView2;
                        z = z;
                        iM559714 = (C0946.m55979("ۙۤ") ^ i14) * (-31);
                        i11 = ((iM559714 ^ i13) * 13083) ^ 352965807;
                        i10 = 2079459180;
                        i16 = iM559714 ^ i10;
                        i15 = i11;
                        viewOnClickListenerC5639 = viewOnClickListenerC5639;
                        abstractActivityC55412 = abstractActivityC55412;
                        sArr6 = sArr2;
                        textView2 = textView;
                        textInputLayout3 = textInputLayout3;
                        abstractActivityC55413 = abstractActivityC55413;
                    }
                    break;
                case -895596462:
                case 1258404849:
                    abstractActivityC55413 = abstractActivityC55413;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC55412 = abstractActivityC55412;
                    sArr6 = sArr6;
                    z = z;
                    sArr = sArr4;
                    textView2 = textView2;
                    RunnableC0871.m55661(animator, C0866.m55652(f81981, 11, 9, i20));
                    viewOnClickListenerC5639 = this.f18160;
                    z3 = viewOnClickListenerC5639.f13680;
                    if (C0894.f81854 >= 0) {
                        int iM556812 = C0873.m55680("ۡ᩶") ^ i13;
                        int i27 = ((iM556812 ^ i14) * 4297) ^ 625199219;
                        i16 = iM556812 ^ 1687771015;
                        viewOnClickListenerC5639 = viewOnClickListenerC5639;
                        sArr4 = sArr;
                        z = z;
                        abstractActivityC55413 = abstractActivityC55413;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        i15 = i27;
                        abstractActivityC55412 = abstractActivityC55412;
                        this = this;
                    } else {
                        int iM556813 = (C0873.m55680("ۡۧ") + i14) * 47;
                        i16 = iM556813 ^ 694876709;
                        viewOnClickListenerC5639 = viewOnClickListenerC5639;
                        i15 = ((iM556813 ^ i13) * 7617) ^ (-1284136952);
                        sArr4 = sArr;
                        z = z;
                        abstractActivityC55413 = abstractActivityC55413;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        abstractActivityC55412 = abstractActivityC55412;
                    }
                    textInputLayout3 = textInputLayout3;
                    break;
                case -791561463:
                case 405314896:
                    C0955.m56025();
                    C1964.m56597();
                    iM55979 = (C0873.m55680("᩶᩵") + i14) * 81;
                    i = ((iM55979 ^ i13) * (-28967)) ^ 1831876794;
                    i2 = -763501533;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    break;
                case -689805544:
                case 791823582:
                    i20 = 59188;
                    iM559710 = C0946.m55979("ۖۚ") ^ i13;
                    i15 = ((iM559710 ^ i14) * 23465) ^ 1827086907;
                    i3 = -984712408;
                    i16 = iM559710 ^ i3;
                    sArr4 = sArr4;
                    viewOnClickListenerC5639 = viewOnClickListenerC5639;
                    z = z;
                    abstractActivityC55413 = abstractActivityC55413;
                    sArr6 = sArr6;
                    textView2 = textView2;
                    abstractActivityC55412 = abstractActivityC55412;
                    textInputLayout3 = textInputLayout3;
                    break;
                case -687441697:
                case 422155987:
                    i20 = 51610;
                    iM559710 = C0946.m55979("ۖۚ") ^ i13;
                    i15 = ((iM559710 ^ i14) * 23465) ^ 1827086907;
                    i3 = -984712408;
                    i16 = iM559710 ^ i3;
                    sArr4 = sArr4;
                    viewOnClickListenerC5639 = viewOnClickListenerC5639;
                    z = z;
                    abstractActivityC55413 = abstractActivityC55413;
                    sArr6 = sArr6;
                    textView2 = textView2;
                    abstractActivityC55412 = abstractActivityC55412;
                    textInputLayout3 = textInputLayout3;
                    break;
                case -522763971:
                case 1666992128:
                    iM55683 = C0873.m55680(C1017.m56189(sArr7, 41, 3, i20));
                    if (C0906.f81862 >= 0) {
                        iM55979 = (i13 - C0946.m55979("ܶܶ")) * 31;
                        i = ((iM55979 ^ i14) * 3995) ^ (-46647346);
                        i2 = -1322282157;
                    } else {
                        iM55979 = C0946.m55979("ܳ۫") ^ i13;
                        i = ((iM55979 ^ i14) * (-18655)) ^ (-517921663);
                        i2 = -642161787;
                    }
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    break;
                case -449167358:
                case 584194200:
                    abstractActivityC55413 = abstractActivityC55413;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC55412 = abstractActivityC55412;
                    z = z;
                    sArr3 = sArr6;
                    iM559716 = C0946.m55979(C1929.m56558(sArr3, 32, 3, i20));
                    if (C0854.f81826 == 0) {
                        iM559713 = C0873.m55680("ۡ᩻") ^ i13;
                        i8 = ((iM559713 ^ i14) * (-13797)) ^ (-1043515476);
                        i9 = 1300475527;
                        i16 = iM559713 ^ i9;
                        i15 = i8;
                        sArr6 = sArr3;
                        z = z;
                        abstractActivityC55413 = abstractActivityC55413;
                        abstractActivityC55412 = abstractActivityC55412;
                        textInputLayout3 = textInputLayout3;
                    } else {
                        sArr6 = sArr3;
                        textView2 = textView2;
                        sArr = sArr4;
                        int iM556814 = C0873.m55680("ۡ᩶") ^ i13;
                        int i28 = ((iM556814 ^ i14) * 4297) ^ 625199219;
                        i16 = iM556814 ^ 1687771015;
                        viewOnClickListenerC5639 = viewOnClickListenerC5639;
                        sArr4 = sArr;
                        z = z;
                        abstractActivityC55413 = abstractActivityC55413;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        i15 = i28;
                        abstractActivityC55412 = abstractActivityC55412;
                        this = this;
                        textInputLayout3 = textInputLayout3;
                    }
                    break;
                case -915840:
                case 762264294:
                    abstractActivityC55413 = abstractActivityC55413;
                    TextView textView6 = textView2;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC5549 = abstractActivityC55412;
                    short[] sArr11 = sArr6;
                    boolean z7 = z;
                    short[] sArr12 = sArr5;
                    int iM556815 = C0873.m55680(C1024.m56203(sArr12, 23, 3, i20)) ^ 2126477062;
                    if (z4) {
                        int iM556816 = C0873.m55680("ۡۢ") ^ i13;
                        i15 = ((iM556816 ^ i14) * (-7809)) ^ (-1409125986);
                        i16 = iM556816 ^ 1962766604;
                    } else {
                        int iM556817 = C0873.m55680("ۖ۟") ^ i13;
                        i16 = iM556817 ^ 171686755;
                        i15 = ((iM556817 ^ i14) * 16691) ^ 245040643;
                    }
                    sArr5 = sArr12;
                    i19 = iM556815;
                    z = z7;
                    sArr6 = sArr11;
                    textView2 = textView6;
                    abstractActivityC55412 = abstractActivityC5549;
                    abstractActivityC55413 = abstractActivityC55413;
                    textInputLayout3 = textInputLayout3;
                    break;
                case 5996692:
                case 1089753046:
                    AbstractActivityC5549 abstractActivityC55416 = viewOnClickListenerC5639.f13687;
                    String strM55783 = RunnableC0897.m55783(f81981, 38, 3, i20);
                    int iM559720 = C0946.m55979("᩺ۗ") ^ i14;
                    i = ((iM559720 ^ i13) * 21521) ^ (-1526279025);
                    i16 = iM559720 ^ (-1652222152);
                    abstractActivityC55413 = abstractActivityC55416;
                    str = strM55783;
                    i15 = i;
                    break;
                case 164170275:
                case 880788685:
                    z2 = false;
                    if (viewOnClickListenerC5639.f13680) {
                        iM55979 = C0873.m55680("ۘ֡") ^ i13;
                        i = ((iM55979 ^ i14) * (-1811)) ^ (-1650787880);
                        i2 = 544082705;
                    } else {
                        iM55979 = (i14 - C0946.m55979("ۤ᩻")) * (-35);
                        i = ((iM55979 ^ i13) * 32151) ^ (-2126940794);
                        i2 = -1658670785;
                    }
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    break;
                case 181672765:
                case 1550543858:
                    EditText editTextM55656 = C0866.m55656(viewOnClickListenerC5639.f13689);
                    C0877.m55699(editTextM55656);
                    editTextM55656.setInputType(129);
                    viewOnClickListenerC5639.f13689.setEndIconVisible(z);
                    iM55979 = (C0873.m55680("۬ۤ") + i13) * 97;
                    i = ((iM55979 ^ i14) * (-8273)) ^ 2102788965;
                    i2 = 1692497183;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    break;
                case 354077388:
                case 2015349237:
                    textInputLayout4.setHint(C0863.m55638(abstractActivityC55413, iM559715));
                    textInputLayout2 = viewOnClickListenerC5639.f13689;
                    abstractActivityC55414 = viewOnClickListenerC5639.f13687;
                    sArr7 = f81981;
                    iM55979 = C0946.m55979("ۨ۬") ^ i14;
                    i = ((iM55979 ^ i13) * 6711) ^ (-1857431531);
                    i2 = -130228424;
                    i16 = iM55979 ^ i2;
                    i15 = i;
                    break;
                case 369456324:
                case 1631275578:
                    AbstractActivityC5549 abstractActivityC55417 = abstractActivityC55413;
                    boolean z8 = z;
                    AbstractActivityC5549 abstractActivityC55418 = abstractActivityC55411;
                    int i29 = iM559717;
                    TextInputLayout textInputLayout5 = textInputLayout;
                    textInputLayout5.setHint(C0863.m55638(abstractActivityC55418, i29));
                    textInputLayout3 = viewOnClickListenerC5639.f13689;
                    AbstractActivityC5549 abstractActivityC55419 = viewOnClickListenerC5639.f13687;
                    sArr6 = f81981;
                    int iM559721 = (i14 - C0946.m55979("۫ܺ")) * (-63);
                    abstractActivityC55411 = abstractActivityC55418;
                    i15 = ((iM559721 ^ i13) * (-31825)) ^ (-559282149);
                    i16 = iM559721 ^ 996888784;
                    iM559717 = i29;
                    textInputLayout = textInputLayout5;
                    abstractActivityC55413 = abstractActivityC55417;
                    abstractActivityC55412 = abstractActivityC55419;
                    z = z8;
                    break;
                case 551756790:
                case 2080047906:
                    abstractActivityC55411 = viewOnClickListenerC5639.f13687;
                    sArr6 = sArr6;
                    strM55936 = RunnableC0938.m55936(f81981, 29, 3, i20);
                    iM559712 = (i14 - C0873.m55680("᩻ۗ")) * 29;
                    i6 = ((iM559712 ^ i13) * (-13633)) ^ (-672081951);
                    i7 = -943066134;
                    i16 = iM559712 ^ i7;
                    i15 = i6;
                    z = z;
                    abstractActivityC55413 = abstractActivityC55413;
                    sArr6 = sArr6;
                    abstractActivityC55412 = abstractActivityC55412;
                    textInputLayout3 = textInputLayout3;
                    break;
                case 1549742239:
                case 1699615914:
                    abstractActivityC55413 = abstractActivityC55413;
                    textView2 = textView2;
                    textInputLayout3 = textInputLayout3;
                    abstractActivityC55412 = abstractActivityC55412;
                    sArr6 = sArr6;
                    viewOnClickListenerC5639 = viewOnClickListenerC5639;
                    z = z;
                    sArr4 = sArr4;
                    s2 = f81981[10];
                    s = 7260;
                    if (RunnableC0871.f81839 >= 0) {
                        iM559710 = C0946.m55979("᩻۠") ^ i14;
                        i15 = ((iM559710 ^ i13) * (-13189)) ^ (-1432269798);
                        i3 = 12641684;
                    } else {
                        iM559710 = (C0946.m55979("ۛ֨") ^ i14) * 85;
                        i15 = ((iM559710 ^ i13) * 16443) ^ 77827225;
                        i3 = -677997340;
                    }
                    i16 = iM559710 ^ i3;
                    sArr4 = sArr4;
                    viewOnClickListenerC5639 = viewOnClickListenerC5639;
                    z = z;
                    abstractActivityC55413 = abstractActivityC55413;
                    sArr6 = sArr6;
                    textView2 = textView2;
                    abstractActivityC55412 = abstractActivityC55412;
                    textInputLayout3 = textInputLayout3;
                    break;
                default:
                    if (C0854.f81826 == 0) {
                        abstractActivityC55413 = abstractActivityC55413;
                        textView2 = textView2;
                        textInputLayout3 = textInputLayout3;
                        abstractActivityC55412 = abstractActivityC55412;
                        sArr6 = sArr6;
                        viewOnClickListenerC5639 = viewOnClickListenerC5639;
                        z = z;
                        sArr4 = sArr4;
                        iM559710 = C0946.m55979("᩻۠") ^ i14;
                        i15 = ((iM559710 ^ i13) * (-13189)) ^ (-1432269798);
                        i3 = 12641684;
                        i16 = iM559710 ^ i3;
                        sArr4 = sArr4;
                        viewOnClickListenerC5639 = viewOnClickListenerC5639;
                        z = z;
                        abstractActivityC55413 = abstractActivityC55413;
                        sArr6 = sArr6;
                        textView2 = textView2;
                        abstractActivityC55412 = abstractActivityC55412;
                        textInputLayout3 = textInputLayout3;
                    } else {
                        iM55979 = (C0873.m55680("᩶᩵") + i14) * 81;
                        i = ((iM55979 ^ i13) * (-28967)) ^ 1831876794;
                        i2 = -763501533;
                        i16 = iM55979 ^ i2;
                        i15 = i;
                    }
                    break;
            }
            return;
        }
    }

    public C6980(ViewOnClickListenerC5639 viewOnClickListenerC5639, ObjectAnimator objectAnimator) {
        int i = -367695613;
        int i2 = C0845.f81821;
        int i3 = ServiceConnectionC1013.f81940;
        int iM55979 = C0946.m55979("ۡ۟") ^ i3;
        int i4 = ((iM55979 ^ i2) * (-9927)) ^ (-222969840);
        int i5 = 393251016;
        while (true) {
            i = ((((i ^ i2) * 16211) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2140729380:
                case 191926738:
                    if (C1053.m56327() >= 0) {
                        iM55979 = (C0873.m55680("ܶ᩶") + i3) * 93;
                        i4 = ((iM55979 ^ i2) * 20015) ^ 1150669147;
                        i5 = -728587530;
                    } else {
                        iM55979 = C0873.m55680("۬ܶ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 4435) ^ (-1424902431);
                        i5 = 203039594;
                    }
                    break;
                case -1684919511:
                case -255859733:
                    if (C0967.m56074()) {
                        iM55979 = C0873.m55680("֨۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-11601)) ^ 775801841;
                        i5 = 828153357;
                    } else {
                        iM55979 = C0946.m55979("ۜ֡") ^ i3;
                        i4 = ((iM55979 ^ i2) * 3231) ^ (-433877537);
                        i5 = -1531681852;
                    }
                    break;
                case -1639911446:
                case -1308867831:
                    ServiceConnectionC1013.m56157();
                    throw new RuntimeException();
                case -1637331855:
                case 77842621:
                    if (C0927.f81875) {
                        iM55979 = (C0946.m55979("᩹᩶") + i3) * (-35);
                        i4 = ((iM55979 ^ i2) * 11383) ^ (-1999829751);
                        i5 = -568921832;
                    } else {
                        iM55979 = C0946.m55979("ܰ᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * 28199) ^ (-1398645144);
                        i5 = 1474867244;
                    }
                    break;
                case -1507844544:
                case 821961136:
                    if (C0898.f81858 <= 0) {
                        iM55979 = (C0873.m55680("۟ܺ") + i2) * 71;
                        i4 = ((iM55979 ^ i3) * 4241) ^ 1162776345;
                        i5 = -1941382208;
                    } else {
                        iM55979 = C0946.m55979("ۘ۬") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28741)) ^ 1527960880;
                        i5 = 558175453;
                    }
                    break;
                case -1420995537:
                case -940631870:
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0873.m55680("֨۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-11601)) ^ 775801841;
                        i5 = 828153357;
                    } else {
                        iM55979 = C0873.m55680("᩶ۡ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 14427) ^ (-1818199332);
                        i5 = -1918097751;
                    }
                    break;
                case -1196630860:
                case -839305871:
                    if (C1044.f81959 >= 0) {
                        iM55979 = (C0946.m55979("᩹᩶") + i3) * (-35);
                        i4 = ((iM55979 ^ i2) * 11383) ^ (-1999829751);
                        i5 = -568921832;
                    } else {
                        iM55979 = C0946.m55979("۬۫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 30269) ^ 298021394;
                        i5 = 905883432;
                    }
                    break;
                case -1113167352:
                case -1023649466:
                    if (C1964.m56597() != 0) {
                        iM55979 = C0873.m55680("֨۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-11601)) ^ 775801841;
                        i5 = 828153357;
                    } else {
                        iM55979 = (C0946.m55979("᩹᩶") + i3) * (-35);
                        i4 = ((iM55979 ^ i2) * 11383) ^ (-1999829751);
                        i5 = -568921832;
                    }
                    break;
                case -946229074:
                case 1741226860:
                    if (C1229.f82066 >= 0) {
                        iM55979 = (C0873.m55680("ܶ᩶") + i3) * 93;
                        i4 = ((iM55979 ^ i2) * 20015) ^ 1150669147;
                        i5 = -728587530;
                    } else {
                        iM55979 = C0873.m55680("۬ᩳ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-4159)) ^ 1666367451;
                        i5 = 1685165419;
                    }
                    break;
                case -843957575:
                case 903039964:
                    if (C0946.f81894 != 0) {
                        iM55979 = (C0873.m55680("۟ܺ") + i2) * 71;
                        i4 = ((iM55979 ^ i3) * 4241) ^ 1162776345;
                        i5 = -1941382208;
                    } else {
                        iM55979 = C0873.m55680("֡۟") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-27709)) ^ (-672219935);
                        i5 = 1821396978;
                    }
                    break;
                case -653687001:
                case 15662081:
                    C1012.m56134();
                    iM55979 = (C0873.m55680("۟ܺ") + i2) * 71;
                    i4 = ((iM55979 ^ i3) * 4241) ^ 1162776345;
                    i5 = -1941382208;
                    break;
                case -595347498:
                case 1202934177:
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0946.m55979("۬۫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 30269) ^ 298021394;
                        i5 = 905883432;
                    } else {
                        iM55979 = (C0873.m55680("۟ܺ") + i2) * 71;
                        i4 = ((iM55979 ^ i3) * 4241) ^ 1162776345;
                        i5 = -1941382208;
                    }
                    break;
                case -74997338:
                case 359241867:
                    this.f18160 = viewOnClickListenerC5639;
                    if (C0877.f81843 >= 0) {
                        iM55979 = C0946.m55979("۬۫") ^ i3;
                        i4 = ((iM55979 ^ i2) * 30269) ^ 298021394;
                        i5 = 905883432;
                    } else {
                        iM55979 = (C0873.m55680("۬۬") ^ i2) * (-51);
                        i4 = ((iM55979 ^ i3) * 17227) ^ (-1878359483);
                        i5 = -1710967233;
                    }
                    break;
                case 1102648478:
                case 1633216754:
                    if (C0861.f81831) {
                        iM55979 = C0946.m55979("ܶ᩸") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-20667)) ^ (-838184033);
                        i5 = 993810407;
                    } else {
                        iM55979 = (C0873.m55680("ܶ᩶") + i3) * 93;
                        i4 = ((iM55979 ^ i2) * 20015) ^ 1150669147;
                        i5 = -728587530;
                    }
                    break;
                case 1212370161:
                case 1393263980:
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0873.m55680("֨۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-11601)) ^ 775801841;
                        i5 = 828153357;
                    } else {
                        iM55979 = C0946.m55979("ۧ᩵") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-31227)) ^ (-1463127195);
                        i5 = 1657643348;
                    }
                    break;
                default:
                    this.f18159 = objectAnimator;
                    return;
            }
        }
    }
}
