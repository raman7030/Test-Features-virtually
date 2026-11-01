package p067l;

/* JADX INFO: renamed from: l.۫ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49FM */
/* JADX INFO: loaded from: classes3.dex */
public final class C13978 {

    /* JADX INFO: renamed from: ֫ */
    public byte[] f39461;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f39462;

    public C13978(byte[] bArr, byte[] bArr2) {
        this.f39461 = bArr;
        this.f39462 = bArr2;
    }

    public final String toString() {
        return "SMB2FileId{persistentHandle=" + C3463.m6190(this.f39461) + '}';
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31769(C2460 c2460) {
        byte[] bArr = this.f39461;
        c2460.m28102(bArr.length, bArr);
        byte[] bArr2 = this.f39462;
        c2460.m28102(bArr2.length, bArr2);
    }
}
