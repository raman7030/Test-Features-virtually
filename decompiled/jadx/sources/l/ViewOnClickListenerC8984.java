package l;

import android.view.View;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Arrays;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۡܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC8984 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ᩶ܶ, reason: not valid java name and contains not printable characters */
    private static final short[] f27302 = {7788, -5180, -946, 113};

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20438 f27303;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f27304;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f27305;

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
        int iM6981;
        int i;
        int i2;
        int i3 = ServiceConnectionC3453.f10921;
        int i4 = C4616.f14690;
        int iM6982 = C2105.m6981("۠ۧ") ^ i3;
        int i5 = ((iM6982 ^ i4) * 20467) ^ (-1668006330);
        TextView textView = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6982 ^ (-245913105);
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
        String strM5917 = null;
        int iM6983 = 0;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i4) * 18945) >> 31));
            switch (i11) {
                case -2134783191:
                case -395375601:
                    c = 0;
                    if (RunnableC1937.m6387() != 0) {
                        iM6981 = C2105.m6981("ۗ֫") ^ i4;
                        i = ((iM6981 ^ i3) * (-12495)) ^ (-2041927537);
                        i2 = 1483627599;
                    } else {
                        iM6981 = (i4 - C0630.m2566("۬۟")) * (-111);
                        i = ((iM6981 ^ i3) * 29493) ^ (-232158991);
                        i2 = 1353437295;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2121740727:
                case -1735428050:
                    i10 = 6455;
                    iM6981 = C0630.m2566("۠ۤ") ^ i3;
                    i = ((iM6981 ^ i4) * 12375) ^ 111870636;
                    i2 = 1996422668;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2079242374:
                case 1316471822:
                    i10 = 24793;
                    iM6981 = C0630.m2566("۠ۤ") ^ i3;
                    i = ((iM6981 ^ i4) * 12375) ^ 111870636;
                    i2 = 1996422668;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2069412370:
                case -428264877:
                    this.f27304 = z;
                    textView = (TextView) view;
                    sArr2 = f27302;
                    if (C4159.f13567) {
                        iM6981 = (C0630.m2566("ۢۖ") ^ i3) * 75;
                        i = ((iM6981 ^ i4) * (-11891)) ^ 487842524;
                        i2 = 1545974551;
                    } else {
                        iM6981 = (i4 - C0630.m2566("ۘܰ")) * (-93);
                        i = ((iM6981 ^ i3) * (-25727)) ^ (-1901479253);
                        i2 = -682007386;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1835454219:
                case 1920433821:
                    this.f27303.notifyDataSetChanged();
                    break;
                case -1817016451:
                case -1555685502:
                    if (i7 < zArr.length) {
                        iM6981 = C0630.m2566("᩷᩹") ^ i4;
                        i = ((iM6981 ^ i3) * (-8239)) ^ (-631423018);
                        i2 = 1141519481;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩵ܳ")) * (-105);
                        i = ((iM6981 ^ i4) * 23099) ^ 1778958274;
                        i2 = -1108815869;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1710631048:
                case -1304740872:
                    boolean z3 = this.f27304;
                    zArr = this.f27305;
                    z = false;
                    z2 = true;
                    if (z3) {
                        iM6981 = C0630.m2566("ܺᩴ") ^ i4;
                        i = ((iM6981 ^ i3) * 31123) ^ 463112003;
                        i2 = -1575198380;
                    } else {
                        i7 = 0;
                        iM6981 = (C2105.m6981("֫ۨ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM6981 ^ i4) * (-18765)) ^ (-879843592);
                        i2 = 177634528;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1642918224:
                case 448924901:
                    i9 = i12 + 1;
                    s2 = 1;
                    if (C22628.f73083 <= 0) {
                        iM6981 = C0630.m2566("ܽۖ") ^ i3;
                        i = ((iM6981 ^ i4) * (-26907)) ^ (-1715073021);
                        i2 = 1516147138;
                    } else {
                        iM6981 = C2105.m6981("ۤ᩹") ^ i3;
                        i = ((iM6981 ^ i4) * (-6615)) ^ (-768674114);
                        i2 = -211195687;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1375245541:
                case 810329595:
                    i8 = 1;
                    if (C4117.f13076 <= 0) {
                        iM6981 = (i4 - C0630.m2566("ۘܰ")) * (-93);
                        i = ((iM6981 ^ i3) * (-25727)) ^ (-1901479253);
                        i2 = -682007386;
                    } else {
                        iM6981 = C0630.m2566("ܿ᩺") ^ i4;
                        i = ((iM6981 ^ i3) * 8385) ^ 1404847425;
                        i2 = 1301245809;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1230404725:
                case 91074309:
                    C7106.m19120();
                    if (C3432.f10845 < 0) {
                        iM6981 = (i4 - C0630.m2566("ۘܰ")) * (-93);
                        i = ((iM6981 ^ i3) * (-25727)) ^ (-1901479253);
                        i2 = -682007386;
                    } else {
                        iM6981 = C2105.m6981("ۘ֡") ^ i4;
                        i = ((iM6981 ^ i3) * (-22495)) ^ (-396890364);
                        i2 = 324259611;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -902426022:
                case -488618629:
                    C2105.m6978(textView, iM6983);
                    Arrays.fill(zArr, z2);
                    iM6981 = (i3 - C2105.m6981("᩵ܳ")) * (-105);
                    i = ((iM6981 ^ i4) * 23099) ^ 1778958274;
                    i2 = -1108815869;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -880152425:
                case 831358991:
                    sArr = f27302;
                    if (C0237.f1507 != 0) {
                        iM6981 = (i4 - C0630.m2566("ۘܰ")) * (-93);
                        i = ((iM6981 ^ i3) * (-25727)) ^ (-1901479253);
                        i2 = -682007386;
                    } else {
                        iM6981 = C2105.m6981("ۨۚ") ^ i3;
                        i = ((iM6981 ^ i4) * 10043) ^ 835112208;
                        i2 = 77079949;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -379883529:
                case 2039189750:
                    i7++;
                    iM6981 = (C2105.m6981("֫ۨ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i = ((iM6981 ^ i4) * (-18765)) ^ (-879843592);
                    i2 = 177634528;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -165630442:
                case 2113220234:
                    C7811.m20844();
                    if (C7811.f24123 >= 0) {
                        iM6981 = (i4 - C0630.m2566("ۘܰ")) * (-93);
                        i = ((iM6981 ^ i3) * (-25727)) ^ (-1901479253);
                        i2 = -682007386;
                    } else {
                        iM6981 = C0630.m2566("ܽۖ") ^ i3;
                        i = ((iM6981 ^ i4) * (-26907)) ^ (-1715073021);
                        i2 = 1516147138;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 116948336:
                case 2127911739:
                    C0382.m1848();
                    if (C0714.f2697 < 0) {
                        iM6981 = C2105.m6981("ۘ֡") ^ i4;
                        i = ((iM6981 ^ i3) * (-22495)) ^ (-396890364);
                        i2 = 324259611;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܺܶ")) * (-25);
                        i = ((iM6981 ^ i4) * (-15225)) ^ (-1417079384);
                        i2 = 771699450;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 497057944:
                case 1186211179:
                    if (C3537.f11231 >= 0) {
                        iM6981 = C0630.m2566("ܽۖ") ^ i3;
                        i = ((iM6981 ^ i4) * (-26907)) ^ (-1715073021);
                        i2 = 1516147138;
                    } else {
                        iM6981 = C2105.m6981("ܿܶ") ^ i4;
                        i = ((iM6981 ^ i3) * (-5201)) ^ 129974257;
                        i2 = -315438720;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 530476476:
                case 1437659247:
                    int i13 = s + s2;
                    if (i9 - (i13 * i13) <= 0) {
                        iM6981 = C0630.m2566("ۧۖ") ^ i4;
                        i = ((iM6981 ^ i3) * 15433) ^ 1939002435;
                        i2 = -1565899403;
                    } else {
                        iM6981 = (C2105.m6981("ۚۤ") ^ i4) * (-55);
                        i = ((iM6981 ^ i3) * (-16521)) ^ (-1928861215);
                        i2 = 895399796;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 628539136:
                case 1798589098:
                    strM5917 = C1773.m5917(sArr2, i8, 3, i10);
                    if (C0382.m1848()) {
                        iM6981 = (i4 - C0630.m2566("ۘܰ")) * (-93);
                        i = ((iM6981 ^ i3) * (-25727)) ^ (-1901479253);
                        i2 = -682007386;
                    } else {
                        iM6981 = C2105.m6981("ۨ֨") ^ i4;
                        i = ((iM6981 ^ i3) * 21601) ^ (-386790726);
                        i2 = 263157549;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 643297149:
                case 961980318:
                    C2958.m9034();
                    break;
                case 669885159:
                case 689205805:
                    iM6983 = 2098169814 ^ C2105.m6981(strM5917);
                    if (C11340.f33930 >= 0) {
                        iM6981 = C0630.m2566("ܽۖ") ^ i3;
                        i = ((iM6981 ^ i4) * (-26907)) ^ (-1715073021);
                        i2 = 1516147138;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۛۡ")) * 87;
                        i = ((iM6981 ^ i4) * 15367) ^ (-900773205);
                        i2 = 1305463612;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 904448018:
                case 2100203151:
                    C1916.m6308();
                    iM6981 = (i4 - C0630.m2566("ۘܰ")) * (-93);
                    i = ((iM6981 ^ i3) * (-25727)) ^ (-1901479253);
                    i2 = -682007386;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1445838463:
                case 1655874651:
                    zArr[i7] = zArr[i7] ^ z2;
                    if (C0422.f1886 <= 0) {
                        iM6981 = C2105.m6981("ۗ֫") ^ i4;
                        i = ((iM6981 ^ i3) * (-12495)) ^ (-2041927537);
                        i2 = 1483627599;
                    } else {
                        iM6981 = C2105.m6981("᩻᩻") ^ i3;
                        i = ((iM6981 ^ i4) * 19423) ^ (-312394191);
                        i2 = 95409639;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    s = sArr[c];
                    i12 = s * 2;
                    if (C2520.f8000 >= 0) {
                        iM6981 = C2105.m6981("ۗ֫") ^ i4;
                        i = ((iM6981 ^ i3) * (-12495)) ^ (-2041927537);
                        i2 = 1483627599;
                    } else {
                        iM6981 = C0630.m2566("ۧᩳ") ^ i3;
                        i = ((iM6981 ^ i4) * 22803) ^ 955436801;
                        i2 = -164296199;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public ViewOnClickListenerC8984(boolean[] zArr, C20438 c20438) {
        int i = -747970645;
        int i2 = C2520.f8000;
        int i3 = RunnableC1937.f6483;
        int iM2566 = (C0630.m2566("ۨ۠") + i2) * (-65);
        int i4 = ((iM2566 ^ i3) * (-707)) ^ 896541060;
        int i5 = -496067064;
        while (true) {
            i = ((((i ^ i3) * 4167) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2078326651:
                case -447811291:
                    C7811.m20844();
                    RunnableC3474.m10630();
                    iM2566 = (C2105.m6981("ܰۙ") ^ i3) * (-57);
                    i4 = ((iM2566 ^ i2) * 329) ^ 734398322;
                    i5 = 1587531664;
                    break;
                case -2044004666:
                case -506192091:
                    if (C2958.f9394 >= 0) {
                        iM2566 = (C2105.m6981("᩷ۜ") + i2) * 65;
                        i4 = ((iM2566 ^ i3) * (-28243)) ^ (-883854185);
                        i5 = -1863968516;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ܳ᩷")) * 45;
                        i4 = ((iM2566 ^ i2) * 19709) ^ (-367952264);
                        i5 = 948793456;
                    }
                    break;
                case -2023191160:
                case -1108501652:
                    C3746.m11369();
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = (C2105.m6981("᩷ۜ") + i2) * 65;
                        i4 = ((iM2566 ^ i3) * (-28243)) ^ (-883854185);
                        i5 = -1863968516;
                    } else {
                        iM2566 = (C2105.m6981("ܰۙ") ^ i3) * (-57);
                        i4 = ((iM2566 ^ i2) * 329) ^ 734398322;
                        i5 = 1587531664;
                    }
                    break;
                case -1939944896:
                case 2048279707:
                    if (C3746.f11829 <= 0) {
                        iM2566 = (C2105.m6981("᩷ۜ") + i2) * 65;
                        i4 = ((iM2566 ^ i3) * (-28243)) ^ (-883854185);
                        i5 = -1863968516;
                    } else {
                        iM2566 = C2105.m6981("᩶ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-10145)) ^ (-1875481355);
                        i5 = -552701416;
                    }
                    break;
                case -1836340397:
                case 1936621174:
                    if (C3432.f10845 >= 0) {
                        iM2566 = (C2105.m6981("ᩳۡ") + i3) * (-73);
                        i4 = ((iM2566 ^ i2) * 4089) ^ (-14713483);
                        i5 = 1140313175;
                    } else {
                        iM2566 = C0630.m2566("ܽ֡") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-17231)) ^ (-1583897547);
                        i5 = -124475395;
                    }
                    break;
                case -1809471914:
                case 653153311:
                    if (C1047.f3863 >= 0) {
                        iM2566 = (i2 - C0630.m2566("ۖ֨")) * 25;
                        i4 = ((iM2566 ^ i3) * 8975) ^ (-345709748);
                        i5 = 519031710;
                    } else {
                        iM2566 = C0630.m2566("ܽܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-11557)) ^ 1390254417;
                        i5 = 2145546421;
                    }
                    break;
                case -1670436610:
                case -574387724:
                    if (C0798.f2919) {
                        iM2566 = (i2 - C0630.m2566("ۖ֨")) * 25;
                        i4 = ((iM2566 ^ i3) * 8975) ^ (-345709748);
                        i5 = 519031710;
                    } else {
                        iM2566 = C0630.m2566("ᩳ۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-16693)) ^ 1129738824;
                        i5 = -1821743859;
                    }
                    break;
                case -1327012354:
                case -621267131:
                    C2958.m9034();
                    throw new RuntimeException();
                case -948324420:
                case 1769447123:
                    this.f27304 = true;
                    return;
                case -715548777:
                case 1458698653:
                    if (C0798.f2919) {
                        iM2566 = (C2105.m6981("᩷ۜ") + i2) * 65;
                        i4 = ((iM2566 ^ i3) * (-28243)) ^ (-883854185);
                        i5 = -1863968516;
                    } else {
                        iM2566 = C2105.m6981("ۤۡ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 2391) ^ (-2101241890);
                        i5 = 498977047;
                    }
                    break;
                case -591308489:
                case 1420394858:
                    if (C3746.f11829 <= 0) {
                        iM2566 = (C2105.m6981("ᩳۡ") + i3) * (-73);
                        i4 = ((iM2566 ^ i2) * 4089) ^ (-14713483);
                        i5 = 1140313175;
                    } else {
                        iM2566 = C2105.m6981("۟ܳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-29161)) ^ 1206178330;
                        i5 = -1021742209;
                    }
                    break;
                case -301905908:
                case 849106402:
                    C2167.m7155();
                    if (C0237.f1507 != 0) {
                        iM2566 = (i2 - C0630.m2566("ۖ֨")) * 25;
                        i4 = ((iM2566 ^ i3) * 8975) ^ (-345709748);
                        i5 = 519031710;
                    } else {
                        iM2566 = (C2105.m6981("ܰۙ") ^ i3) * (-57);
                        i4 = ((iM2566 ^ i2) * 329) ^ 734398322;
                        i5 = 1587531664;
                    }
                    break;
                case 416126869:
                case 466861563:
                    if (C1420.m4913()) {
                        iM2566 = (C2105.m6981("᩷ۜ") + i2) * 65;
                        i4 = ((iM2566 ^ i3) * (-28243)) ^ (-883854185);
                        i5 = -1863968516;
                    } else {
                        iM2566 = C2105.m6981("᩵ܿ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 16879) ^ 892596105;
                        i5 = -121008824;
                    }
                    break;
                case 1392144481:
                case 1995632093:
                    if (C0714.m2805()) {
                        iM2566 = C2105.m6981("ᩴܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-29993)) ^ 1174282696;
                        i5 = -1254460538;
                    } else {
                        iM2566 = (C2105.m6981("᩷ۜ") + i2) * 65;
                        i4 = ((iM2566 ^ i3) * (-28243)) ^ (-883854185);
                        i5 = -1863968516;
                    }
                    break;
                case 1729919902:
                case 1755290044:
                    this.f27305 = zArr;
                    this.f27303 = c20438;
                    if (C1128.f4106 <= 0) {
                        iM2566 = (C2105.m6981("ᩳۡ") + i3) * (-73);
                        i4 = ((iM2566 ^ i2) * 4089) ^ (-14713483);
                        i5 = 1140313175;
                    } else {
                        iM2566 = C2105.m6981("ܺ۠") ^ i2;
                        i4 = ((iM2566 ^ i3) * 8435) ^ 1943354690;
                        i5 = 1593686309;
                    }
                    break;
                default:
                    if (C1005.f3721) {
                        iM2566 = (i2 - C2105.m6981("ۜۖ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i3) * 28531) ^ 1996066807;
                        i5 = -819964781;
                    } else {
                        iM2566 = (C2105.m6981("ᩳۡ") + i3) * (-73);
                        i4 = ((iM2566 ^ i2) * 4089) ^ (-14713483);
                        i5 = 1140313175;
                    }
                    break;
            }
        }
    }
}
