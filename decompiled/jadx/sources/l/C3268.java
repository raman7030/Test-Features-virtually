package l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ۗܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X8N9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3268 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f10288;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public MediaFormat f10289;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public IllegalStateException f10290;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public MediaCodec.CodecException f10291;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public MediaCodec.CryptoException f10292;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC7501 f10295;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public MediaFormat f10297;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HandlerThread f10298;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f10299;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Handler f10301;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f10300 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19661 f10287 = new C19661();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19661 f10293 = new C19661();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f10296 = new ArrayDeque();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f10294 = new ArrayDeque();

    public C3268(HandlerThread handlerThread) {
        this.f10298 = handlerThread;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10071(MediaCodec mediaCodec) {
        C22632.m50634(this.f10301 == null);
        HandlerThread handlerThread = this.f10298;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f10301 = handler;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m10075() {
        synchronized (this.f10300) {
            this.f10299 = true;
            this.f10298.quit();
            m10068();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m10069() {
        synchronized (this.f10300) {
            IllegalStateException illegalStateException = this.f10290;
            if (illegalStateException != null) {
                this.f10290 = null;
                throw illegalStateException;
            }
            MediaCodec.CodecException codecException = this.f10291;
            if (codecException != null) {
                this.f10291 = null;
                throw codecException;
            }
            MediaCodec.CryptoException cryptoException = this.f10292;
            if (cryptoException != null) {
                this.f10292 = null;
                throw cryptoException;
            }
            int iM45198 = -1;
            if (this.f10288 > 0 || this.f10299) {
                return -1;
            }
            if (!this.f10287.m45197()) {
                iM45198 = this.f10287.m45198();
            }
            return iM45198;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m10070(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f10300) {
            IllegalStateException illegalStateException = this.f10290;
            if (illegalStateException != null) {
                this.f10290 = null;
                throw illegalStateException;
            }
            MediaCodec.CodecException codecException = this.f10291;
            if (codecException != null) {
                this.f10291 = null;
                throw codecException;
            }
            MediaCodec.CryptoException cryptoException = this.f10292;
            if (cryptoException != null) {
                this.f10292 = null;
                throw cryptoException;
            }
            if (this.f10288 > 0 || this.f10299) {
                return -1;
            }
            if (this.f10293.m45197()) {
                return -1;
            }
            int iM45198 = this.f10293.m45198();
            if (iM45198 >= 0) {
                C22632.m50632(this.f10297);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f10296.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (iM45198 == -2) {
                this.f10297 = (MediaFormat) this.f10294.remove();
            }
            return iM45198;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final MediaFormat m10074() {
        MediaFormat mediaFormat;
        synchronized (this.f10300) {
            mediaFormat = this.f10297;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10073() {
        synchronized (this.f10300) {
            this.f10288++;
            Handler handler = this.f10301;
            String str = C3603.f11424;
            handler.post(new Runnable() { // from class: l.ۙܰ֫
                @Override // java.lang.Runnable
                public final void run() {
                    C3268.m10067(this.f14870);
                }
            });
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f10300) {
            this.f10287.m45196(i);
            InterfaceC7501 interfaceC7501 = this.f10295;
            if (interfaceC7501 != null) {
                AbstractC15783 abstractC15783 = ((C9435) interfaceC7501).f28616;
                if (abstractC15783.f48685 != null) {
                    abstractC15783.f48685.mo1317();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f10300) {
            MediaFormat mediaFormat = this.f10289;
            if (mediaFormat != null) {
                this.f10293.m45196(-2);
                this.f10294.add(mediaFormat);
                this.f10289 = null;
            }
            this.f10293.m45196(i);
            this.f10296.add(bufferInfo);
            InterfaceC7501 interfaceC7501 = this.f10295;
            if (interfaceC7501 != null) {
                AbstractC15783 abstractC15783 = ((C9435) interfaceC7501).f28616;
                if (abstractC15783.f48685 != null) {
                    abstractC15783.f48685.mo1317();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f10300) {
            this.f10291 = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f10300) {
            this.f10292 = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f10300) {
            this.f10293.m45196(-2);
            this.f10294.add(mediaFormat);
            this.f10289 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10072(InterfaceC7501 interfaceC7501) {
        synchronized (this.f10300) {
            this.f10295 = interfaceC7501;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10067(C3268 c3268) {
        synchronized (c3268.f10300) {
            if (c3268.f10299) {
                return;
            }
            long j = c3268.f10288 - 1;
            c3268.f10288 = j;
            if (j > 0) {
                return;
            }
            if (j < 0) {
                c3268.m10066(new IllegalStateException());
            } else {
                c3268.m10068();
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m10068() {
        ArrayDeque arrayDeque = this.f10294;
        if (!arrayDeque.isEmpty()) {
            this.f10289 = (MediaFormat) arrayDeque.getLast();
        }
        this.f10287.m45195();
        this.f10293.m45195();
        this.f10296.clear();
        arrayDeque.clear();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10066(IllegalStateException illegalStateException) {
        synchronized (this.f10300) {
            this.f10290 = illegalStateException;
        }
    }
}
