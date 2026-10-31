package l;

/* JADX INFO: renamed from: l.ۧۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25I */
/* JADX INFO: loaded from: classes3.dex */
public final class C10922 implements Cloneable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C10922 f32826;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C10922 f32827;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f32828;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f32829;

    public C10922() {
    }

    public C10922(int i) {
        this.f32829 = i;
        this.f32828 = -1073741824;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10922 m27229() {
        if ((this.f32828 & 1073741824) != 0) {
            return null;
        }
        return this.f32827;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C10922 m27235() {
        if ((this.f32828 & Integer.MIN_VALUE) != 0) {
            return null;
        }
        return this.f32826;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m27239() {
        return (this.f32828 & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m27233() {
        return (this.f32828 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27232(boolean z) {
        if (z) {
            this.f32828 |= 1073741824;
        } else {
            this.f32828 &= -1073741825;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m27237(boolean z) {
        if (z) {
            this.f32828 |= Integer.MIN_VALUE;
        } else {
            this.f32828 &= Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27231(C10922 c10922) {
        this.f32828 |= 1073741824;
        this.f32827 = c10922;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27234(C10922 c10922) {
        this.f32828 |= Integer.MIN_VALUE;
        this.f32826 = c10922;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27230(int i) {
        this.f32828 = (i & 255) | (this.f32828 & (-256));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C10922 m27236() {
        C10922 c10922 = this.f32826;
        if ((this.f32828 & Integer.MIN_VALUE) == 0) {
            while ((c10922.f32828 & 1073741824) == 0) {
                c10922 = c10922.f32827;
            }
        }
        return c10922;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10922 m27238() {
        C10922 c10922 = this.f32827;
        if ((this.f32828 & 1073741824) == 0) {
            while ((c10922.f32828 & Integer.MIN_VALUE) == 0) {
                c10922 = c10922.f32826;
            }
        }
        return c10922;
    }

    public final C10922 clone() {
        try {
            C10922 c10922 = (C10922) super.clone();
            c10922.f32829 = this.f32829;
            c10922.f32828 = this.f32828;
            return c10922;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C10922) && this.f32829 == ((C10922) obj).f32829;
    }

    public final int hashCode() {
        return this.f32829;
    }

    public final String toString() {
        return String.valueOf(this.f32829);
    }
}
