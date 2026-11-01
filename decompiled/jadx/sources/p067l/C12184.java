package p067l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.bouncycastle.asn1.ASN1RelativeOID;

/* JADX INFO: renamed from: l.ۤܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6M7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12184 implements InterfaceC3252 {

    /* JADX INFO: renamed from: ֡֫ */
    public static final ExecutorService f34039 = Executors.newSingleThreadExecutor(new ThreadFactoryC14865());

    /* JADX INFO: renamed from: ֫֫ */
    public final int f34040;

    /* JADX INFO: renamed from: ۖ֫ */
    public final Paint f34041;

    /* JADX INFO: renamed from: ۗ */
    public final Canvas f34042;

    /* JADX INFO: renamed from: ۘ֫ */
    public boolean f34043;

    /* JADX INFO: renamed from: ۙ */
    public boolean f34044;

    /* JADX INFO: renamed from: ۛ */
    public final Paint f34045;

    /* JADX INFO: renamed from: ۜ֫ */
    public long f34046;

    /* JADX INFO: renamed from: ۟ */
    public int f34047;

    /* JADX INFO: renamed from: ۡ֫ */
    public final long f34048;

    /* JADX INFO: renamed from: ۢ֫ */
    public Bitmap f34049;

    /* JADX INFO: renamed from: ۤ */
    public final Bitmap f34050;

    /* JADX INFO: renamed from: ۧ֫ */
    public byte[] f34051;

    /* JADX INFO: renamed from: ۨ */
    public boolean f34052;

    /* JADX INFO: renamed from: ۫ */
    public int f34053;

    /* JADX INFO: renamed from: ۬ */
    public volatile boolean f34054;

    /* JADX INFO: renamed from: ܰ */
    public int f34055;

    /* JADX INFO: renamed from: ܳ֫ */
    public final C23369 f34056;

    /* JADX INFO: renamed from: ܺ֫ */
    public long f34057;

    /* JADX INFO: renamed from: ܽ֫ */
    public final C18161 f34058;

    /* JADX INFO: renamed from: ܿ֫ */
    public Runnable f34059;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final C22699 f34060;

    /* JADX INFO: renamed from: ᩴ֫ */
    public final RunnableC6819 f34061;

    /* JADX INFO: renamed from: ᩵֫ */
    public final int f34062;

    /* JADX INFO: renamed from: ᩶ */
    public final Paint f34063 = new Paint(2);

    /* JADX INFO: renamed from: ᩷֫ */
    public final int f34064;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f34065;

    /* JADX INFO: renamed from: ᩹ */
    public final RectF f34066;

    /* JADX INFO: renamed from: ᩺ */
    public Bitmap f34067;

    /* JADX INFO: renamed from: ᩻֫ */
    public final Handler f34068;

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ۙܰۜ] */
    public C12184(C22699 c22699, C18161 c18161, C23369 c23369, byte[] bArr, Bitmap bitmap, int i, long j) {
        Paint paint = new Paint(2);
        this.f34041 = paint;
        Paint paint2 = new Paint();
        this.f34045 = paint2;
        this.f34066 = new RectF();
        this.f34068 = new Handler(Looper.getMainLooper());
        this.f34061 = new Runnable() { // from class: l.ۙܰۜ
            @Override // java.lang.Runnable
            public final void run() {
                C12184.m28137(this.f17703);
            }
        };
        this.f34048 = j;
        this.f34060 = c22699;
        this.f34058 = c18161;
        this.f34056 = c23369;
        this.f34051 = bArr;
        this.f34050 = bitmap;
        this.f34064 = i;
        this.f34062 = c18161.f54229;
        this.f34040 = c18161.f54234;
        this.f34042 = new Canvas(bitmap);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        paint2.setColor(c18161.f54227);
        this.f34057 = Math.max(20, ((C12798) c18161.f54235.get(0)).f36014);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v28, types: [l.᩸ۛۜ] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.᩸ۛۜ] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX INFO: renamed from: ֫ */
    public static C12184 m28128(AbstractC24196 abstractC24196, C13468 c13468, C21358 c21358, long j, C11102 c11102) throws Throwable {
        ?? r13;
        Bitmap bitmapCreateBitmap;
        C12184 c12184;
        ?? r1;
        Bitmap bitmap;
        ?? M52021;
        C23369 c23369M48382 = c21358.m48382(65536L);
        if (c23369M48382 == null) {
            throw new C3409("WebP scan exceeds budget");
        }
        try {
            C22699 c22699 = new C22699(abstractC24196);
            try {
                C18161 c18161M28129 = m28129(c22699, j, c23369M48382, c11102);
                ArrayList arrayList = c18161M28129.f54235;
                long size = (c18161M28129.f54236 * 4) + (((long) c18161M28129.f54232) * 2) + (((long) arrayList.size()) * 128) + 65536 + ((long) c18161M28129.f54228) + 30;
                long size2 = (((long) c18161M28129.f54231) * 4) + (((long) arrayList.size()) * 128) + 65536 + ((long) c18161M28129.f54232);
                try {
                    long j2 = C16662.m37738(Math.max(size, size2), c18161M28129.f54229, c18161M28129.f54234, 4, j).f27575;
                    C9958 c9958M37738 = C16662.m37738(Math.max(size, size2), c18161M28129.f54229, c18161M28129.f54234, 4, Math.min(j, (c21358.m48381() - c21358.m48384()) + c23369M48382.m52020()));
                    int i = c9958M37738.f27576;
                    M52021 = c23369M48382.m52021(c9958M37738.f27575);
                    try {
                        if (M52021 == 0) {
                            throw new C3409("WebP allocation exceeds budget");
                        }
                        int i2 = c18161M28129.f54232;
                        byte[] bArr = new byte[i2];
                        r1 = c22699;
                        try {
                            r1.m50809(c18161M28129.f54237, bArr, 0, i2, c11102);
                            int iM28126 = m28126((C22699) r1, c18161M28129, c11102);
                            bitmapCreateBitmap = Bitmap.createBitmap((int) C6762.m15437(c18161M28129.f54229, i), (int) C6762.m15437(c18161M28129.f54234, i), Bitmap.Config.ARGB_8888);
                            try {
                                if ((((long) bitmapCreateBitmap.getAllocationByteCount()) * 4) + Math.max(size, size2) > c23369M48382.m52020()) {
                                    throw new C3409("WebP canvas allocation exceeds reservation");
                                }
                                c12184 = new C12184(r1, c18161M28129, c23369M48382, bArr, bitmapCreateBitmap, iM28126, j2);
                                try {
                                    c12184.f34067 = c12184.m28127(0, c11102);
                                    abstractC24196.m53500(c13468);
                                    AbstractC24196.m53499(c11102);
                                    return c12184;
                                } catch (IOException e) {
                                    e = e;
                                } catch (Error e2) {
                                    e = e2;
                                } catch (RuntimeException e3) {
                                    e = e3;
                                }
                            } catch (IOException | Error | RuntimeException e4) {
                                e = e4;
                                c12184 = null;
                            }
                        } catch (IOException e5) {
                            e = e5;
                            M52021 = c22699;
                            r13 = M52021;
                            bitmapCreateBitmap = null;
                            ?? r27 = r13;
                            c12184 = null;
                            r1 = r27;
                        } catch (Error e6) {
                            e = e6;
                            M52021 = c22699;
                            r13 = M52021;
                            bitmapCreateBitmap = null;
                            ?? r28 = r13;
                            c12184 = null;
                            r1 = r28;
                        } catch (RuntimeException e7) {
                            e = e7;
                            M52021 = c22699;
                            r13 = M52021;
                            bitmapCreateBitmap = null;
                            ?? r29 = r13;
                            c12184 = null;
                            r1 = r29;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        r13 = M52021;
                        bitmapCreateBitmap = null;
                        ?? r210 = r13;
                        c12184 = null;
                        r1 = r210;
                    } catch (Error e9) {
                        e = e9;
                        r13 = M52021;
                        bitmapCreateBitmap = null;
                        ?? r211 = r13;
                        c12184 = null;
                        r1 = r211;
                    } catch (RuntimeException e10) {
                        e = e10;
                        r13 = M52021;
                        bitmapCreateBitmap = null;
                        ?? r212 = r13;
                        c12184 = null;
                        r1 = r212;
                    }
                } catch (IOException e11) {
                    e = e11;
                } catch (Error e12) {
                    e = e12;
                } catch (RuntimeException e13) {
                    e = e13;
                }
                M52021 = c22699;
            } catch (IOException | Error | RuntimeException e14) {
                e = e14;
                M52021 = c22699;
            }
            r13 = M52021;
        } catch (IOException | Error | RuntimeException e15) {
            e = e15;
            r13 = 0;
        }
        bitmapCreateBitmap = null;
        ?? r213 = r13;
        c12184 = null;
        r1 = r213;
        if (c12184 != null && (bitmap = c12184.f34067) != null) {
            bitmap.recycle();
        }
        if (bitmapCreateBitmap != null) {
            bitmapCreateBitmap.recycle();
        }
        if (r1 != 0) {
            try {
                r1.close();
            } catch (IOException unused) {
            }
        }
        c23369M48382.close();
        throw e;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m28126(C22699 c22699, C18161 c18161, C11102 c11102) {
        int i = c18161.f54231;
        if (i != 0) {
            int i2 = i + 6;
            byte[] bArr = new byte[i2];
            c22699.m50809(c18161.f54233, bArr, 6, i, c11102);
            int i3 = 6;
            boolean zM44338 = C19503.m44338("Exif\u0000\u0000", 6, bArr);
            C19503.m44340("Exif\u0000\u0000", 0, bArr);
            try {
                if (!zM44338) {
                    i3 = 0;
                }
                if (zM44338) {
                    i2 = c18161.f54231;
                }
                int iM22363 = new C9596(new ByteArrayInputStream(bArr, i3, i2), 1).m22363();
                if (iM22363 >= 1 && iM22363 <= 8) {
                    return iM22363;
                }
            } catch (IOException unused) {
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ֫ */
    private Bitmap m28127(int i, InterfaceC18588 interfaceC18588) throws IOException {
        RectF rectF = this.f34066;
        C18161 c18161 = this.f34058;
        C12798 c12798 = (C12798) c18161.f54235.get(i);
        int length = this.f34051.length + 30 + c12798.f36018;
        byte[] bArr = new byte[length];
        C19503.m44340("RIFF", 0, bArr);
        int i2 = length - 8;
        C19503.m44335(4, i2, bArr);
        bArr[7] = (byte) (i2 >>> 24);
        C19503.m44340("WEBP", 8, bArr);
        C19503.m44340("VP8X", 12, bArr);
        C19503.m44335(16, 10, bArr);
        bArr[19] = (byte) 0;
        bArr[20] = (byte) ((this.f34051.length == 0 ? 0 : 32) | 16);
        C19503.m44335(24, c12798.f36020 - 1, bArr);
        C19503.m44335(27, c12798.f36016 - 1, bArr);
        byte[] bArr2 = this.f34051;
        System.arraycopy(bArr2, 0, bArr, 30, bArr2.length);
        this.f34060.m50809(c12798.f36017, bArr, this.f34051.length + 30, c12798.f36018, interfaceC18588);
        AbstractC24196.m53499(interfaceC18588);
        double d = c12798.f36020;
        Bitmap bitmap = this.f34050;
        double width = d * ((double) bitmap.getWidth());
        int i3 = this.f34062;
        final int iMax = Math.max(1, (int) Math.ceil(width / ((double) i3)));
        double height = ((double) c12798.f36016) * ((double) bitmap.getHeight());
        int i4 = this.f34040;
        final int iMax2 = Math.max(1, (int) Math.ceil(height / ((double) i4)));
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(ByteBuffer.wrap(bArr)), new ImageDecoder.OnHeaderDecodedListener() { // from class: l.ۗܰۜ
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                C12184.m28130(iMax, iMax2, imageDecoder);
            }
        });
        try {
            AbstractC24196.m53499(interfaceC18588);
            if (bitmapDecodeBitmap.getAllocationByteCount() > bitmap.getAllocationByteCount()) {
                throw new IOException("WebP subframe allocation exceeds reservation");
            }
            Canvas canvas = this.f34042;
            if (i == 0) {
                canvas.drawColor(c18161.f54227, PorterDuff.Mode.SRC);
            }
            float f = i3;
            float f2 = i4;
            rectF.set((c12798.f36013 * bitmap.getWidth()) / f, (c12798.f36019 * bitmap.getHeight()) / f2, ((c12798.f36013 + c12798.f36020) * bitmap.getWidth()) / f, ((c12798.f36019 + c12798.f36016) * bitmap.getHeight()) / f2);
            canvas.drawBitmap(bitmapDecodeBitmap, (Rect) null, rectF, c12798.f36015 ? this.f34041 : this.f34063);
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            if (bitmapCopy == null) {
                throw new IOException("WebP frame could not be copied");
            }
            if (c12798.f36012) {
                canvas.drawRect(rectF, this.f34045);
            }
            bitmapDecodeBitmap.recycle();
            return bitmapCopy;
        } catch (Throwable th) {
            bitmapDecodeBitmap.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m28130(int i, int i2, ImageDecoder imageDecoder) {
        imageDecoder.setAllocator(1);
        imageDecoder.setTargetSize(i, i2);
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
    }

    @Override // p067l.InterfaceC3252
    /* JADX INFO: renamed from: ܽ */
    public final long mo5665() {
        long jM52020 = this.f34056.m52020();
        long j = this.f34048;
        if (j > jM52020) {
            return j;
        }
        return 0L;
    }

    @Override // p067l.InterfaceC3252
    /* JADX INFO: renamed from: ֫ */
    public final long mo5661() {
        return this.f34056.m52020();
    }

    @Override // p067l.InterfaceC3252
    /* JADX INFO: renamed from: ֫ */
    public final void mo5662(Canvas canvas, RectF rectF, Paint paint) {
        if (this.f34054) {
            return;
        }
        canvas.drawBitmap(this.f34067, (Rect) null, rectF, paint);
    }

    @Override // p067l.InterfaceC3252
    /* JADX INFO: renamed from: ֫ */
    public final void mo5664(boolean z, RunnableC10431 runnableC10431) {
        if (this.f34054) {
            return;
        }
        if (!z) {
            runnableC10431 = null;
        }
        this.f34059 = runnableC10431;
        boolean z2 = z & (this.f34058.f54235.size() > 1);
        if (z2 == this.f34043) {
            return;
        }
        this.f34043 = z2;
        this.f34065 = z2;
        this.f34047++;
        this.f34068.removeCallbacks(this.f34061);
        if (z2) {
            if (this.f34052) {
                this.f34053 = 0;
                this.f34057 = 1L;
            }
            long jMax = Math.max(1L, this.f34057) + SystemClock.uptimeMillis();
            this.f34046 = jMax;
            this.f34068.postAtTime(this.f34061, jMax);
            return;
        }
        this.f34057 = Math.max(1L, this.f34046 - SystemClock.uptimeMillis());
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m28137(final C12184 c12184) {
        int i;
        if (c12184.f34054 || !c12184.f34065 || c12184.f34044) {
            return;
        }
        if (!c12184.f34052 && c12184.f34055 == c12184.f34058.f54235.size() - 1 && (i = c12184.f34058.f54230) > 0 && c12184.f34053 + 1 >= i) {
            c12184.f34065 = false;
            c12184.f34052 = true;
            return;
        }
        final int size = c12184.f34052 ? 0 : (c12184.f34055 + 1) % c12184.f34058.f54235.size();
        final int i2 = c12184.f34047;
        Bitmap bitmap = c12184.f34049;
        if (bitmap != null) {
            c12184.f34049 = null;
            c12184.m28131(bitmap, size, i2);
        } else {
            c12184.f34044 = true;
            f34039.execute(new Runnable() { // from class: l.۫ܰۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C12184.m28132(this.f40456, size, i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m28132(final C12184 c12184, final int i, final int i2) {
        final Bitmap bitmapM28127 = null;
        try {
            if (!c12184.f34054) {
                bitmapM28127 = c12184.m28127(i, new InterfaceC18588() { // from class: l.ܶܰۜ
                    @Override // p067l.InterfaceC18588
                    /* JADX INFO: renamed from: ᩻ */
                    public final boolean mo3924() {
                        return this.f49971.f34054;
                    }
                });
            }
        } catch (IOException | OutOfMemoryError | RuntimeException unused) {
        }
        c12184.f34068.post(new Runnable() { // from class: l.᩸ܰۜ
            @Override // java.lang.Runnable
            public final void run() {
                this.f72100.m28131(bitmapM28127, i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m28131(Bitmap bitmap, int i, int i2) {
        this.f34044 = false;
        if (this.f34054) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        boolean z = this.f34065;
        if (!z || this.f34047 != i2) {
            this.f34049 = bitmap;
            if (z) {
                this.f34068.post(this.f34061);
                return;
            }
            return;
        }
        if (bitmap == null) {
            this.f34065 = false;
            return;
        }
        Bitmap bitmap2 = this.f34067;
        this.f34067 = bitmap;
        this.f34055 = i;
        bitmap2.recycle();
        if (i == 0 && !this.f34052) {
            this.f34053++;
        }
        this.f34052 = false;
        this.f34057 = Math.max(20, ((C12798) this.f34058.f54235.get(i)).f36014);
        this.f34046 = Math.max(SystemClock.uptimeMillis(), this.f34046 + this.f34057);
        Runnable runnable = this.f34059;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f34065 || this.f34054) {
            return;
        }
        this.f34068.postAtTime(this.f34061, this.f34046);
    }

    @Override // p067l.InterfaceC3252
    /* JADX INFO: renamed from: ֫ */
    public final void mo5663(C23369 c23369) {
        synchronized (this) {
            if (this.f34054) {
                return;
            }
            this.f34054 = true;
            RunnableC21572 runnableC21572 = new RunnableC21572(0, this, c23369);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnableC21572.run();
            } else {
                this.f34068.post(runnableC21572);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m28138(C12184 c12184, C23369 c23369) {
        c12184.f34043 = false;
        c12184.f34065 = false;
        c12184.f34059 = null;
        c12184.f34068.removeCallbacks(c12184.f34061);
        c12184.f34067.recycle();
        Bitmap bitmap = c12184.f34049;
        if (bitmap != null) {
            bitmap.recycle();
            c12184.f34049 = null;
        }
        f34039.execute(new RunnableC11457(c12184, c23369, 1));
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m28139(final C12184 c12184, final C23369 c23369) {
        c12184.f34050.recycle();
        c12184.f34051 = null;
        c12184.f34058.f54235.clear();
        try {
            c12184.f34060.close();
        } catch (IOException unused) {
        }
        c12184.f34068.post(new Runnable() { // from class: l.᩹ܰۜ
            @Override // java.lang.Runnable
            public final void run() {
                C12184.m28134(this.f75070, c23369);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m28134(C12184 c12184, C23369 c23369) {
        c12184.f34056.close();
        if (c23369 != null) {
            c23369.close();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18161 m28129(C22699 c22699, long j, C23369 c23369, C11102 c11102) throws IOException {
        C18161 c18161;
        int i;
        long j2;
        int iM44329;
        int iM443210;
        long j3 = j;
        byte[] bArr = new byte[30];
        c22699.m50809(0L, bArr, 0, 30, c11102);
        int i2 = 0;
        if (!C19503.m44338("RIFF", 0, bArr) || !C19503.m44338("WEBP", 8, bArr) || !C19503.m44338("VP8X", 12, bArr) || C19503.m44341(16, bArr) != 10 || (bArr[20] & 2) == 0) {
            throw new IOException("Invalid animated WebP header");
        }
        int i3 = 4;
        long j4 = 8;
        long jM44341 = C19503.m44341(4, bArr) + 8;
        if (jM44341 > 268435456) {
            throw new IOException("WebP input exceeds byte limit");
        }
        C18161 c18162 = new C18161(C19503.m44339(24, bArr) + 1, C19503.m44339(27, bArr) + 1);
        C21515 c21515 = C21515.f67888;
        int i4 = c18162.f54229;
        int i5 = c18162.f54234;
        c21515.m48719(i4, i5);
        long j5 = 30;
        boolean z = false;
        while (true) {
            ArrayList arrayList = c18162.f54235;
            if (j5 >= jM44341) {
                C18161 c18163 = c18162;
                if (!z || arrayList.isEmpty()) {
                    throw new IOException("WebP contains no animation frames");
                }
                return c18163;
            }
            if (jM44341 - j5 < j4) {
                throw new IOException("Truncated WebP chunk");
            }
            int i6 = i5;
            int i7 = i4;
            C18161 c18164 = c18162;
            byte[] bArr2 = bArr;
            c22699.m50809(j5, bArr, 0, 8, c11102);
            long jM44342 = C19503.m44341(i3, bArr2);
            long j6 = j5 + 8;
            long j7 = j6 + jM44342;
            long j8 = j7 + (jM44342 & 1);
            if (j8 > jM44341) {
                throw new IOException("Truncated WebP chunk data");
            }
            if (C19503.m44338("ANIM", i2, bArr2)) {
                if (jM44342 != 6 || z || !arrayList.isEmpty()) {
                    throw new IOException("Invalid WebP animation header");
                }
                c22699.m50809(j6, bArr2, 0, 6, c11102);
                c18161 = c18164;
                c18161.f54227 = (int) C19503.m44341(i2, bArr2);
                c18161.f54230 = C19503.m44329(i3, bArr2);
                z = true;
            } else {
                c18161 = c18164;
                if (C19503.m44338("ICCP", i2, bArr2)) {
                    if (c18161.f54232 != 0) {
                        throw new IOException("Duplicate WebP color profile");
                    }
                    c18161.f54237 = (int) j5;
                    c18161.f54232 = (int) (j8 - j5);
                } else if (C19503.m44338("EXIF", i2, bArr2)) {
                    c18161.f54233 = (int) j6;
                    c18161.f54231 = (int) jM44342;
                } else {
                    if (C19503.m44338("ANMF", i2, bArr2)) {
                        if (!z || jM44342 < 24) {
                            throw new IOException("Invalid WebP animation frame");
                        }
                        m28135(c18161, j3, c23369);
                        c22699.m50809(j6, bArr2, 0, 16, c11102);
                        C12798 c12798 = new C12798();
                        c12798.f36013 = C19503.m44339(i2, bArr2) * 2;
                        c12798.f36019 = C19503.m44339(3, bArr2) * 2;
                        c12798.f36020 = C19503.m44339(6, bArr2) + 1;
                        c12798.f36016 = C19503.m44339(9, bArr2) + 1;
                        c12798.f36014 = C19503.m44339(12, bArr2);
                        byte b = bArr2[15];
                        c12798.f36015 = (b & 2) != 0;
                        c12798.f36012 = (b & 1) != 0;
                        int i8 = ((int) j6) + 16;
                        c12798.f36017 = i8;
                        c12798.f36018 = ((int) jM44342) - 16;
                        int i9 = i7;
                        if (((long) c12798.f36013) + ((long) c12798.f36020) <= i9) {
                            int i10 = i6;
                            if (((long) c12798.f36019) + ((long) c12798.f36016) <= i10) {
                                long j9 = i8;
                                boolean z2 = false;
                                while (j9 < j7) {
                                    if (j7 - j9 < 8) {
                                        throw new IOException("Truncated WebP frame chunk");
                                    }
                                    int i11 = i10;
                                    int i12 = i9;
                                    c22699.m50809(j9, bArr2, 0, 8, c11102);
                                    long jM44343 = C19503.m44341(4, bArr2);
                                    long j10 = j9 + 8;
                                    long j11 = j10 + jM44343 + (jM44343 & 1);
                                    if (j11 > j7) {
                                        throw new IOException("Truncated WebP frame payload");
                                    }
                                    if (C19503.m44338("VP8 ", i2, bArr2) || C19503.m44338("VP8L", i2, bArr2)) {
                                        if (z2) {
                                            throw new IOException("Duplicate WebP frame image");
                                        }
                                        c22699.m50809(j10, bArr2, 8, (int) Math.min(10L, jM44343), c11102);
                                        int i13 = (int) jM44343;
                                        int i14 = c12798.f36020;
                                        int i15 = c12798.f36016;
                                        if (C19503.m44338("VP8L", 0, bArr2)) {
                                            if (i13 < 5 || bArr2[8] != 47) {
                                                throw new IOException("Invalid lossless WebP frame header");
                                            }
                                            long jM44344 = C19503.m44341(9, bArr2);
                                            iM44329 = ((int) (jM44344 & 16383)) + 1;
                                            iM443210 = ((int) ((jM44344 >> 14) & 16383)) + 1;
                                        } else {
                                            if (i13 < 10 || (bArr2[8] & 1) != 0 || (bArr2[11] & 255) != 157 || bArr2[12] != 1 || bArr2[13] != 42) {
                                                throw new IOException("Invalid lossy WebP frame header");
                                            }
                                            iM44329 = C19503.m44329(14, bArr2) & ASN1RelativeOID.MAX_IDENTIFIER_LENGTH;
                                            iM443210 = C19503.m44329(16, bArr2) & ASN1RelativeOID.MAX_IDENTIFIER_LENGTH;
                                        }
                                        if (iM44329 != i14 || iM443210 != i15) {
                                            throw new IOException("WebP frame dimensions disagree with container");
                                        }
                                        z2 = true;
                                    } else if (!C19503.m44338("ALPH", i2, bArr2)) {
                                        throw new IOException("Unsupported WebP frame chunk");
                                    }
                                    i2 = 0;
                                    i9 = i12;
                                    i10 = i11;
                                    j9 = j11;
                                }
                                i = i10;
                                i7 = i9;
                                j2 = 8;
                                if (!z2) {
                                    throw new IOException("Missing WebP frame image");
                                }
                                arrayList.add(c12798);
                                c18161.f54236 = Math.max(c18161.f54236, ((long) c12798.f36020) * ((long) c12798.f36016));
                                c18161.f54228 = Math.max(c18161.f54228, c12798.f36018);
                            }
                        }
                        throw new IOException("WebP frame exceeds canvas");
                    }
                    j3 = j;
                    m28135(c18161, j3, c23369);
                    c22699.m50809(j8 - 1, bArr2, 0, 1, c11102);
                    i2 = 0;
                    i3 = 4;
                    bArr = bArr2;
                    c18162 = c18161;
                    j4 = j2;
                    i4 = i7;
                    i5 = i;
                    j5 = j8;
                    jM44341 = jM44341;
                }
            }
            i = i6;
            j2 = 8;
            j3 = j;
            m28135(c18161, j3, c23369);
            c22699.m50809(j8 - 1, bArr2, 0, 1, c11102);
            i2 = 0;
            i3 = 4;
            bArr = bArr2;
            c18162 = c18161;
            j4 = j2;
            i4 = i7;
            i5 = i;
            j5 = j8;
            jM44341 = jM44341;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28135(C18161 c18161, long j, C23369 c23369) throws C3409 {
        long size = (((long) (c18161.f54235.size() + 1)) * 128) + 65536;
        if ((((long) c18161.f54231) * 4) + (((long) c18161.f54232) * 2) + size > j || !c23369.m52021(size)) {
            throw new C3409("WebP index exceeds allocation limit");
        }
    }
}
