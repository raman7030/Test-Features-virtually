package l;

/* JADX INFO: renamed from: l.᩻ۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7704 */
/* JADX INFO: loaded from: classes.dex */
public final class C23619 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f76533;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f76534;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f76535;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f76536;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f76537;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f76538;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C6686 f76539;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52105(C6686 c6686, int i, int i2) {
        c6686.m18225(i, i2);
        if (i == i2) {
            throw new IllegalArgumentException("Empty syntax context cursor range");
        }
        this.f76539 = c6686;
        this.f76538 = i2;
        this.f76537 = c6686.f20768.m42008(i - c6686.f20772);
        m52103(i);
        this.f76533 = true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m52109() {
        if (!this.f76533 || this.f76534 >= this.f76538) {
            this.f76533 = false;
            return false;
        }
        this.f76537++;
        m52103(this.f76539.f20772 + this.f76539.f20768.m42009(this.f76537));
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m52108() {
        this.f76539 = null;
        this.f76533 = false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m52107() {
        return this.f76535;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m52104() {
        return this.f76534;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m52106() {
        return this.f76536;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52103(int i) {
        this.f76535 = i;
        this.f76534 = Math.min(this.f76538, this.f76539.f20772 + this.f76539.f20768.m42017(this.f76537));
        this.f76536 = this.f76539.f20768.m42016(this.f76537);
    }
}
