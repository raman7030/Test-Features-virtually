package p067l;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܰ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 82VA */
/* JADX INFO: loaded from: classes3.dex */
public final class C15159 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f43261 = false;

    /* JADX INFO: renamed from: ᩹ */
    public final FileOutputStream f43262;

    public C15159(File file) {
        this.f43262 = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f43262;
        if (this.f43261) {
            return;
        }
        this.f43261 = true;
        flush();
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException e) {
            C21334.m48350("Failed to sync file descriptor:", e);
        }
        fileOutputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f43262.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f43262.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f43262.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f43262.write(bArr, i, i2);
    }
}
