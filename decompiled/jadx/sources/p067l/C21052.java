package p067l;

/* JADX INFO: renamed from: l.᩵ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D9UF */
/* JADX INFO: loaded from: classes5.dex */
public final class C21052 extends AbstractC19710 {

    /* JADX INFO: renamed from: ۜۧ */
    public int f66091;

    /* JADX INFO: renamed from: ܳۧ */
    public int f66092;

    /* JADX INFO: renamed from: ܿۧ */
    public String f66093;

    /* JADX INFO: renamed from: ᩷ۧ */
    public int f66094;

    /* JADX INFO: renamed from: ᩻ۧ */
    public long f66095;

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ۜ */
    public final int mo4839(int i, byte[] bArr) {
        return 0;
    }

    public C21052(int i, int i2, int i3, int i4, String str, InterfaceC3341 interfaceC3341) {
        super(interfaceC3341, (byte) 50, (byte) 2);
        this.f66094 = i;
        this.f66091 = i2;
        this.f66093 = str;
        this.f66092 = 260;
        this.f59920 = 8;
        this.f66095 = i3;
        this.f59934 = i4;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47489(int i, String str) {
        reset();
        this.f66091 = i;
        this.f66093 = str;
        this.f37158 = 0;
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
        C3775.m7364(this.f66094, 0, bArr);
        C3775.m7364(this.f66095, 2, bArr);
        C3775.m7364(this.f66092, 4, bArr);
        C3775.m7366(this.f66091, 6, bArr);
        C3775.m7364(0, 10, bArr);
        return m30241(this.f66093, 12, bArr) + 12;
    }

    @Override // p067l.AbstractC19710, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2FindNext2[");
        sb.append(super.toString());
        sb.append(",sid=");
        sb.append(this.f66094);
        sb.append(",searchCount=");
        sb.append(((C15410) m30262()).m35115());
        sb.append(",informationLevel=0x");
        C20458.m46154(this.f66092, 3, ",resumeKey=0x", sb);
        C20458.m46154(this.f66091, 4, ",flags=0x", sb);
        C20458.m46154(0, 2, ",filename=", sb);
        return new String(C10965.m25286(sb, this.f66093, "]"));
    }
}
