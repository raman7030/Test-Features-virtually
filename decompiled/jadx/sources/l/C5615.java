package l;

import android.media.MediaCodec;
import android.os.Build;

/* JADX INFO: renamed from: l.ۚ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K8TS */
/* JADX INFO: loaded from: classes2.dex */
public final class C5615 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f17372;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int[] f17373;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C0675 f17374;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f17375;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f17376;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final MediaCodec.CryptoInfo f17377;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f17378;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f17379;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f17380;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int[] f17381;

    public C5615() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f17377 = cryptoInfo;
        this.f17374 = Build.VERSION.SDK_INT >= 24 ? new C0675(cryptoInfo) : null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15920(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f17380 = i;
        this.f17381 = iArr;
        this.f17373 = iArr2;
        this.f17378 = bArr;
        this.f17379 = bArr2;
        this.f17376 = i2;
        this.f17375 = i3;
        this.f17372 = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f17377;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (Build.VERSION.SDK_INT >= 24) {
            C0675 c0675 = this.f17374;
            c0675.getClass();
            C0675.m2748(c0675, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MediaCodec.CryptoInfo m15918() {
        return this.f17377;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15919(int i) {
        if (i == 0) {
            return;
        }
        if (this.f17381 == null) {
            int[] iArr = new int[1];
            this.f17381 = iArr;
            this.f17377.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f17381;
        iArr2[0] = iArr2[0] + i;
    }
}
