package p067l;

/* JADX INFO: renamed from: l.ܽۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05OO */
/* JADX INFO: loaded from: classes4.dex */
public final class C17951 implements Cloneable {

    /* JADX INFO: renamed from: ۗ */
    public int f53618;

    /* JADX INFO: renamed from: ۙ */
    public int f53619;

    /* JADX INFO: renamed from: ۬ */
    public int f53620;

    /* JADX INFO: renamed from: ᩶ */
    public int f53621;

    /* JADX INFO: renamed from: ᩸ */
    public int f53622;

    /* JADX INFO: renamed from: ᩹ */
    public int f53623;

    /* JADX INFO: renamed from: ۧ */
    public final void m40845(C9196 c9196) {
        this.f53618 = c9196.m21176();
        this.f53622 = c9196.m21171();
        this.f53620 = c9196.m21180();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40844(C9196 c9196) {
        this.f53621 = c9196.m21176();
        this.f53623 = c9196.m21171();
        this.f53619 = c9196.m21180();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m40851() {
        return this.f53618;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m40846(int i) {
        this.f53618 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40842() {
        return this.f53622;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40843(int i) {
        this.f53622 = i;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m40849() {
        return this.f53620;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m40852(int i) {
        this.f53621 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m40848(int i) {
        this.f53623 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m40847() {
        return this.f53619;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m40850(int i) {
        this.f53619 = i;
    }

    public final String toString() {
        return String.valueOf(this.f53618) + ':' + this.f53622 + '-' + this.f53621 + ':' + this.f53623;
    }

    public final C17951 clone() {
        C17951 c17951 = new C17951();
        c17951.f53618 = this.f53618;
        c17951.f53622 = this.f53622;
        c17951.f53620 = this.f53620;
        c17951.f53621 = this.f53621;
        c17951.f53623 = this.f53623;
        c17951.f53619 = this.f53619;
        return c17951;
    }
}
