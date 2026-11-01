package p067l;

/* JADX INFO: renamed from: l.ܶᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LA1K */
/* JADX INFO: loaded from: classes5.dex */
public final class C17026 extends AbstractC19710 {

    /* JADX INFO: renamed from: ܿۧ */
    public final int f50358;

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ۜ */
    public final int mo4839(int i, byte[] bArr) {
        return 0;
    }

    public C17026(InterfaceC3341 interfaceC3341, String str, int i) {
        super(interfaceC3341, (byte) 50, (byte) 5);
        this.f37152 = str;
        this.f50358 = i;
        this.f59926 = 0;
        this.f59920 = 2;
        this.f59934 = 40;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4841(int i, byte[] bArr) {
        bArr[i] = m44787();
        bArr[i + 1] = 0;
        return 2;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ܽ */
    public final int mo4840(byte[] bArr) {
        long j;
        int i = this.f50358;
        if (i == 4) {
            j = 257;
        } else if (i == 5) {
            j = 258;
        } else {
            if (i != 20) {
                throw new IllegalArgumentException(C20778.m46922(i, "Unsupported information level "));
            }
            j = 260;
        }
        C3775.m7364(j, 0, bArr);
        bArr[2] = 0;
        bArr[3] = 0;
        bArr[4] = 0;
        bArr[5] = 0;
        return m30241(this.f37152, 6, bArr) + 6;
    }

    @Override // p067l.AbstractC19710, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2QueryPathInformation[");
        sb.append(super.toString());
        sb.append(",informationLevel=0x");
        C20458.m46154(this.f50358, 3, ",filename=", sb);
        return new String(C10965.m25286(sb, this.f37152, "]"));
    }
}
