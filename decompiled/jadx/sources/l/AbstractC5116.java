package l;

/* JADX INFO: renamed from: l.ۚۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H586 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5116 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3454 f16031;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f16030 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f16032 = -1;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo10104(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo10106();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10108(C1547 c1547);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10109(C10720 c10720, C12172 c12172);

    public AbstractC5116(C3454 c3454) {
        this.f16031 = c3454;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14657(C10720 c10720, int i, C12172 c12172) {
        try {
            this.f16030 = c10720.m26898();
            this.f16032 = i;
            mo10109(c10720, c12172);
        } catch (Exception e) {
            throw C16363.m38521(mo10106(), e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m14658(int i, int i2) {
        try {
            this.f16030 = i;
            this.f16032 = i2;
            return mo10104(i);
        } catch (Exception e) {
            throw C16363.m38521(mo10106(), e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14660(C1547 c1547) {
        try {
            c1547.m5299();
            mo10108(c1547);
            c1547.m5295();
        } catch (Exception e) {
            throw C16363.m38521(mo10106(), e);
        }
    }

    public final String toString() {
        return mo10106();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m14661() {
        return this.f16032;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3454 m14659() {
        return this.f16031;
    }
}
