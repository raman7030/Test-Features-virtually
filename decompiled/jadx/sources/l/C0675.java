package l;

import android.media.MediaCodec;

/* JADX INFO: renamed from: l.֡᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K8TS */
/* JADX INFO: loaded from: classes2.dex */
public final class C0675 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MediaCodec.CryptoInfo f2600;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final MediaCodec.CryptoInfo.Pattern f2601 = C19727.m45438();

    public C0675(MediaCodec.CryptoInfo cryptoInfo) {
        this.f2600 = cryptoInfo;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2748(C0675 c0675, int i, int i2) {
        c0675.f2601.set(i, i2);
        c0675.f2600.setPattern(c0675.f2601);
    }
}
