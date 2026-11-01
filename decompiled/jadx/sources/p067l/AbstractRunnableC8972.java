package p067l;

import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۜᩴۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: D20P */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC8972 implements Runnable {

    /* JADX INFO: renamed from: ۫᩹ܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f82040 = {6906, -21795, -21848, -21816, -21807, -21814, -21810, 5327, 27690, 27761, 27744, 27766, 27761, 27703, 27747, 27748, 27766, 27761, 27738, 27760, 27767, 27753, 27766, 27769, 27747, 27748, 27766, 27761, 27738, 27760, 27767, 27753, 27766, 27738, 27744, 27773, 27765, 27756, 27767, 27744, 27745, 27733, 27722, 27734, 27729};

    /* JADX INFO: renamed from: ᩶ */
    public AbstractC19601 f24303;

    /* JADX INFO: renamed from: ᩸ */
    public C20066 f24304;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f24305;

    @Override // java.lang.Runnable
    public final void run() {
        C20066 c20066;
        short s = f82040[7];
        int i = (s * 2) + 1;
        int i2 = s + 1;
        int i3 = i - (i2 * i2) > 0 ? 16955 : 27653;
        try {
            byte[] bArr = new byte[1024];
            for (int i4 = 0; i4 < 1024; i4++) {
                bArr[i4] = (byte) (i4 & 255);
            }
            C11349 c11349 = new C11349();
            c11349.m26292(this.f24303.mo41595(C0892.m55750(f82040, 8, 6, i3)));
            c11349.m26287(C0947.m55993(f82040, 41, 4, i3), AbstractC4643.m9818(C19701.f59888, bArr));
            C10678 c10678M26284 = c11349.m26284();
            C0906.m55808();
            C20066 c20066Execute = C19701.m44737().m42716(c10678M26284).execute();
            this.f24304 = c20066Execute;
            if (m20723(c20066Execute, bArr)) {
                C0906.m55808();
                C12826.toString(this.f24303);
                int i5 = C10984.f30423;
                this.f24305 = true;
            } else {
                C12826.toString(this.f24303);
                int i6 = C10984.f30423;
            }
        } catch (SocketTimeoutException unused) {
            C12826.toString(this.f24303);
            int i7 = C10984.f30423;
        } catch (Throwable th) {
            C12826.toString(this.f24303);
            C0845.m55591(th);
            int i8 = C10984.f30423;
        }
        C22384 c22384 = (C22384) this;
        c22384.f70614.getAndIncrement();
        if (!c22384.f24305) {
            if (C0877.m55708(c22384.f70612) != 0 || (c20066 = c22384.f24304) == null) {
                return;
            }
            AbstractC19601.m44510(c20066);
            return;
        }
        int andIncrement = c22384.f70612.getAndIncrement();
        if (andIncrement >= C10984.f30425) {
            return;
        }
        if (andIncrement == 0) {
            AbstractC19601.m44510(c22384.f24304);
            synchronized (c22384.f70613.f32506) {
                c22384.f70613.f32506.addFirst(c22384.f24303);
            }
        }
        c22384.f70615[andIncrement] = c22384.f24303;
        if (andIncrement == C10984.f30425 - 1) {
            LinkedList linkedList = new LinkedList();
            Collections.addAll(linkedList, c22384.f70615);
            C10984.f30424.edit().putString(C0898.m55792(f82040, 14, 9, i3), C11567.m26623(linkedList, C1025.m56233(f82040, 23, 1, i3))).putLong(C0873.m55689(f82040, 24, 17, i3), ViewOnClickListenerC0939.m55944() + 604800000).apply();
            c22384.f70613.f32506 = linkedList;
            Arrays.toString(c22384.f70615);
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
    
        if (p067l.RunnableC1014.m56177() != false) goto L17;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m20723(C20066 c20066, byte[] bArr) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int i5 = C1036.f81953;
        int i6 = C1229.f82066;
        int iM559710 = C0946.m55979("ۨۢ") ^ i6;
        int i7 = ((iM559710 ^ i5) * 11341) ^ 2125832131;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM559710 ^ (-964325285);
        String strM45435 = null;
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
                    strM45435 = strM45435;
                    if (i10 - (s * s2) < 0) {
                        iM55680 = (C0873.m55680("ۜ᩷") ^ i6) * (-107);
                        i3 = ((iM55680 ^ i5) * 21709) ^ (-1664772829);
                        i4 = -1743871361;
                    } else {
                        iM55680 = (i5 - C0946.m55979("֫᩺")) * 75;
                        i3 = ((iM55680 ^ i6) * 31887) ^ 1871152080;
                        i4 = -578045977;
                    }
                    String str = strM45435;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    strM45435 = str;
                    break;
                case -2004858622:
                case 1695515717:
                    C1929.m56553();
                    return false;
                case -1684229879:
                case -1267524077:
                    return true;
                case -1667280464:
                case -315065673:
                    C0989.m56095();
                    if (C1053.f81965 > 0) {
                        strM45435 = strM45435;
                        iM55680 = C0946.m55979("ۤ᩵") ^ i5;
                        i3 = ((iM55680 ^ i6) * 26647) ^ 1469198837;
                        i4 = 1199601002;
                        String str2 = strM45435;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                        strM45435 = str2;
                    }
                    strM45435 = strM45435;
                    iM55680 = (i6 - C0873.m55680("᩺֨")) * 55;
                    i3 = ((iM55680 ^ i5) * 3987) ^ (-2019413101);
                    i4 = 1815972287;
                    String str3 = strM45435;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    strM45435 = str3;
                    break;
                case -1657796699:
                case -320435930:
                    strM45435 = strM45435;
                    s2 = 6138;
                    if (C0912.f81867 <= 0) {
                        strM45435 = strM45435;
                        iM55680 = (C0873.m55680("ۜܶ") ^ i5) * 123;
                        strM45435 = strM45435;
                        i3 = ((iM55680 ^ i6) * 13411) ^ (-1309258479);
                        i4 = 1728756599;
                    } else {
                        iM55680 = (C0873.m55680("ܺܳ") + i6) * (-61);
                        i3 = ((iM55680 ^ i5) * (-2845)) ^ (-1122875712);
                        i4 = 869868470;
                    }
                    String str4 = strM45435;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    strM45435 = str4;
                    break;
                case -1625569017:
                case 541495559:
                    strM45435 = strM45435;
                    i10 = i9 + 9418761;
                    if (C0890.f81849 != 0) {
                        iM55680 = (i6 - C0873.m55680("᩺֨")) * 55;
                        i3 = ((iM55680 ^ i5) * 3987) ^ (-2019413101);
                        i4 = 1815972287;
                    } else {
                        iM55680 = C0946.m55979("ܿ֡") ^ i5;
                        i3 = ((iM55680 ^ i6) * (-1841)) ^ (-1578231437);
                        i4 = 168118641;
                    }
                    String str5 = strM45435;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    strM45435 = str5;
                    break;
                case -1587305618:
                case 1685610910:
                    C1012.m56134();
                    break;
                case -1381800307:
                case 1541061181:
                    if (C0949.f81897 >= 0) {
                        iM55979 = (C0873.m55680("᩷ۚ") + i5) * 3;
                        i = ((iM55979 ^ i6) * 10329) ^ 510297968;
                        i2 = 1502305983;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    } else {
                        strM45435 = strM45435;
                        iM55680 = (i6 - C0873.m55680("᩺֨")) * 55;
                        i3 = ((iM55680 ^ i5) * 3987) ^ (-2019413101);
                        i4 = 1815972287;
                        String str6 = strM45435;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                        strM45435 = str6;
                    }
                    break;
                case -1192382368:
                case -273921214:
                    if (RunnableC1014.f81941 <= 0) {
                        strM45435 = strM45435;
                        i13 = 4;
                        iM55680 = (i6 - C0873.m55680("᩺֨")) * 55;
                        i3 = ((iM55680 ^ i5) * 3987) ^ (-2019413101);
                        i4 = 1815972287;
                        String str7 = strM45435;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                        strM45435 = str7;
                    } else {
                        int iM559711 = (i6 - C0946.m55979("᩹ۚ")) * 7;
                        i8 = iM559711 ^ 648916659;
                        i7 = ((iM559711 ^ i5) * 16327) ^ 296489302;
                        i13 = 4;
                    }
                    break;
                case -1103609858:
                case 2044418949:
                    i11 = 43653;
                    iM55680 = (i6 - C0946.m55979("۫۬")) * 63;
                    i3 = ((iM55680 ^ i5) * (-6647)) ^ 1441626788;
                    i4 = 1037312583;
                    String str8 = strM45435;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    strM45435 = str8;
                    break;
                case -670619082:
                case -70030631:
                    strM45435 = c20066.m45435(C0946.m55986(sArr2, i12, i13, i11));
                    if (C0906.m55809() <= 0) {
                        iM55680 = (C0873.m55680("ۜܶ") ^ i5) * 123;
                        strM45435 = strM45435;
                        i3 = ((iM55680 ^ i6) * 13411) ^ (-1309258479);
                        i4 = 1728756599;
                    } else {
                        iM55680 = C0873.m55680("֨ۘ") ^ i5;
                        strM45435 = strM45435;
                        i3 = ((iM55680 ^ i6) * (-9315)) ^ (-1385118515);
                        i4 = 479681040;
                    }
                    String str9 = strM45435;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    strM45435 = str9;
                    break;
                case -631232805:
                case 1235764999:
                    return false;
                case -406523560:
                case 815126948:
                    strM45435 = strM45435;
                    s = sArr[c];
                    i9 = s * s;
                    if (C0989.f81920 >= 0) {
                        iM55680 = (C0873.m55680("֫ܶ") ^ i6) * (-17);
                        i3 = ((iM55680 ^ i5) * (-18753)) ^ 1616577423;
                        i4 = -2102708455;
                    } else {
                        iM55680 = (C0873.m55680("ۨ֨") + i6) * 69;
                        i3 = ((iM55680 ^ i5) * 30631) ^ 231531130;
                        i4 = -697894940;
                    }
                    String str10 = strM45435;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    strM45435 = str10;
                    break;
                case -393861832:
                case 2140394538:
                    sArr2 = f82040;
                    if (C1071.f81975 <= 0) {
                        strM45435 = strM45435;
                        i12 = 1;
                        iM55680 = (i6 - C0873.m55680("᩺֨")) * 55;
                        i3 = ((iM55680 ^ i5) * 3987) ^ (-2019413101);
                        i4 = 1815972287;
                        String str11 = strM45435;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                        strM45435 = str11;
                    } else {
                        int iM559712 = (C0946.m55979("ۨܽ") + i5) * (-17);
                        i8 = iM559712 ^ 1165463220;
                        i7 = ((iM559712 ^ i6) * 9259) ^ (-887883111);
                        i12 = 1;
                    }
                    break;
                case -294333220:
                case 586251164:
                    if (!ViewOnClickListenerC0939.m55949(C0854.m55597(sArr3, i14, i15, i11), strM45435)) {
                        iM55680 = C0873.m55680("ۖ᩵") ^ i6;
                        strM45435 = strM45435;
                        i3 = ((iM55680 ^ i5) * 12261) ^ (-256348547);
                        i4 = -128422881;
                        String str12 = strM45435;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                        strM45435 = str12;
                    } else {
                        iM55979 = C0946.m55979("ܽ֨") ^ i5;
                        i = ((iM55979 ^ i6) * (-24729)) ^ 317343167;
                        i2 = 390531855;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    }
                    break;
                case -240858351:
                case 820962145:
                    if (!Arrays.equals(c20066.m45436().m4014(), bArr)) {
                        iM55680 = C0873.m55680("ۖ᩵") ^ i6;
                        strM45435 = strM45435;
                        i3 = ((iM55680 ^ i5) * 12261) ^ (-256348547);
                        i4 = -128422881;
                        String str13 = strM45435;
                        i8 = iM55680 ^ i4;
                        i7 = i3;
                        strM45435 = str13;
                    } else {
                        iM55979 = (C0873.m55680("ۡ᩵") + i6) * 21;
                        i = ((iM55979 ^ i5) * (-17735)) ^ (-465571608);
                        i2 = 55536030;
                        i8 = iM55979 ^ i2;
                        i7 = i;
                    }
                    break;
                case -136432675:
                case 1186801534:
                    if (c20066.m45439()) {
                        strM45435 = strM45435;
                        iM55680 = C0873.m55680("ܶ᩵") ^ i5;
                        i3 = ((iM55680 ^ i6) * 18965) ^ 1028834083;
                        i4 = 241564370;
                    } else {
                        iM55680 = C0873.m55680("ۖ᩵") ^ i6;
                        strM45435 = strM45435;
                        i3 = ((iM55680 ^ i5) * 12261) ^ (-256348547);
                        i4 = -128422881;
                    }
                    String str14 = strM45435;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    strM45435 = str14;
                    break;
                case 87964839:
                case 476600188:
                    strM45435 = strM45435;
                    c = 0;
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0946.m55979("ۤ᩵") ^ i5;
                        i3 = ((iM55680 ^ i6) * 26647) ^ 1469198837;
                        i4 = 1199601002;
                    } else {
                        iM55680 = C0873.m55680("᩹۠") ^ i5;
                        i3 = ((iM55680 ^ i6) * 32143) ^ 186136327;
                        i4 = -696925130;
                    }
                    String str15 = strM45435;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    strM45435 = str15;
                    break;
                case 949021171:
                case 1043565397:
                    i11 = 32346;
                    iM55680 = (i6 - C0946.m55979("۫۬")) * 63;
                    i3 = ((iM55680 ^ i5) * (-6647)) ^ 1441626788;
                    i4 = 1037312583;
                    String str16 = strM45435;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    strM45435 = str16;
                    break;
                case 1446337824:
                case 2133144973:
                    C0912.m55833();
                    iM55680 = (C0873.m55680("ۜܶ") ^ i5) * 123;
                    strM45435 = strM45435;
                    i3 = ((iM55680 ^ i6) * 13411) ^ (-1309258479);
                    i4 = 1728756599;
                    String str17 = strM45435;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    strM45435 = str17;
                    break;
                case 1663958285:
                case 2005662071:
                    strM45435 = strM45435;
                    sArr = f82040;
                    if (C1024.f81946) {
                        iM55680 = (i6 - C0873.m55680("᩺֨")) * 55;
                        i3 = ((iM55680 ^ i5) * 3987) ^ (-2019413101);
                        i4 = 1815972287;
                    } else {
                        iM55680 = C0946.m55979("ۙ᩵") ^ i5;
                        i3 = ((iM55680 ^ i6) * 2007) ^ (-1087086791);
                        i4 = -471993330;
                    }
                    String str18 = strM45435;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    strM45435 = str18;
                    break;
                case 1987777453:
                case 2004191718:
                    strM45435 = strM45435;
                    if (C1404.f82149 >= 0) {
                        strM45435 = strM45435;
                        iM55680 = (C0873.m55680("ۜܶ") ^ i5) * 123;
                        strM45435 = strM45435;
                        i3 = ((iM55680 ^ i6) * 13411) ^ (-1309258479);
                        i4 = 1728756599;
                    } else {
                        iM55680 = C0873.m55680("֡ۧ") ^ i6;
                        i3 = ((iM55680 ^ i5) * (-23067)) ^ 268543230;
                        i4 = -757232340;
                    }
                    String str19 = strM45435;
                    i8 = iM55680 ^ i4;
                    i7 = i3;
                    strM45435 = str19;
                    break;
                default:
                    sArr3 = f82040;
                    i14 = 5;
                    i15 = 2;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = (C0873.m55680("᩷ۚ") + i5) * 3;
                        i = ((iM55979 ^ i6) * 10329) ^ 510297968;
                        i2 = 1502305983;
                    } else {
                        iM55979 = C0873.m55680("ᩴܶ") ^ i6;
                        i = ((iM55979 ^ i5) * (-2743)) ^ (-704560176);
                        i2 = 1602693849;
                    }
                    i8 = iM55979 ^ i2;
                    i7 = i;
                    break;
            }
        }
    }
}
