package p067l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.۬֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 49UX */
/* JADX INFO: loaded from: classes3.dex */
public final class C14524 extends MessageDigest implements Cloneable {

    /* JADX INFO: renamed from: ᩶ */
    public byte[] f41450;

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f41451;

    /* JADX INFO: renamed from: ᩹ */
    public MessageDigest f41452;

    public C14524(byte[] bArr) {
        super("HMACT64");
        this.f41451 = new byte[64];
        this.f41450 = new byte[64];
        int iMin = Math.min(bArr.length, 64);
        for (int i = 0; i < iMin; i++) {
            this.f41451[i] = (byte) (54 ^ bArr[i]);
            this.f41450[i] = (byte) (92 ^ bArr[i]);
        }
        while (iMin < 64) {
            this.f41451[iMin] = 54;
            this.f41450[iMin] = 92;
            iMin++;
        }
        this.f41452 = C6478.m14843();
        engineReset();
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public final Object clone() {
        try {
            C14524 c14524 = new C14524("HMACT64");
            c14524.f41451 = new byte[64];
            c14524.f41450 = new byte[64];
            c14524.f41451 = this.f41451;
            c14524.f41450 = this.f41450;
            c14524.f41452 = (MessageDigest) this.f41452.clone();
            return c14524;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // java.security.MessageDigestSpi
    public final byte[] engineDigest() {
        MessageDigest messageDigest = this.f41452;
        byte[] bArrDigest = messageDigest.digest();
        messageDigest.update(this.f41450);
        return messageDigest.digest(bArrDigest);
    }

    @Override // java.security.MessageDigestSpi
    public final int engineDigest(byte[] bArr, int i, int i2) {
        MessageDigest messageDigest = this.f41452;
        byte[] bArrDigest = messageDigest.digest();
        messageDigest.update(this.f41450);
        messageDigest.update(bArrDigest);
        try {
            return messageDigest.digest(bArr, i, i2);
        } catch (Exception unused) {
            throw new IllegalStateException();
        }
    }

    @Override // java.security.MessageDigestSpi
    public final int engineGetDigestLength() {
        return this.f41452.getDigestLength();
    }

    @Override // java.security.MessageDigestSpi
    public final void engineReset() {
        MessageDigest messageDigest = this.f41452;
        messageDigest.reset();
        messageDigest.update(this.f41451);
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte b) {
        this.f41452.update(b);
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) {
        this.f41452.update(bArr, i, i2);
    }
}
