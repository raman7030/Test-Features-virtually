package p067l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۗ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R8QD */
/* JADX INFO: loaded from: classes2.dex */
public final class C5299 implements InterfaceC12676 {

    /* JADX INFO: renamed from: ֫ */
    public final MediaCodec f12461;

    /* JADX INFO: renamed from: ۧ */
    public final C13521 f12462;

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ boolean mo11468(InterfaceC9497 interfaceC9497) {
        return false;
    }

    public C5299(MediaCodec mediaCodec, C13521 c13521) {
        this.f12461 = mediaCodec;
        this.f12462 = c13521;
        if (Build.VERSION.SDK_INT < 35 || c13521 == null) {
            return;
        }
        c13521.m30685(mediaCodec);
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ᩳ */
    public final int mo11473() {
        return this.f12461.dequeueInputBuffer(0L);
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final int mo11459(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f12461.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ۧ */
    public final MediaFormat mo11469() {
        return this.f12461.getOutputFormat();
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ۧ */
    public final ByteBuffer mo11470(int i) {
        return this.f12461.getInputBuffer(i);
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ᩳ */
    public final ByteBuffer mo11474(int i) {
        return this.f12461.getOutputBuffer(i);
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final void mo11462(int i, int i2, int i3, long j) {
        this.f12461.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final void mo11464(int i, C7705 c7705, long j, int i2) {
        this.f12461.queueSecureInputBuffer(i, 0, c7705.m17839(), j, i2);
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ܽ */
    public final void mo11472(int i) {
        this.f12461.releaseOutputBuffer(i, false);
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final void mo11463(int i, long j) {
        this.f12461.releaseOutputBuffer(i, j);
    }

    @Override // p067l.InterfaceC12676
    public final void flush() {
        this.f12461.flush();
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final void mo11460() {
        C13521 c13521 = this.f12462;
        MediaCodec mediaCodec = this.f12461;
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
        }
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final void mo11467(final InterfaceC3958 interfaceC3958, Handler handler) {
        this.f12461.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(this) { // from class: l.᩶۟֫
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                interfaceC3958.mo7906(j);
            }
        }, handler);
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final void mo11466(Surface surface) {
        this.f12461.setOutputSurface(surface);
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ܽ */
    public final void mo11471() {
        this.f12461.detachOutputSurface();
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final void mo11465(Bundle bundle) {
        this.f12461.setParameters(bundle);
    }

    @Override // p067l.InterfaceC12676
    /* JADX INFO: renamed from: ֫ */
    public final void mo11461(int i) {
        this.f12461.setVideoScalingMode(i);
    }
}
