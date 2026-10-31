package l;

/* JADX INFO: renamed from: l.֨ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBH2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1244 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f4431;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12512 f4432;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f4433;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f4434;

    public C1244(int i, int i2, int i3, C12512 c12512) {
        if (i < 0) {
            throw new IllegalArgumentException("startPc < 0");
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endPc < startPc");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("handlerPc < 0");
        }
        this.f4434 = i;
        this.f4431 = i2;
        this.f4433 = i3;
        this.f4432 = c12512;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m4089() {
        return this.f4434;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m4085() {
        return this.f4431;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m4088() {
        return this.f4433;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12512 m4087() {
        C12512 c12512 = this.f4432;
        return c12512 != null ? c12512 : C12512.f37597;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m4086(int i) {
        return i >= this.f4434 && i < this.f4431;
    }
}
