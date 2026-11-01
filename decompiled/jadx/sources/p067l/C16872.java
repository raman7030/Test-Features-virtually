package p067l;

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
public final class C16872 implements InterfaceC12676 {

    /* JADX INFO: renamed from: ֫ */
    public final C5474 f49959;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC18039 f49960;

    /* JADX INFO: renamed from: ܳ */
    public int f49961 = 0;

    /* JADX INFO: renamed from: ܽ */
    public final MediaCodec f49962;

    /* JADX INFO: renamed from: ܿ */
    public final C13521 f49963;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f49964;

    public C16872(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC18039 interfaceC18039, C13521 c13521) {
        this.f49962 = mediaCodec;
        this.f49959 = new C5474(handlerThread);
        this.f49960 = interfaceC18039;
        this.f49963 = c13521;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38435(C16872 c16872, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        C13521 c13521;
        C5474 c5474 = c16872.f49959;
        MediaCodec mediaCodec = c16872.f49962;
        c5474.m12104(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        c16872.f49960.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (c13521 = c16872.f49963) != null) {
            c13521.m30685(mediaCodec);
        }
        c16872.f49961 = 1;
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final void mo11462(int i, int i2, int i3, long j) {
        this.f49960.mo41078(i, i2, i3, j);
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final void mo11464(int i, C7705 c7705, long j, int i2) {
        this.f49960.mo41079(i, c7705, j, i2);
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ܽ */
    public final void mo11472(int i) {
        this.f49962.releaseOutputBuffer(i, false);
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final void mo11463(int i, long j) {
        this.f49962.releaseOutputBuffer(i, j);
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ᩳ */
    public final int mo11473() {
        this.f49960.mo41077();
        return this.f49959.m12102();
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final int mo11459(MediaCodec.BufferInfo bufferInfo) {
        this.f49960.mo41077();
        return this.f49959.m12103(bufferInfo);
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ۧ */
    public final MediaFormat mo11469() {
        return this.f49959.m12107();
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ۧ */
    public final ByteBuffer mo11470(int i) {
        return this.f49962.getInputBuffer(i);
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ᩳ */
    public final ByteBuffer mo11474(int i) {
        return this.f49962.getOutputBuffer(i);
    }

    @Override // p067l.InterfaceC12676
    public final void flush() {
        this.f49960.flush();
        MediaCodec mediaCodec = this.f49962;
        mediaCodec.flush();
        this.f49959.m12106();
        mediaCodec.start();
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final void mo11460() {
        C13521 c13521 = this.f49963;
        MediaCodec mediaCodec = this.f49962;
        try {
            if (this.f49961 == 1) {
                this.f49960.shutdown();
                this.f49959.m12108();
            }
            this.f49961 = 2;
            if (this.f49964) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    mediaCodec.stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && c13521 != null) {
                    c13521.m30686(mediaCodec);
                }
                mediaCodec.release();
                this.f49964 = true;
            }
        } catch (Throwable th) {
            if (!this.f49964) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        mediaCodec.stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && c13521 != null) {
                        c13521.m30686(mediaCodec);
                    }
                    mediaCodec.release();
                    this.f49964 = true;
                }
            }
            throw th;
        }
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final void mo11467(final InterfaceC3958 interfaceC3958, Handler handler) {
        this.f49962.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(this) { // from class: l.֡ܰ֫
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                interfaceC3958.mo7906(j);
            }
        }, handler);
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo11468(InterfaceC9497 interfaceC9497) {
        this.f49959.m12105(interfaceC9497);
        return true;
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final void mo11466(Surface surface) {
        this.f49962.setOutputSurface(surface);
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ܽ */
    public final void mo11471() {
        this.f49962.detachOutputSurface();
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final void mo11465(Bundle bundle) {
        this.f49960.mo41080(bundle);
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final void mo11461(int i) {
        this.f49962.setVideoScalingMode(i);
    }

    /* JADX INFO: renamed from: ܿ */
    public static String m38437(int i) {
        return m38434(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: renamed from: ܳ */
    public static String m38436(int i) {
        return m38434(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m38434(int i, String str) {
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
