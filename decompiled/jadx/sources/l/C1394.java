package l;

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
public final class C1394 {

    /* JADX INFO: renamed from: ᩹᩸ᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f5032;

    static {
        ApplicationC12518.m30701(20);
        f5032 = new short[]{6516, 10984, 10995, 11000, 10995};
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static native void m4882(AbstractC3322 abstractC3322, CharSequence charSequence, String str, C23077 c23077, C22749 c22749);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4886(C22878 c22878, CharSequence charSequence, String str, int i) throws IOException {
        m4877(c22878, charSequence, str, i, (List) null, (C22749) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4877(OutputStream outputStream, CharSequence charSequence, String str, int i, List list, C22749 c22749) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, C14776.m35151(i)));
        try {
            if (i == C14776.f45120) {
                outputStream.write(new byte[]{-17, -69, -65});
            } else if (i == C14776.f45129) {
                outputStream.write(new byte[]{-2, -1});
            } else if (i == C14776.f45122) {
                outputStream.write(new byte[]{-1, -2});
            } else if (i == C14776.f45123) {
                outputStream.write(new byte[]{0, 0, -2, -1});
            } else if (i == C14776.f45133) {
                outputStream.write(new byte[]{-1, -2, 0, 0});
            }
            C0688 c0688 = new C0688(bufferedWriter, str);
            if (c22749 != null) {
                c22749.m50827(c0688);
            } else if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(((AbstractC15440) it.next()).mo27926());
                    try {
                        C22194.m49853(gZIPInputStream, c0688, StandardCharsets.UTF_8);
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
                    c0688.write(charSequence.charAt(i2));
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
    
        if (l.RunnableC0588.f2309 < 0) goto L31;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4880(AbstractC3322 abstractC3322, CharSequence charSequence, final String str, final int i, int i2, List list) throws Throwable {
        int i3;
        AbstractC15440 abstractC15440;
        AbstractC15440 abstractC15441;
        int iM6981;
        int i4;
        int i5;
        int iM6982;
        int i6;
        int i7;
        C7744 c7744Mo26562;
        int i8;
        int iM6983;
        int i9;
        int i10;
        final List list2 = list;
        Throwable th = null;
        AbstractC15440 abstractC15442 = null;
        Object obj = null;
        AbstractC15440 abstractC15443 = null;
        C7744 c7744 = null;
        CharSequence charSequence2 = null;
        short s = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1664666284;
        int i14 = C3432.f10845;
        int i15 = C3683.f11629;
        int iM2566 = (i15 - C0630.m2566("ܺۢ")) * 63;
        int i16 = ((iM2566 ^ i14) * 29607) ^ 469115531;
        int i17 = iM2566 ^ (-765019929);
        C17558 c17558 = null;
        boolean z = false;
        while (true) {
            int i18 = i17 ^ (i16 & (((i13 ^ i14) * 5639) >> 31));
            switch (i18) {
                case -2096065213:
                case -1836881754:
                    th = th;
                    abstractC15442 = abstractC15442;
                    abstractC15443 = abstractC15443;
                    i18 = i18;
                    if (C5695.f17556 >= 0) {
                        iM6982 = (C0630.m2566("᩻֫") ^ i14) * (-75);
                        i6 = ((iM6982 ^ i15) * 20231) ^ 851934441;
                        i7 = -806153533;
                    } else {
                        iM6982 = (C2105.m6981("ۚܰ") ^ i14) * (-5);
                        i6 = ((iM6982 ^ i15) * 12095) ^ (-1731260987);
                        i7 = 926887511;
                    }
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -2000526112:
                case -1541121961:
                    i18 = i18;
                    if (C3019.f9544 >= 0) {
                        iM6983 = (C2105.m6981("᩻ܿ") ^ i14) * 59;
                        i9 = ((iM6983 ^ i15) * (-1479)) ^ (-1991006728);
                        i10 = 78672008;
                        int i19 = i18;
                        i17 = iM6983 ^ i10;
                        i16 = i9;
                        i13 = i19;
                    } else {
                        th = th;
                        abstractC15442 = abstractC15442;
                        abstractC15443 = abstractC15443;
                        iM6982 = C0630.m2566("֡ۛ") ^ i14;
                        i6 = ((iM6982 ^ i15) * (-23331)) ^ 1920434481;
                        i7 = -1010000533;
                        i8 = iM6982 ^ i7;
                        i13 = i18;
                        abstractC15443 = abstractC15443;
                        abstractC15442 = abstractC15442;
                        th = th;
                        i17 = i8;
                        i16 = i6;
                        list2 = list;
                    }
                    break;
                case -1946302700:
                case -1694317876:
                    th = th;
                    abstractC15442 = abstractC15442;
                    abstractC15443 = abstractC15443;
                    i18 = i18;
                    if (C1294.m4372() <= 0) {
                        iM6982 = C2105.m6981("ۖ᩵") ^ i15;
                        i6 = ((iM6982 ^ i14) * (-30657)) ^ 583934479;
                        i7 = -1748346786;
                    } else {
                        iM6982 = (C0630.m2566("᩷ۘ") ^ i15) * (-113);
                        i6 = ((iM6982 ^ i14) * (-4219)) ^ (-365194464);
                        i7 = -1954489890;
                    }
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -1912298284:
                case 816889662:
                    i18 = i18;
                    C1916.m6312(c7744);
                    iM6983 = (i15 - C0630.m2566("ᩳۘ")) * (-21);
                    i9 = ((iM6983 ^ i14) * 28991) ^ 1177481780;
                    i10 = -495983346;
                    int i110 = i18;
                    i17 = iM6983 ^ i10;
                    i16 = i9;
                    i13 = i110;
                    break;
                case -1697807414:
                case 165591238:
                    th = th;
                    abstractC15442 = abstractC15442;
                    abstractC15443 = abstractC15443;
                    i18 = i18;
                    if (C4616.m13552() != 0) {
                        iM6982 = C2105.m6981("ۜۚ") ^ i15;
                        i6 = ((iM6982 ^ i14) * 28597) ^ (-1644807231);
                        i7 = -1842082577;
                    } else {
                        iM6982 = (C0630.m2566("᩵ۙ") + i14) * 53;
                        i6 = ((iM6982 ^ i15) * (-2383)) ^ 96018054;
                        i7 = -1439934853;
                    }
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -1609667887:
                case 1740420089:
                    abstractC15441 = abstractC15442;
                    abstractC15440 = abstractC15443;
                    i3 = i18;
                    throw new RuntimeException(C2167.m7159(f5032, 1, 4, i12));
                case -1461567436:
                case 2141259763:
                    th = th;
                    abstractC15442 = abstractC15442;
                    abstractC15443 = abstractC15443;
                    i18 = i18;
                    if (charSequence instanceof InterfaceC20445) {
                        iM6982 = (i14 - C0630.m2566("ۙۛ")) * (-65);
                        i6 = ((iM6982 ^ i15) * 16117) ^ 1869776847;
                        i7 = -630544568;
                    } else {
                        iM6982 = C0630.m2566("᩷֨") ^ i15;
                        i6 = ((iM6982 ^ i14) * (-4313)) ^ 571334932;
                        i7 = -252022622;
                    }
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -1302525333:
                case 1993896729:
                    i18 = i18;
                    C2105.m6982();
                    iM6982 = C2105.m6981("ۜۚ") ^ i15;
                    i6 = ((iM6982 ^ i14) * 28597) ^ (-1644807231);
                    i7 = -1842082577;
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -1194012852:
                case -734704747:
                    i18 = i18;
                    C1128.m3851();
                    if (!C0798.f2919) {
                        iM6982 = C2105.m6981("ۜۚ") ^ i15;
                        i6 = ((iM6982 ^ i14) * 28597) ^ (-1644807231);
                        i7 = -1842082577;
                        i8 = iM6982 ^ i7;
                        i13 = i18;
                        abstractC15443 = abstractC15443;
                        abstractC15442 = abstractC15442;
                        th = th;
                        i17 = i8;
                        i16 = i6;
                        list2 = list;
                    } else {
                        iM6983 = (i14 - C2105.m6981("ܺܽ")) * 17;
                        i9 = ((iM6983 ^ i15) * (-30337)) ^ 578521813;
                        i10 = 385454841;
                        int i111 = i18;
                        i17 = iM6983 ^ i10;
                        i16 = i9;
                        i13 = i111;
                    }
                    break;
                case -1067934670:
                case -11968804:
                    th = th;
                    abstractC15442 = abstractC15442;
                    abstractC15443 = abstractC15443;
                    i18 = i18;
                    if (C7811.f24123 >= 0) {
                        iM6982 = (C0630.m2566("᩻֫") ^ i14) * (-75);
                        i6 = ((iM6982 ^ i15) * 20231) ^ 851934441;
                        i7 = -806153533;
                    } else {
                        iM6982 = C2105.m6981("ۢ֨") ^ i15;
                        i6 = ((iM6982 ^ i14) * 25165) ^ 885686253;
                        i7 = -682847415;
                    }
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -1042887439:
                case 1331592492:
                    th = th;
                    abstractC15442 = abstractC15442;
                    abstractC15443 = abstractC15443;
                    i18 = i18;
                    int i20 = (s * s) + 369664;
                    i11 = i20 + i20;
                    if (C1128.m3851() <= 0) {
                        iM6982 = (C0630.m2566("᩻֫") ^ i14) * (-75);
                        i6 = ((iM6982 ^ i15) * 20231) ^ 851934441;
                        i7 = -806153533;
                    } else {
                        iM6982 = (i14 - C2105.m6981("ۚ᩶")) * (-63);
                        i6 = ((iM6982 ^ i15) * 16493) ^ (-1516093857);
                        i7 = -1786491593;
                    }
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -1042564559:
                case 280174796:
                    i18 = i18;
                    C22628.m50615();
                    if (C3683.f11629 < 0) {
                        iM6983 = (C0630.m2566("᩹ۚ") ^ i15) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM6983 ^ i14) * 23177) ^ (-963063437);
                        i10 = 247650768;
                        int i112 = i18;
                        i17 = iM6983 ^ i10;
                        i16 = i9;
                        i13 = i112;
                    } else {
                        th = th;
                        abstractC15442 = abstractC15442;
                        abstractC15443 = abstractC15443;
                        iM6982 = C0630.m2566("֡ۛ") ^ i14;
                        i6 = ((iM6982 ^ i15) * (-23331)) ^ 1920434481;
                        i7 = -1010000533;
                        i8 = iM6982 ^ i7;
                        i13 = i18;
                        abstractC15443 = abstractC15443;
                        abstractC15442 = abstractC15442;
                        th = th;
                        i17 = i8;
                        i16 = i6;
                        list2 = list;
                    }
                    break;
                case -914914838:
                case -7429788:
                    if (C1128.f4106 <= 0) {
                        th = th;
                        abstractC15442 = abstractC15442;
                        abstractC15443 = abstractC15443;
                        i18 = i18;
                        iM6982 = C0630.m2566("ۙ᩻") ^ i14;
                        i6 = ((iM6982 ^ i15) * 28935) ^ (-1303848462);
                        i7 = -1036572025;
                        i8 = iM6982 ^ i7;
                        i13 = i18;
                        abstractC15443 = abstractC15443;
                        abstractC15442 = abstractC15442;
                        th = th;
                        i17 = i8;
                        i16 = i6;
                        list2 = list;
                    } else {
                        i18 = i18;
                        iM6983 = (C0630.m2566("᩹ۚ") ^ i15) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM6983 ^ i14) * 23177) ^ (-963063437);
                        i10 = 247650768;
                        int i113 = i18;
                        i17 = iM6983 ^ i10;
                        i16 = i9;
                        i13 = i113;
                    }
                    break;
                case -841440374:
                case 1723012732:
                    C1420.m4913();
                    return;
                case -783513534:
                case 1837565861:
                    th = th;
                    abstractC15442 = abstractC15442;
                    abstractC15443 = abstractC15443;
                    i18 = i18;
                    if (C3746.f11829 <= 0) {
                        iM6982 = C0630.m2566("ۙ᩻") ^ i14;
                        i6 = ((iM6982 ^ i15) * 28935) ^ (-1303848462);
                        i7 = -1036572025;
                    } else {
                        iM6982 = C0630.m2566("۠ۧ") ^ i14;
                        i6 = ((iM6982 ^ i15) * 5793) ^ (-1955700570);
                        i7 = -2130839453;
                    }
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -680301248:
                case -674348697:
                    th = th;
                    abstractC15442 = abstractC15442;
                    abstractC15443 = abstractC15443;
                    i18 = i18;
                    s = f5032[0];
                    if (C1047.f3863 >= 0) {
                        iM6982 = (C0630.m2566("᩻֫") ^ i14) * (-75);
                        i6 = ((iM6982 ^ i15) * 20231) ^ 851934441;
                        i7 = -806153533;
                    } else {
                        iM6982 = C0630.m2566("ۤۧ") ^ i15;
                        i6 = ((iM6982 ^ i14) * 15681) ^ 816526363;
                        i7 = -1143381950;
                    }
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -619761790:
                case 1233827716:
                    i12 = 10908;
                    iM6982 = (C2105.m6981("ۧ۠") + i14) * (-45);
                    i6 = ((iM6982 ^ i15) * 17707) ^ (-897047123);
                    i7 = 1424236576;
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -597239502:
                case 1261482878:
                    c7744Mo26562 = ((InterfaceC20445) charSequence).mo26562();
                    c7744 = c7744Mo26562;
                    iM6982 = C0630.m2566("ܰ᩶") ^ i15;
                    i6 = ((iM6982 ^ i14) * 8509) ^ (-921058495);
                    i7 = -501079663;
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -446851078:
                case 1540836298:
                    abstractC15441 = abstractC15442;
                    abstractC15440 = abstractC15443;
                    i3 = i18;
                    try {
                        abstractC15442 = ((C4733) abstractC3322).f15019;
                        try {
                            C17721.m41504(abstractC15442, EnumC16309.MODIFY_FILE);
                            try {
                                c17558 = new C17558();
                                c17558.m41050(abstractC15442);
                                Throwable th2 = th;
                                try {
                                    AbstractC15440 abstractC15444 = (AbstractC15440) C21923.m49339(list2, i2);
                                    int iM6984 = (C2105.m6981("ᩴۤ") ^ i15) * 63;
                                    i16 = ((iM6984 ^ i14) * 25359) ^ 869773885;
                                    i13 = i3;
                                    i17 = iM6984 ^ (-682983197);
                                    abstractC15443 = abstractC15444;
                                    th = th2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    th = th;
                                    int iM2567 = (i14 - C0630.m2566("ۜ᩹")) * (-43);
                                    i6 = ((iM2567 ^ i15) * 4465) ^ 1128188456;
                                    i8 = iM2567 ^ (-291780338);
                                    i13 = i3;
                                    abstractC15443 = abstractC15440;
                                    i17 = i8;
                                    i16 = i6;
                                    list2 = list;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                c17558 = null;
                                int iM2568 = (i14 - C0630.m2566("ۜ᩹")) * (-43);
                                i6 = ((iM2568 ^ i15) * 4465) ^ 1128188456;
                                i8 = iM2568 ^ (-291780338);
                                i13 = i3;
                                abstractC15443 = abstractC15440;
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
                        abstractC15442 = abstractC15441;
                        int iM2569 = (i14 - C0630.m2566("ۜ᩹")) * (-43);
                        i6 = ((iM2569 ^ i15) * 4465) ^ 1128188456;
                        i8 = iM2569 ^ (-291780338);
                        i13 = i3;
                        abstractC15443 = abstractC15440;
                        i17 = i8;
                        i16 = i6;
                        list2 = list;
                        break;
                    }
                    break;
                case -440658821:
                case 732042921:
                    th = th;
                    abstractC15442 = abstractC15442;
                    abstractC15443 = abstractC15443;
                    i18 = i18;
                    int i21 = s + 608;
                    if ((i21 * i21) - i11 > 0) {
                        iM6982 = (i14 - C2105.m6981("ۘܳ")) * (-9);
                        i6 = ((iM6982 ^ i15) * (-27685)) ^ (-1873864078);
                        i7 = -1290507011;
                    } else {
                        iM6982 = C0630.m2566("۫۟") ^ i15;
                        i6 = ((iM6982 ^ i14) * (-10313)) ^ (-615221343);
                        i7 = -1123177667;
                    }
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case -424756844:
                case -92809149:
                    abstractC15442 = abstractC15442;
                    abstractC15443 = abstractC15443;
                    i18 = i18;
                    try {
                        C7106.m19109(c7744);
                        th = th;
                        iM6982 = (i15 - C2105.m6981("֫ܰ")) * (-25);
                        i6 = ((iM6982 ^ i14) * (-6915)) ^ 524750619;
                        i7 = 745745034;
                        i8 = iM6982 ^ i7;
                        i13 = i18;
                        abstractC15443 = abstractC15443;
                        abstractC15442 = abstractC15442;
                        th = th;
                        i17 = i8;
                        i16 = i6;
                        list2 = list;
                    } catch (Throwable th7) {
                        int iM6985 = (C2105.m6981("ܽ᩵") + i14) * 85;
                        int i22 = ((iM6985 ^ i15) * (-22901)) ^ (-580117833);
                        i13 = i18;
                        abstractC15443 = abstractC15443;
                        i17 = iM6985 ^ 1564445608;
                        abstractC15442 = abstractC15442;
                        obj = th7;
                        i16 = i22;
                    }
                    break;
                case -357440424:
                case -67941184:
                    abstractC15441 = abstractC15442;
                    abstractC15440 = abstractC15443;
                    i3 = i18;
                    charSequence2 = c7744 == null ? charSequence : c7744;
                    iM6981 = C0630.m2566("ۚܶ") ^ i14;
                    i4 = ((iM6981 ^ i15) * (-14173)) ^ (-897920888);
                    i5 = -817144230;
                    i13 = i3;
                    abstractC15443 = abstractC15440;
                    i17 = iM6981 ^ i5;
                    i16 = i4;
                    abstractC15442 = abstractC15441;
                    break;
                case -269060309:
                case 2066158377:
                    th = th;
                    abstractC15442 = abstractC15442;
                    abstractC15443 = abstractC15443;
                    i18 = i18;
                    if (c7744 != null) {
                        iM6982 = C0630.m2566("ᩳᩴ") ^ i14;
                        i6 = ((iM6982 ^ i15) * 21343) ^ 1432974603;
                        i7 = 1331744010;
                    } else {
                        iM6982 = (i15 - C2105.m6981("֫ܰ")) * (-25);
                        i6 = ((iM6982 ^ i14) * (-6915)) ^ 524750619;
                        i7 = 745745034;
                    }
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
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
                    if (!C0483.m2121()) {
                        th = th;
                        abstractC15442 = abstractC15442;
                        abstractC15443 = abstractC15443;
                        i18 = i18;
                        iM6982 = C2105.m6981("ۖ᩵") ^ i15;
                        i6 = ((iM6982 ^ i14) * (-30657)) ^ 583934479;
                        i7 = -1748346786;
                        i8 = iM6982 ^ i7;
                        i13 = i18;
                        abstractC15443 = abstractC15443;
                        abstractC15442 = abstractC15442;
                        th = th;
                        i17 = i8;
                        i16 = i6;
                        list2 = list;
                    } else {
                        i18 = i18;
                        iM6983 = (C0630.m2566("᩹ۚ") ^ i15) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM6983 ^ i14) * 23177) ^ (-963063437);
                        i10 = 247650768;
                        int i114 = i18;
                        i17 = iM6983 ^ i10;
                        i16 = i9;
                        i13 = i114;
                    }
                    break;
                case 75402078:
                case 1143539206:
                    c7744Mo26562 = null;
                    c7744 = c7744Mo26562;
                    iM6982 = C0630.m2566("ܰ᩶") ^ i15;
                    i6 = ((iM6982 ^ i14) * 8509) ^ (-921058495);
                    i7 = -501079663;
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case 191515908:
                case 1004239275:
                    i18 = i18;
                    RunnableC0588.m2441();
                    break;
                case 243407593:
                case 1716209996:
                    th = th;
                    abstractC15442 = abstractC15442;
                    abstractC15443 = abstractC15443;
                    i18 = i18;
                    if (z) {
                        iM6982 = (i15 - C0630.m2566("ܳ۬")) * 49;
                        i6 = ((iM6982 ^ i14) * (-29211)) ^ 1684160540;
                        i7 = 680363118;
                    } else {
                        iM6982 = (C0630.m2566("֡ᩳ") + i14) * 89;
                        i6 = ((iM6982 ^ i15) * (-32351)) ^ (-2078990993);
                        i7 = 1415047131;
                    }
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case 259431400:
                case 600541602:
                    th = th;
                    abstractC15442 = abstractC15442;
                    abstractC15443 = abstractC15443;
                    i18 = i18;
                    if (C2167.f7158 >= 0) {
                        iM6982 = C2105.m6981("ᩴܽ") ^ i15;
                        i6 = ((iM6982 ^ i14) * 30365) ^ (-690963886);
                        i7 = 1039366990;
                    } else {
                        iM6982 = C0630.m2566("ۖ֡") ^ i14;
                        i6 = ((iM6982 ^ i15) * 29429) ^ 1148966979;
                        i7 = 906237920;
                    }
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case 289729846:
                case 584598982:
                    i12 = 61165;
                    iM6982 = (C2105.m6981("ۧ۠") + i14) * (-45);
                    i6 = ((iM6982 ^ i15) * 17707) ^ (-897047123);
                    i7 = 1424236576;
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
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
                    AbstractC15440 abstractC15445 = abstractC15442;
                    AbstractC15440 abstractC15446 = abstractC15443;
                    boolean z2 = abstractC3322 instanceof C4733;
                    int iM25610 = C0630.m2566("۫ܺ") ^ i15;
                    z = z2;
                    i16 = ((iM25610 ^ i14) * 23163) ^ 538427467;
                    i13 = i18;
                    abstractC15443 = abstractC15446;
                    abstractC15442 = abstractC15445;
                    th = th8;
                    i17 = iM25610 ^ (-1832102642);
                    list2 = list;
                    break;
                case 506623475:
                case 565255400:
                    i18 = i18;
                    if (c7744 != null) {
                        iM6983 = C2105.m6981("۠֨") ^ i14;
                        i9 = ((iM6983 ^ i15) * (-25601)) ^ (-2016169959);
                        i10 = -2052833570;
                    } else {
                        iM6983 = (i15 - C0630.m2566("ᩳۘ")) * (-21);
                        i9 = ((iM6983 ^ i14) * 28991) ^ 1177481780;
                        i10 = -495983346;
                    }
                    int i115 = i18;
                    i17 = iM6983 ^ i10;
                    i16 = i9;
                    i13 = i115;
                    break;
                case 609486254:
                case 1998823277:
                    C4159.m12565();
                    if (C3911.f12484 >= 0) {
                        iM6983 = (C2105.m6981("ᩳۖ") ^ i15) * (-57);
                        i18 = i18;
                        i9 = ((iM6983 ^ i14) * (-347)) ^ 1110307685;
                        i10 = 708856469;
                        int i116 = i18;
                        i17 = iM6983 ^ i10;
                        i16 = i9;
                        i13 = i116;
                    } else {
                        i18 = i18;
                        iM6982 = C2105.m6981("ۜۚ") ^ i15;
                        i6 = ((iM6982 ^ i14) * 28597) ^ (-1644807231);
                        i7 = -1842082577;
                        i8 = iM6982 ^ i7;
                        i13 = i18;
                        abstractC15443 = abstractC15443;
                        abstractC15442 = abstractC15442;
                        th = th;
                        i17 = i8;
                        i16 = i6;
                        list2 = list;
                    }
                    break;
                case 904494924:
                case 1530082280:
                    th = th;
                    abstractC15442 = abstractC15442;
                    abstractC15443 = abstractC15443;
                    i18 = i18;
                    if (C1128.f4106 <= 0) {
                        iM6982 = C0630.m2566("֡ۛ") ^ i14;
                        i6 = ((iM6982 ^ i15) * (-23331)) ^ 1920434481;
                        i7 = -1010000533;
                    } else {
                        iM6982 = (C0630.m2566("᩶ۛ") + i15) * 81;
                        i6 = ((iM6982 ^ i14) * (-8985)) ^ 1784005678;
                        i7 = -737684058;
                    }
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case 1101419037:
                case 1930103489:
                    th = th;
                    abstractC15442 = abstractC15442;
                    abstractC15443 = abstractC15443;
                    i18 = i18;
                    if (C7811.f24123 >= 0) {
                        iM6982 = C0630.m2566("֡ۛ") ^ i14;
                        i6 = ((iM6982 ^ i15) * (-23331)) ^ 1920434481;
                        i7 = -1010000533;
                    } else {
                        iM6982 = C0630.m2566("ܿ᩻") ^ i15;
                        i6 = ((iM6982 ^ i14) * (-9391)) ^ (-826927282);
                        i7 = 634106547;
                    }
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                case 1159910405:
                case 1666021356:
                    if (C0237.f1507 == 0) {
                        th = th;
                        abstractC15442 = abstractC15442;
                        abstractC15443 = abstractC15443;
                        i18 = i18;
                        iM6982 = C2105.m6981("ᩴܽ") ^ i15;
                        i6 = ((iM6982 ^ i14) * 30365) ^ (-690963886);
                        i7 = 1039366990;
                        i8 = iM6982 ^ i7;
                        i13 = i18;
                        abstractC15443 = abstractC15443;
                        abstractC15442 = abstractC15442;
                        th = th;
                        i17 = i8;
                        i16 = i6;
                        list2 = list;
                    } else {
                        iM6983 = (C2105.m6981("ᩳۖ") ^ i15) * (-57);
                        i18 = i18;
                        i9 = ((iM6983 ^ i14) * (-347)) ^ 1110307685;
                        i10 = 708856469;
                        int i117 = i18;
                        i17 = iM6983 ^ i10;
                        i16 = i9;
                        i13 = i117;
                    }
                    break;
                case 1528695984:
                case 2099905960:
                    abstractC15442 = abstractC15442;
                    abstractC15443 = abstractC15443;
                    i18 = i18;
                    C2167.m7154(th, obj);
                    th = th;
                    iM6982 = (i15 - C2105.m6981("֫ܰ")) * (-25);
                    i6 = ((iM6982 ^ i14) * (-6915)) ^ 524750619;
                    i7 = 745745034;
                    i8 = iM6982 ^ i7;
                    i13 = i18;
                    abstractC15443 = abstractC15443;
                    abstractC15442 = abstractC15442;
                    th = th;
                    i17 = i8;
                    i16 = i6;
                    list2 = list;
                    break;
                default:
                    i3 = i18;
                    try {
                        C17622.m41188(abstractC15443, charSequence2);
                        abstractC15440 = abstractC15443;
                        try {
                            abstractC15442.m36497(new InterfaceC12766() { // from class: l.ۘ᩸ᩳ
                                @Override // l.InterfaceC12061
                                /* JADX INFO: renamed from: ֫ */
                                public final void mo8487(AbstractC15440 abstractC15447) throws IOException {
                                    C1394.m4879(str, i, list2, abstractC15447);
                                }
                            });
                            c17558.m41052(abstractC15442);
                            abstractC15441 = abstractC15442;
                            try {
                                C14463.m34554(C2958.m9025(abstractC15442), false);
                                iM6981 = C2105.m6981("ܿ۬") ^ i15;
                                i4 = ((iM6981 ^ i14) * 28649) ^ (-1660135533);
                                i5 = -357215341;
                                i13 = i3;
                                abstractC15443 = abstractC15440;
                                i17 = iM6981 ^ i5;
                                i16 = i4;
                                abstractC15442 = abstractC15441;
                            } catch (Throwable th9) {
                                th = th9;
                                th = th;
                                abstractC15442 = abstractC15441;
                                int iM25611 = (i14 - C0630.m2566("ۜ᩹")) * (-43);
                                i6 = ((iM25611 ^ i15) * 4465) ^ 1128188456;
                                i8 = iM25611 ^ (-291780338);
                                i13 = i3;
                                abstractC15443 = abstractC15440;
                                i17 = i8;
                                i16 = i6;
                                list2 = list;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            th = th;
                            int iM25612 = (i14 - C0630.m2566("ۜ᩹")) * (-43);
                            i6 = ((iM25612 ^ i15) * 4465) ^ 1128188456;
                            i8 = iM25612 ^ (-291780338);
                            i13 = i3;
                            abstractC15443 = abstractC15440;
                            i17 = i8;
                            i16 = i6;
                            list2 = list;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        abstractC15440 = abstractC15443;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4879(String str, int i, List list, AbstractC15440 abstractC15440) throws IOException {
        C5628 c5628 = new C5628(abstractC15440.mo23555(false));
        C0521 c0521 = c5628.f17399;
        m4877(c5628, (CharSequence) null, str, i, list, (C22749) null);
        if (c0521.f2177 != 0) {
            MessageDigest messageDigestM34526 = C14460.m34526();
            messageDigestM34526.update(c0521.f2176, 0, c0521.f2177);
            C16398.m38654(C14460.m34531(messageDigestM34526.digest()), C14776.m35153(i));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4881(AbstractC3322 abstractC3322, CharSequence charSequence, String str, C23077 c23077) {
        m4882(abstractC3322, charSequence, str, c23077, (C22749) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4883(AbstractC3322 abstractC3322, String str, C23077 c23077, C22749 c22749) {
        m4882(abstractC3322, (CharSequence) null, str, c23077, c22749);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4878(CharSequence charSequence, String str, C23077 c23077, C22749 c22749, AbstractC15440 abstractC15440) throws IOException {
        C5628 c5628 = new C5628(abstractC15440.mo23555(false));
        C0521 c0521 = c5628.f17399;
        m4877(c5628, charSequence, str, c23077.f74223, (List) null, c22749);
        if (c0521.f2177 != 0) {
            MessageDigest messageDigestM34526 = C14460.m34526();
            messageDigestM34526.update(c0521.f2176, 0, c0521.f2177);
            C16398.m38654(C14460.m34531(messageDigestM34526.digest()), C14776.m35153(c23077.f74223));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4884(AbstractC15440 abstractC15440, CharSequence charSequence, String str, int i) {
        C7744 c7744Mo26562 = charSequence instanceof InterfaceC20445 ? ((InterfaceC20445) charSequence).mo26562() : null;
        CharSequence charSequence2 = c7744Mo26562 == null ? charSequence : c7744Mo26562;
        try {
            abstractC15440.mo35195();
            abstractC15440.mo27915(new C19740(charSequence2, str, i, C16999.m39879(abstractC15440) && !abstractC15440.mo23120(), abstractC15440)).m47984();
            if (c7744Mo26562 != null) {
                c7744Mo26562.close();
            }
        } catch (Throwable th) {
            if (c7744Mo26562 != null) {
                try {
                    c7744Mo26562.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m4887(AbstractC15440 abstractC15440, CharSequence charSequence, String str, int i) {
        C7744 c7744Mo26562 = charSequence instanceof InterfaceC20445 ? ((InterfaceC20445) charSequence).mo26562() : null;
        try {
            m4877(abstractC15440.mo23555(false), c7744Mo26562 == null ? charSequence : c7744Mo26562, str, i, (List) null, (C22749) null);
            if (c7744Mo26562 != null) {
                c7744Mo26562.close();
            }
        } catch (Throwable th) {
            if (c7744Mo26562 != null) {
                try {
                    c7744Mo26562.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m4876(CharSequence charSequence) {
        if (!(charSequence instanceof C7744)) {
            return charSequence.toString();
        }
        C7744 c7744 = (C7744) charSequence;
        return c7744.subSequence(0, c7744.length());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4885(AbstractC15440 abstractC15440, String str, int i, C22749 c22749) {
        m4877(abstractC15440.mo23555(false), (CharSequence) null, str, i, (List) null, c22749);
    }
}
