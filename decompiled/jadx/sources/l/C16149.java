package l;

/* JADX INFO: renamed from: l.ܺ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R9YE */
/* JADX INFO: loaded from: classes5.dex */
public final class C16149 extends AbstractC12601 {

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f49750;

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        return 0;
    }

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final int m38067() {
        return this.f49750;
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) throws C17771 {
        if (C1480.m5121(i, bArr) != 17) {
            throw new C17771("Expected structureSize = 17");
        }
        this.f49750 = C1480.m5123(i + 4, bArr);
        C1480.m5123(i + 8, bArr);
        return (i + 16) - i;
    }
}
