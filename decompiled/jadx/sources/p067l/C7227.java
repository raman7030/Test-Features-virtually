package p067l;

/* JADX INFO: renamed from: l.ۚۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9Y3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7227 extends AbstractC13224 {

    /* JADX INFO: renamed from: ֡֫ */
    public String f18858;

    /* JADX INFO: renamed from: ֨֫ */
    public int f18859;

    /* JADX INFO: renamed from: ۚ֫ */
    public String f18860;

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

    public C7227(InterfaceC3341 interfaceC3341, String str, String str2) {
        super(interfaceC3341, (byte) 7);
        this.f18860 = str;
        this.f18858 = str2;
        this.f18859 = 22;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3719(int i, byte[] bArr) {
        C3775.m7364(this.f18859, i, bArr);
        return 2;
    }

    @Override // p067l.AbstractC13224
    /* JADX INFO: renamed from: ܿ */
    public final int mo3717(int i, byte[] bArr) {
        int i2 = i + 1;
        bArr[i] = 4;
        int iM30241 = i2 + m30241(this.f18860, i2, bArr);
        int i3 = iM30241 + 1;
        bArr[iM30241] = 4;
        if (m30259()) {
            bArr[i3] = 0;
            i3 = iM30241 + 2;
        }
        return (i3 + m30241(this.f18858, i3, bArr)) - i;
    }

    @Override // p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComRename[");
        sb.append(super.toString());
        sb.append(",searchAttributes=0x");
        C20458.m46154(this.f18859, 4, ",oldFileName=", sb);
        sb.append(this.f18860);
        sb.append(",newFileName=");
        return new String(C10965.m25286(sb, this.f18858, "]"));
    }
}
