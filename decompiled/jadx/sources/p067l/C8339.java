package p067l;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P74O */
/* JADX INFO: loaded from: classes2.dex */
public final class C8339 extends MediaDataSource {

    /* JADX INFO: renamed from: ᩶ */
    public volatile IOException f22306;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC9501 f22307;

    /* JADX INFO: renamed from: ᩹ */
    public final long f22308;

    public C8339(InterfaceC9501 interfaceC9501) {
        long length = interfaceC9501.length();
        if (length < 0) {
            throw new IllegalArgumentException("Media handle length must be known");
        }
        this.f22307 = interfaceC9501;
        this.f22308 = length;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0 || i2 < 0) {
            return -1;
        }
        long j2 = this.f22308;
        if (j >= j2) {
            return -1;
        }
        int iMin = (int) Math.min(i2, j2 - j);
        try {
            this.f22307.mo10697(j, bArr, i, iMin);
            return iMin;
        } catch (IOException e) {
            synchronized (this) {
                if (this.f22306 == null) {
                    this.f22306 = e;
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19266() throws IOException {
        IOException iOException = this.f22306;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f22308;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f22307.close();
    }
}
