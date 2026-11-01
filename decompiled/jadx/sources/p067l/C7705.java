package p067l;

import android.media.MediaCodec;
import android.os.Build;

/* JADX INFO: renamed from: l.ۚ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K8TS */
/* JADX INFO: loaded from: classes2.dex */
public final class C7705 {

    /* JADX INFO: renamed from: ֫ */
    public int f20216;

    /* JADX INFO: renamed from: ۜ */
    public int[] f20217;

    /* JADX INFO: renamed from: ۢ */
    public final C3010 f20218;

    /* JADX INFO: renamed from: ۧ */
    public int f20219;

    /* JADX INFO: renamed from: ܳ */
    public int f20220;

    /* JADX INFO: renamed from: ܽ */
    public final MediaCodec.CryptoInfo f20221;

    /* JADX INFO: renamed from: ܿ */
    public byte[] f20222;

    /* JADX INFO: renamed from: ᩳ */
    public byte[] f20223;

    /* JADX INFO: renamed from: ᩷ */
    public int f20224;

    /* JADX INFO: renamed from: ᩻ */
    public int[] f20225;

    public C7705() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f20221 = cryptoInfo;
        this.f20218 = Build.VERSION.SDK_INT >= 24 ? new C3010(cryptoInfo) : null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17841(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f20224 = i;
        this.f20225 = iArr;
        this.f20217 = iArr2;
        this.f20222 = bArr;
        this.f20223 = bArr2;
        this.f20220 = i2;
        this.f20219 = i3;
        this.f20216 = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f20221;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (Build.VERSION.SDK_INT >= 24) {
            C3010 c3010 = this.f20218;
            c3010.getClass();
            C3010.m5087(c3010, i3, i4);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final MediaCodec.CryptoInfo m17839() {
        return this.f20221;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17840(int i) {
        if (i == 0) {
            return;
        }
        if (this.f20225 == null) {
            int[] iArr = new int[1];
            this.f20225 = iArr;
            this.f20221.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f20225;
        iArr2[0] = iArr2[0] + i;
    }
}
