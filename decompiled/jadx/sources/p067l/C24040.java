package p067l;

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
public final class C24040 implements Closeable {

    /* JADX INFO: renamed from: ۗ */
    public final long f76362;

    /* JADX INFO: renamed from: ۙ */
    public final int[] f76363;

    /* JADX INFO: renamed from: ۫ */
    public final long[] f76364;

    /* JADX INFO: renamed from: ۬ */
    public final long[] f76365;

    /* JADX INFO: renamed from: ᩶ */
    public final C13982 f76366;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f76367;

    /* JADX INFO: renamed from: ᩹ */
    public final C11971 f76368;

    /* JADX INFO: renamed from: ֫ */
    public static C11971 m53285(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[18];
        for (int i = 0; i < 18; i++) {
            int i2 = inputStream.read();
            if (i2 < 0) {
                throw new EOFException("Truncated TGA header");
            }
            bArr[i] = (byte) i2;
        }
        return new C11971(bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24040 m53287(File file, C11971 c11971, InterfaceC18588 interfaceC18588) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            if (C13853.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel()).size() > 268435456) {
                throw new C7947("TGA input exceeds byte limit");
            }
            c11971.m27407(m53285(fileInputStream));
            C24040 c24040 = new C24040(c11971, new C13982(fileInputStream), true);
            c24040.m53290(null, null, 1, interfaceC18588);
            return c24040;
        } catch (IOException | Error | RuntimeException e) {
            fileInputStream.close();
            throw e;
        }
    }

    public C24040(C11971 c11971, C13982 c13982, boolean z) throws IOException {
        this.f76368 = c11971;
        this.f76366 = c13982;
        long j = c11971.f33382;
        for (long j2 = 0; j2 < j; j2++) {
            c13982.m31772();
        }
        this.f76363 = new int[c11971.f33385];
        int i = 0;
        while (true) {
            int[] iArr = this.f76363;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = m53283(c13982, (c11971.f33379 + 7) / 8, c11971.f33379 == 32);
            i++;
        }
        this.f76362 = c13982.f39469;
        long[] jArr = (z && C11971.m27398(c11971)) ? new long[c11971.f33384] : null;
        this.f76365 = jArr;
        this.f76364 = jArr != null ? new long[c11971.f33384] : null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m53284(InputStream inputStream, C11971 c11971, Rect rect, int i, InterfaceC18588 interfaceC18588) throws IOException {
        m53288(c11971, rect, i);
        m53289(interfaceC18588);
        int iM53281 = m53281(rect.width(), i);
        int iM53282 = m53281(rect.height(), i);
        int[] iArr = new int[iM53281 * iM53282];
        C24040 c24040 = new C24040(c11971, new C13982(inputStream), false);
        c24040.m53290(iArr, rect, i, interfaceC18588);
        if (c24040.f76367) {
            for (int i2 = 0; i2 < iM53282; i2++) {
                m53289(interfaceC18588);
                int iM27396 = C11971.m27396(c11971, (i2 * i) + rect.top);
                if (iM27396 >= 0 && iM27396 < c11971.f33384) {
                    for (int i3 = 0; i3 < iM53281; i3++) {
                        int iM27390 = C11971.m27390(c11971, (i3 * i) + rect.left);
                        if (iM27390 >= 0 && iM27390 < c11971.f33377) {
                            int i4 = (i2 * iM53281) + i3;
                            iArr[i4] = iArr[i4] | (-16777216);
                        }
                    }
                }
            }
        }
        m53289(interfaceC18588);
        return Bitmap.createBitmap(iArr, iM53281, iM53282, Bitmap.Config.ARGB_8888);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX INFO: renamed from: ֫ */
    public final Bitmap m53293(Rect rect, int i, InterfaceC18588 interfaceC18588) throws Throwable {
        Bitmap bitmap;
        C13312 c13312;
        C11971 c11971 = this.f76368;
        m53288(c11971, rect, i);
        m53289(interfaceC18588);
        int iM53281 = m53281(rect.width(), i);
        int iM53282 = m53281(rect.height(), i);
        int[] iArr = new int[iM53281];
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM53281, iM53282, Bitmap.Config.ARGB_8888);
        int i2 = 0;
        int i3 = 0;
        while (i3 < iM53282) {
            try {
                m53289(interfaceC18588);
                Arrays.fill(iArr, i2);
                int iM27396 = C11971.m27396(c11971, (i3 * i) + rect.top);
                if (iM27396 < 0 || iM27396 >= c11971.f33384) {
                    i3 = i3;
                    iM53282 = iM53282;
                    iArr = iArr;
                    bitmap = bitmapCreateBitmap;
                } else {
                    int iM27390 = C11971.m27390(c11971, rect.left);
                    int iM27391 = C11971.m27390(c11971, ((iM53281 - 1) * i) + rect.left);
                    int iMax = Math.max(i2, Math.min(iM27390, iM27391));
                    int iMin = Math.min(c11971.f33377 - 1, Math.max(iM27390, iM27391));
                    if (iMax <= iMin) {
                        long j = ((long) iM27396) * ((long) c11971.f33377);
                        boolean zM27398 = C11971.m27398(c11971);
                        C13982 c13982 = this.f76366;
                        if (zM27398) {
                            c13982.m31773(this.f76365[iM27396]);
                            long j2 = this.f76364[iM27396];
                            c13312 = new C13312(this, j2);
                            bitmap = bitmapCreateBitmap;
                            long j3 = (j + ((long) iMax)) - j2;
                            for (long j4 = 0; j4 < j3; j4++) {
                                if ((j4 & 1023) == 0) {
                                    try {
                                        m53289(interfaceC18588);
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
                                c13312.m30388();
                            }
                        } else {
                            bitmap = bitmapCreateBitmap;
                            long j5 = j + ((long) iMax);
                            c13982.m31773((((long) C11971.m27393(c11971)) * j5) + this.f76362);
                            c13312 = new C13312(this, j5);
                        }
                        while (iMax <= iMin) {
                            if ((iMax & 1023) == 0) {
                                m53289(interfaceC18588);
                            }
                            int iM30388 = c13312.m30388();
                            int iM27400 = C11971.m27400(c11971, iMax) - rect.left;
                            if (iM27400 >= 0 && iM27400 % i == 0 && iM27400 / i < iM53281) {
                                int i4 = iM27400 / i;
                                if (this.f76367) {
                                    iM30388 |= -16777216;
                                }
                                iArr[i4] = iM30388;
                            }
                            iMax++;
                        }
                    } else {
                        i3 = i3;
                        iM53282 = iM53282;
                        iArr = iArr;
                        bitmap = bitmapCreateBitmap;
                    }
                }
                int i5 = i3;
                bitmap.setPixels(iArr, 0, iM53281, 0, i3, iM53281, 1);
                i3 = i5 + 1;
                i2 = 0;
                iM53282 = iM53282;
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

    /* JADX INFO: renamed from: ֫ */
    private void m53290(int[] iArr, Rect rect, int i, InterfaceC18588 interfaceC18588) throws IOException {
        int i2;
        C11971 c11971;
        int i3;
        C11971 c11972;
        boolean z;
        int i4;
        boolean z2;
        C11971 c11973;
        int i5;
        C11971 c11974 = this.f76368;
        long j = ((long) c11974.f33377) * ((long) c11974.f33384);
        int iM53281 = rect == null ? 0 : m53281(rect.width(), i);
        long j2 = 0;
        boolean z3 = true;
        boolean z4 = true;
        int i6 = 0;
        while (j2 < j) {
            m53289(interfaceC18588);
            C13982 c13982 = this.f76366;
            long j3 = c13982.f39469;
            int iM31772 = C11971.m27398(c11974) ? c13982.m31772() : 0;
            int iMin = C11971.m27398(c11974) ? (iM31772 & 127) + 1 : (int) Math.min(128L, j - j2);
            long j4 = iMin;
            if (j4 > j - j2) {
                throw new IOException("TGA packet exceeds frame bounds");
            }
            long[] jArr = this.f76365;
            if (jArr != null) {
                int i7 = i6;
                while (true) {
                    if (i7 >= c11974.f33384) {
                        i2 = iMin;
                        c11971 = c11974;
                        i3 = iM53281;
                        break;
                    }
                    i3 = iM53281;
                    i2 = iMin;
                    c11971 = c11974;
                    if (((long) c11974.f33377) * ((long) i7) >= j2 + j4) {
                        break;
                    }
                    jArr[i7] = j3;
                    this.f76364[i7] = j2;
                    i7++;
                    iM53281 = i3;
                    iMin = i2;
                    c11974 = c11971;
                }
                i6 = i7;
            } else {
                i2 = iMin;
                c11971 = c11974;
                i3 = iM53281;
            }
            boolean z5 = C11971.m27398(c11971) && (iM31772 & 128) != 0;
            int iM53280 = z5 ? m53280() : 0;
            if (z5 && iArr == null) {
                int i8 = iM53280 >>> 24;
                boolean z6 = (i8 == 0) & z3;
                j2 += j4;
                z4 = (i8 == 255) & z4;
                z3 = z6;
                c11972 = c11971;
            } else {
                int i9 = 0;
                int i10 = i2;
                while (i9 < i10) {
                    int iM53282 = z5 ? iM53280 : m53280();
                    int i11 = iM53282 >>> 24;
                    z3 &= i11 == 0;
                    boolean z7 = z4 & (i11 == 255);
                    if (iArr != null) {
                        long j5 = ((long) i9) + j2;
                        boolean z8 = z5;
                        i4 = iM53280;
                        int i12 = (int) (j5 % ((long) c11971.f33377));
                        c11973 = c11971;
                        i5 = i10;
                        int iM27400 = C11971.m27400(c11973, i12) - rect.left;
                        z = z8;
                        z2 = z7;
                        int iM27403 = C11971.m27403(c11973, (int) (j5 / ((long) c11973.f33377))) - rect.top;
                        if (iM27400 >= 0 && iM27403 >= 0 && iM27400 < rect.width() && iM27403 < rect.height() && iM27400 % i == 0 && iM27403 % i == 0) {
                            iArr[(iM27400 / i) + ((iM27403 / i) * i3)] = iM53282;
                        }
                    } else {
                        z = z5;
                        i4 = iM53280;
                        z2 = z7;
                        c11973 = c11971;
                        i5 = i10;
                    }
                    i9++;
                    iM53280 = i4;
                    i10 = i5;
                    z4 = z2;
                    c11971 = c11973;
                    z5 = z;
                }
                c11972 = c11971;
                j2 += j4;
                z4 = z4;
            }
            c11974 = c11972;
            i6 = i6;
            j = j;
            iM53281 = i3;
        }
        C11971 c11975 = c11974;
        this.f76367 = C11971.m27391(c11975) && (C11971.m27393(c11975) == 2 || C11971.m27393(c11975) == 4) && (!C11971.m27394(c11975) ? !(z3 || z4) : !z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public int m53280() throws IOException {
        C11971 c11971 = this.f76368;
        int i = c11971.f33376;
        C13982 c13982 = this.f76366;
        boolean z = true;
        if (i == 1 || c11971.f33376 == 9) {
            int iM31772 = c13982.m31772();
            if (c11971.f33372 == 16) {
                iM31772 |= c13982.m31772() << 8;
            }
            int i2 = iM31772 - c11971.f33375;
            if (i2 < 0) {
                return -16777216;
            }
            int[] iArr = this.f76363;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -16777216;
        }
        if (c11971.f33376 == 3 || c11971.f33376 == 11) {
            int iM31773 = c13982.m31772();
            return ((C11971.m27394(c11971) ? c11971.f33372 == 16 ? c13982.m31772() : 255 : 255) << 24) | (iM31773 << 16) | (iM31773 << 8) | iM31773;
        }
        int iM27393 = C11971.m27393(c11971);
        if (c11971.f33372 != 32 && !C11971.m27394(c11971)) {
            z = false;
        }
        return m53283(c13982, iM27393, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m53283(C13982 c13982, int i, boolean z) throws IOException {
        int iM31772 = c13982.m31772();
        int iM31773 = c13982.m31772();
        if (i != 2) {
            return ((z ? i == 4 ? c13982.m31772() : 255 : 255) << 24) | (c13982.m31772() << 16) | (iM31773 << 8) | iM31772;
        }
        int i2 = (iM31773 << 8) | iM31772;
        int i3 = (i2 >> 10) & 31;
        int i4 = (i2 >> 5) & 31;
        int i5 = i2 & 31;
        return ((z && (i2 & 32768) == 0) ? 0 : -16777216) | (((i3 >> 2) | (i3 << 3)) << 16) | (((i4 << 3) | (i4 >> 2)) << 8) | (i5 << 3) | (i5 >> 2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53288(C11971 c11971, Rect rect, int i) {
        if (rect.isEmpty() || rect.left < 0 || rect.top < 0 || rect.right > c11971.f33380 || rect.bottom > c11971.f33383 || i <= 0) {
            throw new IllegalArgumentException("Invalid TGA region or sample");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m53281(int i, int i2) {
        long j = i;
        long j2 = i2;
        return (int) (((j + j2) - 1) / j2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m53282(int i, byte[] bArr) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53289(InterfaceC18588 interfaceC18588) throws InterruptedIOException {
        if (interfaceC18588.mo3924()) {
            throw new InterruptedIOException("TGA decoding canceled");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f76366.f39470.close();
    }
}
