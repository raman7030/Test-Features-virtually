package p067l;

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
public final class C21568 implements InterfaceC18039 {

    /* JADX INFO: renamed from: ֫ */
    public final MediaCodec f68014;

    /* JADX INFO: renamed from: ۧ */
    public final C15968 f68015;

    /* JADX INFO: renamed from: ܳ */
    public boolean f68016;

    /* JADX INFO: renamed from: ܽ */
    public Handler f68017;

    /* JADX INFO: renamed from: ܿ */
    public final AtomicReference f68018;

    /* JADX INFO: renamed from: ᩳ */
    public final HandlerThread f68019;

    /* JADX INFO: renamed from: ᩻ */
    public static final ArrayDeque f68013 = new ArrayDeque();

    /* JADX INFO: renamed from: ۜ */
    public static final Object f68012 = new Object();

    public C21568(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C15968 c15968 = new C15968();
        this.f68014 = mediaCodec;
        this.f68019 = handlerThread;
        this.f68015 = c15968;
        this.f68018 = new AtomicReference();
    }

    @Override // p067l.InterfaceC18039
    public final void start() {
        if (this.f68016) {
            return;
        }
        HandlerThread handlerThread = this.f68019;
        handlerThread.start();
        this.f68017 = new HandlerC22909(this, handlerThread.getLooper());
        this.f68016 = true;
    }

    @Override // p067l.InterfaceC18039
    /* JADX INFO: renamed from: ֫ */
    public final void mo41078(int i, int i2, int i3, long j) {
        mo41077();
        C23579 c23579M48759 = m48759();
        c23579M48759.f75065 = i;
        c23579M48759.f75066 = i2;
        c23579M48759.f75067 = j;
        c23579M48759.f75064 = i3;
        Handler handler = this.f68017;
        String str = C5792.f14228;
        handler.obtainMessage(1, c23579M48759).sendToTarget();
    }

    @Override // p067l.InterfaceC18039
    /* JADX INFO: renamed from: ֫ */
    public final void mo41079(int i, C7705 c7705, long j, int i2) {
        mo41077();
        C23579 c23579M48759 = m48759();
        c23579M48759.f75065 = i;
        c23579M48759.f75066 = 0;
        c23579M48759.f75067 = j;
        c23579M48759.f75064 = i2;
        MediaCodec.CryptoInfo cryptoInfo = c23579M48759.f75063;
        cryptoInfo.numSubSamples = c7705.f20224;
        int[] iArr = c7705.f20225;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = c7705.f20217;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = c7705.f20222;
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
        byte[] bArr2 = c7705.f20223;
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
        cryptoInfo.mode = c7705.f20220;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c7705.f20219, c7705.f20216));
        }
        Handler handler = this.f68017;
        String str = C5792.f14228;
        handler.obtainMessage(2, c23579M48759).sendToTarget();
    }

    @Override // p067l.InterfaceC18039
    /* JADX INFO: renamed from: ֫ */
    public final void mo41080(Bundle bundle) {
        mo41077();
        Handler handler = this.f68017;
        String str = C5792.f14228;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // p067l.InterfaceC18039
    public final void flush() {
        if (this.f68016) {
            try {
                Handler handler = this.f68017;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                C15968 c15968 = this.f68015;
                c15968.m36283();
                Handler handler2 = this.f68017;
                handler2.getClass();
                handler2.obtainMessage(3).sendToTarget();
                c15968.m36280();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // p067l.InterfaceC18039
    public final void shutdown() {
        if (this.f68016) {
            flush();
            this.f68019.quit();
        }
        this.f68016 = false;
    }

    @Override // p067l.InterfaceC18039
    /* JADX INFO: renamed from: ֫ */
    public final void mo41077() {
        RuntimeException runtimeException = (RuntimeException) this.f68018.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48757(C21568 c21568, Message message) {
        int i = message.what;
        C23579 c23579 = null;
        if (i == 1) {
            C23579 c235710 = (C23579) message.obj;
            try {
                c21568.f68014.queueInputBuffer(c235710.f75065, 0, c235710.f75066, c235710.f75067, c235710.f75064);
            } catch (RuntimeException e) {
                AtomicReference atomicReference = c21568.f68018;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
            c23579 = c235710;
        } else if (i == 2) {
            C23579 c235711 = (C23579) message.obj;
            int i2 = c235711.f75065;
            MediaCodec.CryptoInfo cryptoInfo = c235711.f75063;
            long j = c235711.f75067;
            int i3 = c235711.f75064;
            try {
                synchronized (f68012) {
                    try {
                        c21568.f68014.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (RuntimeException e2) {
                AtomicReference atomicReference2 = c21568.f68018;
                while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                }
            }
            c23579 = c235711;
        } else if (i == 3) {
            c21568.f68015.m36284();
        } else if (i != 4) {
            AtomicReference atomicReference3 = c21568.f68018;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                c21568.f68014.setParameters((Bundle) message.obj);
            } catch (RuntimeException e3) {
                AtomicReference atomicReference4 = c21568.f68018;
                while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                }
            }
        }
        if (c23579 != null) {
            m48758(c23579);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C23579 m48759() {
        ArrayDeque arrayDeque = f68013;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new C23579();
            }
            return (C23579) arrayDeque.removeFirst();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48758(C23579 c23579) {
        ArrayDeque arrayDeque = f68013;
        synchronized (arrayDeque) {
            arrayDeque.add(c23579);
        }
    }
}
