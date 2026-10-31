package l;

/* JADX INFO: renamed from: l.ۗۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBAF */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3073 extends AbstractC2368 implements Comparable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f9640;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f9641;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C4484 f9642;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f9643;

    /* JADX INFO: renamed from: ۢ */
    public abstract String mo2864();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo2865(C1662 c1662, C18241 c18241);

    /* JADX INFO: renamed from: ۧ */
    public void mo2866(C4484 c4484, int i) {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC3073 abstractC3073 = (AbstractC3073) obj;
        if (this == abstractC3073) {
            return 0;
        }
        EnumC3779 enumC3779Mo2862 = mo2862();
        EnumC3779 enumC3779Mo2863 = abstractC3073.mo2862();
        if (enumC3779Mo2862 != enumC3779Mo2863) {
            return enumC3779Mo2862.compareTo(enumC3779Mo2863);
        }
        return mo2861(abstractC3073);
    }

    public AbstractC3073(int i, int i2) {
        if (i <= 0 || ((i - 1) & i) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("writeSize < -1");
        }
        this.f9643 = i;
        this.f9640 = i2;
        this.f9642 = null;
        this.f9641 = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AbstractC3073 abstractC3073 = (AbstractC3073) obj;
        return mo2862() == abstractC3073.mo2862() && mo2861(abstractC3073) == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9389(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("writeSize < 0");
        }
        if (this.f9640 >= 0) {
            throw new UnsupportedOperationException("writeSize already set");
        }
        this.f9640 = i;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ۧ */
    public final int mo3385() {
        int i = this.f9640;
        if (i >= 0) {
            return i;
        }
        throw new UnsupportedOperationException("writeSize is unknown");
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo3384(C1662 c1662, C18241 c18241) {
        c18241.m42500(this.f9643);
        try {
            if (this.f9640 < 0) {
                throw new UnsupportedOperationException("writeSize is unknown");
            }
            c18241.m42509(m9390());
            mo2865(c1662, c18241);
        } catch (RuntimeException e) {
            throw C8136.m21601("...while writing " + this, e);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m9390() {
        int i = this.f9641;
        if (i < 0) {
            throw new RuntimeException("offset not yet known");
        }
        return this.f9642.m16517(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m9388(C4484 c4484, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (this.f9642 != null) {
            throw new RuntimeException("already written");
        }
        int i2 = this.f9643 - 1;
        int i3 = (i + i2) & (~i2);
        this.f9642 = c4484;
        this.f9641 = i3;
        mo2866(c4484, i3);
        return i3;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m9392() {
        return this.f9643;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m9391() {
        return "[" + Integer.toHexString(m9390()) + ']';
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo2861(AbstractC3073 abstractC3073) {
        throw new UnsupportedOperationException("unsupported");
    }
}
