package p067l;

import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۚۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes2.dex */
public final class C7256 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public final MediaMetadataRetriever f18921 = new MediaMetadataRetriever();

    /* JADX INFO: renamed from: ֫ */
    public final void m16613(MediaDataSource mediaDataSource) {
        this.f18921.setDataSource(mediaDataSource);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Bitmap m16611(int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        MediaMetadataRetriever mediaMetadataRetriever = this.f18921;
        if (i3 >= 27) {
            return mediaMetadataRetriever.getScaledFrameAtTime(-1L, 2, i, i2);
        }
        return C6585.m15043(mediaMetadataRetriever.getFrameAtTime(-1L, 2), i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m16612(int i) {
        return this.f18921.extractMetadata(i);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f18921.release();
    }
}
