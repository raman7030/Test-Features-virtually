package p067l;

import com.umeng.analytics.pro.C0684bo;
import java.io.IOException;
import java.io.Writer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۟᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D52R */
/* JADX INFO: loaded from: classes3.dex */
public final class C9659 {

    /* JADX INFO: renamed from: ֫ */
    public static final AtomicReference f26608 = new AtomicReference();

    /* JADX INFO: renamed from: ֫ */
    public static String m22505(AbstractC6086 abstractC6086, int i, int i2, int[] iArr) {
        char c;
        int i3 = i2;
        AtomicReference atomicReference = f26608;
        char[] cArr = (char[]) atomicReference.getAndSet(null);
        if (cArr == null || cArr.length < i3) {
            cArr = new char[i3];
        }
        int i4 = 0;
        int i5 = i;
        while (i3 > 0) {
            byte bMo13853 = abstractC6086.mo13853(i5);
            int i6 = bMo13853 & 255;
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
                        m22506(i6, i5);
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
                    m22506(i6, i5);
                    throw null;
                case 12:
                case 13:
                    int i7 = i5 + 1;
                    byte bMo13854 = abstractC6086.mo13853(i7);
                    int i8 = bMo13854 & 255;
                    if ((bMo13854 & 192) != 128) {
                        m22506(i8, i7);
                        throw null;
                    }
                    int i9 = ((bMo13853 & C0684bo.f2505j) << 6) | (bMo13854 & 63);
                    if (i9 != 0 && i9 < 128) {
                        m22506(i8, i7);
                        throw null;
                    }
                    c = (char) i9;
                    i5 += 2;
                    break;
                    break;
                case 14:
                    int i10 = i5 + 1;
                    byte bMo13855 = abstractC6086.mo13853(i10);
                    int i11 = bMo13855 & 255;
                    if ((bMo13855 & 192) != 128) {
                        m22506(i11, i10);
                        throw null;
                    }
                    int i12 = i5 + 2;
                    byte bMo13856 = abstractC6086.mo13853(i12);
                    int i13 = bMo13856 & 255;
                    if ((bMo13856 & 192) != 128) {
                        m22506(i13, i12);
                        throw null;
                    }
                    int i14 = ((bMo13853 & 15) << 12) | ((bMo13855 & 63) << 6) | (bMo13856 & 63);
                    if (i14 < 2048) {
                        m22506(i13, i12);
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

    /* JADX INFO: renamed from: ֫ */
    public static boolean m22507(AbstractC6086 abstractC6086, int i, int i2, String str, int i3, int i4) {
        char c;
        if (i3 >= 0 && i4 >= 0 && i3 + i4 <= str.length() && i2 == i4) {
            int i5 = 0;
            while (i2 > 0) {
                byte bMo13853 = abstractC6086.mo13853(i);
                int i6 = bMo13853 & 255;
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
                            m22506(i6, i);
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
                        m22506(i6, i);
                        throw null;
                    case 12:
                    case 13:
                        int i7 = i + 1;
                        byte bMo13854 = abstractC6086.mo13853(i7);
                        int i8 = bMo13854 & 255;
                        if ((bMo13854 & 192) != 128) {
                            m22506(i8, i7);
                            throw null;
                        }
                        int i9 = ((bMo13853 & C0684bo.f2505j) << 6) | (bMo13854 & 63);
                        if (i9 != 0 && i9 < 128) {
                            m22506(i8, i7);
                            throw null;
                        }
                        c = (char) i9;
                        i += 2;
                        break;
                        break;
                    case 14:
                        int i10 = i + 1;
                        byte bMo13855 = abstractC6086.mo13853(i10);
                        int i11 = bMo13855 & 255;
                        if ((bMo13855 & 192) != 128) {
                            m22506(i11, i10);
                            throw null;
                        }
                        int i12 = i + 2;
                        byte bMo13856 = abstractC6086.mo13853(i12);
                        int i13 = bMo13856 & 255;
                        if ((bMo13856 & 192) != 128) {
                            m22506(i13, i12);
                            throw null;
                        }
                        int i14 = ((bMo13853 & 15) << 12) | ((bMo13855 & 63) << 6) | (bMo13856 & 63);
                        if (i14 < 2048) {
                            m22506(i13, i12);
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

    /* JADX INFO: renamed from: ֫ */
    public static int m22504(Writer writer, AbstractC6086 abstractC6086, int i, int i2, boolean z) throws IOException {
        char c;
        int i3 = i;
        while (i2 > 0) {
            byte bMo13853 = abstractC6086.mo13853(i3);
            int i4 = bMo13853 & 255;
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
                        m22506(i4, i3);
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
                    m22506(i4, i3);
                    throw null;
                case 12:
                case 13:
                    int i5 = i3 + 1;
                    byte bMo13854 = abstractC6086.mo13853(i5);
                    int i6 = bMo13854 & 255;
                    if ((bMo13854 & 192) != 128) {
                        m22506(i6, i5);
                        throw null;
                    }
                    int i7 = ((bMo13853 & C0684bo.f2505j) << 6) | (bMo13854 & 63);
                    if (i7 != 0 && i7 < 128) {
                        m22506(i6, i5);
                        throw null;
                    }
                    c = (char) i7;
                    i3 += 2;
                    break;
                    break;
                case 14:
                    int i8 = i3 + 1;
                    byte bMo13855 = abstractC6086.mo13853(i8);
                    int i9 = bMo13855 & 255;
                    if ((bMo13855 & 192) != 128) {
                        m22506(i9, i8);
                        throw null;
                    }
                    int i10 = i3 + 2;
                    byte bMo13856 = abstractC6086.mo13853(i10);
                    int i11 = bMo13856 & 255;
                    if ((bMo13856 & 192) != 128) {
                        m22506(i11, i10);
                        throw null;
                    }
                    int i12 = ((bMo13853 & 15) << 12) | ((bMo13855 & 63) << 6) | (bMo13856 & 63);
                    if (i12 < 2048) {
                        m22506(i11, i10);
                        throw null;
                    }
                    c = (char) i12;
                    i3 += 3;
                    break;
                    break;
            }
            if (z) {
                C15693.m35743(writer, c);
            } else {
                writer.write(c);
            }
            i2--;
        }
        return i3 - i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22506(int i, int i2) {
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
