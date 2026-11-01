package p067l;

/* JADX INFO: renamed from: l.ܿۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC18695 extends C16012 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC19740 f55833;

    /* JADX INFO: renamed from: ۤ */
    public final AbstractC10564 f55834;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C21378 f55835;

    /* JADX INFO: renamed from: ۬ */
    public final C5771 f55836;

    /* JADX WARN: Illegal instructions before constructor call */
    public RunnableC18695(C21378 c21378, C5771 c5771, AbstractC10564 abstractC10564) {
        this.f55835 = c21378;
        AbstractC7783 abstractC7783 = c21378.f67402;
        super(c21378, abstractC7783.f20405 == EnumC3600.f7343 ? abstractC7783.m17990() : (C15828) abstractC7783);
        this.f55833 = c21378.f67397;
        this.f55836 = c5771;
        this.f55834 = abstractC10564;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C21378 c21378 = this.f55835;
        InterfaceC19740 interfaceC19740 = c21378.f67397;
        try {
            C5771 c5771 = this.f55836;
            c5771.f14175 = null;
            c21378.f67397 = this.f55833;
            c5771.f14175 = m36390(c5771.f20406.mo14787(), this.f55834);
        } finally {
            c21378.f67397 = interfaceC19740;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" ClassReader store default for ");
        C5771 c5771 = this.f55836;
        sb.append(c5771.f20407);
        sb.append(".");
        sb.append(c5771);
        sb.append(" is ");
        sb.append(this.f55834);
        return sb.toString();
    }
}
