package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.۟֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G3L1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9150 extends AbstractC20076 {

    /* JADX INFO: renamed from: ֫ */
    public EnumC13174 f24797;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C18063 f24798;

    public C9150(C18063 c18063, EnumC13174 enumC13174) {
        this.f24798 = c18063;
        this.f24797 = enumC13174;
    }

    @Override // p067l.AbstractC20076
    /* JADX INFO: renamed from: ֫ */
    public final void mo21094(InterfaceC10688 interfaceC10688, AbstractC11359 abstractC11359, AbstractC11359 abstractC113510, Object obj) {
        AbstractC3982 abstractC3982 = (AbstractC3982) abstractC11359;
        AbstractC3982 abstractC3983 = (AbstractC3982) abstractC113510;
        if (!(abstractC3983 instanceof C23902) || ((C23902) abstractC3983).f75896 == this.f24797) {
            return;
        }
        ((List) abstractC3982.f8665.get(interfaceC10688)).remove(abstractC3983);
    }

    @Override // p067l.AbstractC20076
    /* JADX INFO: renamed from: ֫ */
    public final void mo21095(AbstractC11359 abstractC11359, Object obj) {
        AbstractC3982 abstractC3982 = (AbstractC3982) abstractC11359;
        if (!(abstractC3982 instanceof C23902) || ((C23902) abstractC3982).f75896 == this.f24797) {
            return;
        }
        this.f24798.f53924.remove(abstractC3982.f31649);
    }
}
