package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۬᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: E1TJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15138 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩶ */
    public InputStream f43219;

    /* JADX INFO: renamed from: ᩸ */
    public final C21372 f43220;

    /* JADX INFO: renamed from: ᩹ */
    public IOException f43221 = null;

    /* JADX INFO: renamed from: ۙ */
    public final byte[] f43218 = new byte[1];

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C15138(InputStream inputStream, int i) {
        inputStream.getClass();
        this.f43219 = inputStream;
        this.f43220 = new C21372(i);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f43218;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.f43219;
        if (inputStream == null) {
            throw new C4608("Stream closed");
        }
        IOException iOException = this.f43221;
        if (iOException != null) {
            throw iOException;
        }
        try {
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 == -1) {
                return -1;
            }
            this.f43220.m48417(i, i3, bArr);
            return i3;
        } catch (IOException e) {
            this.f43221 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        InputStream inputStream = this.f43219;
        if (inputStream == null) {
            throw new C4608("Stream closed");
        }
        IOException iOException = this.f43221;
        if (iOException != null) {
            throw iOException;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.f43219;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f43219 = null;
            }
        }
    }
}
