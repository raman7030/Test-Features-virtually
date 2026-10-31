package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import l.C3200;

/* JADX INFO: loaded from: classes.dex */
public class DecodedStreamBuffer {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Log f150 = LogFactory.m302(DecodedStreamBuffer.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f151;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f152;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f153;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f154 = -1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f155;

    public DecodedStreamBuffer(int i) {
        this.f151 = new byte[i];
        this.f155 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m218(int i, int i2, byte[] bArr) {
        this.f154 = -1;
        int i3 = this.f153;
        int i4 = i3 + i2;
        int i5 = this.f155;
        if (i4 > i5) {
            Log log = f150;
            if (log.mo293()) {
                log.mo294("Buffer size " + i5 + " has been exceeded and the input stream will not be repeatable. Freeing buffer memory");
            }
            this.f152 = true;
            return;
        }
        System.arraycopy(bArr, i, this.f151, i3, i2);
        this.f153 += i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m219() {
        int i = this.f154;
        return i != -1 && i < this.f153;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte m220() {
        int i = this.f154;
        this.f154 = i + 1;
        return this.f151[i];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m221() {
        if (this.f152) {
            throw new AmazonClientException(C3200.m9831(this.f155, " has been exceeded.", new StringBuilder("The input stream is not repeatable since the buffer size ")));
        }
        this.f154 = 0;
    }
}
