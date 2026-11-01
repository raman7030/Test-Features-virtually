package p067l;

/* JADX INFO: renamed from: l.ܶۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB9Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C16766 extends AbstractC6354 {

    /* JADX INFO: renamed from: ܳ */
    public final int[] f49414;

    /* JADX INFO: renamed from: ܿ */
    public final int f49415;

    public C16766(EnumC10062 enumC10062, int i, int i2, int i3, int[] iArr) {
        super(enumC10062, i, i2, 0, 0L);
        if (i3 != ((short) i3)) {
            throw new IllegalArgumentException(C20778.m46922(i3, "protoIndex doesn't fit in a short: "));
        }
        this.f49415 = i3;
        this.f49414 = iArr;
    }

    @Override // p067l.AbstractC6354
    /* JADX INFO: renamed from: ᩴ */
    public final int mo5048() {
        return this.f49414.length;
    }

    @Override // p067l.AbstractC6354
    /* JADX INFO: renamed from: ܽ */
    public final int mo5046() {
        int[] iArr = this.f49414;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return 0;
    }

    @Override // p067l.AbstractC6354
    /* JADX INFO: renamed from: ᩳ */
    public final int mo5047() {
        int[] iArr = this.f49414;
        if (iArr.length > 1) {
            return iArr[1];
        }
        return 0;
    }

    @Override // p067l.AbstractC6354
    /* JADX INFO: renamed from: ܿ */
    public final int mo14527() {
        int[] iArr = this.f49414;
        if (iArr.length > 2) {
            return iArr[2];
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final int m38012() {
        int[] iArr = this.f49414;
        if (iArr.length > 3) {
            return iArr[3];
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֡ */
    public final int m38011() {
        int[] iArr = this.f49414;
        if (iArr.length > 4) {
            return iArr[4];
        }
        return 0;
    }

    @Override // p067l.AbstractC6354
    /* JADX INFO: renamed from: ۘ */
    public final short mo14519() {
        return (short) this.f49415;
    }
}
