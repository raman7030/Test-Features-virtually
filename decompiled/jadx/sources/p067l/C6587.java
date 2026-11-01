package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۙۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1R6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6587 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۬ۜ᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f81971 = {5614, 16853, 28632, -19648, -21454, 22660, 16506, 19891, 18792, 19060, 24569, 17915, 16747, 19081, -16735, 24707, 1169, 16807, -19337, -17381};

    /* JADX INFO: renamed from: ܳ */
    public String f17009;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ViewOnClickListenerC7928 f17010;

    public C6587(ViewOnClickListenerC7928 viewOnClickListenerC7928) {
        this.f17010 = viewOnClickListenerC7928;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0233 A[PHI: r3 r6 r7
      0x0233: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:70:0x0231, B:58:0x01aa, B:54:0x018a, B:12:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:70:0x0231, B:58:0x01aa, B:54:0x018a, B:12:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r7v4 short) = (r7v2 short), (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:70:0x0231, B:58:0x01aa, B:54:0x018a, B:12:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (p067l.C0917.f81868 != false) goto L11;
     */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3405() throws C3924 {
        int iM55979;
        int i;
        int i2;
        C25065 c25065M44754 = null;
        int iM56586 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = -754899076;
        int i7 = C1229.f82066;
        int i8 = C0967.f81910;
        int iM559710 = (i8 - C0946.m55979("۬ܽ")) * 93;
        int i9 = ((iM559710 ^ i7) * 1963) ^ (-84663920);
        int i10 = -1803062448;
        while (true) {
            int i11 = iM559710 ^ i10;
            while (true) {
                i6 = ((((i6 ^ i7) * 32245) >> 31) & i9) ^ i11;
                switch (i6) {
                    case -2000406597:
                    case -1556657223:
                        short[] sArr2 = f81971;
                        if (!RunnableC0897.m55784()) {
                            String strM55592 = C0845.m55592(sArr2, 17, 3, i5);
                            if (C0949.f81897 < 0) {
                                int iM55680 = C0873.m55680(strM55592) ^ 2126762162;
                                if (C0866.f81837 < 0) {
                                    throw new C3924(AbstractC0942.m55960(c25065M44754, iM55680));
                                }
                            }
                            iM55979 = (C0873.m55680("ۖܽ") + i7) * 89;
                            i = ((iM55979 ^ i8) * (-11229)) ^ 527169940;
                            i2 = 969827695;
                            i11 = iM55979 ^ i2;
                            i9 = i;
                        } else {
                            iM55979 = (C0946.m55979("ᩴۛ") + i7) * 115;
                            i = ((iM55979 ^ i8) * (-23299)) ^ 901865849;
                            i2 = 1362899829;
                            i11 = iM55979 ^ i2;
                            i9 = i;
                        }
                        break;
                    case -1963828417:
                    case -428416768:
                        iM56586 = C1964.m56586(c25065M44754);
                        if (iM56586 != 1) {
                            iM55979 = (C0873.m55680("ۢ۟") ^ i8) * (-103);
                            i = ((iM55979 ^ i7) * (-717)) ^ 415483858;
                            i2 = 230525070;
                        } else {
                            iM55979 = C0873.m55680("ۤ֡") ^ i7;
                            i = ((iM55979 ^ i8) * (-16069)) ^ (-1576854486);
                            i2 = -1472300249;
                        }
                        i11 = iM55979 ^ i2;
                        i9 = i;
                        break;
                    case -1583339553:
                    case -1012508256:
                        C1028.m56247();
                        if (C1044.f81959 >= 0) {
                            iM55979 = (C0873.m55680("᩸ܺ") ^ i7) * (-13);
                            i = ((iM55979 ^ i8) * 325) ^ 1304778043;
                            i2 = -243963706;
                            i11 = iM55979 ^ i2;
                            i9 = i;
                        }
                        iM55979 = C0873.m55680("ۢ᩷") ^ i8;
                        i = ((iM55979 ^ i7) * 8549) ^ 1899923598;
                        i2 = -568878921;
                        i11 = iM55979 ^ i2;
                        i9 = i;
                        break;
                    case -1529855238:
                    case 1175323533:
                        i4 = i3 + 1;
                        if (C1036.f81953 >= 0) {
                            iM55979 = (C0873.m55680("᩸ܺ") ^ i7) * (-13);
                            i = ((iM55979 ^ i8) * 325) ^ 1304778043;
                            i2 = -243963706;
                        } else {
                            iM55979 = (C0873.m55680("ܺۖ") + i7) * 59;
                            i = ((iM55979 ^ i8) * 21687) ^ 1792355302;
                            i2 = -712810401;
                        }
                        i11 = iM55979 ^ i2;
                        i9 = i;
                        break;
                    case -1463999610:
                    case 708097661:
                        i3 = s * 2;
                        if (C0906.f81862 >= 0) {
                            iM55979 = (C0946.m55979("ᩴۛ") + i7) * 115;
                            i = ((iM55979 ^ i8) * (-23299)) ^ 901865849;
                            i2 = 1362899829;
                        } else {
                            iM55979 = (i8 - C0873.m55680("۫ۨ")) * 77;
                            i = ((iM55979 ^ i7) * (-16195)) ^ 1011731627;
                            i2 = -1533153615;
                        }
                        i11 = iM55979 ^ i2;
                        i9 = i;
                        break;
                    case -1436246515:
                    case 1875967811:
                        return;
                    case -1433888201:
                    case 1505955499:
                        int i12 = s + s2;
                        if ((i12 * i12) - i4 < 0) {
                            iM55979 = C0946.m55979("ۖܰ") ^ i7;
                            i = ((iM55979 ^ i8) * (-11501)) ^ 842320824;
                            i2 = -1745852105;
                        } else {
                            iM55979 = (C0873.m55680("ۖۙ") + i8) * (-11);
                            i = ((iM55979 ^ i7) * 26229) ^ 2053195131;
                            i2 = -126510228;
                        }
                        i11 = iM55979 ^ i2;
                        i9 = i;
                        break;
                    case -1009363545:
                    case 772489927:
                        sArr = f81971;
                        if (C0898.m55800() <= 0) {
                            iM55979 = (C0873.m55680("ۚ᩸") + i8) * 13;
                            i = ((iM55979 ^ i7) * (-17717)) ^ 1377836229;
                            i2 = -989044912;
                        } else {
                            iM55979 = (C0946.m55979("ᩴ֨") ^ i7) * (-11);
                            i = ((iM55979 ^ i8) * (-20807)) ^ 386269745;
                            i2 = 582785158;
                        }
                        i11 = iM55979 ^ i2;
                        i9 = i;
                        break;
                    case -916922969:
                    case -914668633:
                        c25065M44754 = C0955.m56033(4184).m44754();
                        if (C1024.f81946) {
                            iM55979 = (C0873.m55680("ۖܽ") + i7) * 89;
                            i = ((iM55979 ^ i8) * (-11229)) ^ 527169940;
                            i2 = 969827695;
                        } else {
                            iM55979 = C0946.m55979("ܳۜ") ^ i8;
                            i = ((iM55979 ^ i7) * 9737) ^ (-882465323);
                            i2 = 1842532189;
                        }
                        i11 = iM55979 ^ i2;
                        i9 = i;
                        break;
                    case -801781338:
                    case 1437843254:
                        C0937.m55918();
                        return;
                    case -765062438:
                    case 1533305488:
                        C1229.m56410();
                        break;
                    case -684602290:
                    case -368265477:
                        s2 = 1;
                        if (C1017.f81942 >= 0) {
                            iM55979 = (C0873.m55680("᩸ܺ") ^ i7) * (-13);
                            i = ((iM55979 ^ i8) * 325) ^ 1304778043;
                            i2 = -243963706;
                        } else {
                            iM55979 = (C0946.m55979("᩵֡") + i8) * (-125);
                            i = ((iM55979 ^ i7) * (-11195)) ^ (-659914465);
                            i2 = -1758070581;
                        }
                        i11 = iM55979 ^ i2;
                        i9 = i;
                        break;
                    case -582598321:
                    case -242718161:
                        break;
                    case -456219823:
                    case 1582734011:
                        C1017.m56187();
                        C0894.m55769();
                        iM55979 = C0873.m55680("ۢ᩷") ^ i8;
                        i = ((iM55979 ^ i7) * 8549) ^ 1899923598;
                        i2 = -568878921;
                        i11 = iM55979 ^ i2;
                        i9 = i;
                        break;
                    case -158855680:
                    case 127165807:
                        i5 = 13849;
                        iM55979 = (C0946.m55979("ܰ۟") ^ i7) * 7;
                        i = ((iM55979 ^ i8) * (-18169)) ^ (-494636972);
                        i2 = 348666879;
                        i11 = iM55979 ^ i2;
                        i9 = i;
                        break;
                    case -86089093:
                    case 2016983305:
                        c = 16;
                        if (C1017.f81942 >= 0) {
                            iM55979 = (C0873.m55680("᩸ܺ") ^ i7) * (-13);
                            i = ((iM55979 ^ i8) * 325) ^ 1304778043;
                            i2 = -243963706;
                        } else {
                            iM55979 = C0873.m55680("᩹֫") ^ i8;
                            i = ((iM55979 ^ i7) * 10625) ^ 1612116465;
                            i2 = -1323516499;
                        }
                        i11 = iM55979 ^ i2;
                        i9 = i;
                        break;
                    case 123862683:
                    case 985354155:
                        s = sArr[c];
                        if (C1964.f83032 <= 0) {
                            iM55979 = C0873.m55680("ۢ᩷") ^ i8;
                            i = ((iM55979 ^ i7) * 8549) ^ 1899923598;
                            i2 = -568878921;
                        } else {
                            iM55979 = (i7 - C0946.m55979("֨ۡ")) * (-77);
                            i = ((iM55979 ^ i8) * (-11395)) ^ (-1007361315);
                            i2 = -763995316;
                        }
                        i11 = iM55979 ^ i2;
                        i9 = i;
                        break;
                    case 432956765:
                    case 722826221:
                        this.f17009 = ViewOnClickListenerC0939.m55952(c25065M44754);
                        return;
                    case 637564778:
                    case 2123952505:
                        i5 = 10913;
                        iM55979 = (C0946.m55979("ܰ۟") ^ i7) * 7;
                        i = ((iM55979 ^ i8) * (-18169)) ^ (-494636972);
                        i2 = 348666879;
                        i11 = iM55979 ^ i2;
                        i9 = i;
                        break;
                    default:
                        if (C0912.m55833()) {
                            iM55979 = (C0873.m55680("ۚ᩸") + i8) * 13;
                            i = ((iM55979 ^ i7) * (-17717)) ^ 1377836229;
                            i2 = -989044912;
                            i11 = iM55979 ^ i2;
                            i9 = i;
                        }
                        iM55979 = C0873.m55680("ۢ᩷") ^ i8;
                        i = ((iM55979 ^ i7) * 8549) ^ 1899923598;
                        i2 = -568878921;
                        i11 = iM55979 ^ i2;
                        i9 = i;
                        break;
                }
            }
            if (iM56586 == 2) {
                iM559710 = C0873.m55680("ۗۧ") ^ i8;
                i9 = ((iM559710 ^ i7) * 26103) ^ 79477323;
                i10 = -462098969;
            } else {
                iM559710 = (C0873.m55680("֡ᩳ") + i7) * (-73);
                i9 = ((iM559710 ^ i8) * 23289) ^ (-267907183);
                i10 = -891664892;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0180 A[PHI: r8
      0x0180: PHI (r8v3 l.֡ۚۢ) = (r8v2 l.֡ۚۢ), (r8v5 l.֡ۚۢ) binds: [B:40:0x017e, B:24:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x01e7 A[PHI: r4 r5 r10
      0x01e7: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String) binds: [B:48:0x01e5, B:44:0x01bd, B:13:0x007c, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r5v4 java.lang.Object[]) = (r5v3 java.lang.Object[]), (r5v2 java.lang.Object[]), (r5v2 java.lang.Object[]), (r5v2 java.lang.Object[]) binds: [B:48:0x01e5, B:44:0x01bd, B:13:0x007c, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r10v5 java.lang.String) = (r10v2 java.lang.String), (r10v4 java.lang.String), (r10v2 java.lang.String), (r10v2 java.lang.String) binds: [B:48:0x01e5, B:44:0x01bd, B:13:0x007c, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0251 A[PHI: r2 r3 r6 r7 r12 r13 r14 r19 r20
      0x0251: PHI (r2v24 l.ۛۚۡ) = (r2v20 l.ۛۚۡ), (r2v2 l.ۛۚۡ), (r2v2 l.ۛۚۡ), (r2v2 l.ۛۚۡ) binds: [B:56:0x024f, B:32:0x012b, B:28:0x0103, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r3v6 l.᩵ۚۢ) = (r3v3 l.᩵ۚۢ), (r3v2 l.᩵ۚۢ), (r3v2 l.᩵ۚۢ), (r3v2 l.᩵ۚۢ) binds: [B:56:0x024f, B:32:0x012b, B:28:0x0103, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r6v5 int) = (r6v2 int), (r6v4 int), (r6v2 int), (r6v2 int) binds: [B:56:0x024f, B:32:0x012b, B:28:0x0103, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r7v4 java.lang.Object) = (r7v2 java.lang.Object), (r7v2 java.lang.Object), (r7v3 java.lang.Object), (r7v2 java.lang.Object) binds: [B:56:0x024f, B:32:0x012b, B:28:0x0103, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:56:0x024f, B:32:0x012b, B:28:0x0103, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:56:0x024f, B:32:0x012b, B:28:0x0103, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]) binds: [B:56:0x024f, B:32:0x012b, B:28:0x0103, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r19v12 short[]) = (r19v11 short[]), (r19v2 short[]), (r19v2 short[]), (r19v2 short[]) binds: [B:56:0x024f, B:32:0x012b, B:28:0x0103, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r20v7 int) = (r20v6 int), (r20v2 int), (r20v2 int), (r20v2 int) binds: [B:56:0x024f, B:32:0x012b, B:28:0x0103, B:9:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        int iM55680;
        int i;
        int iM55979;
        int i2;
        int iM55681;
        int i3;
        int i4;
        int iM559710;
        int i5;
        int i6;
        C6587 c6587 = this;
        int i7 = C1044.f81959;
        int i8 = C0898.f81858;
        int iM55682 = (C0873.m55680("֡ۨ") + i8) * (-113);
        int i9 = ((iM55682 ^ i7) * (-28709)) ^ (-889504635);
        Object[] objArr = null;
        DialogInterfaceC2564 dialogInterfaceC2564M55669 = null;
        String strM55921 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i10 = iM55682 ^ 1886011667;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        short s = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1672387083;
        int iM559711 = 0;
        String str = null;
        Object obj = null;
        String strM56180 = null;
        int iM55683 = 0;
        C20671 c20671M55654 = null;
        ViewOnClickListenerC7928 viewOnClickListenerC7928 = null;
        while (true) {
            i17 = i10 ^ (i9 & (((i17 ^ i7) * (-20643)) >> 31));
            switch (i17) {
                case -2057052014:
                case -519821402:
                    C0882.m55716(C0873.m55680(RunnableC1014.m56180(f81971, 13, 3, i13)) ^ 2130080686);
                    break;
                case -2036256013:
                case 144077237:
                    if (C1053.f81965 > 0) {
                        iM559710 = C0873.m55680("ᩴ᩸") ^ i7;
                        i5 = ((iM559710 ^ i8) * 4981) ^ 188365966;
                        i6 = -129335708;
                    } else {
                        iM559710 = C0873.m55680("ۢ᩷") ^ i8;
                        i5 = ((iM559710 ^ i7) * (-8765)) ^ 1897087746;
                        i6 = -1403061371;
                    }
                    i10 = iM559710 ^ i6;
                    i9 = i5;
                    break;
                case -1965066074:
                case 2001155507:
                    i13 = 31794;
                    iM55681 = C0873.m55680("ۖۙ") ^ i7;
                    i3 = ((iM55681 ^ i8) * 24399) ^ 1208661342;
                    i4 = 770359070;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    viewOnClickListenerC7928 = viewOnClickListenerC7928;
                    sArr = sArr;
                    break;
                case -1940607693:
                case 1966625183:
                    sArr = sArr;
                    viewOnClickListenerC7928 = viewOnClickListenerC7928;
                    int i18 = i14 + i15;
                    short s2 = s;
                    int i19 = s2 + 527;
                    if ((i19 * i19) - (i18 + i18) > 0) {
                        iM55979 = (i8 - C0946.m55979("ۛۜ")) * 87;
                        i9 = ((iM55979 ^ i7) * (-6623)) ^ 40213228;
                        i2 = -1814879566;
                    } else {
                        iM55979 = (i8 - C0946.m55979("᩷֡")) * (-11);
                        i9 = ((iM55979 ^ i7) * 4759) ^ (-393796017);
                        i2 = -303529457;
                    }
                    i10 = iM55979 ^ i2;
                    c6587 = this;
                    s = s2;
                    viewOnClickListenerC7928 = viewOnClickListenerC7928;
                    sArr = sArr;
                    break;
                case -1867988127:
                case -739443926:
                    C1124.m56363(c20671M55654, C0873.m55680(C1044.m56276(sArr2, i11, i12, i13)) ^ 2123263117, obj);
                    dialogInterfaceC2564M55669 = RunnableC0871.m55669(c20671M55654);
                    if (C1053.m56327() >= 0) {
                        iM559710 = (i8 - C0946.m55979("ۜ᩸")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM559710 ^ i7) * (-18015)) ^ 1932533604;
                        i6 = 1497698681;
                    } else {
                        iM559710 = (i8 - C0946.m55979("᩷ۧ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM559710 ^ i7) * (-17009)) ^ (-1390599984);
                        i6 = 1781113222;
                    }
                    i10 = iM559710 ^ i6;
                    i9 = i5;
                    break;
                case -1755515820:
                case -1064658987:
                    objArr[0] = str;
                    strM56180 = RunnableC1014.m56180(f81971, 4, 3, i13);
                    if (C0949.f81897 >= 0) {
                        iM559710 = C0873.m55680("ۢ᩷") ^ i8;
                        i5 = ((iM559710 ^ i7) * (-8765)) ^ 1897087746;
                        i6 = -1403061371;
                    } else {
                        iM559710 = C0873.m55680("ۚᩴ") ^ i8;
                        i5 = ((iM559710 ^ i7) * (-673)) ^ (-1689252553);
                        i6 = 1486017823;
                    }
                    i10 = iM559710 ^ i6;
                    i9 = i5;
                    break;
                case -1751327211:
                case 254993607:
                    C1012.m56146(c20671M55654, iM559711 ^ 2128556714);
                    str = c6587.f17009;
                    objArr = new Object[1];
                    if (C0877.f81843 >= 0) {
                        iM559710 = C0873.m55680("ۢ᩷") ^ i8;
                        i5 = ((iM559710 ^ i7) * (-8765)) ^ 1897087746;
                        i6 = -1403061371;
                    } else {
                        iM559710 = C0873.m55680("᩶ܰ") ^ i7;
                        i5 = ((iM559710 ^ i8) * (-31613)) ^ 494765759;
                        i6 = 1221770615;
                    }
                    i10 = iM559710 ^ i6;
                    i9 = i5;
                    break;
                case -1529212008:
                case 1589379733:
                    C1053.m56327();
                    C1124.m56367();
                    iM559710 = C0873.m55680("ᩴ᩸") ^ i7;
                    i5 = ((iM559710 ^ i8) * 4981) ^ 188365966;
                    i6 = -129335708;
                    i10 = iM559710 ^ i6;
                    i9 = i5;
                    break;
                case -1515097083:
                case 1068057414:
                    sArr = sArr;
                    viewOnClickListenerC7928 = viewOnClickListenerC7928;
                    if (c6587.f17009 == null) {
                        iM55681 = C0946.m55979("ۨ֫") ^ i8;
                        i3 = ((iM55681 ^ i7) * (-7791)) ^ (-2135899977);
                        i4 = -377422931;
                    } else {
                        iM55681 = (C0873.m55680("ۢܰ") ^ i7) * 75;
                        i3 = ((iM55681 ^ i8) * (-8433)) ^ 374794087;
                        i4 = 922249780;
                    }
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    viewOnClickListenerC7928 = viewOnClickListenerC7928;
                    sArr = sArr;
                    break;
                case -1503049651:
                case -726678293:
                    iM55683 = 2129807923 ^ C0873.m55680(strM55921);
                    if (C0898.m55800() <= 0) {
                        iM559710 = C0873.m55680("ۖۤ") ^ i7;
                        i5 = ((iM559710 ^ i8) * 32471) ^ 745080738;
                        i6 = -2006249062;
                    } else {
                        iM559710 = C0946.m55979("֨ܰ") ^ i7;
                        i5 = ((iM559710 ^ i8) * (-22555)) ^ 565711309;
                        i6 = 1674527764;
                    }
                    i10 = iM559710 ^ i6;
                    i9 = i5;
                    break;
                case -1078586034:
                case 1858667838:
                    C0947.m55996(C1229.m56405(dialogInterfaceC2564M55669), new ViewOnClickListenerC16838(2, c6587));
                    break;
                case -1013731771:
                case 1555281973:
                    if (C0861.m55626()) {
                        iM559710 = C0873.m55680("ۖۤ") ^ i7;
                        i5 = ((iM559710 ^ i8) * 32471) ^ 745080738;
                        i6 = -2006249062;
                    } else {
                        iM559710 = C0873.m55680("ۢ᩷") ^ i8;
                        i5 = ((iM559710 ^ i7) * (-8765)) ^ 1897087746;
                        i6 = -1403061371;
                    }
                    i10 = iM559710 ^ i6;
                    i9 = i5;
                    break;
                case -1004715514:
                case -154586937:
                    viewOnClickListenerC7928 = c6587.f17010;
                    c20671M55654 = C0866.m55654(viewOnClickListenerC7928);
                    sArr = f81971;
                    i16 = 1;
                    if (RunnableC0897.f81856) {
                        iM559710 = C0946.m55979("֡ܺ") ^ i8;
                        i5 = ((iM559710 ^ i7) * (-1133)) ^ (-1749315424);
                        i6 = 1561452685;
                    } else {
                        iM559710 = C0873.m55680("ۖۤ") ^ i7;
                        i5 = ((iM559710 ^ i8) * 32471) ^ 745080738;
                        i6 = -2006249062;
                    }
                    i10 = iM559710 ^ i6;
                    i9 = i5;
                    break;
                case -918229708:
                case 1291992914:
                    sArr = sArr;
                    viewOnClickListenerC7928 = viewOnClickListenerC7928;
                    s = f81971[0];
                    i14 = s * s;
                    i15 = 277729;
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0873.m55680("ۙܰ") ^ i7;
                        i9 = ((iM55680 ^ i8) * 15853) ^ 756412445;
                        i = 251328604;
                    } else {
                        iM55680 = (i7 - C0873.m55680("ۘᩳ")) * 57;
                        i9 = ((iM55680 ^ i8) * (-27889)) ^ (-574520865);
                        i = -800754266;
                    }
                    i10 = iM55680 ^ i;
                    c6587 = this;
                    viewOnClickListenerC7928 = viewOnClickListenerC7928;
                    sArr = sArr;
                    break;
                case -630372881:
                case 52281900:
                    strM55921 = C0937.m55921(f81971, 7, 3, i13);
                    if (C1044.m56286() > 0) {
                        iM559710 = (i8 - C0873.m55680("ܳۤ")) * (-117);
                        i5 = ((iM559710 ^ i7) * (-1067)) ^ (-1616388337);
                        i6 = -1166483696;
                        i10 = iM559710 ^ i6;
                        i9 = i5;
                    } else {
                        sArr = sArr;
                        viewOnClickListenerC7928 = viewOnClickListenerC7928;
                        iM55680 = C0873.m55680("ۙܰ") ^ i7;
                        i9 = ((iM55680 ^ i8) * 15853) ^ 756412445;
                        i = 251328604;
                        i10 = iM55680 ^ i;
                        c6587 = this;
                        viewOnClickListenerC7928 = viewOnClickListenerC7928;
                        sArr = sArr;
                    }
                    break;
                case -342564028:
                case 1125727601:
                    obj = null;
                    ViewOnClickListenerC0939.m55953(c20671M55654, iM55683, null);
                    sArr2 = f81971;
                    i11 = 10;
                    i12 = 3;
                    if (C0917.f81868) {
                        iM559710 = C0873.m55680("ۖۤ") ^ i7;
                        i5 = ((iM559710 ^ i8) * 32471) ^ 745080738;
                        i6 = -2006249062;
                    } else {
                        iM559710 = (C0946.m55979("ۛᩴ") ^ i7) * 91;
                        i5 = ((iM559710 ^ i8) * 29471) ^ (-580655194);
                        i6 = -1419818095;
                    }
                    i10 = iM559710 ^ i6;
                    i9 = i5;
                    break;
                case -126564916:
                case 1343634445:
                    C1017.m56182(c20671M55654, C1044.m56285(viewOnClickListenerC7928, C0873.m55680(strM56180) ^ 2101522764, objArr));
                    if (C0861.f81831) {
                        iM559710 = (C0873.m55680("۫۬") + i7) * (-53);
                        i5 = ((iM559710 ^ i8) * (-24779)) ^ 1237100852;
                        i6 = -940917985;
                    } else {
                        iM559710 = (i8 - C0946.m55979("ۜ᩸")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((iM559710 ^ i7) * (-18015)) ^ 1932533604;
                        i6 = 1497698681;
                    }
                    i10 = iM559710 ^ i6;
                    i9 = i5;
                    break;
                case 1148152338:
                case 1880236344:
                    C0845.m55584();
                    C1071.m56343();
                    break;
                case 1335864025:
                case 1526738900:
                    i13 = 13830;
                    iM55681 = C0873.m55680("ۖۙ") ^ i7;
                    i3 = ((iM55681 ^ i8) * 24399) ^ 1208661342;
                    i4 = 770359070;
                    i10 = iM55681 ^ i4;
                    i9 = i3;
                    viewOnClickListenerC7928 = viewOnClickListenerC7928;
                    sArr = sArr;
                    break;
                case 1435849468:
                case 1612083031:
                    sArr = sArr;
                    viewOnClickListenerC7928 = viewOnClickListenerC7928;
                    int i20 = i16;
                    iM559711 = C0946.m55979(C0992.m56102(sArr, i20, 3, i13));
                    if (C1053.f81965 > 0) {
                        iM55681 = (C0873.m55680("᩹᩷") + i8) * 45;
                        i16 = i20;
                        i3 = ((iM55681 ^ i7) * (-9427)) ^ 443622956;
                        i4 = 1895342761;
                        i10 = iM55681 ^ i4;
                        i9 = i3;
                        viewOnClickListenerC7928 = viewOnClickListenerC7928;
                        sArr = sArr;
                    } else {
                        i16 = i20;
                        iM55680 = C0873.m55680("ۙܰ") ^ i7;
                        i9 = ((iM55680 ^ i8) * 15853) ^ 756412445;
                        i = 251328604;
                        i10 = iM55680 ^ i;
                        c6587 = this;
                        viewOnClickListenerC7928 = viewOnClickListenerC7928;
                        sArr = sArr;
                    }
                    break;
                default:
                    C1194.m56396();
                    if (C0906.m55809() > 0) {
                        sArr = sArr;
                        viewOnClickListenerC7928 = viewOnClickListenerC7928;
                        iM55680 = C0873.m55680("ۙܰ") ^ i7;
                        i9 = ((iM55680 ^ i8) * 15853) ^ 756412445;
                        i = 251328604;
                        i10 = iM55680 ^ i;
                        c6587 = this;
                        viewOnClickListenerC7928 = viewOnClickListenerC7928;
                        sArr = sArr;
                    } else {
                        iM559710 = C0873.m55680("ᩴ᩸") ^ i7;
                        i5 = ((iM559710 ^ i8) * 4981) ^ 188365966;
                        i6 = -129335708;
                        i10 = iM559710 ^ i6;
                        i9 = i5;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C0992.m56112(this, this.f17010);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15069(C6587 c6587) {
        C7050.m16211((CharSequence) c6587.f17009);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C0854.m55601(this);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        ViewOnClickListenerC7928 viewOnClickListenerC7928 = null;
        int i = 1436474129;
        int i2 = C1071.f81975;
        int i3 = C0894.f81854;
        int iM55979 = (i3 - C0946.m55979("ۤۚ")) * (-127);
        int i4 = ((iM55979 ^ i2) * (-12339)) ^ 1507530736;
        int i5 = 623142217;
        while (true) {
            i = ((((i ^ i2) * 2521) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2014225125:
                case -1836111830:
                    C0949.m56012();
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0873.m55680("ۗܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27325) ^ (-1546314546);
                        i5 = -1356423962;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ۡܳ")) * (-123);
                        i4 = ((iM55979 ^ i3) * 11863) ^ (-1114212187);
                        i5 = -1817313683;
                    }
                    break;
                case -1616196180:
                case 1511266934:
                    if (C0892.m55749()) {
                        iM55979 = C0946.m55979("᩻᩻") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-6503)) ^ (-801177324);
                        i5 = 1680846053;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ۡܳ")) * (-123);
                        i4 = ((iM55979 ^ i3) * 11863) ^ (-1114212187);
                        i5 = -1817313683;
                    }
                    break;
                case -1297868846:
                case 103998701:
                    viewOnClickListenerC7928 = this.f17010;
                    if (C1404.m56468()) {
                        iM55979 = (C0873.m55680("ܿ᩶") ^ i3) * (-111);
                        i4 = ((iM55979 ^ i2) * (-29695)) ^ (-1284034725);
                        i5 = 1332218344;
                    } else {
                        iM55979 = (i2 - C0873.m55680("֫᩶")) * (-65);
                        i4 = ((iM55979 ^ i3) * 24505) ^ (-316584446);
                        i5 = -1851467968;
                    }
                    break;
                case -1253319716:
                case 631809660:
                    if (C0917.m55854()) {
                        iM55979 = C0873.m55680("۫ۚ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-28659)) ^ (-1604555148);
                        i5 = 315757962;
                    } else {
                        iM55979 = (i2 - C0946.m55979("֡ۚ")) * 49;
                        i4 = ((iM55979 ^ i3) * (-3987)) ^ (-1151744329);
                        i5 = -77740899;
                    }
                    break;
                case -1216189427:
                case 1946432851:
                    if (C1929.m56553()) {
                        iM55979 = C0873.m55680("ۗܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27325) ^ (-1546314546);
                        i5 = -1356423962;
                    } else {
                        iM55979 = C0873.m55680("᩶ᩴ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-3727)) ^ (-610965856);
                        i5 = 2043766648;
                    }
                    break;
                case -1143271061:
                case -1058289701:
                    if (!C0882.f81846) {
                        iM55979 = (i2 - C0946.m55979("ۡܳ")) * (-123);
                        i4 = ((iM55979 ^ i3) * 11863) ^ (-1114212187);
                        i5 = -1817313683;
                    } else {
                        iM55979 = (C0873.m55680("֡᩻") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM55979 ^ i2) * 12851) ^ 1716363088;
                        i5 = 1513195840;
                    }
                    break;
                case -463822607:
                case 106670110:
                    if (C1012.m56134() <= 0) {
                        iM55979 = (i2 - C0946.m55979("֡ۚ")) * 49;
                        i4 = ((iM55979 ^ i3) * (-3987)) ^ (-1151744329);
                        i5 = -77740899;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۚܶ")) * (-39);
                        i4 = ((iM55979 ^ i2) * 3873) ^ (-2055704819);
                        i5 = 408434823;
                    }
                    break;
                case -404640074:
                case -75472781:
                    C1044.m56272(viewOnClickListenerC7928, exc, null);
                    break;
                case -380311828:
                case 798451161:
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0873.m55680("ۗܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27325) ^ (-1546314546);
                        i5 = -1356423962;
                    } else {
                        iM55979 = (i2 - C0946.m55979("֫ۤ")) * 89;
                        i4 = ((iM55979 ^ i3) * 15207) ^ (-1741711984);
                        i5 = 907489494;
                    }
                    break;
                case -188298694:
                case 1589712029:
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0873.m55680("ۗܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27325) ^ (-1546314546);
                        i5 = -1356423962;
                    } else {
                        iM55979 = C0873.m55680("ܳᩴ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-115)) ^ 349302582;
                        i5 = 989499589;
                    }
                    break;
                case -142075157:
                case 1738463351:
                    C0937.m55918();
                    C0946.m55980();
                    break;
                case 62515073:
                case 1600780038:
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0873.m55680("֡᩻") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM55979 ^ i2) * 12851) ^ 1716363088;
                        i5 = 1513195840;
                    } else {
                        iM55979 = C0946.m55979("֨ۤ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-13141)) ^ (-1717267673);
                        i5 = 51629696;
                    }
                    break;
                case 915783235:
                case 1091028313:
                    if (C1194.f82045 != 0) {
                        iM55979 = (i2 - C0946.m55979("ۡܳ")) * (-123);
                        i4 = ((iM55979 ^ i3) * 11863) ^ (-1114212187);
                        i5 = -1817313683;
                    } else {
                        iM55979 = C0873.m55680("᩹ۢ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 9753) ^ (-2061784113);
                        i5 = -1025358408;
                    }
                    break;
                case 941984866:
                case 2068826657:
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55979 = (i2 - C0946.m55979("֡ۚ")) * 49;
                        i4 = ((iM55979 ^ i3) * (-3987)) ^ (-1151744329);
                        i5 = -77740899;
                    } else {
                        iM55979 = C0873.m55680("ۗܽ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 27325) ^ (-1546314546);
                        i5 = -1356423962;
                    }
                    break;
                case 1522293994:
                case 1786812738:
                    if (C1124.m56367() >= 0) {
                        iM55979 = (i2 - C0946.m55979("ۡܳ")) * (-123);
                        i4 = ((iM55979 ^ i3) * 11863) ^ (-1114212187);
                        i5 = -1817313683;
                    } else {
                        iM55979 = (C0873.m55680("ܰۡ") ^ i2) * (-99);
                        i4 = ((iM55979 ^ i3) * (-49)) ^ 2038964259;
                        i5 = -1220799329;
                    }
                    break;
                default:
                    C0882.m55710();
                    iM55979 = (i2 - C0946.m55979("ۡܳ")) * (-123);
                    i4 = ((iM55979 ^ i3) * 11863) ^ (-1114212187);
                    i5 = -1817313683;
                    break;
            }
            return;
        }
    }
}
