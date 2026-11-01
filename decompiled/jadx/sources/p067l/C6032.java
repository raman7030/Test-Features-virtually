package p067l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۘۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 963I */
/* JADX INFO: loaded from: classes3.dex */
public final class C6032 extends C18416 implements InterfaceC21376 {

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f15113;

    /* JADX INFO: renamed from: ֫ */
    public final C24787 m13548(InterfaceC20309 interfaceC20309) {
        return ((C20114) interfaceC20309).f62229;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C24787 m13549(InterfaceC20309 interfaceC20309) {
        return ((C20114) interfaceC20309).f62230;
    }

    @Override // p067l.InterfaceC6623
    /* JADX INFO: renamed from: ܳ */
    public final int mo10638(Object obj) {
        return ((C20114) obj).f62228;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C9384 m13550(InterfaceC20309 interfaceC20309) {
        return ((C20114) interfaceC20309).f62227;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m13552(Object obj) {
        return ((C17430) obj).f52099.f62228;
    }

    public C6032(C20765 c20765) {
        super(c20765);
        this.f15113 = new ConcurrentMapC12768();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C20114 m13551(InterfaceC20309 interfaceC20309) {
        ConcurrentMapC12768 concurrentMapC12768 = this.f15113;
        C20114 c20114 = (C20114) concurrentMapC12768.get(interfaceC20309);
        if (c20114 != null) {
            return c20114;
        }
        C20765 c20765 = this.f55000;
        C20114 c20115 = new C20114(c20765.f71655.m36581(interfaceC20309.mo10231()), ((C15418) c20765.f71646).m35146(interfaceC20309.getName()), c20765.f71655.m36581(interfaceC20309.getType()));
        C20114 c20116 = (C20114) concurrentMapC12768.putIfAbsent(c20115, c20115);
        return c20116 == null ? c20115 : c20116;
    }

    @Override // p067l.InterfaceC6623
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo10634() {
        return new C4691(this.f15113.values());
    }

    @Override // p067l.InterfaceC6623
    public final int getItemCount() {
        return this.f15113.size();
    }
}
