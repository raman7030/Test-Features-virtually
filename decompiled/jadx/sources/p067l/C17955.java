package p067l;

/* JADX INFO: renamed from: l.ܽۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U9U0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17955 extends AbstractC13224 {

    /* JADX INFO: renamed from: ֡֫ */
    public int f53635;

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ۧ */
    public final int mo3714(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܽ */
    public final int mo3716(int i, byte[] bArr) {
        return 0;
    }

    public C17955(String str, InterfaceC3341 interfaceC3341) {
        super(interfaceC3341, (byte) 6, str);
        this.f53635 = 6;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        C3775.m7364(this.f53635, i, bArr);
        return 2;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        int i2 = i + 1;
        bArr[i] = 4;
        return (i2 + m30241(this.f37152, i2, bArr)) - i;
    }

    @Override // p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComDelete[");
        sb.append(super.toString());
        sb.append(",searchAttributes=0x");
        C20458.m46154(this.f53635, 4, ",fileName=", sb);
        return new String(C10965.m25286(sb, this.f37152, "]"));
    }
}
