package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ܿ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes5.dex */
public final class C17671 extends AbstractC7088 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ComponentCallbacksC9205 f54062;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC21030 f54063;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21735 f54064;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC16837 f54065;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f54066;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17671(ComponentCallbacksC9205 componentCallbacksC9205, InterfaceC16837 interfaceC16837, AtomicReference atomicReference, AbstractC21735 abstractC21735, InterfaceC21030 interfaceC21030) {
        super(0);
        this.f54062 = componentCallbacksC9205;
        this.f54065 = interfaceC16837;
        this.f54066 = atomicReference;
        this.f54064 = abstractC21735;
        this.f54063 = interfaceC21030;
    }

    @Override // l.AbstractC7088
    /* JADX INFO: renamed from: ֫ */
    public final void mo19084() {
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f54062;
        this.f54066.set(((AbstractC19619) this.f54065.mo39613(null)).m45057(componentCallbacksC9205.generateActivityResultKey(), componentCallbacksC9205, this.f54064, this.f54063));
    }
}
