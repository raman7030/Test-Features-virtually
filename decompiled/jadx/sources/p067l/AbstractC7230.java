package p067l;

/* JADX INFO: renamed from: l.ۚۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H586 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7230 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public final C5651 f18865;

    /* JADX INFO: renamed from: ᩶ */
    public int f18864 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public int f18866 = -1;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo12140(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo12142();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo12144(C3838 c3838);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo12145(C12556 c12556, C13936 c13936);

    public AbstractC7230(C5651 c5651) {
        this.f18865 = c5651;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16565(C12556 c12556, int i, C13936 c13936) {
        try {
            this.f18864 = c12556.m28938();
            this.f18866 = i;
            mo12145(c12556, c13936);
        } catch (Exception e) {
            throw C17919.m40738(mo12142(), e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m16566(int i, int i2) {
        try {
            this.f18864 = i;
            this.f18866 = i2;
            return mo12140(i);
        } catch (Exception e) {
            throw C17919.m40738(mo12142(), e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16568(C3838 c3838) {
        try {
            c3838.m7528();
            mo12144(c3838);
            c3838.m7524();
        } catch (Exception e) {
            throw C17919.m40738(mo12142(), e);
        }
    }

    public final String toString() {
        return mo12142();
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m16569() {
        return this.f18866;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C5651 m16567() {
        return this.f18865;
    }
}
