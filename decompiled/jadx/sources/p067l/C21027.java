package p067l;

/* JADX INFO: renamed from: l.᩵ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BA1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21027 extends C20376 {

    /* JADX INFO: renamed from: ۙ */
    public final C22388 f65996;

    /* JADX INFO: renamed from: ᩶ */
    public final C22388 f65997;

    /* JADX INFO: renamed from: ᩹ */
    public int f65998;

    public C21027(int i) {
        super(true);
        this.f65996 = new C22388(i);
        this.f65997 = new C22388(i + 1);
        this.f65998 = i;
    }

    @Override // p067l.C20376
    /* JADX INFO: renamed from: ܺ */
    public final void mo22326() {
        this.f65996.mo22326();
        this.f65997.mo22326();
        super.mo22326();
    }

    public final int size() {
        return this.f65998;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m47440(int i) {
        return this.f65997.get(i);
    }

    /* JADX INFO: renamed from: ۚ */
    public final int m47441() {
        return this.f65997.get(this.f65998);
    }

    /* JADX INFO: renamed from: ֨ */
    public final C22388 m47439() {
        return this.f65997;
    }

    /* JADX INFO: renamed from: ۠ */
    public final C22388 m47442() {
        return this.f65996;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47443(int i) {
        m46001();
        if (i < 0) {
            throw new IllegalArgumentException("target < 0");
        }
        C22388 c22388 = this.f65997;
        if (c22388.size() != this.f65998) {
            throw new RuntimeException("non-default elements not all set");
        }
        c22388.add(i);
    }

    public final void add(int i, int i2) {
        m46001();
        if (i2 < 0) {
            throw new IllegalArgumentException("target < 0");
        }
        this.f65996.add(i);
        this.f65997.add(i2);
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m47444() {
        C22388 c22388;
        m46001();
        int i = this.f65998;
        C22388 c22389 = this.f65997;
        if (i != c22389.size() - 1) {
            throw new IllegalArgumentException("incomplete instance");
        }
        int i2 = c22389.get(i);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            c22388 = this.f65996;
            if (i3 >= i) {
                break;
            }
            int i5 = c22389.get(i3);
            if (i5 != i2) {
                if (i3 != i4) {
                    c22389.set(i4, i5);
                    c22388.set(i4, c22388.get(i3));
                }
                i4++;
            }
            i3++;
        }
        if (i4 != i) {
            c22388.m50248(i4);
            c22389.set(i4, i2);
            c22389.m50248(i4 + 1);
            this.f65998 = i4;
        }
    }
}
