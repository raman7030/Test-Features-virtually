package l;

/* JADX INFO: renamed from: l.ܶۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB9Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C15149 extends AbstractC4193 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f46295;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f46296;

    public C15149(EnumC8095 enumC8095, int i, int i2, int i3, int[] iArr) {
        super(enumC8095, i, i2, 0, 0L);
        if (i3 != ((short) i3)) {
            throw new IllegalArgumentException(C19370.m44628(i3, "protoIndex doesn't fit in a short: "));
        }
        this.f46296 = i3;
        this.f46295 = iArr;
    }

    @Override // l.AbstractC4193
    /* JADX INFO: renamed from: ᩴ */
    public final int mo2709() {
        return this.f46295.length;
    }

    @Override // l.AbstractC4193
    /* JADX INFO: renamed from: ܽ */
    public final int mo2707() {
        int[] iArr = this.f46295;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return 0;
    }

    @Override // l.AbstractC4193
    /* JADX INFO: renamed from: ᩳ */
    public final int mo2708() {
        int[] iArr = this.f46295;
        if (iArr.length > 1) {
            return iArr[1];
        }
        return 0;
    }

    @Override // l.AbstractC4193
    /* JADX INFO: renamed from: ܿ */
    public final int mo12651() {
        int[] iArr = this.f46295;
        if (iArr.length > 2) {
            return iArr[2];
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m35854() {
        int[] iArr = this.f46295;
        if (iArr.length > 3) {
            return iArr[3];
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m35853() {
        int[] iArr = this.f46295;
        if (iArr.length > 4) {
            return iArr[4];
        }
        return 0;
    }

    @Override // l.AbstractC4193
    /* JADX INFO: renamed from: ۘ */
    public final short mo12643() {
        return (short) this.f46296;
    }
}
