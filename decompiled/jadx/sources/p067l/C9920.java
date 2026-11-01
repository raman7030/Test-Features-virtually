package p067l;

/* JADX INFO: renamed from: l.۠ۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S1VF */
/* JADX INFO: loaded from: classes3.dex */
public final class C9920 extends AbstractC5050 implements InterfaceC10825, InterfaceC4790 {

    /* JADX INFO: renamed from: ۧ */
    public final C7198 f27482;

    public C9920(C7198 c7198) {
        super(2);
        this.f27482 = c7198;
    }

    @Override // p067l.AbstractC5050, p067l.InterfaceC10825
    /* JADX INFO: renamed from: ֫ */
    public final void mo3627(C5187 c5187) {
        if (this.f27482.m16539(c5187.m48106())) {
            return;
        }
        c5187.mo14967((Object) c5187.m48106());
    }

    @Override // p067l.AbstractC5050, p067l.InterfaceC4790
    /* JADX INFO: renamed from: ֫ */
    public final void mo5457(C5187 c5187, C14574 c14574) {
        if (this.f27482.m16540(c14574.m14973())) {
            return;
        }
        String strM14973 = c14574.m14973();
        InterfaceC20213 interfaceC20213M39206 = C17295.m39206(c14574);
        if (!(interfaceC20213M39206 instanceof C21991)) {
            interfaceC20213M39206.mo14967(new C21991(strM14973));
        } else {
            ((C21991) interfaceC20213M39206).mo14967(strM14973);
        }
    }

    @Override // p067l.AbstractC5050, p067l.InterfaceC4790
    /* JADX INFO: renamed from: ֫ */
    public final void mo5456(C5187 c5187, C11893 c11893) {
        if (!EnumC17248.NATIVE.m39032(c11893.m14971())) {
            if (this.f27482.m16540(c11893.m14973())) {
                return;
            }
            m23216(c11893);
        } else {
            c5187.mo14967((Object) c5187.m48106());
            m23216(c11893);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m23216(AbstractC13904 abstractC13904) {
        String strM14973 = abstractC13904.m14973();
        if (C24158.m53423(strM14973)) {
            return;
        }
        InterfaceC20213 interfaceC20213M39206 = C17295.m39206(abstractC13904);
        if (!(interfaceC20213M39206 instanceof C21991)) {
            interfaceC20213M39206.mo14967(new C21991(strM14973));
        } else {
            ((C21991) interfaceC20213M39206).mo14967(strM14973);
        }
    }
}
