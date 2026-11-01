package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import p067l.C5410;

/* JADX INFO: loaded from: classes.dex */
public class DecodedStreamBuffer {

    /* JADX INFO: renamed from: ܳ */
    public static final Log f1310 = LogFactory.m1468(DecodedStreamBuffer.class);

    /* JADX INFO: renamed from: ֫ */
    public byte[] f1311;

    /* JADX INFO: renamed from: ۧ */
    public boolean f1312;

    /* JADX INFO: renamed from: ܽ */
    public int f1313;

    /* JADX INFO: renamed from: ܿ */
    public int f1314 = -1;

    /* JADX INFO: renamed from: ᩳ */
    public int f1315;

    public DecodedStreamBuffer(int i) {
        this.f1311 = new byte[i];
        this.f1315 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1384(int i, int i2, byte[] bArr) {
        this.f1314 = -1;
        int i3 = this.f1313;
        int i4 = i3 + i2;
        int i5 = this.f1315;
        if (i4 > i5) {
            Log log = f1310;
            if (log.mo1459()) {
                log.mo1460("Buffer size " + i5 + " has been exceeded and the input stream will not be repeatable. Freeing buffer memory");
            }
            this.f1312 = true;
            return;
        }
        System.arraycopy(bArr, i, this.f1311, i3, i2);
        this.f1313 += i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m1385() {
        int i = this.f1314;
        return i != -1 && i < this.f1313;
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte m1386() {
        int i = this.f1314;
        this.f1314 = i + 1;
        return this.f1311[i];
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m1387() {
        if (this.f1312) {
            throw new AmazonClientException(C5410.m11876(this.f1315, " has been exceeded.", new StringBuilder("The input stream is not repeatable since the buffer size ")));
        }
        this.f1314 = 0;
    }
}
