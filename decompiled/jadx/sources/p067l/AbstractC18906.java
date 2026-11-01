package p067l;

/* JADX INFO: renamed from: l.ܿܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01M8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18906 {

    /* JADX INFO: renamed from: ֫ */
    public int f56430 = 0;

    /* JADX INFO: renamed from: ۧ */
    public int f56431 = 0;

    /* JADX INFO: renamed from: ܽ */
    public final int f56432;

    /* JADX INFO: renamed from: ᩳ */
    public final int f56433;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo36978(int i, int i2, int i3, int i4);

    public AbstractC18906(int i, int i2) {
        this.f56432 = i;
        this.f56433 = i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m43008() {
        return this.f56430;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m43010() {
        return this.f56431;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m43012() {
        return this.f56432;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m43011() {
        return this.f56433;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43007(int i, int i2, int i3) {
        m43009(i, i2, i + i3, i3 + i2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m43009(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        int i5 = this.f56430;
        if (i5 != i || this.f56431 != i2) {
            mo36978(i5, this.f56431, i, i2);
        }
        this.f56430 = i3;
        this.f56431 = i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43006() {
        int i = this.f56430;
        int i2 = this.f56433;
        int i3 = this.f56432;
        if (i3 == i && i2 == this.f56431) {
            return;
        }
        mo36978(i, this.f56431, i3, i2);
        this.f56430 = i3;
        this.f56431 = i2;
    }
}
