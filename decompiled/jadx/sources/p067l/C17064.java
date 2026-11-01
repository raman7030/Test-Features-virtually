package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;

/* JADX INFO: renamed from: l.ܶ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6SP */
/* JADX INFO: loaded from: classes4.dex */
public final class C17064 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public int f50457;

    /* JADX INFO: renamed from: ᩹ */
    public final PushbackInputStream f50458;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C17064(PushbackInputStream pushbackInputStream, int i) {
        this.f50458 = pushbackInputStream;
        this.f50457 = i;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f50457 == 0) {
            return -1;
        }
        int iM51517 = C23101.m51517((InputStream) this.f50458);
        this.f50457--;
        return iM51517;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f50457;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.f50458.read(bArr, i, Math.min(i2, i3));
        if (i4 < 0) {
            throw new EOFException("Truncated legacy compression block");
        }
        if (i4 <= 0) {
            throw new IOException("Legacy compression block read made no progress");
        }
        this.f50457 -= i4;
        return i4;
    }

    @Override // java.io.InputStream
    public final int available() {
        return Math.min(this.f50457, this.f50458.available());
    }
}
