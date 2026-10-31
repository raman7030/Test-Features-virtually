package l;

/* JADX INFO: renamed from: l.ۜ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9J1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6757 extends AbstractC3955 {
    @Override // l.AbstractC3955
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5366 mo1923(AbstractC11716 abstractC11716, byte[] bArr) {
        boolean z = bArr.length == 1;
        int length = bArr.length;
        if (z) {
            return new C9580(bArr, bArr[0] != 0);
        }
        throw new IllegalStateException(C19370.m44628(length, "Value of ASN1Boolean should have length 1, but was "));
    }
}
