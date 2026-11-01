package p067l;

/* JADX INFO: renamed from: l.ۘᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B9XZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6299 extends AbstractC19710 {

    /* JADX INFO: renamed from: ۜۧ */
    public String f15916;

    /* JADX INFO: renamed from: ܳۧ */
    public int f15917;

    /* JADX INFO: renamed from: ܿۧ */
    public int f15918;

    /* JADX INFO: renamed from: ᩻ۧ */
    public int f15919;

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ۜ */
    public final int mo4839(int i, byte[] bArr) {
        return 0;
    }

    public C6299(InterfaceC3341 interfaceC3341, String str, String str2, int i, int i2, int i3) {
        super(interfaceC3341, (byte) 50, (byte) 1);
        if (str.equals("\\") || C9417.m21911(1, str) == '\\') {
            this.f37152 = str;
        } else {
            this.f37152 = str.concat("\\");
        }
        this.f15916 = str2;
        this.f15919 = i & 55;
        this.f15918 = 260;
        this.f59926 = 0;
        this.f59920 = 10;
        this.f15917 = i2;
        this.f59934 = i3;
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
        C3775.m7364(this.f15919, 0, bArr);
        C3775.m7364(this.f15917, 2, bArr);
        long j = 0;
        C3775.m7364(j, 4, bArr);
        C3775.m7364(this.f15918, 6, bArr);
        C3775.m7366(j, 8, bArr);
        return m30241(this.f37152 + this.f15916, 12, bArr) + 12;
    }

    @Override // p067l.AbstractC19710, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2FindFirst2[");
        sb.append(super.toString());
        sb.append(",searchAttributes=0x");
        C20458.m46154(this.f15919, 2, ",searchCount=", sb);
        sb.append(this.f15917);
        sb.append(",flags=0x");
        sb.append(C13854.m31529(0, 2));
        sb.append(",informationLevel=0x");
        C20458.m46154(this.f15918, 3, ",searchStorageType=0,filename=", sb);
        return new String(C10965.m25286(sb, this.f37152, "]"));
    }
}
