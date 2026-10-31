package l;

/* JADX INFO: renamed from: l.۫ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49FM */
/* JADX INFO: loaded from: classes3.dex */
public final class C12216 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f36447;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f36448;

    public C12216(byte[] bArr, byte[] bArr2) {
        this.f36447 = bArr;
        this.f36448 = bArr2;
    }

    public final String toString() {
        return "SMB2FileId{persistentHandle=" + C1152.m3949(this.f36447) + '}';
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29707(C0097 c0097) {
        byte[] bArr = this.f36447;
        c0097.m26077(bArr.length, bArr);
        byte[] bArr2 = this.f36448;
        c0097.m26077(bArr2.length, bArr2);
    }
}
