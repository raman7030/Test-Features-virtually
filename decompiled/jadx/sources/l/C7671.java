package l;

import com.umeng.analytics.pro.bo;
import java.io.IOException;
import java.io.Writer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۟᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D52R */
/* JADX INFO: loaded from: classes3.dex */
public final class C7671 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AtomicReference f23694 = new AtomicReference();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20525(AbstractC3912 abstractC3912, int i, int i2, int[] iArr) {
        char c;
        int i3 = i2;
        AtomicReference atomicReference = f23694;
        char[] cArr = (char[]) atomicReference.getAndSet(null);
        if (cArr == null || cArr.length < i3) {
            cArr = new char[i3];
        }
        int i4 = 0;
        int i5 = i;
        while (i3 > 0) {
            byte bMo11933 = abstractC3912.mo11933(i5);
            int i6 = bMo11933 & 255;
            switch (i6 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    if (i6 == 0) {
                        m20526(i6, i5);
                        throw null;
                    }
                    c = (char) i6;
                    i5++;
                    break;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    m20526(i6, i5);
                    throw null;
                case 12:
                case 13:
                    int i7 = i5 + 1;
                    byte bMo11934 = abstractC3912.mo11933(i7);
                    int i8 = bMo11934 & 255;
                    if ((bMo11934 & 192) != 128) {
                        m20526(i8, i7);
                        throw null;
                    }
                    int i9 = ((bMo11933 & bo.j) << 6) | (bMo11934 & 63);
                    if (i9 != 0 && i9 < 128) {
                        m20526(i8, i7);
                        throw null;
                    }
                    c = (char) i9;
                    i5 += 2;
                    break;
                    break;
                case 14:
                    int i10 = i5 + 1;
                    byte bMo11935 = abstractC3912.mo11933(i10);
                    int i11 = bMo11935 & 255;
                    if ((bMo11935 & 192) != 128) {
                        m20526(i11, i10);
                        throw null;
                    }
                    int i12 = i5 + 2;
                    byte bMo11936 = abstractC3912.mo11933(i12);
                    int i13 = bMo11936 & 255;
                    if ((bMo11936 & 192) != 128) {
                        m20526(i13, i12);
                        throw null;
                    }
                    int i14 = ((bMo11933 & 15) << 12) | ((bMo11935 & 63) << 6) | (bMo11936 & 63);
                    if (i14 < 2048) {
                        m20526(i13, i12);
                        throw null;
                    }
                    c = (char) i14;
                    i5 += 3;
                    break;
                    break;
            }
            cArr[i4] = c;
            i4++;
            i3--;
        }
        if (iArr.length > 0) {
            iArr[0] = i5 - i;
        }
        String str = new String(cArr, 0, i4);
        if (cArr.length <= 4096) {
            while (!atomicReference.compareAndSet(null, cArr)) {
                if (atomicReference.get() != null) {
                    char[] cArr2 = (char[]) atomicReference.get();
                    if (cArr2 == null || cArr2.length < cArr.length) {
                        atomicReference.set(cArr);
                    }
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m20527(AbstractC3912 abstractC3912, int i, int i2, String str, int i3, int i4) {
        char c;
        if (i3 >= 0 && i4 >= 0 && i3 + i4 <= str.length() && i2 == i4) {
            int i5 = 0;
            while (i2 > 0) {
                byte bMo11933 = abstractC3912.mo11933(i);
                int i6 = bMo11933 & 255;
                switch (i6 >> 4) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        if (i6 == 0) {
                            m20526(i6, i);
                            throw null;
                        }
                        c = (char) i6;
                        i++;
                        break;
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    default:
                        m20526(i6, i);
                        throw null;
                    case 12:
                    case 13:
                        int i7 = i + 1;
                        byte bMo11934 = abstractC3912.mo11933(i7);
                        int i8 = bMo11934 & 255;
                        if ((bMo11934 & 192) != 128) {
                            m20526(i8, i7);
                            throw null;
                        }
                        int i9 = ((bMo11933 & bo.j) << 6) | (bMo11934 & 63);
                        if (i9 != 0 && i9 < 128) {
                            m20526(i8, i7);
                            throw null;
                        }
                        c = (char) i9;
                        i += 2;
                        break;
                        break;
                    case 14:
                        int i10 = i + 1;
                        byte bMo11935 = abstractC3912.mo11933(i10);
                        int i11 = bMo11935 & 255;
                        if ((bMo11935 & 192) != 128) {
                            m20526(i11, i10);
                            throw null;
                        }
                        int i12 = i + 2;
                        byte bMo11936 = abstractC3912.mo11933(i12);
                        int i13 = bMo11936 & 255;
                        if ((bMo11936 & 192) != 128) {
                            m20526(i13, i12);
                            throw null;
                        }
                        int i14 = ((bMo11933 & 15) << 12) | ((bMo11935 & 63) << 6) | (bMo11936 & 63);
                        if (i14 < 2048) {
                            m20526(i13, i12);
                            throw null;
                        }
                        c = (char) i14;
                        i += 3;
                        break;
                        break;
                }
                if (c == str.charAt(i3 + i5)) {
                    i2--;
                    i5++;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m20524(Writer writer, AbstractC3912 abstractC3912, int i, int i2, boolean z) throws IOException {
        char c;
        int i3 = i;
        while (i2 > 0) {
            byte bMo11933 = abstractC3912.mo11933(i3);
            int i4 = bMo11933 & 255;
            switch (i4 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    if (i4 == 0) {
                        m20526(i4, i3);
                        throw null;
                    }
                    c = (char) i4;
                    i3++;
                    break;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    m20526(i4, i3);
                    throw null;
                case 12:
                case 13:
                    int i5 = i3 + 1;
                    byte bMo11934 = abstractC3912.mo11933(i5);
                    int i6 = bMo11934 & 255;
                    if ((bMo11934 & 192) != 128) {
                        m20526(i6, i5);
                        throw null;
                    }
                    int i7 = ((bMo11933 & bo.j) << 6) | (bMo11934 & 63);
                    if (i7 != 0 && i7 < 128) {
                        m20526(i6, i5);
                        throw null;
                    }
                    c = (char) i7;
                    i3 += 2;
                    break;
                    break;
                case 14:
                    int i8 = i3 + 1;
                    byte bMo11935 = abstractC3912.mo11933(i8);
                    int i9 = bMo11935 & 255;
                    if ((bMo11935 & 192) != 128) {
                        m20526(i9, i8);
                        throw null;
                    }
                    int i10 = i3 + 2;
                    byte bMo11936 = abstractC3912.mo11933(i10);
                    int i11 = bMo11936 & 255;
                    if ((bMo11936 & 192) != 128) {
                        m20526(i11, i10);
                        throw null;
                    }
                    int i12 = ((bMo11933 & 15) << 12) | ((bMo11935 & 63) << 6) | (bMo11936 & 63);
                    if (i12 < 2048) {
                        m20526(i11, i10);
                        throw null;
                    }
                    c = (char) i12;
                    i3 += 3;
                    break;
                    break;
            }
            if (z) {
                C14020.m33623(writer, c);
            } else {
                writer.write(c);
            }
            i2--;
        }
        return i3 - i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20526(int i, int i2) {
        StringBuilder sb = new StringBuilder("bad utf-8 byte ");
        char[] cArr = new char[2];
        for (int i3 = 0; i3 < 2; i3++) {
            cArr[1 - i3] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        sb.append(new String(cArr));
        sb.append(" at offset ");
        char[] cArr2 = new char[8];
        for (int i4 = 0; i4 < 8; i4++) {
            cArr2[7 - i4] = Character.forDigit(i2 & 15, 16);
            i2 >>= 4;
        }
        sb.append(new String(cArr2));
        throw new IllegalArgumentException(sb.toString());
    }
}
