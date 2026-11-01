package p067l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ܿ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes5.dex */
public final class C19163 extends AbstractC9105 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ComponentCallbacksC11117 f57255;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC1885 f57256;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ AbstractC1920 f57257;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ InterfaceC1677 f57258;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ AtomicReference f57259;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19163(ComponentCallbacksC11117 componentCallbacksC11117, InterfaceC1677 interfaceC1677, AtomicReference atomicReference, AbstractC1920 abstractC1920, InterfaceC1885 interfaceC1885) {
        super(0);
        this.f57255 = componentCallbacksC11117;
        this.f57258 = interfaceC1677;
        this.f57259 = atomicReference;
        this.f57257 = abstractC1920;
        this.f57256 = interfaceC1885;
    }

    @Override // p067l.AbstractC9105
    /* JADX INFO: renamed from: ֫ */
    public final void mo21042() {
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f57255;
        this.f57259.set(((AbstractC1815) this.f57258.mo41849(null)).m47353(componentCallbacksC11117.generateActivityResultKey(), componentCallbacksC11117, this.f57257, this.f57256));
    }
}
