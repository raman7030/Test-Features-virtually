package l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l.ۗ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C3262 extends AbstractC11729 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10229 = AtomicIntegerFieldUpdater.newUpdater(C3262.class, "_invoked");
    public volatile /* synthetic */ int _invoked = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC7495 f10230;

    @Override // l.InterfaceC16233
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo1250((Throwable) obj);
        return C8058.f24861;
    }

    public C3262(AbstractC7495 abstractC7495) {
        this.f10230 = abstractC7495;
    }

    @Override // l.AbstractC0151
    /* JADX INFO: renamed from: ۧ */
    public final void mo1250(Throwable th) {
        if (f10229.compareAndSet(this, 0, 1)) {
            this.f10230.invoke(th);
        }
    }
}
