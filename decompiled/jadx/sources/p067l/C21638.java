package p067l;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩶ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GS */
/* JADX INFO: loaded from: classes4.dex */
public final class C21638 {
    /* JADX INFO: renamed from: ֫ */
    public static byte[] m48857(String str, byte[] bArr, String str2) throws C23649, C9567 {
        C12250 c12250;
        int i;
        int[] iArr;
        int[] iArr2;
        C12250 c12251;
        int i2;
        C8226 c8226;
        try {
            C6885 c6885 = new C6885(bArr);
            C12250[] c12250Arr = c6885.f17900;
            int length = c12250Arr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    c12250 = null;
                    break;
                }
                c12250 = c12250Arr[i3];
                if (c12250 != null) {
                    C8226 c8227 = c12250.f34237.f17901;
                    if ((c8227 == null ? null : c8227.m19000(c12250.f34240)).equals(".hash")) {
                        break;
                    }
                }
                i3++;
            }
            ByteBuffer byteBuffer = c6885.f17898;
            if (c12250 == null) {
                i = 0;
                iArr = null;
                iArr2 = null;
            } else {
                int i4 = (int) c12250.f34238;
                i = byteBuffer.getInt(i4);
                int i5 = byteBuffer.getInt(i4 + 4);
                int i6 = i4 + 8;
                int[] iArr3 = new int[i];
                int[] iArr4 = new int[i5];
                for (int i7 = 0; i7 < i; i7++) {
                    iArr3[i7] = byteBuffer.getInt(i6);
                    i6 += 4;
                }
                for (int i8 = 0; i8 < i5; i8++) {
                    iArr4[i8] = byteBuffer.getInt(i6);
                    i6 += 4;
                }
                iArr = iArr3;
                iArr2 = iArr4;
            }
            int length2 = c12250Arr.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length2) {
                    c12251 = null;
                    break;
                }
                c12251 = c12250Arr[i9];
                if (c12251 != null) {
                    C8226 c8228 = c12251.f34237.f17901;
                    if (".dynsym".equals(c8228 == null ? null : c8228.m19000(c12251.f34240))) {
                        break;
                    }
                }
                i9++;
            }
            C15601 c15601 = (C15601) c12251;
            if (c15601 != null) {
                C12250 c12252 = c15601.f34237.f17900[c15601.f34242];
                long j = c15601.f34241;
                int i10 = j == 0 ? 0 : (int) (c15601.f34239 / j);
                C13591[] c13591Arr = new C13591[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    c13591Arr[i11] = c15601.m35478(i11);
                }
                String[] strArr = new String[i10];
                int i12 = 0;
                int i13 = 0;
                while (i12 < i10) {
                    C13591 c13591 = c13591Arr[i12];
                    int i14 = i13 + 1;
                    strArr[i13] = (c13591 == null || (c8226 = c13591.f38222) == null) ? null : c8226.m19000(c13591.f38221);
                    i12++;
                    i13 = i14;
                }
                boolean z = false;
                for (int i15 = 0; i15 < i10; i15++) {
                    String str3 = strArr[i15];
                    if (str3 != null && str3.startsWith(str)) {
                        if (str2.length() != str.length()) {
                            throw new C9567();
                        }
                        StringBuilder sbM17248 = C7470.m17248(str2);
                        sbM17248.append(strArr[i15].substring(str.length()));
                        String string = sbM17248.toString();
                        C13591 c13592 = c13591Arr[i15];
                        byteBuffer.position((int) (c13592.f38222.f34238 + ((long) c13592.f38221)));
                        byteBuffer.put(str2.getBytes());
                        if (c12250 != null) {
                            long j2 = i;
                            int iM48856 = (int) (m48856(strArr[i15]) % j2);
                            int iM48857 = (int) (m48856(string) % j2);
                            if (iM48857 != iM48856 && iArr[iM48857] != i15) {
                                int i16 = iArr[iM48856];
                                if (i16 != i15) {
                                    int i17 = 0;
                                    while (true) {
                                        int i18 = iArr2[i16];
                                        if (i18 == 0) {
                                            break;
                                        }
                                        int i19 = i17 + 1;
                                        if (i17 >= iArr2.length) {
                                            break;
                                        }
                                        if (i18 == i15) {
                                            iArr2[i16] = 0;
                                            break;
                                        }
                                        i17 = i19;
                                    }
                                } else {
                                    iArr[iM48856] = 0;
                                }
                                int i20 = iArr[iM48857];
                                if (i20 == 0) {
                                    iArr[iM48857] = i15;
                                } else {
                                    int i21 = 0;
                                    while (true) {
                                        i2 = iArr2[i20];
                                        if (i2 == 0) {
                                            break;
                                        }
                                        int i22 = i21 + 1;
                                        if (i21 == iArr2.length) {
                                            throw new C23649("Fix hash table failed");
                                        }
                                        if (i2 == i15) {
                                            break;
                                        }
                                        i20 = i2;
                                        i21 = i22;
                                    }
                                    if (i2 == 0) {
                                        iArr2[i20] = i15;
                                    }
                                }
                            }
                        }
                        z = true;
                    }
                }
                if (!z) {
                    return null;
                }
                byteBuffer.position(((int) c12250.f34238) + 8);
                for (int i23 : iArr) {
                    byteBuffer.putInt(i23);
                }
                for (int i24 : iArr2) {
                    byteBuffer.putInt(i24);
                }
                byteBuffer.flip();
                return byteBuffer.array();
            }
        } catch (IOException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m48856(String str) {
        long j = 0;
        for (char c : str.toCharArray()) {
            j = (j << 4) + ((long) c);
            long j2 = 4026531840L & j;
            if (j2 != 0) {
                j = (j ^ (j2 >> 24)) & (~j2);
            }
        }
        return 2147483647L & j;
    }
}
