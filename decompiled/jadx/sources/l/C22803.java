package l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺ۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86JZ */
/* JADX INFO: loaded from: classes.dex */
public final class C22803 implements Closeable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f73632;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f73633;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long[] f73634;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long[] f73635;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12220 f73636;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f73637;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10104 f73638;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10104 m50895(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[18];
        for (int i = 0; i < 18; i++) {
            int i2 = inputStream.read();
            if (i2 < 0) {
                throw new EOFException("Truncated TGA header");
            }
            bArr[i] = (byte) i2;
        }
        return new C10104(bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22803 m50897(File file, C10104 c10104, InterfaceC17066 interfaceC17066) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            if (C12084.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel()).size() > 268435456) {
                throw new C5870("TGA input exceeds byte limit");
            }
            c10104.m25388(m50895(fileInputStream));
            C22803 c22803 = new C22803(c10104, new C12220(fileInputStream), true);
            c22803.m50900(null, null, 1, interfaceC17066);
            return c22803;
        } catch (IOException | Error | RuntimeException e) {
            fileInputStream.close();
            throw e;
        }
    }

    public C22803(C10104 c10104, C12220 c12220, boolean z) throws IOException {
        this.f73638 = c10104;
        this.f73636 = c12220;
        long j = c10104.f30423;
        for (long j2 = 0; j2 < j; j2++) {
            c12220.m29710();
        }
        this.f73633 = new int[c10104.f30426];
        int i = 0;
        while (true) {
            int[] iArr = this.f73633;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = m50893(c12220, (c10104.f30420 + 7) / 8, c10104.f30420 == 32);
            i++;
        }
        this.f73632 = c12220.f36455;
        long[] jArr = (z && C10104.m25379(c10104)) ? new long[c10104.f30425] : null;
        this.f73635 = jArr;
        this.f73634 = jArr != null ? new long[c10104.f30425] : null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m50894(InputStream inputStream, C10104 c10104, Rect rect, int i, InterfaceC17066 interfaceC17066) throws IOException {
        m50898(c10104, rect, i);
        m50899(interfaceC17066);
        int iM50891 = m50891(rect.width(), i);
        int iM50892 = m50891(rect.height(), i);
        int[] iArr = new int[iM50891 * iM50892];
        C22803 c22803 = new C22803(c10104, new C12220(inputStream), false);
        c22803.m50900(iArr, rect, i, interfaceC17066);
        if (c22803.f73637) {
            for (int i2 = 0; i2 < iM50892; i2++) {
                m50899(interfaceC17066);
                int iM25377 = C10104.m25377(c10104, (i2 * i) + rect.top);
                if (iM25377 >= 0 && iM25377 < c10104.f30425) {
                    for (int i3 = 0; i3 < iM50891; i3++) {
                        int iM25371 = C10104.m25371(c10104, (i3 * i) + rect.left);
                        if (iM25371 >= 0 && iM25371 < c10104.f30418) {
                            int i4 = (i2 * iM50891) + i3;
                            iArr[i4] = iArr[i4] | (-16777216);
                        }
                    }
                }
            }
        }
        m50899(interfaceC17066);
        return Bitmap.createBitmap(iArr, iM50891, iM50892, Bitmap.Config.ARGB_8888);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap m50903(Rect rect, int i, InterfaceC17066 interfaceC17066) throws Throwable {
        Bitmap bitmap;
        C11515 c11515;
        C10104 c10104 = this.f73638;
        m50898(c10104, rect, i);
        m50899(interfaceC17066);
        int iM50891 = m50891(rect.width(), i);
        int iM50892 = m50891(rect.height(), i);
        int[] iArr = new int[iM50891];
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM50891, iM50892, Bitmap.Config.ARGB_8888);
        int i2 = 0;
        int i3 = 0;
        while (i3 < iM50892) {
            try {
                m50899(interfaceC17066);
                Arrays.fill(iArr, i2);
                int iM25377 = C10104.m25377(c10104, (i3 * i) + rect.top);
                if (iM25377 < 0 || iM25377 >= c10104.f30425) {
                    i3 = i3;
                    iM50892 = iM50892;
                    iArr = iArr;
                    bitmap = bitmapCreateBitmap;
                } else {
                    int iM25371 = C10104.m25371(c10104, rect.left);
                    int iM25372 = C10104.m25371(c10104, ((iM50891 - 1) * i) + rect.left);
                    int iMax = Math.max(i2, Math.min(iM25371, iM25372));
                    int iMin = Math.min(c10104.f30418 - 1, Math.max(iM25371, iM25372));
                    if (iMax <= iMin) {
                        long j = ((long) iM25377) * ((long) c10104.f30418);
                        boolean zM25379 = C10104.m25379(c10104);
                        C12220 c12220 = this.f73636;
                        if (zM25379) {
                            c12220.m29711(this.f73635[iM25377]);
                            long j2 = this.f73634[iM25377];
                            c11515 = new C11515(this, j2);
                            bitmap = bitmapCreateBitmap;
                            long j3 = (j + ((long) iMax)) - j2;
                            for (long j4 = 0; j4 < j3; j4++) {
                                if ((j4 & 1023) == 0) {
                                    try {
                                        m50899(interfaceC17066);
                                    } catch (IOException e) {
                                        e = e;
                                        bitmap.recycle();
                                        throw e;
                                    } catch (Error e2) {
                                        e = e2;
                                        bitmap.recycle();
                                        throw e;
                                    } catch (RuntimeException e3) {
                                        e = e3;
                                        bitmap.recycle();
                                        throw e;
                                    }
                                }
                                c11515.m28342();
                            }
                        } else {
                            bitmap = bitmapCreateBitmap;
                            long j5 = j + ((long) iMax);
                            c12220.m29711((((long) C10104.m25374(c10104)) * j5) + this.f73632);
                            c11515 = new C11515(this, j5);
                        }
                        while (iMax <= iMin) {
                            if ((iMax & 1023) == 0) {
                                m50899(interfaceC17066);
                            }
                            int iM28342 = c11515.m28342();
                            int iM25381 = C10104.m25381(c10104, iMax) - rect.left;
                            if (iM25381 >= 0 && iM25381 % i == 0 && iM25381 / i < iM50891) {
                                int i4 = iM25381 / i;
                                if (this.f73637) {
                                    iM28342 |= -16777216;
                                }
                                iArr[i4] = iM28342;
                            }
                            iMax++;
                        }
                    } else {
                        i3 = i3;
                        iM50892 = iM50892;
                        iArr = iArr;
                        bitmap = bitmapCreateBitmap;
                    }
                }
                int i5 = i3;
                bitmap.setPixels(iArr, 0, iM50891, 0, i3, iM50891, 1);
                i3 = i5 + 1;
                i2 = 0;
                iM50892 = iM50892;
                iArr = iArr;
                bitmapCreateBitmap = bitmap;
            } catch (IOException e4) {
                e = e4;
                bitmap = bitmapCreateBitmap;
                bitmap.recycle();
                throw e;
            } catch (Error e5) {
                e = e5;
                bitmap = bitmapCreateBitmap;
                bitmap.recycle();
                throw e;
            } catch (RuntimeException e6) {
                e = e6;
                bitmap = bitmapCreateBitmap;
                bitmap.recycle();
                throw e;
            }
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50900(int[] iArr, Rect rect, int i, InterfaceC17066 interfaceC17066) throws IOException {
        int i2;
        C10104 c10104;
        int i3;
        C10104 c10105;
        boolean z;
        int i4;
        boolean z2;
        C10104 c10106;
        int i5;
        C10104 c10107 = this.f73638;
        long j = ((long) c10107.f30418) * ((long) c10107.f30425);
        int iM50891 = rect == null ? 0 : m50891(rect.width(), i);
        long j2 = 0;
        boolean z3 = true;
        boolean z4 = true;
        int i6 = 0;
        while (j2 < j) {
            m50899(interfaceC17066);
            C12220 c12220 = this.f73636;
            long j3 = c12220.f36455;
            int iM29710 = C10104.m25379(c10107) ? c12220.m29710() : 0;
            int iMin = C10104.m25379(c10107) ? (iM29710 & 127) + 1 : (int) Math.min(128L, j - j2);
            long j4 = iMin;
            if (j4 > j - j2) {
                throw new IOException("TGA packet exceeds frame bounds");
            }
            long[] jArr = this.f73635;
            if (jArr != null) {
                int i7 = i6;
                while (true) {
                    if (i7 >= c10107.f30425) {
                        i2 = iMin;
                        c10104 = c10107;
                        i3 = iM50891;
                        break;
                    }
                    i3 = iM50891;
                    i2 = iMin;
                    c10104 = c10107;
                    if (((long) c10107.f30418) * ((long) i7) >= j2 + j4) {
                        break;
                    }
                    jArr[i7] = j3;
                    this.f73634[i7] = j2;
                    i7++;
                    iM50891 = i3;
                    iMin = i2;
                    c10107 = c10104;
                }
                i6 = i7;
            } else {
                i2 = iMin;
                c10104 = c10107;
                i3 = iM50891;
            }
            boolean z5 = C10104.m25379(c10104) && (iM29710 & 128) != 0;
            int iM50890 = z5 ? m50890() : 0;
            if (z5 && iArr == null) {
                int i8 = iM50890 >>> 24;
                boolean z6 = (i8 == 0) & z3;
                j2 += j4;
                z4 = (i8 == 255) & z4;
                z3 = z6;
                c10105 = c10104;
            } else {
                int i9 = 0;
                int i10 = i2;
                while (i9 < i10) {
                    int iM50892 = z5 ? iM50890 : m50890();
                    int i11 = iM50892 >>> 24;
                    z3 &= i11 == 0;
                    boolean z7 = z4 & (i11 == 255);
                    if (iArr != null) {
                        long j5 = ((long) i9) + j2;
                        boolean z8 = z5;
                        i4 = iM50890;
                        int i12 = (int) (j5 % ((long) c10104.f30418));
                        c10106 = c10104;
                        i5 = i10;
                        int iM25381 = C10104.m25381(c10106, i12) - rect.left;
                        z = z8;
                        z2 = z7;
                        int iM25384 = C10104.m25384(c10106, (int) (j5 / ((long) c10106.f30418))) - rect.top;
                        if (iM25381 >= 0 && iM25384 >= 0 && iM25381 < rect.width() && iM25384 < rect.height() && iM25381 % i == 0 && iM25384 % i == 0) {
                            iArr[(iM25381 / i) + ((iM25384 / i) * i3)] = iM50892;
                        }
                    } else {
                        z = z5;
                        i4 = iM50890;
                        z2 = z7;
                        c10106 = c10104;
                        i5 = i10;
                    }
                    i9++;
                    iM50890 = i4;
                    i10 = i5;
                    z4 = z2;
                    c10104 = c10106;
                    z5 = z;
                }
                c10105 = c10104;
                j2 += j4;
                z4 = z4;
            }
            c10107 = c10105;
            i6 = i6;
            j = j;
            iM50891 = i3;
        }
        C10104 c10108 = c10107;
        this.f73637 = C10104.m25372(c10108) && (C10104.m25374(c10108) == 2 || C10104.m25374(c10108) == 4) && (!C10104.m25375(c10108) ? !(z3 || z4) : !z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m50890() throws IOException {
        C10104 c10104 = this.f73638;
        int i = c10104.f30417;
        C12220 c12220 = this.f73636;
        boolean z = true;
        if (i == 1 || c10104.f30417 == 9) {
            int iM29710 = c12220.m29710();
            if (c10104.f30413 == 16) {
                iM29710 |= c12220.m29710() << 8;
            }
            int i2 = iM29710 - c10104.f30416;
            if (i2 < 0) {
                return -16777216;
            }
            int[] iArr = this.f73633;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -16777216;
        }
        if (c10104.f30417 == 3 || c10104.f30417 == 11) {
            int iM29711 = c12220.m29710();
            return ((C10104.m25375(c10104) ? c10104.f30413 == 16 ? c12220.m29710() : 255 : 255) << 24) | (iM29711 << 16) | (iM29711 << 8) | iM29711;
        }
        int iM25374 = C10104.m25374(c10104);
        if (c10104.f30413 != 32 && !C10104.m25375(c10104)) {
            z = false;
        }
        return m50893(c12220, iM25374, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m50893(C12220 c12220, int i, boolean z) throws IOException {
        int iM29710 = c12220.m29710();
        int iM29711 = c12220.m29710();
        if (i != 2) {
            return ((z ? i == 4 ? c12220.m29710() : 255 : 255) << 24) | (c12220.m29710() << 16) | (iM29711 << 8) | iM29710;
        }
        int i2 = (iM29711 << 8) | iM29710;
        int i3 = (i2 >> 10) & 31;
        int i4 = (i2 >> 5) & 31;
        int i5 = i2 & 31;
        return ((z && (i2 & 32768) == 0) ? 0 : -16777216) | (((i3 >> 2) | (i3 << 3)) << 16) | (((i4 << 3) | (i4 >> 2)) << 8) | (i5 << 3) | (i5 >> 2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50898(C10104 c10104, Rect rect, int i) {
        if (rect.isEmpty() || rect.left < 0 || rect.top < 0 || rect.right > c10104.f30421 || rect.bottom > c10104.f30424 || i <= 0) {
            throw new IllegalArgumentException("Invalid TGA region or sample");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m50891(int i, int i2) {
        long j = i;
        long j2 = i2;
        return (int) (((j + j2) - 1) / j2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m50892(int i, byte[] bArr) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50899(InterfaceC17066 interfaceC17066) throws InterruptedIOException {
        if (interfaceC17066.mo1526()) {
            throw new InterruptedIOException("TGA decoding canceled");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f73636.f36456.close();
    }
}
