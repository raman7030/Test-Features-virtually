package com.amazonaws.util;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkFilterInputStream;
import com.google.android.material.motion.MotionUtils;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class LengthCheckInputStream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: ۙ */
    public long f1997;

    /* JADX INFO: renamed from: ᩶ */
    public final boolean f1998;

    /* JADX INFO: renamed from: ᩸ */
    public long f1999;

    /* JADX INFO: renamed from: ᩹ */
    public final long f2000;

    public LengthCheckInputStream(InputStream inputStream, long j, boolean z) {
        super(inputStream);
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        this.f2000 = j;
        this.f1998 = z;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i = super.read();
        if (i >= 0) {
            this.f1999++;
        }
        m1948(i == -1);
        return i;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = super.read(bArr, i, i2);
        this.f1999 += i3 >= 0 ? i3 : 0L;
        m1948(i3 == -1);
        return i3;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        super.mark(i);
        this.f1997 = this.f1999;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        super.reset();
        if (markSupported()) {
            this.f1999 = this.f1997;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m1948(boolean z) {
        long j = this.f2000;
        if (z) {
            if (this.f1999 == j) {
                return;
            }
            throw new AmazonClientException("Data read (" + this.f1999 + ") has a different length than the expected (" + j + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        if (this.f1999 <= j) {
            return;
        }
        throw new AmazonClientException("More data read (" + this.f1999 + ") than expected (" + j + MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long jSkip = super.skip(j);
        if (this.f1998 && jSkip > 0) {
            this.f1999 += jSkip;
            m1948(false);
        }
        return jSkip;
    }
}
