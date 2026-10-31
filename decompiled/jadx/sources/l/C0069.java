package l;

import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֡֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U995 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0069 implements InterfaceC22871 {

    /* JADX INFO: renamed from: ۙܿ֨, reason: not valid java name and contains not printable characters */
    private static final short[] f983 = {2535, -22086, -22091, -22088, -22102, -22102, -22084, -22102, -22025, -22083, -22084, -22111, -22123, -22086, -22090, -22092, -22026, -22088, -22089, -22083, -22101, -22090, -22096, -22083, -22026, -22083, -22090, -22086, -22100, -22092, -22084, -22089, -22099, -22102, -22100, -22096, -22026, -22103, -22096, -22086, -22094, -22084, -22101, -22026, -22120, -22086, -22099, -22096, -22090, -22089, -22127, -22088, -22089, -22083, -22091, -22084, -22101, -22046, -22043, -22086, -22091, -22096, -22089, -22096, -22099, -22041, -22083, -22088, -22099, -22088, -22107, -22090, -22085, -22085, -22137, -22026, -22120, -22089, -22083, -22101, -22090, -22096, -22083, -22026, -22031, -22042, -22045, -22083, -22088, -22099, -22088, -22107, -22090, -22085, -22085, -22107, -22102, -22088, -22089, -22083, -22085, -22090, -22111, -22032, -22025, -22029, -22025, -22029, -22045, -22088, -22089, -22083, -22101, -22090, -22096, -22083, -22139, -22026, -22031, -22042, -22045, -22083, -22088, -22099, -22088, -22107, -22090, -22085, -22085, -22107, -22102, -22088, -22089, -22083, -22085, -22090, -22111, -22032, -22019, 3314, 27089, 27101, 27103, 27036, 27091, 27100, 27094, 27072, 27101, 27099, 27094, 27036, 27095, 27082, 27078, 27095, 27072, 27100, 27091, 27102, 27073, 27078, 27101, 27072, 27091, 27093, 27095, 27089, 27102, 27091, 27073, 27073, 27095, 27073, 27036, 27094, 27095, 27082, 27134, 27089, 27101, 27103, 27037, 27091, 27100, 27094, 27072, 27101, 27099, 27094, 27037, 27095, 27082, 27078, 27095, 27072, 27100, 27091, 27102, 27073, 27078, 27101, 27072, 27091, 27093, 27095, 27037, 27127, 27082, 27078, 27095, 27072, 27100, 27091, 27102, 27105, 27078, 27101, 27072, 27091, 27093, 27095, 27106, 27072, 27101, 27076, 27099, 27094, 27095, 27072, 27017, 27106, 27123, 27110, 27110, 27127, 27104, 27132, 27117, 27104, 27127, 27105, 27110, 27104, 27131, 27121, 27110, 27127, 27126, 27117, 27123, 27132, 27126, 27104, 27133, 27131, 27126, 27117, 27105, 27111, 27120, 27110, 27104, 27127, 27127, 27105};

    /* JADX WARN: Code duplicated, block: B:56:0x0296 A[PHI: r35
      0x0296: PHI (r35v67 int) = (r35v64 int), (r35v68 int) binds: [B:54:0x027d, B:45:0x0224] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x033c A[PHI: r17 r35
      0x033c: PHI (r17v4 java.util.Iterator) = (r17v3 java.util.Iterator), (r17v2 java.util.Iterator), (r17v2 java.util.Iterator) binds: [B:75:0x033a, B:45:0x0224, B:42:0x0209] A[DONT_GENERATE, DONT_INLINE]
      0x033c: PHI (r35v69 int) = (r35v59 int), (r35v68 int), (r35v70 int) binds: [B:75:0x033a, B:45:0x0224, B:42:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC22871
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1017(String str, C1910 c1910) {
        EnumC0841 enumC0841;
        int i;
        Object obj;
        C7980 c7980;
        EnumC0841 enumC0842;
        Throwable th;
        boolean z;
        int i2;
        int i3;
        int iM2566;
        int i4;
        C7980 c7981;
        int iM6981;
        int i5;
        int i6;
        C7980 c7982;
        int i7;
        C7980 c7983;
        int iM6982;
        int i8;
        int i9;
        int i10;
        int i11;
        C7980 c7984;
        int iM2567;
        int i12;
        int i13;
        int iM6983;
        int i14;
        int iM2568;
        int i15;
        int i16;
        int i17 = C4075.f12947;
        int i18 = C0714.f2697;
        int iM6984 = C2105.m6981("ۚܽ") ^ i17;
        int i19 = ((iM6984 ^ i18) * (-5691)) ^ (-579746413);
        Iterator itM7037 = null;
        C7980 c7985 = null;
        Iterator itM13555 = null;
        C16611 c16611 = null;
        AbstractC1349 abstractC1349 = null;
        EnumC0841 enumC0841M11169 = null;
        EnumC0841 enumC0843 = null;
        String string = null;
        int i20 = iM6984 ^ 1541883416;
        boolean z2 = false;
        int i21 = 0;
        boolean z3 = false;
        int i22 = 0;
        int i23 = 0;
        boolean z4 = false;
        boolean zM5910 = false;
        boolean zM938 = false;
        boolean zM2568 = false;
        boolean zM2569 = false;
        boolean zM4369 = false;
        int i24 = 160193921;
        C18090 c18090 = null;
        boolean zM2123 = false;
        Throwable th2 = null;
        Object obj2 = null;
        Iterator it = null;
        InterfaceC22677 interfaceC22677 = null;
        EnumC0841 enumC0844 = null;
        EnumC0841 enumC0841M5180 = null;
        boolean zM6437 = false;
        boolean zHasNext = false;
        boolean z5 = false;
        while (true) {
            i24 = i20 ^ (i19 & (((i24 ^ i18) * 6135) >> 31));
            switch (i24) {
                case -2132965021:
                case -1318746526:
                    i22 = i22;
                    if (zM2568) {
                        iM2568 = (C2105.m6981("ۤۛ") + i18) * 17;
                        i12 = ((iM2568 ^ i17) * 1903) ^ 1983477110;
                        i15 = -1655801244;
                    } else {
                        iM2568 = (C0630.m2566("ۚۧ") + i17) * (-55);
                        i12 = ((iM2568 ^ i18) * 29987) ^ (-1859710295);
                        i15 = -175748529;
                    }
                    i16 = iM2568 ^ i15;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case -2059850888:
                case -1473833004:
                    enumC0841M11169 = enumC0841M11169;
                    i22 = i22;
                    obj2 = obj2;
                    c7982 = c7985;
                    enumC0844 = enumC0844;
                    th2 = th2;
                    try {
                        C0714.m2815(th2, obj2);
                        int iM6985 = C2105.m6981("ܳܶ") ^ i17;
                        th2 = th2;
                        obj2 = obj2;
                        enumC0844 = enumC0844;
                        i22 = i22;
                        i20 = iM6985 ^ 2028889050;
                        c7985 = c7982;
                        i19 = ((iM6985 ^ i18) * 26833) ^ (-1107600479);
                        enumC0841M11169 = enumC0841M11169;
                    } catch (Throwable unused) {
                        c7981 = c7982;
                        z5 = z5;
                        i21 = i21;
                        iM6981 = C2105.m6981("ۛۢ") ^ i18;
                        i5 = ((iM6981 ^ i17) * (-1747)) ^ 1621946781;
                        i6 = -1206002065;
                        int i25 = iM6981 ^ i6;
                        z3 = z3;
                        enumC0841M11169 = enumC0841M11169;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = i25;
                        i19 = i5;
                        i21 = i21;
                        z5 = z5;
                        C7980 c7986 = c7981;
                        th2 = th2;
                        enumC0844 = enumC0844;
                        c7985 = c7986;
                    }
                    break;
                case -2058292398:
                case 1931776735:
                    i22 = i22;
                    try {
                        C16611 c16612 = (C16611) RunnableC1108.m3791(itM13555);
                        try {
                            try {
                                enumC0841M11169 = enumC0841M11169;
                                try {
                                    zM6437 = ViewOnClickListenerC1958.m6437(C1773.m5918(c16612), C1294.m4373(f983, 58, 8, i23));
                                    int iM6986 = C2105.m6981("֨۠") ^ i17;
                                    i10 = ((iM6986 ^ i18) * 17665) ^ (-374875130);
                                    i11 = iM6986 ^ 1533104725;
                                    c16611 = c16612;
                                    i22 = i22;
                                    i20 = i11;
                                    i19 = i10;
                                    enumC0841M11169 = enumC0841M11169;
                                } catch (Throwable th3) {
                                    th = th3;
                                    th2 = th;
                                    c16611 = c16612;
                                    enumC0841M11169 = enumC0841M11169;
                                    i21 = i21;
                                    z3 = z3;
                                    enumC0844 = enumC0844;
                                    int iM2569 = (C0630.m2566("᩹ۙ") + i18) * 5;
                                    enumC0844 = enumC0844;
                                    c7985 = c7985;
                                    i19 = ((iM2569 ^ i17) * (-14943)) ^ 1625096750;
                                    z3 = z3;
                                    obj2 = obj2;
                                    i22 = i22;
                                    i20 = iM2569 ^ (-696873423);
                                    i21 = i21;
                                    z5 = z5;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                enumC0841M11169 = enumC0841M11169;
                            }
                        } catch (Throwable th5) {
                            th2 = th5;
                            c16611 = c16612;
                            i21 = i21;
                            z3 = z3;
                            enumC0844 = enumC0844;
                            int iM25610 = (C0630.m2566("᩹ۙ") + i18) * 5;
                            enumC0844 = enumC0844;
                            c7985 = c7985;
                            i19 = ((iM25610 ^ i17) * (-14943)) ^ 1625096750;
                            z3 = z3;
                            obj2 = obj2;
                            i22 = i22;
                            i20 = iM25610 ^ (-696873423);
                            i21 = i21;
                            z5 = z5;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        th2 = th;
                        i21 = i21;
                        z3 = z3;
                        enumC0844 = enumC0844;
                        int iM25611 = (C0630.m2566("᩹ۙ") + i18) * 5;
                        enumC0844 = enumC0844;
                        c7985 = c7985;
                        i19 = ((iM25611 ^ i17) * (-14943)) ^ 1625096750;
                        z3 = z3;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = iM25611 ^ (-696873423);
                        i21 = i21;
                        z5 = z5;
                        break;
                    }
                    break;
                case -2000923669:
                case 384303688:
                    if (i22 < i21) {
                        iM2566 = C0630.m2566("ܽۘ") ^ i17;
                        i2 = ((iM2566 ^ i18) * (-32363)) ^ 2103415322;
                        i4 = -1133614257;
                    } else {
                        iM2566 = (C0630.m2566("ܳ۠") + i18) * (-7);
                        i2 = ((iM2566 ^ i17) * 23253) ^ (-1168922932);
                        i4 = 242834314;
                    }
                    i20 = iM2566 ^ i4;
                    i19 = i2;
                    break;
                case -1998293601:
                case -491948631:
                    enumC0841M11169 = enumC0841M11169;
                    i22 = i22;
                    try {
                        zM2123 = C0483.m2123(itM13555);
                        iM6983 = (C2105.m6981("ᩴۢ") + i17) * 23;
                        i10 = ((iM6983 ^ i18) * (-27703)) ^ 16776560;
                        i14 = 334610861;
                        i11 = iM6983 ^ i14;
                        i22 = i22;
                        i20 = i11;
                        i19 = i10;
                        enumC0841M11169 = enumC0841M11169;
                    } catch (Throwable th7) {
                        th2 = th7;
                        enumC0841M11169 = enumC0841M11169;
                        i21 = i21;
                        z3 = z3;
                        enumC0844 = enumC0844;
                        int iM25612 = (C0630.m2566("᩹ۙ") + i18) * 5;
                        enumC0844 = enumC0844;
                        c7985 = c7985;
                        i19 = ((iM25612 ^ i17) * (-14943)) ^ 1625096750;
                        z3 = z3;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = iM25612 ^ (-696873423);
                        i21 = i21;
                        z5 = z5;
                    }
                    break;
                case -1995140298:
                case 364291408:
                    z4 = false;
                    iM2566 = (C0630.m2566("᩵᩷") + i18) * 99;
                    i2 = ((iM2566 ^ i17) * (-21315)) ^ (-1430556590);
                    i4 = 1512309265;
                    i20 = iM2566 ^ i4;
                    i19 = i2;
                    break;
                case -1991577443:
                case -1149237551:
                    enumC0841M11169 = enumC0841M11169;
                    i22 = i22;
                    c7983 = c7985;
                    enumC0844 = enumC0844;
                    if (zM5910) {
                        iM6982 = (C2105.m6981("֡ۗ") + i17) * 51;
                        i8 = ((iM6982 ^ i18) * (-23659)) ^ 216540993;
                        i9 = -1160200768;
                    } else {
                        iM6982 = (i18 - C2105.m6981("ۤ᩺")) * (-113);
                        i8 = ((iM6982 ^ i17) * (-14153)) ^ 1051095849;
                        i9 = -833373412;
                    }
                    int i26 = iM6982 ^ i9;
                    i22 = i22;
                    i20 = i26;
                    i19 = i8;
                    enumC0844 = enumC0844;
                    c7985 = c7983;
                    enumC0841M11169 = enumC0841M11169;
                    break;
                case -1881335219:
                case 1332140741:
                    i22 = i22;
                    string = ((InterfaceC15347) C4616.m13560((InterfaceC10952) interfaceC22677)).getString();
                    zM938 = C0050.m938(string, C0382.m1840(f983, 66, 8, i23));
                    iM2568 = (i18 - C2105.m6981("֨ܳ")) * (-43);
                    i12 = ((iM2568 ^ i17) * (-4729)) ^ 1786797489;
                    i15 = 2088750430;
                    i16 = iM2568 ^ i15;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case -1869605910:
                case 813424040:
                    enumC0841M11169 = enumC0841M11169;
                    i22 = i22;
                    c7983 = c7985;
                    try {
                        C7980 c7987 = (C7980) RunnableC1108.m3791(itM7037);
                        try {
                            enumC0844 = enumC0844;
                            try {
                                zM4369 = C1294.m4369(C3663.m11174(c7987), C0237.m1483(f983, 12, 46, i23));
                                int iM25613 = C0630.m2566("᩺ܶ") ^ i17;
                                i10 = ((iM25613 ^ i18) * (-12619)) ^ (-574703206);
                                i11 = iM25613 ^ 631197966;
                                enumC0844 = enumC0844;
                                c7985 = c7987;
                                i22 = i22;
                                i20 = i11;
                                i19 = i10;
                                enumC0841M11169 = enumC0841M11169;
                            } catch (Throwable th8) {
                                th = th8;
                                th2 = th;
                                c7985 = c7987;
                                z5 = z5;
                                obj2 = obj2;
                                enumC0841M11169 = enumC0841M11169;
                                i21 = i21;
                                z3 = z3;
                                int iM25614 = (C0630.m2566("᩹ۙ") + i18) * 5;
                                enumC0844 = enumC0844;
                                c7985 = c7985;
                                i19 = ((iM25614 ^ i17) * (-14943)) ^ 1625096750;
                                z3 = z3;
                                obj2 = obj2;
                                i22 = i22;
                                i20 = iM25614 ^ (-696873423);
                                i21 = i21;
                                z5 = z5;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            enumC0844 = enumC0844;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        enumC0844 = enumC0844;
                        th2 = th;
                        c7985 = c7983;
                        z5 = z5;
                        obj2 = obj2;
                        enumC0841M11169 = enumC0841M11169;
                        i21 = i21;
                        z3 = z3;
                        int iM25615 = (C0630.m2566("᩹ۙ") + i18) * 5;
                        enumC0844 = enumC0844;
                        c7985 = c7985;
                        i19 = ((iM25615 ^ i17) * (-14943)) ^ 1625096750;
                        z3 = z3;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = iM25615 ^ (-696873423);
                        i21 = i21;
                        z5 = z5;
                        break;
                    }
                    break;
                case -1868515489:
                case 790657621:
                    enumC0841 = enumC0841M11169;
                    i = i22;
                    obj = obj2;
                    c7980 = c7985;
                    enumC0842 = enumC0844;
                    th = th2;
                    z = true;
                    int iM6987 = C2105.m6981("᩺ۜ") ^ i17;
                    i2 = ((iM6987 ^ i18) * (-2453)) ^ (-190202533);
                    th2 = th;
                    obj2 = obj;
                    enumC0844 = enumC0842;
                    i22 = i;
                    i20 = iM6987 ^ (-841802893);
                    c7985 = c7980;
                    i21 = i21;
                    enumC0841M11169 = enumC0841;
                    z5 = z;
                    i19 = i2;
                    break;
                case -1828613178:
                case 1652797880:
                    i22 = i22;
                    if (enumC0841M5180 == enumC0843) {
                        iM2568 = (C2105.m6981("ۜ᩷") + i18) * 39;
                        i12 = ((iM2568 ^ i17) * (-4115)) ^ (-1106249576);
                        i15 = 569146821;
                    } else {
                        iM2568 = C0630.m2566("᩹᩷") ^ i18;
                        i12 = ((iM2568 ^ i17) * 17891) ^ (-1439153751);
                        i15 = 654854010;
                    }
                    i16 = iM2568 ^ i15;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case -1827625317:
                case -1670277364:
                    c7981 = c7985;
                    i23 = 43481;
                    iM6981 = C0630.m2566("ܿܺ") ^ i18;
                    i5 = ((iM6981 ^ i17) * 17095) ^ 308540584;
                    i6 = 758219118;
                    int i27 = iM6981 ^ i6;
                    z3 = z3;
                    enumC0841M11169 = enumC0841M11169;
                    obj2 = obj2;
                    i22 = i22;
                    i20 = i27;
                    i19 = i5;
                    i21 = i21;
                    z5 = z5;
                    C7980 c7988 = c7981;
                    th2 = th2;
                    enumC0844 = enumC0844;
                    c7985 = c7988;
                    break;
                case -1810540137:
                case 236662949:
                    c1910.f6433 = z3;
                    c1910.f6434 = z2;
                    iM2566 = (C2105.m6981("ۨܰ") + i18) * 3;
                    i2 = ((iM2566 ^ i17) * (-16621)) ^ 429545305;
                    i4 = 2034328805;
                    i20 = iM2566 ^ i4;
                    i19 = i2;
                    break;
                case -1713192766:
                case -1019052688:
                    i22 = i22;
                    it = ((C17317) c16611.mo3570().mo3817()).iterator();
                    iM2568 = C0630.m2566("᩹᩷") ^ i18;
                    i12 = ((iM2568 ^ i17) * 17891) ^ (-1439153751);
                    i15 = 654854010;
                    i16 = iM2568 ^ i15;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case -1623176625:
                case -909768895:
                    if (zM2569) {
                        iM2566 = C0630.m2566("֫ۛ") ^ i17;
                        i2 = ((iM2566 ^ i18) * (-2561)) ^ (-1333028455);
                        i4 = -2042587155;
                    } else {
                        iM2566 = (C0630.m2566("ܰۗ") + i18) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM2566 ^ i17) * (-16751)) ^ (-140899618);
                        i4 = -361209745;
                    }
                    i20 = iM2566 ^ i4;
                    i19 = i2;
                    break;
                case -1551991640:
                case -1371615406:
                    enumC0841M11169 = enumC0841M11169;
                    i22 = i22;
                    z5 = z5;
                    obj2 = obj2;
                    i21 = i21;
                    z3 = z3;
                    C7980 c7989 = c7985;
                    enumC0844 = enumC0844;
                    th2 = th2;
                    c7981 = c7989;
                    z2 = false;
                    if (mo1018()) {
                        iM6981 = C0630.m2566("ܽۧ") ^ i17;
                        i5 = ((iM6981 ^ i18) * (-4703)) ^ 1217125105;
                        i6 = -602366540;
                    } else {
                        iM6981 = C2105.m6981("᩹ܺ") ^ i18;
                        i5 = ((iM6981 ^ i17) * 21481) ^ 518597723;
                        i6 = -2012397317;
                    }
                    int i28 = iM6981 ^ i6;
                    z3 = z3;
                    enumC0841M11169 = enumC0841M11169;
                    obj2 = obj2;
                    i22 = i22;
                    i20 = i28;
                    i19 = i5;
                    i21 = i21;
                    z5 = z5;
                    C7980 c79810 = c7981;
                    th2 = th2;
                    enumC0844 = enumC0844;
                    c7985 = c79810;
                    break;
                case -1532631301:
                case 1688898340:
                    i22 = i22;
                    if (zM938) {
                        iM2568 = (C0630.m2566("ۘᩴ") + i17) * 47;
                        i12 = ((iM2568 ^ i18) * (-507)) ^ 135777906;
                        i15 = 2064011360;
                    } else {
                        iM2568 = C0630.m2566("᩹᩷") ^ i18;
                        i12 = ((iM2568 ^ i17) * 17891) ^ (-1439153751);
                        i15 = 654854010;
                    }
                    i16 = iM2568 ^ i15;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case -1479227570:
                case -751110731:
                    i22 = i22;
                    if (zM6437) {
                        iM2568 = (i17 - C0630.m2566("۟ۜ")) * 29;
                        i12 = ((iM2568 ^ i18) * (-10371)) ^ 1867373848;
                        i15 = -337977939;
                        i16 = iM2568 ^ i15;
                        i7 = i22;
                        i20 = i16;
                        i19 = i12;
                        i22 = i7;
                    }
                    enumC0841M11169 = enumC0841M11169;
                    c7984 = c7985;
                    iM2567 = (C0630.m2566("᩷ۡ") + i18) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i12 = ((iM2567 ^ i17) * 11421) ^ (-2036746935);
                    i13 = -385057350;
                    i16 = iM2567 ^ i13;
                    c7985 = c7984;
                    enumC0841M11169 = enumC0841M11169;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case -1455156615:
                case -1353890079:
                    i22 = i22;
                    AbstractC1349 abstractC13410 = (AbstractC1349) it;
                    try {
                        zHasNext = abstractC13410.hasNext();
                        int iM25616 = (C0630.m2566("۫ۖ") + i17) * (-57);
                        i2 = ((iM25616 ^ i18) * 3653) ^ 192338257;
                        i3 = iM25616 ^ (-535138458);
                        abstractC1349 = abstractC13410;
                        i22 = i22;
                        i20 = i3;
                        i19 = i2;
                    } catch (Throwable th11) {
                        th2 = th11;
                        abstractC1349 = abstractC13410;
                        i21 = i21;
                        z3 = z3;
                        enumC0844 = enumC0844;
                        int iM25617 = (C0630.m2566("᩹ۙ") + i18) * 5;
                        enumC0844 = enumC0844;
                        c7985 = c7985;
                        i19 = ((iM25617 ^ i17) * (-14943)) ^ 1625096750;
                        z3 = z3;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = iM25617 ^ (-696873423);
                        i21 = i21;
                        z5 = z5;
                    }
                    break;
                case -1391945644:
                case 1978168769:
                    enumC0841M11169 = enumC0841M11169;
                    i22 = i22;
                    z5 = z5;
                    obj2 = obj2;
                    C7980 c79811 = c7985;
                    i21 = i21;
                    enumC0844 = enumC0844;
                    th2 = th2;
                    try {
                        c7981 = c79811;
                        try {
                            C18090 c18091 = new C18090(str);
                            try {
                                z3 = z3;
                                try {
                                    itM7037 = C2126.m7037((AbstractC18605) C0382.m1836(C0237.m1494(C3245.m9929(c18091, c18091.m42211(RunnableC1108.m3789(f983, 1, 11, i23)), null))));
                                    c18090 = c18091;
                                    iM6981 = (C0630.m2566("᩷ܽ") ^ i17) * 57;
                                    i5 = ((iM6981 ^ i18) * (-20073)) ^ 2093752374;
                                    i6 = -192570177;
                                    int i29 = iM6981 ^ i6;
                                    z3 = z3;
                                    enumC0841M11169 = enumC0841M11169;
                                    obj2 = obj2;
                                    i22 = i22;
                                    i20 = i29;
                                    i19 = i5;
                                    i21 = i21;
                                    z5 = z5;
                                    C7980 c79812 = c7981;
                                    th2 = th2;
                                    enumC0844 = enumC0844;
                                    c7985 = c79812;
                                } catch (Throwable th12) {
                                    th = th12;
                                    c18090 = c18091;
                                    enumC0841M11169 = enumC0841M11169;
                                    th2 = th;
                                    c7985 = c7981;
                                    int iM25618 = (C0630.m2566("᩹ۙ") + i18) * 5;
                                    enumC0844 = enumC0844;
                                    c7985 = c7985;
                                    i19 = ((iM25618 ^ i17) * (-14943)) ^ 1625096750;
                                    z3 = z3;
                                    obj2 = obj2;
                                    i22 = i22;
                                    i20 = iM25618 ^ (-696873423);
                                    i21 = i21;
                                    z5 = z5;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                z3 = z3;
                            }
                        } catch (Throwable unused2) {
                            c18090 = null;
                            iM6981 = C2105.m6981("ۛۢ") ^ i18;
                            i5 = ((iM6981 ^ i17) * (-1747)) ^ 1621946781;
                            i6 = -1206002065;
                        }
                    } catch (Throwable unused3) {
                        c7981 = c79811;
                    }
                    break;
                case -1379435734:
                case -1233111811:
                    enumC0841M11169 = enumC0841M11169;
                    i22 = i22;
                    c7984 = c7985;
                    if (!zM4369) {
                        enumC0844 = enumC0844;
                        z5 = z5;
                        th2 = th2;
                        obj2 = obj2;
                        i21 = i21;
                        c7981 = c7984;
                        z3 = z3;
                        iM6981 = (C0630.m2566("᩷ܽ") ^ i17) * 57;
                        i5 = ((iM6981 ^ i18) * (-20073)) ^ 2093752374;
                        i6 = -192570177;
                        int i210 = iM6981 ^ i6;
                        z3 = z3;
                        enumC0841M11169 = enumC0841M11169;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = i210;
                        i19 = i5;
                        i21 = i21;
                        z5 = z5;
                        C7980 c79813 = c7981;
                        th2 = th2;
                        enumC0844 = enumC0844;
                        c7985 = c79813;
                    } else {
                        iM2567 = C0630.m2566("ܰۘ") ^ i18;
                        i12 = ((iM2567 ^ i17) * (-4381)) ^ 1780362062;
                        i13 = 895640454;
                        i16 = iM2567 ^ i13;
                        c7985 = c7984;
                        enumC0841M11169 = enumC0841M11169;
                        i7 = i22;
                        i20 = i16;
                        i19 = i12;
                        i22 = i7;
                    }
                    break;
                case -1356535119:
                case 1336879282:
                    enumC0841M11169 = enumC0841M11169;
                    i22 = i22;
                    c7983 = c7985;
                    enumC0844 = enumC0844;
                    try {
                        zM5910 = C1773.m5910(itM7037);
                        iM6982 = C2105.m6981("ܽۗ") ^ i18;
                        i8 = ((iM6982 ^ i17) * (-30029)) ^ (-1448158719);
                        i9 = 902822902;
                        int i211 = iM6982 ^ i9;
                        i22 = i22;
                        i20 = i211;
                        i19 = i8;
                        enumC0844 = enumC0844;
                        c7985 = c7983;
                        enumC0841M11169 = enumC0841M11169;
                    } catch (Throwable th14) {
                        th = th14;
                        th2 = th;
                        c7985 = c7983;
                        z5 = z5;
                        obj2 = obj2;
                        enumC0841M11169 = enumC0841M11169;
                        i21 = i21;
                        z3 = z3;
                        int iM25619 = (C0630.m2566("᩹ۙ") + i18) * 5;
                        enumC0844 = enumC0844;
                        c7985 = c7985;
                        i19 = ((iM25619 ^ i17) * (-14943)) ^ 1625096750;
                        z3 = z3;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = iM25619 ^ (-696873423);
                        i21 = i21;
                        z5 = z5;
                    }
                    break;
                case -1154638797:
                case 989362138:
                    enumC0841M11169 = enumC0841M11169;
                    i22 = i22;
                    c7984 = c7985;
                    try {
                        itM13555 = C4616.m13555(c7984.m21300(z3));
                        iM2567 = (C0630.m2566("᩷ۡ") + i18) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i12 = ((iM2567 ^ i17) * 11421) ^ (-2036746935);
                        i13 = -385057350;
                        i16 = iM2567 ^ i13;
                        c7985 = c7984;
                        enumC0841M11169 = enumC0841M11169;
                        i7 = i22;
                        i20 = i16;
                        i19 = i12;
                        i22 = i7;
                    } catch (Throwable th15) {
                        th2 = th15;
                        c7985 = c7984;
                        enumC0844 = enumC0844;
                        z5 = z5;
                        obj2 = obj2;
                        enumC0841M11169 = enumC0841M11169;
                        i21 = i21;
                        z3 = z3;
                        int iM256110 = (C0630.m2566("᩹ۙ") + i18) * 5;
                        enumC0844 = enumC0844;
                        c7985 = c7985;
                        i19 = ((iM256110 ^ i17) * (-14943)) ^ 1625096750;
                        z3 = z3;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = iM256110 ^ (-696873423);
                        i21 = i21;
                        z5 = z5;
                    }
                    break;
                case -1111516756:
                case -461027569:
                    i22 = i22;
                    InterfaceC22677 interfaceC22678 = (InterfaceC22677) abstractC1349.next();
                    try {
                        enumC0841M11169 = C3663.m11169(interfaceC22678);
                        enumC0844 = EnumC0841.f3137;
                        int iM6988 = (C2105.m6981("֫ܽ") ^ i17) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM6988 ^ i18) * 10541) ^ 602490958;
                        i3 = iM6988 ^ (-462535313);
                        interfaceC22677 = interfaceC22678;
                        i22 = i22;
                        i20 = i3;
                        i19 = i2;
                    } catch (Throwable th16) {
                        th2 = th16;
                        interfaceC22677 = interfaceC22678;
                        i21 = i21;
                        z3 = z3;
                        enumC0844 = enumC0844;
                        int iM256111 = (C0630.m2566("᩹ۙ") + i18) * 5;
                        enumC0844 = enumC0844;
                        c7985 = c7985;
                        i19 = ((iM256111 ^ i17) * (-14943)) ^ 1625096750;
                        z3 = z3;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = iM256111 ^ (-696873423);
                        i21 = i21;
                        z5 = z5;
                    }
                    break;
                case -1077532485:
                case 354805599:
                    i22 = i22;
                    enumC0841M5180 = C1504.m5180(interfaceC22677);
                    enumC0843 = EnumC0841.f3220;
                    iM2568 = (C0630.m2566("᩺ܽ") + i17) * (-17);
                    i12 = ((iM2568 ^ i18) * (-30999)) ^ (-1257541930);
                    i15 = -1824561715;
                    i16 = iM2568 ^ i15;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case -1056781448:
                case 438344673:
                    i22 = i22;
                    if (enumC0841M11169 != enumC0844) {
                        iM2568 = (i18 - C0630.m2566("᩵ۖ")) * 3;
                        i12 = ((iM2568 ^ i17) * (-24847)) ^ (-1559398360);
                        i15 = -1077511669;
                    } else {
                        iM2568 = (C2105.m6981("ۜ᩷") + i18) * 39;
                        i12 = ((iM2568 ^ i17) * (-4115)) ^ (-1106249576);
                        i15 = 569146821;
                    }
                    i16 = iM2568 ^ i15;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case -1048150642:
                case -742618013:
                    enumC0841M11169 = enumC0841M11169;
                    i22 = i22;
                    z5 = z5;
                    obj2 = obj2;
                    i21 = i21;
                    z3 = z3;
                    C7980 c79814 = c7985;
                    enumC0844 = enumC0844;
                    th2 = th2;
                    c7981 = c79814;
                    short s = f983[0];
                    if (((s * s) + 364924609) - (s * 38206) >= 0) {
                        iM6981 = C2105.m6981("᩶֨") ^ i18;
                        i5 = ((iM6981 ^ i17) * 21349) ^ (-485518044);
                        i6 = 306033891;
                    } else {
                        iM6981 = C2105.m6981("ܺ᩹") ^ i17;
                        i5 = ((iM6981 ^ i18) * (-12413)) ^ (-161545865);
                        i6 = -1809865401;
                    }
                    int i212 = iM6981 ^ i6;
                    z3 = z3;
                    enumC0841M11169 = enumC0841M11169;
                    obj2 = obj2;
                    i22 = i22;
                    i20 = i212;
                    i19 = i5;
                    i21 = i21;
                    z5 = z5;
                    C7980 c79815 = c7981;
                    th2 = th2;
                    enumC0844 = enumC0844;
                    c7985 = c79815;
                    break;
                case -850778009:
                case 300753440:
                    enumC0841M11169 = enumC0841M11169;
                    i22 = i22;
                    obj2 = obj2;
                    c7982 = c7985;
                    enumC0844 = enumC0844;
                    th2 = th2;
                    try {
                        C5695.m16020(c18090);
                        int iM6989 = C2105.m6981("ܳܶ") ^ i17;
                        th2 = th2;
                        obj2 = obj2;
                        enumC0844 = enumC0844;
                        i22 = i22;
                        i20 = iM6989 ^ 2028889050;
                        c7985 = c7982;
                        i19 = ((iM6989 ^ i18) * 26833) ^ (-1107600479);
                        enumC0841M11169 = enumC0841M11169;
                    } catch (Throwable th17) {
                        int iM69810 = C2105.m6981("ۖ᩹") ^ i18;
                        obj2 = th17;
                        th2 = th2;
                        i19 = ((iM69810 ^ i17) * (-14969)) ^ 1225384998;
                        enumC0844 = enumC0844;
                        c7985 = c7982;
                        enumC0841M11169 = enumC0841M11169;
                        i7 = i22;
                        i20 = iM69810 ^ 644408234;
                        i22 = i7;
                    }
                    break;
                case -743537974:
                case 1783391686:
                    try {
                        C5695.m16020(c18090);
                        iM2566 = (C2105.m6981("ܰܿ") ^ i17) * 51;
                        i2 = ((iM2566 ^ i18) * (-20325)) ^ 565655922;
                        i4 = -1003200330;
                        i20 = iM2566 ^ i4;
                        i19 = i2;
                    } catch (Throwable unused4) {
                        enumC0841M11169 = enumC0841M11169;
                        i22 = i22;
                        z5 = z5;
                        obj2 = obj2;
                        i21 = i21;
                        C7980 c79816 = c7985;
                        enumC0844 = enumC0844;
                        th2 = th2;
                        c7981 = c79816;
                        iM6981 = C2105.m6981("ۛۢ") ^ i18;
                        i5 = ((iM6981 ^ i17) * (-1747)) ^ 1621946781;
                        i6 = -1206002065;
                        int i213 = iM6981 ^ i6;
                        z3 = z3;
                        enumC0841M11169 = enumC0841M11169;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = i213;
                        i19 = i5;
                        i21 = i21;
                        z5 = z5;
                        C7980 c79817 = c7981;
                        th2 = th2;
                        enumC0844 = enumC0844;
                        c7985 = c79817;
                    }
                    break;
                case -517158411:
                case 1524271835:
                    enumC0841M11169 = enumC0841M11169;
                    i22 = i22;
                    C7980 c79818 = c7985;
                    enumC0844 = enumC0844;
                    try {
                        C5695.m16020(c18090);
                        break;
                    } catch (Throwable unused5) {
                    }
                    z5 = z5;
                    th2 = th2;
                    obj2 = obj2;
                    i21 = i21;
                    c7981 = c79818;
                    iM6981 = C2105.m6981("ۛۢ") ^ i18;
                    i5 = ((iM6981 ^ i17) * (-1747)) ^ 1621946781;
                    i6 = -1206002065;
                    int i214 = iM6981 ^ i6;
                    z3 = z3;
                    enumC0841M11169 = enumC0841M11169;
                    obj2 = obj2;
                    i22 = i22;
                    i20 = i214;
                    i19 = i5;
                    i21 = i21;
                    z5 = z5;
                    C7980 c79819 = c7981;
                    th2 = th2;
                    enumC0844 = enumC0844;
                    c7985 = c79819;
                    break;
                case -301914704:
                case -204964878:
                    c1910.f6433 = z2;
                    c1910.f6434 = z2;
                    iM2566 = (C2105.m6981("ۨܰ") + i18) * 3;
                    i2 = ((iM2566 ^ i17) * (-16621)) ^ 429545305;
                    i4 = 2034328805;
                    i20 = iM2566 ^ i4;
                    i19 = i2;
                    break;
                case -261597255:
                case 474238688:
                    c7981 = c7985;
                    i23 = 31968;
                    iM6981 = C0630.m2566("ܿܺ") ^ i18;
                    i5 = ((iM6981 ^ i17) * 17095) ^ 308540584;
                    i6 = 758219118;
                    int i215 = iM6981 ^ i6;
                    z3 = z3;
                    enumC0841M11169 = enumC0841M11169;
                    obj2 = obj2;
                    i22 = i22;
                    i20 = i215;
                    i19 = i5;
                    i21 = i21;
                    z5 = z5;
                    C7980 c798110 = c7981;
                    th2 = th2;
                    enumC0844 = enumC0844;
                    c7985 = c798110;
                    break;
                case -256535455:
                case 988789574:
                    enumC0841M11169 = enumC0841M11169;
                    i22 = i22;
                    obj2 = obj2;
                    c7982 = c7985;
                    enumC0844 = enumC0844;
                    th2 = th2;
                    throw th2;
                case -159346903:
                case 1591182739:
                    c1910.f6433 = z3;
                    i22 = Build.VERSION.SDK_INT;
                    iM2566 = C2105.m6981("ۨ۟") ^ i17;
                    i2 = ((iM2566 ^ i18) * 11181) ^ 40797033;
                    i4 = 15179460;
                    i20 = iM2566 ^ i4;
                    i19 = i2;
                    break;
                case 91955931:
                case 1103513410:
                    try {
                        i22 = i22;
                        try {
                            zM2569 = C0630.m2568(string, C1294.m4373(f983, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 33, i23));
                            iM2568 = (C2105.m6981("ۤܿ") ^ i17) * 115;
                            i12 = ((iM2568 ^ i18) * (-743)) ^ (-1164107350);
                            i15 = -1996808424;
                            i16 = iM2568 ^ i15;
                            i7 = i22;
                            i20 = i16;
                            i19 = i12;
                            i22 = i7;
                        } catch (Throwable th18) {
                            th = th18;
                            th2 = th;
                            i21 = i21;
                            z3 = z3;
                            enumC0844 = enumC0844;
                            int iM256112 = (C0630.m2566("᩹ۙ") + i18) * 5;
                            enumC0844 = enumC0844;
                            c7985 = c7985;
                            i19 = ((iM256112 ^ i17) * (-14943)) ^ 1625096750;
                            z3 = z3;
                            obj2 = obj2;
                            i22 = i22;
                            i20 = iM256112 ^ (-696873423);
                            i21 = i21;
                            z5 = z5;
                        }
                    } catch (Throwable th19) {
                        th = th19;
                        i22 = i22;
                    }
                    break;
                case 104947975:
                case 387854744:
                    c1910.f6435 = z2;
                    c1910.f6434 = z2;
                    c1910.f6433 = z2;
                    return;
                case 317700447:
                case 1166749961:
                    c1910.f6434 = z5;
                    return;
                case 468989642:
                case 1134407251:
                    i22 = i22;
                    if (zHasNext) {
                        iM2568 = (C2105.m6981("ۡܿ") ^ i18) * 115;
                        i12 = ((iM2568 ^ i17) * (-6477)) ^ (-147763920);
                        i15 = 156457334;
                        i16 = iM2568 ^ i15;
                        i7 = i22;
                        i20 = i16;
                        i19 = i12;
                        i22 = i7;
                    }
                    enumC0841M11169 = enumC0841M11169;
                    c7984 = c7985;
                    iM2567 = (C0630.m2566("᩷ۡ") + i18) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i12 = ((iM2567 ^ i17) * 11421) ^ (-2036746935);
                    i13 = -385057350;
                    i16 = iM2567 ^ i13;
                    c7985 = c7984;
                    enumC0841M11169 = enumC0841M11169;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case 688574706:
                case 911351573:
                    enumC0841 = enumC0841M11169;
                    i = i22;
                    z5 = z5;
                    obj = obj2;
                    c7980 = c7985;
                    enumC0842 = enumC0844;
                    th = th2;
                    c1910.f6433 = z3;
                    if (Build.VERSION.SDK_INT >= i21) {
                        z = z2;
                        int iM69811 = C2105.m6981("᩺ۜ") ^ i17;
                        i2 = ((iM69811 ^ i18) * (-2453)) ^ (-190202533);
                        th2 = th;
                        obj2 = obj;
                        enumC0844 = enumC0842;
                        i22 = i;
                        i20 = iM69811 ^ (-841802893);
                        c7985 = c7980;
                        i21 = i21;
                        enumC0841M11169 = enumC0841;
                        z5 = z;
                        i19 = i2;
                    } else {
                        int iM25620 = (i17 - C0630.m2566("ۤܰ")) * (-97);
                        th2 = th;
                        obj2 = obj;
                        enumC0844 = enumC0842;
                        i22 = i;
                        i20 = iM25620 ^ (-982429397);
                        i19 = ((iM25620 ^ i18) * 16181) ^ 663279031;
                        c7985 = c7980;
                        i21 = i21;
                        enumC0841M11169 = enumC0841;
                        z5 = z5;
                    }
                    break;
                case 818749899:
                case 1944208684:
                    i22 = i22;
                    zM2568 = C0630.m2568(string, C3746.m11357(f983, 74, 32, i23));
                    iM2568 = (i18 - C0630.m2566("ۧ֡")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i12 = ((iM2568 ^ i17) * (-32603)) ^ (-854398442);
                    i15 = 1642860977;
                    i16 = iM2568 ^ i15;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case 875929004:
                case 1643242080:
                    z4 = true;
                    iM2566 = (C0630.m2566("᩵᩷") + i18) * 99;
                    i2 = ((iM2566 ^ i17) * (-21315)) ^ (-1430556590);
                    i4 = 1512309265;
                    i20 = iM2566 ^ i4;
                    i19 = i2;
                    break;
                case 890788911:
                case 1408926668:
                    try {
                        c1910.f6434 = z4;
                        iM2566 = (C2105.m6981("ۨܰ") + i18) * 3;
                        i2 = ((iM2566 ^ i17) * (-16621)) ^ 429545305;
                        i4 = 2034328805;
                        i20 = iM2566 ^ i4;
                        i19 = i2;
                    } catch (Throwable th20) {
                        th2 = th20;
                        i22 = i22;
                        i21 = i21;
                        z3 = z3;
                        enumC0844 = enumC0844;
                        int iM256113 = (C0630.m2566("᩹ۙ") + i18) * 5;
                        enumC0844 = enumC0844;
                        c7985 = c7985;
                        i19 = ((iM256113 ^ i17) * (-14943)) ^ 1625096750;
                        z3 = z3;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = iM256113 ^ (-696873423);
                        i21 = i21;
                        z5 = z5;
                    }
                    break;
                case 1098878424:
                case 1401496679:
                    enumC0841M11169 = enumC0841M11169;
                    i22 = i22;
                    if (!zM2123) {
                        c7983 = c7985;
                        enumC0844 = enumC0844;
                        iM6982 = (i18 - C2105.m6981("ۤ᩺")) * (-113);
                        i8 = ((iM6982 ^ i17) * (-14153)) ^ 1051095849;
                        i9 = -833373412;
                        int i216 = iM6982 ^ i9;
                        i22 = i22;
                        i20 = i216;
                        i19 = i8;
                        enumC0844 = enumC0844;
                        c7985 = c7983;
                        enumC0841M11169 = enumC0841M11169;
                    } else {
                        iM6983 = C0630.m2566("۠ۧ") ^ i18;
                        i10 = ((iM6983 ^ i17) * (-6943)) ^ (-422836209);
                        i14 = -43297595;
                        i11 = iM6983 ^ i14;
                        i22 = i22;
                        i20 = i11;
                        i19 = i10;
                        enumC0841M11169 = enumC0841M11169;
                    }
                    break;
                case 1413704486:
                case 1498585400:
                    C7980 c79820 = c7985;
                    enumC0844 = enumC0844;
                    th2 = th2;
                    c7981 = c79820;
                    i21 = 33;
                    z3 = true;
                    int iM69812 = C2105.m6981("֫ۜ") ^ i17;
                    obj2 = obj2;
                    z5 = z5;
                    i22 = i22;
                    i20 = iM69812 ^ 626212637;
                    i19 = ((iM69812 ^ i18) * (-30297)) ^ (-1956276135);
                    enumC0841M11169 = enumC0841M11169;
                    C7980 c798111 = c7981;
                    th2 = th2;
                    enumC0844 = enumC0844;
                    c7985 = c798111;
                    break;
                default:
                    return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:156:0x05fb A[PHI: r17 r18 r24 r26 r27
      0x05fb: PHI (r17v4 int) = (r17v2 int), (r17v2 int), (r17v3 int), (r17v2 int) binds: [B:155:0x05f9, B:151:0x05da, B:123:0x047f, B:27:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x05fb: PHI (r18v4 int) = (r18v2 int), (r18v2 int), (r18v3 int), (r18v2 int) binds: [B:155:0x05f9, B:151:0x05da, B:123:0x047f, B:27:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x05fb: PHI (r24v49 boolean) = (r24v8 boolean), (r24v9 boolean), (r24v18 boolean), (r24v52 boolean) binds: [B:155:0x05f9, B:151:0x05da, B:123:0x047f, B:27:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x05fb: PHI (r26v3 short[]) = (r26v2 short[]), (r26v1 short[]), (r26v1 short[]), (r26v1 short[]) binds: [B:155:0x05f9, B:151:0x05da, B:123:0x047f, B:27:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x05fb: PHI (r27v40 boolean) = (r27v2 boolean), (r27v3 boolean), (r27v11 boolean), (r27v43 boolean) binds: [B:155:0x05f9, B:151:0x05da, B:123:0x047f, B:27:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fd, code lost:
    
        if (l.RunnableC1108.f4040 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0105, code lost:
    
        if (l.C4117.f13076 <= 0) goto L22;
     */
    @Override // l.InterfaceC22871
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1018() throws Throwable {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        boolean z;
        int i5 = C0483.f2088;
        int i6 = C0050.f910;
        int iM2567 = (i6 - C0630.m2566("֡֫")) * 79;
        int i7 = ((iM2567 ^ i5) * 20087) ^ (-493419361);
        Iterator itM12568 = null;
        C7980 c7980 = null;
        Iterator itM20833 = null;
        short[] sArr = null;
        int i8 = iM2567 ^ (-1936833412);
        int i9 = 0;
        boolean zM2123 = false;
        boolean zM6437 = false;
        boolean zM5910 = false;
        boolean zM4369 = false;
        boolean z2 = false;
        char c = 0;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1827351764;
        C18090 c18090 = null;
        Object obj = null;
        Throwable th = null;
        boolean z3 = false;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i5) * (-27037)) >> 31));
            switch (i14) {
                case -2028482174:
                case -993643347:
                    zM4369 = zM4369;
                    z2 = z2;
                    if (zM6437) {
                        iM2566 = (C0630.m2566("ܰۨ") ^ i5) * 43;
                        i3 = ((iM2566 ^ i6) * 18943) ^ (-1808265103);
                        i4 = -1253397547;
                    } else {
                        iM2566 = (C0630.m2566("᩺ᩳ") ^ i5) * 47;
                        i3 = ((iM2566 ^ i6) * (-23371)) ^ (-1103961789);
                        i4 = 1701073952;
                    }
                    int i15 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i15;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case -1972976939:
                case -253986236:
                    C1916.m6308();
                    return false;
                case -1943391683:
                case -1842687262:
                    try {
                        C5695.m16020(c18090);
                        iM6981 = (i5 - C0630.m2566("۠ܳ")) * (-45);
                        i = ((iM6981 ^ i6) * (-2019)) ^ 164221179;
                        i2 = -550852301;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } catch (Throwable unused) {
                        zM4369 = zM4369;
                        z2 = z2;
                        iM2566 = (C0630.m2566("᩺ܿ") + i6) * (-109);
                        i3 = ((iM2566 ^ i5) * (-27949)) ^ (-1581859138);
                        i4 = 1601539076;
                        int i16 = iM2566 ^ i4;
                        z2 = z2;
                        z = zM4369;
                        i8 = i16;
                        i7 = i3;
                        zM4369 = z;
                    }
                    break;
                case -1935053003:
                case 662825489:
                    RunnableC1937.m6387();
                    if (C1916.f6442) {
                        iM6981 = (C2105.m6981("᩸ۗ") + i5) * 11;
                        i = ((iM6981 ^ i6) * (-25823)) ^ 88553060;
                        i2 = -27336314;
                    } else {
                        iM6981 = (C2105.m6981("᩶ᩳ") + i5) * (-67);
                        i = ((iM6981 ^ i6) * 5989) ^ (-175778668);
                        i2 = -1018872452;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -1930302300:
                case -1095521010:
                    i9 = 37320;
                    iM2566 = C0630.m2566("֫ۙ") ^ i6;
                    i3 = ((iM2566 ^ i5) * 12709) ^ 243756239;
                    i4 = 87555578;
                    int i17 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i17;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case -1926794412:
                case -1820265082:
                    zM4369 = zM4369;
                    z2 = z2;
                    zM2123 = C0483.m2123(itM12568);
                    iM2566 = C0630.m2566("ܳ۠") ^ i6;
                    i3 = ((iM2566 ^ i5) * (-30941)) ^ 2035136056;
                    i4 = 716439534;
                    int i18 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i18;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case -1895143232:
                case -282309450:
                    zM4369 = zM4369;
                    z2 = z2;
                    C7980 c7981 = (C7980) RunnableC1108.m3791(itM12568);
                    try {
                        zM6437 = ViewOnClickListenerC1958.m6437(C3663.m11174(c7981), C3537.m10748(f983, 178, 53, i9));
                        int iM6982 = C2105.m6981("ܳᩴ") ^ i6;
                        z2 = z2;
                        z = zM4369;
                        i8 = iM6982 ^ 946065479;
                        i7 = ((iM6982 ^ i5) * 22975) ^ 375626232;
                        c7980 = c7981;
                    } catch (Throwable th2) {
                        th = th2;
                        c7980 = c7981;
                        iM2566 = C0630.m2566("ܺ᩶") ^ i5;
                        i3 = ((iM2566 ^ i6) * (-16149)) ^ 2090434642;
                        i4 = 1824242974;
                        int i19 = iM2566 ^ i4;
                        z2 = z2;
                        z = zM4369;
                        i8 = i19;
                        i7 = i3;
                    }
                    zM4369 = z;
                    break;
                case -1800541081:
                case 533172307:
                    zM4369 = zM4369;
                    z2 = z2;
                    s = sArr[c];
                    if (C2167.m7155()) {
                        iM2566 = (i5 - C0630.m2566("᩺ۚ")) * (-39);
                        i3 = ((iM2566 ^ i6) * (-19727)) ^ 202229892;
                        i4 = 630853882;
                    } else {
                        iM2566 = (C0630.m2566("ᩴۧ") ^ i6) * 45;
                        i3 = ((iM2566 ^ i5) * 11063) ^ 742619117;
                        i4 = 1190352695;
                    }
                    int i110 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i110;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case -1793439380:
                case 1910519849:
                    if (!C21923.m49329()) {
                        iM6981 = (C2105.m6981("᩶ᩳ") + i5) * (-67);
                        i = ((iM6981 ^ i6) * 5989) ^ (-175778668);
                        i2 = -1018872452;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        zM4369 = zM4369;
                        z2 = z2;
                        iM2566 = (C0630.m2566("֡᩵") + i6) * (-49);
                        i3 = ((iM2566 ^ i5) * (-26739)) ^ (-403637541);
                        i4 = 1424136117;
                        int i111 = iM2566 ^ i4;
                        z2 = z2;
                        z = zM4369;
                        i8 = i111;
                        i7 = i3;
                        zM4369 = z;
                    }
                    break;
                case -1663065601:
                case -703200088:
                    zM4369 = zM4369;
                    z2 = z2;
                    if (zM2123) {
                        iM2566 = (C2105.m6981("ۙۡ") + i5) * 75;
                        i3 = ((iM2566 ^ i6) * (-22587)) ^ (-301947412);
                        i4 = -795865255;
                    } else {
                        iM2566 = (C0630.m2566("ᩴۜ") ^ i6) * 73;
                        i3 = ((iM2566 ^ i5) * 24559) ^ (-720672519);
                        i4 = 1269127704;
                    }
                    int i112 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i112;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case -1589755017:
                case -1143757174:
                    zM4369 = zM4369;
                    z2 = z2;
                    try {
                        C18090 c18091 = new C18090(C4925.m14304(C22628.m50602(f983, 140, 27, i9)).applicationInfo.sourceDir);
                        try {
                            itM12568 = C4159.m12568((AbstractC18605) C0382.m1836(C0237.m1494(C3245.m9929(c18091, c18091.m42211(C11340.m28025(f983, 167, 11, i9)), null))));
                            c18090 = c18091;
                            iM2566 = (C0630.m2566("᩺ᩳ") ^ i5) * 47;
                            i3 = ((iM2566 ^ i6) * (-23371)) ^ (-1103961789);
                            i4 = 1701073952;
                        } catch (Throwable th3) {
                            th = th3;
                            c18090 = c18091;
                            iM2566 = C0630.m2566("ܺ᩶") ^ i5;
                            i3 = ((iM2566 ^ i6) * (-16149)) ^ 2090434642;
                            i4 = 1824242974;
                        }
                    } catch (Throwable unused2) {
                        c18090 = null;
                        iM2566 = (C0630.m2566("᩺ܿ") + i6) * (-109);
                        i3 = ((iM2566 ^ i5) * (-27949)) ^ (-1581859138);
                        i4 = 1601539076;
                    }
                    int i113 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i113;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case -1569897129:
                case 751609310:
                    zM4369 = zM4369;
                    z2 = z2;
                    if (zM5910) {
                        iM2566 = C0630.m2566("ᩳ֡") ^ i5;
                        i3 = ((iM2566 ^ i6) * 10401) ^ (-2007263051);
                        i4 = -650643894;
                    } else {
                        iM2566 = C0630.m2566("᩻ܳ") ^ i6;
                        i3 = ((iM2566 ^ i5) * (-17665)) ^ (-1598608431);
                        i4 = -1334070315;
                    }
                    int i114 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i114;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case -1559140809:
                case -140295020:
                    zM4369 = zM4369;
                    z2 = z2;
                    int i20 = i12 + i13;
                    if ((i20 + i20) - i11 >= 0) {
                        iM2566 = (C2105.m6981("ۚۙ") + i6) * (-45);
                        i3 = ((iM2566 ^ i5) * 12041) ^ (-34530499);
                        i4 = -1321182777;
                    } else {
                        iM2566 = C2105.m6981("ᩴܺ") ^ i5;
                        i3 = ((iM2566 ^ i6) * 3975) ^ (-1095980856);
                        i4 = 1406239201;
                    }
                    int i115 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i115;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case -1554505200:
                case -1121524321:
                    zM4369 = zM4369;
                    z2 = z2;
                    throw th;
                case -1538741183:
                case 898538559:
                    z2 = false;
                    iM6981 = C0630.m2566("ۜܽ") ^ i6;
                    i = ((iM6981 ^ i5) * 9733) ^ (-1256650350);
                    i2 = 1888482455;
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
                case -1506469889:
                case 1537727676:
                    C2167.m7155();
                    if (C3683.f11629 < 0) {
                        zM4369 = zM4369;
                        z2 = z2;
                        iM2566 = C2105.m6981("ۙۙ") ^ i6;
                        i3 = ((iM2566 ^ i5) * (-6159)) ^ (-2101400706);
                        i4 = -8546823;
                        int i116 = iM2566 ^ i4;
                        z2 = z2;
                        z = zM4369;
                        i8 = i116;
                        i7 = i3;
                        zM4369 = z;
                    }
                    zM4369 = zM4369;
                    z2 = z2;
                    iM2566 = C2105.m6981("֫ۡ") ^ i6;
                    i3 = ((iM2566 ^ i5) * (-14809)) ^ (-546188148);
                    i4 = 136176226;
                    int i117 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i117;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case -1364756066:
                case -1179351843:
                    zM4369 = zM4369;
                    z2 = z2;
                    if (C3432.m10477() <= 0) {
                        iM2566 = C2105.m6981("֫ۡ") ^ i6;
                        i3 = ((iM2566 ^ i5) * (-14809)) ^ (-546188148);
                        i4 = 136176226;
                    } else {
                        iM2566 = C0630.m2566("ۢܺ") ^ i6;
                        i3 = ((iM2566 ^ i5) * 11409) ^ 1905644293;
                        i4 = -2007491581;
                    }
                    int i118 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i118;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case -1326117409:
                case -1155542228:
                    zM4369 = zM4369;
                    z2 = z2;
                    C0714.m2815(th, obj);
                    iM2566 = (C2105.m6981("۫ܿ") + i6) * (-29);
                    i3 = ((iM2566 ^ i5) * 29087) ^ (-74437075);
                    i4 = -602639230;
                    int i119 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i119;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case -1281879711:
                case 1062615951:
                    zM4369 = zM4369;
                    z2 = z2;
                    try {
                        C5695.m16020(c18090);
                        iM2566 = (C2105.m6981("۫ܿ") + i6) * (-29);
                        i3 = ((iM2566 ^ i5) * 29087) ^ (-74437075);
                        i4 = -602639230;
                        int i1110 = iM2566 ^ i4;
                        z2 = z2;
                        z = zM4369;
                        i8 = i1110;
                        i7 = i3;
                        zM4369 = z;
                    } catch (Throwable th4) {
                        int iM6983 = C2105.m6981("ۨܳ") ^ i5;
                        int i21 = ((iM6983 ^ i6) * 28605) ^ (-1635593276);
                        int i22 = iM6983 ^ 1681676388;
                        z2 = z2;
                        obj = th4;
                        i7 = i21;
                        zM4369 = zM4369;
                        i8 = i22;
                    }
                    break;
                case -1097850892:
                case 102209991:
                    try {
                        z2 = z2;
                        try {
                            zM4369 = C1294.m4369(((C10097) C2272.m7513(itM20833)).getName(), C1773.m5917(f983, 231, 35, i9));
                            int iM6984 = C2105.m6981("᩻ᩴ") ^ i5;
                            i8 = iM6984 ^ 326676162;
                            i7 = ((iM6984 ^ i6) * (-27531)) ^ (-1182092183);
                            z2 = z2;
                        } catch (Throwable th5) {
                            th = th5;
                            th = th;
                            iM2566 = C0630.m2566("ܺ᩶") ^ i5;
                            i3 = ((iM2566 ^ i6) * (-16149)) ^ 2090434642;
                            i4 = 1824242974;
                            int i1111 = iM2566 ^ i4;
                            z2 = z2;
                            z = zM4369;
                            i8 = i1111;
                            i7 = i3;
                            zM4369 = z;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        z2 = z2;
                    }
                    break;
                case -1070723602:
                case -669323790:
                    break;
                case -1048959950:
                case 1412595802:
                    C2958.m9034();
                    zM4369 = zM4369;
                    z2 = z2;
                    iM2566 = (C0630.m2566("֡᩵") + i6) * (-49);
                    i3 = ((iM2566 ^ i5) * (-26739)) ^ (-403637541);
                    i4 = 1424136117;
                    int i1112 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i1112;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case -1006356030:
                case 781861503:
                    zM4369 = zM4369;
                    z2 = z2;
                    i13 = 45185284;
                    if (C7811.m20844() != 0) {
                        iM2566 = (C0630.m2566("֡ܺ") + i6) * 43;
                        i3 = ((iM2566 ^ i5) * (-16105)) ^ (-623778311);
                        i4 = 1592517993;
                    } else {
                        iM2566 = C0630.m2566("ۜ᩶") ^ i5;
                        i3 = ((iM2566 ^ i6) * 31063) ^ (-488719491);
                        i4 = 2083708718;
                    }
                    int i1113 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i1113;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case -866601064:
                case 1807854644:
                    if (!zM4369) {
                        iM2566 = (C0630.m2566("֡ۘ") + i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM2566 ^ i6) * 23671) ^ 727376942;
                        i4 = -1042878781;
                        int i1114 = iM2566 ^ i4;
                        z2 = z2;
                        z = zM4369;
                        i8 = i1114;
                        i7 = i3;
                        zM4369 = z;
                    } else {
                        iM6981 = (C2105.m6981("۠ܿ") ^ i5) * 71;
                        i = ((iM6981 ^ i6) * 4193) ^ (-473796591);
                        i2 = -682245189;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    }
                    break;
                case -856379132:
                case 64508818:
                    if (!C1005.f3721) {
                        zM4369 = zM4369;
                        z2 = z2;
                        iM2566 = C2105.m6981("᩶۫") ^ i5;
                        i3 = ((iM2566 ^ i6) * 7541) ^ 1099854397;
                        i4 = 521035992;
                        int i1115 = iM2566 ^ i4;
                        z2 = z2;
                        z = zM4369;
                        i8 = i1115;
                        i7 = i3;
                        zM4369 = z;
                    }
                    zM4369 = zM4369;
                    z2 = z2;
                    iM2566 = C0630.m2566("ۧ۫") ^ i5;
                    i3 = ((iM2566 ^ i6) * 24927) ^ (-1155346244);
                    i4 = -1961817411;
                    int i1116 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i1116;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case -810181700:
                case -784585453:
                    itM20833 = C7811.m20833(c7980.m21301(z3));
                    iM2566 = (C0630.m2566("֡ۘ") + i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i3 = ((iM2566 ^ i6) * 23671) ^ 727376942;
                    i4 = -1042878781;
                    int i1117 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i1117;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case -786732244:
                case 207664583:
                    zM4369 = zM4369;
                    z2 = z2;
                    i11 = i10 * i10;
                    i12 = s * s;
                    if (C11340.f33930 >= 0) {
                        iM2566 = C2105.m6981("ۙۙ") ^ i6;
                        i3 = ((iM2566 ^ i5) * (-6159)) ^ (-2101400706);
                        i4 = -8546823;
                    } else {
                        iM2566 = (C2105.m6981("ۘۖ") + i6) * (-119);
                        i3 = ((iM2566 ^ i5) * 30653) ^ (-634633);
                        i4 = 1256042451;
                    }
                    int i1118 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i1118;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case -698356480:
                case 984604385:
                    zM4369 = zM4369;
                    z2 = z2;
                    zM5910 = C1773.m5910(itM20833);
                    iM2566 = (C0630.m2566("ܽܺ") + i6) * (-119);
                    i3 = ((iM2566 ^ i5) * 3459) ^ (-1530663032);
                    i4 = -1575019018;
                    int i1119 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i1119;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case -338607230:
                case 972851790:
                    zM4369 = zM4369;
                    z2 = z2;
                    c = 139;
                    if (C0237.m1481() >= 0) {
                        iM2566 = C0630.m2566("ۧ۫") ^ i5;
                        i3 = ((iM2566 ^ i6) * 24927) ^ (-1155346244);
                        i4 = -1961817411;
                    } else {
                        iM2566 = (C2105.m6981("ܿܺ") ^ i5) * 25;
                        i3 = ((iM2566 ^ i6) * (-2567)) ^ (-2012768625);
                        i4 = -709112245;
                    }
                    int i11110 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i11110;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case -189249089:
                case -3801631:
                    C11340.m28031();
                    break;
                case -107850177:
                case 1266764910:
                    zM4369 = zM4369;
                    z2 = z2;
                    z3 = true;
                    iM2566 = (C2105.m6981("ۧܳ") + i5) * 37;
                    i3 = ((iM2566 ^ i6) * (-2081)) ^ (-1591504259);
                    i4 = -519756100;
                    int i11111 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i11111;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case -4773225:
                case 433730851:
                    return z2;
                case 279431625:
                case 1761009328:
                    if (C2167.f7158 < 0) {
                        zM4369 = zM4369;
                        z2 = z2;
                        iM2566 = (C0630.m2566("֡ܺ") + i6) * 43;
                        i3 = ((iM2566 ^ i5) * (-16105)) ^ (-623778311);
                        i4 = 1592517993;
                        int i11112 = iM2566 ^ i4;
                        z2 = z2;
                        z = zM4369;
                        i8 = i11112;
                        i7 = i3;
                        zM4369 = z;
                    } else {
                        iM6981 = (C0630.m2566("ۛ᩸") + i6) * (-119);
                        i = ((iM6981 ^ i5) * (-19349)) ^ (-254157988);
                        i2 = -13602143;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    }
                    break;
                case 286202329:
                case 462471291:
                    zM4369 = zM4369;
                    z2 = z2;
                    if (C21923.f70183 != 0) {
                        iM2566 = C2105.m6981("᩶۫") ^ i5;
                        i3 = ((iM2566 ^ i6) * 7541) ^ 1099854397;
                        i4 = 521035992;
                    } else {
                        iM2566 = (i6 - C2105.m6981("ܺۤ")) * (-75);
                        i3 = ((iM2566 ^ i5) * 14531) ^ 1230610062;
                        i4 = 271929879;
                    }
                    int i11113 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i11113;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case 388605451:
                case 858731164:
                    return z3;
                case 447765519:
                case 801614959:
                    zM4369 = zM4369;
                    z2 = z2;
                    int i23 = s + 6722;
                    if (C0630.f2410 <= 0) {
                        i10 = i23;
                        iM2566 = (i5 - C0630.m2566("᩺ۚ")) * (-39);
                        i3 = ((iM2566 ^ i6) * (-19727)) ^ 202229892;
                        i4 = 630853882;
                        int i11114 = iM2566 ^ i4;
                        z2 = z2;
                        z = zM4369;
                        i8 = i11114;
                        i7 = i3;
                    } else {
                        int iM2568 = C0630.m2566("۬ۤ") ^ i5;
                        i10 = i23;
                        i7 = ((iM2568 ^ i6) * 8631) ^ 1676300987;
                        z2 = z2;
                        z = zM4369;
                        i8 = iM2568 ^ (-750567748);
                    }
                    zM4369 = z;
                    break;
                case 606491282:
                case 1086592867:
                    zM4369 = zM4369;
                    z2 = z2;
                    C5695.m16020(c18090);
                    iM2566 = (C0630.m2566("᩺ܿ") + i6) * (-109);
                    i3 = ((iM2566 ^ i5) * (-27949)) ^ (-1581859138);
                    i4 = 1601539076;
                    int i11115 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i11115;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case 663950969:
                case 1950914529:
                    i9 = 27058;
                    iM2566 = C0630.m2566("֫ۙ") ^ i6;
                    i3 = ((iM2566 ^ i5) * 12709) ^ 243756239;
                    i4 = 87555578;
                    int i11116 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i11116;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case 668679315:
                case 693027094:
                    zM4369 = zM4369;
                    z2 = z2;
                    if (RunnableC1108.f4040) {
                        iM2566 = C0630.m2566("֨ۨ") ^ i6;
                        i3 = ((iM2566 ^ i5) * 28675) ^ 1851492955;
                        i4 = 1158754262;
                    } else {
                        iM2566 = C2105.m6981("ۙۙ") ^ i6;
                        i3 = ((iM2566 ^ i5) * (-6159)) ^ (-2101400706);
                        i4 = -8546823;
                    }
                    int i11117 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i11117;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case 825332933:
                case 2122190469:
                    C0422.m1963();
                    if (C21923.f70183 == 0) {
                        iM6981 = (C0630.m2566("ۛ᩸") + i6) * (-119);
                        i = ((iM6981 ^ i5) * (-19349)) ^ (-254157988);
                        i2 = -13602143;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        zM4369 = zM4369;
                        z2 = z2;
                        iM2566 = C0630.m2566("ۧ۫") ^ i5;
                        i3 = ((iM2566 ^ i6) * 24927) ^ (-1155346244);
                        i4 = -1961817411;
                        int i11118 = iM2566 ^ i4;
                        z2 = z2;
                        z = zM4369;
                        i8 = i11118;
                        i7 = i3;
                        zM4369 = z;
                    }
                    break;
                case 852165123:
                case 858027252:
                    return z3;
                case 1144762885:
                case 1962794448:
                    zM4369 = zM4369;
                    z2 = z2;
                    if (C0237.m1481() >= 0) {
                        iM2566 = (C0630.m2566("֡᩵") + i6) * (-49);
                        i3 = ((iM2566 ^ i5) * (-26739)) ^ (-403637541);
                        i4 = 1424136117;
                    } else {
                        iM2566 = C0630.m2566("ۜ۫") ^ i5;
                        i3 = ((iM2566 ^ i6) * (-28015)) ^ 1201514261;
                        i4 = -994882057;
                    }
                    int i11119 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i11119;
                    i7 = i3;
                    zM4369 = z;
                    break;
                case 1313844408:
                case 2050110803:
                    zM4369 = zM4369;
                    z2 = z2;
                    sArr = f983;
                    if (C0382.f1805) {
                        iM2566 = (i5 - C0630.m2566("᩺ۗ")) * 3;
                        i3 = ((iM2566 ^ i6) * 23907) ^ 1892754510;
                        i4 = -1272017372;
                    } else {
                        iM2566 = C2105.m6981("ۙۙ") ^ i6;
                        i3 = ((iM2566 ^ i5) * (-6159)) ^ (-2101400706);
                        i4 = -8546823;
                    }
                    int i111110 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i111110;
                    i7 = i3;
                    zM4369 = z;
                    break;
                default:
                    zM4369 = zM4369;
                    z2 = z2;
                    try {
                        C2520.m8028(c18090);
                        iM2566 = C0630.m2566("᩺֡") ^ i6;
                        i3 = ((iM2566 ^ i5) * (-22079)) ^ 1243992056;
                        i4 = -342916825;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        iM2566 = (C0630.m2566("᩺ܿ") + i6) * (-109);
                        i3 = ((iM2566 ^ i5) * (-27949)) ^ (-1581859138);
                        i4 = 1601539076;
                    }
                    int i111111 = iM2566 ^ i4;
                    z2 = z2;
                    z = zM4369;
                    i8 = i111111;
                    i7 = i3;
                    zM4369 = z;
                    break;
            }
        }
    }
}
