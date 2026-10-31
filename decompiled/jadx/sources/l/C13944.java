package l;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56JZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13944 {
    /* JADX WARN: Code duplicated, block: B:88:0x0149 A[Catch: IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01ad, TryCatch #0 {IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01ad, blocks: (B:3:0x0002, B:5:0x0010, B:7:0x001e, B:9:0x0021, B:11:0x0029, B:17:0x0043, B:19:0x0046, B:21:0x0059, B:24:0x0069, B:27:0x0073, B:30:0x0082, B:32:0x0093, B:36:0x009a, B:38:0x009d, B:53:0x00c5, B:51:0x00bc, B:55:0x00c8, B:60:0x00f5, B:67:0x0101, B:72:0x0113, B:74:0x0117, B:77:0x0128, B:79:0x012e, B:81:0x0135, B:93:0x0156, B:88:0x0149, B:90:0x014d, B:92:0x0153, B:82:0x013a, B:94:0x0159, B:97:0x0170, B:98:0x017e, B:100:0x0184, B:102:0x0190, B:105:0x0199, B:107:0x019d, B:109:0x01a1, B:111:0x01a7, B:113:0x01aa), top: B:117:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x014d A[Catch: IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01ad, TryCatch #0 {IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01ad, blocks: (B:3:0x0002, B:5:0x0010, B:7:0x001e, B:9:0x0021, B:11:0x0029, B:17:0x0043, B:19:0x0046, B:21:0x0059, B:24:0x0069, B:27:0x0073, B:30:0x0082, B:32:0x0093, B:36:0x009a, B:38:0x009d, B:53:0x00c5, B:51:0x00bc, B:55:0x00c8, B:60:0x00f5, B:67:0x0101, B:72:0x0113, B:74:0x0117, B:77:0x0128, B:79:0x012e, B:81:0x0135, B:93:0x0156, B:88:0x0149, B:90:0x014d, B:92:0x0153, B:82:0x013a, B:94:0x0159, B:97:0x0170, B:98:0x017e, B:100:0x0184, B:102:0x0190, B:105:0x0199, B:107:0x019d, B:109:0x01a1, B:111:0x01a7, B:113:0x01aa), top: B:117:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0152  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC10418 m33385(C3074 c3074, int i) {
        int iM9399;
        try {
            C11829 c11829 = new C11829();
            int length = c3074.m9396().length;
            int i2 = i;
            while (i2 < length) {
                int iM33384 = m33384(c3074, i2, length);
                int iM93910 = c3074.m9399(i2 + 2);
                if (iM93910 < 284) {
                    return EnumC10418.AOSP;
                }
                HashMap map = new HashMap();
                int i3 = i2 + iM93910;
                while (i3 < iM33384) {
                    int iM33385 = m33384(c3074, i3, iM33384);
                    int iM93911 = c3074.m9399(i3);
                    int iM93912 = c3074.m9399(i3 + 2);
                    if (iM93911 == 514 || iM93911 == 513) {
                        if (iM93912 < 16) {
                            return EnumC10418.AOSP;
                        }
                        int iM9401 = c3074.m9401(i3 + 8);
                        C23117 c23117 = (C23117) map.get(Integer.valueOf(iM9401));
                        if (c23117 == null) {
                            c23117 = new C23117(0);
                            map.put(Integer.valueOf(iM9401), c23117);
                        }
                        if (iM93911 == 514) {
                            int iM9400 = c3074.m9400(i3 + 12);
                            if (iM9400 >= 0 && iM9400 <= 65536) {
                                if ((((long) iM9400) * 4) + ((long) i3) + ((long) iM93912) <= iM33385) {
                                    c23117.f74359 = c3074.m9397(i3 + iM93912, iM9400);
                                }
                            }
                            return EnumC10418.AOSP;
                        }
                        if (iM93912 < 24) {
                            return EnumC10418.AOSP;
                        }
                        int i4 = i3 + 20;
                        int iM9402 = c3074.m9400(i4);
                        if (iM9402 == 28 || iM9402 == 32 || iM9402 == 36 || iM9402 == 48 || iM9402 == 52 || iM9402 == 76) {
                            long j = iM93912;
                            if (((long) iM9402) + 20 <= j) {
                                C21707 c21707M49000 = C21707.m49000(c3074.m9403(i4), EnumC10418.MOTOROLA_76);
                                C5896 c5896M9403 = c3074.m9403(i4);
                                EnumC10418 enumC10418 = EnumC10418.AOSP;
                                C21707 c21707M49001 = C21707.m49000(c5896M9403, enumC10418);
                                int iM9403 = c3074.m9400(i3 + 12);
                                int iM9404 = c3074.m9401(i3 + 9);
                                boolean z = true;
                                boolean z2 = (iM9404 & 1) != 0;
                                if (z2 || (iM9404 & 2) == 0) {
                                    z = false;
                                }
                                int i5 = z ? 2 : 4;
                                int iM9405 = c3074.m9400(i3 + 16);
                                if (iM9403 >= 0 && iM9403 <= 65536 && iM9405 >= iM93912 && iM9405 <= iM33385 - i3) {
                                    if ((((long) i5) * ((long) iM9403)) + j <= iM9405) {
                                        int[] iArr = new int[iM9403];
                                        int i6 = 0;
                                        for (int i7 = 0; i7 < iM9403; i7++) {
                                            int i8 = (i7 * i5) + i3 + iM93912;
                                            int iM93913 = z ? c3074.m9399(i8) : c3074.m9400(i8);
                                            if (z2) {
                                                int i9 = i6 + 1;
                                                if (z2) {
                                                    iM9399 = c3074.m9399(i8);
                                                } else {
                                                    iM9399 = i7;
                                                }
                                                iArr[i6] = iM9399;
                                                i6 = i9;
                                            } else if (iM93913 != (z ? 65535 : -1)) {
                                                int i10 = i6 + 1;
                                                if (z2) {
                                                    iM9399 = c3074.m9399(i8);
                                                } else {
                                                    iM9399 = i7;
                                                }
                                                iArr[i6] = iM9399;
                                                i6 = i10;
                                            }
                                        }
                                        c23117.f74358.add(new C6184(c21707M49000, c21707M49001, iArr, i6));
                                    }
                                }
                                return enumC10418;
                            }
                        }
                        return EnumC10418.AOSP;
                    }
                    iM33384 = iM33384;
                    length = length;
                    i3 = iM33385;
                    map = map;
                }
                int i11 = length;
                int i12 = iM33384;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    if (!((C23117) it.next()).m51309(c11829)) {
                        return EnumC10418.AOSP;
                    }
                }
                i2 = i12;
                length = i11;
            }
            return (c11829.f35295 <= 0 || c11829.f35294 != 0 || c11829.f35293 >= c11829.f35292) ? EnumC10418.AOSP : EnumC10418.MOTOROLA_76;
        } catch (IOException | IllegalArgumentException | IndexOutOfBoundsException unused) {
            return EnumC10418.AOSP;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m33384(C3074 c3074, int i, int i2) throws IOException {
        if (i >= 0) {
            long j = i;
            long j2 = i2;
            if (8 + j <= j2) {
                int iM9400 = c3074.m9400(i + 4);
                int iM9399 = c3074.m9399(i + 2);
                if (iM9399 < 8 || iM9400 < iM9399 || j + ((long) iM9400) > j2) {
                    throw new IOException("Invalid chunk bounds");
                }
                return i + iM9400;
            }
        }
        throw new IOException("Invalid chunk offset");
    }
}
