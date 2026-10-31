package l;

import android.media.MediaMetadataRetriever;

/* JADX INFO: renamed from: l.ۙۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4376 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f14055;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17137 f14056;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final MediaMetadataRetriever f14057;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m13100(C4376 c4376) {
        c4376.getClass();
        try {
            c4376.f14057.release();
        } catch (Throwable unused) {
        }
        C0349.m1793(c4376.f14056);
    }

    public C4376(int i, MediaMetadataRetriever mediaMetadataRetriever, C17137 c17137) {
        this.f14055 = i;
        this.f14057 = mediaMetadataRetriever;
        this.f14056 = c17137;
    }
}
