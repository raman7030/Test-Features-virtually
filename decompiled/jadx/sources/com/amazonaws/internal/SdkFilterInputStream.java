package com.amazonaws.internal;

import com.amazonaws.AbortedException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import l.C0794;
import l.InterfaceC14905;

/* JADX INFO: loaded from: classes.dex */
public class SdkFilterInputStream extends FilterInputStream implements MetricAware, InterfaceC14905 {
    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        m281();
        ((FilterInputStream) this).in.mark(i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        m281();
        ((FilterInputStream) this).in.reset();
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo280() {
    }

    @Override // com.amazonaws.internal.MetricAware
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public boolean mo279() {
        if (((FilterInputStream) this).in instanceof MetricAware) {
            return ((MetricAware) ((FilterInputStream) this).in).mo279();
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m281() {
        if (Thread.interrupted()) {
            mo280();
            throw new AbortedException();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        m281();
        return ((FilterInputStream) this).in.read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        m281();
        return ((FilterInputStream) this).in.read(bArr, i, i2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        m281();
        return ((FilterInputStream) this).in.skip(j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        m281();
        return ((FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterInputStream) this).in.close();
        m281();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        m281();
        return ((FilterInputStream) this).in.markSupported();
    }
}
