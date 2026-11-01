package p067l;

/* JADX INFO: renamed from: l.ۗۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBH0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5368 extends AbstractC6354 {

    /* JADX INFO: renamed from: ܳ */
    public final int[] f12659;

    /* JADX INFO: renamed from: ܿ */
    public final int[] f12660;

    @Override // p067l.AbstractC6354
    /* JADX INFO: renamed from: ᩴ */
    public final int mo5048() {
        return 0;
    }

    public C5368(EnumC10062 enumC10062, int i, int[] iArr, int[] iArr2) {
        super(enumC10062, i, 0, 0, 0L);
        if (iArr.length != iArr2.length) {
            throw new IllegalArgumentException("keys/targets length mismatch");
        }
        this.f12660 = iArr;
        this.f12659 = iArr2;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final int[] m11630() {
        return this.f12660;
    }

    /* JADX INFO: renamed from: ֡ */
    public final int[] m11629() {
        return this.f12659;
    }
}
