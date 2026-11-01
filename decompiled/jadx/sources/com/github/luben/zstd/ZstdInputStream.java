package com.github.luben.zstd;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p067l.C3123;
import p067l.InterfaceC16534;

/* JADX INFO: loaded from: classes.dex */
public class ZstdInputStream extends FilterInputStream implements InterfaceC16534 {
    public ZstdInputStreamNoFinalizer inner;

    @Deprecated
    public void setFinalize(boolean z) {
    }

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public ZstdInputStream(InputStream inputStream) {
        super(inputStream);
        this.inner = new ZstdInputStreamNoFinalizer(inputStream);
    }

    public ZstdInputStream(InputStream inputStream, BufferPool bufferPool) {
        super(inputStream);
        this.inner = new ZstdInputStreamNoFinalizer(inputStream, bufferPool);
    }

    public void finalize() {
        close();
    }

    public static long recommendedDInSize() {
        return ZstdInputStreamNoFinalizer.recommendedDInSize();
    }

    public static long recommendedDOutSize() {
        return ZstdInputStreamNoFinalizer.recommendedDOutSize();
    }

    public ZstdInputStream setContinuous(boolean z) {
        this.inner.setContinuous(z);
        return this;
    }

    public boolean getContinuous() {
        return this.inner.getContinuous();
    }

    public ZstdInputStream setDict(byte[] bArr) {
        this.inner.setDict(bArr);
        return this;
    }

    public ZstdInputStream setDict(ZstdDictDecompress zstdDictDecompress) {
        this.inner.setDict(zstdDictDecompress);
        return this;
    }

    public ZstdInputStream setLongMax(int i) {
        this.inner.setLongMax(i);
        return this;
    }

    public ZstdInputStream setRefMultipleDDicts(boolean z) {
        this.inner.setRefMultipleDDicts(z);
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return this.inner.read(bArr, i, i2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        return this.inner.read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.inner.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        return this.inner.skip(j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return this.inner.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inner.close();
    }
}
