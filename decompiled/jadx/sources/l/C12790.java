package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.۬֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 49UX */
/* JADX INFO: loaded from: classes3.dex */
public final class C12790 extends MessageDigest implements Cloneable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f38408;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f38409;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public MessageDigest f38410;

    public C12790(byte[] bArr) {
        super("HMACT64");
        this.f38409 = new byte[64];
        this.f38408 = new byte[64];
        int iMin = Math.min(bArr.length, 64);
        for (int i = 0; i < iMin; i++) {
            this.f38409[i] = (byte) (54 ^ bArr[i]);
            this.f38408[i] = (byte) (92 ^ bArr[i]);
        }
        while (iMin < 64) {
            this.f38409[iMin] = 54;
            this.f38408[iMin] = 92;
            iMin++;
        }
        this.f38410 = C4324.m12979();
        engineReset();
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public final Object clone() {
        try {
            C12790 c12790 = new C12790("HMACT64");
            c12790.f38409 = new byte[64];
            c12790.f38408 = new byte[64];
            c12790.f38409 = this.f38409;
            c12790.f38408 = this.f38408;
            c12790.f38410 = (MessageDigest) this.f38410.clone();
            return c12790;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // java.security.MessageDigestSpi
    public final byte[] engineDigest() {
        MessageDigest messageDigest = this.f38410;
        byte[] bArrDigest = messageDigest.digest();
        messageDigest.update(this.f38408);
        return messageDigest.digest(bArrDigest);
    }

    @Override // java.security.MessageDigestSpi
    public final int engineDigest(byte[] bArr, int i, int i2) {
        MessageDigest messageDigest = this.f38410;
        byte[] bArrDigest = messageDigest.digest();
        messageDigest.update(this.f38408);
        messageDigest.update(bArrDigest);
        try {
            return messageDigest.digest(bArr, i, i2);
        } catch (Exception unused) {
            throw new IllegalStateException();
        }
    }

    @Override // java.security.MessageDigestSpi
    public final int engineGetDigestLength() {
        return this.f38410.getDigestLength();
    }

    @Override // java.security.MessageDigestSpi
    public final void engineReset() {
        MessageDigest messageDigest = this.f38410;
        messageDigest.reset();
        messageDigest.update(this.f38409);
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte b) {
        this.f38410.update(b);
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) {
        this.f38410.update(bArr, i, i2);
    }
}
