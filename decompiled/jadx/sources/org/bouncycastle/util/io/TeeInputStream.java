package org.bouncycastle.util.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import l.C0794;
import l.InterfaceC14905;

/* JADX INFO: loaded from: classes2.dex */
public class TeeInputStream extends InputStream implements InterfaceC14905 {
    public final InputStream input;
    public final OutputStream output;

    public TeeInputStream(InputStream inputStream, OutputStream outputStream) {
        this.input = inputStream;
        this.output = outputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.input.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.input.close();
        this.output.close();
    }

    public OutputStream getOutputStream() {
        return this.output;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i = this.input.read();
        if (i >= 0) {
            this.output.write(i);
        }
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.input.read(bArr, i, i2);
        if (i3 > 0) {
            this.output.write(bArr, i, i3);
        }
        return i3;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }
}
