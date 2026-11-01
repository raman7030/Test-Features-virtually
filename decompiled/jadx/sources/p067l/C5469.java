package p067l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l.ۗ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5469 extends AbstractC13516 {

    /* JADX INFO: renamed from: ۬ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13037 = AtomicIntegerFieldUpdater.newUpdater(C5469.class, "_invoked");
    public volatile /* synthetic */ int _invoked = 0;

    /* JADX INFO: renamed from: ۗ */
    public final AbstractC9492 f13038;

    @Override // p067l.InterfaceC17797
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo3658((Throwable) obj);
        return C10027.f27775;
    }

    public C5469(AbstractC9492 abstractC9492) {
        this.f13038 = abstractC9492;
    }

    @Override // p067l.AbstractC2512
    /* JADX INFO: renamed from: ۧ */
    public final void mo3658(Throwable th) {
        if (f13037.compareAndSet(this, 0, 1)) {
            this.f13038.invoke(th);
        }
    }
}
