package p067l;

import android.media.MediaDataSource;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۘ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74N */
/* JADX INFO: loaded from: classes3.dex */
public final class C6368 implements InterfaceC9501 {

    /* JADX INFO: renamed from: ᩶ */
    public final C11062 f16489;

    /* JADX INFO: renamed from: ᩸ */
    public final MediaDataSource f16490;

    /* JADX INFO: renamed from: ᩹ */
    public final long f16491;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C6368(MediaDataSource mediaDataSource, long j, C11062 c11062) {
        this.f16490 = mediaDataSource;
        this.f16491 = j;
        this.f16489 = c11062;
    }

    @Override // p067l.InterfaceC9501
    public final long length() {
        return this.f16491;
    }

    @Override // p067l.InterfaceC9501
    /* JADX INFO: renamed from: ۧ */
    public final void mo10697(long j, byte[] bArr, int i, int i2) throws C17766, InterruptedIOException, EOFException {
        C11062 c11062 = this.f16489;
        if (j < 0 || i2 < 0 || j > this.f16491 - ((long) i2)) {
            throw new EOFException("MPEG-TS thumbnail read exceeds source length");
        }
        int i3 = 0;
        while (i3 < i2) {
            C20450.m46140();
            try {
                int at = this.f16490.readAt(((long) i3) + j, bArr, i + i3, i2 - i3);
                if (at <= 0) {
                    C11062.m25474(c11062);
                    throw new C17766(new EOFException("Unexpected end of MPEG-TS thumbnail source"));
                }
                i3 += at;
            } catch (IOException e) {
                C11062.m25474(c11062);
                throw new C17766(e);
            }
        }
    }
}
