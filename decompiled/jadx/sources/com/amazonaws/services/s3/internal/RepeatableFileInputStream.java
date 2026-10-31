package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class RepeatableFileInputStream extends SdkInputStream {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Log f491 = LogFactory.m303("RepeatableFIS");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public FileInputStream f493;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final File f495;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f494 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f492 = 0;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    public RepeatableFileInputStream(File file) {
        this.f493 = null;
        if (file == null) {
            throw new IllegalArgumentException("File cannot be null");
        }
        this.f493 = new FileInputStream(file);
        this.f495 = file;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        this.f493.close();
        m282();
        this.f493 = new FileInputStream(this.f495);
        long jSkip = this.f492;
        while (jSkip > 0) {
            jSkip -= this.f493.skip(jSkip);
        }
        Log log = f491;
        if (log.mo293()) {
            log.mo294("Reset to mark point " + this.f492 + " after returning " + this.f494 + " bytes");
        }
        this.f494 = 0L;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        m282();
        this.f492 += this.f494;
        this.f494 = 0L;
        Log log = f491;
        if (log.mo293()) {
            log.mo294("Input stream marked at " + this.f492 + " bytes");
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        m282();
        return this.f493.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f493.close();
        m282();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        m282();
        int i = this.f493.read();
        if (i == -1) {
            return -1;
        }
        this.f494++;
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        m282();
        long jSkip = this.f493.skip(j);
        this.f494 += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        m282();
        int i3 = this.f493.read(bArr, i, i2);
        this.f494 += (long) i3;
        return i3;
    }

    @Override // com.amazonaws.internal.SdkInputStream
    /* JADX INFO: renamed from: ᩳ */
    public final InputStream mo215() {
        return this.f493;
    }
}
