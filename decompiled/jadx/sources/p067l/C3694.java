package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.֨᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B2H */
/* JADX INFO: loaded from: classes.dex */
public final class C3694 {

    /* JADX INFO: renamed from: ᩹᩸ᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f81865;

    static {
        ApplicationC14266.m56479(20);
        f81865 = new short[]{6516, 10984, 10995, 11000, 10995};
    }

    /* JADX INFO: renamed from: ֫ */
    public static native void m7120(AbstractC5526 abstractC5526, CharSequence charSequence, String str, C24301 c24301, C23989 c23989);

    /* JADX INFO: renamed from: ֫ */
    public static void m7124(C24111 c24111, CharSequence charSequence, String str, int i) throws IOException {
        m7115(c24111, charSequence, str, i, (List) null, (C23989) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7115(OutputStream outputStream, CharSequence charSequence, String str, int i, List list, C23989 c23989) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, C16412.m37298(i)));
        try {
            if (i == C16412.f48234) {
                outputStream.write(new byte[]{-17, -69, -65});
            } else if (i == C16412.f48243) {
                outputStream.write(new byte[]{-2, -1});
            } else if (i == C16412.f48236) {
                outputStream.write(new byte[]{-1, -2});
            } else if (i == C16412.f48237) {
                outputStream.write(new byte[]{0, 0, -2, -1});
            } else if (i == C16412.f48247) {
                outputStream.write(new byte[]{-1, -2, 0, 0});
            }
            C3023 c3023 = new C3023(bufferedWriter, str);
            if (c23989 != null) {
                c23989.m53160(c3023);
            } else if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(((AbstractC17043) it.next()).mo29987());
                    try {
                        C23461.m52180(gZIPInputStream, c3023, StandardCharsets.UTF_8);
                        gZIPInputStream.close();
                    } catch (Throwable th) {
                        try {
                            gZIPInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            } else {
                int length = charSequence.length();
                for (int i2 = 0; i2 < length; i2++) {
                    c3023.write(charSequence.charAt(i2));
                }
            }
            bufferedWriter.close();
        } catch (Throwable th3) {
            try {
                bufferedWriter.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x05a2 A[PHI: r17 r20 r21 r22
      0x05a2: PHI (r17v53 int) = (r17v13 int), (r17v15 int), (r17v54 int) binds: [B:146:0x05a0, B:138:0x0540, B:27:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x05a2: PHI (r20v48 l.ܶ᩵ܿ) = (r20v7 l.ܶ᩵ܿ), (r20v9 l.ܶ᩵ܿ), (r20v49 l.ܶ᩵ܿ) binds: [B:146:0x05a0, B:138:0x0540, B:27:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x05a2: PHI (r21v39 l.ܶ᩵ܿ) = (r21v8 l.ܶ᩵ܿ), (r21v10 l.ܶ᩵ܿ), (r21v40 l.ܶ᩵ܿ) binds: [B:146:0x05a0, B:138:0x0540, B:27:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x05a2: PHI (r22v33 java.lang.Throwable) = (r22v8 java.lang.Throwable), (r22v10 java.lang.Throwable), (r22v34 java.lang.Throwable) binds: [B:146:0x05a0, B:138:0x0540, B:27:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:159:0x0639 A[PHI: r11 r12 r17 r20 r21 r22
      0x0639: PHI (r11v3 short) = (r11v1 short), (r11v1 short), (r11v2 short), (r11v1 short) binds: [B:158:0x0637, B:150:0x05d9, B:126:0x049e, B:122:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0639: PHI (r12v2 int) = (r12v1 int), (r12v1 int), (r12v1 int), (r12v3 int) binds: [B:158:0x0637, B:150:0x05d9, B:126:0x049e, B:122:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0639: PHI (r17v19 int) = (r17v10 int), (r17v12 int), (r17v18 int), (r17v20 int) binds: [B:158:0x0637, B:150:0x05d9, B:126:0x049e, B:122:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0639: PHI (r20v13 l.ܶ᩵ܿ) = (r20v4 l.ܶ᩵ܿ), (r20v6 l.ܶ᩵ܿ), (r20v12 l.ܶ᩵ܿ), (r20v14 l.ܶ᩵ܿ) binds: [B:158:0x0637, B:150:0x05d9, B:126:0x049e, B:122:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0639: PHI (r21v14 l.ܶ᩵ܿ) = (r21v5 l.ܶ᩵ܿ), (r21v7 l.ܶ᩵ܿ), (r21v13 l.ܶ᩵ܿ), (r21v15 l.ܶ᩵ܿ) binds: [B:158:0x0637, B:150:0x05d9, B:126:0x049e, B:122:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0639: PHI (r22v14 java.lang.Throwable) = (r22v5 java.lang.Throwable), (r22v7 java.lang.Throwable), (r22v13 java.lang.Throwable), (r22v15 java.lang.Throwable) binds: [B:158:0x0637, B:150:0x05d9, B:126:0x049e, B:122:0x0470] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012b, code lost:
    
        if (p067l.RunnableC0871.f81839 < 0) goto L31;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m7118(AbstractC5526 abstractC5526, CharSequence charSequence, final String str, final int i, int i2, List list) throws Throwable {
        int i3;
        AbstractC17043 abstractC17043;
        AbstractC17043 abstractC17044;
        int iM55979;
        int i4;
        int i5;
        int iM559710;
        int i6;
        int i7;
        C9729 c9729Mo28595;
        int i8;
        int iM559711;
        int i9;
        int i10;
        final List list2 = list;
        Throwable th = null;
        AbstractC17043 abstractC17045 = null;
        Object obj = null;
        AbstractC17043 abstractC17046 = null;
        C9729 c9729 = null;
        CharSequence charSequence2 = null;
        short s = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1664666284;
        int i14 = C1012.f81938;
        int i15 = C1025.f81947;
        int iM55680 = (i15 - C0873.m55680("ܺۢ")) * 63;
        int i16 = ((iM55680 ^ i14) * 29607) ^ 469115531;
        int i17 = iM55680 ^ (-765019929);
        C19056 c19056 = null;
        boolean z = false;
        while (true) {
            int i18 = i17 ^ (i16 & (((i13 ^ i14) * 5639) >> 31));
            switch (i18) {
                case -2096065213:
                case -1836881754:
                    th = th;
                    abstractC17045 = abstractC17045;
                    abstractC17046 = abstractC17046;
                    i18 = i18;
                    if (C1124.f82007 >= 0) {
                        iM559710 = (C0873.m55680("᩻֫") ^ i14) * (-75);
                        i6 = ((iM559710 ^ i15) * 20231) ^ 851934441;
                        i7 = -806153533;
                    } else {
                        iM559710 = (C0946.m55979("ۚܰ") ^ i14) * (-5);
                        i6 = ((iM559710 ^ i15) * 12095) ^ (-1731260987);
                        i7 = 926887511;
                    }
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -2000526112:
                case -1541121961:
                    i18 = i18;
                    if (C0992.f81922 >= 0) {
                        iM559711 = (C0946.m55979("᩻ܿ") ^ i14) * 59;
                        i9 = ((iM559711 ^ i15) * (-1479)) ^ (-1991006728);
                        i10 = 78672008;
                        int i19 = i18;
                        i17 = iM559711 ^ i10;
                        i16 = i9;
                        i13 = i19;
                    } else {
                        th = th;
                        abstractC17045 = abstractC17045;
                        abstractC17046 = abstractC17046;
                        iM559710 = C0873.m55680("֡ۛ") ^ i14;
                        i6 = ((iM559710 ^ i15) * (-23331)) ^ 1920434481;
                        i7 = -1010000533;
                        i8 = iM559710 ^ i7;
                        i13 = i18;
                        abstractC17046 = abstractC17046;
                        abstractC17045 = abstractC17045;
                        th = th;
                        i17 = i8;
                        i16 = i6;
                        list2 = list;
                    }
                    break;
                case -1946302700:
                case -1694317876:
                    th = th;
                    abstractC17045 = abstractC17045;
                    abstractC17046 = abstractC17046;
                    i18 = i18;
                    if (C0906.m55809() <= 0) {
                        iM559710 = C0946.m55979("ۖ᩵") ^ i15;
                        i6 = ((iM559710 ^ i14) * (-30657)) ^ 583934479;
                        i7 = -1748346786;
                    } else {
                        iM559710 = (C0873.m55680("᩷ۘ") ^ i15) * (-113);
                        i6 = ((iM559710 ^ i14) * (-4219)) ^ (-365194464);
                        i7 = -1954489890;
                    }
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -1912298284:
                case 816889662:
                    i18 = i18;
                    C0937.m55922(c9729);
                    iM559711 = (i15 - C0873.m55680("ᩳۘ")) * (-21);
                    i9 = ((iM559711 ^ i14) * 28991) ^ 1177481780;
                    i10 = -495983346;
                    int i110 = i18;
                    i17 = iM559711 ^ i10;
                    i16 = i9;
                    i13 = i110;
                    break;
                case -1697807414:
                case 165591238:
                    th = th;
                    abstractC17045 = abstractC17045;
                    abstractC17046 = abstractC17046;
                    i18 = i18;
                    if (C1071.m56343() != 0) {
                        iM559710 = C0946.m55979("ۜۚ") ^ i15;
                        i6 = ((iM559710 ^ i14) * 28597) ^ (-1644807231);
                        i7 = -1842082577;
                    } else {
                        iM559710 = (C0873.m55680("᩵ۙ") + i14) * 53;
                        i6 = ((iM559710 ^ i15) * (-2383)) ^ 96018054;
                        i7 = -1439934853;
                    }
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -1609667887:
                case 1740420089:
                    abstractC17044 = abstractC17045;
                    abstractC17043 = abstractC17046;
                    i3 = i18;
                    throw new RuntimeException(C0949.m56016(f81865, 1, 4, i12));
                case -1461567436:
                case 2141259763:
                    th = th;
                    abstractC17045 = abstractC17045;
                    abstractC17046 = abstractC17046;
                    i18 = i18;
                    if (charSequence instanceof InterfaceC21800) {
                        iM559710 = (i14 - C0873.m55680("ۙۛ")) * (-65);
                        i6 = ((iM559710 ^ i15) * 16117) ^ 1869776847;
                        i7 = -630544568;
                    } else {
                        iM559710 = C0873.m55680("᩷֨") ^ i15;
                        i6 = ((iM559710 ^ i14) * (-4313)) ^ 571334932;
                        i7 = -252022622;
                    }
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -1302525333:
                case 1993896729:
                    i18 = i18;
                    C0946.m55980();
                    iM559710 = C0946.m55979("ۜۚ") ^ i15;
                    i6 = ((iM559710 ^ i14) * 28597) ^ (-1644807231);
                    i7 = -1842082577;
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -1194012852:
                case -734704747:
                    i18 = i18;
                    C0898.m55800();
                    if (!C0882.f81846) {
                        iM559710 = C0946.m55979("ۜۚ") ^ i15;
                        i6 = ((iM559710 ^ i14) * 28597) ^ (-1644807231);
                        i7 = -1842082577;
                        i8 = iM559710 ^ i7;
                        i13 = i18;
                        abstractC17046 = abstractC17046;
                        abstractC17045 = abstractC17045;
                        th = th;
                        i17 = i8;
                        i16 = i6;
                        list2 = list;
                    } else {
                        iM559711 = (i14 - C0946.m55979("ܺܽ")) * 17;
                        i9 = ((iM559711 ^ i15) * (-30337)) ^ 578521813;
                        i10 = 385454841;
                        int i111 = i18;
                        i17 = iM559711 ^ i10;
                        i16 = i9;
                        i13 = i111;
                    }
                    break;
                case -1067934670:
                case -11968804:
                    th = th;
                    abstractC17045 = abstractC17045;
                    abstractC17046 = abstractC17046;
                    i18 = i18;
                    if (C1229.f82066 >= 0) {
                        iM559710 = (C0873.m55680("᩻֫") ^ i14) * (-75);
                        i6 = ((iM559710 ^ i15) * 20231) ^ 851934441;
                        i7 = -806153533;
                    } else {
                        iM559710 = C0946.m55979("ۢ֨") ^ i15;
                        i6 = ((iM559710 ^ i14) * 25165) ^ 885686253;
                        i7 = -682847415;
                    }
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -1042887439:
                case 1331592492:
                    th = th;
                    abstractC17045 = abstractC17045;
                    abstractC17046 = abstractC17046;
                    i18 = i18;
                    int i20 = (s * s) + 369664;
                    i11 = i20 + i20;
                    if (C0898.m55800() <= 0) {
                        iM559710 = (C0873.m55680("᩻֫") ^ i14) * (-75);
                        i6 = ((iM559710 ^ i15) * 20231) ^ 851934441;
                        i7 = -806153533;
                    } else {
                        iM559710 = (i14 - C0946.m55979("ۚ᩶")) * (-63);
                        i6 = ((iM559710 ^ i15) * 16493) ^ (-1516093857);
                        i7 = -1786491593;
                    }
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -1042564559:
                case 280174796:
                    i18 = i18;
                    C1964.m56597();
                    if (C1025.f81947 < 0) {
                        iM559711 = (C0873.m55680("᩹ۚ") ^ i15) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM559711 ^ i14) * 23177) ^ (-963063437);
                        i10 = 247650768;
                        int i112 = i18;
                        i17 = iM559711 ^ i10;
                        i16 = i9;
                        i13 = i112;
                    } else {
                        th = th;
                        abstractC17045 = abstractC17045;
                        abstractC17046 = abstractC17046;
                        iM559710 = C0873.m55680("֡ۛ") ^ i14;
                        i6 = ((iM559710 ^ i15) * (-23331)) ^ 1920434481;
                        i7 = -1010000533;
                        i8 = iM559710 ^ i7;
                        i13 = i18;
                        abstractC17046 = abstractC17046;
                        abstractC17045 = abstractC17045;
                        th = th;
                        i17 = i8;
                        i16 = i6;
                        list2 = list;
                    }
                    break;
                case -914914838:
                case -7429788:
                    if (C0898.f81858 <= 0) {
                        th = th;
                        abstractC17045 = abstractC17045;
                        abstractC17046 = abstractC17046;
                        i18 = i18;
                        iM559710 = C0873.m55680("ۙ᩻") ^ i14;
                        i6 = ((iM559710 ^ i15) * 28935) ^ (-1303848462);
                        i7 = -1036572025;
                        i8 = iM559710 ^ i7;
                        i13 = i18;
                        abstractC17046 = abstractC17046;
                        abstractC17045 = abstractC17045;
                        th = th;
                        i17 = i8;
                        i16 = i6;
                        list2 = list;
                    } else {
                        i18 = i18;
                        iM559711 = (C0873.m55680("᩹ۚ") ^ i15) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM559711 ^ i14) * 23177) ^ (-963063437);
                        i10 = 247650768;
                        int i113 = i18;
                        i17 = iM559711 ^ i10;
                        i16 = i9;
                        i13 = i113;
                    }
                    break;
                case -841440374:
                case 1723012732:
                    C0912.m55833();
                    return;
                case -783513534:
                case 1837565861:
                    th = th;
                    abstractC17045 = abstractC17045;
                    abstractC17046 = abstractC17046;
                    i18 = i18;
                    if (C1028.f81950 <= 0) {
                        iM559710 = C0873.m55680("ۙ᩻") ^ i14;
                        i6 = ((iM559710 ^ i15) * 28935) ^ (-1303848462);
                        i7 = -1036572025;
                    } else {
                        iM559710 = C0873.m55680("۠ۧ") ^ i14;
                        i6 = ((iM559710 ^ i15) * 5793) ^ (-1955700570);
                        i7 = -2130839453;
                    }
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -680301248:
                case -674348697:
                    th = th;
                    abstractC17045 = abstractC17045;
                    abstractC17046 = abstractC17046;
                    i18 = i18;
                    s = f81865[0];
                    if (C0894.f81854 >= 0) {
                        iM559710 = (C0873.m55680("᩻֫") ^ i14) * (-75);
                        i6 = ((iM559710 ^ i15) * 20231) ^ 851934441;
                        i7 = -806153533;
                    } else {
                        iM559710 = C0873.m55680("ۤۧ") ^ i15;
                        i6 = ((iM559710 ^ i14) * 15681) ^ 816526363;
                        i7 = -1143381950;
                    }
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -619761790:
                case 1233827716:
                    i12 = 10908;
                    iM559710 = (C0946.m55979("ۧ۠") + i14) * (-45);
                    i6 = ((iM559710 ^ i15) * 17707) ^ (-897047123);
                    i7 = 1424236576;
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -597239502:
                case 1261482878:
                    c9729Mo28595 = ((InterfaceC21800) charSequence).mo28595();
                    c9729 = c9729Mo28595;
                    iM559710 = C0873.m55680("ܰ᩶") ^ i15;
                    i6 = ((iM559710 ^ i14) * 8509) ^ (-921058495);
                    i7 = -501079663;
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -446851078:
                case 1540836298:
                    abstractC17044 = abstractC17045;
                    abstractC17043 = abstractC17046;
                    i3 = i18;
                    try {
                        abstractC17045 = ((C6867) abstractC5526).f17850;
                        try {
                            C19210.m43750(abstractC17045, EnumC17868.MODIFY_FILE);
                            try {
                                c19056 = new C19056();
                                c19056.m43296(abstractC17045);
                                Throwable th2 = th;
                                try {
                                    AbstractC17043 abstractC17047 = (AbstractC17043) C1929.m56563(list2, i2);
                                    int iM559712 = (C0946.m55979("ᩴۤ") ^ i15) * 63;
                                    i16 = ((iM559712 ^ i14) * 25359) ^ 869773885;
                                    i13 = i3;
                                    i17 = iM559712 ^ (-682983197);
                                    abstractC17046 = abstractC17047;
                                    th = th2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    th = th;
                                    int iM55681 = (i14 - C0873.m55680("ۜ᩹")) * (-43);
                                    i6 = ((iM55681 ^ i15) * 4465) ^ 1128188456;
                                    i8 = iM55681 ^ (-291780338);
                                    i13 = i3;
                                    abstractC17046 = abstractC17043;
                                    i17 = i8;
                                    i16 = i6;
                                    list2 = list;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                c19056 = null;
                                int iM55682 = (i14 - C0873.m55680("ۜ᩹")) * (-43);
                                i6 = ((iM55682 ^ i15) * 4465) ^ 1128188456;
                                i8 = iM55682 ^ (-291780338);
                                i13 = i3;
                                abstractC17046 = abstractC17043;
                                i17 = i8;
                                i16 = i6;
                                list2 = list;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        th = th;
                        abstractC17045 = abstractC17044;
                        int iM55683 = (i14 - C0873.m55680("ۜ᩹")) * (-43);
                        i6 = ((iM55683 ^ i15) * 4465) ^ 1128188456;
                        i8 = iM55683 ^ (-291780338);
                        i13 = i3;
                        abstractC17046 = abstractC17043;
                        i17 = i8;
                        i16 = i6;
                        list2 = list;
                        break;
                    }
                    break;
                case -440658821:
                case 732042921:
                    th = th;
                    abstractC17045 = abstractC17045;
                    abstractC17046 = abstractC17046;
                    i18 = i18;
                    int i21 = s + 608;
                    if ((i21 * i21) - i11 > 0) {
                        iM559710 = (i14 - C0946.m55979("ۘܳ")) * (-9);
                        i6 = ((iM559710 ^ i15) * (-27685)) ^ (-1873864078);
                        i7 = -1290507011;
                    } else {
                        iM559710 = C0873.m55680("۫۟") ^ i15;
                        i6 = ((iM559710 ^ i14) * (-10313)) ^ (-615221343);
                        i7 = -1123177667;
                    }
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -424756844:
                case -92809149:
                    abstractC17045 = abstractC17045;
                    abstractC17046 = abstractC17046;
                    i18 = i18;
                    try {
                        C1194.m56385(c9729);
                        th = th;
                        iM559710 = (i15 - C0946.m55979("֫ܰ")) * (-25);
                        i6 = ((iM559710 ^ i14) * (-6915)) ^ 524750619;
                        i7 = 745745034;
                        i8 = iM559710 ^ i7;
                        i13 = i18;
                        abstractC17046 = abstractC17046;
                        abstractC17045 = abstractC17045;
                        th = th;
                        i17 = i8;
                        i16 = i6;
                        list2 = list;
                    } catch (Throwable th7) {
                        int iM559713 = (C0946.m55979("ܽ᩵") + i14) * 85;
                        int i22 = ((iM559713 ^ i15) * (-22901)) ^ (-580117833);
                        i13 = i18;
                        abstractC17046 = abstractC17046;
                        i17 = iM559713 ^ 1564445608;
                        abstractC17045 = abstractC17045;
                        obj = th7;
                        i16 = i22;
                    }
                    break;
                case -357440424:
                case -67941184:
                    abstractC17044 = abstractC17045;
                    abstractC17043 = abstractC17046;
                    i3 = i18;
                    charSequence2 = c9729 == null ? charSequence : c9729;
                    iM55979 = C0873.m55680("ۚܶ") ^ i14;
                    i4 = ((iM55979 ^ i15) * (-14173)) ^ (-897920888);
                    i5 = -817144230;
                    i13 = i3;
                    abstractC17046 = abstractC17043;
                    i17 = iM55979 ^ i5;
                    i16 = i4;
                    abstractC17045 = abstractC17044;
                    break;
                case -269060309:
                case 2066158377:
                    th = th;
                    abstractC17045 = abstractC17045;
                    abstractC17046 = abstractC17046;
                    i18 = i18;
                    if (c9729 != null) {
                        iM559710 = C0873.m55680("ᩳᩴ") ^ i14;
                        i6 = ((iM559710 ^ i15) * 21343) ^ 1432974603;
                        i7 = 1331744010;
                    } else {
                        iM559710 = (i15 - C0946.m55979("֫ܰ")) * (-25);
                        i6 = ((iM559710 ^ i14) * (-6915)) ^ 524750619;
                        i7 = 745745034;
                    }
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -35265671:
                case 851232434:
                    throw th;
                case 23773825:
                case 1037389275:
                    if (!C0866.m55645()) {
                        th = th;
                        abstractC17045 = abstractC17045;
                        abstractC17046 = abstractC17046;
                        i18 = i18;
                        iM559710 = C0946.m55979("ۖ᩵") ^ i15;
                        i6 = ((iM559710 ^ i14) * (-30657)) ^ 583934479;
                        i7 = -1748346786;
                        i8 = iM559710 ^ i7;
                        i13 = i18;
                        abstractC17046 = abstractC17046;
                        abstractC17045 = abstractC17045;
                        th = th;
                        i17 = i8;
                        i16 = i6;
                        list2 = list;
                    } else {
                        i18 = i18;
                        iM559711 = (C0873.m55680("᩹ۚ") ^ i15) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM559711 ^ i14) * 23177) ^ (-963063437);
                        i10 = 247650768;
                        int i114 = i18;
                        i17 = iM559711 ^ i10;
                        i16 = i9;
                        i13 = i114;
                    }
                    break;
                case 75402078:
                case 1143539206:
                    c9729Mo28595 = null;
                    c9729 = c9729Mo28595;
                    iM559710 = C0873.m55680("ܰ᩶") ^ i15;
                    i6 = ((iM559710 ^ i14) * 8509) ^ (-921058495);
                    i7 = -501079663;
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case 191515908:
                case 1004239275:
                    i18 = i18;
                    RunnableC0871.m55672();
                    break;
                case 243407593:
                case 1716209996:
                    th = th;
                    abstractC17045 = abstractC17045;
                    abstractC17046 = abstractC17046;
                    i18 = i18;
                    if (z) {
                        iM559710 = (i15 - C0873.m55680("ܳ۬")) * 49;
                        i6 = ((iM559710 ^ i14) * (-29211)) ^ 1684160540;
                        i7 = 680363118;
                    } else {
                        iM559710 = (C0873.m55680("֡ᩳ") + i14) * 89;
                        i6 = ((iM559710 ^ i15) * (-32351)) ^ (-2078990993);
                        i7 = 1415047131;
                    }
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case 259431400:
                case 600541602:
                    th = th;
                    abstractC17045 = abstractC17045;
                    abstractC17046 = abstractC17046;
                    i18 = i18;
                    if (C0949.f81897 >= 0) {
                        iM559710 = C0946.m55979("ᩴܽ") ^ i15;
                        i6 = ((iM559710 ^ i14) * 30365) ^ (-690963886);
                        i7 = 1039366990;
                    } else {
                        iM559710 = C0873.m55680("ۖ֡") ^ i14;
                        i6 = ((iM559710 ^ i15) * 29429) ^ 1148966979;
                        i7 = 906237920;
                    }
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case 289729846:
                case 584598982:
                    i12 = 61165;
                    iM559710 = (C0946.m55979("ۧ۠") + i14) * (-45);
                    i6 = ((iM559710 ^ i15) * 17707) ^ (-897047123);
                    i7 = 1424236576;
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case 323947702:
                case 1588101106:
                    return;
                case 379918650:
                case 1078870860:
                    Throwable th8 = th;
                    AbstractC17043 abstractC17048 = abstractC17045;
                    AbstractC17043 abstractC17049 = abstractC17046;
                    boolean z2 = abstractC5526 instanceof C6867;
                    int iM55684 = C0873.m55680("۫ܺ") ^ i15;
                    z = z2;
                    i16 = ((iM55684 ^ i14) * 23163) ^ 538427467;
                    i13 = i18;
                    abstractC17046 = abstractC17049;
                    abstractC17045 = abstractC17048;
                    th = th8;
                    i17 = iM55684 ^ (-1832102642);
                    list2 = list;
                    break;
                case 506623475:
                case 565255400:
                    i18 = i18;
                    if (c9729 != null) {
                        iM559711 = C0946.m55979("۠֨") ^ i14;
                        i9 = ((iM559711 ^ i15) * (-25601)) ^ (-2016169959);
                        i10 = -2052833570;
                    } else {
                        iM559711 = (i15 - C0873.m55680("ᩳۘ")) * (-21);
                        i9 = ((iM559711 ^ i14) * 28991) ^ 1177481780;
                        i10 = -495983346;
                    }
                    int i115 = i18;
                    i17 = iM559711 ^ i10;
                    i16 = i9;
                    i13 = i115;
                    break;
                case 609486254:
                case 1998823277:
                    C1048.m56305();
                    if (C1036.f81953 >= 0) {
                        iM559711 = (C0946.m55979("ᩳۖ") ^ i15) * (-57);
                        i18 = i18;
                        i9 = ((iM559711 ^ i14) * (-347)) ^ 1110307685;
                        i10 = 708856469;
                        int i116 = i18;
                        i17 = iM559711 ^ i10;
                        i16 = i9;
                        i13 = i116;
                    } else {
                        i18 = i18;
                        iM559710 = C0946.m55979("ۜۚ") ^ i15;
                        i6 = ((iM559710 ^ i14) * 28597) ^ (-1644807231);
                        i7 = -1842082577;
                        i8 = iM559710 ^ i7;
                        i13 = i18;
                        abstractC17046 = abstractC17046;
                        abstractC17045 = abstractC17045;
                        th = th;
                        i17 = i8;
                        i16 = i6;
                        list2 = list;
                    }
                    break;
                case 904494924:
                case 1530082280:
                    th = th;
                    abstractC17045 = abstractC17045;
                    abstractC17046 = abstractC17046;
                    i18 = i18;
                    if (C0898.f81858 <= 0) {
                        iM559710 = C0873.m55680("֡ۛ") ^ i14;
                        i6 = ((iM559710 ^ i15) * (-23331)) ^ 1920434481;
                        i7 = -1010000533;
                    } else {
                        iM559710 = (C0873.m55680("᩶ۛ") + i15) * 81;
                        i6 = ((iM559710 ^ i14) * (-8985)) ^ 1784005678;
                        i7 = -737684058;
                    }
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case 1101419037:
                case 1930103489:
                    th = th;
                    abstractC17045 = abstractC17045;
                    abstractC17046 = abstractC17046;
                    i18 = i18;
                    if (C1229.f82066 >= 0) {
                        iM559710 = C0873.m55680("֡ۛ") ^ i14;
                        i6 = ((iM559710 ^ i15) * (-23331)) ^ 1920434481;
                        i7 = -1010000533;
                    } else {
                        iM559710 = C0873.m55680("ܿ᩻") ^ i15;
                        i6 = ((iM559710 ^ i14) * (-9391)) ^ (-826927282);
                        i7 = 634106547;
                    }
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case 1159910405:
                case 1666021356:
                    if (C0854.f81826 == 0) {
                        th = th;
                        abstractC17045 = abstractC17045;
                        abstractC17046 = abstractC17046;
                        i18 = i18;
                        iM559710 = C0946.m55979("ᩴܽ") ^ i15;
                        i6 = ((iM559710 ^ i14) * 30365) ^ (-690963886);
                        i7 = 1039366990;
                        i8 = iM559710 ^ i7;
                        i13 = i18;
                        abstractC17046 = abstractC17046;
                        abstractC17045 = abstractC17045;
                        th = th;
                        i17 = i8;
                        i16 = i6;
                        list2 = list;
                    } else {
                        iM559711 = (C0946.m55979("ᩳۖ") ^ i15) * (-57);
                        i18 = i18;
                        i9 = ((iM559711 ^ i14) * (-347)) ^ 1110307685;
                        i10 = 708856469;
                        int i117 = i18;
                        i17 = iM559711 ^ i10;
                        i16 = i9;
                        i13 = i117;
                    }
                    break;
                case 1528695984:
                case 2099905960:
                    abstractC17045 = abstractC17045;
                    abstractC17046 = abstractC17046;
                    i18 = i18;
                    C0949.m56011(th, obj);
                    th = th;
                    iM559710 = (i15 - C0946.m55979("֫ܰ")) * (-25);
                    i6 = ((iM559710 ^ i14) * (-6915)) ^ 524750619;
                    i7 = 745745034;
                    i8 = iM559710 ^ i7;
                    i13 = i18;
                    abstractC17046 = abstractC17046;
                    abstractC17045 = abstractC17045;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                default:
                    i3 = i18;
                    try {
                        C19117.m43434(abstractC17046, charSequence2);
                        abstractC17043 = abstractC17046;
                        try {
                            abstractC17045.m38655(new InterfaceC14501() { // from class: l.ۘ᩸ᩳ
                                @Override // p067l.InterfaceC13831
                                /* JADX INFO: renamed from: ֫ */
                                public final void mo10534(AbstractC17043 abstractC170410) throws IOException {
                                    C3694.m7117(str, i, list2, abstractC170410);
                                }
                            });
                            c19056.m43298(abstractC17045);
                            abstractC17044 = abstractC17045;
                            try {
                                C16114.m36688(C0989.m56086(abstractC17045), false);
                                iM55979 = C0946.m55979("ܿ۬") ^ i15;
                                i4 = ((iM55979 ^ i14) * 28649) ^ (-1660135533);
                                i5 = -357215341;
                                i13 = i3;
                                abstractC17046 = abstractC17043;
                                i17 = iM55979 ^ i5;
                                i16 = i4;
                                abstractC17045 = abstractC17044;
                            } catch (Throwable th9) {
                                th = th9;
                                th = th;
                                abstractC17045 = abstractC17044;
                                int iM55685 = (i14 - C0873.m55680("ۜ᩹")) * (-43);
                                i6 = ((iM55685 ^ i15) * 4465) ^ 1128188456;
                                i8 = iM55685 ^ (-291780338);
                                i13 = i3;
                                abstractC17046 = abstractC17043;
                                i17 = i8;
                                i16 = i6;
                                list2 = list;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            th = th;
                            int iM55686 = (i14 - C0873.m55680("ۜ᩹")) * (-43);
                            i6 = ((iM55686 ^ i15) * 4465) ^ 1128188456;
                            i8 = iM55686 ^ (-291780338);
                            i13 = i3;
                            abstractC17046 = abstractC17043;
                            i17 = i8;
                            i16 = i6;
                            list2 = list;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        abstractC17043 = abstractC17046;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7117(String str, int i, List list, AbstractC17043 abstractC17043) throws IOException {
        C7718 c7718 = new C7718(abstractC17043.mo25506(false));
        C2864 c2864 = c7718.f20243;
        m7115(c7718, (CharSequence) null, str, i, list, (C23989) null);
        if (c2864.f4950 != 0) {
            MessageDigest messageDigestM36660 = C16111.m36660();
            messageDigestM36660.update(c2864.f4949, 0, c2864.f4950);
            C17953.m40870(C16111.m36665(messageDigestM36660.digest()), C16412.m37300(i));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7119(AbstractC5526 abstractC5526, CharSequence charSequence, String str, C24301 c24301) {
        m7120(abstractC5526, charSequence, str, c24301, (C23989) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7121(AbstractC5526 abstractC5526, String str, C24301 c24301, C23989 c23989) {
        m7120(abstractC5526, (CharSequence) null, str, c24301, c23989);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7116(CharSequence charSequence, String str, C24301 c24301, C23989 c23989, AbstractC17043 abstractC17043) throws IOException {
        C7718 c7718 = new C7718(abstractC17043.mo25506(false));
        C2864 c2864 = c7718.f20243;
        m7115(c7718, charSequence, str, c24301.f76968, (List) null, c23989);
        if (c2864.f4950 != 0) {
            MessageDigest messageDigestM36660 = C16111.m36660();
            messageDigestM36660.update(c2864.f4949, 0, c2864.f4950);
            C17953.m40870(C16111.m36665(messageDigestM36660.digest()), C16412.m37300(c24301.f76968));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7122(AbstractC17043 abstractC17043, CharSequence charSequence, String str, int i) {
        C9729 c9729Mo28595 = charSequence instanceof InterfaceC21800 ? ((InterfaceC21800) charSequence).mo28595() : null;
        CharSequence charSequence2 = c9729Mo28595 == null ? charSequence : c9729Mo28595;
        try {
            abstractC17043.mo37342();
            abstractC17043.mo29976(new C21130(charSequence2, str, i, C18524.m42122(abstractC17043) && !abstractC17043.mo25094(), abstractC17043)).m50314();
            if (c9729Mo28595 != null) {
                c9729Mo28595.close();
            }
        } catch (Throwable th) {
            if (c9729Mo28595 != null) {
                try {
                    c9729Mo28595.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m7125(AbstractC17043 abstractC17043, CharSequence charSequence, String str, int i) {
        C9729 c9729Mo28595 = charSequence instanceof InterfaceC21800 ? ((InterfaceC21800) charSequence).mo28595() : null;
        try {
            m7115(abstractC17043.mo25506(false), c9729Mo28595 == null ? charSequence : c9729Mo28595, str, i, (List) null, (C23989) null);
            if (c9729Mo28595 != null) {
                c9729Mo28595.close();
            }
        } catch (Throwable th) {
            if (c9729Mo28595 != null) {
                try {
                    c9729Mo28595.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m7114(CharSequence charSequence) {
        if (!(charSequence instanceof C9729)) {
            return charSequence.toString();
        }
        C9729 c9729 = (C9729) charSequence;
        return c9729.subSequence(0, c9729.length());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7123(AbstractC17043 abstractC17043, String str, int i, C23989 c23989) {
        m7115(abstractC17043.mo25506(false), (CharSequence) null, str, i, (List) null, c23989);
    }
}
