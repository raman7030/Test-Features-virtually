package p067l;

/* JADX INFO: renamed from: l.ᩳܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes5.dex */
public class C19653 extends AbstractC23696 {

    /* JADX INFO: renamed from: ۧ */
    public C14978 f59779;

    @Override // p067l.AbstractC23696
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12335(InterfaceC13638 interfaceC13638) {
        return ((InterfaceC22336) interfaceC13638).mo34327(1);
    }

    @Override // p067l.AbstractC23696
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12334(int i, InterfaceC13638 interfaceC13638) {
        C5591 c5591 = new C5591(i, i == -1 ? "<missing EOF>" : C10965.m25286(new StringBuilder("<missing "), C15673.f45109[i], ">"));
        InterfaceC22336 interfaceC22336 = (InterfaceC22336) interfaceC13638;
        InterfaceC8924 interfaceC8924Mo34327 = interfaceC22336.mo34327(1);
        if (interfaceC8924Mo34327.getType() == -1) {
            interfaceC8924Mo34327 = interfaceC22336.mo34327(-1);
        }
        c5591.f13531 = interfaceC8924Mo34327.getLine();
        c5591.f13539 = interfaceC8924Mo34327.mo12370();
        c5591.f13538 = 0;
        c5591.f13532 = interfaceC8924Mo34327.getInputStream();
        return c5591;
    }
}
