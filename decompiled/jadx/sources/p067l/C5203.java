package p067l;

/* JADX INFO: renamed from: l.ۗۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8DH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5203 extends AbstractC5050 {

    /* JADX INFO: renamed from: ۧ */
    public short[] f12224;

    /* JADX INFO: renamed from: ܽ */
    public int f12225;

    /* JADX INFO: renamed from: ᩳ */
    public int f12226;

    @Override // p067l.AbstractC5050
    /* JADX INFO: renamed from: ֫ */
    public final double mo10769(int i, double d) {
        return 1.0d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5203(short[] sArr) {
        super(3);
        int length = sArr.length;
        this.f12225 = 1;
        short[] sArr2 = new short[length];
        this.f12224 = sArr2;
        this.f12226 = length;
        this.f12225 = 1;
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
    }

    @Override // p067l.AbstractC5050
    /* JADX INFO: renamed from: ۧ */
    public final int mo10777() {
        return this.f12226;
    }

    @Override // p067l.AbstractC5050
    /* JADX INFO: renamed from: ֫ */
    public final int mo10770() {
        return this.f12225;
    }

    @Override // p067l.AbstractC5050
    /* JADX INFO: renamed from: ֫ */
    public final double mo10768(int i) {
        short s = this.f12224[i];
        int i2 = C9226.f24966;
        return ((double) s) * 3.051850947599719E-5d;
    }
}
