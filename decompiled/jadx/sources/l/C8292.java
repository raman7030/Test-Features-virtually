package l;

/* JADX INFO: renamed from: l.۠ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAFC */
/* JADX INFO: loaded from: classes3.dex */
public final class C8292 implements InterfaceC2648 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15346 f25475;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16594 f25476;

    public C8292(C15346 c15346, C16594 c16594) {
        this.f25475 = c15346;
        this.f25476 = c16594;
    }

    @Override // l.InterfaceC2648
    /* JADX INFO: renamed from: ֫ */
    public final Object mo8320(C16594 c16594) {
        C16594 c16595 = this.f25476;
        boolean zM39093 = c16594.m39093(c16595);
        C15346 c15346M36378 = this.f25475;
        if (!zM39093) {
            C15346.f47017.mo7087(c16594.m39092(), "Re-routing the connection to host {}");
            c15346M36378 = c15346M36378.m36378(c16594);
        }
        if (c16594.m39095(c16595)) {
            return null;
        }
        return c15346M36378.m36376(c16594.m39096());
    }
}
