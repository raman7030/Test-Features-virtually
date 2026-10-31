package l;

/* JADX INFO: renamed from: l.ᩳܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes5.dex */
public class C18187 extends AbstractC22441 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C13268 f56566;

    @Override // l.AbstractC22441
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10298(InterfaceC11858 interfaceC11858) {
        return ((InterfaceC21010) interfaceC11858).mo32228(1);
    }

    @Override // l.AbstractC22441
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10297(int i, InterfaceC11858 interfaceC11858) {
        C3391 c3391 = new C3391(i, i == -1 ? "<missing EOF>" : C9045.m23341(new StringBuilder("<missing "), C13999.f42026[i], ">"));
        InterfaceC21010 interfaceC21010 = (InterfaceC21010) interfaceC11858;
        InterfaceC6898 interfaceC6898Mo32228 = interfaceC21010.mo32228(1);
        if (interfaceC6898Mo32228.getType() == -1) {
            interfaceC6898Mo32228 = interfaceC21010.mo32228(-1);
        }
        c3391.f10724 = interfaceC6898Mo32228.getLine();
        c3391.f10732 = interfaceC6898Mo32228.mo10331();
        c3391.f10731 = 0;
        c3391.f10725 = interfaceC6898Mo32228.getInputStream();
        return c3391;
    }
}
