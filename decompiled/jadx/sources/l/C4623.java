package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۙۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6MT */
/* JADX INFO: loaded from: classes2.dex */
public final class C4623 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20146 f14695;

    public C4623() {
        C20146 c20146 = C20146.f65246;
        C11003.requireNonNull(c20146);
        this.f14695 = c20146;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15205 m13571(AbstractC22967 abstractC22967, C11679 c11679, BitmapFactory.Options options) {
        int i;
        long j;
        int i2;
        abstractC22967.m51108(c11679);
        C20146 c20146 = this.f14695;
        m13568(c11679, c20146);
        BitmapFactory.Options optionsM13570 = options == null ? m13570(abstractC22967, c20146) : options;
        abstractC22967.m51108(c11679);
        int i3 = optionsM13570.outWidth;
        if (i3 <= 0 || (i = optionsM13570.outHeight) <= 0) {
            C8151 c8151M13566 = m13566(abstractC22967, c20146);
            try {
                C10104 c10104M50895 = C22803.m50895(c8151M13566);
                c8151M13566.m21622();
                c20146.m46403(c10104M50895.f30421, c10104M50895.f30424);
                abstractC22967.m51108(c11679);
                C15205 c15205 = new C15205(abstractC22967.mo6180(), c10104M50895.f30421, c10104M50895.f30424, c11679, c10104M50895);
                c8151M13566.close();
                return c15205;
            } catch (Throwable th) {
                try {
                    c8151M13566.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        c20146.m46403(i3, i);
        String str = optionsM13570.outMimeType;
        int i4 = 1;
        long jLongValue = -1;
        if ("image/jpeg".equals(str) || "image/png".equals(str) || "image/webp".equals(str)) {
            C8151 c8151M13567 = m13566(abstractC22967, c20146);
            try {
                try {
                    C7605 c7605 = new C7605(c8151M13567, 0);
                    int iM20384 = c7605.m20384();
                    if (iM20384 >= 1 && iM20384 <= 8) {
                        i4 = iM20384;
                    }
                    Long lM40645 = C17324.m40645(c7605);
                    if (lM40645 != null) {
                        jLongValue = lM40645.longValue();
                    }
                } catch (Throwable th3) {
                    try {
                        c8151M13567.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (IOException | RuntimeException unused) {
            }
            c8151M13567.m21622();
            c8151M13567.close();
            abstractC22967.m51108(c11679);
            j = jLongValue;
            i2 = i4;
        } else {
            j = -1;
            i2 = 1;
        }
        return new C15205(abstractC22967.mo6180(), optionsM13570.outWidth, optionsM13570.outHeight, i2, optionsM13570.outMimeType, c11679, j);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f6 A[PHI: r16
      0x00f6: PHI (r16v3 l.᩶ۨۜ) = (r16v0 l.᩶ۨۜ), (r16v5 l.᩶ۨۜ), (r16v0 l.᩶ۨۜ) binds: [B:56:0x00f3, B:44:0x00d4, B:23:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f9 A[PHI: r16
      0x00f9: PHI (r16v1 l.᩶ۨۜ) = (r16v0 l.᩶ۨۜ), (r16v0 l.᩶ۨۜ), (r16v5 l.᩶ۨۜ), (r16v5 l.᩶ۨۜ), (r16v0 l.᩶ۨۜ), (r16v0 l.᩶ۨۜ) binds: [B:54:0x00ef, B:56:0x00f3, B:42:0x00d0, B:44:0x00d4, B:22:0x0073, B:23:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22262 m13572(AbstractC22967 abstractC22967, C15205 c15205, C19981 c19981, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("Preview byte limit must be positive");
        }
        C20146 c20146 = this.f14695;
        m13569(abstractC22967, c15205, c20146);
        C11679 c11679 = c15205.f46664;
        int i = c15205.f46659;
        int i2 = c15205.f46658;
        if (c15205.f46660 != null) {
            return C20912.m47747(abstractC22967, c15205, c19981, j, null, new C11461(), this.f14695);
        }
        long jMin = Math.min(j, c19981.m46067());
        int i3 = 1;
        while (i3 > 0) {
            long jM13562 = m13562(i2, i3);
            long jM13563 = m13562(i, i3);
            long jM13564 = m13563(i2, i, i3);
            C20146 c20147 = c20146;
            long j2 = 2048;
            if (jM13562 <= j2 && jM13563 <= j2 && jM13562 * jM13563 <= 4194304 && jM13564 <= jMin) {
                C22097 c22097M46068 = c19981.m46068(jM13564);
                if (c22097M46068 != null) {
                    Bitmap bitmap = null;
                    try {
                        abstractC22967.m51108(c11679);
                        Bitmap bitmapM13564 = m13564(abstractC22967, m13565(i3), c20147);
                        abstractC22967.m51108(c11679);
                        if (bitmapM13564 == null) {
                            throw new IOException("Image preview could not be decoded");
                        }
                        long allocationByteCount = bitmapM13564.getAllocationByteCount();
                        if (bitmapM13564.getWidth() > 2048 || bitmapM13564.getHeight() > 2048) {
                            c20147 = c20147;
                        } else if (((long) bitmapM13564.getWidth()) * ((long) bitmapM13564.getHeight()) <= 4194304 && allocationByteCount <= jMin && c22097M46068.m49683(allocationByteCount)) {
                            c20147 = c20147;
                            return new C22262(bitmapM13564, c22097M46068, i3);
                        }
                        c20147 = c20147;
                        c20147 = c20147;
                        c20147 = c20147;
                        bitmapM13564.recycle();
                        c22097M46068.close();
                        if (i3 >= Math.max(i2, i) || i3 >= 1073741824) {
                            i3 = 0;
                        } else {
                            i3 *= 2;
                        }
                    } catch (Throwable th) {
                        if (0 != 0) {
                            bitmap.recycle();
                        }
                        c22097M46068.close();
                        throw th;
                    }
                } else if (i3 >= Math.max(i2, i) || i3 >= 1073741824) {
                    i3 = 0;
                } else {
                    i3 *= 2;
                }
            } else if (i3 >= Math.max(i2, i) || i3 >= 1073741824) {
                i3 = 0;
            } else {
                i3 *= 2;
            }
            c20146 = c20147;
        }
        throw new C1095("No safe preview allocation fits the bitmap budget");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13569(AbstractC22967 abstractC22967, C15205 c15205, C20146 c20146) throws IOException {
        String strMo6180 = abstractC22967.mo6180();
        String str = c15205.f46662;
        C11679 c11679 = c15205.f46664;
        if (!strMo6180.equals(str)) {
            throw new C6034("Metadata belongs to another image source");
        }
        c20146.m46403(c15205.f46658, c15205.f46659);
        m13568(c11679, c20146);
        abstractC22967.m51108(c11679);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13568(C11679 c11679, C20146 c20146) throws C1095 {
        long j = c11679.f34804;
        c20146.getClass();
        if (j > 268435456) {
            throw new C1095("Image input exceeds byte limit");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static BitmapFactory.Options m13565(int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inScaled = false;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return options;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m13564(AbstractC22967 abstractC22967, BitmapFactory.Options options, C20146 c20146) {
        Bitmap bitmap = null;
        if (abstractC22967.mo17660() != null) {
            try {
                InputStream inputStreamMo6178 = abstractC22967.mo6178();
                try {
                    if (!(inputStreamMo6178 instanceof FileInputStream)) {
                        throw new IOException("Local source requires a file stream");
                    }
                    Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(((FileInputStream) inputStreamMo6178).getFD(), null, options);
                    inputStreamMo6178.close();
                    return bitmapDecodeFileDescriptor;
                } catch (Throwable th) {
                    if (inputStreamMo6178 != null) {
                        try {
                            inputStreamMo6178.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException | Error | RuntimeException e) {
                if (0 != 0) {
                    bitmap.recycle();
                }
                throw e;
            }
        }
        try {
            C8151 c8151M13566 = m13566(abstractC22967, c20146);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(c8151M13566, null, options);
                c8151M13566.m21622();
                c8151M13566.close();
                return bitmapDecodeStream;
            } catch (Throwable th3) {
                try {
                    c8151M13566.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException | Error | RuntimeException e2) {
            if (0 != 0) {
                bitmap.recycle();
            }
            throw e2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8151 m13566(AbstractC22967 abstractC22967, C20146 c20146) {
        InputStream inputStreamMo6178 = abstractC22967.mo6178();
        c20146.getClass();
        return new C8151(inputStreamMo6178);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m13562(int i, int i2) {
        long j = i;
        long j2 = i2;
        return ((j + j2) - 1) / j2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m13563(int i, int i2, int i3) {
        return m13562(i, i3) * m13562(i2, i3) * 4;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static BitmapFactory.Options m13570(AbstractC22967 abstractC22967, C20146 c20146) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        m13564(abstractC22967, options, c20146);
        return options;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22262 m13567(C22262 c22262, C22097 c22097, long j) throws Throwable {
        Bitmap bitmap;
        Bitmap bitmapCreateScaledBitmap;
        int i = 1;
        while (true) {
            bitmap = c22262.f72236;
            if (m13563(bitmap.getWidth(), bitmap.getHeight(), i) <= j) {
                break;
            }
            i *= 2;
        }
        if (i == 1) {
            c22097.close();
            return c22262.m49976();
        }
        try {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) m13562(bitmap.getWidth(), i), (int) m13562(bitmap.getHeight(), i), true);
            try {
                if (!c22097.m49683(bitmapCreateScaledBitmap.getAllocationByteCount())) {
                    throw new C1095("Scaled preview exceeded its budget");
                }
                return new C22262(bitmapCreateScaledBitmap, c22097, c22262.f72233 * i);
            } catch (Throwable th) {
                th = th;
                if (bitmapCreateScaledBitmap != null) {
                    bitmapCreateScaledBitmap.recycle();
                }
                c22097.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bitmapCreateScaledBitmap = null;
        }
    }
}
