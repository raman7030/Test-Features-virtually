package p067l;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56JZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C15621 {
    /* JADX WARN: Code duplicated, block: B:88:0x0149 A[Catch: IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01ad, TryCatch #0 {IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01ad, blocks: (B:3:0x0002, B:5:0x0010, B:7:0x001e, B:9:0x0021, B:11:0x0029, B:17:0x0043, B:19:0x0046, B:21:0x0059, B:24:0x0069, B:27:0x0073, B:30:0x0082, B:32:0x0093, B:36:0x009a, B:38:0x009d, B:53:0x00c5, B:51:0x00bc, B:55:0x00c8, B:60:0x00f5, B:67:0x0101, B:72:0x0113, B:74:0x0117, B:77:0x0128, B:79:0x012e, B:81:0x0135, B:93:0x0156, B:88:0x0149, B:90:0x014d, B:92:0x0153, B:82:0x013a, B:94:0x0159, B:97:0x0170, B:98:0x017e, B:100:0x0184, B:102:0x0190, B:105:0x0199, B:107:0x019d, B:109:0x01a1, B:111:0x01a7, B:113:0x01aa), top: B:117:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x014d A[Catch: IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01ad, TryCatch #0 {IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01ad, blocks: (B:3:0x0002, B:5:0x0010, B:7:0x001e, B:9:0x0021, B:11:0x0029, B:17:0x0043, B:19:0x0046, B:21:0x0059, B:24:0x0069, B:27:0x0073, B:30:0x0082, B:32:0x0093, B:36:0x009a, B:38:0x009d, B:53:0x00c5, B:51:0x00bc, B:55:0x00c8, B:60:0x00f5, B:67:0x0101, B:72:0x0113, B:74:0x0117, B:77:0x0128, B:79:0x012e, B:81:0x0135, B:93:0x0156, B:88:0x0149, B:90:0x014d, B:92:0x0153, B:82:0x013a, B:94:0x0159, B:97:0x0170, B:98:0x017e, B:100:0x0184, B:102:0x0190, B:105:0x0199, B:107:0x019d, B:109:0x01a1, B:111:0x01a7, B:113:0x01aa), top: B:117:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0152  */
    /* JADX INFO: renamed from: ֫ */
    public static EnumC12270 m35504(C5290 c5290, int i) {
        int iM11441;
        try {
            C13611 c13611 = new C13611();
            int length = c5290.m11438().length;
            int i2 = i;
            while (i2 < length) {
                int iM35503 = m35503(c5290, i2, length);
                int iM11442 = c5290.m11441(i2 + 2);
                if (iM11442 < 284) {
                    return EnumC12270.AOSP;
                }
                HashMap map = new HashMap();
                int i3 = i2 + iM11442;
                while (i3 < iM35503) {
                    int iM35504 = m35503(c5290, i3, iM35503);
                    int iM11443 = c5290.m11441(i3);
                    int iM11444 = c5290.m11441(i3 + 2);
                    if (iM11443 == 514 || iM11443 == 513) {
                        if (iM11444 < 16) {
                            return EnumC12270.AOSP;
                        }
                        int iM11445 = c5290.m11443(i3 + 8);
                        C24339 c24339 = (C24339) map.get(Integer.valueOf(iM11445));
                        if (c24339 == null) {
                            c24339 = new C24339(0);
                            map.put(Integer.valueOf(iM11445), c24339);
                        }
                        if (iM11443 == 514) {
                            int iM11446 = c5290.m11442(i3 + 12);
                            if (iM11446 >= 0 && iM11446 <= 65536) {
                                if ((((long) iM11446) * 4) + ((long) i3) + ((long) iM11444) <= iM35504) {
                                    c24339.f77103 = c5290.m11439(i3 + iM11444, iM11446);
                                }
                            }
                            return EnumC12270.AOSP;
                        }
                        if (iM11444 < 24) {
                            return EnumC12270.AOSP;
                        }
                        int i4 = i3 + 20;
                        int iM11447 = c5290.m11442(i4);
                        if (iM11447 == 28 || iM11447 == 32 || iM11447 == 36 || iM11447 == 48 || iM11447 == 52 || iM11447 == 76) {
                            long j = iM11444;
                            if (((long) iM11447) + 20 <= j) {
                                C22999 c22999M51349 = C22999.m51349(c5290.m11445(i4), EnumC12270.MOTOROLA_76);
                                C7972 c7972M11445 = c5290.m11445(i4);
                                EnumC12270 enumC12270 = EnumC12270.AOSP;
                                C22999 c22999M513410 = C22999.m51349(c7972M11445, enumC12270);
                                int iM11448 = c5290.m11442(i3 + 12);
                                int iM11449 = c5290.m11443(i3 + 9);
                                boolean z = true;
                                boolean z2 = (iM11449 & 1) != 0;
                                if (z2 || (iM11449 & 2) == 0) {
                                    z = false;
                                }
                                int i5 = z ? 2 : 4;
                                int iM114410 = c5290.m11442(i3 + 16);
                                if (iM11448 >= 0 && iM11448 <= 65536 && iM114410 >= iM11444 && iM114410 <= iM35504 - i3) {
                                    if ((((long) i5) * ((long) iM11448)) + j <= iM114410) {
                                        int[] iArr = new int[iM11448];
                                        int i6 = 0;
                                        for (int i7 = 0; i7 < iM11448; i7++) {
                                            int i8 = (i7 * i5) + i3 + iM11444;
                                            int iM114411 = z ? c5290.m11441(i8) : c5290.m11442(i8);
                                            if (z2) {
                                                int i9 = i6 + 1;
                                                if (z2) {
                                                    iM11441 = c5290.m11441(i8);
                                                } else {
                                                    iM11441 = i7;
                                                }
                                                iArr[i6] = iM11441;
                                                i6 = i9;
                                            } else if (iM114411 != (z ? 65535 : -1)) {
                                                int i10 = i6 + 1;
                                                if (z2) {
                                                    iM11441 = c5290.m11441(i8);
                                                } else {
                                                    iM11441 = i7;
                                                }
                                                iArr[i6] = iM11441;
                                                i6 = i10;
                                            }
                                        }
                                        c24339.f77102.add(new C8246(c22999M51349, c22999M513410, iArr, i6));
                                    }
                                }
                                return enumC12270;
                            }
                        }
                        return EnumC12270.AOSP;
                    }
                    iM35503 = iM35503;
                    length = length;
                    i3 = iM35504;
                    map = map;
                }
                int i11 = length;
                int i12 = iM35503;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    if (!((C24339) it.next()).m53703(c13611)) {
                        return EnumC12270.AOSP;
                    }
                }
                i2 = i12;
                length = i11;
            }
            return (c13611.f38297 <= 0 || c13611.f38296 != 0 || c13611.f38295 >= c13611.f38294) ? EnumC12270.AOSP : EnumC12270.MOTOROLA_76;
        } catch (IOException | IllegalArgumentException | IndexOutOfBoundsException unused) {
            return EnumC12270.AOSP;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m35503(C5290 c5290, int i, int i2) throws IOException {
        if (i >= 0) {
            long j = i;
            long j2 = i2;
            if (8 + j <= j2) {
                int iM11442 = c5290.m11442(i + 4);
                int iM11441 = c5290.m11441(i + 2);
                if (iM11441 < 8 || iM11442 < iM11441 || j + ((long) iM11442) > j2) {
                    throw new IOException("Invalid chunk bounds");
                }
                return i + iM11442;
            }
        }
        throw new IOException("Invalid chunk offset");
    }
}
