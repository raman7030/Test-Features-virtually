package l;

/* JADX INFO: renamed from: l.ܿۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC17179 extends C14356 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18278 f52652;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC8624 f52653;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f52654;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C3581 f52655;

    /* JADX WARN: Illegal instructions before constructor call */
    public RunnableC17179(C20002 c20002, C3581 c3581, AbstractC8624 abstractC8624) {
        this.f52654 = c20002;
        AbstractC5698 abstractC5698 = c20002.f64760;
        super(c20002, abstractC5698.f17559 == EnumC1296.f4571 ? abstractC5698.m16071() : (C14163) abstractC5698);
        this.f52652 = c20002.f64755;
        this.f52655 = c3581;
        this.f52653 = abstractC8624;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C20002 c20002 = this.f52654;
        InterfaceC18278 interfaceC18278 = c20002.f64755;
        try {
            C3581 c3581 = this.f52655;
            c3581.f11370 = null;
            c20002.f64755 = this.f52652;
            c3581.f11370 = m34257(c3581.f17560.mo12923(), this.f52653);
        } finally {
            c20002.f64755 = interfaceC18278;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" ClassReader store default for ");
        C3581 c3581 = this.f52655;
        sb.append(c3581.f17561);
        sb.append(".");
        sb.append(c3581);
        sb.append(" is ");
        sb.append(this.f52653);
        return sb.toString();
    }
}
