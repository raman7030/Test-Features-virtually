package p067l;

/* JADX INFO: renamed from: l.ۗۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBAF */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5289 extends AbstractC4619 implements Comparable {

    /* JADX INFO: renamed from: ۙ */
    public int f12443;

    /* JADX INFO: renamed from: ᩶ */
    public int f12444;

    /* JADX INFO: renamed from: ᩸ */
    public C6630 f12445;

    /* JADX INFO: renamed from: ᩹ */
    public final int f12446;

    /* JADX INFO: renamed from: ۢ */
    public abstract String mo5193();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo5194(C3948 c3948, C19705 c19705);

    /* JADX INFO: renamed from: ۧ */
    public void mo5195(C6630 c6630, int i) {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC5289 abstractC5289 = (AbstractC5289) obj;
        if (this == abstractC5289) {
            return 0;
        }
        EnumC5960 enumC5960Mo5191 = mo5191();
        EnumC5960 enumC5960Mo5192 = abstractC5289.mo5191();
        if (enumC5960Mo5191 != enumC5960Mo5192) {
            return enumC5960Mo5191.compareTo(enumC5960Mo5192);
        }
        return mo5190(abstractC5289);
    }

    public AbstractC5289(int i, int i2) {
        if (i <= 0 || ((i - 1) & i) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("writeSize < -1");
        }
        this.f12446 = i;
        this.f12443 = i2;
        this.f12445 = null;
        this.f12444 = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AbstractC5289 abstractC5289 = (AbstractC5289) obj;
        return mo5191() == abstractC5289.mo5191() && mo5190(abstractC5289) == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11431(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("writeSize < 0");
        }
        if (this.f12443 >= 0) {
            throw new UnsupportedOperationException("writeSize already set");
        }
        this.f12443 = i;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ۧ */
    public final int mo5704() {
        int i = this.f12443;
        if (i >= 0) {
            return i;
        }
        throw new UnsupportedOperationException("writeSize is unknown");
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5703(C3948 c3948, C19705 c19705) {
        c19705.m44759(this.f12446);
        try {
            if (this.f12443 < 0) {
                throw new UnsupportedOperationException("writeSize is unknown");
            }
            c19705.m44768(m11432());
            mo5194(c3948, c19705);
        } catch (RuntimeException e) {
            throw C10101.m23569("...while writing " + this, e);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m11432() {
        int i = this.f12444;
        if (i < 0) {
            throw new RuntimeException("offset not yet known");
        }
        return this.f12445.m18443(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m11430(C6630 c6630, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (this.f12445 != null) {
            throw new RuntimeException("already written");
        }
        int i2 = this.f12446 - 1;
        int i3 = (i + i2) & (~i2);
        this.f12445 = c6630;
        this.f12444 = i3;
        mo5195(c6630, i3);
        return i3;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m11434() {
        return this.f12446;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m11433() {
        return "[" + Integer.toHexString(m11432()) + ']';
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo5190(AbstractC5289 abstractC5289) {
        throw new UnsupportedOperationException("unsupported");
    }
}
