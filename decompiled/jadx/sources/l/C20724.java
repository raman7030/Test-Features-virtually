package l;

import android.media.MediaCodec;

/* JADX INFO: renamed from: l.᩷۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8Q2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20724 extends Exception {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f66733;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f66734;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C17195 f66735;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f66736;

    public C20724(C8353 c8353, C5201 c5201, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + c8353, c5201, c8353.f25614, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public C20724(C8353 c8353, Exception exc, boolean z, C17195 c17195) {
        this("Decoder init failed: " + c17195.f52721 + ", " + c8353, exc, c8353.f25614, z, c17195, exc instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) exc).getDiagnosticInfo() : null);
    }

    public C20724(String str, Throwable th, String str2, boolean z, C17195 c17195, String str3) {
        super(str, th);
        this.f66734 = str2;
        this.f66733 = z;
        this.f66735 = c17195;
        this.f66736 = str3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20724 m47330(C20724 c20724) {
        return new C20724(c20724.getMessage(), c20724.getCause(), c20724.f66734, c20724.f66733, c20724.f66735, c20724.f66736);
    }
}
