package com.amazonaws.event;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class ProgressReportingInputStream extends SdkFilterInputStream {

    /* JADX INFO: renamed from: ۙ */
    public int f1333;

    /* JADX INFO: renamed from: ᩶ */
    public int f1334;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f1335;

    /* JADX INFO: renamed from: ᩹ */
    public final ProgressListenerCallbackExecutor f1336;

    public ProgressReportingInputStream(InputStream inputStream, ProgressListenerCallbackExecutor progressListenerCallbackExecutor) {
        super(inputStream);
        this.f1334 = 8192;
        this.f1336 = progressListenerCallbackExecutor;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1398(int i) {
        this.f1334 = i * 1024;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m1399() {
        this.f1335 = true;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i = super.read();
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor = this.f1336;
        if (i == -1) {
            if (this.f1335) {
                ProgressEvent progressEvent = new ProgressEvent(this.f1333);
                progressEvent.f1327 = 4;
                this.f1333 = 0;
                progressListenerCallbackExecutor.m1397(progressEvent);
                return i;
            }
        } else {
            int i2 = this.f1333 + 1;
            this.f1333 = i2;
            if (i2 >= this.f1334) {
                progressListenerCallbackExecutor.m1397(new ProgressEvent(i2));
                this.f1333 = 0;
            }
        }
        return i;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        super.reset();
        ProgressEvent progressEvent = new ProgressEvent(this.f1333);
        progressEvent.f1327 = 32;
        this.f1336.m1397(progressEvent);
        this.f1333 = 0;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = super.read(bArr, i, i2);
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor = this.f1336;
        if (i3 == -1 && this.f1335) {
            ProgressEvent progressEvent = new ProgressEvent(this.f1333);
            progressEvent.f1327 = 4;
            this.f1333 = 0;
            progressListenerCallbackExecutor.m1397(progressEvent);
        }
        if (i3 != -1) {
            int i4 = this.f1333 + i3;
            this.f1333 = i4;
            if (i4 >= this.f1334) {
                progressListenerCallbackExecutor.m1397(new ProgressEvent(i4));
                this.f1333 = 0;
            }
        }
        return i3;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.f1333;
        if (i > 0) {
            this.f1336.m1397(new ProgressEvent(i));
            this.f1333 = 0;
        }
        super.close();
    }
}
