package l;

import android.os.Bundle;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.۬ۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 05NO */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC12833 extends ActivityC7747 {

    /* JADX INFO: renamed from: ܶᩳ֨, reason: not valid java name and contains not printable characters */
    private static final short[] f38538 = {8815, -2433, -1843, -2261, -29431, -29374, -29369, -29358, -29369, -29431, -29374, -29369, -29358, -29369, -29431, -29372, -29361, -29368, -29432, -29365, -29358, -29432, -29354, -29366, -29357, -29355, -29431, -29342, -29341, -29340, -29325, -29343, -29432, -29366, -29367, -29375, -7299, -6057, -3251};

    /* JADX WARN: Code duplicated, block: B:102:0x03b1 A[PHI: r14 r19 r21 r22
      0x03b1: PHI (r14v3 short[]) = (r14v1 short[]), (r14v2 short[]), (r14v1 short[]) binds: [B:101:0x03af, B:72:0x025a, B:21:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x03b1: PHI (r19v25 char) = (r19v6 char), (r19v16 char), (r19v26 char) binds: [B:101:0x03af, B:72:0x025a, B:21:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x03b1: PHI (r21v3 short[]) = (r21v2 short[]), (r21v1 short[]), (r21v1 short[]) binds: [B:101:0x03af, B:72:0x025a, B:21:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x03b1: PHI (r22v15 short) = (r22v2 short), (r22v9 short), (r22v16 short) binds: [B:101:0x03af, B:72:0x025a, B:21:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:106:0x03e3 A[PHI: r3 r19 r22
      0x03e3: PHI (r3v3 java.lang.String) = (r3v1 java.lang.String), (r3v2 java.lang.String), (r3v1 java.lang.String) binds: [B:105:0x03e1, B:64:0x01ff, B:8:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x03e3: PHI (r19v37 char) = (r19v5 char), (r19v18 char), (r19v38 char) binds: [B:105:0x03e1, B:64:0x01ff, B:8:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x03e3: PHI (r22v21 short) = (r22v1 short), (r22v11 short), (r22v22 short) binds: [B:105:0x03e1, B:64:0x01ff, B:8:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x02e2 A[PHI: r4 r5 r12 r19 r22
      0x02e2: PHI (r4v3 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:83:0x02e0, B:60:0x01db, B:12:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:83:0x02e0, B:60:0x01db, B:12:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r12v3 int) = (r12v2 int), (r12v1 int), (r12v1 int) binds: [B:83:0x02e0, B:60:0x01db, B:12:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r19v32 char) = (r19v11 char), (r19v19 char), (r19v33 char) binds: [B:83:0x02e0, B:60:0x01db, B:12:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x02e2: PHI (r22v18 short) = (r22v4 short), (r22v12 short), (r22v19 short) binds: [B:83:0x02e0, B:60:0x01db, B:12:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        if (l.ServiceConnectionC3453.f10921 >= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d4, code lost:
    
        if (l.C1504.m5179() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        if (l.C3245.f10203 <= 0) goto L12;
     */
    @Override // l.ActivityC7747, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        short s;
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        int i4;
        int iM6981;
        int i5;
        int i6;
        int i7;
        int iM6982;
        boolean zM5732 = false;
        String strM12817 = null;
        int iM6983 = 0;
        int i8 = 0;
        char c = 0;
        short s2 = 0;
        short s3 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        short[] sArr = null;
        int i13 = 0;
        int i14 = 927794623;
        int i15 = C1047.f3863;
        int i16 = C3911.f12484;
        int iM6984 = C2105.m6981("ۡᩳ") ^ i15;
        int i17 = ((iM6984 ^ i16) * 1459) ^ 1204356275;
        int i18 = iM6984 ^ 162823765;
        short[] sArr2 = null;
        File file = null;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i16) * 11681) >> 31));
            switch (i14) {
                case -2143462491:
                case 2087450038:
                    C2126.m7040();
                    if (C0483.f2088 < 0) {
                        c = c;
                        s2 = s2;
                        iM2566 = C0630.m2566("ۡۨ") ^ i15;
                        i = ((iM2566 ^ i16) * 7063) ^ 1003455147;
                        i2 = 1325684465;
                        i4 = iM2566 ^ i2;
                        c = c;
                        s2 = s2;
                        i18 = i4;
                        i17 = i;
                    }
                    iM6981 = (C2105.m6981("ܿ᩵") + i15) * (-119);
                    i = ((iM6981 ^ i16) * 10699) ^ 981340851;
                    i5 = -2108702119;
                    i18 = iM6981 ^ i5;
                    i17 = i;
                    break;
                case -2085594257:
                case -708307619:
                    if (C21923.f70183 == 0) {
                        iM6981 = C2105.m6981("֨۬") ^ i15;
                        i = ((iM6981 ^ i16) * 9537) ^ (-1778827269);
                        i5 = -755325939;
                        i18 = iM6981 ^ i5;
                        i17 = i;
                    }
                    c = c;
                    s2 = s2;
                    iM2566 = (C2105.m6981("ۤᩳ") ^ i15) * 35;
                    i = ((iM2566 ^ i16) * (-31915)) ^ 1296931819;
                    i2 = -1852406143;
                    i4 = iM2566 ^ i2;
                    c = c;
                    s2 = s2;
                    i18 = i4;
                    i17 = i;
                    break;
                case -2068128563:
                case -112016908:
                    s = s2;
                    c = 0;
                    if (C3245.f10203 <= 0) {
                        iM6982 = (i16 - C2105.m6981("۠᩹")) * 89;
                        i7 = ((iM6982 ^ i15) * (-17449)) ^ 1100865737;
                        i6 = -2120438829;
                    } else {
                        iM6982 = (C2105.m6981("ܺ᩷") + i16) * (-19);
                        i7 = ((iM6982 ^ i15) * 11179) ^ 1949557707;
                        i6 = 414526365;
                    }
                    i18 = iM6982 ^ i6;
                    i17 = i7;
                    s2 = s;
                    break;
                case -2066967410:
                case -1946834377:
                    c = c;
                    s2 = s2;
                    if (C7811.m20844() != 0) {
                        iM2566 = (C2105.m6981("ۤᩳ") ^ i15) * 35;
                        i = ((iM2566 ^ i16) * (-31915)) ^ 1296931819;
                        i2 = -1852406143;
                    } else {
                        iM2566 = C0630.m2566("ܳ᩶") ^ i15;
                        i = ((iM2566 ^ i16) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH) ^ (-981719086);
                        i2 = 771817266;
                    }
                    i4 = iM2566 ^ i2;
                    c = c;
                    s2 = s2;
                    i18 = i4;
                    i17 = i;
                    break;
                case -1930082914:
                case -1800511011:
                    c = c;
                    s2 = s2;
                    iM6983 = C2105.m6981(strM12817);
                    i8 = 2127612601;
                    if (C1420.f5096 <= 0) {
                        iM2566 = (C0630.m2566("ۧܿ") + i16) * (-27);
                        i = ((iM2566 ^ i15) * 29981) ^ (-1041186542);
                        i2 = 808859757;
                    } else {
                        iM2566 = C0630.m2566("۠۬") ^ i16;
                        i = ((iM2566 ^ i15) * 29969) ^ (-1553067383);
                        i2 = -779938236;
                    }
                    i4 = iM2566 ^ i2;
                    c = c;
                    s2 = s2;
                    i18 = i4;
                    i17 = i;
                    break;
                case -1782210932:
                case 1035727350:
                    C0714.m2805();
                    C2520.m8026();
                    break;
                case -1552415752:
                case -1162979507:
                    c = c;
                    s2 = s2;
                    sArr2 = f38538;
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C0630.m2566("ۡۨ") ^ i15;
                        i = ((iM2566 ^ i16) * 7063) ^ 1003455147;
                        i2 = 1325684465;
                    } else {
                        iM2566 = C0630.m2566("ܶᩴ") ^ i16;
                        i = ((iM2566 ^ i15) * 25229) ^ (-1818951517);
                        i2 = 1650000678;
                    }
                    i4 = iM2566 ^ i2;
                    c = c;
                    s2 = s2;
                    i18 = i4;
                    i17 = i;
                    break;
                case -1200290555:
                case 1307196347:
                    C0422.m1963();
                    if (C2167.m7155()) {
                        iM6981 = (C0630.m2566("۠ۧ") ^ i15) * 23;
                        i = ((iM6981 ^ i16) * 7475) ^ (-62228442);
                        i5 = 904319815;
                    } else {
                        iM6981 = C0630.m2566("۬֨") ^ i16;
                        i = ((iM6981 ^ i15) * 12893) ^ 421540688;
                        i5 = 158618542;
                    }
                    i18 = iM6981 ^ i5;
                    i17 = i;
                    break;
                case -1097922898:
                case 1027215147:
                    C3245.m9925();
                    c = c;
                    s2 = s2;
                    iM2566 = (C0630.m2566("ۧܿ") + i16) * (-27);
                    i = ((iM2566 ^ i15) * 29981) ^ (-1041186542);
                    i2 = 808859757;
                    i4 = iM2566 ^ i2;
                    c = c;
                    s2 = s2;
                    i18 = i4;
                    i17 = i;
                    break;
                case -1071005507:
                case -979059017:
                    c = c;
                    s2 = sArr2[c];
                    s3 = 29404;
                    if (C1773.f6144 <= 0) {
                        iM2567 = (C0630.m2566("۠ܳ") ^ i16) * (-85);
                        i = ((iM2567 ^ i15) * (-21379)) ^ 216285261;
                        i3 = -2088373345;
                    } else {
                        iM2567 = (C0630.m2566("۠ۡ") + i15) * 11;
                        i = ((iM2567 ^ i16) * 9185) ^ 932549469;
                        i3 = -82060366;
                    }
                    i4 = iM2567 ^ i3;
                    c = c;
                    i18 = i4;
                    i17 = i;
                    break;
                case -1032024129:
                case 356596409:
                    C2520.m8026();
                    break;
                case -1018295992:
                case 329186694:
                    System.exit(0);
                    break;
                case -1017345686:
                case 2012272133:
                    try {
                        Charset charset = StandardCharsets.UTF_8;
                        c = c;
                        s2 = s2;
                        try {
                            C1047.m3601((TextView) findViewById(C0630.m2566(C3537.m10748(f38538, 36, 3, i12)) ^ 2124484433), C15843.m37502(file));
                            iM2566 = (C0630.m2566("ܺᩳ") ^ i16) * 91;
                            i = ((iM2566 ^ i15) * (-5951)) ^ (-1322504918);
                            i2 = -383992332;
                        } catch (Exception unused) {
                            iM2566 = (C2105.m6981("᩺֨") ^ i16) * 59;
                            i = ((iM2566 ^ i15) * (-6197)) ^ 188639710;
                            i2 = -152528623;
                        }
                    } catch (Exception unused2) {
                        c = c;
                        s2 = s2;
                    }
                    i4 = iM2566 ^ i2;
                    c = c;
                    s2 = s2;
                    i18 = i4;
                    i17 = i;
                    break;
                case -986162481:
                case 2114486085:
                    C3746.m11369();
                    break;
                case -971044237:
                case 1504010795:
                    break;
                case -950131024:
                case 125679452:
                    i12 = 20068;
                    iM2566 = (C2105.m6981("֫֡") ^ i16) * (-69);
                    i = ((iM2566 ^ i15) * (-5145)) ^ 562373891;
                    i2 = -607494435;
                    i4 = iM2566 ^ i2;
                    c = c;
                    s2 = s2;
                    i18 = i4;
                    i17 = i;
                    break;
                case -914389283:
                case 1710969921:
                    c = c;
                    s2 = s2;
                    if (zM5732) {
                        iM2566 = (C2105.m6981("᩻ۛ") ^ i15) * (-51);
                        i = ((iM2566 ^ i16) * 4857) ^ (-442298577);
                        i2 = -1484631472;
                    } else {
                        iM2566 = (C2105.m6981("᩺֨") ^ i16) * 59;
                        i = ((iM2566 ^ i15) * (-6197)) ^ 188639710;
                        i2 = -152528623;
                    }
                    i4 = iM2566 ^ i2;
                    c = c;
                    s2 = s2;
                    i18 = i4;
                    i17 = i;
                    break;
                case -615543055:
                case -586510887:
                    c = c;
                    s2 = s2;
                    if (i9 - (i10 + i11) <= 0) {
                        iM2566 = (C0630.m2566("ۛۛ") + i15) * 87;
                        i = ((iM2566 ^ i16) * (-2371)) ^ (-1290829753);
                        i2 = 1627398150;
                    } else {
                        iM2566 = (C2105.m6981("ۨܶ") + i16) * (-39);
                        i = ((iM2566 ^ i15) * 22011) ^ (-445275494);
                        i2 = -734081865;
                    }
                    i4 = iM2566 ^ i2;
                    c = c;
                    s2 = s2;
                    i18 = i4;
                    i17 = i;
                    break;
                case -555042185:
                case -68950128:
                    break;
                case -455918757:
                case 378669502:
                    c = c;
                    s2 = s2;
                    i13 = 1;
                    if (C4616.f14690 <= 0) {
                        iM2566 = (C0630.m2566("ܰۛ") + i16) * (-45);
                        i = ((iM2566 ^ i15) * 4201) ^ 736404591;
                        i2 = -778245563;
                    } else {
                        iM2566 = (C2105.m6981("ۙ᩸") + i16) * (-85);
                        i = ((iM2566 ^ i15) * (-1601)) ^ (-1947393598);
                        i2 = 164861757;
                    }
                    i4 = iM2566 ^ i2;
                    c = c;
                    s2 = s2;
                    i18 = i4;
                    i17 = i;
                    break;
                case -345717414:
                case -282430404:
                    c = c;
                    s2 = s2;
                    i9 = s2 * s3;
                    i10 = s2 * s2;
                    if (C1047.f3863 < 0) {
                        iM2566 = (C0630.m2566("ۚ֨") + i15) * 95;
                        i = ((iM2566 ^ i16) * 20465) ^ (-2130866621);
                        i2 = -2007225346;
                        i4 = iM2566 ^ i2;
                        c = c;
                        s2 = s2;
                        i18 = i4;
                        i17 = i;
                    } else {
                        s2 = s2;
                        iM2567 = (C0630.m2566("۠ܳ") ^ i16) * (-85);
                        i = ((iM2567 ^ i15) * (-21379)) ^ 216285261;
                        i3 = -2088373345;
                        i4 = iM2567 ^ i3;
                        c = c;
                        i18 = i4;
                        i17 = i;
                    }
                    break;
                case -275273337:
                case 2033295511:
                    if (C22628.f73083 > 0) {
                        s = s2;
                        iM6982 = (i16 - C2105.m6981("۠᩹")) * 89;
                        i7 = ((iM6982 ^ i15) * (-17449)) ^ 1100865737;
                        i6 = -2120438829;
                        i18 = iM6982 ^ i6;
                        i17 = i7;
                        s2 = s;
                    } else {
                        iM6981 = (C2105.m6981("ܿ᩵") + i15) * (-119);
                        i = ((iM6981 ^ i16) * 10699) ^ 981340851;
                        i5 = -2108702119;
                        i18 = iM6981 ^ i5;
                        i17 = i;
                    }
                    break;
                case -142162217:
                case 1650761704:
                    c = c;
                    s2 = s2;
                    i11 = 216148804;
                    if (C1773.f6144 <= 0) {
                        iM2566 = (C0630.m2566("ۧܿ") + i16) * (-27);
                        i = ((iM2566 ^ i15) * 29981) ^ (-1041186542);
                        i2 = 808859757;
                    } else {
                        iM2566 = C0630.m2566("ۧۡ") ^ i16;
                        i = ((iM2566 ^ i15) * 28385) ^ (-1649408050);
                        i2 = 1005156118;
                    }
                    i4 = iM2566 ^ i2;
                    c = c;
                    s2 = s2;
                    i18 = i4;
                    i17 = i;
                    break;
                case -52443502:
                case 1797299585:
                    c = c;
                    s2 = s2;
                    try {
                        File file2 = new File(RunnableC1108.m3789(f38538, 4, 32, i12));
                        try {
                            zM5732 = C1711.m5732(file2);
                            int iM6985 = (C2105.m6981("ۤۤ") + i15) * (-57);
                            file = file2;
                            i17 = ((iM6985 ^ i16) * (-20633)) ^ (-997646438);
                            c = c;
                            s2 = s2;
                            i18 = iM6985 ^ (-437328034);
                        } catch (Exception unused3) {
                            file = file2;
                            iM2566 = (C2105.m6981("᩺֨") ^ i16) * 59;
                            i = ((iM2566 ^ i15) * (-6197)) ^ 188639710;
                            i2 = -152528623;
                            i4 = iM2566 ^ i2;
                            c = c;
                            s2 = s2;
                            i18 = i4;
                            i17 = i;
                        }
                    } catch (Exception unused4) {
                        file = null;
                    }
                    break;
                case 90887139:
                case 1602361120:
                    if (C1047.f3863 >= 0) {
                        c = c;
                        s2 = s2;
                        iM2566 = (C0630.m2566("ܰۛ") + i16) * (-45);
                        i = ((iM2566 ^ i15) * 4201) ^ 736404591;
                        i2 = -778245563;
                        i4 = iM2566 ^ i2;
                        c = c;
                        s2 = s2;
                        i18 = i4;
                        i17 = i;
                    }
                    c = c;
                    s2 = s2;
                    iM2566 = (C0630.m2566("ۧܿ") + i16) * (-27);
                    i = ((iM2566 ^ i15) * 29981) ^ (-1041186542);
                    i2 = 808859757;
                    i4 = iM2566 ^ i2;
                    c = c;
                    s2 = s2;
                    i18 = i4;
                    i17 = i;
                    break;
                case 526585900:
                case 1312918279:
                    c = c;
                    s2 = s2;
                    super.onCreate(bundle);
                    sArr = f38538;
                    if (C3245.f10203 <= 0) {
                        iM2566 = C0630.m2566("ۡۨ") ^ i15;
                        i = ((iM2566 ^ i16) * 7063) ^ 1003455147;
                        i2 = 1325684465;
                    } else {
                        iM2566 = (C0630.m2566("᩶۫") ^ i15) * (-121);
                        i = ((iM2566 ^ i16) * 12877) ^ 863612792;
                        i2 = -999506465;
                    }
                    i4 = iM2566 ^ i2;
                    c = c;
                    s2 = s2;
                    i18 = i4;
                    i17 = i;
                    break;
                case 862146728:
                case 1603699361:
                    c = c;
                    s2 = s2;
                    strM12817 = C4263.m12817(sArr, i13, 3, i12);
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = (C2105.m6981("ۤᩳ") ^ i15) * 35;
                        i = ((iM2566 ^ i16) * (-31915)) ^ 1296931819;
                        i2 = -1852406143;
                    } else {
                        iM2566 = C2105.m6981("᩸۠") ^ i15;
                        i = ((iM2566 ^ i16) * (-39)) ^ (-2087751497);
                        i2 = 433414108;
                    }
                    i4 = iM2566 ^ i2;
                    c = c;
                    s2 = s2;
                    i18 = i4;
                    i17 = i;
                    break;
                case 1911536764:
                case 1964262473:
                    i12 = 36134;
                    iM2566 = (C2105.m6981("֫֡") ^ i16) * (-69);
                    i = ((iM2566 ^ i15) * (-5145)) ^ 562373891;
                    i2 = -607494435;
                    i4 = iM2566 ^ i2;
                    c = c;
                    s2 = s2;
                    i18 = i4;
                    i17 = i;
                    break;
                default:
                    c = c;
                    s2 = s2;
                    setContentView(iM6983 ^ i8);
                    iM2566 = (C0630.m2566("ۗۢ") + i15) * 97;
                    i = ((iM2566 ^ i16) * (-24499)) ^ (-12368866);
                    i2 = -236166571;
                    i4 = iM2566 ^ i2;
                    c = c;
                    s2 = s2;
                    i18 = i4;
                    i17 = i;
                    break;
            }
            return;
        }
    }
}
