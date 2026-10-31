package l;

/* JADX INFO: renamed from: l.ܿܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01M8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17401 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f53243 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f53244 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f53245;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f53246;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo34827(int i, int i2, int i3, int i4);

    public AbstractC17401(int i, int i2) {
        this.f53245 = i;
        this.f53246 = i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m40751() {
        return this.f53243;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m40753() {
        return this.f53244;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m40755() {
        return this.f53245;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m40754() {
        return this.f53246;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40750(int i, int i2, int i3) {
        m40752(i, i2, i + i3, i3 + i2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40752(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        int i5 = this.f53243;
        if (i5 != i || this.f53244 != i2) {
            mo34827(i5, this.f53244, i, i2);
        }
        this.f53243 = i3;
        this.f53244 = i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40749() {
        int i = this.f53243;
        int i2 = this.f53246;
        int i3 = this.f53245;
        if (i3 == i && i2 == this.f53244) {
            return;
        }
        mo34827(i, this.f53244, i3, i2);
        this.f53243 = i3;
        this.f53244 = i2;
    }
}
