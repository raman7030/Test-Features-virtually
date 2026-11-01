package p067l;

import android.view.View;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Arrays;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۡܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC10907 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ᩶ܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f82095 = {7788, -5180, -946, 113};

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C21793 f30237;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f30238;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean[] f30239;

    /* JADX WARN: Code duplicated, block: B:18:0x008f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0267 A[PHI: r11 r17 r22
      0x0267: PHI (r11v3 short) = (r11v2 short), (r11v2 short), (r11v5 short) binds: [B:68:0x0265, B:24:0x00b9, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0267: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:68:0x0265, B:24:0x00b9, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0267: PHI (r22v4 int) = (r22v3 int), (r22v3 int), (r22v6 int) binds: [B:68:0x0265, B:24:0x00b9, B:6:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x029a A[PHI: r6 r8 r9 r10 r16
      0x029a: PHI (r6v5 android.widget.TextView) = 
      (r6v2 android.widget.TextView)
      (r6v4 android.widget.TextView)
      (r6v2 android.widget.TextView)
      (r6v2 android.widget.TextView)
      (r6v2 android.widget.TextView)
      (r6v2 android.widget.TextView)
      (r6v2 android.widget.TextView)
     binds: [B:72:0x0298, B:43:0x0151, B:39:0x012d, B:35:0x0110, B:19:0x00a5, B:16:0x008b, B:13:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r8v4 java.lang.String) = 
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v3 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
     binds: [B:72:0x0298, B:43:0x0151, B:39:0x012d, B:35:0x0110, B:19:0x00a5, B:16:0x008b, B:13:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r9v4 short[]) = (r9v2 short[]), (r9v3 short[]), (r9v2 short[]), (r9v2 short[]), (r9v2 short[]), (r9v2 short[]), (r9v2 short[]) binds: [B:72:0x0298, B:43:0x0151, B:39:0x012d, B:35:0x0110, B:19:0x00a5, B:16:0x008b, B:13:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:72:0x0298, B:43:0x0151, B:39:0x012d, B:35:0x0110, B:19:0x00a5, B:16:0x008b, B:13:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:72:0x0298, B:43:0x0151, B:39:0x012d, B:35:0x0110, B:19:0x00a5, B:16:0x008b, B:13:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02ca A[PHI: r7 r13 r14
      0x02ca: PHI (r7v5 int) = (r7v2 int), (r7v2 int), (r7v4 int), (r7v2 int) binds: [B:76:0x02c8, B:63:0x022f, B:31:0x00eb, B:13:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:76:0x02c8, B:63:0x022f, B:31:0x00eb, B:13:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r14v4 short) = (r14v2 short), (r14v3 short), (r14v2 short), (r14v2 short) binds: [B:76:0x02c8, B:63:0x022f, B:31:0x00eb, B:13:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM55979;
        int i;
        int i2;
        int i3 = ServiceConnectionC1013.f81940;
        int i4 = C1071.f81975;
        int iM559710 = C0946.m55979("۠ۧ") ^ i3;
        int i5 = ((iM559710 ^ i4) * 20467) ^ (-1668006330);
        TextView textView = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM559710 ^ (-245913105);
        boolean[] zArr = null;
        boolean z = false;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        short s = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        char c = 0;
        int i11 = -1951229072;
        int i12 = 0;
        String strM55893 = null;
        int iM559711 = 0;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i4) * 18945) >> 31));
            switch (i11) {
                case -2134783191:
                case -395375601:
                    c = 0;
                    if (RunnableC0938.m55938() != 0) {
                        iM55979 = C0946.m55979("ۗ֫") ^ i4;
                        i = ((iM55979 ^ i3) * (-12495)) ^ (-2041927537);
                        i2 = 1483627599;
                    } else {
                        iM55979 = (i4 - C0873.m55680("۬۟")) * (-111);
                        i = ((iM55979 ^ i3) * 29493) ^ (-232158991);
                        i2 = 1353437295;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2121740727:
                case -1735428050:
                    i10 = 6455;
                    iM55979 = C0873.m55680("۠ۤ") ^ i3;
                    i = ((iM55979 ^ i4) * 12375) ^ 111870636;
                    i2 = 1996422668;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2079242374:
                case 1316471822:
                    i10 = 24793;
                    iM55979 = C0873.m55680("۠ۤ") ^ i3;
                    i = ((iM55979 ^ i4) * 12375) ^ 111870636;
                    i2 = 1996422668;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -2069412370:
                case -428264877:
                    this.f30238 = z;
                    textView = (TextView) view;
                    sArr2 = f82095;
                    if (C1048.f81963) {
                        iM55979 = (C0873.m55680("ۢۖ") ^ i3) * 75;
                        i = ((iM55979 ^ i4) * (-11891)) ^ 487842524;
                        i2 = 1545974551;
                    } else {
                        iM55979 = (i4 - C0873.m55680("ۘܰ")) * (-93);
                        i = ((iM55979 ^ i3) * (-25727)) ^ (-1901479253);
                        i2 = -682007386;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1835454219:
                case 1920433821:
                    this.f30237.notifyDataSetChanged();
                    break;
                case -1817016451:
                case -1555685502:
                    if (i7 < zArr.length) {
                        iM55979 = C0873.m55680("᩷᩹") ^ i4;
                        i = ((iM55979 ^ i3) * (-8239)) ^ (-631423018);
                        i2 = 1141519481;
                    } else {
                        iM55979 = (i3 - C0946.m55979("᩵ܳ")) * (-105);
                        i = ((iM55979 ^ i4) * 23099) ^ 1778958274;
                        i2 = -1108815869;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1710631048:
                case -1304740872:
                    boolean z3 = this.f30238;
                    zArr = this.f30239;
                    z = false;
                    z2 = true;
                    if (z3) {
                        iM55979 = C0873.m55680("ܺᩴ") ^ i4;
                        i = ((iM55979 ^ i3) * 31123) ^ 463112003;
                        i2 = -1575198380;
                    } else {
                        i7 = 0;
                        iM55979 = (C0946.m55979("֫ۨ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM55979 ^ i4) * (-18765)) ^ (-879843592);
                        i2 = 177634528;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1642918224:
                case 448924901:
                    i9 = i12 + 1;
                    s2 = 1;
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0873.m55680("ܽۖ") ^ i3;
                        i = ((iM55979 ^ i4) * (-26907)) ^ (-1715073021);
                        i2 = 1516147138;
                    } else {
                        iM55979 = C0946.m55979("ۤ᩹") ^ i3;
                        i = ((iM55979 ^ i4) * (-6615)) ^ (-768674114);
                        i2 = -211195687;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1375245541:
                case 810329595:
                    i8 = 1;
                    if (C1046.f81962 <= 0) {
                        iM55979 = (i4 - C0873.m55680("ۘܰ")) * (-93);
                        i = ((iM55979 ^ i3) * (-25727)) ^ (-1901479253);
                        i2 = -682007386;
                    } else {
                        iM55979 = C0873.m55680("ܿ᩺") ^ i4;
                        i = ((iM55979 ^ i3) * 8385) ^ 1404847425;
                        i2 = 1301245809;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1230404725:
                case 91074309:
                    C1194.m56396();
                    if (C1012.f81938 < 0) {
                        iM55979 = (i4 - C0873.m55680("ۘܰ")) * (-93);
                        i = ((iM55979 ^ i3) * (-25727)) ^ (-1901479253);
                        i2 = -682007386;
                    } else {
                        iM55979 = C0946.m55979("ۘ֡") ^ i4;
                        i = ((iM55979 ^ i3) * (-22495)) ^ (-396890364);
                        i2 = 324259611;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -902426022:
                case -488618629:
                    C0946.m55976(textView, iM559711);
                    Arrays.fill(zArr, z2);
                    iM55979 = (i3 - C0946.m55979("᩵ܳ")) * (-105);
                    i = ((iM55979 ^ i4) * 23099) ^ 1778958274;
                    i2 = -1108815869;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -880152425:
                case 831358991:
                    sArr = f82095;
                    if (C0854.f81826 != 0) {
                        iM55979 = (i4 - C0873.m55680("ۘܰ")) * (-93);
                        i = ((iM55979 ^ i3) * (-25727)) ^ (-1901479253);
                        i2 = -682007386;
                    } else {
                        iM55979 = C0946.m55979("ۨۚ") ^ i3;
                        i = ((iM55979 ^ i4) * 10043) ^ 835112208;
                        i2 = 77079949;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -379883529:
                case 2039189750:
                    i7++;
                    iM55979 = (C0946.m55979("֫ۨ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i = ((iM55979 ^ i4) * (-18765)) ^ (-879843592);
                    i2 = 177634528;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -165630442:
                case 2113220234:
                    C1229.m56410();
                    if (C1229.f82066 >= 0) {
                        iM55979 = (i4 - C0873.m55680("ۘܰ")) * (-93);
                        i = ((iM55979 ^ i3) * (-25727)) ^ (-1901479253);
                        i2 = -682007386;
                    } else {
                        iM55979 = C0873.m55680("ܽۖ") ^ i3;
                        i = ((iM55979 ^ i4) * (-26907)) ^ (-1715073021);
                        i2 = 1516147138;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 116948336:
                case 2127911739:
                    C0861.m55626();
                    if (C0877.f81843 < 0) {
                        iM55979 = C0946.m55979("ۘ֡") ^ i4;
                        i = ((iM55979 ^ i3) * (-22495)) ^ (-396890364);
                        i2 = 324259611;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ܺܶ")) * (-25);
                        i = ((iM55979 ^ i4) * (-15225)) ^ (-1417079384);
                        i2 = 771699450;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 497057944:
                case 1186211179:
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0873.m55680("ܽۖ") ^ i3;
                        i = ((iM55979 ^ i4) * (-26907)) ^ (-1715073021);
                        i2 = 1516147138;
                    } else {
                        iM55979 = C0946.m55979("ܿܶ") ^ i4;
                        i = ((iM55979 ^ i3) * (-5201)) ^ 129974257;
                        i2 = -315438720;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 530476476:
                case 1437659247:
                    int i13 = s + s2;
                    if (i9 - (i13 * i13) <= 0) {
                        iM55979 = C0873.m55680("ۧۖ") ^ i4;
                        i = ((iM55979 ^ i3) * 15433) ^ 1939002435;
                        i2 = -1565899403;
                    } else {
                        iM55979 = (C0946.m55979("ۚۤ") ^ i4) * (-55);
                        i = ((iM55979 ^ i3) * (-16521)) ^ (-1928861215);
                        i2 = 895399796;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 628539136:
                case 1798589098:
                    strM55893 = C0930.m55893(sArr2, i8, 3, i10);
                    if (C0861.m55626()) {
                        iM55979 = (i4 - C0873.m55680("ۘܰ")) * (-93);
                        i = ((iM55979 ^ i3) * (-25727)) ^ (-1901479253);
                        i2 = -682007386;
                    } else {
                        iM55979 = C0946.m55979("ۨ֨") ^ i4;
                        i = ((iM55979 ^ i3) * 21601) ^ (-386790726);
                        i2 = 263157549;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 643297149:
                case 961980318:
                    C0989.m56095();
                    break;
                case 669885159:
                case 689205805:
                    iM559711 = 2098169814 ^ C0946.m55979(strM55893);
                    if (C1404.f82149 >= 0) {
                        iM55979 = C0873.m55680("ܽۖ") ^ i3;
                        i = ((iM55979 ^ i4) * (-26907)) ^ (-1715073021);
                        i2 = 1516147138;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۛۡ")) * 87;
                        i = ((iM55979 ^ i4) * 15367) ^ (-900773205);
                        i2 = 1305463612;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 904448018:
                case 2100203151:
                    C0937.m55918();
                    iM55979 = (i4 - C0873.m55680("ۘܰ")) * (-93);
                    i = ((iM55979 ^ i3) * (-25727)) ^ (-1901479253);
                    i2 = -682007386;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1445838463:
                case 1655874651:
                    zArr[i7] = zArr[i7] ^ z2;
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0946.m55979("ۗ֫") ^ i4;
                        i = ((iM55979 ^ i3) * (-12495)) ^ (-2041927537);
                        i2 = 1483627599;
                    } else {
                        iM55979 = C0946.m55979("᩻᩻") ^ i3;
                        i = ((iM55979 ^ i4) * 19423) ^ (-312394191);
                        i2 = 95409639;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    s = sArr[c];
                    i12 = s * 2;
                    if (C0967.f81910 >= 0) {
                        iM55979 = C0946.m55979("ۗ֫") ^ i4;
                        i = ((iM55979 ^ i3) * (-12495)) ^ (-2041927537);
                        i2 = 1483627599;
                    } else {
                        iM55979 = C0873.m55680("ۧᩳ") ^ i3;
                        i = ((iM55979 ^ i4) * 22803) ^ 955436801;
                        i2 = -164296199;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public ViewOnClickListenerC10907(boolean[] zArr, C21793 c21793) {
        int i = -747970645;
        int i2 = C0967.f81910;
        int i3 = RunnableC0938.f81886;
        int iM55680 = (C0873.m55680("ۨ۠") + i2) * (-65);
        int i4 = ((iM55680 ^ i3) * (-707)) ^ 896541060;
        int i5 = -496067064;
        while (true) {
            i = ((((i ^ i3) * 4167) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2078326651:
                case -447811291:
                    C1229.m56410();
                    RunnableC1014.m56177();
                    iM55680 = (C0946.m55979("ܰۙ") ^ i3) * (-57);
                    i4 = ((iM55680 ^ i2) * 329) ^ 734398322;
                    i5 = 1587531664;
                    break;
                case -2044004666:
                case -506192091:
                    if (C0989.f81920 >= 0) {
                        iM55680 = (C0946.m55979("᩷ۜ") + i2) * 65;
                        i4 = ((iM55680 ^ i3) * (-28243)) ^ (-883854185);
                        i5 = -1863968516;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ܳ᩷")) * 45;
                        i4 = ((iM55680 ^ i2) * 19709) ^ (-367952264);
                        i5 = 948793456;
                    }
                    break;
                case -2023191160:
                case -1108501652:
                    C1028.m56247();
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = (C0946.m55979("᩷ۜ") + i2) * 65;
                        i4 = ((iM55680 ^ i3) * (-28243)) ^ (-883854185);
                        i5 = -1863968516;
                    } else {
                        iM55680 = (C0946.m55979("ܰۙ") ^ i3) * (-57);
                        i4 = ((iM55680 ^ i2) * 329) ^ 734398322;
                        i5 = 1587531664;
                    }
                    break;
                case -1939944896:
                case 2048279707:
                    if (C1028.f81950 <= 0) {
                        iM55680 = (C0946.m55979("᩷ۜ") + i2) * 65;
                        i4 = ((iM55680 ^ i3) * (-28243)) ^ (-883854185);
                        i5 = -1863968516;
                    } else {
                        iM55680 = C0946.m55979("᩶ۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-10145)) ^ (-1875481355);
                        i5 = -552701416;
                    }
                    break;
                case -1836340397:
                case 1936621174:
                    if (C1012.f81938 >= 0) {
                        iM55680 = (C0946.m55979("ᩳۡ") + i3) * (-73);
                        i4 = ((iM55680 ^ i2) * 4089) ^ (-14713483);
                        i5 = 1140313175;
                    } else {
                        iM55680 = C0873.m55680("ܽ֡") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-17231)) ^ (-1583897547);
                        i5 = -124475395;
                    }
                    break;
                case -1809471914:
                case 653153311:
                    if (C0894.f81854 >= 0) {
                        iM55680 = (i2 - C0873.m55680("ۖ֨")) * 25;
                        i4 = ((iM55680 ^ i3) * 8975) ^ (-345709748);
                        i5 = 519031710;
                    } else {
                        iM55680 = C0873.m55680("ܽܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-11557)) ^ 1390254417;
                        i5 = 2145546421;
                    }
                    break;
                case -1670436610:
                case -574387724:
                    if (C0882.f81846) {
                        iM55680 = (i2 - C0873.m55680("ۖ֨")) * 25;
                        i4 = ((iM55680 ^ i3) * 8975) ^ (-345709748);
                        i5 = 519031710;
                    } else {
                        iM55680 = C0873.m55680("ᩳ۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-16693)) ^ 1129738824;
                        i5 = -1821743859;
                    }
                    break;
                case -1327012354:
                case -621267131:
                    C0989.m56095();
                    throw new RuntimeException();
                case -948324420:
                case 1769447123:
                    this.f30238 = true;
                    return;
                case -715548777:
                case 1458698653:
                    if (C0882.f81846) {
                        iM55680 = (C0946.m55979("᩷ۜ") + i2) * 65;
                        i4 = ((iM55680 ^ i3) * (-28243)) ^ (-883854185);
                        i5 = -1863968516;
                    } else {
                        iM55680 = C0946.m55979("ۤۡ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 2391) ^ (-2101241890);
                        i5 = 498977047;
                    }
                    break;
                case -591308489:
                case 1420394858:
                    if (C1028.f81950 <= 0) {
                        iM55680 = (C0946.m55979("ᩳۡ") + i3) * (-73);
                        i4 = ((iM55680 ^ i2) * 4089) ^ (-14713483);
                        i5 = 1140313175;
                    } else {
                        iM55680 = C0946.m55979("۟ܳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-29161)) ^ 1206178330;
                        i5 = -1021742209;
                    }
                    break;
                case -301905908:
                case 849106402:
                    C0949.m56012();
                    if (C0854.f81826 != 0) {
                        iM55680 = (i2 - C0873.m55680("ۖ֨")) * 25;
                        i4 = ((iM55680 ^ i3) * 8975) ^ (-345709748);
                        i5 = 519031710;
                    } else {
                        iM55680 = (C0946.m55979("ܰۙ") ^ i3) * (-57);
                        i4 = ((iM55680 ^ i2) * 329) ^ 734398322;
                        i5 = 1587531664;
                    }
                    break;
                case 416126869:
                case 466861563:
                    if (C0912.m55833()) {
                        iM55680 = (C0946.m55979("᩷ۜ") + i2) * 65;
                        i4 = ((iM55680 ^ i3) * (-28243)) ^ (-883854185);
                        i5 = -1863968516;
                    } else {
                        iM55680 = C0946.m55979("᩵ܿ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 16879) ^ 892596105;
                        i5 = -121008824;
                    }
                    break;
                case 1392144481:
                case 1995632093:
                    if (C0877.m55696()) {
                        iM55680 = C0946.m55979("ᩴܽ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-29993)) ^ 1174282696;
                        i5 = -1254460538;
                    } else {
                        iM55680 = (C0946.m55979("᩷ۜ") + i2) * 65;
                        i4 = ((iM55680 ^ i3) * (-28243)) ^ (-883854185);
                        i5 = -1863968516;
                    }
                    break;
                case 1729919902:
                case 1755290044:
                    this.f30239 = zArr;
                    this.f30237 = c21793;
                    if (C0898.f81858 <= 0) {
                        iM55680 = (C0946.m55979("ᩳۡ") + i3) * (-73);
                        i4 = ((iM55680 ^ i2) * 4089) ^ (-14713483);
                        i5 = 1140313175;
                    } else {
                        iM55680 = C0946.m55979("ܺ۠") ^ i2;
                        i4 = ((iM55680 ^ i3) * 8435) ^ 1943354690;
                        i5 = 1593686309;
                    }
                    break;
                default:
                    if (C0892.f81851) {
                        iM55680 = (i2 - C0946.m55979("ۜۖ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i3) * 28531) ^ 1996066807;
                        i5 = -819964781;
                    } else {
                        iM55680 = (C0946.m55979("ᩳۡ") + i3) * (-73);
                        i4 = ((iM55680 ^ i2) * 4089) ^ (-14713483);
                        i5 = 1140313175;
                    }
                    break;
            }
        }
    }
}
