package l;

/* JADX INFO: renamed from: l.ۡ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8BL */
/* JADX INFO: loaded from: classes4.dex */
public final class C8525 extends C0637 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15579 f26041;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8525(C15579 c15579) {
        super(InterfaceC5577.f17276);
        this.f26041 = c15579;
    }

    @Override // l.C0637, l.InterfaceC19689
    /* JADX INFO: renamed from: ۧ */
    public final void mo2597(C11197 c11197, Exception exc) {
        boolean zM7191 = C2175.m7191(exc);
        C15579 c15579 = this.f26041;
        if (!zM7191 && !c15579.f48008 && !c15579.mo15853()) {
            C15579.m36741(c15579, c11197, c15579.f48005, c15579.f48003, c15579.f47999);
            return;
        }
        c15579.f48007 = false;
        c15579.f47998 = false;
        super.mo2597(c11197, exc);
    }

    @Override // l.C0637, l.InterfaceC19689
    /* JADX INFO: renamed from: ֫ */
    public final void mo2593(C11197 c11197, Exception exc) {
        C15579 c15579 = this.f26041;
        if (!c15579.f48008 && !c15579.mo15853()) {
            C15579.m36741(c15579, c11197, c15579.f48005, c15579.f48003, c15579.f47999);
            return;
        }
        c15579.f48007 = false;
        c15579.f47998 = false;
        super.mo2593(c11197, exc);
    }

    @Override // l.C0637, l.InterfaceC19689
    /* JADX INFO: renamed from: ֫ */
    public final void mo2594(C11197 c11197, C15495 c15495, long j) {
        C15579 c15579 = this.f26041;
        c15579.f48007 = false;
        c15579.f47998 = true;
        super.mo2594(c11197, c15495, j);
    }
}
