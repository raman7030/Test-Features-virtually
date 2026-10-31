package l;

/* JADX INFO: renamed from: l.ۨܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7ZR */
/* JADX INFO: loaded from: classes4.dex */
public class C11799 extends C13914 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] f35193 = new byte[16];

    @Override // l.C13914, l.InterfaceC1031
    public final int getBlockSize() {
        return 12;
    }

    @Override // l.AbstractC6154, l.InterfaceC1031
    /* JADX INFO: renamed from: ۧ */
    public final void mo3563(int i, byte[] bArr) {
        byte[] bArr2 = this.f35193;
        super.mo3563(0, bArr2);
        System.arraycopy(bArr2, 0, bArr, i, 12);
    }
}
