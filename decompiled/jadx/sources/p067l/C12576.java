package p067l;

/* JADX INFO: renamed from: l.ۧۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes4.dex */
public final class C12576 extends AbstractC10564 {

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6462 f35337;

    @Override // p067l.AbstractC10564
    /* JADX INFO: renamed from: ֫ */
    public final void mo7611(InterfaceC11235 interfaceC11235) {
        interfaceC11235.mo26025(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C12576(AbstractC6462 abstractC6462, C8374 c8374) {
        AbstractC6462 abstractC6462M19459;
        if (abstractC6462.mo14805()) {
            abstractC6462M19459 = c8374.m19436(abstractC6462).f20406;
        } else {
            abstractC6462M19459 = c8374.m19459(abstractC6462);
        }
        super(new C21333(c8374.f22480.f69196.f16705, c8374.f22480.f69196.mo7201(), C4848.m10276of((Object) abstractC6462M19459)));
        this.f35337 = abstractC6462;
    }

    @Override // p067l.InterfaceC12404
    public final String toString() {
        return this.f35337 + ".class";
    }

    @Override // p067l.AbstractC10564, p067l.InterfaceC12404
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7610(InterfaceC8380 interfaceC8380) {
        return Boolean.FALSE;
    }
}
