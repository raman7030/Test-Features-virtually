package p067l;

/* JADX INFO: renamed from: l.֨ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBH2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3551 {

    /* JADX INFO: renamed from: ֫ */
    public final int f7200;

    /* JADX INFO: renamed from: ۧ */
    public final C14260 f7201;

    /* JADX INFO: renamed from: ܽ */
    public final int f7202;

    /* JADX INFO: renamed from: ᩳ */
    public final int f7203;

    public C3551(int i, int i2, int i3, C14260 c14260) {
        if (i < 0) {
            throw new IllegalArgumentException("startPc < 0");
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endPc < startPc");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("handlerPc < 0");
        }
        this.f7203 = i;
        this.f7200 = i2;
        this.f7202 = i3;
        this.f7201 = c14260;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m6333() {
        return this.f7203;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m6329() {
        return this.f7200;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m6332() {
        return this.f7202;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C14260 m6331() {
        C14260 c14260 = this.f7201;
        return c14260 != null ? c14260 : C14260.f40621;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m6330(int i) {
        return i >= this.f7203 && i < this.f7200;
    }
}
