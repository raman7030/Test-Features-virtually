package p067l;

/* JADX INFO: renamed from: l.ܺ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R9YE */
/* JADX INFO: loaded from: classes5.dex */
public final class C17717 extends AbstractC14345 {

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f52916;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        return 0;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public final int m40259() {
        return this.f52916;
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) throws C19258 {
        if (C3775.m7363(i, bArr) != 17) {
            throw new C19258("Expected structureSize = 17");
        }
        this.f52916 = C3775.m7365(i + 4, bArr);
        C3775.m7365(i + 8, bArr);
        return (i + 16) - i;
    }
}
