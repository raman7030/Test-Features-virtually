package l;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩶ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 58T1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20202 implements InterfaceC16489 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MediaCodec f65367;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14310 f65368;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f65369;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Handler f65370;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f65371;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HandlerThread f65372;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final ArrayDeque f65366 = new ArrayDeque();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Object f65365 = new Object();

    public C20202(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C14310 c14310 = new C14310();
        this.f65367 = mediaCodec;
        this.f65372 = handlerThread;
        this.f65368 = c14310;
        this.f65371 = new AtomicReference();
    }

    @Override // l.InterfaceC16489
    public final void start() {
        if (this.f65369) {
            return;
        }
        HandlerThread handlerThread = this.f65372;
        handlerThread.start();
        this.f65370 = new HandlerC21613(this, handlerThread.getLooper());
        this.f65369 = true;
    }

    @Override // l.InterfaceC16489
    /* JADX INFO: renamed from: ֫ */
    public final void mo38852(int i, int i2, int i3, long j) {
        mo38851();
        C22318 c22318M46440 = m46440();
        c22318M46440.f72339 = i;
        c22318M46440.f72340 = i2;
        c22318M46440.f72341 = j;
        c22318M46440.f72338 = i3;
        Handler handler = this.f65370;
        String str = C3603.f11424;
        handler.obtainMessage(1, c22318M46440).sendToTarget();
    }

    @Override // l.InterfaceC16489
    /* JADX INFO: renamed from: ֫ */
    public final void mo38853(int i, C5615 c5615, long j, int i2) {
        mo38851();
        C22318 c22318M46440 = m46440();
        c22318M46440.f72339 = i;
        c22318M46440.f72340 = 0;
        c22318M46440.f72341 = j;
        c22318M46440.f72338 = i2;
        MediaCodec.CryptoInfo cryptoInfo = c22318M46440.f72337;
        cryptoInfo.numSubSamples = c5615.f17380;
        int[] iArr = c5615.f17381;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = c5615.f17373;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = c5615.f17378;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = c5615.f17379;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = c5615.f17376;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c5615.f17375, c5615.f17372));
        }
        Handler handler = this.f65370;
        String str = C3603.f11424;
        handler.obtainMessage(2, c22318M46440).sendToTarget();
    }

    @Override // l.InterfaceC16489
    /* JADX INFO: renamed from: ֫ */
    public final void mo38854(Bundle bundle) {
        mo38851();
        Handler handler = this.f65370;
        String str = C3603.f11424;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // l.InterfaceC16489
    public final void flush() {
        if (this.f65369) {
            try {
                Handler handler = this.f65370;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                C14310 c14310 = this.f65368;
                c14310.m34150();
                Handler handler2 = this.f65370;
                handler2.getClass();
                handler2.obtainMessage(3).sendToTarget();
                c14310.m34147();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // l.InterfaceC16489
    public final void shutdown() {
        if (this.f65369) {
            flush();
            this.f65372.quit();
        }
        this.f65369 = false;
    }

    @Override // l.InterfaceC16489
    /* JADX INFO: renamed from: ֫ */
    public final void mo38851() {
        RuntimeException runtimeException = (RuntimeException) this.f65371.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46438(C20202 c20202, Message message) {
        int i = message.what;
        C22318 c22318 = null;
        if (i == 1) {
            C22318 c22319 = (C22318) message.obj;
            try {
                c20202.f65367.queueInputBuffer(c22319.f72339, 0, c22319.f72340, c22319.f72341, c22319.f72338);
            } catch (RuntimeException e) {
                AtomicReference atomicReference = c20202.f65371;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
            c22318 = c22319;
        } else if (i == 2) {
            C22318 c223110 = (C22318) message.obj;
            int i2 = c223110.f72339;
            MediaCodec.CryptoInfo cryptoInfo = c223110.f72337;
            long j = c223110.f72341;
            int i3 = c223110.f72338;
            try {
                synchronized (f65365) {
                    try {
                        c20202.f65367.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (RuntimeException e2) {
                AtomicReference atomicReference2 = c20202.f65371;
                while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                }
            }
            c22318 = c223110;
        } else if (i == 3) {
            c20202.f65368.m34151();
        } else if (i != 4) {
            AtomicReference atomicReference3 = c20202.f65371;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                c20202.f65367.setParameters((Bundle) message.obj);
            } catch (RuntimeException e3) {
                AtomicReference atomicReference4 = c20202.f65371;
                while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                }
            }
        }
        if (c22318 != null) {
            m46439(c22318);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C22318 m46440() {
        ArrayDeque arrayDeque = f65366;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new C22318();
            }
            return (C22318) arrayDeque.removeFirst();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46439(C22318 c22318) {
        ArrayDeque arrayDeque = f65366;
        synchronized (arrayDeque) {
            arrayDeque.add(c22318);
        }
    }
}
