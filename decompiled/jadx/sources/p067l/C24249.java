package p067l;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: renamed from: l.᩺ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8R3 */
/* JADX INFO: loaded from: classes.dex */
public final class C24249 {

    /* JADX INFO: renamed from: ֫ */
    public final C18710 f76840;

    /* JADX INFO: renamed from: ۧ */
    public final MediaCrypto f76841;

    /* JADX INFO: renamed from: ܳ */
    public final Surface f76842;

    /* JADX INFO: renamed from: ܽ */
    public final C10307 f76843;

    /* JADX INFO: renamed from: ܿ */
    public final MediaFormat f76844;

    /* JADX INFO: renamed from: ᩳ */
    public final C13521 f76845;

    /* JADX INFO: renamed from: ֫ */
    public static C24249 m53554(C18710 c18710, MediaFormat mediaFormat, C10307 c10307, MediaCrypto mediaCrypto, C13521 c13521) {
        return new C24249(c18710, mediaFormat, c10307, null, mediaCrypto, c13521);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24249 m53555(C18710 c18710, MediaFormat mediaFormat, C10307 c10307, Surface surface, MediaCrypto mediaCrypto) {
        return new C24249(c18710, mediaFormat, c10307, surface, mediaCrypto, null);
    }

    public C24249(C18710 c18710, MediaFormat mediaFormat, C10307 c10307, Surface surface, MediaCrypto mediaCrypto, C13521 c13521) {
        this.f76840 = c18710;
        this.f76844 = mediaFormat;
        this.f76843 = c10307;
        this.f76842 = surface;
        this.f76841 = mediaCrypto;
        this.f76845 = c13521;
    }
}
