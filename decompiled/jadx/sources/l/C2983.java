package l;

/* JADX INFO: renamed from: l.ۗۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8DH */
/* JADX INFO: loaded from: classes2.dex */
public final class C2983 extends AbstractC2821 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public short[] f9425;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f9426;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f9427;

    @Override // l.AbstractC2821
    /* JADX INFO: renamed from: ֫ */
    public final double mo8708(int i, double d) {
        return 1.0d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2983(short[] sArr) {
        super(3);
        int length = sArr.length;
        this.f9426 = 1;
        short[] sArr2 = new short[length];
        this.f9425 = sArr2;
        this.f9427 = length;
        this.f9426 = 1;
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
    }

    @Override // l.AbstractC2821
    /* JADX INFO: renamed from: ۧ */
    public final int mo8716() {
        return this.f9427;
    }

    @Override // l.AbstractC2821
    /* JADX INFO: renamed from: ֫ */
    public final int mo8709() {
        return this.f9426;
    }

    @Override // l.AbstractC2821
    /* JADX INFO: renamed from: ֫ */
    public final double mo8707(int i) {
        short s = this.f9425[i];
        int i2 = C7216.f22081;
        return ((double) s) * 3.051850947599719E-5d;
    }
}
