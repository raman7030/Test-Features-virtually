package l;

import java.util.Arrays;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.֨۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819S */
/* JADX INFO: loaded from: classes2.dex */
public final class C1121 {

    /* JADX INFO: renamed from: ܽᩴᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f4078 = {6882, 29149, 29132, 29143, 29155, 29135, 29141, 29147, 29138, 29149, 29128, 29129, 29134, 29145, 29155, 29141, 29138, 29146, 29139, 29155, 29149, 29144, 29144, 29155, 29151, 29139, 29136, 29139, 29138, 29149, 29132, 29143, 29155, 29135, 29141, 29147, 29138, 29149, 29128, 29129, 29134, 29145, 29155, 29141, 29138, 29146, 29139, 29155, 29129, 29132, 29132, 29145, 29134, 29155, 29151, 29149, 29135, 29145, 29068, 29124, 29081, 29068, 29060, 29124, 29084, 29076, 29081, 29144, 29077, 29068, 29124, 29081, 29068, 29060, 29156, 29084, 29076, 29081, 29144, 29077};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f4079;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f4080;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f4081;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f4082;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f4083;

    /* JADX WARN: Code duplicated, block: B:41:0x0110 A[PHI: r3
      0x0110: PHI (r3v4 int) = (r3v3 int), (r3v2 int) binds: [B:40:0x010e, B:10:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0195 A[PHI: r1 r11
      0x0195: PHI (r1v3 long) = (r1v2 long), (r1v2 long), (r1v2 long), (r1v2 long), (r1v5 long) binds: [B:52:0x0193, B:18:0x0054, B:16:0x0050, B:10:0x003e, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0195: PHI (r11v8 java.util.zip.CRC32) = 
      (r11v5 java.util.zip.CRC32)
      (r11v4 java.util.zip.CRC32)
      (r11v4 java.util.zip.CRC32)
      (r11v4 java.util.zip.CRC32)
      (r11v4 java.util.zip.CRC32)
     binds: [B:52:0x0193, B:18:0x0054, B:16:0x0050, B:10:0x003e, B:7:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01c1 A[PHI: r5
      0x01c1: PHI (r5v3 byte[]) = (r5v2 byte[]), (r5v2 byte[]), (r5v2 byte[]), (r5v5 byte[]) binds: [B:56:0x01bf, B:44:0x0142, B:36:0x00ed, B:24:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3837(byte[] bArr) {
        int iM6981;
        int i;
        long value = 0;
        int iHashCode = 0;
        byte[] bArrDigest = null;
        byte[] bArrDigest2 = null;
        int i2 = 247274492;
        int i3 = RunnableC0588.f2309;
        int i4 = RunnableC1937.f6483;
        int iM2566 = (C0630.m2566("ۚ۟") ^ i3) * (-95);
        int i5 = ((iM2566 ^ i4) * 2051) ^ (-2073256715);
        int i6 = 562624887;
        while (true) {
            int i7 = iM2566 ^ i6;
            CRC32 crc32 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * (-18871)) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1973657744:
                    case 686875957:
                        this.f4080 = iHashCode;
                        if (C3019.f9544 >= 0) {
                            iM6981 = C0630.m2566("ܰۤ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 24663) ^ (-819456485);
                            i = 1265322334;
                        } else {
                            iM6981 = (i4 - C2105.m6981("᩸ܽ")) * (-109);
                            i5 = ((iM6981 ^ i3) * 3473) ^ (-1434250150);
                            i = -1991894023;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -1698239750:
                    case -15851337:
                        C2520.m8026();
                        if (ViewOnClickListenerC1958.f6529 > 0) {
                        }
                        iM6981 = C2105.m6981("ۜۢ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 28131) ^ 872864164;
                        i = -1890458914;
                        i7 = iM6981 ^ i;
                        break;
                    case -1589688309:
                    case 1672387411:
                        this.f4083 = bArrDigest2;
                        this.f4082 = C14460.m34534().digest(bArr);
                        break;
                    case -1314356087:
                    case -1105445621:
                        bArrDigest2 = C14460.m34532().digest(bArr);
                        if (RunnableC3474.m10630()) {
                            iM6981 = (C2105.m6981("ۢۨ") ^ i3) * (-13);
                            i5 = ((iM6981 ^ i4) * (-12333)) ^ 442013323;
                            i = -1895799520;
                        } else {
                            iM6981 = C0630.m2566("ܰۤ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 24663) ^ (-819456485);
                            i = 1265322334;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -925264074:
                    case 2004968292:
                        if (C4075.f12947 < 0) {
                            crc32 = new CRC32();
                            if (ServiceConnectionC3453.m10564() <= 0) {
                                iM6981 = C2105.m6981("ۜۢ") ^ i4;
                                i5 = ((iM6981 ^ i3) * 28131) ^ 872864164;
                                i = -1890458914;
                            } else {
                                iM6981 = (C0630.m2566("ۙᩳ") + i4) * 47;
                                i5 = ((iM6981 ^ i3) * 8451) ^ 211583959;
                                i = 1152329976;
                            }
                            i7 = iM6981 ^ i;
                        }
                        break;
                    case -762293435:
                    case 400893689:
                        if (RunnableC3474.m10630()) {
                            iM6981 = C2105.m6981("ۜۢ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 28131) ^ 872864164;
                            i = -1890458914;
                        } else {
                            iM6981 = (i4 - C0630.m2566("᩺ۘ")) * (-89);
                            i5 = ((iM6981 ^ i3) * (-73)) ^ 2129003010;
                            i = 435742329;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -684960200:
                    case 1626838285:
                        C0964.m3413();
                        C3911.m11924();
                        iM6981 = C2105.m6981("ۜۢ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 28131) ^ 872864164;
                        i = -1890458914;
                        i7 = iM6981 ^ i;
                        break;
                    case -148624550:
                    case 460418854:
                        this.f4081 = bArrDigest;
                        if (C3746.f11829 <= 0) {
                            iM6981 = C2105.m6981("᩶ܽ") ^ i4;
                            i5 = ((iM6981 ^ i3) * (-19027)) ^ (-324050921);
                            i = 1861141530;
                        } else {
                            iM6981 = C0630.m2566("֫᩶") ^ i4;
                            i5 = ((iM6981 ^ i3) * 27065) ^ 502680636;
                            i = 541823368;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -96095139:
                    case 758292136:
                        if (C3245.f10203 <= 0) {
                            iM6981 = C0630.m2566("ܰۤ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 24663) ^ (-819456485);
                            i = 1265322334;
                        } else {
                            iM6981 = C2105.m6981("ᩴ᩻") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-18833)) ^ 692120204;
                            i = 1361126942;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case -72161921:
                    case 515040882:
                        C1294.m4372();
                        C1047.m3599();
                        break;
                    case 294217530:
                    case 1832277647:
                        this.f4079 = (int) value;
                        if (C2272.f7362) {
                            iM6981 = C0630.m2566("ܰۤ") ^ i3;
                            i5 = ((iM6981 ^ i4) * 24663) ^ (-819456485);
                            i = 1265322334;
                        } else {
                            iM6981 = C2105.m6981("ᩳܳ") ^ i3;
                            i5 = ((iM6981 ^ i4) * (-11635)) ^ (-107109561);
                            i = -1300911974;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 730688533:
                    case 1172724915:
                        iHashCode = Arrays.hashCode(bArr);
                        if (C0630.f2410 <= 0) {
                            iM6981 = (i4 - C0630.m2566("᩺ۘ")) * (-89);
                            i5 = ((iM6981 ^ i3) * (-73)) ^ 2129003010;
                            i = 435742329;
                        } else {
                            iM6981 = (C0630.m2566("ۙۙ") + i3) * 79;
                            i5 = ((iM6981 ^ i4) * (-12179)) ^ (-1231543766);
                            i = -1376296748;
                        }
                        i7 = iM6981 ^ i;
                        break;
                    case 1361035821:
                    case 1899791682:
                        RunnableC1108.m3790();
                        if (C1773.f6144 <= 0) {
                        }
                        iM6981 = C2105.m6981("᩶ܽ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-19027)) ^ (-324050921);
                        i = 1861141530;
                        i7 = iM6981 ^ i;
                        break;
                    case 1768852748:
                    case 1780250118:
                        bArrDigest = C14460.m34526().digest(bArr);
                        if (RunnableC1937.f6483 < 0) {
                            iM6981 = (i3 - C0630.m2566("ۡ᩸")) * (-5);
                            i5 = ((iM6981 ^ i4) * (-8525)) ^ 71638554;
                            i = 154966898;
                            i7 = iM6981 ^ i;
                        }
                        break;
                    default:
                        crc32.update(bArr);
                        value = crc32.getValue();
                        if (C4263.f13799 <= 0) {
                            iM6981 = C2105.m6981("ۜۢ") ^ i4;
                            i5 = ((iM6981 ^ i3) * 28131) ^ 872864164;
                            i = -1890458914;
                        } else {
                            iM6981 = (C2105.m6981("ۚ֨") ^ i4) * 49;
                            i5 = ((iM6981 ^ i3) * 23287) ^ 1258402792;
                            i = -2126140053;
                        }
                        i7 = iM6981 ^ i;
                        break;
                }
                return;
            }
            iM2566 = (C2105.m6981("֡᩻") ^ i3) * (-99);
            i5 = ((iM2566 ^ i4) * (-15033)) ^ (-404464072);
            i6 = -1527395303;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20781. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3836(android.widget.TextView r44, android.widget.TextView r45, android.widget.TextView r46, android.widget.TextView r47, android.widget.TextView r48) {
        /*
            Method dump skipped, instruction units count: 2078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1121.m3836(android.widget.TextView, android.widget.TextView, android.widget.TextView, android.widget.TextView, android.widget.TextView):void");
    }
}
