package com.amazonaws.services.p061s3.internal;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class InputSubstream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: ۗ */
    public final long f1640;

    /* JADX INFO: renamed from: ۙ */
    public final long f1641;

    /* JADX INFO: renamed from: ᩶ */
    public long f1642;

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f1643;

    /* JADX INFO: renamed from: ᩹ */
    public long f1644;

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f1642 = this.f1644;
        super.mark(i);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        this.f1644 = this.f1642;
        super.reset();
    }

    public InputSubstream(RepeatableFileInputStream repeatableFileInputStream, long j, long j2) {
        super(repeatableFileInputStream);
        this.f1642 = 0L;
        this.f1644 = 0L;
        this.f1641 = j2;
        this.f1640 = j;
        this.f1643 = true;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        int i = read(bArr, 0, 1);
        return i == -1 ? i : bArr[0];
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j;
        long j2;
        while (true) {
            j = this.f1644;
            j2 = this.f1640;
            if (j >= j2) {
                break;
            }
            this.f1644 += skip(j2 - j);
        }
        long j3 = (this.f1641 + j2) - j;
        if (j3 <= 0) {
            return -1;
        }
        int i3 = super.read(bArr, i, (int) Math.min(i2, j3));
        this.f1644 += (long) i3;
        return i3;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f1643) {
            super.close();
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        long j = this.f1644;
        long j2 = this.f1641;
        long j3 = this.f1640;
        if (j >= j3) {
            j2 = (j2 + j3) - j;
        }
        return (int) Math.min(j2, super.available());
    }
}
