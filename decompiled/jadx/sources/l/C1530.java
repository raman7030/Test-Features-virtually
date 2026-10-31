package l;

/* JADX INFO: renamed from: l.֫ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7WJ */
/* JADX INFO: loaded from: classes3.dex */
public class C1530 extends C16346 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] f5412 = new byte[20];

    @Override // l.C16346, l.InterfaceC1031
    public final int getBlockSize() {
        return 12;
    }

    @Override // l.AbstractC6154, l.InterfaceC1031
    /* JADX INFO: renamed from: ۧ */
    public final void mo3563(int i, byte[] bArr) {
        byte[] bArr2 = this.f5412;
        super.mo3563(0, bArr2);
        System.arraycopy(bArr2, 0, bArr, i, 12);
    }
}
