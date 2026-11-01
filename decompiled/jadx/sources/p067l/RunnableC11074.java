package p067l;

import android.app.Application;
import android.content.Intent;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۡ᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VR */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11074 implements Runnable {

    /* JADX INFO: renamed from: ᩻ۨۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f82098 = {260, 19164, 19136, 19161, 19147, 19141, 19138, 19173, 19144};

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f30660;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ String f30661;

    public /* synthetic */ RunnableC11074(String str, int i) {
        int i2 = -1760137212;
        int i3 = C0845.f81821;
        int i4 = C1044.f81959;
        this.f30660 = i;
        this.f30661 = str;
        int iM55979 = (C0946.m55979("ۚܽ") + i4) * 119;
        int i5 = ((iM55979 ^ i3) * 13737) ^ 1858295134;
        int i6 = 1579772769;
        while (true) {
            i2 = (iM55979 ^ i6) ^ (i5 & (((i2 ^ i3) * (-13293)) >> 31));
            switch (i2) {
                case -2061814625:
                case 280101688:
                    AbstractC0942.m55971();
                    iM55979 = (i4 - C0946.m55979("ۨۚ")) * (-83);
                    i5 = ((iM55979 ^ i3) * 233) ^ (-126198141);
                    i6 = -372265344;
                    break;
                case -734953710:
                case 72784964:
                    C1046.m56302();
                    if (C0937.m55918() < 0) {
                        iM55979 = C0946.m55979("᩻᩵") ^ i4;
                        i5 = ((iM55979 ^ i3) * 10727) ^ (-1245025032);
                        i6 = 222521885;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۨۚ")) * (-83);
                        i5 = ((iM55979 ^ i3) * 233) ^ (-126198141);
                        i6 = -372265344;
                    }
                    break;
                case 121439780:
                case 1474926115:
                    if (C0877.f81843 >= 0) {
                        iM55979 = C0946.m55979("᩻᩵") ^ i4;
                        i5 = ((iM55979 ^ i3) * 10727) ^ (-1245025032);
                        i6 = 222521885;
                    } else {
                        iM55979 = C0946.m55979("֨ᩳ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-32459)) ^ 79679598;
                        i6 = 680831890;
                    }
                    break;
                case 588216302:
                case 1508551872:
                    C0854.m55595();
                    RunnableC0897.m55784();
                    throw new RuntimeException();
                case 672544750:
                case 765632494:
                    C1964.m56597();
                    if (C1048.f81963) {
                        iM55979 = C0946.m55979("᩻᩵") ^ i4;
                        i5 = ((iM55979 ^ i3) * 10727) ^ (-1245025032);
                        i6 = 222521885;
                    } else {
                        iM55979 = C0946.m55979("ۢۖ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 4703) ^ 99597310;
                        i6 = -73873573;
                    }
                    break;
                case 805168770:
                case 1583691545:
                    return;
                default:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = (i4 - C0946.m55979("ۖ۟")) * 47;
                        i5 = ((iM55979 ^ i3) * 27381) ^ (-1363096046);
                        i6 = 624067631;
                    } else {
                        iM55979 = C0873.m55680("֨۫") ^ i3;
                        i5 = ((iM55979 ^ i4) * 26733) ^ 1036180235;
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
    
        if (p067l.C1404.f82149 >= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
    
        if (p067l.C1071.m56343() != 0) goto L8;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int iM55680;
        int i;
        int iM55979;
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
        int i8 = ServiceConnectionC1013.f81940;
        int i9 = C1044.f81959;
        int iM559710 = (C0946.m55979("ܽ᩹") ^ i9) * (-109);
        int i10 = ((iM559710 ^ i8) * 1265) ^ 598818243;
        int i11 = iM559710 ^ (-1831739934);
        String str = null;
        Exception e = null;
        while (true) {
            i7 = ((((i7 ^ i8) * 29905) >> 31) & i10) ^ i11;
            switch (i7) {
                case -2073432724:
                case -282920690:
                    e = e;
                    i7 = i7;
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0873.m55680("ܶۖ") ^ i8;
                        i10 = ((iM55680 ^ i9) * 25855) ^ 1611179938;
                        i = 409685;
                    } else {
                        iM55680 = (C0873.m55680("ۘۖ") ^ i9) * (-45);
                        i10 = ((iM55680 ^ i8) * 19237) ^ (-1465178304);
                        i = 1190377007;
                    }
                    i11 = iM55680 ^ i;
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
                    if (C1036.f81953 >= 0) {
                        iM55680 = C0946.m55979("۫ۖ") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-27981)) ^ 830054181;
                        i = -903065327;
                    } else {
                        iM55680 = (C0946.m55979("ᩳ۬") ^ i8) * 13;
                        i10 = ((iM55680 ^ i9) * 30121) ^ 1185266849;
                        i = 2049108935;
                    }
                    i11 = iM55680 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -1984504914:
                case 1863628239:
                    C1044.m56286();
                    break;
                case -1965633333:
                case -1933393941:
                    e = e;
                    i7 = i7;
                    int i12 = this.f30660;
                    str = this.f30661;
                    switch (i12) {
                        case 0:
                            iM55680 = C0946.m55979("ۧ᩺") ^ i9;
                            i10 = ((iM55680 ^ i8) * 18859) ^ 2007779730;
                            i = 1695704915;
                            break;
                        default:
                            iM55680 = (C0873.m55680("۠ۜ") ^ i8) * (-17);
                            i10 = ((iM55680 ^ i9) * (-22941)) ^ 1430539319;
                            i = -1332787307;
                            break;
                    }
                    i11 = iM55680 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -1843617978:
                case -1286089276:
                    e = e;
                    i7 = i7;
                    int i13 = s + s2;
                    if ((i13 * i13) - i5 > 0) {
                        iM55680 = (C0873.m55680("ۗ۫") ^ i8) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i10 = ((iM55680 ^ i9) * 15025) ^ (-281614225);
                        i = 1576041114;
                    } else {
                        iM55680 = (i9 - C0873.m55680("۟ۧ")) * 19;
                        i10 = ((iM55680 ^ i8) * (-20461)) ^ 79783830;
                        i = -1205793305;
                    }
                    i11 = iM55680 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -1838608473:
                case -418245018:
                    e = e;
                    i7 = i7;
                    if (C1194.m56396() <= 0) {
                        iM55680 = (C0946.m55979("ۘۤ") ^ i8) * 27;
                        i10 = ((iM55680 ^ i9) * 18687) ^ 1892399355;
                        i = -854514193;
                    } else {
                        iM55680 = (i8 - C0873.m55680("۫ܳ")) * 93;
                        i10 = ((iM55680 ^ i9) * 11399) ^ 830098802;
                        i = -1851109692;
                    }
                    i11 = iM55680 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -1812054050:
                case 154978729:
                    e = e;
                    i7 = i7;
                    int i14 = i3 + i4;
                    i5 = i14 + i14;
                    if (C1229.m56410() != 0) {
                        iM55680 = (i9 - C0946.m55979("۟֡")) * 43;
                        i10 = ((iM55680 ^ i8) * (-23653)) ^ (-2083317519);
                        i = 246894094;
                    } else {
                        iM55680 = C0873.m55680("ᩴܳ") ^ i8;
                        i10 = ((iM55680 ^ i9) * 5245) ^ (-525502592);
                        i = 853624282;
                    }
                    i11 = iM55680 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -1600909126:
                case 2064648235:
                    RunnableC0938.m55938();
                    if (C1404.f82149 < 0) {
                        e = e;
                        i7 = i7;
                        iM55680 = (C0873.m55680("ۨܶ") ^ i8) * (-59);
                        i10 = ((iM55680 ^ i9) * (-21365)) ^ (-46920216);
                        i = 235476823;
                        i11 = iM55680 ^ i;
                        e = e;
                        i7 = i7;
                    }
                    e = e;
                    i7 = i7;
                    iM55680 = C0946.m55979("۫ۖ") ^ i8;
                    i10 = ((iM55680 ^ i9) * (-27981)) ^ 830054181;
                    i = -903065327;
                    i11 = iM55680 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -1533883926:
                case -33318320:
                    e = e;
                    i7 = i7;
                    i3 = s * s;
                    i4 = 21659716;
                    if (C1071.f81975 <= 0) {
                        iM55680 = (i9 - C0946.m55979("۟֡")) * 43;
                        i10 = ((iM55680 ^ i8) * (-23653)) ^ (-2083317519);
                        i = 246894094;
                    } else {
                        iM55680 = (i8 - C0946.m55979("ۛ᩺")) * (-27);
                        i10 = ((iM55680 ^ i9) * (-16875)) ^ 1034240934;
                        i = -1844679221;
                    }
                    i11 = iM55680 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -1500312265:
                case -1136832447:
                    i6 = 19116;
                    iM55680 = (C0946.m55979("᩶ܳ") ^ i8) * (-125);
                    i10 = ((iM55680 ^ i9) * (-9591)) ^ 1692271831;
                    i = -962481300;
                    i11 = iM55680 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -1445048524:
                case 855687931:
                    C0947.m55997();
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0946.m55979("᩵۫") ^ i9;
                        i10 = ((iM55979 ^ i8) * 5337) ^ 1455441769;
                        i2 = 1736805069;
                        i11 = iM55979 ^ i2;
                    } else {
                        e = e;
                        i7 = i7;
                        iM55680 = C0873.m55680("ܶۖ") ^ i8;
                        i10 = ((iM55680 ^ i9) * 25855) ^ 1611179938;
                        i = 409685;
                        i11 = iM55680 ^ i;
                        e = e;
                        i7 = i7;
                    }
                    break;
                case -1425760302:
                case -216355039:
                    try {
                        Application applicationM56136 = C1012.m56136();
                        int i15 = ActivityC6260.f15835;
                        Intent intent = new Intent(applicationM56136, (Class<?>) ActivityC6260.class);
                        C0882.m55721(intent, 268435456);
                        i7 = i7;
                        try {
                            C0917.m55843(intent, C0866.m55652(f82098, 1, 8, i6), str);
                            C1929.m56568(C0861.m55620(), intent);
                            iM55680 = C0873.m55680("ܺ᩹") ^ i9;
                            i10 = ((iM55680 ^ i8) * 27919) ^ (-199388228);
                            i = -735859981;
                            i11 = iM55680 ^ i;
                            e = e;
                        } catch (Exception e2) {
                            e = e2;
                            int iM55681 = (C0873.m55680("֫ۨ") + i9) * 43;
                            i10 = (-1838573870) ^ ((iM55681 ^ i8) * (-4019));
                            i11 = (-1532953300) ^ iM55681;
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
                    C0894.m55769();
                    if (C1012.f81938 >= 0) {
                        e = e;
                        i7 = i7;
                        iM55680 = (C0946.m55979("ᩳ᩷") + i9) * (-9);
                        i10 = ((iM55680 ^ i8) * (-25427)) ^ (-1590447515);
                        i = 1538926635;
                        i11 = iM55680 ^ i;
                        e = e;
                        i7 = i7;
                    }
                    e = e;
                    i7 = i7;
                    iM55680 = C0873.m55680("ܶۖ") ^ i8;
                    i10 = ((iM55680 ^ i9) * 25855) ^ 1611179938;
                    i = 409685;
                    i11 = iM55680 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -1297731562:
                case 1946678208:
                    C0873.m55678();
                    if (C0927.m55873() > 0) {
                        e = e;
                        i7 = i7;
                        iM55680 = (C0946.m55979("۬۬") ^ i8) * (-115);
                        i10 = ((iM55680 ^ i9) * 15161) ^ 1637550137;
                        i = 745311370;
                        i11 = iM55680 ^ i;
                        e = e;
                        i7 = i7;
                    }
                    e = e;
                    i7 = i7;
                    iM55680 = (C0946.m55979("ۘۤ") ^ i8) * 27;
                    i10 = ((iM55680 ^ i9) * 18687) ^ 1892399355;
                    i = -854514193;
                    i11 = iM55680 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -905859549:
                case -313948424:
                    C7050.m16211((CharSequence) str);
                    break;
                case -638647122:
                case -569013355:
                    e = e;
                    i7 = i7;
                    s2 = 4654;
                    if (C1071.f81975 <= 0) {
                        iM55680 = (C0946.m55979("۬۬") ^ i8) * (-115);
                        i10 = ((iM55680 ^ i9) * 15161) ^ 1637550137;
                        i = 745311370;
                    } else {
                        iM55680 = C0946.m55979("᩶ۨ") ^ i9;
                        i10 = ((iM55680 ^ i8) * 2925) ^ 1278646288;
                        i = 990904110;
                    }
                    i11 = iM55680 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -376436708:
                case 1014043323:
                    if (!C0877.m55696()) {
                        e = e;
                        i7 = i7;
                        iM55680 = (C0873.m55680("ۡۚ") ^ i9) * (-51);
                        i10 = ((iM55680 ^ i8) * 5725) ^ (-1092151489);
                        i = -1582173875;
                        i11 = iM55680 ^ i;
                        e = e;
                        i7 = i7;
                    }
                    e = e;
                    i7 = i7;
                    iM55680 = C0946.m55979("۫ۖ") ^ i8;
                    i10 = ((iM55680 ^ i9) * (-27981)) ^ 830054181;
                    i = -903065327;
                    i11 = iM55680 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -319728827:
                case -191557153:
                    C1194.m56396();
                    e = e;
                    i7 = i7;
                    iM55680 = C0946.m55979("۫ۖ") ^ i8;
                    i10 = ((iM55680 ^ i9) * (-27981)) ^ 830054181;
                    i = -903065327;
                    i11 = iM55680 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case -29039763:
                case 1453369014:
                    i6 = 64966;
                    iM55680 = (C0946.m55979("᩶ܳ") ^ i8) * (-125);
                    i10 = ((iM55680 ^ i9) * (-9591)) ^ 1692271831;
                    i = -962481300;
                    i11 = iM55680 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case 369217830:
                case 1917608018:
                    e = e;
                    i7 = i7;
                    if (C0949.f81897 >= 0) {
                        iM55680 = (C0873.m55680("ۨܶ") ^ i8) * (-59);
                        i10 = ((iM55680 ^ i9) * (-21365)) ^ (-46920216);
                        i = 235476823;
                    } else {
                        iM55680 = C0946.m55979("ۢۛ") ^ i9;
                        i10 = ((iM55680 ^ i8) * (-4125)) ^ (-1584423342);
                        i = 1867111303;
                    }
                    i11 = iM55680 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case 466360789:
                case 1091190282:
                    e = e;
                    i7 = i7;
                    s = sArr[c];
                    if (C1024.m56209() >= 0) {
                        iM55680 = (C0946.m55979("ᩳ᩷") + i9) * (-9);
                        i10 = ((iM55680 ^ i8) * (-25427)) ^ (-1590447515);
                        i = 1538926635;
                    } else {
                        iM55680 = C0946.m55979("ܶܺ") ^ i9;
                        i10 = ((iM55680 ^ i8) * 8545) ^ 200115542;
                        i = 1985506636;
                    }
                    i11 = iM55680 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case 651917610:
                case 1949174198:
                    C1053.m56327();
                    break;
                case 917108915:
                case 1828761313:
                    if (C1929.f83011 == 0) {
                        iM55979 = (C0946.m55979("ۛ۠") + i9) * 85;
                        i10 = ((iM55979 ^ i8) * 21455) ^ 104393222;
                        i2 = 977119196;
                        i11 = iM55979 ^ i2;
                    } else {
                        e = e;
                        i7 = i7;
                        iM55680 = C0946.m55979("۫ۖ") ^ i8;
                        i10 = ((iM55680 ^ i9) * (-27981)) ^ 830054181;
                        i = -903065327;
                        i11 = iM55680 ^ i;
                        e = e;
                        i7 = i7;
                    }
                    break;
                case 1093598333:
                case 1789480663:
                    e = e;
                    i7 = i7;
                    c = 0;
                    if (C1071.m56343() != 0) {
                        iM55680 = (C0946.m55979("۬۬") ^ i8) * (-115);
                        i10 = ((iM55680 ^ i9) * 15161) ^ 1637550137;
                        i = 745311370;
                    } else {
                        iM55680 = C0946.m55979("ܰ۟") ^ i8;
                        i10 = ((iM55680 ^ i9) * 15077) ^ 1558095516;
                        i = -147126006;
                    }
                    i11 = iM55680 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                case 1645032110:
                case 1900064017:
                    e = e;
                    i7 = i7;
                    sArr = f82098;
                    if (C1044.f81959 >= 0) {
                        iM55680 = (C0873.m55680("ۡۚ") ^ i9) * (-51);
                        i10 = ((iM55680 ^ i8) * 5725) ^ (-1092151489);
                        i = -1582173875;
                    } else {
                        iM55680 = (C0873.m55680("ܶ֫") ^ i9) * (-15);
                        i10 = ((iM55680 ^ i8) * 9559) ^ 964825192;
                        i = 897319914;
                    }
                    i11 = iM55680 ^ i;
                    e = e;
                    i7 = i7;
                    break;
                default:
                    C1025.m56228(C0845.m55591(e));
                    i7 = i7;
                    iM55680 = C0873.m55680("ܺ᩹") ^ i9;
                    i10 = ((iM55680 ^ i8) * 27919) ^ (-199388228);
                    i = -735859981;
                    i11 = iM55680 ^ i;
                    e = e;
                    i7 = i7;
                    break;
            }
            return;
        }
    }
}
