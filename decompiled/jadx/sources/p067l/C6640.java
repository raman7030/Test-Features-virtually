package p067l;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R8QD */
/* JADX INFO: loaded from: classes3.dex */
public final class C6640 implements InterfaceC15531 {
    @Override // p067l.InterfaceC15531
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12676 mo15126(C24249 c24249) {
        MediaCodec mediaCodecM15125 = null;
        try {
            mediaCodecM15125 = m15125(c24249);
            Trace.beginSection("configureCodec");
            Surface surface = c24249.f76842;
            mediaCodecM15125.configure(c24249.f76844, surface, c24249.f76841, (surface == null && c24249.f76840.f55909 && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecM15125.start();
            Trace.endSection();
            return new C5299(mediaCodecM15125, c24249.f76845);
        } catch (IOException | RuntimeException e) {
            if (mediaCodecM15125 != null) {
                mediaCodecM15125.release();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static MediaCodec m15125(C24249 c24249) throws IOException {
        String str = c24249.f76840.f55902;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }
}
