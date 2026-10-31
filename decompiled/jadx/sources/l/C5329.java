package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۚۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46LQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5329 implements InterfaceC0930, AutoCloseable, Drawable.Callback {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f16616;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Bitmap f16617;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1734 f16618;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C19441 f16619;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f16620;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f16621;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f16622;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Runnable f16623;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f16624;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f16625;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Handler f16626 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final int f16627;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final ScheduledThreadPoolExecutor f16628;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f16629;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f16630;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f16631;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C22097 f16632;

    public C5329(C1734 c1734, C19441 c19441, C22097 c22097, C5869 c5869, Bitmap bitmap, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j) {
        this.f16628 = scheduledThreadPoolExecutor;
        this.f16620 = j;
        this.f16618 = c1734;
        this.f16619 = c19441;
        this.f16632 = c22097;
        this.f16617 = bitmap;
        this.f16627 = c5869.f18013;
        this.f16621 = c5869.f18010;
        this.f16625 = c5869.f18008;
        c1734.setCallback(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7986 m15267(C5869 c5869, long j) {
        return C15040.m35581(C8083.m21450(Math.min(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX, c5869.f18007) + (((long) c5869.f18008) * 128) + c5869.f18011, 2L, c5869.f18009, 65536L), c5869.f18013, c5869.f18010, c5869.f18012 ? 4 : 3, j);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0112  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5329 m15265(AbstractC22967 abstractC22967, C11679 c11679, C19981 c19981, long j, C9189 c9189, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) throws Throwable {
        C19441 c19441;
        C1734 c1734M38926;
        IOException iOException;
        C22097 c22097M46068 = c19981.m46068(X931RNG.BLOCK64_RESEED_MAX);
        if (c22097M46068 == null) {
            throw new C1095("GIF reservation exceeds budget");
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(abstractC22967.mo6178(), 32768);
            try {
                C5869 c5869M15266 = m15266(bufferedInputStream, c9189);
                bufferedInputStream.close();
                c22097M46068.close();
                long j2 = m15267(c5869M15266, j).f24662;
                C7986 c7986M15267 = m15267(c5869M15266, Math.min(j, c19981.m46067() - c19981.m46070()));
                int i = c7986M15267.f24663;
                C22097 c22097M46069 = c19981.m46068(c7986M15267.f24662);
                if (c22097M46069 == null) {
                    throw new C1095("GIF reservation exceeds budget");
                }
                Bitmap bitmap = null;
                try {
                    AbstractC22967.m51107(c9189);
                    C10907 c10907M38931 = new C10907().m38927(i).m38928(scheduledThreadPoolExecutor).m38931();
                    if (abstractC22967.mo17660() != null) {
                        c10907M38931.m38929(abstractC22967.mo17660());
                        c19441 = null;
                    } else {
                        c19441 = new C19441(abstractC22967, c9189);
                        try {
                            c10907M38931.m38930(c19441);
                        } catch (IOException | Error | RuntimeException e) {
                            e = e;
                            c1734M38926 = null;
                            if (0 != 0) {
                                bitmap.recycle();
                            }
                            if (c1734M38926 != null) {
                                c1734M38926.m5787();
                            }
                            if (c19441 != null) {
                                c19441.close();
                            }
                            c22097M46069.close();
                            throw e;
                        }
                    }
                    c1734M38926 = c10907M38931.m38926();
                    try {
                        c1734M38926.stop();
                        if (c19441 != null && (iOException = c19441.f62885) != null) {
                            throw iOException;
                        }
                        AbstractC22967.m51107(c9189);
                        if (c1734M38926.m5789() != c5869M15266.f18008) {
                            throw new IOException("GIF frame count changed during decode");
                        }
                        if ((C4623.m13563(c5869M15266.f18013, c5869M15266.f18010, i) * 2) + c1734M38926.m5785() + c1734M38926.m5791() > c22097M46069.m49682()) {
                            throw new C1095("GIF native allocation exceeds reservation");
                        }
                        Bitmap bitmapM5788 = c1734M38926.m5788();
                        if (c1734M38926.m5792() != EnumC17962.NO_ERROR) {
                            throw new IOException("GIF first frame could not be decoded");
                        }
                        abstractC22967.m51108(c11679);
                        AbstractC22967.m51107(c9189);
                        if (c19441 != null) {
                            c19441.f62886 = new C11461();
                        }
                        return new C5329(c1734M38926, c19441, c22097M46069, c5869M15266, bitmapM5788, scheduledThreadPoolExecutor, j2);
                    } catch (IOException e2) {
                        e = e2;
                        if (0 != 0) {
                            bitmap.recycle();
                        }
                        if (c1734M38926 != null) {
                            c1734M38926.m5787();
                        }
                        if (c19441 != null) {
                            c19441.close();
                        }
                        c22097M46069.close();
                        throw e;
                    } catch (Error e3) {
                        e = e3;
                        if (0 != 0) {
                            bitmap.recycle();
                        }
                        if (c1734M38926 != null) {
                            c1734M38926.m5787();
                        }
                        if (c19441 != null) {
                            c19441.close();
                        }
                        c22097M46069.close();
                        throw e;
                    } catch (RuntimeException e4) {
                        e = e4;
                        if (0 != 0) {
                            bitmap.recycle();
                        }
                        if (c1734M38926 != null) {
                            c1734M38926.m5787();
                        }
                        if (c19441 != null) {
                            c19441.close();
                        }
                        c22097M46069.close();
                        throw e;
                    }
                } catch (IOException | Error | RuntimeException e5) {
                    e = e5;
                    c19441 = null;
                    c1734M38926 = null;
                }
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            c22097M46068.close();
            throw th3;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        m15274();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f16626.postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f16626.removeCallbacks(runnable);
    }

    @Override // l.InterfaceC0930
    /* JADX INFO: renamed from: ܽ */
    public final long mo3346() {
        long jM49682 = this.f16632.m49682();
        long j = this.f16620;
        if (j > jM49682) {
            return j;
        }
        return 0L;
    }

    @Override // l.InterfaceC0930
    /* JADX INFO: renamed from: ֫ */
    public final long mo3342() {
        return this.f16632.m49682();
    }

    @Override // l.InterfaceC0930
    /* JADX INFO: renamed from: ֫ */
    public final void mo3343(Canvas canvas, RectF rectF, Paint paint) {
        if (this.f16629) {
            return;
        }
        canvas.drawBitmap(this.f16617, (Rect) null, rectF, paint);
    }

    @Override // l.InterfaceC0930
    /* JADX INFO: renamed from: ֫ */
    public final void mo3345(boolean z, RunnableC8483 runnableC8483) {
        if (this.f16629) {
            return;
        }
        if (!z) {
            runnableC8483 = null;
        }
        this.f16623 = runnableC8483;
        final boolean z2 = z & (this.f16625 > 1);
        if (z2 == this.f16622) {
            return;
        }
        this.f16622 = z2;
        this.f16630 = z2;
        this.f16624++;
        this.f16628.execute(new Runnable() { // from class: l.ۖۨۜ
            @Override // java.lang.Runnable
            public final void run() {
                C5329.m15271(this.f7970, z2);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15271(C5329 c5329, boolean z) {
        if (c5329.f16629) {
            return;
        }
        if (z) {
            if (c5329.f16618.m5794()) {
                c5329.f16618.m5793();
                return;
            } else {
                c5329.f16618.start();
                return;
            }
        }
        c5329.f16618.stop();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m15274() {
        if (this.f16629 || !this.f16630) {
            return;
        }
        if (this.f16631) {
            this.f16616 = true;
            return;
        }
        this.f16631 = true;
        this.f16616 = false;
        final int i = this.f16624;
        this.f16628.execute(new Runnable() { // from class: l.ۘۨۜ
            @Override // java.lang.Runnable
            public final void run() {
                C5329.m15268(this.f12500, i);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15268(final C5329 c5329, final int i) {
        Bitmap bitmapM5788;
        int i2;
        final Bitmap bitmap;
        final int i3;
        final boolean z;
        boolean zIsRunning;
        IOException iOException;
        try {
            if (c5329.f16629) {
                bitmapM5788 = null;
                zIsRunning = false;
                i2 = 0;
            } else {
                C19441 c19441 = c5329.f16619;
                if (c19441 != null && (iOException = c19441.f62885) != null) {
                    throw iOException;
                }
                if (c5329.f16618.m5792() != EnumC17962.NO_ERROR) {
                    throw new IOException("GIF frame could not be decoded");
                }
                bitmapM5788 = c5329.f16618.m5788();
                try {
                    if (c5329.f16618.m5794()) {
                        i2 = c5329.f16625 - 1;
                    } else {
                        int iM5790 = c5329.f16618.m5790();
                        int i4 = c5329.f16625;
                        i2 = ((iM5790 + i4) - 1) % i4;
                    }
                    try {
                        zIsRunning = c5329.f16618.isRunning();
                    } catch (IOException | OutOfMemoryError | RuntimeException unused) {
                        if (bitmapM5788 != null) {
                            bitmapM5788.recycle();
                        }
                        c5329.f16618.stop();
                        bitmap = null;
                        i3 = i2;
                        z = false;
                    }
                } catch (IOException | OutOfMemoryError | RuntimeException unused2) {
                    i2 = 0;
                    if (bitmapM5788 != null) {
                        bitmapM5788.recycle();
                    }
                    c5329.f16618.stop();
                    bitmap = null;
                    i3 = i2;
                    z = false;
                    c5329.f16626.post(new Runnable(i, bitmap, i3, z) { // from class: l.᩷ۨۜ

                        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ boolean f67510;

                        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ Bitmap f67511;

                        /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ int f67513;

                        {
                            this.f67510 = z;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C5329.m15269(this.f67512, this.f67513, this.f67511, this.f67510);
                        }
                    });
                }
            }
            z = zIsRunning;
            bitmap = bitmapM5788;
            i3 = i2;
        } catch (IOException | OutOfMemoryError | RuntimeException unused3) {
            bitmapM5788 = null;
        }
        c5329.f16626.post(new Runnable(i, bitmap, i3, z) { // from class: l.᩷ۨۜ

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ boolean f67510;

            /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ Bitmap f67511;

            /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f67513;

            {
                this.f67510 = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C5329.m15269(this.f67512, this.f67513, this.f67511, this.f67510);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15269(C5329 c5329, int i, Bitmap bitmap, boolean z) {
        c5329.f16631 = false;
        if (c5329.f16629 || !c5329.f16630 || i != c5329.f16624) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            if (c5329.f16629 || !c5329.f16630) {
                return;
            }
            c5329.m15274();
            return;
        }
        if (bitmap == null) {
            c5329.f16630 = false;
            return;
        }
        Bitmap bitmap2 = c5329.f16617;
        c5329.f16617 = bitmap;
        c5329.f16630 = z;
        bitmap2.recycle();
        Runnable runnable = c5329.f16623;
        if (runnable != null) {
            runnable.run();
        }
        if (c5329.f16616) {
            c5329.m15274();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        mo3344(null);
    }

    @Override // l.InterfaceC0930
    /* JADX INFO: renamed from: ֫ */
    public final void mo3344(final C22097 c22097) {
        synchronized (this) {
            if (this.f16629) {
                return;
            }
            this.f16629 = true;
            Runnable runnable = new Runnable() { // from class: l.ᩴۨۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C5329.m15270(this.f59213, c22097);
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                this.f16626.post(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15270(final C5329 c5329, final C22097 c22097) {
        c5329.f16622 = false;
        c5329.f16630 = false;
        c5329.f16623 = null;
        c5329.f16617.recycle();
        c5329.f16628.execute(new Runnable() { // from class: l.ۜۨۜ
            @Override // java.lang.Runnable
            public final void run() {
                C5329.m15273(this.f20944, c22097);
            }
        });
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15273(C5329 c5329, C22097 c22097) {
        Handler handler = c5329.f16626;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = c5329.f16628;
        C19441 c19441 = c5329.f16619;
        C1734 c1734 = c5329.f16618;
        try {
            c1734.setCallback(null);
            c1734.m5787();
        } finally {
            if (c19441 != null) {
                c19441.close();
            }
            scheduledThreadPoolExecutor.shutdown();
            handler.post(new RunnableC9563(c5329, c22097, 0));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15272(C5329 c5329, C22097 c22097) {
        c5329.f16632.close();
        if (c22097 != null) {
            c22097.close();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5869 m15266(BufferedInputStream bufferedInputStream, C9189 c9189) throws IOException {
        long jMax;
        C0389 c0389 = new C0389(bufferedInputStream, c9189);
        byte[] bArr = new byte[13];
        for (int i = 0; i < 13; i++) {
            bArr[i] = (byte) c0389.m1883();
        }
        if (bArr[0] == 71 && bArr[1] == 73) {
            int i2 = 2;
            if (bArr[2] == 70) {
                int i3 = 3;
                if (bArr[3] == 56) {
                    int i4 = 4;
                    byte b = bArr[4];
                    if ((b == 55 || b == 57) && bArr[5] == 97) {
                        int i5 = 7;
                        int i6 = (bArr[6] & 255) | ((bArr[7] & 255) << 8);
                        int i7 = (bArr[8] & 255) | ((bArr[9] & 255) << 8);
                        C20146.f65246.m46403(i6, i7);
                        byte b2 = bArr[10];
                        long j = (b2 & GCMSIVBlockCipher.MASK) != 0 ? 3 << ((b2 & 7) + 1) : 0L;
                        c0389.m1884((int) j);
                        int i8 = 0;
                        long j2 = j;
                        long j3 = 0;
                        long j4 = 0;
                        long j5 = 0;
                        boolean z = false;
                        while (true) {
                            int iM1883 = c0389.m1883();
                            if (iM1883 == 59) {
                                if (i8 == 0) {
                                    throw new IOException("GIF contains no frames");
                                }
                                return new C5869(i6, i7, i8, j4, j3, j2, z);
                            }
                            if (iM1883 == 33) {
                                int iM1884 = c0389.m1883();
                                if (iM1884 != 249) {
                                    long j6 = 0;
                                    while (true) {
                                        int iM1885 = c0389.m1883();
                                        if (iM1885 == 0) {
                                            break;
                                        }
                                        j6 += (long) iM1885;
                                        c0389.m1884(iM1885);
                                    }
                                    if (iM1884 == 254) {
                                        j4 += j6;
                                    }
                                } else {
                                    if (c0389.m1883() != i4) {
                                        throw new IOException("Invalid GIF graphics control");
                                    }
                                    z |= ((c0389.m1883() >> i2) & i5) == i3;
                                    c0389.m1884(i3);
                                    if (c0389.m1883() != 0) {
                                        throw new IOException("Invalid GIF graphics terminator");
                                    }
                                }
                                jMax = j3;
                            } else if (iM1883 == 44) {
                                int iM1886 = c0389.m1885();
                                int iM1887 = c0389.m1885();
                                int iM1888 = c0389.m1885();
                                int iM1889 = c0389.m1885();
                                int iM18810 = c0389.m1883();
                                if (iM1888 <= 0 || iM1889 <= 0 || iM1886 + iM1888 > i6 || iM1887 + iM1889 > i7) {
                                    break;
                                }
                                i8++;
                                long j7 = ((long) iM1888) * ((long) iM1889);
                                if (j7 > j5) {
                                    jMax = Math.max(j3, j5 + j7);
                                    j5 = j7;
                                } else {
                                    jMax = j3;
                                }
                                if ((iM18810 & 128) != 0) {
                                    int i9 = 3 << ((iM18810 & 7) + 1);
                                    j2 += (long) i9;
                                    c0389.m1884(i9);
                                }
                                int iM18811 = c0389.m1883();
                                if (iM18811 < 2 || iM18811 > 8) {
                                    throw new IOException("Invalid GIF code size");
                                }
                                while (true) {
                                    int iM18812 = c0389.m1883();
                                    if (iM18812 != 0) {
                                        c0389.m1884(iM18812);
                                    }
                                }
                            } else {
                                throw new IOException("Invalid GIF block");
                            }
                            i2 = 2;
                            i3 = 3;
                            i4 = 4;
                            j3 = jMax;
                            i5 = 7;
                        }
                        throw new IOException("GIF frame exceeds safe bounds");
                    }
                }
            }
        }
        throw new IOException("Invalid GIF header");
    }
}
