package p067l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ۗܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X8N9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5474 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: ۖ */
    public long f13096;

    /* JADX INFO: renamed from: ۘ */
    public MediaFormat f13097;

    /* JADX INFO: renamed from: ۜ */
    public IllegalStateException f13098;

    /* JADX INFO: renamed from: ۡ */
    public MediaCodec.CodecException f13099;

    /* JADX INFO: renamed from: ۢ */
    public MediaCodec.CryptoException f13100;

    /* JADX INFO: renamed from: ܺ */
    public InterfaceC9497 f13103;

    /* JADX INFO: renamed from: ܿ */
    public MediaFormat f13105;

    /* JADX INFO: renamed from: ᩳ */
    public final HandlerThread f13106;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f13107;

    /* JADX INFO: renamed from: ᩻ */
    public Handler f13109;

    /* JADX INFO: renamed from: ᩷ */
    public final Object f13108 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public final C1817 f13095 = new C1817();

    /* JADX INFO: renamed from: ۧ */
    public final C1817 f13101 = new C1817();

    /* JADX INFO: renamed from: ܽ */
    public final ArrayDeque f13104 = new ArrayDeque();

    /* JADX INFO: renamed from: ܳ */
    public final ArrayDeque f13102 = new ArrayDeque();

    public C5474(HandlerThread handlerThread) {
        this.f13106 = handlerThread;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12104(MediaCodec mediaCodec) {
        C23877.m52960(this.f13109 == null);
        HandlerThread handlerThread = this.f13106;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f13109 = handler;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m12108() {
        synchronized (this.f13108) {
            this.f13107 = true;
            this.f13106.quit();
            m12101();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m12102() {
        synchronized (this.f13108) {
            IllegalStateException illegalStateException = this.f13098;
            if (illegalStateException != null) {
                this.f13098 = null;
                throw illegalStateException;
            }
            MediaCodec.CodecException codecException = this.f13099;
            if (codecException != null) {
                this.f13099 = null;
                throw codecException;
            }
            MediaCodec.CryptoException cryptoException = this.f13100;
            if (cryptoException != null) {
                this.f13100 = null;
                throw cryptoException;
            }
            int iM47495 = -1;
            if (this.f13096 > 0 || this.f13107) {
                return -1;
            }
            if (!this.f13095.m47494()) {
                iM47495 = this.f13095.m47495();
            }
            return iM47495;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m12103(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f13108) {
            IllegalStateException illegalStateException = this.f13098;
            if (illegalStateException != null) {
                this.f13098 = null;
                throw illegalStateException;
            }
            MediaCodec.CodecException codecException = this.f13099;
            if (codecException != null) {
                this.f13099 = null;
                throw codecException;
            }
            MediaCodec.CryptoException cryptoException = this.f13100;
            if (cryptoException != null) {
                this.f13100 = null;
                throw cryptoException;
            }
            if (this.f13096 > 0 || this.f13107) {
                return -1;
            }
            if (this.f13101.m47494()) {
                return -1;
            }
            int iM47495 = this.f13101.m47495();
            if (iM47495 >= 0) {
                C23877.m52958(this.f13105);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f13104.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (iM47495 == -2) {
                this.f13105 = (MediaFormat) this.f13102.remove();
            }
            return iM47495;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final MediaFormat m12107() {
        MediaFormat mediaFormat;
        synchronized (this.f13108) {
            mediaFormat = this.f13105;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12106() {
        synchronized (this.f13108) {
            this.f13096++;
            Handler handler = this.f13109;
            String str = C5792.f14228;
            handler.post(new Runnable() { // from class: l.ۙܰ֫
                @Override // java.lang.Runnable
                public final void run() {
                    C5474.m12100(this.f17699);
                }
            });
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f13108) {
            this.f13095.m47493(i);
            InterfaceC9497 interfaceC9497 = this.f13103;
            if (interfaceC9497 != null) {
                AbstractC17368 abstractC17368 = ((C11335) interfaceC9497).f31563;
                if (abstractC17368.f51824 != null) {
                    abstractC17368.f51824.mo3725();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f13108) {
            MediaFormat mediaFormat = this.f13097;
            if (mediaFormat != null) {
                this.f13101.m47493(-2);
                this.f13102.add(mediaFormat);
                this.f13097 = null;
            }
            this.f13101.m47493(i);
            this.f13104.add(bufferInfo);
            InterfaceC9497 interfaceC9497 = this.f13103;
            if (interfaceC9497 != null) {
                AbstractC17368 abstractC17368 = ((C11335) interfaceC9497).f31563;
                if (abstractC17368.f51824 != null) {
                    abstractC17368.f51824.mo3725();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f13108) {
            this.f13099 = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f13108) {
            this.f13100 = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f13108) {
            this.f13101.m47493(-2);
            this.f13102.add(mediaFormat);
            this.f13097 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12105(InterfaceC9497 interfaceC9497) {
        synchronized (this.f13108) {
            this.f13103 = interfaceC9497;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12100(C5474 c5474) {
        synchronized (c5474.f13108) {
            if (c5474.f13107) {
                return;
            }
            long j = c5474.f13096 - 1;
            c5474.f13096 = j;
            if (j > 0) {
                return;
            }
            if (j < 0) {
                c5474.m12099(new IllegalStateException());
            } else {
                c5474.m12101();
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m12101() {
        ArrayDeque arrayDeque = this.f13102;
        if (!arrayDeque.isEmpty()) {
            this.f13097 = (MediaFormat) arrayDeque.getLast();
        }
        this.f13095.m47492();
        this.f13101.m47492();
        this.f13104.clear();
        arrayDeque.clear();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m12099(IllegalStateException illegalStateException) {
        synchronized (this.f13108) {
            this.f13098 = illegalStateException;
        }
    }
}
