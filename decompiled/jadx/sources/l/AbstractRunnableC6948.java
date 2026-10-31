package l;

import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۜᩴۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: D20P */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC6948 implements Runnable {

    /* JADX INFO: renamed from: ۫᩹ܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f21420 = {6906, -21795, -21848, -21816, -21807, -21814, -21810, 5327, 27690, 27761, 27744, 27766, 27761, 27703, 27747, 27748, 27766, 27761, 27738, 27760, 27767, 27753, 27766, 27769, 27747, 27748, 27766, 27761, 27738, 27760, 27767, 27753, 27766, 27738, 27744, 27773, 27765, 27756, 27767, 27744, 27745, 27733, 27722, 27734, 27729};

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC18132 f21421;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18621 f21422;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f21423;

    @Override // java.lang.Runnable
    public final void run() {
        C18621 c18621;
        short s = f21420[7];
        int i = (s * 2) + 1;
        int i2 = s + 1;
        int i3 = i - (i2 * i2) > 0 ? 16955 : 27653;
        try {
            byte[] bArr = new byte[1024];
            for (int i4 = 0; i4 < 1024; i4++) {
                bArr[i4] = (byte) (i4 & 255);
            }
            C9449 c9449 = new C9449();
            c9449.m24282(this.f21421.mo39359(C1005.m3502(f21420, 8, 6, i3)));
            c9449.m24277(C2126.m7036(f21420, 41, 4, i3), AbstractC2393.m7755(C18237.f56669, bArr));
            C8743 c8743M24274 = c9449.m24274();
            C1294.m4371();
            C18621 c18621Execute = C18237.m42478().m40469(c8743M24274).execute();
            this.f21422 = c18621Execute;
            if (m18769(c18621Execute, bArr)) {
                C1294.m4371();
                C11003.toString(this.f21421);
                int i5 = C9065.f27486;
                this.f21423 = true;
            } else {
                C11003.toString(this.f21421);
                int i6 = C9065.f27486;
            }
        } catch (SocketTimeoutException unused) {
            C11003.toString(this.f21421);
            int i7 = C9065.f27486;
        } catch (Throwable th) {
            C11003.toString(this.f21421);
            C0050.m947(th);
            int i8 = C9065.f27486;
        }
        C21060 c21060 = (C21060) this;
        c21060.f67930.getAndIncrement();
        if (!c21060.f21423) {
            if (C0714.m2817(c21060.f67928) != 0 || (c18621 = c21060.f21422) == null) {
                return;
            }
            AbstractC18132.m42250(c18621);
            return;
        }
        int andIncrement = c21060.f67928.getAndIncrement();
        if (andIncrement >= C9065.f27488) {
            return;
        }
        if (andIncrement == 0) {
            AbstractC18132.m42250(c21060.f21422);
            synchronized (c21060.f67929.f29554) {
                c21060.f67929.f29554.addFirst(c21060.f21421);
            }
        }
        c21060.f67931[andIncrement] = c21060.f21421;
        if (andIncrement == C9065.f27488 - 1) {
            LinkedList linkedList = new LinkedList();
            Collections.addAll(linkedList, c21060.f67931);
            C9065.f27487.edit().putString(C1128.m3841(f21420, 14, 9, i3), C9679.m24609(linkedList, C3683.m11225(f21420, 23, 1, i3))).putLong(C0630.m2575(f21420, 24, 17, i3), ViewOnClickListenerC1958.m6432() + 604800000).apply();
            c21060.f67929.f29554 = linkedList;
            Arrays.toString(c21060.f67931);
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0221 A[PHI: r7 r18
      0x0221: PHI (r7v3 short) = (r7v2 short), (r7v4 short) binds: [B:80:0x030a, B:60:0x021f] A[DONT_GENERATE, DONT_INLINE]
      0x0221: PHI (r18v17 java.lang.String) = (r18v12 java.lang.String), (r18v18 java.lang.String) binds: [B:80:0x030a, B:60:0x021f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x02d9 A[PHI: r6 r9 r10 r11 r18 r19
      0x02d9: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:76:0x02d7, B:64:0x0248, B:46:0x0159, B:42:0x012e, B:10:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r9v4 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v3 short[]), (r9v2 short[]), (r9v2 short[]) binds: [B:76:0x02d7, B:64:0x0248, B:46:0x0159, B:42:0x012e, B:10:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r10v8 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:76:0x02d7, B:64:0x0248, B:46:0x0159, B:42:0x012e, B:10:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r11v8 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:76:0x02d7, B:64:0x0248, B:46:0x0159, B:42:0x012e, B:10:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r18v31 java.lang.String) = 
      (r18v13 java.lang.String)
      (r18v16 java.lang.String)
      (r18v25 java.lang.String)
      (r18v27 java.lang.String)
      (r18v32 java.lang.String)
     binds: [B:76:0x02d7, B:64:0x0248, B:46:0x0159, B:42:0x012e, B:10:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:76:0x02d7, B:64:0x0248, B:46:0x0159, B:42:0x012e, B:10:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        if (l.RunnableC3474.m10630() != false) goto L17;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m18769(C18621 c18621, byte[] bArr) {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int i5 = C3911.f12484;
        int i6 = C7811.f24123;
        int iM6982 = C2105.m6981("ۨۢ") ^ i6;
        int i7 = ((iM6982 ^ i5) * 11341) ^ 2125832131;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM6982 ^ (-964325285);
        String strM43169 = null;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 2053834261;
        while (true) {
            i16 = i8 ^ (i7 & (((i16 ^ i5) * (-5555)) >> 31));
            switch (i16) {
                case -2126319127:
                case -1431255498:
                    strM43169 = strM43169;
                    if (i10 - (s * s2) < 0) {
                        iM2566 = (C0630.m2566("ۜ᩷") ^ i6) * (-107);
                        i3 = ((iM2566 ^ i5) * 21709) ^ (-1664772829);
                        i4 = -1743871361;
                    } else {
                        iM2566 = (i5 - C2105.m6981("֫᩺")) * 75;
                        i3 = ((iM2566 ^ i6) * 31887) ^ 1871152080;
                        i4 = -578045977;
                    }
                    String str = strM43169;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    strM43169 = str;
                    break;
                case -2004858622:
                case 1695515717:
                    C21923.m49329();
                    return false;
                case -1684229879:
                case -1267524077:
                    return true;
                case -1667280464:
                case -315065673:
                    C2958.m9034();
                    if (C4263.f13799 > 0) {
                        strM43169 = strM43169;
                        iM2566 = C2105.m6981("ۤ᩵") ^ i5;
                        i3 = ((iM2566 ^ i6) * 26647) ^ 1469198837;
                        i4 = 1199601002;
                        String str2 = strM43169;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                        strM43169 = str2;
                    }
                    strM43169 = strM43169;
                    iM2566 = (i6 - C0630.m2566("᩺֨")) * 55;
                    i3 = ((iM2566 ^ i5) * 3987) ^ (-2019413101);
                    i4 = 1815972287;
                    String str3 = strM43169;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    strM43169 = str3;
                    break;
                case -1657796699:
                case -320435930:
                    strM43169 = strM43169;
                    s2 = 6138;
                    if (C1420.f5096 <= 0) {
                        strM43169 = strM43169;
                        iM2566 = (C0630.m2566("ۜܶ") ^ i5) * 123;
                        strM43169 = strM43169;
                        i3 = ((iM2566 ^ i6) * 13411) ^ (-1309258479);
                        i4 = 1728756599;
                    } else {
                        iM2566 = (C0630.m2566("ܺܳ") + i6) * (-61);
                        i3 = ((iM2566 ^ i5) * (-2845)) ^ (-1122875712);
                        i4 = 869868470;
                    }
                    String str4 = strM43169;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    strM43169 = str4;
                    break;
                case -1625569017:
                case 541495559:
                    strM43169 = strM43169;
                    i10 = i9 + 9418761;
                    if (C0964.f3626 != 0) {
                        iM2566 = (i6 - C0630.m2566("᩺֨")) * 55;
                        i3 = ((iM2566 ^ i5) * 3987) ^ (-2019413101);
                        i4 = 1815972287;
                    } else {
                        iM2566 = C2105.m6981("ܿ֡") ^ i5;
                        i3 = ((iM2566 ^ i6) * (-1841)) ^ (-1578231437);
                        i4 = 168118641;
                    }
                    String str5 = strM43169;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    strM43169 = str5;
                    break;
                case -1587305618:
                case 1685610910:
                    C3432.m10477();
                    break;
                case -1381800307:
                case 1541061181:
                    if (C2167.f7158 >= 0) {
                        iM6981 = (C0630.m2566("᩷ۚ") + i5) * 3;
                        i = ((iM6981 ^ i6) * 10329) ^ 510297968;
                        i2 = 1502305983;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    } else {
                        strM43169 = strM43169;
                        iM2566 = (i6 - C0630.m2566("᩺֨")) * 55;
                        i3 = ((iM2566 ^ i5) * 3987) ^ (-2019413101);
                        i4 = 1815972287;
                        String str6 = strM43169;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                        strM43169 = str6;
                    }
                    break;
                case -1192382368:
                case -273921214:
                    if (RunnableC3474.f10992 <= 0) {
                        strM43169 = strM43169;
                        i13 = 4;
                        iM2566 = (i6 - C0630.m2566("᩺֨")) * 55;
                        i3 = ((iM2566 ^ i5) * 3987) ^ (-2019413101);
                        i4 = 1815972287;
                        String str7 = strM43169;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                        strM43169 = str7;
                    } else {
                        int iM6983 = (i6 - C2105.m6981("᩹ۚ")) * 7;
                        i8 = iM6983 ^ 648916659;
                        i7 = ((iM6983 ^ i5) * 16327) ^ 296489302;
                        i13 = 4;
                    }
                    break;
                case -1103609858:
                case 2044418949:
                    i11 = 43653;
                    iM2566 = (i6 - C2105.m6981("۫۬")) * 63;
                    i3 = ((iM2566 ^ i5) * (-6647)) ^ 1441626788;
                    i4 = 1037312583;
                    String str8 = strM43169;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    strM43169 = str8;
                    break;
                case -670619082:
                case -70030631:
                    strM43169 = c18621.m43169(C2105.m6988(sArr2, i12, i13, i11));
                    if (C1294.m4372() <= 0) {
                        iM2566 = (C0630.m2566("ۜܶ") ^ i5) * 123;
                        strM43169 = strM43169;
                        i3 = ((iM2566 ^ i6) * 13411) ^ (-1309258479);
                        i4 = 1728756599;
                    } else {
                        iM2566 = C0630.m2566("֨ۘ") ^ i5;
                        strM43169 = strM43169;
                        i3 = ((iM2566 ^ i6) * (-9315)) ^ (-1385118515);
                        i4 = 479681040;
                    }
                    String str9 = strM43169;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    strM43169 = str9;
                    break;
                case -631232805:
                case 1235764999:
                    return false;
                case -406523560:
                case 815126948:
                    strM43169 = strM43169;
                    s = sArr[c];
                    i9 = s * s;
                    if (C2958.f9394 >= 0) {
                        iM2566 = (C0630.m2566("֫ܶ") ^ i6) * (-17);
                        i3 = ((iM2566 ^ i5) * (-18753)) ^ 1616577423;
                        i4 = -2102708455;
                    } else {
                        iM2566 = (C0630.m2566("ۨ֨") + i6) * 69;
                        i3 = ((iM2566 ^ i5) * 30631) ^ 231531130;
                        i4 = -697894940;
                    }
                    String str10 = strM43169;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    strM43169 = str10;
                    break;
                case -393861832:
                case 2140394538:
                    sArr2 = f21420;
                    if (C4616.f14690 <= 0) {
                        strM43169 = strM43169;
                        i12 = 1;
                        iM2566 = (i6 - C0630.m2566("᩺֨")) * 55;
                        i3 = ((iM2566 ^ i5) * 3987) ^ (-2019413101);
                        i4 = 1815972287;
                        String str11 = strM43169;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                        strM43169 = str11;
                    } else {
                        int iM6984 = (C2105.m6981("ۨܽ") + i5) * (-17);
                        i8 = iM6984 ^ 1165463220;
                        i7 = ((iM6984 ^ i6) * 9259) ^ (-887883111);
                        i12 = 1;
                    }
                    break;
                case -294333220:
                case 586251164:
                    if (!ViewOnClickListenerC1958.m6437(C0237.m1483(sArr3, i14, i15, i11), strM43169)) {
                        iM2566 = C0630.m2566("ۖ᩵") ^ i6;
                        strM43169 = strM43169;
                        i3 = ((iM2566 ^ i5) * 12261) ^ (-256348547);
                        i4 = -128422881;
                        String str12 = strM43169;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                        strM43169 = str12;
                    } else {
                        iM6981 = C2105.m6981("ܽ֨") ^ i5;
                        i = ((iM6981 ^ i6) * (-24729)) ^ 317343167;
                        i2 = 390531855;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    }
                    break;
                case -240858351:
                case 820962145:
                    if (!Arrays.equals(c18621.m43170().m1614(), bArr)) {
                        iM2566 = C0630.m2566("ۖ᩵") ^ i6;
                        strM43169 = strM43169;
                        i3 = ((iM2566 ^ i5) * 12261) ^ (-256348547);
                        i4 = -128422881;
                        String str13 = strM43169;
                        i8 = iM2566 ^ i4;
                        i7 = i3;
                        strM43169 = str13;
                    } else {
                        iM6981 = (C0630.m2566("ۡ᩵") + i6) * 21;
                        i = ((iM6981 ^ i5) * (-17735)) ^ (-465571608);
                        i2 = 55536030;
                        i8 = iM6981 ^ i2;
                        i7 = i;
                    }
                    break;
                case -136432675:
                case 1186801534:
                    if (c18621.m43173()) {
                        strM43169 = strM43169;
                        iM2566 = C0630.m2566("ܶ᩵") ^ i5;
                        i3 = ((iM2566 ^ i6) * 18965) ^ 1028834083;
                        i4 = 241564370;
                    } else {
                        iM2566 = C0630.m2566("ۖ᩵") ^ i6;
                        strM43169 = strM43169;
                        i3 = ((iM2566 ^ i5) * 12261) ^ (-256348547);
                        i4 = -128422881;
                    }
                    String str14 = strM43169;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    strM43169 = str14;
                    break;
                case 87964839:
                case 476600188:
                    strM43169 = strM43169;
                    c = 0;
                    if (C0714.f2697 >= 0) {
                        iM2566 = C2105.m6981("ۤ᩵") ^ i5;
                        i3 = ((iM2566 ^ i6) * 26647) ^ 1469198837;
                        i4 = 1199601002;
                    } else {
                        iM2566 = C0630.m2566("᩹۠") ^ i5;
                        i3 = ((iM2566 ^ i6) * 32143) ^ 186136327;
                        i4 = -696925130;
                    }
                    String str15 = strM43169;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    strM43169 = str15;
                    break;
                case 949021171:
                case 1043565397:
                    i11 = 32346;
                    iM2566 = (i6 - C2105.m6981("۫۬")) * 63;
                    i3 = ((iM2566 ^ i5) * (-6647)) ^ 1441626788;
                    i4 = 1037312583;
                    String str16 = strM43169;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    strM43169 = str16;
                    break;
                case 1446337824:
                case 2133144973:
                    C1420.m4913();
                    iM2566 = (C0630.m2566("ۜܶ") ^ i5) * 123;
                    strM43169 = strM43169;
                    i3 = ((iM2566 ^ i6) * 13411) ^ (-1309258479);
                    i4 = 1728756599;
                    String str17 = strM43169;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    strM43169 = str17;
                    break;
                case 1663958285:
                case 2005662071:
                    strM43169 = strM43169;
                    sArr = f21420;
                    if (C3663.f11553) {
                        iM2566 = (i6 - C0630.m2566("᩺֨")) * 55;
                        i3 = ((iM2566 ^ i5) * 3987) ^ (-2019413101);
                        i4 = 1815972287;
                    } else {
                        iM2566 = C2105.m6981("ۙ᩵") ^ i5;
                        i3 = ((iM2566 ^ i6) * 2007) ^ (-1087086791);
                        i4 = -471993330;
                    }
                    String str18 = strM43169;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    strM43169 = str18;
                    break;
                case 1987777453:
                case 2004191718:
                    strM43169 = strM43169;
                    if (C11340.f33930 >= 0) {
                        strM43169 = strM43169;
                        iM2566 = (C0630.m2566("ۜܶ") ^ i5) * 123;
                        strM43169 = strM43169;
                        i3 = ((iM2566 ^ i6) * 13411) ^ (-1309258479);
                        i4 = 1728756599;
                    } else {
                        iM2566 = C0630.m2566("֡ۧ") ^ i6;
                        i3 = ((iM2566 ^ i5) * (-23067)) ^ 268543230;
                        i4 = -757232340;
                    }
                    String str19 = strM43169;
                    i8 = iM2566 ^ i4;
                    i7 = i3;
                    strM43169 = str19;
                    break;
                default:
                    sArr3 = f21420;
                    i14 = 5;
                    i15 = 2;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = (C0630.m2566("᩷ۚ") + i5) * 3;
                        i = ((iM6981 ^ i6) * 10329) ^ 510297968;
                        i2 = 1502305983;
                    } else {
                        iM6981 = C0630.m2566("ᩴܶ") ^ i6;
                        i = ((iM6981 ^ i5) * (-2743)) ^ (-704560176);
                        i2 = 1602693849;
                    }
                    i8 = iM6981 ^ i2;
                    i7 = i;
                    break;
            }
        }
    }
}
