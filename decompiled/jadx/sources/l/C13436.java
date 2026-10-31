package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۬᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: E1TJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13436 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InputStream f40148;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19996 f40149;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public IOException f40150 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f40147 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C13436(InputStream inputStream, int i) {
        inputStream.getClass();
        this.f40148 = inputStream;
        this.f40149 = new C19996(i);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f40147;
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
        InputStream inputStream = this.f40148;
        if (inputStream == null) {
            throw new C2357("Stream closed");
        }
        IOException iOException = this.f40150;
        if (iOException != null) {
            throw iOException;
        }
        try {
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 == -1) {
                return -1;
            }
            this.f40149.m46102(i, i3, bArr);
            return i3;
        } catch (IOException e) {
            this.f40150 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        InputStream inputStream = this.f40148;
        if (inputStream == null) {
            throw new C2357("Stream closed");
        }
        IOException iOException = this.f40150;
        if (iOException != null) {
            throw iOException;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.f40148;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f40148 = null;
            }
        }
    }
}
