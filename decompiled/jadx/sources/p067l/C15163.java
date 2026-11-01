package p067l;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܰ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes3.dex */
public final class C15163 implements Closeable {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f43263;

    /* JADX INFO: renamed from: ᩹ */
    public final MediaDataSource f43264;

    public C15163(MediaDataSource mediaDataSource) {
        this.f43264 = mediaDataSource;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34585(MediaMetadataRetriever mediaMetadataRetriever) throws IOException {
        mediaMetadataRetriever.setDataSource(this.f43264);
        MediaDataSource mediaDataSource = this.f43264;
        if (mediaDataSource instanceof C8339) {
            ((C8339) mediaDataSource).m19266();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f43263) {
            return;
        }
        this.f43263 = true;
        this.f43264.close();
    }
}
