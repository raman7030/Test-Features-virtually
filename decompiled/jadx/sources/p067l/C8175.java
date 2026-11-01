package p067l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۛܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes3.dex */
public final class C8175 extends AbstractC1325 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AtomicReference f21582;

    public C8175(AtomicReference atomicReference) {
        this.f21582 = atomicReference;
    }

    @Override // p067l.AbstractC1325
    /* JADX INFO: renamed from: ֫ */
    public final void mo10451(Object obj) {
        AbstractC1325 abstractC1325 = (AbstractC1325) this.f21582.get();
        if (abstractC1325 == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        abstractC1325.mo10451(obj);
    }

    @Override // p067l.AbstractC1325
    /* JADX INFO: renamed from: ֫ */
    public final void mo10450() {
        AbstractC1325 abstractC1325 = (AbstractC1325) this.f21582.getAndSet(null);
        if (abstractC1325 != null) {
            abstractC1325.mo10450();
        }
    }
}
