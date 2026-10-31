package l;

import java.util.List;

/* JADX INFO: renamed from: l.۟֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G3L1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7136 extends AbstractC18632 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC11370 f21918;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16514 f21919;

    public C7136(C16514 c16514, EnumC11370 enumC11370) {
        this.f21919 = c16514;
        this.f21918 = enumC11370;
    }

    @Override // l.AbstractC18632
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo19151(InterfaceC8754 interfaceC8754, AbstractC9460 abstractC9460, AbstractC9460 abstractC9461, Object obj) {
        AbstractC1698 abstractC1698 = (AbstractC1698) abstractC9460;
        AbstractC1698 abstractC1699 = (AbstractC1698) abstractC9461;
        if (!(abstractC1699 instanceof C22658) || ((C22658) abstractC1699).f73170 == this.f21918) {
            return;
        }
        ((List) abstractC1698.f5886.get(interfaceC8754)).remove(abstractC1699);
    }

    @Override // l.AbstractC18632
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo19152(AbstractC9460 abstractC9460, Object obj) {
        AbstractC1698 abstractC1698 = (AbstractC1698) abstractC9460;
        if (!(abstractC1698 instanceof C22658) || ((C22658) abstractC1698).f73170 == this.f21918) {
            return;
        }
        this.f21919.f50745.remove(abstractC1698.f28700);
    }
}
