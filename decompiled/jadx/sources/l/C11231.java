package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۧ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6SW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11231 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream f33675;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f33676;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f33678 = new byte[8];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f33677 = true;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C11231(long j, InputStream inputStream) {
        this.f33675 = inputStream;
        this.f33676 = j;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (!this.f33677) {
            throw new IOException("Legacy app state field is closed");
        }
        if (this.f33676 == 0) {
            return -1;
        }
        int i = this.f33675.read();
        if (i < 0) {
            throw new EOFException("Truncated legacy app state field");
        }
        this.f33676--;
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C11003.checkFromIndexSize(i, i2, bArr.length);
        if (!this.f33677) {
            throw new IOException("Legacy app state field is closed");
        }
        if (i2 == 0) {
            return 0;
        }
        long j = this.f33676;
        if (j == 0) {
            return -1;
        }
        int iMin = (int) Math.min(i2, j);
        int i3 = this.f33675.read(bArr, i, iMin);
        if (i3 <= 0 || i3 > iMin) {
            throw new EOFException("Truncated or stalled legacy app state field");
        }
        this.f33676 -= (long) i3;
        return i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12951 m27796(int i) throws EOFException {
        if (i > this.f33676) {
            throw new EOFException("Truncated legacy app state number");
        }
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f33678;
            if (i2 == i) {
                return new C12951(bArr);
            }
            i2 += read(bArr, i2, i - i2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27795() {
        return m27796(4).readInt();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f33677 = false;
    }
}
