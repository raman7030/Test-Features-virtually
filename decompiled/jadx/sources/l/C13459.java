package l;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܰ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 82VA */
/* JADX INFO: loaded from: classes3.dex */
public final class C13459 extends OutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f40191 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final FileOutputStream f40192;

    public C13459(File file) {
        this.f40192 = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f40192;
        if (this.f40191) {
            return;
        }
        this.f40191 = true;
        flush();
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException e) {
            C19956.m46036("Failed to sync file descriptor:", e);
        }
        fileOutputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f40192.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f40192.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f40192.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f40192.write(bArr, i, i2);
    }
}
