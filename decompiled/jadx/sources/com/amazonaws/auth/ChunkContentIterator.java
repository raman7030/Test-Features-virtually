package com.amazonaws.auth;

/* JADX INFO: loaded from: classes.dex */
public class ChunkContentIterator {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f147;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f148;

    public ChunkContentIterator(byte[] bArr) {
        this.f148 = bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m217() {
        return this.f147 < this.f148.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m216(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (!m217()) {
            return -1;
        }
        byte[] bArr2 = this.f148;
        int iMin = Math.min(bArr2.length - this.f147, i2);
        System.arraycopy(bArr2, this.f147, bArr, i, iMin);
        this.f147 += iMin;
        return iMin;
    }
}
