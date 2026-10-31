package com.amazonaws.event;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class ProgressReportingInputStream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f173;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f174;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f175;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ProgressListenerCallbackExecutor f176;

    public ProgressReportingInputStream(InputStream inputStream, ProgressListenerCallbackExecutor progressListenerCallbackExecutor) {
        super(inputStream);
        this.f174 = 8192;
        this.f176 = progressListenerCallbackExecutor;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m232(int i) {
        this.f174 = i * 1024;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m233() {
        this.f175 = true;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i = super.read();
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor = this.f176;
        if (i == -1) {
            if (this.f175) {
                ProgressEvent progressEvent = new ProgressEvent(this.f173);
                progressEvent.f167 = 4;
                this.f173 = 0;
                progressListenerCallbackExecutor.m231(progressEvent);
                return i;
            }
        } else {
            int i2 = this.f173 + 1;
            this.f173 = i2;
            if (i2 >= this.f174) {
                progressListenerCallbackExecutor.m231(new ProgressEvent(i2));
                this.f173 = 0;
            }
        }
        return i;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        super.reset();
        ProgressEvent progressEvent = new ProgressEvent(this.f173);
        progressEvent.f167 = 32;
        this.f176.m231(progressEvent);
        this.f173 = 0;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = super.read(bArr, i, i2);
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor = this.f176;
        if (i3 == -1 && this.f175) {
            ProgressEvent progressEvent = new ProgressEvent(this.f173);
            progressEvent.f167 = 4;
            this.f173 = 0;
            progressListenerCallbackExecutor.m231(progressEvent);
        }
        if (i3 != -1) {
            int i4 = this.f173 + i3;
            this.f173 = i4;
            if (i4 >= this.f174) {
                progressListenerCallbackExecutor.m231(new ProgressEvent(i4));
                this.f173 = 0;
            }
        }
        return i3;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.f173;
        if (i > 0) {
            this.f176.m231(new ProgressEvent(i));
            this.f173 = 0;
        }
        super.close();
    }
}
