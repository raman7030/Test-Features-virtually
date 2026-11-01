package com.amazonaws.services.p061s3.internal;

import com.amazonaws.internal.SdkInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class RepeatableFileInputStream extends SdkInputStream {

    /* JADX INFO: renamed from: ۗ */
    public static final Log f1651 = LogFactory.m1469("RepeatableFIS");

    /* JADX INFO: renamed from: ᩶ */
    public FileInputStream f1653;

    /* JADX INFO: renamed from: ᩹ */
    public final File f1655;

    /* JADX INFO: renamed from: ᩸ */
    public long f1654 = 0;

    /* JADX INFO: renamed from: ۙ */
    public long f1652 = 0;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    public RepeatableFileInputStream(File file) {
        this.f1653 = null;
        if (file == null) {
            throw new IllegalArgumentException("File cannot be null");
        }
        this.f1653 = new FileInputStream(file);
        this.f1655 = file;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        this.f1653.close();
        m1448();
        this.f1653 = new FileInputStream(this.f1655);
        long jSkip = this.f1652;
        while (jSkip > 0) {
            jSkip -= this.f1653.skip(jSkip);
        }
        Log log = f1651;
        if (log.mo1459()) {
            log.mo1460("Reset to mark point " + this.f1652 + " after returning " + this.f1654 + " bytes");
        }
        this.f1654 = 0L;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        m1448();
        this.f1652 += this.f1654;
        this.f1654 = 0L;
        Log log = f1651;
        if (log.mo1459()) {
            log.mo1460("Input stream marked at " + this.f1652 + " bytes");
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        m1448();
        return this.f1653.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f1653.close();
        m1448();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        m1448();
        int i = this.f1653.read();
        if (i == -1) {
            return -1;
        }
        this.f1654++;
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        m1448();
        long jSkip = this.f1653.skip(j);
        this.f1654 += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        m1448();
        int i3 = this.f1653.read(bArr, i, i2);
        this.f1654 += (long) i3;
        return i3;
    }

    @Override // com.amazonaws.internal.SdkInputStream
    /* JADX INFO: renamed from: ᩳ */
    public final InputStream mo1381() {
        return this.f1653;
    }
}
