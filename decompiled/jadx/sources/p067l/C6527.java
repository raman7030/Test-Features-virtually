package p067l;

import android.media.MediaMetadataRetriever;

/* JADX INFO: renamed from: l.ۙۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6527 {

    /* JADX INFO: renamed from: ֫ */
    public final int f16870;

    /* JADX INFO: renamed from: ۧ */
    public final C18655 f16871;

    /* JADX INFO: renamed from: ܽ */
    public final MediaMetadataRetriever f16872;

    /* JADX INFO: renamed from: ܽ */
    public static void m14964(C6527 c6527) {
        c6527.getClass();
        try {
            c6527.f16872.release();
        } catch (Throwable unused) {
        }
        C2700.m4192(c6527.f16871);
    }

    public C6527(int i, MediaMetadataRetriever mediaMetadataRetriever, C18655 c18655) {
        this.f16870 = i;
        this.f16872 = mediaMetadataRetriever;
        this.f16871 = c18655;
    }
}
