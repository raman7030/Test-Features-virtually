package p067l;

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
public final class C6762 {

    /* JADX INFO: renamed from: ֫ */
    public final C21515 f17523;

    public C6762() {
        C21515 c21515 = C21515.f67888;
        C12826.requireNonNull(c21515);
        this.f17523 = c21515;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16819 m15446(AbstractC24196 abstractC24196, C13468 c13468, BitmapFactory.Options options) {
        int i;
        long j;
        int i2;
        abstractC24196.m53500(c13468);
        C21515 c21515 = this.f17523;
        m15443(c13468, c21515);
        BitmapFactory.Options optionsM15445 = options == null ? m15445(abstractC24196, c21515) : options;
        abstractC24196.m53500(c13468);
        int i3 = optionsM15445.outWidth;
        if (i3 <= 0 || (i = optionsM15445.outHeight) <= 0) {
            C10115 c10115M15441 = m15441(abstractC24196, c21515);
            try {
                C11971 c11971M53285 = C24040.m53285(c10115M15441);
                c10115M15441.m23591();
                c21515.m48719(c11971M53285.f33380, c11971M53285.f33383);
                abstractC24196.m53500(c13468);
                C16819 c16819 = new C16819(abstractC24196.mo8382(), c11971M53285.f33380, c11971M53285.f33383, c13468, c11971M53285);
                c10115M15441.close();
                return c16819;
            } catch (Throwable th) {
                try {
                    c10115M15441.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        c21515.m48719(i3, i);
        String str = optionsM15445.outMimeType;
        int i4 = 1;
        long jLongValue = -1;
        if ("image/jpeg".equals(str) || "image/png".equals(str) || "image/webp".equals(str)) {
            C10115 c10115M15442 = m15441(abstractC24196, c21515);
            try {
                try {
                    C9596 c9596 = new C9596(c10115M15442, 0);
                    int iM22363 = c9596.m22363();
                    if (iM22363 >= 1 && iM22363 <= 8) {
                        i4 = iM22363;
                    }
                    Long lM42896 = C18833.m42896(c9596);
                    if (lM42896 != null) {
                        jLongValue = lM42896.longValue();
                    }
                } catch (Throwable th3) {
                    try {
                        c10115M15442.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (IOException | RuntimeException unused) {
            }
            c10115M15442.m23591();
            c10115M15442.close();
            abstractC24196.m53500(c13468);
            j = jLongValue;
            i2 = i4;
        } else {
            j = -1;
            i2 = 1;
        }
        return new C16819(abstractC24196.mo8382(), optionsM15445.outWidth, optionsM15445.outHeight, i2, optionsM15445.outMimeType, c13468, j);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f6 A[PHI: r16
      0x00f6: PHI (r16v3 l.᩶ۨۜ) = (r16v0 l.᩶ۨۜ), (r16v5 l.᩶ۨۜ), (r16v0 l.᩶ۨۜ) binds: [B:56:0x00f3, B:44:0x00d4, B:23:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f9 A[PHI: r16
      0x00f9: PHI (r16v1 l.᩶ۨۜ) = (r16v0 l.᩶ۨۜ), (r16v0 l.᩶ۨۜ), (r16v5 l.᩶ۨۜ), (r16v5 l.᩶ۨۜ), (r16v0 l.᩶ۨۜ), (r16v0 l.᩶ۨۜ) binds: [B:54:0x00ef, B:56:0x00f3, B:42:0x00d0, B:44:0x00d4, B:22:0x0073, B:23:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public final C23526 m15447(AbstractC24196 abstractC24196, C16819 c16819, C21358 c21358, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("Preview byte limit must be positive");
        }
        C21515 c21515 = this.f17523;
        m15444(abstractC24196, c16819, c21515);
        C13468 c13468 = c16819.f49789;
        int i = c16819.f49784;
        int i2 = c16819.f49783;
        if (c16819.f49785 != null) {
            return C22243.m50077(abstractC24196, c16819, c21358, j, null, new C13261(), this.f17523);
        }
        long jMin = Math.min(j, c21358.m48381());
        int i3 = 1;
        while (i3 > 0) {
            long jM15437 = m15437(i2, i3);
            long jM15438 = m15437(i, i3);
            long jM15439 = m15438(i2, i, i3);
            C21515 c21516 = c21515;
            long j2 = 2048;
            if (jM15437 <= j2 && jM15438 <= j2 && jM15437 * jM15438 <= 4194304 && jM15439 <= jMin) {
                C23369 c23369M48382 = c21358.m48382(jM15439);
                if (c23369M48382 != null) {
                    Bitmap bitmap = null;
                    try {
                        abstractC24196.m53500(c13468);
                        Bitmap bitmapM15439 = m15439(abstractC24196, m15440(i3), c21516);
                        abstractC24196.m53500(c13468);
                        if (bitmapM15439 == null) {
                            throw new IOException("Image preview could not be decoded");
                        }
                        long allocationByteCount = bitmapM15439.getAllocationByteCount();
                        if (bitmapM15439.getWidth() > 2048 || bitmapM15439.getHeight() > 2048) {
                            c21516 = c21516;
                        } else if (((long) bitmapM15439.getWidth()) * ((long) bitmapM15439.getHeight()) <= 4194304 && allocationByteCount <= jMin && c23369M48382.m52021(allocationByteCount)) {
                            c21516 = c21516;
                            return new C23526(bitmapM15439, c23369M48382, i3);
                        }
                        c21516 = c21516;
                        c21516 = c21516;
                        c21516 = c21516;
                        bitmapM15439.recycle();
                        c23369M48382.close();
                        if (i3 >= Math.max(i2, i) || i3 >= 1073741824) {
                            i3 = 0;
                        } else {
                            i3 *= 2;
                        }
                    } catch (Throwable th) {
                        if (0 != 0) {
                            bitmap.recycle();
                        }
                        c23369M48382.close();
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
            c21515 = c21516;
        }
        throw new C3409("No safe preview allocation fits the bitmap budget");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15444(AbstractC24196 abstractC24196, C16819 c16819, C21515 c21515) throws IOException {
        String strMo8382 = abstractC24196.mo8382();
        String str = c16819.f49787;
        C13468 c13468 = c16819.f49789;
        if (!strMo8382.equals(str)) {
            throw new C8103("Metadata belongs to another image source");
        }
        c21515.m48719(c16819.f49783, c16819.f49784);
        m15443(c13468, c21515);
        abstractC24196.m53500(c13468);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15443(C13468 c13468, C21515 c21515) throws C3409 {
        long j = c13468.f37803;
        c21515.getClass();
        if (j > 268435456) {
            throw new C3409("Image input exceeds byte limit");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static BitmapFactory.Options m15440(int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inScaled = false;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return options;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m15439(AbstractC24196 abstractC24196, BitmapFactory.Options options, C21515 c21515) {
        Bitmap bitmap = null;
        if (abstractC24196.mo19605() != null) {
            try {
                InputStream inputStreamMo8380 = abstractC24196.mo8380();
                try {
                    if (!(inputStreamMo8380 instanceof FileInputStream)) {
                        throw new IOException("Local source requires a file stream");
                    }
                    Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(((FileInputStream) inputStreamMo8380).getFD(), null, options);
                    inputStreamMo8380.close();
                    return bitmapDecodeFileDescriptor;
                } catch (Throwable th) {
                    if (inputStreamMo8380 != null) {
                        try {
                            inputStreamMo8380.close();
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
            C10115 c10115M15441 = m15441(abstractC24196, c21515);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(c10115M15441, null, options);
                c10115M15441.m23591();
                c10115M15441.close();
                return bitmapDecodeStream;
            } catch (Throwable th3) {
                try {
                    c10115M15441.close();
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

    /* JADX INFO: renamed from: ֫ */
    public static C10115 m15441(AbstractC24196 abstractC24196, C21515 c21515) {
        InputStream inputStreamMo8380 = abstractC24196.mo8380();
        c21515.getClass();
        return new C10115(inputStreamMo8380);
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m15437(int i, int i2) {
        long j = i;
        long j2 = i2;
        return ((j + j2) - 1) / j2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m15438(int i, int i2, int i3) {
        return m15437(i, i3) * m15437(i2, i3) * 4;
    }

    /* JADX INFO: renamed from: ۧ */
    public static BitmapFactory.Options m15445(AbstractC24196 abstractC24196, C21515 c21515) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        m15439(abstractC24196, options, c21515);
        return options;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23526 m15442(C23526 c23526, C23369 c23369, long j) throws Throwable {
        Bitmap bitmap;
        Bitmap bitmapCreateScaledBitmap;
        int i = 1;
        while (true) {
            bitmap = c23526.f74960;
            if (m15438(bitmap.getWidth(), bitmap.getHeight(), i) <= j) {
                break;
            }
            i *= 2;
        }
        if (i == 1) {
            c23369.close();
            return c23526.m52304();
        }
        try {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) m15437(bitmap.getWidth(), i), (int) m15437(bitmap.getHeight(), i), true);
            try {
                if (!c23369.m52021(bitmapCreateScaledBitmap.getAllocationByteCount())) {
                    throw new C3409("Scaled preview exceeded its budget");
                }
                return new C23526(bitmapCreateScaledBitmap, c23369, c23526.f74957 * i);
            } catch (Throwable th) {
                th = th;
                if (bitmapCreateScaledBitmap != null) {
                    bitmapCreateScaledBitmap.recycle();
                }
                c23369.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bitmapCreateScaledBitmap = null;
        }
    }
}
