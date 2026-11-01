package com.amazonaws.services.p061s3.model;

import com.amazonaws.internal.MetricAware;
import com.amazonaws.internal.SdkFilterInputStream;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.MetricFilterInputStream;
import com.amazonaws.services.p061s3.metrics.S3ServiceMetric;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class S3ObjectInputStream extends SdkFilterInputStream {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public S3ObjectInputStream(InputStream inputStream) {
        boolean z;
        if (AwsSdkMetrics.m1483()) {
            z = inputStream instanceof MetricAware ? !((MetricAware) inputStream).mo1445() : true;
        } else {
            z = false;
        }
        super(z ? new MetricFilterInputStream(S3ServiceMetric.f1677, inputStream) : inputStream);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream
    /* JADX INFO: renamed from: ܽ */
    public final void mo1446() {
        try {
            close();
        } catch (IOException e) {
            LogFactory.m1468(getClass()).mo1458("FYI", e);
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int iAvailable = super.available();
        if (iAvailable == 0) {
            return 1;
        }
        return iAvailable;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return super.read(bArr, 0, bArr.length);
    }
}
