package p067l;

import android.os.Handler;
import android.os.Trace;
import androidx.media3.decoder.ffmpeg.FfmpegAudioDecoder;
import androidx.media3.decoder.ffmpeg.FfmpegLibrary;

/* JADX INFO: renamed from: l.ۛ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8F6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8375 extends AbstractC15493 {
    @Override // p067l.InterfaceC4114, p067l.InterfaceC19537
    public final String getName() {
        return "FfmpegAudioRenderer";
    }

    @Override // p067l.AbstractC7054, p067l.InterfaceC19537
    /* JADX INFO: renamed from: ᩵ */
    public final int mo16265() {
        return 8;
    }

    @Override // p067l.AbstractC15493
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC3681 mo19508(C10307 c10307) {
        Trace.beginSection("createFfmpegAudioDecoder");
        int i = c10307.f28515;
        int i2 = c10307.f28538;
        int i3 = c10307.f28539;
        if (i == -1) {
            i = 5760;
        }
        boolean zEquals = true;
        if (m35259(C5792.m13025(2, i3, i2))) {
            zEquals = m35258(C5792.m13025(4, i3, i2)) != 2 ? false : true ^ "audio/ac3".equals(c10307.f28528);
        }
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(i, c10307, zEquals);
        Trace.endSection();
        return ffmpegAudioDecoder;
    }

    @Override // p067l.AbstractC15493
    /* JADX INFO: renamed from: ֫ */
    public final C10307 mo19507(InterfaceC3681 interfaceC3681) {
        FfmpegAudioDecoder ffmpegAudioDecoder = (FfmpegAudioDecoder) interfaceC3681;
        ffmpegAudioDecoder.getClass();
        C3601 c3601 = new C3601();
        c3601.m6697("audio/raw");
        c3601.m6704(ffmpegAudioDecoder.m14());
        c3601.m6688(ffmpegAudioDecoder.m13());
        c3601.m6707(ffmpegAudioDecoder.m17());
        return c3601.m6672();
    }

    public C8375() {
        C22143 c22143 = new C22143(C7050.m16232());
        c22143.m49951(new InterfaceC2418[0]);
        this(null, null, c22143.m49950());
    }

    public C8375(Handler handler, InterfaceC7448 interfaceC7448, InterfaceC6777 interfaceC6777) {
        super(handler, interfaceC7448, interfaceC6777);
    }

    @Override // p067l.AbstractC15493
    /* JADX INFO: renamed from: ܿ */
    public final int mo19509(C10307 c10307) {
        String str = c10307.f28528;
        int i = c10307.f28538;
        int i2 = c10307.f28539;
        str.getClass();
        if (!FfmpegLibrary.m22() || !C11669.m26825(str)) {
            return 0;
        }
        if (!FfmpegLibrary.m21(c10307)) {
            return 1;
        }
        if (m35259(C5792.m13025(2, i2, i)) || m35259(C5792.m13025(4, i2, i))) {
            return c10307.f28546 != 0 ? 2 : 4;
        }
        return 1;
    }
}
