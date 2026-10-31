package l;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;

/* JADX INFO: renamed from: l.۠ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: F8QV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8207 implements InterfaceC13850 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5385 f25219;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1151 f25220;

    public C8207(C5385 c5385, C1151 c1151) {
        this.f25219 = c5385;
        this.f25220 = c1151;
    }

    @Override // l.InterfaceC13850
    /* JADX INFO: renamed from: ֫ */
    public final C15261 mo13243(C23023 c23023) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = c23023.f74101.f52721;
        C15261 c15261 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                C15261 c15262 = new C15261(mediaCodecCreateByCodecName, (HandlerThread) this.f25219.get(), new C20202(mediaCodecCreateByCodecName, (HandlerThread) this.f25220.get()), c23023.f74106);
                try {
                    Trace.endSection();
                    Surface surface = c23023.f74103;
                    C15261.m36274(c15262, c23023.f74105, surface, c23023.f74102, (surface == null && c23023.f74101.f52728 && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                    return c15262;
                } catch (Exception e) {
                    e = e;
                    c15261 = c15262;
                    if (c15261 != null) {
                        c15261.mo9417();
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
