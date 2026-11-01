package p067l;

/* JADX INFO: renamed from: l.ۧۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25I */
/* JADX INFO: loaded from: classes3.dex */
public final class C12749 implements Cloneable {

    /* JADX INFO: renamed from: ۙ */
    public C12749 f35804;

    /* JADX INFO: renamed from: ᩶ */
    public C12749 f35805;

    /* JADX INFO: renamed from: ᩸ */
    public int f35806;

    /* JADX INFO: renamed from: ᩹ */
    public int f35807;

    public C12749() {
    }

    public C12749(int i) {
        this.f35807 = i;
        this.f35806 = -1073741824;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12749 m29274() {
        if ((this.f35806 & 1073741824) != 0) {
            return null;
        }
        return this.f35805;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C12749 m29280() {
        if ((this.f35806 & Integer.MIN_VALUE) != 0) {
            return null;
        }
        return this.f35804;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m29284() {
        return (this.f35806 & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m29278() {
        return (this.f35806 & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29277(boolean z) {
        if (z) {
            this.f35806 |= 1073741824;
        } else {
            this.f35806 &= -1073741825;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m29282(boolean z) {
        if (z) {
            this.f35806 |= Integer.MIN_VALUE;
        } else {
            this.f35806 &= Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29276(C12749 c12749) {
        this.f35806 |= 1073741824;
        this.f35805 = c12749;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m29279(C12749 c12749) {
        this.f35806 |= Integer.MIN_VALUE;
        this.f35804 = c12749;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29275(int i) {
        this.f35806 = (i & 255) | (this.f35806 & (-256));
    }

    /* JADX INFO: renamed from: ܽ */
    public final C12749 m29281() {
        C12749 c12749 = this.f35804;
        if ((this.f35806 & Integer.MIN_VALUE) == 0) {
            while ((c12749.f35806 & 1073741824) == 0) {
                c12749 = c12749.f35805;
            }
        }
        return c12749;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C12749 m29283() {
        C12749 c12749 = this.f35805;
        if ((this.f35806 & 1073741824) == 0) {
            while ((c12749.f35806 & Integer.MIN_VALUE) == 0) {
                c12749 = c12749.f35804;
            }
        }
        return c12749;
    }

    public final C12749 clone() {
        try {
            C12749 c12749 = (C12749) super.clone();
            c12749.f35807 = this.f35807;
            c12749.f35806 = this.f35806;
            return c12749;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C12749) && this.f35807 == ((C12749) obj).f35807;
    }

    public final int hashCode() {
        return this.f35807;
    }

    public final String toString() {
        return String.valueOf(this.f35807);
    }
}
