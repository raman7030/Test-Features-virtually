package p067l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۚۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46LQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7433 implements InterfaceC3252, AutoCloseable, Drawable.Callback {

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f19455;

    /* JADX INFO: renamed from: ۗ */
    public Bitmap f19456;

    /* JADX INFO: renamed from: ۙ */
    public final C4016 f19457;

    /* JADX INFO: renamed from: ۛ */
    public final C20845 f19458;

    /* JADX INFO: renamed from: ۟ */
    public final long f19459;

    /* JADX INFO: renamed from: ۤ */
    public final int f19460;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f19461;

    /* JADX INFO: renamed from: ۨ */
    public Runnable f19462;

    /* JADX INFO: renamed from: ۫ */
    public int f19463;

    /* JADX INFO: renamed from: ۬ */
    public final int f19464;

    /* JADX INFO: renamed from: ܰ */
    public final Handler f19465 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܽ֫ */
    public final int f19466;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final ScheduledThreadPoolExecutor f19467;

    /* JADX INFO: renamed from: ᩶ */
    public volatile boolean f19468;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f19469;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f19470;

    /* JADX INFO: renamed from: ᩺ */
    public final C23369 f19471;

    public C7433(C4016 c4016, C20845 c20845, C23369 c23369, C7946 c7946, Bitmap bitmap, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j) {
        this.f19467 = scheduledThreadPoolExecutor;
        this.f19459 = j;
        this.f19457 = c4016;
        this.f19458 = c20845;
        this.f19471 = c23369;
        this.f19456 = bitmap;
        this.f19466 = c7946.f20866;
        this.f19460 = c7946.f20863;
        this.f19464 = c7946.f20861;
        c4016.setCallback(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9958 m17174(C7946 c7946, long j) {
        return C16662.m37738(C10050.m23418(Math.min(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX, c7946.f20860) + (((long) c7946.f20861) * 128) + c7946.f20864, 2L, c7946.f20862, 65536L), c7946.f20866, c7946.f20863, c7946.f20865 ? 4 : 3, j);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0112  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX INFO: renamed from: ֫ */
    public static C7433 m17172(AbstractC24196 abstractC24196, C13468 c13468, C21358 c21358, long j, C11102 c11102, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) throws Throwable {
        C20845 c20845;
        C4016 c4016M41152;
        IOException iOException;
        C23369 c23369M48382 = c21358.m48382(X931RNG.BLOCK64_RESEED_MAX);
        if (c23369M48382 == null) {
            throw new C3409("GIF reservation exceeds budget");
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(abstractC24196.mo8380(), 32768);
            try {
                C7946 c7946M17173 = m17173(bufferedInputStream, c11102);
                bufferedInputStream.close();
                c23369M48382.close();
                long j2 = m17174(c7946M17173, j).f27575;
                C9958 c9958M17174 = m17174(c7946M17173, Math.min(j, c21358.m48381() - c21358.m48384()));
                int i = c9958M17174.f27576;
                C23369 c23369M48383 = c21358.m48382(c9958M17174.f27575);
                if (c23369M48383 == null) {
                    throw new C3409("GIF reservation exceeds budget");
                }
                Bitmap bitmap = null;
                try {
                    AbstractC24196.m53499(c11102);
                    C12734 c12734M41157 = new C12734().m41153(i).m41154(scheduledThreadPoolExecutor).m41157();
                    if (abstractC24196.mo19605() != null) {
                        c12734M41157.m41155(abstractC24196.mo19605());
                        c20845 = null;
                    } else {
                        c20845 = new C20845(abstractC24196, c11102);
                        try {
                            c12734M41157.m41156(c20845);
                        } catch (IOException | Error | RuntimeException e) {
                            e = e;
                            c4016M41152 = null;
                            if (0 != 0) {
                                bitmap.recycle();
                            }
                            if (c4016M41152 != null) {
                                c4016M41152.m7997();
                            }
                            if (c20845 != null) {
                                c20845.close();
                            }
                            c23369M48383.close();
                            throw e;
                        }
                    }
                    c4016M41152 = c12734M41157.m41152();
                    try {
                        c4016M41152.stop();
                        if (c20845 != null && (iOException = c20845.f65501) != null) {
                            throw iOException;
                        }
                        AbstractC24196.m53499(c11102);
                        if (c4016M41152.m7999() != c7946M17173.f20861) {
                            throw new IOException("GIF frame count changed during decode");
                        }
                        if ((C6762.m15438(c7946M17173.f20866, c7946M17173.f20863, i) * 2) + c4016M41152.m7995() + c4016M41152.m8001() > c23369M48383.m52020()) {
                            throw new C3409("GIF native allocation exceeds reservation");
                        }
                        Bitmap bitmapM7998 = c4016M41152.m7998();
                        if (c4016M41152.m8002() != EnumC19439.NO_ERROR) {
                            throw new IOException("GIF first frame could not be decoded");
                        }
                        abstractC24196.m53500(c13468);
                        AbstractC24196.m53499(c11102);
                        if (c20845 != null) {
                            c20845.f65502 = new C13261();
                        }
                        return new C7433(c4016M41152, c20845, c23369M48383, c7946M17173, bitmapM7998, scheduledThreadPoolExecutor, j2);
                    } catch (IOException e2) {
                        e = e2;
                        if (0 != 0) {
                            bitmap.recycle();
                        }
                        if (c4016M41152 != null) {
                            c4016M41152.m7997();
                        }
                        if (c20845 != null) {
                            c20845.close();
                        }
                        c23369M48383.close();
                        throw e;
                    } catch (Error e3) {
                        e = e3;
                        if (0 != 0) {
                            bitmap.recycle();
                        }
                        if (c4016M41152 != null) {
                            c4016M41152.m7997();
                        }
                        if (c20845 != null) {
                            c20845.close();
                        }
                        c23369M48383.close();
                        throw e;
                    } catch (RuntimeException e4) {
                        e = e4;
                        if (0 != 0) {
                            bitmap.recycle();
                        }
                        if (c4016M41152 != null) {
                            c4016M41152.m7997();
                        }
                        if (c20845 != null) {
                            c20845.close();
                        }
                        c23369M48383.close();
                        throw e;
                    }
                } catch (IOException | Error | RuntimeException e5) {
                    e = e5;
                    c20845 = null;
                    c4016M41152 = null;
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
            c23369M48382.close();
            throw th3;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        m17181();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f19465.postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f19465.removeCallbacks(runnable);
    }

    @Override // p067l.InterfaceC3252
    /* JADX INFO: renamed from: ܽ */
    public final long mo5665() {
        long jM52020 = this.f19471.m52020();
        long j = this.f19459;
        if (j > jM52020) {
            return j;
        }
        return 0L;
    }

    @Override // p067l.InterfaceC3252
    /* JADX INFO: renamed from: ֫ */
    public final long mo5661() {
        return this.f19471.m52020();
    }

    @Override // p067l.InterfaceC3252
    /* JADX INFO: renamed from: ֫ */
    public final void mo5662(Canvas canvas, RectF rectF, Paint paint) {
        if (this.f19468) {
            return;
        }
        canvas.drawBitmap(this.f19456, (Rect) null, rectF, paint);
    }

    @Override // p067l.InterfaceC3252
    /* JADX INFO: renamed from: ֫ */
    public final void mo5664(boolean z, RunnableC10431 runnableC10431) {
        if (this.f19468) {
            return;
        }
        if (!z) {
            runnableC10431 = null;
        }
        this.f19462 = runnableC10431;
        final boolean z2 = z & (this.f19464 > 1);
        if (z2 == this.f19461) {
            return;
        }
        this.f19461 = z2;
        this.f19469 = z2;
        this.f19463++;
        this.f19467.execute(new Runnable() { // from class: l.ۖۨۜ
            @Override // java.lang.Runnable
            public final void run() {
                C7433.m17178(this.f10761, z2);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m17178(C7433 c7433, boolean z) {
        if (c7433.f19468) {
            return;
        }
        if (z) {
            if (c7433.f19457.m8004()) {
                c7433.f19457.m8003();
                return;
            } else {
                c7433.f19457.start();
                return;
            }
        }
        c7433.f19457.stop();
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m17181() {
        if (this.f19468 || !this.f19469) {
            return;
        }
        if (this.f19470) {
            this.f19455 = true;
            return;
        }
        this.f19470 = true;
        this.f19455 = false;
        final int i = this.f19463;
        this.f19467.execute(new Runnable() { // from class: l.ۘۨۜ
            @Override // java.lang.Runnable
            public final void run() {
                C7433.m17175(this.f15308, i);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX INFO: renamed from: ֫ */
    public static void m17175(final C7433 c7433, final int i) {
        Bitmap bitmapM7998;
        int i2;
        final Bitmap bitmap;
        final int i3;
        final boolean z;
        boolean zIsRunning;
        IOException iOException;
        try {
            if (c7433.f19468) {
                bitmapM7998 = null;
                zIsRunning = false;
                i2 = 0;
            } else {
                C20845 c20845 = c7433.f19458;
                if (c20845 != null && (iOException = c20845.f65501) != null) {
                    throw iOException;
                }
                if (c7433.f19457.m8002() != EnumC19439.NO_ERROR) {
                    throw new IOException("GIF frame could not be decoded");
                }
                bitmapM7998 = c7433.f19457.m7998();
                try {
                    if (c7433.f19457.m8004()) {
                        i2 = c7433.f19464 - 1;
                    } else {
                        int iM8000 = c7433.f19457.m8000();
                        int i4 = c7433.f19464;
                        i2 = ((iM8000 + i4) - 1) % i4;
                    }
                    try {
                        zIsRunning = c7433.f19457.isRunning();
                    } catch (IOException | OutOfMemoryError | RuntimeException unused) {
                        if (bitmapM7998 != null) {
                            bitmapM7998.recycle();
                        }
                        c7433.f19457.stop();
                        bitmap = null;
                        i3 = i2;
                        z = false;
                    }
                } catch (IOException | OutOfMemoryError | RuntimeException unused2) {
                    i2 = 0;
                    if (bitmapM7998 != null) {
                        bitmapM7998.recycle();
                    }
                    c7433.f19457.stop();
                    bitmap = null;
                    i3 = i2;
                    z = false;
                    c7433.f19465.post(new Runnable(i, bitmap, i3, z) { // from class: l.᩷ۨۜ

                        /* JADX INFO: renamed from: ۙ */
                        public final /* synthetic */ boolean f70192;

                        /* JADX INFO: renamed from: ᩶ */
                        public final /* synthetic */ Bitmap f70193;

                        /* JADX INFO: renamed from: ᩹ */
                        public final /* synthetic */ int f70195;

                        {
                            this.f70192 = z;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C7433.m17176(this.f70194, this.f70195, this.f70193, this.f70192);
                        }
                    });
                }
            }
            z = zIsRunning;
            bitmap = bitmapM7998;
            i3 = i2;
        } catch (IOException | OutOfMemoryError | RuntimeException unused3) {
            bitmapM7998 = null;
        }
        c7433.f19465.post(new Runnable(i, bitmap, i3, z) { // from class: l.᩷ۨۜ

            /* JADX INFO: renamed from: ۙ */
            public final /* synthetic */ boolean f70192;

            /* JADX INFO: renamed from: ᩶ */
            public final /* synthetic */ Bitmap f70193;

            /* JADX INFO: renamed from: ᩹ */
            public final /* synthetic */ int f70195;

            {
                this.f70192 = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7433.m17176(this.f70194, this.f70195, this.f70193, this.f70192);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m17176(C7433 c7433, int i, Bitmap bitmap, boolean z) {
        c7433.f19470 = false;
        if (c7433.f19468 || !c7433.f19469 || i != c7433.f19463) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            if (c7433.f19468 || !c7433.f19469) {
                return;
            }
            c7433.m17181();
            return;
        }
        if (bitmap == null) {
            c7433.f19469 = false;
            return;
        }
        Bitmap bitmap2 = c7433.f19456;
        c7433.f19456 = bitmap;
        c7433.f19469 = z;
        bitmap2.recycle();
        Runnable runnable = c7433.f19462;
        if (runnable != null) {
            runnable.run();
        }
        if (c7433.f19455) {
            c7433.m17181();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        mo5663(null);
    }

    @Override // p067l.InterfaceC3252
    /* JADX INFO: renamed from: ֫ */
    public final void mo5663(final C23369 c23369) {
        synchronized (this) {
            if (this.f19468) {
                return;
            }
            this.f19468 = true;
            Runnable runnable = new Runnable() { // from class: l.ᩴۨۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C7433.m17177(this.f62436, c23369);
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                this.f19465.post(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m17177(final C7433 c7433, final C23369 c23369) {
        c7433.f19461 = false;
        c7433.f19469 = false;
        c7433.f19462 = null;
        c7433.f19456.recycle();
        c7433.f19467.execute(new Runnable() { // from class: l.ۜۨۜ
            @Override // java.lang.Runnable
            public final void run() {
                C7433.m17180(this.f23818, c23369);
            }
        });
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m17180(C7433 c7433, C23369 c23369) {
        Handler handler = c7433.f19465;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = c7433.f19467;
        C20845 c20845 = c7433.f19458;
        C4016 c4016 = c7433.f19457;
        try {
            c4016.setCallback(null);
            c4016.m7997();
        } finally {
            if (c20845 != null) {
                c20845.close();
            }
            scheduledThreadPoolExecutor.shutdown();
            handler.post(new RunnableC11457(c7433, c23369, 0));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m17179(C7433 c7433, C23369 c23369) {
        c7433.f19471.close();
        if (c23369 != null) {
            c23369.close();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7946 m17173(BufferedInputStream bufferedInputStream, C11102 c11102) throws IOException {
        long jMax;
        C2738 c2738 = new C2738(bufferedInputStream, c11102);
        byte[] bArr = new byte[13];
        for (int i = 0; i < 13; i++) {
            bArr[i] = (byte) c2738.m4275();
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
                        C21515.f67888.m48719(i6, i7);
                        byte b2 = bArr[10];
                        long j = (b2 & GCMSIVBlockCipher.MASK) != 0 ? 3 << ((b2 & 7) + 1) : 0L;
                        c2738.m4276((int) j);
                        int i8 = 0;
                        long j2 = j;
                        long j3 = 0;
                        long j4 = 0;
                        long j5 = 0;
                        boolean z = false;
                        while (true) {
                            int iM4275 = c2738.m4275();
                            if (iM4275 == 59) {
                                if (i8 == 0) {
                                    throw new IOException("GIF contains no frames");
                                }
                                return new C7946(i6, i7, i8, j4, j3, j2, z);
                            }
                            if (iM4275 == 33) {
                                int iM4276 = c2738.m4275();
                                if (iM4276 != 249) {
                                    long j6 = 0;
                                    while (true) {
                                        int iM4277 = c2738.m4275();
                                        if (iM4277 == 0) {
                                            break;
                                        }
                                        j6 += (long) iM4277;
                                        c2738.m4276(iM4277);
                                    }
                                    if (iM4276 == 254) {
                                        j4 += j6;
                                    }
                                } else {
                                    if (c2738.m4275() != i4) {
                                        throw new IOException("Invalid GIF graphics control");
                                    }
                                    z |= ((c2738.m4275() >> i2) & i5) == i3;
                                    c2738.m4276(i3);
                                    if (c2738.m4275() != 0) {
                                        throw new IOException("Invalid GIF graphics terminator");
                                    }
                                }
                                jMax = j3;
                            } else if (iM4275 == 44) {
                                int iM4278 = c2738.m4277();
                                int iM4279 = c2738.m4277();
                                int iM42710 = c2738.m4277();
                                int iM42711 = c2738.m4277();
                                int iM42712 = c2738.m4275();
                                if (iM42710 <= 0 || iM42711 <= 0 || iM4278 + iM42710 > i6 || iM4279 + iM42711 > i7) {
                                    break;
                                }
                                i8++;
                                long j7 = ((long) iM42710) * ((long) iM42711);
                                if (j7 > j5) {
                                    jMax = Math.max(j3, j5 + j7);
                                    j5 = j7;
                                } else {
                                    jMax = j3;
                                }
                                if ((iM42712 & 128) != 0) {
                                    int i9 = 3 << ((iM42712 & 7) + 1);
                                    j2 += (long) i9;
                                    c2738.m4276(i9);
                                }
                                int iM42713 = c2738.m4275();
                                if (iM42713 < 2 || iM42713 > 8) {
                                    throw new IOException("Invalid GIF code size");
                                }
                                while (true) {
                                    int iM42714 = c2738.m4275();
                                    if (iM42714 != 0) {
                                        c2738.m4276(iM42714);
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
