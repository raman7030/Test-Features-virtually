package l;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: l.۫ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 057Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C12544 extends MediaDataSource {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f37670;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13954 f37671;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    public C12544(C13954 c13954) {
        this.f37671 = c13954;
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
            long j2 = this.f37670;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + ((long) this.f37671.f31333.available())) {
                    return -1;
                }
                this.f37671.seek(j);
                this.f37670 = j;
            }
            if (i2 > this.f37671.f31333.available()) {
                i2 = this.f37671.f31333.available();
            }
            int i3 = this.f37671.read(bArr, i, i2);
            if (i3 >= 0) {
                this.f37670 += (long) i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.f37670 = -1L;
        return -1;
    }
}
