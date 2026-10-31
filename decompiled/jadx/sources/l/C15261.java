package l;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.google.android.material.motion.MotionUtils;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܶܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: F8QV */
/* JADX INFO: loaded from: classes4.dex */
public final class C15261 implements InterfaceC10846 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3268 f46835;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16489 f46836;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f46837 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final MediaCodec f46838;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C11735 f46839;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f46840;

    public C15261(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC16489 interfaceC16489, C11735 c11735) {
        this.f46838 = mediaCodec;
        this.f46835 = new C3268(handlerThread);
        this.f46836 = interfaceC16489;
        this.f46839 = c11735;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36274(C15261 c15261, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        C11735 c11735;
        C3268 c3268 = c15261.f46835;
        MediaCodec mediaCodec = c15261.f46838;
        c3268.m10071(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        c15261.f46836.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (c11735 = c15261.f46839) != null) {
            c11735.m28637(mediaCodec);
        }
        c15261.f46837 = 1;
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫ */
    public final void mo9419(int i, int i2, int i3, long j) {
        this.f46836.mo38852(i, i2, i3, j);
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫ */
    public final void mo9421(int i, C5615 c5615, long j, int i2) {
        this.f46836.mo38853(i, c5615, j, i2);
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ܽ */
    public final void mo9429(int i) {
        this.f46838.releaseOutputBuffer(i, false);
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫ */
    public final void mo9420(int i, long j) {
        this.f46838.releaseOutputBuffer(i, j);
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ᩳ */
    public final int mo9430() {
        this.f46836.mo38851();
        return this.f46835.m10069();
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫ */
    public final int mo9416(MediaCodec.BufferInfo bufferInfo) {
        this.f46836.mo38851();
        return this.f46835.m10070(bufferInfo);
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ۧ */
    public final MediaFormat mo9426() {
        return this.f46835.m10074();
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ۧ */
    public final ByteBuffer mo9427(int i) {
        return this.f46838.getInputBuffer(i);
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ᩳ */
    public final ByteBuffer mo9431(int i) {
        return this.f46838.getOutputBuffer(i);
    }

    @Override // l.InterfaceC10846
    public final void flush() {
        this.f46836.flush();
        MediaCodec mediaCodec = this.f46838;
        mediaCodec.flush();
        this.f46835.m10073();
        mediaCodec.start();
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫ */
    public final void mo9417() {
        C11735 c11735 = this.f46839;
        MediaCodec mediaCodec = this.f46838;
        try {
            if (this.f46837 == 1) {
                this.f46836.shutdown();
                this.f46835.m10075();
            }
            this.f46837 = 2;
            if (this.f46840) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    mediaCodec.stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && c11735 != null) {
                    c11735.m28638(mediaCodec);
                }
                mediaCodec.release();
                this.f46840 = true;
            }
        } catch (Throwable th) {
            if (!this.f46840) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        mediaCodec.stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && c11735 != null) {
                        c11735.m28638(mediaCodec);
                    }
                    mediaCodec.release();
                    this.f46840 = true;
                }
            }
            throw th;
        }
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫ */
    public final void mo9424(final InterfaceC1673 interfaceC1673, Handler handler) {
        this.f46838.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(this) { // from class: l.֡ܰ֫
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                interfaceC1673.mo5676(j);
            }
        }, handler);
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9425(InterfaceC7501 interfaceC7501) {
        this.f46835.m10072(interfaceC7501);
        return true;
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫ */
    public final void mo9423(Surface surface) {
        this.f46838.setOutputSurface(surface);
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ܽ */
    public final void mo9428() {
        this.f46838.detachOutputSurface();
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫ */
    public final void mo9422(Bundle bundle) {
        this.f46836.mo38854(bundle);
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫ */
    public final void mo9418(int i) {
        this.f46838.setVideoScalingMode(i);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m36276(int i) {
        return m36273(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m36275(int i) {
        return m36273(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36273(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        }
        return sb.toString();
    }
}
