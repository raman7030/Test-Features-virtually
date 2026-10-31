package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۛܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes3.dex */
public final class C6110 extends AbstractC9741 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f18727;

    public C6110(AtomicReference atomicReference) {
        this.f18727 = atomicReference;
    }

    @Override // l.AbstractC9741
    /* JADX INFO: renamed from: ֫ */
    public final void mo8405(Object obj) {
        AbstractC9741 abstractC9741 = (AbstractC9741) this.f18727.get();
        if (abstractC9741 == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        abstractC9741.mo8405(obj);
    }

    @Override // l.AbstractC9741
    /* JADX INFO: renamed from: ֫ */
    public final void mo8404() {
        AbstractC9741 abstractC9741 = (AbstractC9741) this.f18727.getAndSet(null);
        if (abstractC9741 != null) {
            abstractC9741.mo8404();
        }
    }
}
