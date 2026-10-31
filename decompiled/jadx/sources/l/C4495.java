package l;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R8QD */
/* JADX INFO: loaded from: classes3.dex */
public final class C4495 implements InterfaceC13850 {
    @Override // l.InterfaceC13850
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10846 mo13243(C23023 c23023) {
        MediaCodec mediaCodecM13242 = null;
        try {
            mediaCodecM13242 = m13242(c23023);
            Trace.beginSection("configureCodec");
            Surface surface = c23023.f74103;
            mediaCodecM13242.configure(c23023.f74105, surface, c23023.f74102, (surface == null && c23023.f74101.f52728 && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecM13242.start();
            Trace.endSection();
            return new C3084(mediaCodecM13242, c23023.f74106);
        } catch (IOException | RuntimeException e) {
            if (mediaCodecM13242 != null) {
                mediaCodecM13242.release();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static MediaCodec m13242(C23023 c23023) throws IOException {
        String str = c23023.f74101.f52721;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }
}
