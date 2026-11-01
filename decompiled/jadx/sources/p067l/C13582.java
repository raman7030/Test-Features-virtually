package p067l;

/* JADX INFO: renamed from: l.ۨܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7ZR */
/* JADX INFO: loaded from: classes4.dex */
public class C13582 extends C15592 {

    /* JADX INFO: renamed from: ܳ */
    public final byte[] f38195 = new byte[16];

    @Override // p067l.C15592, p067l.InterfaceC3348
    public final int getBlockSize() {
        return 12;
    }

    @Override // p067l.AbstractC8217, p067l.InterfaceC3348
    /* JADX INFO: renamed from: ۧ */
    public final void mo5850(int i, byte[] bArr) {
        byte[] bArr2 = this.f38195;
        super.mo5850(0, bArr2);
        System.arraycopy(bArr2, 0, bArr, i, 12);
    }
}
