package l;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U17E */
/* JADX INFO: loaded from: classes.dex */
public final class C22907 extends MediaDataSource {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f73842;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23411 f73843;

    public C22907(AbstractC15440 abstractC15440) {
        C23411 c23411M36513 = abstractC15440.m36513("r");
        this.f73843 = c23411M36513;
        this.f73842 = c23411M36513.length();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        int i3;
        synchronized (this.f73843) {
            this.f73843.seek(j);
            i3 = this.f73843.read(bArr, i, i2);
        }
        return i3;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f73842;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f73843.close();
    }
}
