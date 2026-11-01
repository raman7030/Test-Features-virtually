package p067l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ܶۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z69Q */
/* JADX INFO: loaded from: classes5.dex */
public final class C16759 extends C18416 implements InterfaceC13999 {

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f49393;

    /* JADX INFO: renamed from: ֫ */
    public final C20114 m38004(InterfaceC20980 interfaceC20980) {
        return (C20114) ((C22796) interfaceC20980).f71840;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C14078 m38005(InterfaceC20980 interfaceC20980) {
        return (C14078) ((C22796) interfaceC20980).f71840;
    }

    @Override // p067l.InterfaceC6623
    /* JADX INFO: renamed from: ܳ */
    public final int mo10638(Object obj) {
        return ((C22796) obj).f71839;
    }

    public C16759(C20765 c20765) {
        super(c20765);
        this.f49393 = new ConcurrentMapC12768();
    }

    /* JADX INFO: renamed from: ܽ */
    public final C22796 m38006(InterfaceC20980 interfaceC20980) {
        InterfaceC13408 interfaceC13408M13551;
        ConcurrentMapC12768 concurrentMapC12768 = this.f49393;
        C22796 c22796 = (C22796) concurrentMapC12768.get(interfaceC20980);
        if (c22796 != null) {
            return c22796;
        }
        int iMo5178 = interfaceC20980.mo5178();
        C20765 c20765 = this.f55000;
        switch (iMo5178) {
            case 0:
            case 1:
            case 2:
            case 3:
                interfaceC13408M13551 = c20765.f71622.m13551((InterfaceC20309) interfaceC20980.mo5179());
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                interfaceC13408M13551 = c20765.f71621.m11620((InterfaceC7568) interfaceC20980.mo5179());
                break;
            default:
                throw new C17034(null, "Invalid method handle type: %d", Integer.valueOf(interfaceC20980.mo5178()));
        }
        C22796 c22797 = new C22796(interfaceC20980.mo5178(), interfaceC13408M13551);
        C22796 c22798 = (C22796) concurrentMapC12768.putIfAbsent(c22797, c22797);
        return c22798 == null ? c22797 : c22798;
    }

    @Override // p067l.InterfaceC6623
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo10634() {
        return new C10055(this.f49393.values());
    }

    @Override // p067l.InterfaceC6623
    public final int getItemCount() {
        return this.f49393.size();
    }
}
