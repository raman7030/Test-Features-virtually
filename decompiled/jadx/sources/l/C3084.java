package l;

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
public final class C3084 implements InterfaceC10846 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MediaCodec f9658;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11735 f9659;

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean mo9425(InterfaceC7501 interfaceC7501) {
        return false;
    }

    public C3084(MediaCodec mediaCodec, C11735 c11735) {
        this.f9658 = mediaCodec;
        this.f9659 = c11735;
        if (Build.VERSION.SDK_INT < 35 || c11735 == null) {
            return;
        }
        c11735.m28637(mediaCodec);
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo9430() {
        return this.f9658.dequeueInputBuffer(0L);
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo9416(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f9658.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final MediaFormat mo9426() {
        return this.f9658.getOutputFormat();
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer mo9427(int i) {
        return this.f9658.getInputBuffer(i);
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer mo9431(int i) {
        return this.f9658.getOutputBuffer(i);
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9419(int i, int i2, int i3, long j) {
        this.f9658.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9421(int i, C5615 c5615, long j, int i2) {
        this.f9658.queueSecureInputBuffer(i, 0, c5615.m15918(), j, i2);
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo9429(int i) {
        this.f9658.releaseOutputBuffer(i, false);
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9420(int i, long j) {
        this.f9658.releaseOutputBuffer(i, j);
    }

    @Override // l.InterfaceC10846
    public final void flush() {
        this.f9658.flush();
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9417() {
        C11735 c11735 = this.f9659;
        MediaCodec mediaCodec = this.f9658;
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
        }
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9424(final InterfaceC1673 interfaceC1673, Handler handler) {
        this.f9658.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(this) { // from class: l.᩶۟֫
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                interfaceC1673.mo5676(j);
            }
        }, handler);
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9423(Surface surface) {
        this.f9658.setOutputSurface(surface);
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo9428() {
        this.f9658.detachOutputSurface();
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9422(Bundle bundle) {
        this.f9658.setParameters(bundle);
    }

    @Override // l.InterfaceC10846
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9418(int i) {
        this.f9658.setVideoScalingMode(i);
    }
}
