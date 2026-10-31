package l;

/* JADX INFO: renamed from: l.᩵ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BA1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19632 extends C18947 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21064 f63376;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21064 f63377;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f63378;

    public C19632(int i) {
        super(true);
        this.f63376 = new C21064(i);
        this.f63377 = new C21064(i + 1);
        this.f63378 = i;
    }

    @Override // l.C18947
    /* JADX INFO: renamed from: ܺ */
    public final void mo20349() {
        this.f63376.mo20349();
        this.f63377.mo20349();
        super.mo20349();
    }

    public final int size() {
        return this.f63378;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m45144(int i) {
        return this.f63377.get(i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m45145() {
        return this.f63377.get(this.f63378);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C21064 m45143() {
        return this.f63377;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C21064 m45146() {
        return this.f63376;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45147(int i) {
        m43734();
        if (i < 0) {
            throw new IllegalArgumentException("target < 0");
        }
        C21064 c21064 = this.f63377;
        if (c21064.size() != this.f63378) {
            throw new RuntimeException("non-default elements not all set");
        }
        c21064.add(i);
    }

    public final void add(int i, int i2) {
        m43734();
        if (i2 < 0) {
            throw new IllegalArgumentException("target < 0");
        }
        this.f63376.add(i);
        this.f63377.add(i2);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m45148() {
        C21064 c21064;
        m43734();
        int i = this.f63378;
        C21064 c21065 = this.f63377;
        if (i != c21065.size() - 1) {
            throw new IllegalArgumentException("incomplete instance");
        }
        int i2 = c21065.get(i);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            c21064 = this.f63376;
            if (i3 >= i) {
                break;
            }
            int i5 = c21065.get(i3);
            if (i5 != i2) {
                if (i3 != i4) {
                    c21065.set(i4, i5);
                    c21064.set(i4, c21064.get(i3));
                }
                i4++;
            }
            i3++;
        }
        if (i4 != i) {
            c21064.m47918(i4);
            c21065.set(i4, i2);
            c21065.m47918(i4 + 1);
            this.f63378 = i4;
        }
    }
}
