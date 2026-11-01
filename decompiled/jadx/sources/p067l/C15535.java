package p067l;

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
public final class C15535 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final Thread f44393 = Thread.currentThread();

    /* JADX INFO: renamed from: ۙ */
    public final C16819 f44394;

    /* JADX INFO: renamed from: ۤ */
    public C23369 f44395;

    /* JADX INFO: renamed from: ۫ */
    public C24040 f44396;

    /* JADX INFO: renamed from: ۬ */
    public final AbstractC24196 f44397;

    /* JADX INFO: renamed from: ᩶ */
    public final InputStream f44398;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f44399;

    /* JADX INFO: renamed from: ᩹ */
    public final BitmapRegionDecoder f44400;

    public C15535(AbstractC24196 abstractC24196, C16819 c16819, InputStream inputStream, BitmapRegionDecoder bitmapRegionDecoder) {
        this.f44397 = abstractC24196;
        this.f44394 = c16819;
        this.f44398 = inputStream;
        this.f44400 = bitmapRegionDecoder;
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
    /* JADX INFO: renamed from: ֫ */
    public static C15535 m35327(AbstractC24196 abstractC24196, C16819 c16819) throws Throwable {
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        InputStream inputStream;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Tile decoder must be opened on a worker thread");
        }
        ?? r0 = C21515.f67888;
        C6762.m15444(abstractC24196, c16819, (C21515) r0);
        C13468 c13468 = c16819.f49789;
        if (!m35329(c16819.f49786)) {
            throw new C24253("Image format does not support region decoding");
        }
        BitmapRegionDecoder bitmapRegionDecoder = null;
        try {
            try {
                if (abstractC24196.mo19605() != null) {
                    InputStream inputStreamMo8380 = abstractC24196.mo8380();
                    if (!(inputStreamMo8380 instanceof FileInputStream)) {
                        throw new IOException("Local source requires a file stream");
                    }
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(((FileInputStream) inputStreamMo8380).getFD(), false);
                    inputStream = inputStreamMo8380;
                } else {
                    C10115 c10115M15441 = C6762.m15441(abstractC24196, (C21515) r0);
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance((InputStream) c10115M15441, false);
                    c10115M15441.m23591();
                    inputStream = c10115M15441;
                }
                abstractC24196.m53500(c13468);
                if (bitmapRegionDecoderNewInstance == null) {
                    throw new C24253("Platform rejected region decoding");
                }
                if (bitmapRegionDecoderNewInstance.getWidth() != c16819.f49783 || bitmapRegionDecoderNewInstance.getHeight() != c16819.f49784) {
                    throw new C8103("Region decoder dimensions changed");
                }
                return new C15535(abstractC24196, c16819, inputStream, bitmapRegionDecoderNewInstance);
            } catch (IOException e) {
                e = e;
                try {
                    abstractC24196.m53500(c13468);
                    if (!(e instanceof C8103) && !(e instanceof C24253)) {
                        throw new C24253("Platform could not open a region decoder", e);
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

    /* JADX INFO: renamed from: ֫ */
    public static C15535 m35328(AbstractC24196 abstractC24196, C16819 c16819, C21358 c21358, InterfaceC18588 interfaceC18588) {
        C6762.m15444(abstractC24196, c16819, C21515.f67888);
        C11971 c11971 = c16819.f49785;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("TGA decoder requires a worker");
        }
        if (abstractC24196.mo19605() == null) {
            throw new C24253("TGA regions require a prepared local file");
        }
        C23369 c23369M48382 = c21358.m48382(c11971.m27406(true));
        if (c23369M48382 == null) {
            throw new C3409("TGA index exceeds bitmap budget");
        }
        C24040 c24040 = null;
        try {
            C24040 c24040M53287 = C24040.m53287(abstractC24196.mo19605(), c11971, interfaceC18588);
            try {
                abstractC24196.m53500(c16819.f49789);
                C15535 c15535 = new C15535(abstractC24196, c16819, null, null);
                c15535.f44396 = c24040M53287;
                c15535.f44395 = c23369M48382;
                return c15535;
            } catch (Throwable th) {
                th = th;
                c24040 = c24040M53287;
                if (c24040 != null) {
                    try {
                        c24040.close();
                    } finally {
                        c23369M48382.close();
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
    /* JADX INFO: renamed from: ֫ */
    public final C23526 m35330(Rect rect, int i, C21358 c21358, InterfaceC18588 interfaceC18588) throws Throwable {
        C23369 c23369M48382;
        if (Thread.currentThread() == this.f44393) {
            if (this.f44399) {
                throw new IOException("Tile decoder is closed");
            }
            if (!rect.isEmpty() && rect.left >= 0 && rect.top >= 0) {
                int i2 = rect.right;
                C16819 c16819 = this.f44394;
                int i3 = c16819.f49783;
                C13468 c13468 = c16819.f49789;
                if (i2 <= i3 && rect.bottom <= c16819.f49784 && i > 0 && ((i - 1) & i) == 0) {
                    AbstractC24196 abstractC24196 = this.f44397;
                    abstractC24196.m53500(c13468);
                    C23369 c23369M48383 = c21358.m48382(C6762.m15438(rect.width(), rect.height(), i));
                    if (c23369M48383 == null) {
                        throw new C3409("Tile reservation exceeds bitmap budget");
                    }
                    Bitmap bitmap = null;
                    try {
                        try {
                            if (this.f44396 != null) {
                                c23369M48382 = c21358.m48382(C6762.m15437(rect.width(), i) * 4);
                                if (c23369M48382 == null) {
                                    c21358 = c23369M48382;
                                    throw new C3409("TGA row exceeds bitmap budget");
                                }
                            } else {
                                c21358 = 0;
                            }
                            c21358 = c23369M48382;
                            C24040 c24040 = this.f44396;
                            Bitmap bitmapDecodeRegion = c24040 == null ? this.f44400.decodeRegion(rect, C6762.m15440(i)) : c24040.m53293(rect, i, interfaceC18588);
                            try {
                                AbstractC24196.m53499(interfaceC18588);
                                InputStream inputStream = this.f44398;
                                if (inputStream instanceof C10115) {
                                    ((C10115) inputStream).m23591();
                                }
                                abstractC24196.m53500(c13468);
                                if (bitmapDecodeRegion == null) {
                                    throw new IOException("Image region could not be decoded");
                                }
                                if (!c23369M48383.m52021(bitmapDecodeRegion.getAllocationByteCount())) {
                                    throw new C3409("Tile allocation exceeds bitmap budget");
                                }
                                C23526 c23526 = new C23526(bitmapDecodeRegion, c23369M48383, i);
                                if (c21358 != 0) {
                                    c21358.close();
                                }
                                return c23526;
                            } catch (Throwable th) {
                                bitmap = bitmapDecodeRegion;
                                th = th;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                c23369M48383.close();
                                if (c21358 != 0) {
                                    c21358.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c21358 = 0;
                    }
                }
            }
            throw new IllegalArgumentException("Invalid region or sample size");
        }
        throw new IllegalStateException("Tile decoder must stay on its opening worker thread");
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f44398;
        if (Thread.currentThread() != this.f44393) {
            throw new IllegalStateException("Tile decoder must stay on its opening worker thread");
        }
        if (this.f44399) {
            return;
        }
        this.f44399 = true;
        try {
            BitmapRegionDecoder bitmapRegionDecoder = this.f44400;
            if (bitmapRegionDecoder != null) {
                bitmapRegionDecoder.recycle();
            }
            C24040 c24040 = this.f44396;
            if (c24040 != null) {
                c24040.close();
            }
        } finally {
            C23369 c23369 = this.f44395;
            if (c23369 != null) {
                c23369.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m35329(String str) {
        return "image/x-tga".equals(str) || "image/jpeg".equals(str) || "image/png".equals(str) || "image/webp".equals(str);
    }
}
