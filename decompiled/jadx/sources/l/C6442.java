package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۜ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6442 implements InterfaceC8559 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f19923;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC8559 f19924;

    @Override // l.InterfaceC8559
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo17796(int i) {
    }

    public C6442(InterfaceC8559 interfaceC8559, AtomicReference atomicReference) {
        this.f19924 = interfaceC8559;
        this.f19923 = atomicReference;
    }

    @Override // l.InterfaceC8559
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17795(int i) {
        this.f19924.mo17795(i);
    }

    @Override // l.InterfaceC8559
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean mo17797() {
        return this.f19923.get() != null || this.f19924.mo17797();
    }
}
