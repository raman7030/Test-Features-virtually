package l;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩶ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GS */
/* JADX INFO: loaded from: classes4.dex */
public final class C20275 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m46535(String str, byte[] bArr, String str2) throws C22391, C7574 {
        C10397 c10397;
        int i;
        int[] iArr;
        int[] iArr2;
        C10397 c10398;
        int i2;
        C6163 c6163;
        try {
            C4752 c4752 = new C4752(bArr);
            C10397[] c10397Arr = c4752.f15069;
            int length = c10397Arr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    c10397 = null;
                    break;
                }
                c10397 = c10397Arr[i3];
                if (c10397 != null) {
                    C6163 c6164 = c10397.f31272.f15070;
                    if ((c6164 == null ? null : c6164.m17068(c10397.f31275)).equals(".hash")) {
                        break;
                    }
                }
                i3++;
            }
            ByteBuffer byteBuffer = c4752.f15067;
            if (c10397 == null) {
                i = 0;
                iArr = null;
                iArr2 = null;
            } else {
                int i4 = (int) c10397.f31273;
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
            int length2 = c10397Arr.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length2) {
                    c10398 = null;
                    break;
                }
                c10398 = c10397Arr[i9];
                if (c10398 != null) {
                    C6163 c6165 = c10398.f31272.f15070;
                    if (".dynsym".equals(c6165 == null ? null : c6165.m17068(c10398.f31275))) {
                        break;
                    }
                }
                i9++;
            }
            C13923 c13923 = (C13923) c10398;
            if (c13923 != null) {
                C10397 c10399 = c13923.f31272.f15069[c13923.f31277];
                long j = c13923.f31276;
                int i10 = j == 0 ? 0 : (int) (c13923.f31274 / j);
                C11808[] c11808Arr = new C11808[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    c11808Arr[i11] = c13923.m33359(i11);
                }
                String[] strArr = new String[i10];
                int i12 = 0;
                int i13 = 0;
                while (i12 < i10) {
                    C11808 c11808 = c11808Arr[i12];
                    int i14 = i13 + 1;
                    strArr[i13] = (c11808 == null || (c6163 = c11808.f35220) == null) ? null : c6163.m17068(c11808.f35219);
                    i12++;
                    i13 = i14;
                }
                boolean z = false;
                for (int i15 = 0; i15 < i10; i15++) {
                    String str3 = strArr[i15];
                    if (str3 != null && str3.startsWith(str)) {
                        if (str2.length() != str.length()) {
                            throw new C7574();
                        }
                        StringBuilder sbM15339 = C5368.m15339(str2);
                        sbM15339.append(strArr[i15].substring(str.length()));
                        String string = sbM15339.toString();
                        C11808 c11809 = c11808Arr[i15];
                        byteBuffer.position((int) (c11809.f35220.f31273 + ((long) c11809.f35219)));
                        byteBuffer.put(str2.getBytes());
                        if (c10397 != null) {
                            long j2 = i;
                            int iM46534 = (int) (m46534(strArr[i15]) % j2);
                            int iM46535 = (int) (m46534(string) % j2);
                            if (iM46535 != iM46534 && iArr[iM46535] != i15) {
                                int i16 = iArr[iM46534];
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
                                    iArr[iM46534] = 0;
                                }
                                int i20 = iArr[iM46535];
                                if (i20 == 0) {
                                    iArr[iM46535] = i15;
                                } else {
                                    int i21 = 0;
                                    while (true) {
                                        i2 = iArr2[i20];
                                        if (i2 == 0) {
                                            break;
                                        }
                                        int i22 = i21 + 1;
                                        if (i21 == iArr2.length) {
                                            throw new C22391("Fix hash table failed");
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
                byteBuffer.position(((int) c10397.f31273) + 8);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m46534(String str) {
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
