package l;

/* JADX INFO: renamed from: l.ۧۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes4.dex */
public final class C10741 extends AbstractC8624 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f32362;

    @Override // l.AbstractC8624
    /* JADX INFO: renamed from: ֫ */
    public final void mo5382(InterfaceC9330 interfaceC9330) {
        interfaceC9330.mo24016(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C10741(AbstractC4308 abstractC4308, C6319 c6319) {
        AbstractC4308 abstractC4308M17519;
        if (abstractC4308.mo12941()) {
            abstractC4308M17519 = c6319.m17496(abstractC4308).f17560;
        } else {
            abstractC4308M17519 = c6319.m17519(abstractC4308);
        }
        super(new C19955(c6319.f19609.f66514.f13890, c6319.f19609.f66514.mo4958(), C2609.of((Object) abstractC4308M17519)));
        this.f32362 = abstractC4308;
    }

    @Override // l.InterfaceC10559
    public final String toString() {
        return this.f32362 + ".class";
    }

    @Override // l.AbstractC8624, l.InterfaceC10559
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5381(InterfaceC6325 interfaceC6325) {
        return Boolean.FALSE;
    }
}
