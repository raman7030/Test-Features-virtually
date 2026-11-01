package p067l;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;

/* JADX INFO: renamed from: l.۠ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: F8QV */
/* JADX INFO: loaded from: classes3.dex */
public final class C10168 implements InterfaceC15531 {

    /* JADX INFO: renamed from: ֫ */
    public final C7486 f28129;

    /* JADX INFO: renamed from: ۧ */
    public final C3462 f28130;

    public C10168(C7486 c7486, C3462 c3462) {
        this.f28129 = c7486;
        this.f28130 = c3462;
    }

    @Override // p067l.InterfaceC15531
    /* JADX INFO: renamed from: ֫ */
    public final C16872 mo15126(C24249 c24249) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = c24249.f76840.f55902;
        C16872 c16872 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                C16872 c16873 = new C16872(mediaCodecCreateByCodecName, (HandlerThread) this.f28129.get(), new C21568(mediaCodecCreateByCodecName, (HandlerThread) this.f28130.get()), c24249.f76845);
                try {
                    Trace.endSection();
                    Surface surface = c24249.f76842;
                    C16872.m38435(c16873, c24249.f76844, surface, c24249.f76841, (surface == null && c24249.f76840.f55909 && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                    return c16873;
                } catch (Exception e) {
                    e = e;
                    c16872 = c16873;
                    if (c16872 != null) {
                        c16872.mo11460();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }
}
