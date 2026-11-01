package p067l;

/* JADX INFO: renamed from: l.ᩳܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19640 extends C24626 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C23663 f59696;

    /* JADX WARN: Illegal instructions before constructor call */
    public C19640(C23663 c23663, AbstractC6462 abstractC6462, InterfaceC6125 interfaceC6125) {
        this.f59696 = c23663;
        C11216 c11216 = c23663.f75339;
        C12826.requireNonNull(c11216);
        super(c11216, C17010.f50311, abstractC6462, interfaceC6125);
    }

    @Override // p067l.C24626
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 mo15456(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462) {
        AbstractC6462 abstractC6462M19463;
        if (abstractC6462.m14777(EnumC11353.DEFERRED)) {
            return ((C3423) abstractC6462).m6079((C24626) this);
        }
        AbstractC6462 abstractC6463 = this.f77965;
        C23663 c23663 = this.f59696;
        if (abstractC6462 != abstractC6463) {
            c23663.f75323.getClass();
            abstractC6462 = C8374.m19413(abstractC6462);
        }
        if (interfaceC5323 == null || interfaceC5323.mo11525() == null) {
            abstractC6462M19463 = c23663.f75323.m19463(abstractC6462);
        } else {
            abstractC6462M19463 = this.f77961.mo6098().m4251(interfaceC5323.mo11525(), abstractC6462, true);
        }
        return super.mo15456(interfaceC5323, c23663.f75325.m38363(interfaceC5323, abstractC6462M19463));
    }

    @Override // p067l.C24626
    /* JADX INFO: renamed from: ֫ */
    public final C24626 mo40740(AbstractC6462 abstractC6462) {
        return new C19640(this.f59696, abstractC6462, this.f77961);
    }

    @Override // p067l.C24626
    /* JADX INFO: renamed from: ֫ */
    public final C24626 mo40739(InterfaceC6125 interfaceC6125) {
        return new C19640(this.f59696, this.f77965, interfaceC6125);
    }
}
