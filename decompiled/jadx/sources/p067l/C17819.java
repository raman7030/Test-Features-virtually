package p067l;

/* JADX INFO: renamed from: l.ܺ᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: XAPS */
/* JADX INFO: loaded from: classes4.dex */
public final class C17819 extends C23596 {

    /* JADX INFO: renamed from: ܳ */
    public final C21174 f53180;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean f53181;

    public C17819(AbstractC24266 abstractC24266, int i, AbstractC18017 abstractC18017) {
        super(abstractC24266, i, abstractC18017, C4607.f10339);
        this.f53181 = false;
        this.f53180 = null;
    }

    public C17819(C17819 c17819, AbstractC24266 abstractC24266) {
        super(c17819, abstractC24266, c17819.f75117, c17819.f75120);
        this.f53180 = c17819.f53180;
        this.f53181 = m40442(c17819, abstractC24266);
    }

    public C17819(C17819 c17819, AbstractC24266 abstractC24266, C21174 c21174) {
        super(c17819, abstractC24266, c17819.f75117, c17819.f75120);
        this.f53180 = c21174;
        this.f53181 = m40442(c17819, abstractC24266);
    }

    public C17819(C17819 c17819, AbstractC24266 abstractC24266, AbstractC18017 abstractC18017) {
        super(c17819, abstractC24266, abstractC18017, c17819.f75120);
        this.f53180 = c17819.f53180;
        this.f53181 = m40442(c17819, abstractC24266);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21174 m40443() {
        return this.f53180;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m40445() {
        return this.f53181;
    }

    @Override // p067l.C23596
    public final int hashCode() {
        return C4358.m8999(C4358.m9000(C4358.m9002(C4358.m9000(C4358.m9000(C4358.m9002(C4358.m9002(7, this.f75119.f76895), this.f75116), this.f75117), this.f75120), this.f53181 ? 1 : 0), this.f53180), 6);
    }

    @Override // p067l.C23596
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo40444(C23596 c23596) {
        boolean zEquals = true;
        if (this == c23596) {
            return true;
        }
        if (!(c23596 instanceof C17819)) {
            return false;
        }
        C17819 c17819 = (C17819) c23596;
        if (this.f53181 != c17819.f53181) {
            return false;
        }
        C21174 c21174 = c17819.f53180;
        C21174 c21175 = this.f53180;
        if (c21175 != null) {
            zEquals = c21175.equals(c21174);
        } else if (c21174 != null) {
            zEquals = false;
        }
        if (zEquals) {
            return super.mo40444(c23596);
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m40442(C17819 c17819, AbstractC24266 abstractC24266) {
        if (c17819.f53181) {
            return true;
        }
        return (abstractC24266 instanceof AbstractC9103) && ((AbstractC9103) abstractC24266).f24669;
    }
}
