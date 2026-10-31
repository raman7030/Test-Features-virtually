package l;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: renamed from: l.᩺ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8R3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23023 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17195 f74101;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final MediaCrypto f74102;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Surface f74103;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8353 f74104;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final MediaFormat f74105;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11735 f74106;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23023 m51161(C17195 c17195, MediaFormat mediaFormat, C8353 c8353, MediaCrypto mediaCrypto, C11735 c11735) {
        return new C23023(c17195, mediaFormat, c8353, null, mediaCrypto, c11735);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23023 m51162(C17195 c17195, MediaFormat mediaFormat, C8353 c8353, Surface surface, MediaCrypto mediaCrypto) {
        return new C23023(c17195, mediaFormat, c8353, surface, mediaCrypto, null);
    }

    public C23023(C17195 c17195, MediaFormat mediaFormat, C8353 c8353, Surface surface, MediaCrypto mediaCrypto, C11735 c11735) {
        this.f74101 = c17195;
        this.f74105 = mediaFormat;
        this.f74104 = c8353;
        this.f74103 = surface;
        this.f74102 = mediaCrypto;
        this.f74106 = c11735;
    }
}
