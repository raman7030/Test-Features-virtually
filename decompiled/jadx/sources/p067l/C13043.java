package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۧ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6SW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13043 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۙ */
    public final InputStream f36674;

    /* JADX INFO: renamed from: ᩶ */
    public long f36675;

    /* JADX INFO: renamed from: ᩹ */
    public final byte[] f36677 = new byte[8];

    /* JADX INFO: renamed from: ᩸ */
    public boolean f36676 = true;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C13043(long j, InputStream inputStream) {
        this.f36674 = inputStream;
        this.f36675 = j;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (!this.f36676) {
            throw new IOException("Legacy app state field is closed");
        }
        if (this.f36675 == 0) {
            return -1;
        }
        int i = this.f36674.read();
        if (i < 0) {
            throw new EOFException("Truncated legacy app state field");
        }
        this.f36675--;
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C12826.checkFromIndexSize(i, i2, bArr.length);
        if (!this.f36676) {
            throw new IOException("Legacy app state field is closed");
        }
        if (i2 == 0) {
            return 0;
        }
        long j = this.f36675;
        if (j == 0) {
            return -1;
        }
        int iMin = (int) Math.min(i2, j);
        int i3 = this.f36674.read(bArr, i, iMin);
        if (i3 <= 0 || i3 > iMin) {
            throw new EOFException("Truncated or stalled legacy app state field");
        }
        this.f36675 -= (long) i3;
        return i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14677 m29858(int i) throws EOFException {
        if (i > this.f36675) {
            throw new EOFException("Truncated legacy app state number");
        }
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f36677;
            if (i2 == i) {
                return new C14677(bArr);
            }
            i2 += read(bArr, i2, i - i2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m29857() {
        return m29858(4).readInt();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f36676 = false;
    }
}
