package l;

import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.os.Looper;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܰܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06MC */
/* JADX INFO: loaded from: classes3.dex */
public final class C13854 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Thread f41314 = Thread.currentThread();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15205 f41315;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C22097 f41316;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22803 f41317;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC22967 f41318;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InputStream f41319;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f41320;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final BitmapRegionDecoder f41321;

    public C13854(AbstractC22967 abstractC22967, C15205 c15205, InputStream inputStream, BitmapRegionDecoder bitmapRegionDecoder) {
        this.f41318 = abstractC22967;
        this.f41315 = c15205;
        this.f41319 = inputStream;
        this.f41321 = bitmapRegionDecoder;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.᩶ۨۜ] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13854 m33208(AbstractC22967 abstractC22967, C15205 c15205) throws Throwable {
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        InputStream inputStream;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Tile decoder must be opened on a worker thread");
        }
        ?? r0 = C20146.f65246;
        C4623.m13569(abstractC22967, c15205, (C20146) r0);
        C11679 c11679 = c15205.f46664;
        if (!m33210(c15205.f46661)) {
            throw new C23027("Image format does not support region decoding");
        }
        BitmapRegionDecoder bitmapRegionDecoder = null;
        try {
            try {
                if (abstractC22967.mo17660() != null) {
                    InputStream inputStreamMo6178 = abstractC22967.mo6178();
                    if (!(inputStreamMo6178 instanceof FileInputStream)) {
                        throw new IOException("Local source requires a file stream");
                    }
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(((FileInputStream) inputStreamMo6178).getFD(), false);
                    inputStream = inputStreamMo6178;
                } else {
                    C8151 c8151M13566 = C4623.m13566(abstractC22967, (C20146) r0);
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance((InputStream) c8151M13566, false);
                    c8151M13566.m21622();
                    inputStream = c8151M13566;
                }
                abstractC22967.m51108(c11679);
                if (bitmapRegionDecoderNewInstance == null) {
                    throw new C23027("Platform rejected region decoding");
                }
                if (bitmapRegionDecoderNewInstance.getWidth() != c15205.f46658 || bitmapRegionDecoderNewInstance.getHeight() != c15205.f46659) {
                    throw new C6034("Region decoder dimensions changed");
                }
                return new C13854(abstractC22967, c15205, inputStream, bitmapRegionDecoderNewInstance);
            } catch (IOException e) {
                e = e;
                try {
                    abstractC22967.m51108(c11679);
                    if (!(e instanceof C6034) && !(e instanceof C23027)) {
                        throw new C23027("Platform could not open a region decoder", e);
                    }
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    if (bitmapRegionDecoder != null) {
                        bitmapRegionDecoder.recycle();
                    }
                    if (r0 != 0) {
                        r0.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r0 = r0;
                bitmapRegionDecoder = null;
                if (bitmapRegionDecoder != null) {
                    bitmapRegionDecoder.recycle();
                }
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            r0 = 0;
        } catch (Throwable th3) {
            th = th3;
            r0 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13854 m33209(AbstractC22967 abstractC22967, C15205 c15205, C19981 c19981, InterfaceC17066 interfaceC17066) {
        C4623.m13569(abstractC22967, c15205, C20146.f65246);
        C10104 c10104 = c15205.f46660;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("TGA decoder requires a worker");
        }
        if (abstractC22967.mo17660() == null) {
            throw new C23027("TGA regions require a prepared local file");
        }
        C22097 c22097M46068 = c19981.m46068(c10104.m25387(true));
        if (c22097M46068 == null) {
            throw new C1095("TGA index exceeds bitmap budget");
        }
        C22803 c22803 = null;
        try {
            C22803 c22803M50897 = C22803.m50897(abstractC22967.mo17660(), c10104, interfaceC17066);
            try {
                abstractC22967.m51108(c15205.f46664);
                C13854 c13854 = new C13854(abstractC22967, c15205, null, null);
                c13854.f41317 = c22803M50897;
                c13854.f41316 = c22097M46068;
                return c13854;
            } catch (Throwable th) {
                th = th;
                c22803 = c22803M50897;
                if (c22803 != null) {
                    try {
                        c22803.close();
                    } finally {
                        c22097M46068.close();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [l.᩶ۛۜ] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [l.᩹ۛۜ] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [l.᩹ۛۜ] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22262 m33211(Rect rect, int i, C19981 c19981, InterfaceC17066 interfaceC17066) throws Throwable {
        C22097 c22097M46068;
        if (Thread.currentThread() == this.f41314) {
            if (this.f41320) {
                throw new IOException("Tile decoder is closed");
            }
            if (!rect.isEmpty() && rect.left >= 0 && rect.top >= 0) {
                int i2 = rect.right;
                C15205 c15205 = this.f41315;
                int i3 = c15205.f46658;
                C11679 c11679 = c15205.f46664;
                if (i2 <= i3 && rect.bottom <= c15205.f46659 && i > 0 && ((i - 1) & i) == 0) {
                    AbstractC22967 abstractC22967 = this.f41318;
                    abstractC22967.m51108(c11679);
                    C22097 c22097M46069 = c19981.m46068(C4623.m13563(rect.width(), rect.height(), i));
                    if (c22097M46069 == null) {
                        throw new C1095("Tile reservation exceeds bitmap budget");
                    }
                    Bitmap bitmap = null;
                    try {
                        try {
                            if (this.f41317 != null) {
                                c22097M46068 = c19981.m46068(C4623.m13562(rect.width(), i) * 4);
                                if (c22097M46068 == null) {
                                    c19981 = c22097M46068;
                                    throw new C1095("TGA row exceeds bitmap budget");
                                }
                            } else {
                                c19981 = 0;
                            }
                            c19981 = c22097M46068;
                            C22803 c22803 = this.f41317;
                            Bitmap bitmapDecodeRegion = c22803 == null ? this.f41321.decodeRegion(rect, C4623.m13565(i)) : c22803.m50903(rect, i, interfaceC17066);
                            try {
                                AbstractC22967.m51107(interfaceC17066);
                                InputStream inputStream = this.f41319;
                                if (inputStream instanceof C8151) {
                                    ((C8151) inputStream).m21622();
                                }
                                abstractC22967.m51108(c11679);
                                if (bitmapDecodeRegion == null) {
                                    throw new IOException("Image region could not be decoded");
                                }
                                if (!c22097M46069.m49683(bitmapDecodeRegion.getAllocationByteCount())) {
                                    throw new C1095("Tile allocation exceeds bitmap budget");
                                }
                                C22262 c22262 = new C22262(bitmapDecodeRegion, c22097M46069, i);
                                if (c19981 != 0) {
                                    c19981.close();
                                }
                                return c22262;
                            } catch (Throwable th) {
                                bitmap = bitmapDecodeRegion;
                                th = th;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                c22097M46069.close();
                                if (c19981 != 0) {
                                    c19981.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c19981 = 0;
                    }
                }
            }
            throw new IllegalArgumentException("Invalid region or sample size");
        }
        throw new IllegalStateException("Tile decoder must stay on its opening worker thread");
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f41319;
        if (Thread.currentThread() != this.f41314) {
            throw new IllegalStateException("Tile decoder must stay on its opening worker thread");
        }
        if (this.f41320) {
            return;
        }
        this.f41320 = true;
        try {
            BitmapRegionDecoder bitmapRegionDecoder = this.f41321;
            if (bitmapRegionDecoder != null) {
                bitmapRegionDecoder.recycle();
            }
            C22803 c22803 = this.f41317;
            if (c22803 != null) {
                c22803.close();
            }
        } finally {
            C22097 c22097 = this.f41316;
            if (c22097 != null) {
                c22097.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m33210(String str) {
        return "image/x-tga".equals(str) || "image/jpeg".equals(str) || "image/png".equals(str) || "image/webp".equals(str);
    }
}
