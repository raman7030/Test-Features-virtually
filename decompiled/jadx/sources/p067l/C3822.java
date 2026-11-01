package p067l;

/* JADX INFO: renamed from: l.֫ۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7WJ */
/* JADX INFO: loaded from: classes3.dex */
public class C3822 extends C17903 {

    /* JADX INFO: renamed from: ܳ */
    public final byte[] f8194 = new byte[20];

    @Override // p067l.C17903, p067l.InterfaceC3348
    public final int getBlockSize() {
        return 12;
    }

    @Override // p067l.AbstractC8217, p067l.InterfaceC3348
    /* JADX INFO: renamed from: ۧ */
    public final void mo5850(int i, byte[] bArr) {
        byte[] bArr2 = this.f8194;
        super.mo5850(0, bArr2);
        System.arraycopy(bArr2, 0, bArr, i, 12);
    }
}
