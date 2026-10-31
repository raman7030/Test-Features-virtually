package l;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۧ᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 12B7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11276 extends AbstractC7548 {

    /* JADX INFO: renamed from: ᩵᩹ܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f33780 = {3762, -9388, 8531, -8741, -16193, 16163, 12960, 20291, 5956, 5193, 5189, 5198, 5199, 5197, 5199, 5214, 5241, 5214, 5208, 5187, 5188, 5197, 5122, 5124, 5124, 5124, 5123};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f33781;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f33782;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f33783;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f33784;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7042 f33785;

    /* JADX WARN: Code duplicated, block: B:29:0x00df A[PHI: r5 r8
      0x00df: PHI (r5v4 java.lang.String) = (r5v3 java.lang.String), (r5v2 java.lang.String) binds: [B:28:0x00dd, B:7:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r8v4 short[]) = (r8v3 short[]), (r8v2 short[]) binds: [B:28:0x00dd, B:7:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0201 A[PHI: r7 r10 r12 r14 r15
      0x0201: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:54:0x01ff, B:32:0x0114, B:24:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:54:0x01ff, B:32:0x0114, B:24:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r12v4 short) = (r12v3 short), (r12v2 short), (r12v2 short) binds: [B:54:0x01ff, B:32:0x0114, B:24:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r14v4 short[]) = (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:54:0x01ff, B:32:0x0114, B:24:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:54:0x01ff, B:32:0x0114, B:24:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0258 A[PHI: r4 r9 r18
      0x0258: PHI (r4v4 org.json.JSONObject) = 
      (r4v2 org.json.JSONObject)
      (r4v3 org.json.JSONObject)
      (r4v2 org.json.JSONObject)
      (r4v2 org.json.JSONObject)
      (r4v2 org.json.JSONObject)
     binds: [B:62:0x0256, B:36:0x0136, B:15:0x007e, B:13:0x007a, B:10:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:62:0x0256, B:36:0x0136, B:15:0x007e, B:13:0x007a, B:10:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r18v4 int) = (r18v3 int), (r18v2 int), (r18v2 int), (r18v2 int), (r18v2 int) binds: [B:62:0x0256, B:36:0x0136, B:15:0x007e, B:13:0x007a, B:10:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x028d A[PHI: r3 r17
      0x028d: PHI (r3v4 l.ᩳᩴۡ) = (r3v2 l.ᩳᩴۡ), (r3v3 l.ᩳᩴۡ), (r3v2 l.ᩳᩴۡ) binds: [B:66:0x028b, B:40:0x015b, B:10:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:66:0x028b, B:40:0x015b, B:10:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02c1 A[PHI: r16 r23
      0x02c1: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:70:0x02bf, B:58:0x0236, B:13:0x007a, B:7:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r23v5 int) = (r23v3 int), (r23v4 int), (r23v3 int), (r23v3 int) binds: [B:70:0x02bf, B:58:0x0236, B:13:0x007a, B:7:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        int iM6981;
        int i;
        int i2;
        int i3 = C2520.f8000;
        int i4 = C7811.f24123;
        int iM2566 = (C0630.m2566("ᩴᩴ") + i3) * 51;
        int i5 = ((iM2566 ^ i4) * (-18899)) ^ (-161540804);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2566 ^ (-954505888);
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        char c = 0;
        int i11 = 0;
        int i12 = 603568435;
        int i13 = 0;
        short[] sArr3 = null;
        String str = null;
        String strM50614 = null;
        JSONObject jSONObjectM51353 = null;
        C18237 c18237M3787 = null;
        String str2 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * (-4373)) >> 31));
            switch (i12) {
                case -2065282307:
                case -2033748273:
                    jSONObjectM51353 = C23175.m51353(c18237M3787);
                    if (C7106.m19120() <= 0) {
                        iM6981 = (C0630.m2566("ܽᩴ") + i4) * 77;
                        i = ((iM6981 ^ i3) * 25591) ^ 2067806387;
                        i2 = -637571209;
                    } else {
                        iM6981 = C2105.m6981("֫ۜ") ^ i4;
                        i = ((iM6981 ^ i3) * 5715) ^ (-1403783590);
                        i2 = -1673138129;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -2028052626:
                case 105594853:
                    str = "";
                    iM6981 = C2105.m6981("ᩳۤ") ^ i4;
                    i = ((iM6981 ^ i3) * (-9547)) ^ (-227873683);
                    i2 = -714126241;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1715565129:
                case -275918026:
                    str2 = this.f33781;
                    if (C1711.m5741(str2) == 0) {
                        iM6981 = (C2105.m6981("ۢ᩺") + i3) * 77;
                        i = ((iM6981 ^ i4) * (-7051)) ^ 123110588;
                        i2 = -2017052078;
                    } else {
                        iM6981 = C2105.m6981("ۢܿ") ^ i4;
                        i = ((iM6981 ^ i3) * (-30135)) ^ 444179925;
                        i2 = 1987612806;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1703072066:
                case 918375552:
                    s = sArr3[c];
                    i11 = s * s;
                    if (C1420.f5096 <= 0) {
                        iM6981 = (C0630.m2566("ܽᩴ") + i4) * 77;
                        i = ((iM6981 ^ i3) * 25591) ^ 2067806387;
                        i2 = -637571209;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۜۚ")) * (-53);
                        i = ((iM6981 ^ i4) * 20415) ^ 1543740202;
                        i2 = 2090712921;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1671250716:
                case 1765930127:
                    C4159.m12575(strM50614, C1420.m4902(sArr2, i8, 14, i9));
                    str = strM50614;
                    iM6981 = C2105.m6981("ᩳۤ") ^ i4;
                    i = ((iM6981 ^ i3) * (-9547)) ^ (-227873683);
                    i2 = -714126241;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1610410001:
                case 1904180244:
                    i9 = 5162;
                    iM6981 = (C0630.m2566("֨ᩴ") ^ i4) * 51;
                    i = ((iM6981 ^ i3) * 13607) ^ (-484756894);
                    i2 = -1654674297;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1586278824:
                case 936848875:
                    c = '\b';
                    if (C4159.f13567) {
                        iM6981 = (i4 - C0630.m2566("۠֫")) * (-61);
                        i = ((iM6981 ^ i3) * 13849) ^ 2027292958;
                        i2 = -1352110860;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩵۠")) * 69;
                        i = ((iM6981 ^ i4) * 1515) ^ 2039140775;
                        i2 = -140147449;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1458801786:
                case -365948010:
                    if ((s * s2) - i13 <= 0) {
                        iM6981 = (i4 - C2105.m6981("ܽ۬")) * (-75);
                        i = ((iM6981 ^ i3) * (-24937)) ^ (-693185297);
                        i2 = -1345944500;
                    } else {
                        iM6981 = C2105.m6981("ۡۤ") ^ i3;
                        i = ((iM6981 ^ i4) * 16925) ^ (-2014172738);
                        i2 = 236892464;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1360502052:
                case 1548330609:
                    C3683.m11222();
                    break;
                case -1334607227:
                case 766870521:
                    sArr = f33780;
                    i10 = 9;
                    i7 = 4;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (C0630.m2566("֫ܳ") + i4) * 71;
                        i = ((iM6981 ^ i3) * 2623) ^ 166885731;
                        i2 = -296053482;
                    } else {
                        iM6981 = C0630.m2566("ܳ᩵") ^ i3;
                        i = ((iM6981 ^ i4) * (-3123)) ^ 233737869;
                        i2 = -1109423768;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1213996001:
                case -803233121:
                    if (C3537.m10746() <= 0) {
                        iM6981 = (C0630.m2566("ۨ᩹") ^ i3) * (-119);
                        i = ((iM6981 ^ i4) * 25725) ^ (-1065965193);
                        i2 = 471236065;
                    } else {
                        iM6981 = (i4 - C2105.m6981("᩷۬")) * 47;
                        i = ((iM6981 ^ i3) * 3361) ^ 1276874983;
                        i2 = -192886888;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -947353252:
                case 1416192503:
                    c18237M3787 = RunnableC1108.m3787(4372);
                    C0483.m2120(c18237M3787, str2);
                    if (C3683.f11629 >= 0) {
                        iM6981 = (i3 - C2105.m6981("᩵۠")) * 69;
                        i = ((iM6981 ^ i4) * 1515) ^ 2039140775;
                        i2 = -140147449;
                    } else {
                        iM6981 = C2105.m6981("ۜ᩺") ^ i3;
                        i = ((iM6981 ^ i4) * 3289) ^ 1856832823;
                        i2 = 256011703;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -610926706:
                case 1687991241:
                    this.f33783 = str;
                    break;
                case -300989357:
                case 968575940:
                    s2 = 30766;
                    if (C11340.f33930 >= 0) {
                        iM6981 = (C0630.m2566("֫ܳ") + i4) * 71;
                        i = ((iM6981 ^ i3) * 2623) ^ 166885731;
                        i2 = -296053482;
                    } else {
                        iM6981 = C0630.m2566("ᩴ᩵") ^ i3;
                        i = ((iM6981 ^ i4) * 8297) ^ (-1795123470);
                        i2 = 581694803;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -288550688:
                case -21606495:
                    i8 = 13;
                    if (C3537.f11231 >= 0) {
                        iM6981 = (C0630.m2566("֫ܳ") + i4) * 71;
                        i = ((iM6981 ^ i3) * 2623) ^ 166885731;
                        i2 = -296053482;
                    } else {
                        iM6981 = (C0630.m2566("ܰܽ") + i4) * (-55);
                        i = ((iM6981 ^ i3) * 6923) ^ (-17774965);
                        i2 = 1500941328;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 180347276:
                case 1472051577:
                    C4159.m12565();
                    RunnableC1937.m6387();
                    iM6981 = (C0630.m2566("ܽᩴ") + i4) * 77;
                    i = ((iM6981 ^ i3) * 25591) ^ 2067806387;
                    i2 = -637571209;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 290693375:
                case 359131484:
                    sArr3 = f33780;
                    if (C3245.f10203 <= 0) {
                        iM6981 = (C0630.m2566("ۨ᩹") ^ i3) * (-119);
                        i = ((iM6981 ^ i4) * 25725) ^ (-1065965193);
                        i2 = 471236065;
                    } else {
                        iM6981 = C2105.m6981("۫ۙ") ^ i3;
                        i = ((iM6981 ^ i4) * (-7881)) ^ (-732306616);
                        i2 = 718756674;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 914077854:
                case 1578091182:
                    strM50614 = C22628.m50614(jSONObjectM51353, C0483.m2128(sArr, i10, i7, i9));
                    sArr2 = f33780;
                    if (C3432.f10845 >= 0) {
                        iM6981 = (i4 - C2105.m6981("᩷۬")) * 47;
                        i = ((iM6981 ^ i3) * 3361) ^ 1276874983;
                        i2 = -192886888;
                    } else {
                        iM6981 = C2105.m6981("᩶ܰ") ^ i3;
                        i = ((iM6981 ^ i4) * (-24775)) ^ (-508163296);
                        i2 = 1701503950;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 975892587:
                case 1578931446:
                    C3019.m9255();
                    if (C4263.m12819() >= 0) {
                        iM6981 = (C0630.m2566("ܽᩴ") + i4) * 77;
                        i = ((iM6981 ^ i3) * 25591) ^ 2067806387;
                        i2 = -637571209;
                    } else {
                        iM6981 = (i3 - C2105.m6981("᩵۠")) * 69;
                        i = ((iM6981 ^ i4) * 1515) ^ 2039140775;
                        i2 = -140147449;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1429115306:
                case 1634141123:
                    C2520.m8026();
                    if (C1504.f5354) {
                        iM6981 = (C0630.m2566("ܽᩴ") + i4) * 77;
                        i = ((iM6981 ^ i3) * 25591) ^ 2067806387;
                        i2 = -637571209;
                    } else {
                        iM6981 = (C0630.m2566("ۨ᩹") ^ i3) * (-119);
                        i = ((iM6981 ^ i4) * 25725) ^ (-1065965193);
                        i2 = 471236065;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1804749035:
                case 1857113098:
                    i13 = i11 + 236636689;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (C0630.m2566("ۨ᩹") ^ i3) * (-119);
                        i = ((iM6981 ^ i4) * 25725) ^ (-1065965193);
                        i2 = 471236065;
                    } else {
                        iM6981 = C2105.m6981("֨ܽ") ^ i4;
                        i = ((iM6981 ^ i3) * (-4623)) ^ 1215142065;
                        i2 = 1610561409;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    i9 = 53216;
                    iM6981 = (C0630.m2566("֨ᩴ") ^ i4) * 51;
                    i = ((iM6981 ^ i3) * 13607) ^ (-484756894);
                    i2 = -1654674297;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m27882() {
        ViewOnClickListenerC7042 viewOnClickListenerC7042 = null;
        EnumC13728 enumC13728Mo19832 = null;
        int i = 1399176498;
        int i2 = ViewOnClickListenerC1958.f6529;
        int i3 = C0050.f910;
        int iM2566 = C0630.m2566("ᩴᩳ") ^ i2;
        int i4 = ((iM2566 ^ i3) * 20155) ^ 640774898;
        int i5 = -539491440;
        while (true) {
            i = ((((i ^ i3) * (-26341)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2002730791:
                case 425045730:
                    if (C2958.m9033(viewOnClickListenerC7042)) {
                        iM2566 = C0630.m2566("۟ܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-17157)) ^ 1549192764;
                        i5 = 1200105422;
                    } else {
                        iM2566 = C2105.m6981("ܿۨ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 5817) ^ (-230740409);
                        i5 = -260122723;
                    }
                    break;
                case -1946621480:
                case 1188545051:
                    viewOnClickListenerC7042 = this.f33785;
                    if (C21923.f70183 != 0) {
                        iM2566 = C2105.m6981("ۡ۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-18597)) ^ 1870477902;
                        i5 = 1154816082;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ܶۙ")) * (-105);
                        i4 = ((iM2566 ^ i2) * 13623) ^ (-542767212);
                        i5 = -582356717;
                    }
                    break;
                case -1909428272:
                case -479415540:
                    if (C3663.f11553) {
                        iM2566 = C0630.m2566("ܽۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-31253)) ^ (-1890576265);
                        i5 = -903827324;
                    } else {
                        iM2566 = (C2105.m6981("᩶᩸") + i3) * 21;
                        i4 = ((iM2566 ^ i2) * 31065) ^ 1545435661;
                        i5 = 829431240;
                    }
                    break;
                case -1775407474:
                case 270342180:
                    C7106.m19120();
                    iM2566 = C0630.m2566("ܽۚ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-31253)) ^ (-1890576265);
                    i5 = -903827324;
                    break;
                case -1708396359:
                case 318243089:
                    if (RunnableC1108.m3790()) {
                        iM2566 = (i3 - C0630.m2566("ۖۛ")) * (-25);
                        i4 = ((iM2566 ^ i2) * 4391) ^ (-333300735);
                        i5 = 1139316942;
                    } else {
                        iM2566 = C2105.m6981("۟ۤ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-1957)) ^ (-818725061);
                        i5 = -1187994252;
                    }
                    break;
                case -1643908210:
                case 895263058:
                    C2126.m7040();
                    C1047.m3599();
                    return false;
                case -1537371101:
                case 52500329:
                    enumC13728Mo19832 = C2958.m9023(viewOnClickListenerC7042).mo19832();
                    if (C5695.f17556 >= 0) {
                        iM2566 = (C2105.m6981("᩹ۡ") ^ i2) * (-109);
                        i4 = ((iM2566 ^ i3) * 25081) ^ (-897885861);
                        i5 = 2960860;
                    } else {
                        iM2566 = C2105.m6981("֡᩹") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-14067)) ^ 475711195;
                        i5 = -127264886;
                    }
                    break;
                case -1260035242:
                case 80724537:
                    if (enumC13728Mo19832.m33028(EnumC13728.CREATED)) {
                        iM2566 = C0630.m2566("ۤ۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 4933) ^ (-1519808867);
                        i5 = 1441138077;
                    } else {
                        iM2566 = C0630.m2566("۟ܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-17157)) ^ 1549192764;
                        i5 = 1200105422;
                    }
                    break;
                case -1251593060:
                case 775345777:
                    C0050.m940();
                    if (C1773.m5908() <= 0) {
                        iM2566 = C2105.m6981("ۡ۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-18597)) ^ 1870477902;
                        i5 = 1154816082;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۖۛ")) * (-25);
                        i4 = ((iM2566 ^ i2) * 4391) ^ (-333300735);
                        i5 = 1139316942;
                    }
                    break;
                case -1200563918:
                case 1139660177:
                    C0714.m2805();
                    if (!C1916.f6442) {
                        iM2566 = (i3 - C0630.m2566("ۖۛ")) * (-25);
                        i4 = ((iM2566 ^ i2) * 4391) ^ (-333300735);
                        i5 = 1139316942;
                    } else {
                        iM2566 = (i2 - C2105.m6981("᩺ۖ")) * (-47);
                        i4 = ((iM2566 ^ i3) * 16847) ^ (-850896420);
                        i5 = 1586452795;
                    }
                    break;
                case -1108571189:
                case 1466690566:
                    if (C1420.m4913()) {
                        iM2566 = C0630.m2566("ܽۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-31253)) ^ (-1890576265);
                        i5 = -903827324;
                    } else {
                        iM2566 = C0630.m2566("ܺ᩺") ^ i2;
                        i4 = ((iM2566 ^ i3) * 3175) ^ (-1847141428);
                        i5 = 1188781990;
                    }
                    break;
                case -1050153449:
                case 29719853:
                    if (C1294.m4369(this.f33782, RunnableC3474.m10627())) {
                        iM2566 = (C0630.m2566("ۙܺ") ^ i3) * (-49);
                        i4 = ((iM2566 ^ i2) * 29767) ^ 1167171086;
                        i5 = 1534183415;
                    } else {
                        iM2566 = C0630.m2566("۟ܺ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-17157)) ^ 1549192764;
                        i5 = 1200105422;
                    }
                    break;
                case -953949853:
                case 329998274:
                    return false;
                case -919238186:
                case 1495678208:
                    if (C0237.m1481() >= 0) {
                        iM2566 = (i3 - C0630.m2566("ۖۛ")) * (-25);
                        i4 = ((iM2566 ^ i2) * 4391) ^ (-333300735);
                        i5 = 1139316942;
                    } else {
                        iM2566 = (C0630.m2566("֡ۚ") ^ i2) * 55;
                        i4 = ((iM2566 ^ i3) * (-8915)) ^ (-815758592);
                        i5 = -66478143;
                    }
                    break;
                case -888099284:
                case -796683600:
                    if (!C3663.f11553) {
                        iM2566 = C0630.m2566("ܽۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-31253)) ^ (-1890576265);
                        i5 = -903827324;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۖۛ")) * (-25);
                        i4 = ((iM2566 ^ i2) * 4391) ^ (-333300735);
                        i5 = 1139316942;
                    }
                    break;
                case -345349787:
                case -229114433:
                    if (C1504.f5354) {
                        iM2566 = (i3 - C0630.m2566("ۖۛ")) * (-25);
                        i4 = ((iM2566 ^ i2) * 4391) ^ (-333300735);
                        i5 = 1139316942;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ܽܶ")) * 91;
                        i4 = ((iM2566 ^ i2) * (-15221)) ^ (-893469817);
                        i5 = 1081047446;
                    }
                    break;
                case -310552938:
                case -276749981:
                    if (C0483.m2121()) {
                        iM2566 = C0630.m2566("ܶܽ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 20977) ^ 1632880482;
                        i5 = -608193185;
                    } else {
                        iM2566 = (i2 - C2105.m6981("᩺ۖ")) * (-47);
                        i4 = ((iM2566 ^ i3) * 16847) ^ (-850896420);
                        i5 = 1586452795;
                    }
                    break;
                case -13290335:
                case 988120392:
                    return true;
                case 656035539:
                case 1820574650:
                    if (C2272.f7362) {
                        iM2566 = C2105.m6981("ۡ۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-18597)) ^ 1870477902;
                        i5 = 1154816082;
                    } else {
                        iM2566 = (C0630.m2566("᩶ۛ") ^ i2) * (-55);
                        i4 = ((iM2566 ^ i3) * 3051) ^ (-883007047);
                        i5 = 127382087;
                    }
                    break;
                default:
                    if (C2167.m7155()) {
                        iM2566 = (i2 - C2105.m6981("᩺ۖ")) * (-47);
                        i4 = ((iM2566 ^ i3) * 16847) ^ (-850896420);
                        i5 = 1586452795;
                    } else {
                        iM2566 = (C2105.m6981("۬ܶ") + i2) * (-23);
                        i4 = ((iM2566 ^ i3) * 25817) ^ (-1495889532);
                        i5 = -1181886401;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        int i = 0;
        String str = null;
        String strM52807 = null;
        int i2 = 1735210943;
        int i3 = C4616.f14690;
        int i4 = C3683.f11629;
        int iM2566 = (C0630.m2566("֨ۜ") + i3) * 33;
        int i5 = ((iM2566 ^ i4) * 19063) ^ (-385915999);
        int i6 = -1943461762;
        while (true) {
            i2 = ((((i2 ^ i4) * 6891) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2096001100:
                case 1919292170:
                    if (m27882()) {
                        iM2566 = (C2105.m6981("᩶֨") + i3) * 53;
                        i5 = ((iM2566 ^ i4) * (-385)) ^ 970498634;
                        i6 = -114508936;
                    } else {
                        iM2566 = C2105.m6981("ۧ᩷") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-4823)) ^ (-1597709159);
                        i6 = -985233860;
                    }
                    break;
                case -2025730715:
                case 157355709:
                    if (C4075.f12947 >= 0) {
                        iM2566 = C0630.m2566("᩺ۙ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-18577)) ^ (-2130356801);
                        i6 = -363857583;
                    } else {
                        iM2566 = C2105.m6981("ۤܽ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-16509)) ^ 1714547545;
                        i6 = -1682413813;
                    }
                    break;
                case -1870123011:
                case 1466220123:
                    strM52807 = C23986.m52807(i, str);
                    if (C0714.f2697 >= 0) {
                        iM2566 = C2105.m6981("ۚ۬") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-5113)) ^ (-1704354091);
                        i6 = 443828735;
                    } else {
                        iM2566 = C0630.m2566("ۧۘ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 28261) ^ (-832595897);
                        i6 = -20911072;
                    }
                    break;
                case -1818564265:
                case -1134298079:
                    C3746.m11369();
                    C21923.m49329();
                    break;
                case -1735517094:
                case -1317276462:
                    if (C2105.m6982() != 0) {
                        iM2566 = (C2105.m6981("۬ۧ") + i4) * 13;
                        i5 = ((iM2566 ^ i3) * (-14421)) ^ (-1137777674);
                        i6 = -729164270;
                    } else {
                        iM2566 = (C0630.m2566("ۗۜ") + i3) * 71;
                        i5 = ((iM2566 ^ i4) * (-23739)) ^ (-1169946191);
                        i6 = 295392477;
                    }
                    break;
                case -1707365772:
                case -1214373650:
                    if (C4616.f14690 <= 0) {
                        iM2566 = C0630.m2566("᩺ۙ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-18577)) ^ (-2130356801);
                        i6 = -363857583;
                    } else {
                        iM2566 = C0630.m2566("ܽܳ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-17507)) ^ 1203155465;
                        i6 = -1545365472;
                    }
                    break;
                case -1494638143:
                case 1020218477:
                    if (C4263.m12819() >= 0) {
                        iM2566 = C0630.m2566("ᩳۤ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-5373)) ^ (-1777231721);
                        i6 = -84454573;
                    } else {
                        iM2566 = C0630.m2566("᩺ۙ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-18577)) ^ (-2130356801);
                        i6 = -363857583;
                    }
                    break;
                case -1367845471:
                case -54745182:
                    i = this.f33784;
                    str = this.f33783;
                    if (C3663.f11553) {
                        iM2566 = (C2105.m6981("۬ۧ") + i4) * 13;
                        i5 = ((iM2566 ^ i3) * (-14421)) ^ (-1137777674);
                        i6 = -729164270;
                    } else {
                        iM2566 = (C0630.m2566("ۤۙ") + i4) * (-119);
                        i5 = ((iM2566 ^ i3) * (-4425)) ^ 168240566;
                        i6 = -452619104;
                    }
                    break;
                case -1345574882:
                case 1073833673:
                    if (C5695.f17556 >= 0) {
                        iM2566 = C2105.m6981("ۗ᩶") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-27803)) ^ (-793616852);
                        i6 = -1697067874;
                    } else {
                        iM2566 = (C2105.m6981("ۘۗ") ^ i4) * (-7);
                        i5 = ((iM2566 ^ i3) * 19849) ^ (-1784517484);
                        i6 = 1583796375;
                    }
                    break;
                case -1258603043:
                case 834779041:
                    break;
                case -1123850990:
                case -60432489:
                    if (C1916.m6308() >= 0) {
                        iM2566 = C2105.m6981("ۚ۬") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-5113)) ^ (-1704354091);
                        i6 = 443828735;
                    } else {
                        iM2566 = (C2105.m6981("ۧ֡") ^ i4) * (-67);
                        i5 = ((iM2566 ^ i3) * (-10045)) ^ 2020932665;
                        i6 = 959291932;
                    }
                    break;
                case -1099313574:
                case 356415860:
                    C4159.m12565();
                    iM2566 = C2105.m6981("ۗ᩶") ^ i3;
                    i5 = ((iM2566 ^ i4) * (-27803)) ^ (-793616852);
                    i6 = -1697067874;
                    break;
                case -788663028:
                case 242460783:
                    C4117.m12364();
                    if (C4117.m12364() == 0) {
                        iM2566 = C0630.m2566("᩺ۙ") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-18577)) ^ (-2130356801);
                        i6 = -363857583;
                    } else {
                        iM2566 = C2105.m6981("ۗ᩶") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-27803)) ^ (-793616852);
                        i6 = -1697067874;
                    }
                    break;
                case -785259596:
                case 844551535:
                    if (C1916.f6442) {
                        iM2566 = (C0630.m2566("֨ۤ") + i4) * 63;
                        i5 = ((iM2566 ^ i3) * (-7117)) ^ 74727503;
                        i6 = -1710509319;
                    } else {
                        iM2566 = C2105.m6981("ۚ۬") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-5113)) ^ (-1704354091);
                        i6 = 443828735;
                    }
                    break;
                case -662966735:
                case 403434522:
                    C22628.m50608(this.f33785, strM52807);
                    iM2566 = C2105.m6981("ۧ᩷") ^ i4;
                    i5 = ((iM2566 ^ i3) * (-4823)) ^ (-1597709159);
                    i6 = -985233860;
                    break;
                case 237539861:
                case 318408659:
                    if (C0714.m2805()) {
                        iM2566 = (C2105.m6981("ᩳᩴ") + i3) * 99;
                        i5 = ((iM2566 ^ i4) * (-11385)) ^ 38413210;
                        i6 = -225477250;
                    } else {
                        iM2566 = C0630.m2566("ᩳۤ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-5373)) ^ (-1777231721);
                        i6 = -84454573;
                    }
                    break;
                case 965324999:
                case 1403587695:
                    if (C4159.f13567) {
                        iM2566 = C0630.m2566("ۗۗ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 23903) ^ (-82848056);
                        i6 = -141891692;
                    } else {
                        iM2566 = C0630.m2566("ᩳۤ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-5373)) ^ (-1777231721);
                        i6 = -84454573;
                    }
                    break;
                default:
                    if (C1047.m3599() < 0) {
                        iM2566 = (C2105.m6981("۬ۧ") + i4) * 13;
                        i5 = ((iM2566 ^ i3) * (-14421)) ^ (-1137777674);
                        i6 = -729164270;
                    } else {
                        iM2566 = C2105.m6981("ۗ᩶") ^ i3;
                        i5 = ((iM2566 ^ i4) * (-27803)) ^ (-793616852);
                        i6 = -1697067874;
                    }
                    break;
            }
            return;
        }
    }

    public C11276(ViewOnClickListenerC7042 viewOnClickListenerC7042, String str, String str2, int i) {
        int i2 = -678528265;
        int i3 = C2167.f7158;
        int i4 = C1773.f6144;
        this.f33785 = viewOnClickListenerC7042;
        this.f33781 = str;
        this.f33782 = str2;
        this.f33784 = i;
        int iM6981 = (C2105.m6981("ܺ᩻") + i4) * 57;
        int i5 = ((iM6981 ^ i3) * (-14755)) ^ 1581222233;
        int i6 = -1443817049;
        while (true) {
            i2 = (iM6981 ^ i6) ^ (i5 & (((i2 ^ i3) * (-31455)) >> 31));
            switch (i2) {
                case -1703629323:
                case 738149767:
                    C0422.m1963();
                    iM6981 = (C2105.m6981("ۛᩳ") ^ i4) * (-55);
                    i5 = ((iM6981 ^ i3) * 10849) ^ 1394282334;
                    i6 = 1490114261;
                    break;
                case -1280440361:
                case -873672134:
                    return;
                case -1047293992:
                case 240742100:
                    if (C0050.f910 >= 0) {
                        iM6981 = C0630.m2566("ۘᩳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-24669)) ^ (-1349049192);
                        i6 = -1814258792;
                    } else {
                        iM6981 = C0630.m2566("ۛۧ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 9151) ^ 1488674729;
                        i6 = 314213744;
                    }
                    break;
                case -943876916:
                case 543299095:
                    ViewOnClickListenerC1958.m6429();
                    if (C4075.f12947 < 0) {
                        iM6981 = (i3 - C0630.m2566("ۙ᩹")) * 81;
                        i5 = ((iM6981 ^ i4) * 16119) ^ 1325258146;
                        i6 = -269907775;
                    } else {
                        iM6981 = (C2105.m6981("ۛᩳ") ^ i4) * (-55);
                        i5 = ((iM6981 ^ i3) * 10849) ^ 1394282334;
                        i6 = 1490114261;
                    }
                    break;
                case -704477012:
                case -116828944:
                    if (C1420.f5096 <= 0) {
                        iM6981 = (i3 - C0630.m2566("ۙ᩹")) * 81;
                        i5 = ((iM6981 ^ i4) * 16119) ^ 1325258146;
                        i6 = -269907775;
                    } else {
                        iM6981 = C2105.m6981("۫ۖ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 32219) ^ 187810114;
                        i6 = -385865615;
                    }
                    break;
                case 729706620:
                case 1250621733:
                    if (C0237.m1481() < 0) {
                        iM6981 = (C2105.m6981("ۛᩳ") ^ i4) * (-55);
                        i5 = ((iM6981 ^ i3) * 10849) ^ 1394282334;
                        i6 = 1490114261;
                    } else {
                        iM6981 = C2105.m6981("ۚۧ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-9753)) ^ (-253263625);
                        i6 = -121687529;
                    }
                    break;
                default:
                    C4075.m12263();
                    C0964.m3413();
                    throw new RuntimeException();
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C3537.m10743(this, this.f33785);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01b4 A[PHI: r5 r12 r13
      0x01b4: PHI (r5v4 android.view.View) = (r5v2 android.view.View), (r5v3 android.view.View), (r5v2 android.view.View), (r5v2 android.view.View) binds: [B:115:0x01b4, B:50:0x01b2, B:30:0x00fa, B:12:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:115:0x01b4, B:50:0x01b2, B:30:0x00fa, B:12:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:115:0x01b4, B:50:0x01b2, B:30:0x00fa, B:12:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0310 A[PHI: r11 r16 r17
      0x0310: PHI (r11v5 java.lang.String) = (r11v2 java.lang.String), (r11v4 java.lang.String), (r11v2 java.lang.String) binds: [B:77:0x030c, B:34:0x0120, B:12:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0310: PHI (r16v9 short) = (r16v4 short), (r16v2 short), (r16v2 short) binds: [B:77:0x030c, B:34:0x0120, B:12:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0310: PHI (r17v7 int) = (r17v3 int), (r17v2 int), (r17v2 int) binds: [B:77:0x030c, B:34:0x0120, B:12:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        C11276 c11276 = this;
        int i4 = RunnableC1937.f6483;
        int i5 = C3911.f12484;
        int iM2567 = (C0630.m2566("ܰ᩵") ^ i4) * (-29);
        int i6 = ((iM2567 ^ i5) * (-947)) ^ (-614715105);
        String strM13559 = null;
        String strM13542 = null;
        short[] sArr = null;
        int i7 = iM2567 ^ (-310418126);
        int i8 = 0;
        int iM6982 = 0;
        int iM2568 = 0;
        int i9 = 0;
        StringBuilder sb = null;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -402652335;
        char c = 0;
        TextView textView = null;
        String strM12570 = null;
        View viewM3409 = null;
        ViewOnClickListenerC7042 viewOnClickListenerC7042 = null;
        Object obj = null;
        while (true) {
            i14 = i7 ^ (i6 & (((i14 ^ i5) * (-18849)) >> 31));
            switch (i14) {
                case -2107943005:
                case 378204579:
                    if (C2958.f9394 < 0) {
                        iM2566 = (C0630.m2566("ۙܳ") ^ i4) * 87;
                        i = ((iM2566 ^ i5) * (-17183)) ^ 282367031;
                        i2 = 1731570065;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM6981 = (C2105.m6981("᩷ۤ") ^ i5) * (-15);
                        i6 = ((iM6981 ^ i4) * 15421) ^ (-1630393222);
                        i3 = -1344684360;
                        i7 = iM6981 ^ i3;
                        c11276 = this;
                    }
                    break;
                case -2014596348:
                case -622737619:
                    i11 = i10 * i10;
                    i12 = s * s;
                    i13 = 114961284;
                    if (C4159.m12565() >= 0) {
                        iM2566 = C0630.m2566("᩹ܽ") ^ i5;
                        i = ((iM2566 ^ i4) * 26873) ^ 2059109599;
                        i2 = -653331715;
                    } else {
                        iM2566 = C2105.m6981("᩻۠") ^ i5;
                        i = ((iM2566 ^ i4) * 32383) ^ (-1567515514);
                        i2 = 964331609;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1985571054:
                case -783313683:
                    iM6982 = C2105.m6981(C0714.m2816(f33780, 1, 3, i8));
                    if (C1916.m6308() < 0) {
                        iM2566 = (i5 - C0630.m2566("ۗۙ")) * (-45);
                        i = ((iM2566 ^ i4) * (-1461)) ^ (-1055444844);
                        i2 = -1537219770;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        int iM2569 = (C0630.m2566("ۖۖ") ^ i5) * (-33);
                        i7 = iM2569 ^ 1730505345;
                        i6 = ((iM2569 ^ i4) * 23249) ^ (-763420041);
                        sb = null;
                    }
                    break;
                case -1894191164:
                case -1405312557:
                    ServiceConnectionC3453.m10561(viewOnClickListenerC7042, exc, obj);
                    break;
                case -1879529502:
                case -1015234325:
                    i8 = 59807;
                    iM2566 = (C0630.m2566("ۚᩴ") ^ i5) * (-77);
                    i = ((iM2566 ^ i4) * 1865) ^ 2116356451;
                    i2 = -1215068657;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1811329909:
                case 968579268:
                    textView = (TextView) C4263.m12813(viewOnClickListenerC7042, iM2568 ^ i9);
                    short[] sArr2 = f33780;
                    if (!C4159.f13567) {
                        int iM25610 = (C0630.m2566("ۖۖ") ^ i5) * (-33);
                        i7 = iM25610 ^ 1730505345;
                        i6 = ((iM25610 ^ i4) * 23249) ^ (-763420041);
                        sb = null;
                    } else {
                        sb = new StringBuilder(C4159.m12578(sArr2, 7, 1, i8));
                        strM13559 = C4616.m13559(exc);
                        if (C7106.f21815 == 0) {
                            iM2566 = (C2105.m6981("ۙᩳ") ^ i4) * 21;
                            i = ((iM2566 ^ i5) * (-24911)) ^ 1343808933;
                            i2 = 900981077;
                            i7 = iM2566 ^ i2;
                            i6 = i;
                        } else {
                            iM6981 = (C2105.m6981("᩷ۤ") ^ i5) * (-15);
                            i6 = ((iM6981 ^ i4) * 15421) ^ (-1630393222);
                            i3 = -1344684360;
                            i7 = iM6981 ^ i3;
                            c11276 = this;
                        }
                    }
                    break;
                case -1808023457:
                case 674454104:
                    sArr = f33780;
                    c = 0;
                    if (C0630.m2564()) {
                        iM6981 = (C2105.m6981("᩷ۤ") ^ i5) * (-15);
                        i6 = ((iM6981 ^ i4) * 15421) ^ (-1630393222);
                        i3 = -1344684360;
                    } else {
                        iM6981 = (C2105.m6981("ܿܺ") ^ i5) * (-83);
                        i6 = ((iM6981 ^ i4) * (-6921)) ^ (-1455063829);
                        i3 = -860363731;
                    }
                    i7 = iM6981 ^ i3;
                    c11276 = this;
                    break;
                case -1776732397:
                case -216801631:
                    RunnableC1937.m6387();
                    RunnableC1937.m6387();
                    iM6981 = (C2105.m6981("᩷ۤ") ^ i5) * (-15);
                    i6 = ((iM6981 ^ i4) * 15421) ^ (-1630393222);
                    i3 = -1344684360;
                    i7 = iM6981 ^ i3;
                    c11276 = this;
                    break;
                case -1741236377:
                case 944399440:
                    strM13542 = C4616.m13542(f33780, 4, 3, i8);
                    if (C22628.f73083 <= 0) {
                        iM2566 = C2105.m6981("ۘܰ") ^ i4;
                        i = ((iM2566 ^ i5) * (-20197)) ^ 380924381;
                        i2 = -2023098927;
                    } else {
                        iM2566 = C2105.m6981("ۡۧ") ^ i5;
                        i = ((iM2566 ^ i4) * 32169) ^ (-1020603851);
                        i2 = -1442816198;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1713385719:
                case -543517303:
                    int i15 = i12 + i13;
                    if ((i15 + i15) - i11 < 0) {
                        iM2566 = (C2105.m6981("ۛܳ") + i4) * 43;
                        i = ((iM2566 ^ i5) * 5237) ^ (-1170617418);
                        i2 = 244565012;
                    } else {
                        iM2566 = C0630.m2566("۟ۡ") ^ i4;
                        i = ((iM2566 ^ i5) * (-13651)) ^ (-173854104);
                        i2 = 2070325265;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1537409941:
                case 1844990976:
                    C4075.m12246(viewOnClickListenerC7042, exc, obj);
                    break;
                case -1530379064:
                case 1550115031:
                    break;
                case -1445663078:
                case -832099505:
                    viewM3409 = C0964.m3409(viewOnClickListenerC7042, 2100554779 ^ iM6982);
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C0630.m2566("ۙܳ") ^ i4) * 87;
                        i = ((iM2566 ^ i5) * (-17183)) ^ 282367031;
                        i2 = 1731570065;
                    } else {
                        iM2566 = (C2105.m6981("᩶᩹") + i5) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM2566 ^ i4) * (-6591)) ^ 340159189;
                        i2 = 939171940;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1064086306:
                case 988749746:
                    if (m27882()) {
                        iM2566 = C2105.m6981("ۖ᩹") ^ i5;
                        i = ((iM2566 ^ i4) * 29657) ^ 1607576958;
                        i2 = -1827260130;
                    } else {
                        iM2566 = (C2105.m6981("᩻᩵") + i4) * (-65);
                        i = ((iM2566 ^ i5) * (-18561)) ^ 1733658888;
                        i2 = -1473654613;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -1039076987:
                case -899260395:
                    C1420.m4905(sb, strM13559);
                    RunnableC1937.m6377(textView, C0050.m947(sb));
                    C1128.m3853(textView, 0);
                    break;
                case -843316128:
                case 1682773261:
                    if (C1294.m4369(c11276.f33781, strM12570.toUpperCase(Locale.ROOT))) {
                        iM2566 = C0630.m2566("᩻ۛ") ^ i4;
                        i = ((iM2566 ^ i5) * (-29317)) ^ (-565538638);
                        i2 = 165032845;
                    } else {
                        iM2566 = (C2105.m6981("ۙۗ") ^ i4) * 83;
                        i = ((iM2566 ^ i5) * 31239) ^ (-1359844504);
                        i2 = -1014844648;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case -687343264:
                case 1247018160:
                    C2167.m7155();
                    break;
                case -599575748:
                case 757894427:
                    strM12570 = C4159.m12570(C0422.m1959(C4117.m12350((EditText) viewM3409)));
                    if (C4263.f13799 > 0) {
                        iM2566 = C2105.m6981("ۤ֫") ^ i4;
                        i = ((iM2566 ^ i5) * 19475) ^ 1993293701;
                        i2 = 1549729805;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        int iM25611 = (C0630.m2566("ۖۖ") ^ i5) * (-33);
                        i7 = iM25611 ^ 1730505345;
                        i6 = ((iM25611 ^ i4) * 23249) ^ (-763420041);
                        sb = null;
                    }
                    break;
                case -392180197:
                case 1495325940:
                    short s2 = sArr[c];
                    int i16 = s2 + 10722;
                    if (!C1504.f5354) {
                        int iM25612 = C0630.m2566("ۨᩳ") ^ i4;
                        int i17 = ((iM25612 ^ i5) * 16329) ^ 744529533;
                        i7 = iM25612 ^ 1258481804;
                        s = s2;
                        i10 = i16;
                        i6 = i17;
                        c11276 = this;
                    } else {
                        s = s2;
                        i10 = i16;
                        iM2566 = C2105.m6981("ۘܰ") ^ i4;
                        i = ((iM2566 ^ i5) * (-20197)) ^ 380924381;
                        i2 = -2023098927;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    }
                    break;
                case -360338215:
                case 2090495976:
                    i8 = 20297;
                    iM2566 = (C0630.m2566("ۚᩴ") ^ i5) * (-77);
                    i = ((iM2566 ^ i4) * 1865) ^ 2116356451;
                    i2 = -1215068657;
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 34972684:
                case 1538851338:
                    if (!C1005.f3721) {
                        iM2566 = C0630.m2566("᩹ܽ") ^ i5;
                        i = ((iM2566 ^ i4) * 26873) ^ 2059109599;
                        i2 = -653331715;
                        i7 = iM2566 ^ i2;
                        i6 = i;
                    } else {
                        iM6981 = (C2105.m6981("᩷ۤ") ^ i5) * (-15);
                        i6 = ((iM6981 ^ i4) * 15421) ^ (-1630393222);
                        i3 = -1344684360;
                        i7 = iM6981 ^ i3;
                        c11276 = this;
                    }
                    break;
                case 209982672:
                case 1072623372:
                    C21923.m49329();
                    if (C4263.f13799 <= 0) {
                        iM2566 = (C0630.m2566("ۙܳ") ^ i4) * 87;
                        i = ((iM2566 ^ i5) * (-17183)) ^ 282367031;
                        i2 = 1731570065;
                    } else {
                        iM2566 = C2105.m6981("ۘܰ") ^ i4;
                        i = ((iM2566 ^ i5) * (-20197)) ^ 380924381;
                        i2 = -2023098927;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                case 788317629:
                case 1289987337:
                    iM2568 = C0630.m2566(strM13542);
                    i9 = 2099282360;
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (C0630.m2566("ۙܳ") ^ i4) * 87;
                        i = ((iM2566 ^ i5) * (-17183)) ^ 282367031;
                        i2 = 1731570065;
                    } else {
                        iM2566 = (C2105.m6981("ۧܺ") ^ i5) * (-83);
                        i = ((iM2566 ^ i4) * (-12007)) ^ 559956395;
                        i2 = -1340285403;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
                default:
                    boolean z = exc instanceof C1637;
                    obj = null;
                    viewOnClickListenerC7042 = c11276.f33785;
                    if (z) {
                        iM2566 = C0630.m2566("֨ۜ") ^ i4;
                        i = ((iM2566 ^ i5) * 14263) ^ 2061164066;
                        i2 = 1085079027;
                    } else {
                        iM2566 = (C2105.m6981("᩸۫") + i5) * 67;
                        i = ((iM2566 ^ i4) * (-29367)) ^ (-1894632023);
                        i2 = 62116504;
                    }
                    i7 = iM2566 ^ i2;
                    i6 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f33785.f21701 = false;
        C3911.m11927(this);
    }
}
