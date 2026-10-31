package l;

/* JADX INFO: renamed from: l.ܺ᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: XAPS */
/* JADX INFO: loaded from: classes4.dex */
public final class C16257 extends C22336 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C19787 f50011;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f50012;

    public C16257(AbstractC23041 abstractC23041, int i, AbstractC16466 abstractC16466) {
        super(abstractC23041, i, abstractC16466, C2356.f7548);
        this.f50012 = false;
        this.f50011 = null;
    }

    public C16257(C16257 c16257, AbstractC23041 abstractC23041) {
        super(c16257, abstractC23041, c16257.f72391, c16257.f72394);
        this.f50011 = c16257.f50011;
        this.f50012 = m38228(c16257, abstractC23041);
    }

    public C16257(C16257 c16257, AbstractC23041 abstractC23041, C19787 c19787) {
        super(c16257, abstractC23041, c16257.f72391, c16257.f72394);
        this.f50011 = c19787;
        this.f50012 = m38228(c16257, abstractC23041);
    }

    public C16257(C16257 c16257, AbstractC23041 abstractC23041, AbstractC16466 abstractC16466) {
        super(c16257, abstractC23041, abstractC16466, c16257.f72394);
        this.f50011 = c16257.f50011;
        this.f50012 = m38228(c16257, abstractC23041);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19787 m38229() {
        return this.f50011;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m38231() {
        return this.f50012;
    }

    @Override // l.C22336
    public final int hashCode() {
        return C2093.m6873(C2093.m6874(C2093.m6876(C2093.m6874(C2093.m6874(C2093.m6876(C2093.m6876(7, this.f72393.f74153), this.f72390), this.f72391), this.f72394), this.f50012 ? 1 : 0), this.f50011), 6);
    }

    @Override // l.C22336
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo38230(C22336 c22336) {
        boolean zEquals = true;
        if (this == c22336) {
            return true;
        }
        if (!(c22336 instanceof C16257)) {
            return false;
        }
        C16257 c16257 = (C16257) c22336;
        if (this.f50012 != c16257.f50012) {
            return false;
        }
        C19787 c19787 = c16257.f50011;
        C19787 c19788 = this.f50011;
        if (c19788 != null) {
            zEquals = c19788.equals(c19787);
        } else if (c19787 != null) {
            zEquals = false;
        }
        if (zEquals) {
            return super.mo38230(c22336);
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38228(C16257 c16257, AbstractC23041 abstractC23041) {
        if (c16257.f50012) {
            return true;
        }
        return (abstractC23041 instanceof AbstractC7086) && ((AbstractC7086) abstractC23041).f21788;
    }
}
