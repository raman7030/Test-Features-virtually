package l;

import android.media.MediaDataSource;

/* JADX INFO: renamed from: l.ۛ᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L8GV */
/* JADX INFO: loaded from: classes2.dex */
public final class C6399 extends MediaDataSource {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f19807;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14159 f19808;

    public C6399(C14159 c14159) {
        this.f19808 = c14159;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        return this.f19808.m33790(j, bArr, i, i2);
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f19808.m33792();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f19807) {
            return;
        }
        this.f19807 = true;
        this.f19808.close();
    }
}
