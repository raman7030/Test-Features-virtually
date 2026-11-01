package p067l;

import android.media.MediaCodec;

/* JADX INFO: renamed from: l.᩷۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8Q2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22064 extends Exception {

    /* JADX INFO: renamed from: ۙ */
    public final boolean f69414;

    /* JADX INFO: renamed from: ᩶ */
    public final String f69415;

    /* JADX INFO: renamed from: ᩸ */
    public final C18710 f69416;

    /* JADX INFO: renamed from: ᩹ */
    public final String f69417;

    public C22064(C10307 c10307, C7311 c7311, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + c10307, c7311, c10307.f28528, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public C22064(C10307 c10307, Exception exc, boolean z, C18710 c18710) {
        this("Decoder init failed: " + c18710.f55902 + ", " + c10307, exc, c10307.f28528, z, c18710, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : null);
    }

    public C22064(String str, Throwable th, String str2, boolean z, C18710 c18710, String str3) {
        super(str, th);
        this.f69415 = str2;
        this.f69414 = z;
        this.f69416 = c18710;
        this.f69417 = str3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22064 m49657(C22064 c22064) {
        return new C22064(c22064.getMessage(), c22064.getCause(), c22064.f69415, c22064.f69414, c22064.f69416, c22064.f69417);
    }
}
