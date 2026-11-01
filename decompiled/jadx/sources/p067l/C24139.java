package p067l;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U17E */
/* JADX INFO: loaded from: classes.dex */
public final class C24139 extends MediaDataSource {

    /* JADX INFO: renamed from: ᩸ */
    public final long f76572;

    /* JADX INFO: renamed from: ᩹ */
    public final C24618 f76573;

    public C24139(AbstractC17043 abstractC17043) {
        C24618 c24618M38671 = abstractC17043.m38671("r");
        this.f76573 = c24618M38671;
        this.f76572 = c24618M38671.length();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        int i3;
        synchronized (this.f76573) {
            this.f76573.seek(j);
            i3 = this.f76573.read(bArr, i, i2);
        }
        return i3;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f76572;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f76573.close();
    }
}
