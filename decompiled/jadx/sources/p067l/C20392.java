package p067l;

import com.tencent.p062mm.opensdk.openapi.IWXAPI;
import com.tencent.p062mm.opensdk.openapi.WXAPIFactory;

/* JADX INFO: renamed from: l.ᩴ᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RP */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20392 implements InterfaceC4387 {

    /* JADX INFO: renamed from: ܿܰ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f82322 = {1505, 22042, 22040, 22039, 22040, 22027, 22016, 22030, 22017, 22044, 22092, 22092, 22088, 22091, 22090, 22080, 22091, 22042, 22095, 22045, 22081, 22089, 22091, 22092, 22080, 22030, 22017, 22044, 22043, 22042, 22090, 22047, 22043, 22043, 22094, 22094, 22093, 22088, 22042, 22088, 22095, 22042, 22044};

    /* JADX WARN: Code duplicated, block: B:36:0x0126 A[PHI: r12
      0x0126: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:35:0x0124, B:17:0x0088, B:15:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01f5 A[PHI: r8
      0x01f5: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:54:0x01f3, B:12:0x007e, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x022e A[PHI: r7
      0x022e: PHI (r7v4 int) = (r7v3 int), (r7v2 int) binds: [B:58:0x022c, B:9:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0280 A[PHI: r11 r13 r14 r21
      0x0280: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:66:0x027e, B:39:0x0157, B:30:0x00ef, B:15:0x0084, B:12:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:66:0x027e, B:39:0x0157, B:30:0x00ef, B:15:0x0084, B:12:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:66:0x027e, B:39:0x0157, B:30:0x00ef, B:15:0x0084, B:12:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0280: PHI (r21v5 char) = (r21v4 char), (r21v3 char), (r21v3 char), (r21v3 char), (r21v3 char) binds: [B:66:0x027e, B:39:0x0157, B:30:0x00ef, B:15:0x0084, B:12:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02b6 A[PHI: r1 r3 r5 r6 r10 r15 r16
      0x02b6: PHI (r1v5 java.lang.String) = (r1v2 java.lang.String), (r1v2 java.lang.String), (r1v4 java.lang.String), (r1v2 java.lang.String) binds: [B:70:0x02b4, B:62:0x0262, B:43:0x017b, B:24:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r3v3 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v4 int) binds: [B:70:0x02b4, B:62:0x0262, B:43:0x017b, B:24:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r5v4 short) = (r5v2 short), (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:70:0x02b4, B:62:0x0262, B:43:0x017b, B:24:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:70:0x02b4, B:62:0x0262, B:43:0x017b, B:24:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r10v4 short[]) = (r10v2 short[]), (r10v2 short[]), (r10v3 short[]), (r10v2 short[]) binds: [B:70:0x02b4, B:62:0x0262, B:43:0x017b, B:24:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r15v3 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v4 short[]) binds: [B:70:0x02b4, B:62:0x0262, B:43:0x017b, B:24:0x00af] A[DONT_GENERATE, DONT_INLINE]
      0x02b6: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:70:0x02b4, B:62:0x0262, B:43:0x017b, B:24:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.InterfaceC4387
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6293() {
        int iM55979;
        int i;
        int i2;
        String strM55921;
        int i3 = C0863.f81833;
        int i4 = C0894.f81854;
        int iM559710 = C0946.m55979("ܰۨ") ^ i3;
        int i5 = ((iM559710 ^ i4) * 11763) ^ 1995446005;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i6 = iM559710 ^ 164444790;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1199945938;
        char c = 0;
        String str = null;
        String strM16234 = null;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * (-3655)) >> 31));
            switch (i14) {
                case -1993964470:
                case 287743183:
                    sArr = f82322;
                    if (C1048.m56305() >= 0) {
                        iM55979 = C0946.m55979("۟ۤ") ^ i3;
                        i = ((iM55979 ^ i4) * 3871) ^ 1970147031;
                        i2 = 1073456302;
                    } else {
                        iM55979 = (C0946.m55979("᩺᩷") + i3) * 79;
                        i = ((iM55979 ^ i4) * 28633) ^ 1441852896;
                        i2 = -1531536146;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1942485356:
                case -768785350:
                    if (C0890.f81849 == 0) {
                        iM55979 = C0946.m55979("ܿ᩺") ^ i4;
                        i = ((iM55979 ^ i3) * (-17003)) ^ 2026157369;
                        i2 = 1004207486;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۜۜ")) * 87;
                        i = ((iM55979 ^ i4) * (-19807)) ^ 275181292;
                        i2 = -584514358;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1887056806:
                case 137876426:
                    i12 = 6;
                    if (C0937.f81884) {
                        iM55979 = (i3 - C0946.m55979("ܽᩳ")) * 95;
                        i = ((iM55979 ^ i4) * (-2891)) ^ (-1032808755);
                        i2 = 2055714766;
                    } else {
                        iM55979 = C0946.m55979("ܿ᩺") ^ i4;
                        i = ((iM55979 ^ i3) * (-17003)) ^ 2026157369;
                        i2 = 1004207486;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1866082647:
                case -1262048618:
                    s2 = 27596;
                    if (C1229.m56410() != 0) {
                        iM55979 = (C0946.m55979("ۙܶ") + i4) * (-5);
                        i = ((iM55979 ^ i3) * 781) ^ (-332806903);
                        i2 = -292626504;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۚۨ")) * (-79);
                        i = ((iM55979 ^ i4) * 26489) ^ 1881920511;
                        i2 = 2070603708;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1855625842:
                case 655375434:
                    C0845.m55584();
                    if (C1053.f81965 <= 0) {
                        iM55979 = (C0946.m55979("ۙܶ") + i4) * (-5);
                        i = ((iM55979 ^ i3) * 781) ^ (-332806903);
                        i2 = -292626504;
                    } else {
                        iM55979 = C0873.m55680("ۗᩴ") ^ i3;
                        i = ((iM55979 ^ i4) * 32459) ^ 1509671787;
                        i2 = -694257278;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1804450712:
                case -1221510365:
                    sArr3 = f82322;
                    i13 = 7;
                    if (C1003.m56123() != 0) {
                        iM55979 = (i3 - C0946.m55979("ۜۜ")) * 87;
                        i = ((iM55979 ^ i4) * (-19807)) ^ 275181292;
                        i2 = -584514358;
                    } else {
                        iM55979 = (i4 - C0946.m55979("֡ۧ")) * (-55);
                        i = ((iM55979 ^ i3) * 21665) ^ (-2119736624);
                        i2 = -1185772720;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1737287489:
                case 355057100:
                    c = 0;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = (i3 - C0946.m55979("ۜۜ")) * 87;
                        i = ((iM55979 ^ i4) * (-19807)) ^ 275181292;
                        i2 = -584514358;
                    } else {
                        iM55979 = (C0946.m55979("۟ۨ") ^ i4) * (-75);
                        i = ((iM55979 ^ i3) * (-9169)) ^ (-176586466);
                        i2 = 671960488;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1716654951:
                case -1516528344:
                    s = sArr[c];
                    i8 = s * s;
                    if (C0873.f81841 <= 0) {
                        iM55979 = C0946.m55979("۟ۤ") ^ i3;
                        i = ((iM55979 ^ i4) * 3871) ^ 1970147031;
                        i2 = 1073456302;
                    } else {
                        iM55979 = C0946.m55979("۫۟") ^ i4;
                        i = ((iM55979 ^ i3) * 26099) ^ (-935711572);
                        i2 = -1528301634;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1518321771:
                case -801557593:
                    i11 = 1;
                    if (RunnableC0938.f81886 >= 0) {
                        iM55979 = (i3 - C0946.m55979("ۜۜ")) * 87;
                        i = ((iM55979 ^ i4) * (-19807)) ^ 275181292;
                        i2 = -584514358;
                    } else {
                        iM55979 = (C0946.m55979("ܺܽ") + i3) * (-59);
                        i = ((iM55979 ^ i4) * (-19263)) ^ 1758168941;
                        i2 = 1235587486;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1441882918:
                case -1230896372:
                    C0947.m55997();
                    C0854.m55595();
                    return null;
                case -1434441699:
                case -1204446577:
                    RunnableC0897.m55784();
                    iM55979 = C0946.m55979("ܿ᩺") ^ i4;
                    i = ((iM55979 ^ i3) * (-17003)) ^ 2026157369;
                    i2 = 1004207486;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1403642234:
                case 44589183:
                    strM55921 = C1053.m56325(sArr4, i7, 18, i10);
                    str = strM55921;
                    iM55979 = (C0873.m55680("ۚܽ") ^ i3) * (-61);
                    i = ((iM55979 ^ i4) * 10765) ^ (-588314769);
                    i2 = 421517522;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -831138562:
                case -547452622:
                    RunnableC0938.m55938();
                    if (C0955.f81898) {
                        iM55979 = (i3 - C0946.m55979("ۜۜ")) * 87;
                        i = ((iM55979 ^ i4) * (-19807)) ^ 275181292;
                        i2 = -584514358;
                    } else {
                        iM55979 = (C0946.m55979("ۙܶ") + i4) * (-5);
                        i = ((iM55979 ^ i3) * 781) ^ (-332806903);
                        i2 = -292626504;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -827670229:
                case 1613114491:
                    i10 = 22137;
                    iM55979 = (C0873.m55680("ۢۛ") ^ i4) * (-65);
                    i = ((iM55979 ^ i3) * (-1437)) ^ (-1510446201);
                    i2 = 243379134;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -732783295:
                case 679086936:
                    i10 = 51096;
                    iM55979 = (C0873.m55680("ۢۛ") ^ i4) * (-65);
                    i = ((iM55979 ^ i3) * (-1437)) ^ (-1510446201);
                    i2 = 243379134;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -705614886:
                case 885201023:
                    if ((s * s2) - i9 > 0) {
                        iM55979 = (i3 - C0946.m55979("ܶ᩻")) * 81;
                        i = ((iM55979 ^ i4) * (-29035)) ^ (-664957472);
                        i2 = -899998492;
                    } else {
                        iM55979 = (C0946.m55979("ۤۤ") + i4) * (-65);
                        i = ((iM55979 ^ i3) * (-14225)) ^ (-1674493542);
                        i2 = 1953009580;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -687995173:
                case 698298243:
                    i9 = i8 + 190384804;
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0873.m55680("ۗᩴ") ^ i3;
                        i = ((iM55979 ^ i4) * 32459) ^ 1509671787;
                        i2 = -694257278;
                    } else {
                        iM55979 = (C0946.m55979("ܰۢ") ^ i3) * (-15);
                        i = ((iM55979 ^ i4) * (-22909)) ^ (-564162175);
                        i2 = 1056411925;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -392100307:
                case 1161007737:
                    sArr4 = f82322;
                    i7 = 25;
                    if (C0946.f81894 != 0) {
                        iM55979 = C0946.m55979("۟ۤ") ^ i3;
                        i = ((iM55979 ^ i4) * 3871) ^ 1970147031;
                        i2 = 1073456302;
                    } else {
                        iM55979 = C0946.m55979("ۜ᩵") ^ i4;
                        i = ((iM55979 ^ i3) * (-9969)) ^ (-366426010);
                        i2 = 556725494;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 381909428:
                case 1869263896:
                    IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(C1012.m56136(), str, true);
                    iwxapiCreateWXAPI.registerApp(str);
                    return iwxapiCreateWXAPI;
                case 410249793:
                case 571425803:
                    strM55921 = C0937.m55921(sArr3, i13, 18, i10);
                    str = strM55921;
                    iM55979 = (C0873.m55680("ۚܽ") ^ i3) * (-61);
                    i = ((iM55979 ^ i4) * 10765) ^ (-588314769);
                    i2 = 421517522;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 449935630:
                case 943072250:
                    strM16234 = C7050.m16234();
                    sArr2 = f82322;
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0946.m55979("۟ۤ") ^ i3;
                        i = ((iM55979 ^ i4) * 3871) ^ 1970147031;
                        i2 = 1073456302;
                    } else {
                        iM55979 = C0946.m55979("᩷֫") ^ i4;
                        i = ((iM55979 ^ i3) * (-30691)) ^ 1119548990;
                        i2 = 687538408;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    if (C5235.m11295((CharSequence) strM16234, (CharSequence) C1929.m56558(sArr2, i11, i12, i10), false)) {
                        iM55979 = C0873.m55680("᩵ۤ") ^ i3;
                        i = ((iM55979 ^ i4) * 547) ^ 1042900801;
                        i2 = 1574693495;
                    } else {
                        iM55979 = C0946.m55979("ۙܺ") ^ i4;
                        i = ((iM55979 ^ i3) * (-24457)) ^ 254048260;
                        i2 = 977921483;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }
}
