package p067l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۜ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8491 implements InterfaceC10503 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AtomicReference f22796;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC10503 f22797;

    @Override // p067l.InterfaceC10503
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo19743(int i) {
    }

    public C8491(InterfaceC10503 interfaceC10503, AtomicReference atomicReference) {
        this.f22797 = interfaceC10503;
        this.f22796 = atomicReference;
    }

    @Override // p067l.InterfaceC10503
    /* JADX INFO: renamed from: ֫ */
    public final void mo19742(int i) {
        this.f22797.mo19742(i);
    }

    @Override // p067l.InterfaceC10503
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo19744() {
        return this.f22796.get() != null || this.f22797.mo19744();
    }
}
