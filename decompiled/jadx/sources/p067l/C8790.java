package p067l;

/* JADX INFO: renamed from: l.ۜ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9J1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8790 extends AbstractC6127 {
    @Override // p067l.AbstractC6127
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7468 mo4315(AbstractC13503 abstractC13503, byte[] bArr) {
        boolean z = bArr.length == 1;
        int length = bArr.length;
        if (z) {
            return new C11473(bArr, bArr[0] != 0);
        }
        throw new IllegalStateException(C20778.m46922(length, "Value of ASN1Boolean should have length 1, but was "));
    }
}
