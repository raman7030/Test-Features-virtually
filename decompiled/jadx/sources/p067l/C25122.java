package p067l;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O4TJ */
/* JADX INFO: loaded from: classes.dex */
public final class C25122 extends C18416 implements InterfaceC24728 {

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f80391;

    @Override // p067l.InterfaceC24728
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15733 mo54393(InterfaceC11180 interfaceC11180) {
        return ((C19087) interfaceC11180).f56952;
    }

    @Override // p067l.InterfaceC24728
    /* JADX INFO: renamed from: ֫ */
    public final C24787 mo54394(InterfaceC21909 interfaceC21909) {
        return ((C19758) interfaceC21909).f60107;
    }

    @Override // p067l.InterfaceC24057
    /* JADX INFO: renamed from: ۧ */
    public final int mo12654(Object obj) {
        return ((C19758) obj).f60108;
    }

    @Override // p067l.InterfaceC24728
    /* JADX INFO: renamed from: ۧ */
    public final int mo54395(InterfaceC21909 interfaceC21909) {
        return ((C19758) interfaceC21909).f60106;
    }

    @Override // p067l.InterfaceC24728
    /* JADX INFO: renamed from: ۧ */
    public final C9384 mo54396(InterfaceC11180 interfaceC11180) {
        return ((C19087) interfaceC11180).f56953;
    }

    @Override // p067l.InterfaceC24728
    /* JADX INFO: renamed from: ܽ */
    public final Set mo54397(InterfaceC21909 interfaceC21909) {
        return ((C19758) interfaceC21909).f60109;
    }

    public C25122(C20765 c20765) {
        super(c20765);
        this.f80391 = new ConcurrentMapC12768();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C19758 m55174(InterfaceC21909 interfaceC21909) {
        ConcurrentMapC12768 concurrentMapC12768 = this.f80391;
        C19758 c19758 = (C19758) concurrentMapC12768.get(interfaceC21909);
        if (c19758 != null) {
            return c19758;
        }
        int visibility = interfaceC21909.getVisibility();
        C20765 c20765 = this.f55000;
        C19758 c19759 = new C19758(visibility, c20765.f71655.m36581(interfaceC21909.getType()), AbstractC8146.m18920(C6786.m15486(interfaceC21909.getElements().iterator(), new C17410(c20765))));
        C19758 c197510 = (C19758) concurrentMapC12768.putIfAbsent(c19759, c19759);
        return c197510 == null ? c19759 : c197510;
    }

    @Override // p067l.InterfaceC24057
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo12652() {
        return new C16404(this.f80391.values());
    }
}
