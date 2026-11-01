package p067l;

import android.media.MediaDataSource;

/* JADX INFO: renamed from: l.ۛ᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L8GV */
/* JADX INFO: loaded from: classes2.dex */
public final class C8451 extends MediaDataSource {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f22679;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C15826 f22680;

    public C8451(C15826 c15826) {
        this.f22680 = c15826;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        return this.f22680.m35922(j, bArr, i, i2);
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f22680.m35924();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f22679) {
            return;
        }
        this.f22679 = true;
        this.f22680.close();
    }
}
