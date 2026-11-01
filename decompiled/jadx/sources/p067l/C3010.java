package p067l;

import android.media.MediaCodec;

/* JADX INFO: renamed from: l.֡᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K8TS */
/* JADX INFO: loaded from: classes2.dex */
public final class C3010 {

    /* JADX INFO: renamed from: ֫ */
    public final MediaCodec.CryptoInfo f5373;

    /* JADX INFO: renamed from: ۧ */
    public final MediaCodec.CryptoInfo.Pattern f5374 = C21117.m47742();

    public C3010(MediaCodec.CryptoInfo cryptoInfo) {
        this.f5373 = cryptoInfo;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5087(C3010 c3010, int i, int i2) {
        c3010.f5374.set(i, i2);
        c3010.f5373.setPattern(c3010.f5374);
    }
}
