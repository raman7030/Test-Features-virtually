package p067l;

import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.֡֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U995 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2434 implements InterfaceC24105 {

    /* JADX INFO: renamed from: ۙܿ֨, reason: not valid java name and contains not printable characters */
    private static final short[] f81823 = {2535, -22086, -22091, -22088, -22102, -22102, -22084, -22102, -22025, -22083, -22084, -22111, -22123, -22086, -22090, -22092, -22026, -22088, -22089, -22083, -22101, -22090, -22096, -22083, -22026, -22083, -22090, -22086, -22100, -22092, -22084, -22089, -22099, -22102, -22100, -22096, -22026, -22103, -22096, -22086, -22094, -22084, -22101, -22026, -22120, -22086, -22099, -22096, -22090, -22089, -22127, -22088, -22089, -22083, -22091, -22084, -22101, -22046, -22043, -22086, -22091, -22096, -22089, -22096, -22099, -22041, -22083, -22088, -22099, -22088, -22107, -22090, -22085, -22085, -22137, -22026, -22120, -22089, -22083, -22101, -22090, -22096, -22083, -22026, -22031, -22042, -22045, -22083, -22088, -22099, -22088, -22107, -22090, -22085, -22085, -22107, -22102, -22088, -22089, -22083, -22085, -22090, -22111, -22032, -22025, -22029, -22025, -22029, -22045, -22088, -22089, -22083, -22101, -22090, -22096, -22083, -22139, -22026, -22031, -22042, -22045, -22083, -22088, -22099, -22088, -22107, -22090, -22085, -22085, -22107, -22102, -22088, -22089, -22083, -22085, -22090, -22111, -22032, -22019, 3314, 27089, 27101, 27103, 27036, 27091, 27100, 27094, 27072, 27101, 27099, 27094, 27036, 27095, 27082, 27078, 27095, 27072, 27100, 27091, 27102, 27073, 27078, 27101, 27072, 27091, 27093, 27095, 27089, 27102, 27091, 27073, 27073, 27095, 27073, 27036, 27094, 27095, 27082, 27134, 27089, 27101, 27103, 27037, 27091, 27100, 27094, 27072, 27101, 27099, 27094, 27037, 27095, 27082, 27078, 27095, 27072, 27100, 27091, 27102, 27073, 27078, 27101, 27072, 27091, 27093, 27095, 27037, 27127, 27082, 27078, 27095, 27072, 27100, 27091, 27102, 27105, 27078, 27101, 27072, 27091, 27093, 27095, 27106, 27072, 27101, 27076, 27099, 27094, 27095, 27072, 27017, 27106, 27123, 27110, 27110, 27127, 27104, 27132, 27117, 27104, 27127, 27105, 27110, 27104, 27131, 27121, 27110, 27127, 27126, 27117, 27123, 27132, 27126, 27104, 27133, 27131, 27126, 27117, 27105, 27111, 27120, 27110, 27104, 27127, 27127, 27105};

    /* JADX WARN: Code duplicated, block: B:56:0x0296 A[PHI: r35
      0x0296: PHI (r35v67 int) = (r35v64 int), (r35v68 int) binds: [B:54:0x027d, B:45:0x0224] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x033c A[PHI: r17 r35
      0x033c: PHI (r17v4 java.util.Iterator) = (r17v3 java.util.Iterator), (r17v2 java.util.Iterator), (r17v2 java.util.Iterator) binds: [B:75:0x033a, B:45:0x0224, B:42:0x0209] A[DONT_GENERATE, DONT_INLINE]
      0x033c: PHI (r35v69 int) = (r35v59 int), (r35v68 int), (r35v70 int) binds: [B:75:0x033a, B:45:0x0224, B:42:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.InterfaceC24105
    /* JADX INFO: renamed from: ֫ */
    public final void mo3413(String str, C4184 c4184) {
        EnumC3167 enumC3167;
        int i;
        Object obj;
        C9952 c9952;
        EnumC3167 enumC3168;
        Throwable th;
        boolean z;
        int i2;
        int i3;
        int iM55680;
        int i4;
        C9952 c9953;
        int iM55979;
        int i5;
        int i6;
        C9952 c9954;
        int i7;
        C9952 c9955;
        int iM559710;
        int i8;
        int i9;
        int i10;
        int i11;
        C9952 c9956;
        int iM55681;
        int i12;
        int i13;
        int iM559711;
        int i14;
        int iM55682;
        int i15;
        int i16;
        int i17 = C1044.f81959;
        int i18 = C0877.f81843;
        int iM559712 = C0946.m55979("ۚܽ") ^ i17;
        int i19 = ((iM559712 ^ i18) * (-5691)) ^ (-579746413);
        Iterator itM55994 = null;
        C9952 c9957 = null;
        Iterator itM56346 = null;
        C18155 c18155 = null;
        AbstractC3651 abstractC3651 = null;
        EnumC3167 enumC3167M56210 = null;
        EnumC3167 enumC3169 = null;
        String string = null;
        int i20 = iM559712 ^ 1541883416;
        boolean z2 = false;
        int i21 = 0;
        boolean z3 = false;
        int i22 = 0;
        int i23 = 0;
        boolean z4 = false;
        boolean zM55886 = false;
        boolean zM55582 = false;
        boolean zM55682 = false;
        boolean zM55683 = false;
        boolean zM55806 = false;
        int i24 = 160193921;
        C19561 c19561 = null;
        boolean zM55647 = false;
        Throwable th2 = null;
        Object obj2 = null;
        Iterator it = null;
        InterfaceC23920 interfaceC23920 = null;
        EnumC3167 enumC31610 = null;
        EnumC3167 enumC3167M55855 = null;
        boolean zM55949 = false;
        boolean zHasNext = false;
        boolean z5 = false;
        while (true) {
            i24 = i20 ^ (i19 & (((i24 ^ i18) * 6135) >> 31));
            switch (i24) {
                case -2132965021:
                case -1318746526:
                    i22 = i22;
                    if (zM55682) {
                        iM55682 = (C0946.m55979("ۤۛ") + i18) * 17;
                        i12 = ((iM55682 ^ i17) * 1903) ^ 1983477110;
                        i15 = -1655801244;
                    } else {
                        iM55682 = (C0873.m55680("ۚۧ") + i17) * (-55);
                        i12 = ((iM55682 ^ i18) * 29987) ^ (-1859710295);
                        i15 = -175748529;
                    }
                    i16 = iM55682 ^ i15;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case -2059850888:
                case -1473833004:
                    enumC3167M56210 = enumC3167M56210;
                    i22 = i22;
                    obj2 = obj2;
                    c9954 = c9957;
                    enumC31610 = enumC31610;
                    th2 = th2;
                    try {
                        C0877.m55706(th2, obj2);
                        int iM559713 = C0946.m55979("ܳܶ") ^ i17;
                        th2 = th2;
                        obj2 = obj2;
                        enumC31610 = enumC31610;
                        i22 = i22;
                        i20 = iM559713 ^ 2028889050;
                        c9957 = c9954;
                        i19 = ((iM559713 ^ i18) * 26833) ^ (-1107600479);
                        enumC3167M56210 = enumC3167M56210;
                    } catch (Throwable unused) {
                        c9953 = c9954;
                        z5 = z5;
                        i21 = i21;
                        iM55979 = C0946.m55979("ۛۢ") ^ i18;
                        i5 = ((iM55979 ^ i17) * (-1747)) ^ 1621946781;
                        i6 = -1206002065;
                        int i25 = iM55979 ^ i6;
                        z3 = z3;
                        enumC3167M56210 = enumC3167M56210;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = i25;
                        i19 = i5;
                        i21 = i21;
                        z5 = z5;
                        C9952 c9958 = c9953;
                        th2 = th2;
                        enumC31610 = enumC31610;
                        c9957 = c9958;
                    }
                    break;
                case -2058292398:
                case 1931776735:
                    i22 = i22;
                    try {
                        C18155 c18156 = (C18155) RunnableC0897.m55785(itM56346);
                        try {
                            try {
                                enumC3167M56210 = enumC3167M56210;
                                try {
                                    zM55949 = ViewOnClickListenerC0939.m55949(C0930.m55894(c18156), C0906.m55810(f81823, 58, 8, i23));
                                    int iM559714 = C0946.m55979("֨۠") ^ i17;
                                    i10 = ((iM559714 ^ i18) * 17665) ^ (-374875130);
                                    i11 = iM559714 ^ 1533104725;
                                    c18155 = c18156;
                                    i22 = i22;
                                    i20 = i11;
                                    i19 = i10;
                                    enumC3167M56210 = enumC3167M56210;
                                } catch (Throwable th3) {
                                    th = th3;
                                    th2 = th;
                                    c18155 = c18156;
                                    enumC3167M56210 = enumC3167M56210;
                                    i21 = i21;
                                    z3 = z3;
                                    enumC31610 = enumC31610;
                                    int iM55683 = (C0873.m55680("᩹ۙ") + i18) * 5;
                                    enumC31610 = enumC31610;
                                    c9957 = c9957;
                                    i19 = ((iM55683 ^ i17) * (-14943)) ^ 1625096750;
                                    z3 = z3;
                                    obj2 = obj2;
                                    i22 = i22;
                                    i20 = iM55683 ^ (-696873423);
                                    i21 = i21;
                                    z5 = z5;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                enumC3167M56210 = enumC3167M56210;
                            }
                        } catch (Throwable th5) {
                            th2 = th5;
                            c18155 = c18156;
                            i21 = i21;
                            z3 = z3;
                            enumC31610 = enumC31610;
                            int iM55684 = (C0873.m55680("᩹ۙ") + i18) * 5;
                            enumC31610 = enumC31610;
                            c9957 = c9957;
                            i19 = ((iM55684 ^ i17) * (-14943)) ^ 1625096750;
                            z3 = z3;
                            obj2 = obj2;
                            i22 = i22;
                            i20 = iM55684 ^ (-696873423);
                            i21 = i21;
                            z5 = z5;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        th2 = th;
                        i21 = i21;
                        z3 = z3;
                        enumC31610 = enumC31610;
                        int iM55685 = (C0873.m55680("᩹ۙ") + i18) * 5;
                        enumC31610 = enumC31610;
                        c9957 = c9957;
                        i19 = ((iM55685 ^ i17) * (-14943)) ^ 1625096750;
                        z3 = z3;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = iM55685 ^ (-696873423);
                        i21 = i21;
                        z5 = z5;
                        break;
                    }
                    break;
                case -2000923669:
                case 384303688:
                    if (i22 < i21) {
                        iM55680 = C0873.m55680("ܽۘ") ^ i17;
                        i2 = ((iM55680 ^ i18) * (-32363)) ^ 2103415322;
                        i4 = -1133614257;
                    } else {
                        iM55680 = (C0873.m55680("ܳ۠") + i18) * (-7);
                        i2 = ((iM55680 ^ i17) * 23253) ^ (-1168922932);
                        i4 = 242834314;
                    }
                    i20 = iM55680 ^ i4;
                    i19 = i2;
                    break;
                case -1998293601:
                case -491948631:
                    enumC3167M56210 = enumC3167M56210;
                    i22 = i22;
                    try {
                        zM55647 = C0866.m55647(itM56346);
                        iM559711 = (C0946.m55979("ᩴۢ") + i17) * 23;
                        i10 = ((iM559711 ^ i18) * (-27703)) ^ 16776560;
                        i14 = 334610861;
                        i11 = iM559711 ^ i14;
                        i22 = i22;
                        i20 = i11;
                        i19 = i10;
                        enumC3167M56210 = enumC3167M56210;
                    } catch (Throwable th7) {
                        th2 = th7;
                        enumC3167M56210 = enumC3167M56210;
                        i21 = i21;
                        z3 = z3;
                        enumC31610 = enumC31610;
                        int iM55686 = (C0873.m55680("᩹ۙ") + i18) * 5;
                        enumC31610 = enumC31610;
                        c9957 = c9957;
                        i19 = ((iM55686 ^ i17) * (-14943)) ^ 1625096750;
                        z3 = z3;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = iM55686 ^ (-696873423);
                        i21 = i21;
                        z5 = z5;
                    }
                    break;
                case -1995140298:
                case 364291408:
                    z4 = false;
                    iM55680 = (C0873.m55680("᩵᩷") + i18) * 99;
                    i2 = ((iM55680 ^ i17) * (-21315)) ^ (-1430556590);
                    i4 = 1512309265;
                    i20 = iM55680 ^ i4;
                    i19 = i2;
                    break;
                case -1991577443:
                case -1149237551:
                    enumC3167M56210 = enumC3167M56210;
                    i22 = i22;
                    c9955 = c9957;
                    enumC31610 = enumC31610;
                    if (zM55886) {
                        iM559710 = (C0946.m55979("֡ۗ") + i17) * 51;
                        i8 = ((iM559710 ^ i18) * (-23659)) ^ 216540993;
                        i9 = -1160200768;
                    } else {
                        iM559710 = (i18 - C0946.m55979("ۤ᩺")) * (-113);
                        i8 = ((iM559710 ^ i17) * (-14153)) ^ 1051095849;
                        i9 = -833373412;
                    }
                    int i26 = iM559710 ^ i9;
                    i22 = i22;
                    i20 = i26;
                    i19 = i8;
                    enumC31610 = enumC31610;
                    c9957 = c9955;
                    enumC3167M56210 = enumC3167M56210;
                    break;
                case -1881335219:
                case 1332140741:
                    i22 = i22;
                    string = ((InterfaceC16954) C1071.m56351((InterfaceC12777) interfaceC23920)).getString();
                    zM55582 = C0845.m55582(string, C0861.m55618(f81823, 66, 8, i23));
                    iM55682 = (i18 - C0946.m55979("֨ܳ")) * (-43);
                    i12 = ((iM55682 ^ i17) * (-4729)) ^ 1786797489;
                    i15 = 2088750430;
                    i16 = iM55682 ^ i15;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case -1869605910:
                case 813424040:
                    enumC3167M56210 = enumC3167M56210;
                    i22 = i22;
                    c9955 = c9957;
                    try {
                        C9952 c9959 = (C9952) RunnableC0897.m55785(itM55994);
                        try {
                            enumC31610 = enumC31610;
                            try {
                                zM55806 = C0906.m55806(C1024.m56215(c9959), C0854.m55597(f81823, 12, 46, i23));
                                int iM55687 = C0873.m55680("᩺ܶ") ^ i17;
                                i10 = ((iM55687 ^ i18) * (-12619)) ^ (-574703206);
                                i11 = iM55687 ^ 631197966;
                                enumC31610 = enumC31610;
                                c9957 = c9959;
                                i22 = i22;
                                i20 = i11;
                                i19 = i10;
                                enumC3167M56210 = enumC3167M56210;
                            } catch (Throwable th8) {
                                th = th8;
                                th2 = th;
                                c9957 = c9959;
                                z5 = z5;
                                obj2 = obj2;
                                enumC3167M56210 = enumC3167M56210;
                                i21 = i21;
                                z3 = z3;
                                int iM55688 = (C0873.m55680("᩹ۙ") + i18) * 5;
                                enumC31610 = enumC31610;
                                c9957 = c9957;
                                i19 = ((iM55688 ^ i17) * (-14943)) ^ 1625096750;
                                z3 = z3;
                                obj2 = obj2;
                                i22 = i22;
                                i20 = iM55688 ^ (-696873423);
                                i21 = i21;
                                z5 = z5;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            enumC31610 = enumC31610;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        enumC31610 = enumC31610;
                        th2 = th;
                        c9957 = c9955;
                        z5 = z5;
                        obj2 = obj2;
                        enumC3167M56210 = enumC3167M56210;
                        i21 = i21;
                        z3 = z3;
                        int iM55689 = (C0873.m55680("᩹ۙ") + i18) * 5;
                        enumC31610 = enumC31610;
                        c9957 = c9957;
                        i19 = ((iM55689 ^ i17) * (-14943)) ^ 1625096750;
                        z3 = z3;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = iM55689 ^ (-696873423);
                        i21 = i21;
                        z5 = z5;
                        break;
                    }
                    break;
                case -1868515489:
                case 790657621:
                    enumC3167 = enumC3167M56210;
                    i = i22;
                    obj = obj2;
                    c9952 = c9957;
                    enumC3168 = enumC31610;
                    th = th2;
                    z = true;
                    int iM559715 = C0946.m55979("᩺ۜ") ^ i17;
                    i2 = ((iM559715 ^ i18) * (-2453)) ^ (-190202533);
                    th2 = th;
                    obj2 = obj;
                    enumC31610 = enumC3168;
                    i22 = i;
                    i20 = iM559715 ^ (-841802893);
                    c9957 = c9952;
                    i21 = i21;
                    enumC3167M56210 = enumC3167;
                    z5 = z;
                    i19 = i2;
                    break;
                case -1828613178:
                case 1652797880:
                    i22 = i22;
                    if (enumC3167M55855 == enumC3169) {
                        iM55682 = (C0946.m55979("ۜ᩷") + i18) * 39;
                        i12 = ((iM55682 ^ i17) * (-4115)) ^ (-1106249576);
                        i15 = 569146821;
                    } else {
                        iM55682 = C0873.m55680("᩹᩷") ^ i18;
                        i12 = ((iM55682 ^ i17) * 17891) ^ (-1439153751);
                        i15 = 654854010;
                    }
                    i16 = iM55682 ^ i15;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case -1827625317:
                case -1670277364:
                    c9953 = c9957;
                    i23 = 43481;
                    iM55979 = C0873.m55680("ܿܺ") ^ i18;
                    i5 = ((iM55979 ^ i17) * 17095) ^ 308540584;
                    i6 = 758219118;
                    int i27 = iM55979 ^ i6;
                    z3 = z3;
                    enumC3167M56210 = enumC3167M56210;
                    obj2 = obj2;
                    i22 = i22;
                    i20 = i27;
                    i19 = i5;
                    i21 = i21;
                    z5 = z5;
                    C9952 c99510 = c9953;
                    th2 = th2;
                    enumC31610 = enumC31610;
                    c9957 = c99510;
                    break;
                case -1810540137:
                case 236662949:
                    c4184.f9213 = z3;
                    c4184.f9214 = z2;
                    iM55680 = (C0946.m55979("ۨܰ") + i18) * 3;
                    i2 = ((iM55680 ^ i17) * (-16621)) ^ 429545305;
                    i4 = 2034328805;
                    i20 = iM55680 ^ i4;
                    i19 = i2;
                    break;
                case -1713192766:
                case -1019052688:
                    i22 = i22;
                    it = ((C18826) c18155.mo5857().mo6074()).iterator();
                    iM55682 = C0873.m55680("᩹᩷") ^ i18;
                    i12 = ((iM55682 ^ i17) * 17891) ^ (-1439153751);
                    i15 = 654854010;
                    i16 = iM55682 ^ i15;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case -1623176625:
                case -909768895:
                    if (zM55683) {
                        iM55680 = C0873.m55680("֫ۛ") ^ i17;
                        i2 = ((iM55680 ^ i18) * (-2561)) ^ (-1333028455);
                        i4 = -2042587155;
                    } else {
                        iM55680 = (C0873.m55680("ܰۗ") + i18) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((iM55680 ^ i17) * (-16751)) ^ (-140899618);
                        i4 = -361209745;
                    }
                    i20 = iM55680 ^ i4;
                    i19 = i2;
                    break;
                case -1551991640:
                case -1371615406:
                    enumC3167M56210 = enumC3167M56210;
                    i22 = i22;
                    z5 = z5;
                    obj2 = obj2;
                    i21 = i21;
                    z3 = z3;
                    C9952 c99511 = c9957;
                    enumC31610 = enumC31610;
                    th2 = th2;
                    c9953 = c99511;
                    z2 = false;
                    if (mo3414()) {
                        iM55979 = C0873.m55680("ܽۧ") ^ i17;
                        i5 = ((iM55979 ^ i18) * (-4703)) ^ 1217125105;
                        i6 = -602366540;
                    } else {
                        iM55979 = C0946.m55979("᩹ܺ") ^ i18;
                        i5 = ((iM55979 ^ i17) * 21481) ^ 518597723;
                        i6 = -2012397317;
                    }
                    int i28 = iM55979 ^ i6;
                    z3 = z3;
                    enumC3167M56210 = enumC3167M56210;
                    obj2 = obj2;
                    i22 = i22;
                    i20 = i28;
                    i19 = i5;
                    i21 = i21;
                    z5 = z5;
                    C9952 c99512 = c9953;
                    th2 = th2;
                    enumC31610 = enumC31610;
                    c9957 = c99512;
                    break;
                case -1532631301:
                case 1688898340:
                    i22 = i22;
                    if (zM55582) {
                        iM55682 = (C0873.m55680("ۘᩴ") + i17) * 47;
                        i12 = ((iM55682 ^ i18) * (-507)) ^ 135777906;
                        i15 = 2064011360;
                    } else {
                        iM55682 = C0873.m55680("᩹᩷") ^ i18;
                        i12 = ((iM55682 ^ i17) * 17891) ^ (-1439153751);
                        i15 = 654854010;
                    }
                    i16 = iM55682 ^ i15;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case -1479227570:
                case -751110731:
                    i22 = i22;
                    if (zM55949) {
                        iM55682 = (i17 - C0873.m55680("۟ۜ")) * 29;
                        i12 = ((iM55682 ^ i18) * (-10371)) ^ 1867373848;
                        i15 = -337977939;
                        i16 = iM55682 ^ i15;
                        i7 = i22;
                        i20 = i16;
                        i19 = i12;
                        i22 = i7;
                    }
                    enumC3167M56210 = enumC3167M56210;
                    c9956 = c9957;
                    iM55681 = (C0873.m55680("᩷ۡ") + i18) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i12 = ((iM55681 ^ i17) * 11421) ^ (-2036746935);
                    i13 = -385057350;
                    i16 = iM55681 ^ i13;
                    c9957 = c9956;
                    enumC3167M56210 = enumC3167M56210;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case -1455156615:
                case -1353890079:
                    i22 = i22;
                    AbstractC3651 abstractC3652 = (AbstractC3651) it;
                    try {
                        zHasNext = abstractC3652.hasNext();
                        int iM556810 = (C0873.m55680("۫ۖ") + i17) * (-57);
                        i2 = ((iM556810 ^ i18) * 3653) ^ 192338257;
                        i3 = iM556810 ^ (-535138458);
                        abstractC3651 = abstractC3652;
                        i22 = i22;
                        i20 = i3;
                        i19 = i2;
                    } catch (Throwable th11) {
                        th2 = th11;
                        abstractC3651 = abstractC3652;
                        i21 = i21;
                        z3 = z3;
                        enumC31610 = enumC31610;
                        int iM556811 = (C0873.m55680("᩹ۙ") + i18) * 5;
                        enumC31610 = enumC31610;
                        c9957 = c9957;
                        i19 = ((iM556811 ^ i17) * (-14943)) ^ 1625096750;
                        z3 = z3;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = iM556811 ^ (-696873423);
                        i21 = i21;
                        z5 = z5;
                    }
                    break;
                case -1391945644:
                case 1978168769:
                    enumC3167M56210 = enumC3167M56210;
                    i22 = i22;
                    z5 = z5;
                    obj2 = obj2;
                    C9952 c99513 = c9957;
                    i21 = i21;
                    enumC31610 = enumC31610;
                    th2 = th2;
                    try {
                        c9953 = c99513;
                        try {
                            C19561 c19562 = new C19561(str);
                            try {
                                z3 = z3;
                                try {
                                    itM55994 = C0947.m55994((AbstractC20050) C0861.m55614(C0854.m55608(C1003.m56127(c19562, c19562.m44470(RunnableC0897.m55783(f81823, 1, 11, i23)), null))));
                                    c19561 = c19562;
                                    iM55979 = (C0873.m55680("᩷ܽ") ^ i17) * 57;
                                    i5 = ((iM55979 ^ i18) * (-20073)) ^ 2093752374;
                                    i6 = -192570177;
                                    int i29 = iM55979 ^ i6;
                                    z3 = z3;
                                    enumC3167M56210 = enumC3167M56210;
                                    obj2 = obj2;
                                    i22 = i22;
                                    i20 = i29;
                                    i19 = i5;
                                    i21 = i21;
                                    z5 = z5;
                                    C9952 c99514 = c9953;
                                    th2 = th2;
                                    enumC31610 = enumC31610;
                                    c9957 = c99514;
                                } catch (Throwable th12) {
                                    th = th12;
                                    c19561 = c19562;
                                    enumC3167M56210 = enumC3167M56210;
                                    th2 = th;
                                    c9957 = c9953;
                                    int iM556812 = (C0873.m55680("᩹ۙ") + i18) * 5;
                                    enumC31610 = enumC31610;
                                    c9957 = c9957;
                                    i19 = ((iM556812 ^ i17) * (-14943)) ^ 1625096750;
                                    z3 = z3;
                                    obj2 = obj2;
                                    i22 = i22;
                                    i20 = iM556812 ^ (-696873423);
                                    i21 = i21;
                                    z5 = z5;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                z3 = z3;
                            }
                        } catch (Throwable unused2) {
                            c19561 = null;
                            iM55979 = C0946.m55979("ۛۢ") ^ i18;
                            i5 = ((iM55979 ^ i17) * (-1747)) ^ 1621946781;
                            i6 = -1206002065;
                        }
                    } catch (Throwable unused3) {
                        c9953 = c99513;
                    }
                    break;
                case -1379435734:
                case -1233111811:
                    enumC3167M56210 = enumC3167M56210;
                    i22 = i22;
                    c9956 = c9957;
                    if (!zM55806) {
                        enumC31610 = enumC31610;
                        z5 = z5;
                        th2 = th2;
                        obj2 = obj2;
                        i21 = i21;
                        c9953 = c9956;
                        z3 = z3;
                        iM55979 = (C0873.m55680("᩷ܽ") ^ i17) * 57;
                        i5 = ((iM55979 ^ i18) * (-20073)) ^ 2093752374;
                        i6 = -192570177;
                        int i210 = iM55979 ^ i6;
                        z3 = z3;
                        enumC3167M56210 = enumC3167M56210;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = i210;
                        i19 = i5;
                        i21 = i21;
                        z5 = z5;
                        C9952 c99515 = c9953;
                        th2 = th2;
                        enumC31610 = enumC31610;
                        c9957 = c99515;
                    } else {
                        iM55681 = C0873.m55680("ܰۘ") ^ i18;
                        i12 = ((iM55681 ^ i17) * (-4381)) ^ 1780362062;
                        i13 = 895640454;
                        i16 = iM55681 ^ i13;
                        c9957 = c9956;
                        enumC3167M56210 = enumC3167M56210;
                        i7 = i22;
                        i20 = i16;
                        i19 = i12;
                        i22 = i7;
                    }
                    break;
                case -1356535119:
                case 1336879282:
                    enumC3167M56210 = enumC3167M56210;
                    i22 = i22;
                    c9955 = c9957;
                    enumC31610 = enumC31610;
                    try {
                        zM55886 = C0930.m55886(itM55994);
                        iM559710 = C0946.m55979("ܽۗ") ^ i18;
                        i8 = ((iM559710 ^ i17) * (-30029)) ^ (-1448158719);
                        i9 = 902822902;
                        int i211 = iM559710 ^ i9;
                        i22 = i22;
                        i20 = i211;
                        i19 = i8;
                        enumC31610 = enumC31610;
                        c9957 = c9955;
                        enumC3167M56210 = enumC3167M56210;
                    } catch (Throwable th14) {
                        th = th14;
                        th2 = th;
                        c9957 = c9955;
                        z5 = z5;
                        obj2 = obj2;
                        enumC3167M56210 = enumC3167M56210;
                        i21 = i21;
                        z3 = z3;
                        int iM556813 = (C0873.m55680("᩹ۙ") + i18) * 5;
                        enumC31610 = enumC31610;
                        c9957 = c9957;
                        i19 = ((iM556813 ^ i17) * (-14943)) ^ 1625096750;
                        z3 = z3;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = iM556813 ^ (-696873423);
                        i21 = i21;
                        z5 = z5;
                    }
                    break;
                case -1154638797:
                case 989362138:
                    enumC3167M56210 = enumC3167M56210;
                    i22 = i22;
                    c9956 = c9957;
                    try {
                        itM56346 = C1071.m56346(c9956.m23266(z3));
                        iM55681 = (C0873.m55680("᩷ۡ") + i18) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i12 = ((iM55681 ^ i17) * 11421) ^ (-2036746935);
                        i13 = -385057350;
                        i16 = iM55681 ^ i13;
                        c9957 = c9956;
                        enumC3167M56210 = enumC3167M56210;
                        i7 = i22;
                        i20 = i16;
                        i19 = i12;
                        i22 = i7;
                    } catch (Throwable th15) {
                        th2 = th15;
                        c9957 = c9956;
                        enumC31610 = enumC31610;
                        z5 = z5;
                        obj2 = obj2;
                        enumC3167M56210 = enumC3167M56210;
                        i21 = i21;
                        z3 = z3;
                        int iM556814 = (C0873.m55680("᩹ۙ") + i18) * 5;
                        enumC31610 = enumC31610;
                        c9957 = c9957;
                        i19 = ((iM556814 ^ i17) * (-14943)) ^ 1625096750;
                        z3 = z3;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = iM556814 ^ (-696873423);
                        i21 = i21;
                        z5 = z5;
                    }
                    break;
                case -1111516756:
                case -461027569:
                    i22 = i22;
                    InterfaceC23920 interfaceC23921 = (InterfaceC23920) abstractC3651.next();
                    try {
                        enumC3167M56210 = C1024.m56210(interfaceC23921);
                        enumC31610 = EnumC3167.f5911;
                        int iM559716 = (C0946.m55979("֫ܽ") ^ i17) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((iM559716 ^ i18) * 10541) ^ 602490958;
                        i3 = iM559716 ^ (-462535313);
                        interfaceC23920 = interfaceC23921;
                        i22 = i22;
                        i20 = i3;
                        i19 = i2;
                    } catch (Throwable th16) {
                        th2 = th16;
                        interfaceC23920 = interfaceC23921;
                        i21 = i21;
                        z3 = z3;
                        enumC31610 = enumC31610;
                        int iM556815 = (C0873.m55680("᩹ۙ") + i18) * 5;
                        enumC31610 = enumC31610;
                        c9957 = c9957;
                        i19 = ((iM556815 ^ i17) * (-14943)) ^ 1625096750;
                        z3 = z3;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = iM556815 ^ (-696873423);
                        i21 = i21;
                        z5 = z5;
                    }
                    break;
                case -1077532485:
                case 354805599:
                    i22 = i22;
                    enumC3167M55855 = C0917.m55855(interfaceC23920);
                    enumC3169 = EnumC3167.f5994;
                    iM55682 = (C0873.m55680("᩺ܽ") + i17) * (-17);
                    i12 = ((iM55682 ^ i18) * (-30999)) ^ (-1257541930);
                    i15 = -1824561715;
                    i16 = iM55682 ^ i15;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case -1056781448:
                case 438344673:
                    i22 = i22;
                    if (enumC3167M56210 != enumC31610) {
                        iM55682 = (i18 - C0873.m55680("᩵ۖ")) * 3;
                        i12 = ((iM55682 ^ i17) * (-24847)) ^ (-1559398360);
                        i15 = -1077511669;
                    } else {
                        iM55682 = (C0946.m55979("ۜ᩷") + i18) * 39;
                        i12 = ((iM55682 ^ i17) * (-4115)) ^ (-1106249576);
                        i15 = 569146821;
                    }
                    i16 = iM55682 ^ i15;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case -1048150642:
                case -742618013:
                    enumC3167M56210 = enumC3167M56210;
                    i22 = i22;
                    z5 = z5;
                    obj2 = obj2;
                    i21 = i21;
                    z3 = z3;
                    C9952 c99516 = c9957;
                    enumC31610 = enumC31610;
                    th2 = th2;
                    c9953 = c99516;
                    short s = f81823[0];
                    if (((s * s) + 364924609) - (s * 38206) >= 0) {
                        iM55979 = C0946.m55979("᩶֨") ^ i18;
                        i5 = ((iM55979 ^ i17) * 21349) ^ (-485518044);
                        i6 = 306033891;
                    } else {
                        iM55979 = C0946.m55979("ܺ᩹") ^ i17;
                        i5 = ((iM55979 ^ i18) * (-12413)) ^ (-161545865);
                        i6 = -1809865401;
                    }
                    int i212 = iM55979 ^ i6;
                    z3 = z3;
                    enumC3167M56210 = enumC3167M56210;
                    obj2 = obj2;
                    i22 = i22;
                    i20 = i212;
                    i19 = i5;
                    i21 = i21;
                    z5 = z5;
                    C9952 c99517 = c9953;
                    th2 = th2;
                    enumC31610 = enumC31610;
                    c9957 = c99517;
                    break;
                case -850778009:
                case 300753440:
                    enumC3167M56210 = enumC3167M56210;
                    i22 = i22;
                    obj2 = obj2;
                    c9954 = c9957;
                    enumC31610 = enumC31610;
                    th2 = th2;
                    try {
                        C1124.m56366(c19561);
                        int iM559717 = C0946.m55979("ܳܶ") ^ i17;
                        th2 = th2;
                        obj2 = obj2;
                        enumC31610 = enumC31610;
                        i22 = i22;
                        i20 = iM559717 ^ 2028889050;
                        c9957 = c9954;
                        i19 = ((iM559717 ^ i18) * 26833) ^ (-1107600479);
                        enumC3167M56210 = enumC3167M56210;
                    } catch (Throwable th17) {
                        int iM559718 = C0946.m55979("ۖ᩹") ^ i18;
                        obj2 = th17;
                        th2 = th2;
                        i19 = ((iM559718 ^ i17) * (-14969)) ^ 1225384998;
                        enumC31610 = enumC31610;
                        c9957 = c9954;
                        enumC3167M56210 = enumC3167M56210;
                        i7 = i22;
                        i20 = iM559718 ^ 644408234;
                        i22 = i7;
                    }
                    break;
                case -743537974:
                case 1783391686:
                    try {
                        C1124.m56366(c19561);
                        iM55680 = (C0946.m55979("ܰܿ") ^ i17) * 51;
                        i2 = ((iM55680 ^ i18) * (-20325)) ^ 565655922;
                        i4 = -1003200330;
                        i20 = iM55680 ^ i4;
                        i19 = i2;
                    } catch (Throwable unused4) {
                        enumC3167M56210 = enumC3167M56210;
                        i22 = i22;
                        z5 = z5;
                        obj2 = obj2;
                        i21 = i21;
                        C9952 c99518 = c9957;
                        enumC31610 = enumC31610;
                        th2 = th2;
                        c9953 = c99518;
                        iM55979 = C0946.m55979("ۛۢ") ^ i18;
                        i5 = ((iM55979 ^ i17) * (-1747)) ^ 1621946781;
                        i6 = -1206002065;
                        int i213 = iM55979 ^ i6;
                        z3 = z3;
                        enumC3167M56210 = enumC3167M56210;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = i213;
                        i19 = i5;
                        i21 = i21;
                        z5 = z5;
                        C9952 c99519 = c9953;
                        th2 = th2;
                        enumC31610 = enumC31610;
                        c9957 = c99519;
                    }
                    break;
                case -517158411:
                case 1524271835:
                    enumC3167M56210 = enumC3167M56210;
                    i22 = i22;
                    C9952 c99520 = c9957;
                    enumC31610 = enumC31610;
                    try {
                        C1124.m56366(c19561);
                        break;
                    } catch (Throwable unused5) {
                    }
                    z5 = z5;
                    th2 = th2;
                    obj2 = obj2;
                    i21 = i21;
                    c9953 = c99520;
                    iM55979 = C0946.m55979("ۛۢ") ^ i18;
                    i5 = ((iM55979 ^ i17) * (-1747)) ^ 1621946781;
                    i6 = -1206002065;
                    int i214 = iM55979 ^ i6;
                    z3 = z3;
                    enumC3167M56210 = enumC3167M56210;
                    obj2 = obj2;
                    i22 = i22;
                    i20 = i214;
                    i19 = i5;
                    i21 = i21;
                    z5 = z5;
                    C9952 c995110 = c9953;
                    th2 = th2;
                    enumC31610 = enumC31610;
                    c9957 = c995110;
                    break;
                case -301914704:
                case -204964878:
                    c4184.f9213 = z2;
                    c4184.f9214 = z2;
                    iM55680 = (C0946.m55979("ۨܰ") + i18) * 3;
                    i2 = ((iM55680 ^ i17) * (-16621)) ^ 429545305;
                    i4 = 2034328805;
                    i20 = iM55680 ^ i4;
                    i19 = i2;
                    break;
                case -261597255:
                case 474238688:
                    c9953 = c9957;
                    i23 = 31968;
                    iM55979 = C0873.m55680("ܿܺ") ^ i18;
                    i5 = ((iM55979 ^ i17) * 17095) ^ 308540584;
                    i6 = 758219118;
                    int i215 = iM55979 ^ i6;
                    z3 = z3;
                    enumC3167M56210 = enumC3167M56210;
                    obj2 = obj2;
                    i22 = i22;
                    i20 = i215;
                    i19 = i5;
                    i21 = i21;
                    z5 = z5;
                    C9952 c995111 = c9953;
                    th2 = th2;
                    enumC31610 = enumC31610;
                    c9957 = c995111;
                    break;
                case -256535455:
                case 988789574:
                    enumC3167M56210 = enumC3167M56210;
                    i22 = i22;
                    obj2 = obj2;
                    c9954 = c9957;
                    enumC31610 = enumC31610;
                    th2 = th2;
                    throw th2;
                case -159346903:
                case 1591182739:
                    c4184.f9213 = z3;
                    i22 = Build.VERSION.SDK_INT;
                    iM55680 = C0946.m55979("ۨ۟") ^ i17;
                    i2 = ((iM55680 ^ i18) * 11181) ^ 40797033;
                    i4 = 15179460;
                    i20 = iM55680 ^ i4;
                    i19 = i2;
                    break;
                case 91955931:
                case 1103513410:
                    try {
                        i22 = i22;
                        try {
                            zM55683 = C0873.m55682(string, C0906.m55810(f81823, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 33, i23));
                            iM55682 = (C0946.m55979("ۤܿ") ^ i17) * 115;
                            i12 = ((iM55682 ^ i18) * (-743)) ^ (-1164107350);
                            i15 = -1996808424;
                            i16 = iM55682 ^ i15;
                            i7 = i22;
                            i20 = i16;
                            i19 = i12;
                            i22 = i7;
                        } catch (Throwable th18) {
                            th = th18;
                            th2 = th;
                            i21 = i21;
                            z3 = z3;
                            enumC31610 = enumC31610;
                            int iM556816 = (C0873.m55680("᩹ۙ") + i18) * 5;
                            enumC31610 = enumC31610;
                            c9957 = c9957;
                            i19 = ((iM556816 ^ i17) * (-14943)) ^ 1625096750;
                            z3 = z3;
                            obj2 = obj2;
                            i22 = i22;
                            i20 = iM556816 ^ (-696873423);
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
                    c4184.f9215 = z2;
                    c4184.f9214 = z2;
                    c4184.f9213 = z2;
                    return;
                case 317700447:
                case 1166749961:
                    c4184.f9214 = z5;
                    return;
                case 468989642:
                case 1134407251:
                    i22 = i22;
                    if (zHasNext) {
                        iM55682 = (C0946.m55979("ۡܿ") ^ i18) * 115;
                        i12 = ((iM55682 ^ i17) * (-6477)) ^ (-147763920);
                        i15 = 156457334;
                        i16 = iM55682 ^ i15;
                        i7 = i22;
                        i20 = i16;
                        i19 = i12;
                        i22 = i7;
                    }
                    enumC3167M56210 = enumC3167M56210;
                    c9956 = c9957;
                    iM55681 = (C0873.m55680("᩷ۡ") + i18) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i12 = ((iM55681 ^ i17) * 11421) ^ (-2036746935);
                    i13 = -385057350;
                    i16 = iM55681 ^ i13;
                    c9957 = c9956;
                    enumC3167M56210 = enumC3167M56210;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case 688574706:
                case 911351573:
                    enumC3167 = enumC3167M56210;
                    i = i22;
                    z5 = z5;
                    obj = obj2;
                    c9952 = c9957;
                    enumC3168 = enumC31610;
                    th = th2;
                    c4184.f9213 = z3;
                    if (Build.VERSION.SDK_INT >= i21) {
                        z = z2;
                        int iM559719 = C0946.m55979("᩺ۜ") ^ i17;
                        i2 = ((iM559719 ^ i18) * (-2453)) ^ (-190202533);
                        th2 = th;
                        obj2 = obj;
                        enumC31610 = enumC3168;
                        i22 = i;
                        i20 = iM559719 ^ (-841802893);
                        c9957 = c9952;
                        i21 = i21;
                        enumC3167M56210 = enumC3167;
                        z5 = z;
                        i19 = i2;
                    } else {
                        int iM556817 = (i17 - C0873.m55680("ۤܰ")) * (-97);
                        th2 = th;
                        obj2 = obj;
                        enumC31610 = enumC3168;
                        i22 = i;
                        i20 = iM556817 ^ (-982429397);
                        i19 = ((iM556817 ^ i18) * 16181) ^ 663279031;
                        c9957 = c9952;
                        i21 = i21;
                        enumC3167M56210 = enumC3167;
                        z5 = z5;
                    }
                    break;
                case 818749899:
                case 1944208684:
                    i22 = i22;
                    zM55682 = C0873.m55682(string, C1028.m56235(f81823, 74, 32, i23));
                    iM55682 = (i18 - C0873.m55680("ۧ֡")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i12 = ((iM55682 ^ i17) * (-32603)) ^ (-854398442);
                    i15 = 1642860977;
                    i16 = iM55682 ^ i15;
                    i7 = i22;
                    i20 = i16;
                    i19 = i12;
                    i22 = i7;
                    break;
                case 875929004:
                case 1643242080:
                    z4 = true;
                    iM55680 = (C0873.m55680("᩵᩷") + i18) * 99;
                    i2 = ((iM55680 ^ i17) * (-21315)) ^ (-1430556590);
                    i4 = 1512309265;
                    i20 = iM55680 ^ i4;
                    i19 = i2;
                    break;
                case 890788911:
                case 1408926668:
                    try {
                        c4184.f9214 = z4;
                        iM55680 = (C0946.m55979("ۨܰ") + i18) * 3;
                        i2 = ((iM55680 ^ i17) * (-16621)) ^ 429545305;
                        i4 = 2034328805;
                        i20 = iM55680 ^ i4;
                        i19 = i2;
                    } catch (Throwable th20) {
                        th2 = th20;
                        i22 = i22;
                        i21 = i21;
                        z3 = z3;
                        enumC31610 = enumC31610;
                        int iM556818 = (C0873.m55680("᩹ۙ") + i18) * 5;
                        enumC31610 = enumC31610;
                        c9957 = c9957;
                        i19 = ((iM556818 ^ i17) * (-14943)) ^ 1625096750;
                        z3 = z3;
                        obj2 = obj2;
                        i22 = i22;
                        i20 = iM556818 ^ (-696873423);
                        i21 = i21;
                        z5 = z5;
                    }
                    break;
                case 1098878424:
                case 1401496679:
                    enumC3167M56210 = enumC3167M56210;
                    i22 = i22;
                    if (!zM55647) {
                        c9955 = c9957;
                        enumC31610 = enumC31610;
                        iM559710 = (i18 - C0946.m55979("ۤ᩺")) * (-113);
                        i8 = ((iM559710 ^ i17) * (-14153)) ^ 1051095849;
                        i9 = -833373412;
                        int i216 = iM559710 ^ i9;
                        i22 = i22;
                        i20 = i216;
                        i19 = i8;
                        enumC31610 = enumC31610;
                        c9957 = c9955;
                        enumC3167M56210 = enumC3167M56210;
                    } else {
                        iM559711 = C0873.m55680("۠ۧ") ^ i18;
                        i10 = ((iM559711 ^ i17) * (-6943)) ^ (-422836209);
                        i14 = -43297595;
                        i11 = iM559711 ^ i14;
                        i22 = i22;
                        i20 = i11;
                        i19 = i10;
                        enumC3167M56210 = enumC3167M56210;
                    }
                    break;
                case 1413704486:
                case 1498585400:
                    C9952 c99521 = c9957;
                    enumC31610 = enumC31610;
                    th2 = th2;
                    c9953 = c99521;
                    i21 = 33;
                    z3 = true;
                    int iM559720 = C0946.m55979("֫ۜ") ^ i17;
                    obj2 = obj2;
                    z5 = z5;
                    i22 = i22;
                    i20 = iM559720 ^ 626212637;
                    i19 = ((iM559720 ^ i18) * (-30297)) ^ (-1956276135);
                    enumC3167M56210 = enumC3167M56210;
                    C9952 c995112 = c9953;
                    th2 = th2;
                    enumC31610 = enumC31610;
                    c9957 = c995112;
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
    
        if (p067l.RunnableC0897.f81856 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0105, code lost:
    
        if (p067l.C1046.f81962 <= 0) goto L22;
     */
    @Override // p067l.InterfaceC24105
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo3414() throws Throwable {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        boolean z;
        int i5 = C0866.f81837;
        int i6 = C0845.f81821;
        int iM55681 = (i6 - C0873.m55680("֡֫")) * 79;
        int i7 = ((iM55681 ^ i5) * 20087) ^ (-493419361);
        Iterator itM56308 = null;
        C9952 c9952 = null;
        Iterator itM56399 = null;
        short[] sArr = null;
        int i8 = iM55681 ^ (-1936833412);
        int i9 = 0;
        boolean zM55647 = false;
        boolean zM55949 = false;
        boolean zM55886 = false;
        boolean zM55806 = false;
        boolean z2 = false;
        char c = 0;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1827351764;
        C19561 c19561 = null;
        Object obj = null;
        Throwable th = null;
        boolean z3 = false;
        while (true) {
            i14 = i8 ^ (i7 & (((i14 ^ i5) * (-27037)) >> 31));
            switch (i14) {
                case -2028482174:
                case -993643347:
                    zM55806 = zM55806;
                    z2 = z2;
                    if (zM55949) {
                        iM55680 = (C0873.m55680("ܰۨ") ^ i5) * 43;
                        i3 = ((iM55680 ^ i6) * 18943) ^ (-1808265103);
                        i4 = -1253397547;
                    } else {
                        iM55680 = (C0873.m55680("᩺ᩳ") ^ i5) * 47;
                        i3 = ((iM55680 ^ i6) * (-23371)) ^ (-1103961789);
                        i4 = 1701073952;
                    }
                    int i15 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i15;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case -1972976939:
                case -253986236:
                    C0937.m55918();
                    return false;
                case -1943391683:
                case -1842687262:
                    try {
                        C1124.m56366(c19561);
                        iM55979 = (i5 - C0873.m55680("۠ܳ")) * (-45);
                        i = ((iM55979 ^ i6) * (-2019)) ^ 164221179;
                        i2 = -550852301;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } catch (Throwable unused) {
                        zM55806 = zM55806;
                        z2 = z2;
                        iM55680 = (C0873.m55680("᩺ܿ") + i6) * (-109);
                        i3 = ((iM55680 ^ i5) * (-27949)) ^ (-1581859138);
                        i4 = 1601539076;
                        int i16 = iM55680 ^ i4;
                        z2 = z2;
                        z = zM55806;
                        i8 = i16;
                        i7 = i3;
                        zM55806 = z;
                    }
                    break;
                case -1935053003:
                case 662825489:
                    RunnableC0938.m55938();
                    if (C0937.f81884) {
                        iM55979 = (C0946.m55979("᩸ۗ") + i5) * 11;
                        i = ((iM55979 ^ i6) * (-25823)) ^ 88553060;
                        i2 = -27336314;
                    } else {
                        iM55979 = (C0946.m55979("᩶ᩳ") + i5) * (-67);
                        i = ((iM55979 ^ i6) * 5989) ^ (-175778668);
                        i2 = -1018872452;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -1930302300:
                case -1095521010:
                    i9 = 37320;
                    iM55680 = C0873.m55680("֫ۙ") ^ i6;
                    i3 = ((iM55680 ^ i5) * 12709) ^ 243756239;
                    i4 = 87555578;
                    int i17 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i17;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case -1926794412:
                case -1820265082:
                    zM55806 = zM55806;
                    z2 = z2;
                    zM55647 = C0866.m55647(itM56308);
                    iM55680 = C0873.m55680("ܳ۠") ^ i6;
                    i3 = ((iM55680 ^ i5) * (-30941)) ^ 2035136056;
                    i4 = 716439534;
                    int i18 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i18;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case -1895143232:
                case -282309450:
                    zM55806 = zM55806;
                    z2 = z2;
                    C9952 c9953 = (C9952) RunnableC0897.m55785(itM56308);
                    try {
                        zM55949 = ViewOnClickListenerC0939.m55949(C1024.m56215(c9953), C1017.m56189(f81823, 178, 53, i9));
                        int iM559710 = C0946.m55979("ܳᩴ") ^ i6;
                        z2 = z2;
                        z = zM55806;
                        i8 = iM559710 ^ 946065479;
                        i7 = ((iM559710 ^ i5) * 22975) ^ 375626232;
                        c9952 = c9953;
                    } catch (Throwable th2) {
                        th = th2;
                        c9952 = c9953;
                        iM55680 = C0873.m55680("ܺ᩶") ^ i5;
                        i3 = ((iM55680 ^ i6) * (-16149)) ^ 2090434642;
                        i4 = 1824242974;
                        int i19 = iM55680 ^ i4;
                        z2 = z2;
                        z = zM55806;
                        i8 = i19;
                        i7 = i3;
                    }
                    zM55806 = z;
                    break;
                case -1800541081:
                case 533172307:
                    zM55806 = zM55806;
                    z2 = z2;
                    s = sArr[c];
                    if (C0949.m56012()) {
                        iM55680 = (i5 - C0873.m55680("᩺ۚ")) * (-39);
                        i3 = ((iM55680 ^ i6) * (-19727)) ^ 202229892;
                        i4 = 630853882;
                    } else {
                        iM55680 = (C0873.m55680("ᩴۧ") ^ i6) * 45;
                        i3 = ((iM55680 ^ i5) * 11063) ^ 742619117;
                        i4 = 1190352695;
                    }
                    int i110 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i110;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case -1793439380:
                case 1910519849:
                    if (!C1929.m56553()) {
                        iM55979 = (C0946.m55979("᩶ᩳ") + i5) * (-67);
                        i = ((iM55979 ^ i6) * 5989) ^ (-175778668);
                        i2 = -1018872452;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        zM55806 = zM55806;
                        z2 = z2;
                        iM55680 = (C0873.m55680("֡᩵") + i6) * (-49);
                        i3 = ((iM55680 ^ i5) * (-26739)) ^ (-403637541);
                        i4 = 1424136117;
                        int i111 = iM55680 ^ i4;
                        z2 = z2;
                        z = zM55806;
                        i8 = i111;
                        i7 = i3;
                        zM55806 = z;
                    }
                    break;
                case -1663065601:
                case -703200088:
                    zM55806 = zM55806;
                    z2 = z2;
                    if (zM55647) {
                        iM55680 = (C0946.m55979("ۙۡ") + i5) * 75;
                        i3 = ((iM55680 ^ i6) * (-22587)) ^ (-301947412);
                        i4 = -795865255;
                    } else {
                        iM55680 = (C0873.m55680("ᩴۜ") ^ i6) * 73;
                        i3 = ((iM55680 ^ i5) * 24559) ^ (-720672519);
                        i4 = 1269127704;
                    }
                    int i112 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i112;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case -1589755017:
                case -1143757174:
                    zM55806 = zM55806;
                    z2 = z2;
                    try {
                        C19561 c19562 = new C19561(C7050.m16201(C1964.m56584(f81823, 140, 27, i9)).applicationInfo.sourceDir);
                        try {
                            itM56308 = C1048.m56308((AbstractC20050) C0861.m55614(C0854.m55608(C1003.m56127(c19562, c19562.m44470(C1404.m56462(f81823, 167, 11, i9)), null))));
                            c19561 = c19562;
                            iM55680 = (C0873.m55680("᩺ᩳ") ^ i5) * 47;
                            i3 = ((iM55680 ^ i6) * (-23371)) ^ (-1103961789);
                            i4 = 1701073952;
                        } catch (Throwable th3) {
                            th = th3;
                            c19561 = c19562;
                            iM55680 = C0873.m55680("ܺ᩶") ^ i5;
                            i3 = ((iM55680 ^ i6) * (-16149)) ^ 2090434642;
                            i4 = 1824242974;
                        }
                    } catch (Throwable unused2) {
                        c19561 = null;
                        iM55680 = (C0873.m55680("᩺ܿ") + i6) * (-109);
                        i3 = ((iM55680 ^ i5) * (-27949)) ^ (-1581859138);
                        i4 = 1601539076;
                    }
                    int i113 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i113;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case -1569897129:
                case 751609310:
                    zM55806 = zM55806;
                    z2 = z2;
                    if (zM55886) {
                        iM55680 = C0873.m55680("ᩳ֡") ^ i5;
                        i3 = ((iM55680 ^ i6) * 10401) ^ (-2007263051);
                        i4 = -650643894;
                    } else {
                        iM55680 = C0873.m55680("᩻ܳ") ^ i6;
                        i3 = ((iM55680 ^ i5) * (-17665)) ^ (-1598608431);
                        i4 = -1334070315;
                    }
                    int i114 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i114;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case -1559140809:
                case -140295020:
                    zM55806 = zM55806;
                    z2 = z2;
                    int i20 = i12 + i13;
                    if ((i20 + i20) - i11 >= 0) {
                        iM55680 = (C0946.m55979("ۚۙ") + i6) * (-45);
                        i3 = ((iM55680 ^ i5) * 12041) ^ (-34530499);
                        i4 = -1321182777;
                    } else {
                        iM55680 = C0946.m55979("ᩴܺ") ^ i5;
                        i3 = ((iM55680 ^ i6) * 3975) ^ (-1095980856);
                        i4 = 1406239201;
                    }
                    int i115 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i115;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case -1554505200:
                case -1121524321:
                    zM55806 = zM55806;
                    z2 = z2;
                    throw th;
                case -1538741183:
                case 898538559:
                    z2 = false;
                    iM55979 = C0873.m55680("ۜܽ") ^ i6;
                    i = ((iM55979 ^ i5) * 9733) ^ (-1256650350);
                    i2 = 1888482455;
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
                case -1506469889:
                case 1537727676:
                    C0949.m56012();
                    if (C1025.f81947 < 0) {
                        zM55806 = zM55806;
                        z2 = z2;
                        iM55680 = C0946.m55979("ۙۙ") ^ i6;
                        i3 = ((iM55680 ^ i5) * (-6159)) ^ (-2101400706);
                        i4 = -8546823;
                        int i116 = iM55680 ^ i4;
                        z2 = z2;
                        z = zM55806;
                        i8 = i116;
                        i7 = i3;
                        zM55806 = z;
                    }
                    zM55806 = zM55806;
                    z2 = z2;
                    iM55680 = C0946.m55979("֫ۡ") ^ i6;
                    i3 = ((iM55680 ^ i5) * (-14809)) ^ (-546188148);
                    i4 = 136176226;
                    int i117 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i117;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case -1364756066:
                case -1179351843:
                    zM55806 = zM55806;
                    z2 = z2;
                    if (C1012.m56134() <= 0) {
                        iM55680 = C0946.m55979("֫ۡ") ^ i6;
                        i3 = ((iM55680 ^ i5) * (-14809)) ^ (-546188148);
                        i4 = 136176226;
                    } else {
                        iM55680 = C0873.m55680("ۢܺ") ^ i6;
                        i3 = ((iM55680 ^ i5) * 11409) ^ 1905644293;
                        i4 = -2007491581;
                    }
                    int i118 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i118;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case -1326117409:
                case -1155542228:
                    zM55806 = zM55806;
                    z2 = z2;
                    C0877.m55706(th, obj);
                    iM55680 = (C0946.m55979("۫ܿ") + i6) * (-29);
                    i3 = ((iM55680 ^ i5) * 29087) ^ (-74437075);
                    i4 = -602639230;
                    int i119 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i119;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case -1281879711:
                case 1062615951:
                    zM55806 = zM55806;
                    z2 = z2;
                    try {
                        C1124.m56366(c19561);
                        iM55680 = (C0946.m55979("۫ܿ") + i6) * (-29);
                        i3 = ((iM55680 ^ i5) * 29087) ^ (-74437075);
                        i4 = -602639230;
                        int i1110 = iM55680 ^ i4;
                        z2 = z2;
                        z = zM55806;
                        i8 = i1110;
                        i7 = i3;
                        zM55806 = z;
                    } catch (Throwable th4) {
                        int iM559711 = C0946.m55979("ۨܳ") ^ i5;
                        int i21 = ((iM559711 ^ i6) * 28605) ^ (-1635593276);
                        int i22 = iM559711 ^ 1681676388;
                        z2 = z2;
                        obj = th4;
                        i7 = i21;
                        zM55806 = zM55806;
                        i8 = i22;
                    }
                    break;
                case -1097850892:
                case 102209991:
                    try {
                        z2 = z2;
                        try {
                            zM55806 = C0906.m55806(((C11964) C0955.m56035(itM56399)).getName(), C0930.m55893(f81823, 231, 35, i9));
                            int iM559712 = C0946.m55979("᩻ᩴ") ^ i5;
                            i8 = iM559712 ^ 326676162;
                            i7 = ((iM559712 ^ i6) * (-27531)) ^ (-1182092183);
                            z2 = z2;
                        } catch (Throwable th5) {
                            th = th5;
                            th = th;
                            iM55680 = C0873.m55680("ܺ᩶") ^ i5;
                            i3 = ((iM55680 ^ i6) * (-16149)) ^ 2090434642;
                            i4 = 1824242974;
                            int i1111 = iM55680 ^ i4;
                            z2 = z2;
                            z = zM55806;
                            i8 = i1111;
                            i7 = i3;
                            zM55806 = z;
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
                    C0989.m56095();
                    zM55806 = zM55806;
                    z2 = z2;
                    iM55680 = (C0873.m55680("֡᩵") + i6) * (-49);
                    i3 = ((iM55680 ^ i5) * (-26739)) ^ (-403637541);
                    i4 = 1424136117;
                    int i1112 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i1112;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case -1006356030:
                case 781861503:
                    zM55806 = zM55806;
                    z2 = z2;
                    i13 = 45185284;
                    if (C1229.m56410() != 0) {
                        iM55680 = (C0873.m55680("֡ܺ") + i6) * 43;
                        i3 = ((iM55680 ^ i5) * (-16105)) ^ (-623778311);
                        i4 = 1592517993;
                    } else {
                        iM55680 = C0873.m55680("ۜ᩶") ^ i5;
                        i3 = ((iM55680 ^ i6) * 31063) ^ (-488719491);
                        i4 = 2083708718;
                    }
                    int i1113 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i1113;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case -866601064:
                case 1807854644:
                    if (!zM55806) {
                        iM55680 = (C0873.m55680("֡ۘ") + i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i3 = ((iM55680 ^ i6) * 23671) ^ 727376942;
                        i4 = -1042878781;
                        int i1114 = iM55680 ^ i4;
                        z2 = z2;
                        z = zM55806;
                        i8 = i1114;
                        i7 = i3;
                        zM55806 = z;
                    } else {
                        iM55979 = (C0946.m55979("۠ܿ") ^ i5) * 71;
                        i = ((iM55979 ^ i6) * 4193) ^ (-473796591);
                        i2 = -682245189;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    }
                    break;
                case -856379132:
                case 64508818:
                    if (!C0892.f81851) {
                        zM55806 = zM55806;
                        z2 = z2;
                        iM55680 = C0946.m55979("᩶۫") ^ i5;
                        i3 = ((iM55680 ^ i6) * 7541) ^ 1099854397;
                        i4 = 521035992;
                        int i1115 = iM55680 ^ i4;
                        z2 = z2;
                        z = zM55806;
                        i8 = i1115;
                        i7 = i3;
                        zM55806 = z;
                    }
                    zM55806 = zM55806;
                    z2 = z2;
                    iM55680 = C0873.m55680("ۧ۫") ^ i5;
                    i3 = ((iM55680 ^ i6) * 24927) ^ (-1155346244);
                    i4 = -1961817411;
                    int i1116 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i1116;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case -810181700:
                case -784585453:
                    itM56399 = C1229.m56399(c9952.m23267(z3));
                    iM55680 = (C0873.m55680("֡ۘ") + i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i3 = ((iM55680 ^ i6) * 23671) ^ 727376942;
                    i4 = -1042878781;
                    int i1117 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i1117;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case -786732244:
                case 207664583:
                    zM55806 = zM55806;
                    z2 = z2;
                    i11 = i10 * i10;
                    i12 = s * s;
                    if (C1404.f82149 >= 0) {
                        iM55680 = C0946.m55979("ۙۙ") ^ i6;
                        i3 = ((iM55680 ^ i5) * (-6159)) ^ (-2101400706);
                        i4 = -8546823;
                    } else {
                        iM55680 = (C0946.m55979("ۘۖ") + i6) * (-119);
                        i3 = ((iM55680 ^ i5) * 30653) ^ (-634633);
                        i4 = 1256042451;
                    }
                    int i1118 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i1118;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case -698356480:
                case 984604385:
                    zM55806 = zM55806;
                    z2 = z2;
                    zM55886 = C0930.m55886(itM56399);
                    iM55680 = (C0873.m55680("ܽܺ") + i6) * (-119);
                    i3 = ((iM55680 ^ i5) * 3459) ^ (-1530663032);
                    i4 = -1575019018;
                    int i1119 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i1119;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case -338607230:
                case 972851790:
                    zM55806 = zM55806;
                    z2 = z2;
                    c = 139;
                    if (C0854.m55595() >= 0) {
                        iM55680 = C0873.m55680("ۧ۫") ^ i5;
                        i3 = ((iM55680 ^ i6) * 24927) ^ (-1155346244);
                        i4 = -1961817411;
                    } else {
                        iM55680 = (C0946.m55979("ܿܺ") ^ i5) * 25;
                        i3 = ((iM55680 ^ i6) * (-2567)) ^ (-2012768625);
                        i4 = -709112245;
                    }
                    int i11110 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i11110;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case -189249089:
                case -3801631:
                    C1404.m56468();
                    break;
                case -107850177:
                case 1266764910:
                    zM55806 = zM55806;
                    z2 = z2;
                    z3 = true;
                    iM55680 = (C0946.m55979("ۧܳ") + i5) * 37;
                    i3 = ((iM55680 ^ i6) * (-2081)) ^ (-1591504259);
                    i4 = -519756100;
                    int i11111 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i11111;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case -4773225:
                case 433730851:
                    return z2;
                case 279431625:
                case 1761009328:
                    if (C0949.f81897 < 0) {
                        zM55806 = zM55806;
                        z2 = z2;
                        iM55680 = (C0873.m55680("֡ܺ") + i6) * 43;
                        i3 = ((iM55680 ^ i5) * (-16105)) ^ (-623778311);
                        i4 = 1592517993;
                        int i11112 = iM55680 ^ i4;
                        z2 = z2;
                        z = zM55806;
                        i8 = i11112;
                        i7 = i3;
                        zM55806 = z;
                    } else {
                        iM55979 = (C0873.m55680("ۛ᩸") + i6) * (-119);
                        i = ((iM55979 ^ i5) * (-19349)) ^ (-254157988);
                        i2 = -13602143;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    }
                    break;
                case 286202329:
                case 462471291:
                    zM55806 = zM55806;
                    z2 = z2;
                    if (C1929.f83011 != 0) {
                        iM55680 = C0946.m55979("᩶۫") ^ i5;
                        i3 = ((iM55680 ^ i6) * 7541) ^ 1099854397;
                        i4 = 521035992;
                    } else {
                        iM55680 = (i6 - C0946.m55979("ܺۤ")) * (-75);
                        i3 = ((iM55680 ^ i5) * 14531) ^ 1230610062;
                        i4 = 271929879;
                    }
                    int i11113 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i11113;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case 388605451:
                case 858731164:
                    return z3;
                case 447765519:
                case 801614959:
                    zM55806 = zM55806;
                    z2 = z2;
                    int i23 = s + 6722;
                    if (C0873.f81841 <= 0) {
                        i10 = i23;
                        iM55680 = (i5 - C0873.m55680("᩺ۚ")) * (-39);
                        i3 = ((iM55680 ^ i6) * (-19727)) ^ 202229892;
                        i4 = 630853882;
                        int i11114 = iM55680 ^ i4;
                        z2 = z2;
                        z = zM55806;
                        i8 = i11114;
                        i7 = i3;
                    } else {
                        int iM55682 = C0873.m55680("۬ۤ") ^ i5;
                        i10 = i23;
                        i7 = ((iM55682 ^ i6) * 8631) ^ 1676300987;
                        z2 = z2;
                        z = zM55806;
                        i8 = iM55682 ^ (-750567748);
                    }
                    zM55806 = z;
                    break;
                case 606491282:
                case 1086592867:
                    zM55806 = zM55806;
                    z2 = z2;
                    C1124.m56366(c19561);
                    iM55680 = (C0873.m55680("᩺ܿ") + i6) * (-109);
                    i3 = ((iM55680 ^ i5) * (-27949)) ^ (-1581859138);
                    i4 = 1601539076;
                    int i11115 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i11115;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case 663950969:
                case 1950914529:
                    i9 = 27058;
                    iM55680 = C0873.m55680("֫ۙ") ^ i6;
                    i3 = ((iM55680 ^ i5) * 12709) ^ 243756239;
                    i4 = 87555578;
                    int i11116 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i11116;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case 668679315:
                case 693027094:
                    zM55806 = zM55806;
                    z2 = z2;
                    if (RunnableC0897.f81856) {
                        iM55680 = C0873.m55680("֨ۨ") ^ i6;
                        i3 = ((iM55680 ^ i5) * 28675) ^ 1851492955;
                        i4 = 1158754262;
                    } else {
                        iM55680 = C0946.m55979("ۙۙ") ^ i6;
                        i3 = ((iM55680 ^ i5) * (-6159)) ^ (-2101400706);
                        i4 = -8546823;
                    }
                    int i11117 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i11117;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case 825332933:
                case 2122190469:
                    C0863.m55643();
                    if (C1929.f83011 == 0) {
                        iM55979 = (C0873.m55680("ۛ᩸") + i6) * (-119);
                        i = ((iM55979 ^ i5) * (-19349)) ^ (-254157988);
                        i2 = -13602143;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        zM55806 = zM55806;
                        z2 = z2;
                        iM55680 = C0873.m55680("ۧ۫") ^ i5;
                        i3 = ((iM55680 ^ i6) * 24927) ^ (-1155346244);
                        i4 = -1961817411;
                        int i11118 = iM55680 ^ i4;
                        z2 = z2;
                        z = zM55806;
                        i8 = i11118;
                        i7 = i3;
                        zM55806 = z;
                    }
                    break;
                case 852165123:
                case 858027252:
                    return z3;
                case 1144762885:
                case 1962794448:
                    zM55806 = zM55806;
                    z2 = z2;
                    if (C0854.m55595() >= 0) {
                        iM55680 = (C0873.m55680("֡᩵") + i6) * (-49);
                        i3 = ((iM55680 ^ i5) * (-26739)) ^ (-403637541);
                        i4 = 1424136117;
                    } else {
                        iM55680 = C0873.m55680("ۜ۫") ^ i5;
                        i3 = ((iM55680 ^ i6) * (-28015)) ^ 1201514261;
                        i4 = -994882057;
                    }
                    int i11119 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i11119;
                    i7 = i3;
                    zM55806 = z;
                    break;
                case 1313844408:
                case 2050110803:
                    zM55806 = zM55806;
                    z2 = z2;
                    sArr = f81823;
                    if (C0861.f81831) {
                        iM55680 = (i5 - C0873.m55680("᩺ۗ")) * 3;
                        i3 = ((iM55680 ^ i6) * 23907) ^ 1892754510;
                        i4 = -1272017372;
                    } else {
                        iM55680 = C0946.m55979("ۙۙ") ^ i6;
                        i3 = ((iM55680 ^ i5) * (-6159)) ^ (-2101400706);
                        i4 = -8546823;
                    }
                    int i111110 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i111110;
                    i7 = i3;
                    zM55806 = z;
                    break;
                default:
                    zM55806 = zM55806;
                    z2 = z2;
                    try {
                        C0967.m56075(c19561);
                        iM55680 = C0873.m55680("᩺֡") ^ i6;
                        i3 = ((iM55680 ^ i5) * (-22079)) ^ 1243992056;
                        i4 = -342916825;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        iM55680 = (C0873.m55680("᩺ܿ") + i6) * (-109);
                        i3 = ((iM55680 ^ i5) * (-27949)) ^ (-1581859138);
                        i4 = 1601539076;
                    }
                    int i111111 = iM55680 ^ i4;
                    z2 = z2;
                    z = zM55806;
                    i8 = i111111;
                    i7 = i3;
                    zM55806 = z;
                    break;
            }
        }
    }
}
