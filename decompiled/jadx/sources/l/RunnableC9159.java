package l;

import android.app.Application;
import android.content.Intent;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۡ᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VR */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9159 implements Runnable {

    /* JADX INFO: renamed from: ᩻ۨۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f27719 = {260, 19164, 19136, 19161, 19147, 19141, 19138, 19173, 19144};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27720;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f27721;

    public /* synthetic */ RunnableC9159(String str, int i) {
        int i2 = -1760137212;
        int i3 = C0050.f910;
        int i4 = C4075.f12947;
        this.f27720 = i;
        this.f27721 = str;
        int iM6981 = (C2105.m6981("ۚܽ") + i4) * 119;
        int i5 = ((iM6981 ^ i3) * 13737) ^ 1858295134;
        int i6 = 1579772769;
        while (true) {
            i2 = (iM6981 ^ i6) ^ (i5 & (((i2 ^ i3) * (-13293)) >> 31));
            switch (i2) {
                case -2061814625:
                case 280101688:
                    AbstractC2021.m6574();
                    iM6981 = (i4 - C2105.m6981("ۨۚ")) * (-83);
                    i5 = ((iM6981 ^ i3) * 233) ^ (-126198141);
                    i6 = -372265344;
                    break;
                case -734953710:
                case 72784964:
                    C4117.m12364();
                    if (C1916.m6308() < 0) {
                        iM6981 = C2105.m6981("᩻᩵") ^ i4;
                        i5 = ((iM6981 ^ i3) * 10727) ^ (-1245025032);
                        i6 = 222521885;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۨۚ")) * (-83);
                        i5 = ((iM6981 ^ i3) * 233) ^ (-126198141);
                        i6 = -372265344;
                    }
                    break;
                case 121439780:
                case 1474926115:
                    if (C0714.f2697 >= 0) {
                        iM6981 = C2105.m6981("᩻᩵") ^ i4;
                        i5 = ((iM6981 ^ i3) * 10727) ^ (-1245025032);
                        i6 = 222521885;
                    } else {
                        iM6981 = C2105.m6981("֨ᩳ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-32459)) ^ 79679598;
                        i6 = 680831890;
                    }
                    break;
                case 588216302:
                case 1508551872:
                    C0237.m1481();
                    RunnableC1108.m3790();
                    throw new RuntimeException();
                case 672544750:
                case 765632494:
                    C22628.m50615();
                    if (C4159.f13567) {
                        iM6981 = C2105.m6981("᩻᩵") ^ i4;
                        i5 = ((iM6981 ^ i3) * 10727) ^ (-1245025032);
                        i6 = 222521885;
                    } else {
                        iM6981 = C2105.m6981("ۢۖ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 4703) ^ 99597310;
                        i6 = -73873573;
                    }
                    break;
                case 805168770:
                case 1583691545:
                    return;
                default:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = (i4 - C2105.m6981("ۖ۟")) * 47;
                        i5 = ((iM6981 ^ i3) * 27381) ^ (-1363096046);
                        i6 = 624067631;
                    } else {
                        iM6981 = C0630.m2566("֨۫") ^ i3;
                        i5 = ((iM6981 ^ i4) * 26733) ^ 1036180235;
                        i6 = -1564435439;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x022c A[PHI: r6 r7 r8 r16 r17
      0x022c: PHI (r6v3 int) = (r6v2 int), (r6v1 int) binds: [B:71:0x022a, B:67:0x0207] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r7v3 int) = (r7v2 int), (r7v1 int) binds: [B:71:0x022a, B:67:0x0207] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:71:0x022a, B:67:0x0207] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r16v10 'e' java.lang.Exception) = (r16v9 'e' java.lang.Exception), (r16v11 'e' java.lang.Exception) binds: [B:71:0x022a, B:67:0x0207] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r17v8 int) = (r17v7 int), (r17v9 int) binds: [B:71:0x022a, B:67:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x029f A[PHI: r4 r9 r16 r17
      0x029f: PHI (r4v3 char) = (r4v2 char), (r4v1 char), (r4v1 char) binds: [B:79:0x029d, B:63:0x01e2, B:13:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x029f: PHI (r9v3 short) = (r9v1 short), (r9v2 short), (r9v1 short) binds: [B:79:0x029d, B:63:0x01e2, B:13:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x029f: PHI (r16v22 'e' java.lang.Exception) = (r16v7 'e' java.lang.Exception), (r16v12 'e' java.lang.Exception), (r16v25 'e' java.lang.Exception) binds: [B:79:0x029d, B:63:0x01e2, B:13:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x029f: PHI (r17v20 int) = (r17v5 int), (r17v10 int), (r17v23 int) binds: [B:79:0x029d, B:63:0x01e2, B:13:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        if (l.C11340.f33930 >= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
    
        if (l.C4616.m13552() != 0) goto L8;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int iM2566;
        int i;
        int iM6981;
        int i2;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        int i7 = 1516674710;
        int i8 = ServiceConnectionC3453.f10921;
        int i9 = C4075.f12947;
        int iM6982 = (C2105.m6981("ܽ᩹") ^ i9) * (-109);
        int i10 = ((iM6982 ^ i8) * 1265) ^ 598818243;
        int i11 = iM6982 ^ (-1831739934);
        String str = null;
        Exception e = null;
        while (true) {
            i7 = ((((i7 ^ i8) * 29905) >> 31) & i10) ^ i11;
            switch (i7) {
                case -2073432724:
                case -282920690:
                    e = e;
                    i7 = i7;
                    if (C4075.f12947 >= 0) {
                        iM2566 = C0630.m2566("ܶۖ") ^ i8;
                        i10 = ((iM2566 ^ i9) * 25855) ^ 1611179938;
                        i = 409685;
                    } else {
                        iM2566 = (C0630.m2566("ۘۖ") ^ i9) * (-45);
                        i10 = ((iM2566 ^ i8) * 19237) ^ (-1465178304);
                        i = 1190377007;
                    }
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -2024633487:
                case 1551384916:
                    break;
                case -2014663020:
                case 937469431:
                    e = e;
                    i7 = i7;
                    if (C3911.f12484 >= 0) {
                        iM2566 = C2105.m6981("۫ۖ") ^ i8;
                        i10 = ((iM2566 ^ i9) * (-27981)) ^ 830054181;
                        i = -903065327;
                    } else {
                        iM2566 = (C2105.m6981("ᩳ۬") ^ i8) * 13;
                        i10 = ((iM2566 ^ i9) * 30121) ^ 1185266849;
                        i = 2049108935;
                    }
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -1984504914:
                case 1863628239:
                    C4075.m12263();
                    break;
                case -1965633333:
                case -1933393941:
                    e = e;
                    i7 = i7;
                    int i12 = this.f27720;
                    str = this.f27721;
                    switch (i12) {
                        case 0:
                            iM2566 = C2105.m6981("ۧ᩺") ^ i9;
                            i10 = ((iM2566 ^ i8) * 18859) ^ 2007779730;
                            i = 1695704915;
                            break;
                        default:
                            iM2566 = (C0630.m2566("۠ۜ") ^ i8) * (-17);
                            i10 = ((iM2566 ^ i9) * (-22941)) ^ 1430539319;
                            i = -1332787307;
                            break;
                    }
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -1843617978:
                case -1286089276:
                    e = e;
                    i7 = i7;
                    int i13 = s + s2;
                    if ((i13 * i13) - i5 > 0) {
                        iM2566 = (C0630.m2566("ۗ۫") ^ i8) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i10 = ((iM2566 ^ i9) * 15025) ^ (-281614225);
                        i = 1576041114;
                    } else {
                        iM2566 = (i9 - C0630.m2566("۟ۧ")) * 19;
                        i10 = ((iM2566 ^ i8) * (-20461)) ^ 79783830;
                        i = -1205793305;
                    }
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -1838608473:
                case -418245018:
                    e = e;
                    i7 = i7;
                    if (C7106.m19120() <= 0) {
                        iM2566 = (C2105.m6981("ۘۤ") ^ i8) * 27;
                        i10 = ((iM2566 ^ i9) * 18687) ^ 1892399355;
                        i = -854514193;
                    } else {
                        iM2566 = (i8 - C0630.m2566("۫ܳ")) * 93;
                        i10 = ((iM2566 ^ i9) * 11399) ^ 830098802;
                        i = -1851109692;
                    }
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -1812054050:
                case 154978729:
                    e = e;
                    i7 = i7;
                    int i14 = i3 + i4;
                    i5 = i14 + i14;
                    if (C7811.m20844() != 0) {
                        iM2566 = (i9 - C2105.m6981("۟֡")) * 43;
                        i10 = ((iM2566 ^ i8) * (-23653)) ^ (-2083317519);
                        i = 246894094;
                    } else {
                        iM2566 = C0630.m2566("ᩴܳ") ^ i8;
                        i10 = ((iM2566 ^ i9) * 5245) ^ (-525502592);
                        i = 853624282;
                    }
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -1600909126:
                case 2064648235:
                    RunnableC1937.m6387();
                    if (C11340.f33930 < 0) {
                        e = e;
                        i7 = i7;
                        iM2566 = (C0630.m2566("ۨܶ") ^ i8) * (-59);
                        i10 = ((iM2566 ^ i9) * (-21365)) ^ (-46920216);
                        i = 235476823;
                        i11 = iM2566 ^ i;
                        e = e;
                        i7 = i7;
                    }
                    e = e;
                    i7 = i7;
                    iM2566 = C2105.m6981("۫ۖ") ^ i8;
                    i10 = ((iM2566 ^ i9) * (-27981)) ^ 830054181;
                    i = -903065327;
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -1533883926:
                case -33318320:
                    e = e;
                    i7 = i7;
                    i3 = s * s;
                    i4 = 21659716;
                    if (C4616.f14690 <= 0) {
                        iM2566 = (i9 - C2105.m6981("۟֡")) * 43;
                        i10 = ((iM2566 ^ i8) * (-23653)) ^ (-2083317519);
                        i = 246894094;
                    } else {
                        iM2566 = (i8 - C2105.m6981("ۛ᩺")) * (-27);
                        i10 = ((iM2566 ^ i9) * (-16875)) ^ 1034240934;
                        i = -1844679221;
                    }
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -1500312265:
                case -1136832447:
                    i6 = 19116;
                    iM2566 = (C2105.m6981("᩶ܳ") ^ i8) * (-125);
                    i10 = ((iM2566 ^ i9) * (-9591)) ^ 1692271831;
                    i = -962481300;
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -1445048524:
                case 855687931:
                    C2126.m7040();
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C2105.m6981("᩵۫") ^ i9;
                        i10 = ((iM6981 ^ i8) * 5337) ^ 1455441769;
                        i2 = 1736805069;
                        i11 = iM6981 ^ i2;
                    } else {
                        e = e;
                        i7 = i7;
                        iM2566 = C0630.m2566("ܶۖ") ^ i8;
                        i10 = ((iM2566 ^ i9) * 25855) ^ 1611179938;
                        i = 409685;
                        i11 = iM2566 ^ i;
                        e = e;
                        i7 = i7;
                    }
                    break;
                case -1425760302:
                case -216355039:
                    try {
                        Application applicationM10479 = C3432.m10479();
                        int i15 = ActivityC4094.f13021;
                        Intent intent = new Intent(applicationM10479, (Class<?>) ActivityC4094.class);
                        C0798.m3009(intent, 268435456);
                        i7 = i7;
                        try {
                            C1504.m5168(intent, C0483.m2128(f27719, 1, 8, i6), str);
                            C21923.m49344(C0382.m1842(), intent);
                            iM2566 = C0630.m2566("ܺ᩹") ^ i9;
                            i10 = ((iM2566 ^ i8) * 27919) ^ (-199388228);
                            i = -735859981;
                            i11 = iM2566 ^ i;
                            e = e;
                        } catch (Exception e2) {
                            e = e2;
                            int iM2567 = (C0630.m2566("֫ۨ") + i9) * 43;
                            i10 = (-1838573870) ^ ((iM2567 ^ i8) * (-4019));
                            i11 = (-1532953300) ^ iM2567;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        i7 = i7;
                    }
                    i7 = i7;
                    break;
                case -1384885756:
                case 2092458653:
                    break;
                case -1349359772:
                case -270688253:
                    C1047.m3599();
                    if (C3432.f10845 >= 0) {
                        e = e;
                        i7 = i7;
                        iM2566 = (C2105.m6981("ᩳ᩷") + i9) * (-9);
                        i10 = ((iM2566 ^ i8) * (-25427)) ^ (-1590447515);
                        i = 1538926635;
                        i11 = iM2566 ^ i;
                        e = e;
                        i7 = i7;
                    }
                    e = e;
                    i7 = i7;
                    iM2566 = C0630.m2566("ܶۖ") ^ i8;
                    i10 = ((iM2566 ^ i9) * 25855) ^ 1611179938;
                    i = 409685;
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -1297731562:
                case 1946678208:
                    C0630.m2564();
                    if (C1711.m5736() > 0) {
                        e = e;
                        i7 = i7;
                        iM2566 = (C2105.m6981("۬۬") ^ i8) * (-115);
                        i10 = ((iM2566 ^ i9) * 15161) ^ 1637550137;
                        i = 745311370;
                        i11 = iM2566 ^ i;
                        e = e;
                        i7 = i7;
                    }
                    e = e;
                    i7 = i7;
                    iM2566 = (C2105.m6981("ۘۤ") ^ i8) * 27;
                    i10 = ((iM2566 ^ i9) * 18687) ^ 1892399355;
                    i = -854514193;
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -905859549:
                case -313948424:
                    C4925.m14314((CharSequence) str);
                    break;
                case -638647122:
                case -569013355:
                    e = e;
                    i7 = i7;
                    s2 = 4654;
                    if (C4616.f14690 <= 0) {
                        iM2566 = (C2105.m6981("۬۬") ^ i8) * (-115);
                        i10 = ((iM2566 ^ i9) * 15161) ^ 1637550137;
                        i = 745311370;
                    } else {
                        iM2566 = C2105.m6981("᩶ۨ") ^ i9;
                        i10 = ((iM2566 ^ i8) * 2925) ^ 1278646288;
                        i = 990904110;
                    }
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -376436708:
                case 1014043323:
                    if (!C0714.m2805()) {
                        e = e;
                        i7 = i7;
                        iM2566 = (C0630.m2566("ۡۚ") ^ i9) * (-51);
                        i10 = ((iM2566 ^ i8) * 5725) ^ (-1092151489);
                        i = -1582173875;
                        i11 = iM2566 ^ i;
                        e = e;
                        i7 = i7;
                    }
                    e = e;
                    i7 = i7;
                    iM2566 = C2105.m6981("۫ۖ") ^ i8;
                    i10 = ((iM2566 ^ i9) * (-27981)) ^ 830054181;
                    i = -903065327;
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -319728827:
                case -191557153:
                    C7106.m19120();
                    e = e;
                    i7 = i7;
                    iM2566 = C2105.m6981("۫ۖ") ^ i8;
                    i10 = ((iM2566 ^ i9) * (-27981)) ^ 830054181;
                    i = -903065327;
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -29039763:
                case 1453369014:
                    i6 = 64966;
                    iM2566 = (C2105.m6981("᩶ܳ") ^ i8) * (-125);
                    i10 = ((iM2566 ^ i9) * (-9591)) ^ 1692271831;
                    i = -962481300;
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case 369217830:
                case 1917608018:
                    e = e;
                    i7 = i7;
                    if (C2167.f7158 >= 0) {
                        iM2566 = (C0630.m2566("ۨܶ") ^ i8) * (-59);
                        i10 = ((iM2566 ^ i9) * (-21365)) ^ (-46920216);
                        i = 235476823;
                    } else {
                        iM2566 = C2105.m6981("ۢۛ") ^ i9;
                        i10 = ((iM2566 ^ i8) * (-4125)) ^ (-1584423342);
                        i = 1867111303;
                    }
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case 466360789:
                case 1091190282:
                    e = e;
                    i7 = i7;
                    s = sArr[c];
                    if (C3663.m11168() >= 0) {
                        iM2566 = (C2105.m6981("ᩳ᩷") + i9) * (-9);
                        i10 = ((iM2566 ^ i8) * (-25427)) ^ (-1590447515);
                        i = 1538926635;
                    } else {
                        iM2566 = C2105.m6981("ܶܺ") ^ i9;
                        i10 = ((iM2566 ^ i8) * 8545) ^ 200115542;
                        i = 1985506636;
                    }
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case 651917610:
                case 1949174198:
                    C4263.m12819();
                    break;
                case 917108915:
                case 1828761313:
                    if (C21923.f70183 == 0) {
                        iM6981 = (C2105.m6981("ۛ۠") + i9) * 85;
                        i10 = ((iM6981 ^ i8) * 21455) ^ 104393222;
                        i2 = 977119196;
                        i11 = iM6981 ^ i2;
                    } else {
                        e = e;
                        i7 = i7;
                        iM2566 = C2105.m6981("۫ۖ") ^ i8;
                        i10 = ((iM2566 ^ i9) * (-27981)) ^ 830054181;
                        i = -903065327;
                        i11 = iM2566 ^ i;
                        e = e;
                        i7 = i7;
                    }
                    break;
                case 1093598333:
                case 1789480663:
                    e = e;
                    i7 = i7;
                    c = 0;
                    if (C4616.m13552() != 0) {
                        iM2566 = (C2105.m6981("۬۬") ^ i8) * (-115);
                        i10 = ((iM2566 ^ i9) * 15161) ^ 1637550137;
                        i = 745311370;
                    } else {
                        iM2566 = C2105.m6981("ܰ۟") ^ i8;
                        i10 = ((iM2566 ^ i9) * 15077) ^ 1558095516;
                        i = -147126006;
                    }
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case 1645032110:
                case 1900064017:
                    e = e;
                    i7 = i7;
                    sArr = f27719;
                    if (C4075.f12947 >= 0) {
                        iM2566 = (C0630.m2566("ۡۚ") ^ i9) * (-51);
                        i10 = ((iM2566 ^ i8) * 5725) ^ (-1092151489);
                        i = -1582173875;
                    } else {
                        iM2566 = (C0630.m2566("ܶ֫") ^ i9) * (-15);
                        i10 = ((iM2566 ^ i8) * 9559) ^ 964825192;
                        i = 897319914;
                    }
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                default:
                    C3683.m11220(C0050.m947(e));
                    i7 = i7;
                    iM2566 = C0630.m2566("ܺ᩹") ^ i9;
                    i10 = ((iM2566 ^ i8) * 27919) ^ (-199388228);
                    i = -735859981;
                    i11 = iM2566 ^ i;
                    e = e;
                    i7 = i7;
                    break;
            }
            return;
        }
    }
}
