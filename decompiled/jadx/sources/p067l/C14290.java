package p067l;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: l.۫ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 057Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C14290 extends MediaDataSource {

    /* JADX INFO: renamed from: ᩸ */
    public long f40696;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C15630 f40697;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    public C14290(C15630 c15630) {
        this.f40697 = c15630;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.f40696;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + ((long) this.f40697.f34297.available())) {
                    return -1;
                }
                this.f40697.seek(j);
                this.f40696 = j;
            }
            if (i2 > this.f40697.f34297.available()) {
                i2 = this.f40697.f34297.available();
            }
            int i3 = this.f40697.read(bArr, i, i2);
            if (i3 >= 0) {
                this.f40696 += (long) i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.f40696 = -1L;
        return -1;
    }
}
