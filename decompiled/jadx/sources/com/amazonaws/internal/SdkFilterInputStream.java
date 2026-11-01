package com.amazonaws.internal;

import com.amazonaws.AbortedException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import p067l.C3123;
import p067l.InterfaceC16534;

/* JADX INFO: loaded from: classes.dex */
public class SdkFilterInputStream extends FilterInputStream implements MetricAware, InterfaceC16534 {
    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        m1447();
        ((FilterInputStream) this).in.mark(i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        m1447();
        ((FilterInputStream) this).in.reset();
    }

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo1446() {
    }

    @Override // com.amazonaws.internal.MetricAware
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1445() {
        if (((FilterInputStream) this).in instanceof MetricAware) {
            return ((MetricAware) ((FilterInputStream) this).in).mo1445();
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m1447() {
        if (Thread.interrupted()) {
            mo1446();
            throw new AbortedException();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        m1447();
        return ((FilterInputStream) this).in.read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        m1447();
        return ((FilterInputStream) this).in.read(bArr, i, i2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        m1447();
        return ((FilterInputStream) this).in.skip(j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        m1447();
        return ((FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterInputStream) this).in.close();
        m1447();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        m1447();
        return ((FilterInputStream) this).in.markSupported();
    }
}
