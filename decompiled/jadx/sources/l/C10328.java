package l;

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
public final class C10328 implements InterfaceC0930 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f31076 = Executors.newSingleThreadExecutor(new ThreadFactoryC13149());

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final int f31077;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final Paint f31078;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Canvas f31079;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f31080;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31081;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Paint f31082;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public long f31083;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f31084;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final long f31085;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public Bitmap f31086;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Bitmap f31087;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public byte[] f31088;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f31089;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f31090;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile boolean f31091;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f31092;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C22097 f31093;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public long f31094;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final C16617 f31095;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public Runnable f31096;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C21392 f31097;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final RunnableC4683 f31098;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final int f31099;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Paint f31100 = new Paint(2);

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final int f31101;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f31102;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final RectF f31103;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Bitmap f31104;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final Handler f31105;

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ۙܰۜ] */
    public C10328(C21392 c21392, C16617 c16617, C22097 c22097, byte[] bArr, Bitmap bitmap, int i, long j) {
        Paint paint = new Paint(2);
        this.f31078 = paint;
        Paint paint2 = new Paint();
        this.f31082 = paint2;
        this.f31103 = new RectF();
        this.f31105 = new Handler(Looper.getMainLooper());
        this.f31098 = new Runnable() { // from class: l.ۙܰۜ
            @Override // java.lang.Runnable
            public final void run() {
                C10328.m26112(this.f14874);
            }
        };
        this.f31085 = j;
        this.f31097 = c21392;
        this.f31095 = c16617;
        this.f31093 = c22097;
        this.f31088 = bArr;
        this.f31087 = bitmap;
        this.f31101 = i;
        this.f31099 = c16617.f51052;
        this.f31077 = c16617.f51057;
        this.f31079 = new Canvas(bitmap);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        paint2.setColor(c16617.f51050);
        this.f31094 = Math.max(20, ((C10974) c16617.f51058.get(0)).f33021);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10328 m26103(AbstractC22967 abstractC22967, C11679 c11679, C19981 c19981, long j, C9189 c9189) throws Throwable {
        ?? r13;
        Bitmap bitmapCreateBitmap;
        C10328 c10328;
        ?? r1;
        Bitmap bitmap;
        ?? M49683;
        C22097 c22097M46068 = c19981.m46068(65536L);
        if (c22097M46068 == null) {
            throw new C1095("WebP scan exceeds budget");
        }
        try {
            C21392 c21392 = new C21392(abstractC22967);
            try {
                C16617 c16617M26104 = m26104(c21392, j, c22097M46068, c9189);
                ArrayList arrayList = c16617M26104.f51058;
                long size = (c16617M26104.f51059 * 4) + (((long) c16617M26104.f51055) * 2) + (((long) arrayList.size()) * 128) + 65536 + ((long) c16617M26104.f51051) + 30;
                long size2 = (((long) c16617M26104.f51054) * 4) + (((long) arrayList.size()) * 128) + 65536 + ((long) c16617M26104.f51055);
                try {
                    long j2 = C15040.m35581(Math.max(size, size2), c16617M26104.f51052, c16617M26104.f51057, 4, j).f24662;
                    C7986 c7986M35581 = C15040.m35581(Math.max(size, size2), c16617M26104.f51052, c16617M26104.f51057, 4, Math.min(j, (c19981.m46067() - c19981.m46070()) + c22097M46068.m49682()));
                    int i = c7986M35581.f24663;
                    M49683 = c22097M46068.m49683(c7986M35581.f24662);
                    try {
                        if (M49683 == 0) {
                            throw new C1095("WebP allocation exceeds budget");
                        }
                        int i2 = c16617M26104.f51055;
                        byte[] bArr = new byte[i2];
                        r1 = c21392;
                        try {
                            r1.m48473(c16617M26104.f51060, bArr, 0, i2, c9189);
                            int iM26101 = m26101((C21392) r1, c16617M26104, c9189);
                            bitmapCreateBitmap = Bitmap.createBitmap((int) C4623.m13562(c16617M26104.f51052, i), (int) C4623.m13562(c16617M26104.f51057, i), Bitmap.Config.ARGB_8888);
                            try {
                                if ((((long) bitmapCreateBitmap.getAllocationByteCount()) * 4) + Math.max(size, size2) > c22097M46068.m49682()) {
                                    throw new C1095("WebP canvas allocation exceeds reservation");
                                }
                                c10328 = new C10328(r1, c16617M26104, c22097M46068, bArr, bitmapCreateBitmap, iM26101, j2);
                                try {
                                    c10328.f31104 = c10328.m26102(0, c9189);
                                    abstractC22967.m51108(c11679);
                                    AbstractC22967.m51107(c9189);
                                    return c10328;
                                } catch (IOException e) {
                                    e = e;
                                } catch (Error e2) {
                                    e = e2;
                                } catch (RuntimeException e3) {
                                    e = e3;
                                }
                            } catch (IOException | Error | RuntimeException e4) {
                                e = e4;
                                c10328 = null;
                            }
                        } catch (IOException e5) {
                            e = e5;
                            M49683 = c21392;
                            r13 = M49683;
                            bitmapCreateBitmap = null;
                            ?? r27 = r13;
                            c10328 = null;
                            r1 = r27;
                        } catch (Error e6) {
                            e = e6;
                            M49683 = c21392;
                            r13 = M49683;
                            bitmapCreateBitmap = null;
                            ?? r28 = r13;
                            c10328 = null;
                            r1 = r28;
                        } catch (RuntimeException e7) {
                            e = e7;
                            M49683 = c21392;
                            r13 = M49683;
                            bitmapCreateBitmap = null;
                            ?? r29 = r13;
                            c10328 = null;
                            r1 = r29;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        r13 = M49683;
                        bitmapCreateBitmap = null;
                        ?? r210 = r13;
                        c10328 = null;
                        r1 = r210;
                    } catch (Error e9) {
                        e = e9;
                        r13 = M49683;
                        bitmapCreateBitmap = null;
                        ?? r211 = r13;
                        c10328 = null;
                        r1 = r211;
                    } catch (RuntimeException e10) {
                        e = e10;
                        r13 = M49683;
                        bitmapCreateBitmap = null;
                        ?? r212 = r13;
                        c10328 = null;
                        r1 = r212;
                    }
                } catch (IOException e11) {
                    e = e11;
                } catch (Error e12) {
                    e = e12;
                } catch (RuntimeException e13) {
                    e = e13;
                }
                M49683 = c21392;
            } catch (IOException | Error | RuntimeException e14) {
                e = e14;
                M49683 = c21392;
            }
            r13 = M49683;
        } catch (IOException | Error | RuntimeException e15) {
            e = e15;
            r13 = 0;
        }
        bitmapCreateBitmap = null;
        ?? r213 = r13;
        c10328 = null;
        r1 = r213;
        if (c10328 != null && (bitmap = c10328.f31104) != null) {
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
        c22097M46068.close();
        throw e;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m26101(C21392 c21392, C16617 c16617, C9189 c9189) {
        int i = c16617.f51054;
        if (i != 0) {
            int i2 = i + 6;
            byte[] bArr = new byte[i2];
            c21392.m48473(c16617.f51056, bArr, 6, i, c9189);
            int i3 = 6;
            boolean zM42087 = C18029.m42087("Exif\u0000\u0000", 6, bArr);
            C18029.m42089("Exif\u0000\u0000", 0, bArr);
            try {
                if (!zM42087) {
                    i3 = 0;
                }
                if (zM42087) {
                    i2 = c16617.f51054;
                }
                int iM20384 = new C7605(new ByteArrayInputStream(bArr, i3, i2), 1).m20384();
                if (iM20384 >= 1 && iM20384 <= 8) {
                    return iM20384;
                }
            } catch (IOException unused) {
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Bitmap m26102(int i, InterfaceC17066 interfaceC17066) throws IOException {
        RectF rectF = this.f31103;
        C16617 c16617 = this.f31095;
        C10974 c10974 = (C10974) c16617.f51058.get(i);
        int length = this.f31088.length + 30 + c10974.f33025;
        byte[] bArr = new byte[length];
        C18029.m42089("RIFF", 0, bArr);
        int i2 = length - 8;
        C18029.m42084(4, i2, bArr);
        bArr[7] = (byte) (i2 >>> 24);
        C18029.m42089("WEBP", 8, bArr);
        C18029.m42089("VP8X", 12, bArr);
        C18029.m42084(16, 10, bArr);
        bArr[19] = (byte) 0;
        bArr[20] = (byte) ((this.f31088.length == 0 ? 0 : 32) | 16);
        C18029.m42084(24, c10974.f33027 - 1, bArr);
        C18029.m42084(27, c10974.f33023 - 1, bArr);
        byte[] bArr2 = this.f31088;
        System.arraycopy(bArr2, 0, bArr, 30, bArr2.length);
        this.f31097.m48473(c10974.f33024, bArr, this.f31088.length + 30, c10974.f33025, interfaceC17066);
        AbstractC22967.m51107(interfaceC17066);
        double d = c10974.f33027;
        Bitmap bitmap = this.f31087;
        double width = d * ((double) bitmap.getWidth());
        int i3 = this.f31099;
        final int iMax = Math.max(1, (int) Math.ceil(width / ((double) i3)));
        double height = ((double) c10974.f33023) * ((double) bitmap.getHeight());
        int i4 = this.f31077;
        final int iMax2 = Math.max(1, (int) Math.ceil(height / ((double) i4)));
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(ByteBuffer.wrap(bArr)), new ImageDecoder.OnHeaderDecodedListener() { // from class: l.ۗܰۜ
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                C10328.m26105(iMax, iMax2, imageDecoder);
            }
        });
        try {
            AbstractC22967.m51107(interfaceC17066);
            if (bitmapDecodeBitmap.getAllocationByteCount() > bitmap.getAllocationByteCount()) {
                throw new IOException("WebP subframe allocation exceeds reservation");
            }
            Canvas canvas = this.f31079;
            if (i == 0) {
                canvas.drawColor(c16617.f51050, PorterDuff.Mode.SRC);
            }
            float f = i3;
            float f2 = i4;
            rectF.set((c10974.f33020 * bitmap.getWidth()) / f, (c10974.f33026 * bitmap.getHeight()) / f2, ((c10974.f33020 + c10974.f33027) * bitmap.getWidth()) / f, ((c10974.f33026 + c10974.f33023) * bitmap.getHeight()) / f2);
            canvas.drawBitmap(bitmapDecodeBitmap, (Rect) null, rectF, c10974.f33022 ? this.f31078 : this.f31100);
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            if (bitmapCopy == null) {
                throw new IOException("WebP frame could not be copied");
            }
            if (c10974.f33019) {
                canvas.drawRect(rectF, this.f31082);
            }
            bitmapDecodeBitmap.recycle();
            return bitmapCopy;
        } catch (Throwable th) {
            bitmapDecodeBitmap.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26105(int i, int i2, ImageDecoder imageDecoder) {
        imageDecoder.setAllocator(1);
        imageDecoder.setTargetSize(i, i2);
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
    }

    @Override // l.InterfaceC0930
    /* JADX INFO: renamed from: ܽ */
    public final long mo3346() {
        long jM49682 = this.f31093.m49682();
        long j = this.f31085;
        if (j > jM49682) {
            return j;
        }
        return 0L;
    }

    @Override // l.InterfaceC0930
    /* JADX INFO: renamed from: ֫ */
    public final long mo3342() {
        return this.f31093.m49682();
    }

    @Override // l.InterfaceC0930
    /* JADX INFO: renamed from: ֫ */
    public final void mo3343(Canvas canvas, RectF rectF, Paint paint) {
        if (this.f31091) {
            return;
        }
        canvas.drawBitmap(this.f31104, (Rect) null, rectF, paint);
    }

    @Override // l.InterfaceC0930
    /* JADX INFO: renamed from: ֫ */
    public final void mo3345(boolean z, RunnableC8483 runnableC8483) {
        if (this.f31091) {
            return;
        }
        if (!z) {
            runnableC8483 = null;
        }
        this.f31096 = runnableC8483;
        boolean z2 = z & (this.f31095.f51058.size() > 1);
        if (z2 == this.f31080) {
            return;
        }
        this.f31080 = z2;
        this.f31102 = z2;
        this.f31084++;
        this.f31105.removeCallbacks(this.f31098);
        if (z2) {
            if (this.f31089) {
                this.f31090 = 0;
                this.f31094 = 1L;
            }
            long jMax = Math.max(1L, this.f31094) + SystemClock.uptimeMillis();
            this.f31083 = jMax;
            this.f31105.postAtTime(this.f31098, jMax);
            return;
        }
        this.f31094 = Math.max(1L, this.f31083 - SystemClock.uptimeMillis());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m26112(final C10328 c10328) {
        int i;
        if (c10328.f31091 || !c10328.f31102 || c10328.f31081) {
            return;
        }
        if (!c10328.f31089 && c10328.f31092 == c10328.f31095.f51058.size() - 1 && (i = c10328.f31095.f51053) > 0 && c10328.f31090 + 1 >= i) {
            c10328.f31102 = false;
            c10328.f31089 = true;
            return;
        }
        final int size = c10328.f31089 ? 0 : (c10328.f31092 + 1) % c10328.f31095.f51058.size();
        final int i2 = c10328.f31084;
        Bitmap bitmap = c10328.f31086;
        if (bitmap != null) {
            c10328.f31086 = null;
            c10328.m26106(bitmap, size, i2);
        } else {
            c10328.f31081 = true;
            f31076.execute(new Runnable() { // from class: l.۫ܰۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C10328.m26107(this.f37439, size, i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26107(final C10328 c10328, final int i, final int i2) {
        final Bitmap bitmapM26102 = null;
        try {
            if (!c10328.f31091) {
                bitmapM26102 = c10328.m26102(i, new InterfaceC17066() { // from class: l.ܶܰۜ
                    @Override // l.InterfaceC17066
                    /* JADX INFO: renamed from: ᩻ */
                    public final boolean mo1526() {
                        return this.f46847.f31091;
                    }
                });
            }
        } catch (IOException | OutOfMemoryError | RuntimeException unused) {
        }
        c10328.f31105.post(new Runnable() { // from class: l.᩸ܰۜ
            @Override // java.lang.Runnable
            public final void run() {
                this.f69397.m26106(bitmapM26102, i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m26106(Bitmap bitmap, int i, int i2) {
        this.f31081 = false;
        if (this.f31091) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        boolean z = this.f31102;
        if (!z || this.f31084 != i2) {
            this.f31086 = bitmap;
            if (z) {
                this.f31105.post(this.f31098);
                return;
            }
            return;
        }
        if (bitmap == null) {
            this.f31102 = false;
            return;
        }
        Bitmap bitmap2 = this.f31104;
        this.f31104 = bitmap;
        this.f31092 = i;
        bitmap2.recycle();
        if (i == 0 && !this.f31089) {
            this.f31090++;
        }
        this.f31089 = false;
        this.f31094 = Math.max(20, ((C10974) this.f31095.f51058.get(i)).f33021);
        this.f31083 = Math.max(SystemClock.uptimeMillis(), this.f31083 + this.f31094);
        Runnable runnable = this.f31096;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f31102 || this.f31091) {
            return;
        }
        this.f31105.postAtTime(this.f31098, this.f31083);
    }

    @Override // l.InterfaceC0930
    /* JADX INFO: renamed from: ֫ */
    public final void mo3344(C22097 c22097) {
        synchronized (this) {
            if (this.f31091) {
                return;
            }
            this.f31091 = true;
            RunnableC20206 runnableC20206 = new RunnableC20206(0, this, c22097);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnableC20206.run();
            } else {
                this.f31105.post(runnableC20206);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26113(C10328 c10328, C22097 c22097) {
        c10328.f31080 = false;
        c10328.f31102 = false;
        c10328.f31096 = null;
        c10328.f31105.removeCallbacks(c10328.f31098);
        c10328.f31104.recycle();
        Bitmap bitmap = c10328.f31086;
        if (bitmap != null) {
            bitmap.recycle();
            c10328.f31086 = null;
        }
        f31076.execute(new RunnableC9563(c10328, c22097, 1));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26114(final C10328 c10328, final C22097 c22097) {
        c10328.f31087.recycle();
        c10328.f31088 = null;
        c10328.f31095.f51058.clear();
        try {
            c10328.f31097.close();
        } catch (IOException unused) {
        }
        c10328.f31105.post(new Runnable() { // from class: l.᩹ܰۜ
            @Override // java.lang.Runnable
            public final void run() {
                C10328.m26109(this.f72344, c22097);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26109(C10328 c10328, C22097 c22097) {
        c10328.f31093.close();
        if (c22097 != null) {
            c22097.close();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16617 m26104(C21392 c21392, long j, C22097 c22097, C9189 c9189) throws IOException {
        C16617 c16617;
        int i;
        long j2;
        int iM42078;
        int iM42079;
        long j3 = j;
        byte[] bArr = new byte[30];
        c21392.m48473(0L, bArr, 0, 30, c9189);
        int i2 = 0;
        if (!C18029.m42087("RIFF", 0, bArr) || !C18029.m42087("WEBP", 8, bArr) || !C18029.m42087("VP8X", 12, bArr) || C18029.m42090(16, bArr) != 10 || (bArr[20] & 2) == 0) {
            throw new IOException("Invalid animated WebP header");
        }
        int i3 = 4;
        long j4 = 8;
        long jM42090 = C18029.m42090(4, bArr) + 8;
        if (jM42090 > 268435456) {
            throw new IOException("WebP input exceeds byte limit");
        }
        C16617 c16618 = new C16617(C18029.m42088(24, bArr) + 1, C18029.m42088(27, bArr) + 1);
        C20146 c20146 = C20146.f65246;
        int i4 = c16618.f51052;
        int i5 = c16618.f51057;
        c20146.m46403(i4, i5);
        long j5 = 30;
        boolean z = false;
        while (true) {
            ArrayList arrayList = c16618.f51058;
            if (j5 >= jM42090) {
                C16617 c16619 = c16618;
                if (!z || arrayList.isEmpty()) {
                    throw new IOException("WebP contains no animation frames");
                }
                return c16619;
            }
            if (jM42090 - j5 < j4) {
                throw new IOException("Truncated WebP chunk");
            }
            int i6 = i5;
            int i7 = i4;
            C16617 c166110 = c16618;
            byte[] bArr2 = bArr;
            c21392.m48473(j5, bArr, 0, 8, c9189);
            long jM42091 = C18029.m42090(i3, bArr2);
            long j6 = j5 + 8;
            long j7 = j6 + jM42091;
            long j8 = j7 + (jM42091 & 1);
            if (j8 > jM42090) {
                throw new IOException("Truncated WebP chunk data");
            }
            if (C18029.m42087("ANIM", i2, bArr2)) {
                if (jM42091 != 6 || z || !arrayList.isEmpty()) {
                    throw new IOException("Invalid WebP animation header");
                }
                c21392.m48473(j6, bArr2, 0, 6, c9189);
                c16617 = c166110;
                c16617.f51050 = (int) C18029.m42090(i2, bArr2);
                c16617.f51053 = C18029.m42078(i3, bArr2);
                z = true;
            } else {
                c16617 = c166110;
                if (C18029.m42087("ICCP", i2, bArr2)) {
                    if (c16617.f51055 != 0) {
                        throw new IOException("Duplicate WebP color profile");
                    }
                    c16617.f51060 = (int) j5;
                    c16617.f51055 = (int) (j8 - j5);
                } else if (C18029.m42087("EXIF", i2, bArr2)) {
                    c16617.f51056 = (int) j6;
                    c16617.f51054 = (int) jM42091;
                } else {
                    if (C18029.m42087("ANMF", i2, bArr2)) {
                        if (!z || jM42091 < 24) {
                            throw new IOException("Invalid WebP animation frame");
                        }
                        m26110(c16617, j3, c22097);
                        c21392.m48473(j6, bArr2, 0, 16, c9189);
                        C10974 c10974 = new C10974();
                        c10974.f33020 = C18029.m42088(i2, bArr2) * 2;
                        c10974.f33026 = C18029.m42088(3, bArr2) * 2;
                        c10974.f33027 = C18029.m42088(6, bArr2) + 1;
                        c10974.f33023 = C18029.m42088(9, bArr2) + 1;
                        c10974.f33021 = C18029.m42088(12, bArr2);
                        byte b = bArr2[15];
                        c10974.f33022 = (b & 2) != 0;
                        c10974.f33019 = (b & 1) != 0;
                        int i8 = ((int) j6) + 16;
                        c10974.f33024 = i8;
                        c10974.f33025 = ((int) jM42091) - 16;
                        int i9 = i7;
                        if (((long) c10974.f33020) + ((long) c10974.f33027) <= i9) {
                            int i10 = i6;
                            if (((long) c10974.f33026) + ((long) c10974.f33023) <= i10) {
                                long j9 = i8;
                                boolean z2 = false;
                                while (j9 < j7) {
                                    if (j7 - j9 < 8) {
                                        throw new IOException("Truncated WebP frame chunk");
                                    }
                                    int i11 = i10;
                                    int i12 = i9;
                                    c21392.m48473(j9, bArr2, 0, 8, c9189);
                                    long jM42092 = C18029.m42090(4, bArr2);
                                    long j10 = j9 + 8;
                                    long j11 = j10 + jM42092 + (jM42092 & 1);
                                    if (j11 > j7) {
                                        throw new IOException("Truncated WebP frame payload");
                                    }
                                    if (C18029.m42087("VP8 ", i2, bArr2) || C18029.m42087("VP8L", i2, bArr2)) {
                                        if (z2) {
                                            throw new IOException("Duplicate WebP frame image");
                                        }
                                        c21392.m48473(j10, bArr2, 8, (int) Math.min(10L, jM42092), c9189);
                                        int i13 = (int) jM42092;
                                        int i14 = c10974.f33027;
                                        int i15 = c10974.f33023;
                                        if (C18029.m42087("VP8L", 0, bArr2)) {
                                            if (i13 < 5 || bArr2[8] != 47) {
                                                throw new IOException("Invalid lossless WebP frame header");
                                            }
                                            long jM42093 = C18029.m42090(9, bArr2);
                                            iM42078 = ((int) (jM42093 & 16383)) + 1;
                                            iM42079 = ((int) ((jM42093 >> 14) & 16383)) + 1;
                                        } else {
                                            if (i13 < 10 || (bArr2[8] & 1) != 0 || (bArr2[11] & 255) != 157 || bArr2[12] != 1 || bArr2[13] != 42) {
                                                throw new IOException("Invalid lossy WebP frame header");
                                            }
                                            iM42078 = C18029.m42078(14, bArr2) & ASN1RelativeOID.MAX_IDENTIFIER_LENGTH;
                                            iM42079 = C18029.m42078(16, bArr2) & ASN1RelativeOID.MAX_IDENTIFIER_LENGTH;
                                        }
                                        if (iM42078 != i14 || iM42079 != i15) {
                                            throw new IOException("WebP frame dimensions disagree with container");
                                        }
                                        z2 = true;
                                    } else if (!C18029.m42087("ALPH", i2, bArr2)) {
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
                                arrayList.add(c10974);
                                c16617.f51059 = Math.max(c16617.f51059, ((long) c10974.f33027) * ((long) c10974.f33023));
                                c16617.f51051 = Math.max(c16617.f51051, c10974.f33025);
                            }
                        }
                        throw new IOException("WebP frame exceeds canvas");
                    }
                    j3 = j;
                    m26110(c16617, j3, c22097);
                    c21392.m48473(j8 - 1, bArr2, 0, 1, c9189);
                    i2 = 0;
                    i3 = 4;
                    bArr = bArr2;
                    c16618 = c16617;
                    j4 = j2;
                    i4 = i7;
                    i5 = i;
                    j5 = j8;
                    jM42090 = jM42090;
                }
            }
            i = i6;
            j2 = 8;
            j3 = j;
            m26110(c16617, j3, c22097);
            c21392.m48473(j8 - 1, bArr2, 0, 1, c9189);
            i2 = 0;
            i3 = 4;
            bArr = bArr2;
            c16618 = c16617;
            j4 = j2;
            i4 = i7;
            i5 = i;
            j5 = j8;
            jM42090 = jM42090;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26110(C16617 c16617, long j, C22097 c22097) throws C1095 {
        long size = (((long) (c16617.f51058.size() + 1)) * 128) + 65536;
        if ((((long) c16617.f51054) * 4) + (((long) c16617.f51055) * 2) + size > j || !c22097.m49683(size)) {
            throw new C1095("WebP index exceeds allocation limit");
        }
    }
}
