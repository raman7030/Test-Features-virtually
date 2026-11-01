package p067l;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: l.۠ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C10211 extends MediaDataSource {

    /* JADX INFO: renamed from: ᩸ */
    public final C24618 f28307;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f28308;

    public C10211(C24618 c24618, boolean z) {
        this.f28307 = c24618;
        this.f28308 = z;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        int iMo23140;
        synchronized (this.f28307) {
            this.f28307.seek(j);
            iMo23140 = this.f28307.mo23140(i, i2, bArr);
        }
        return iMo23140;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f28307.length();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f28308) {
            this.f28307.close();
        }
    }
}
