package p067l;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45BU */
/* JADX INFO: loaded from: classes4.dex */
public final class C11041 extends C18416 implements InterfaceC8635 {

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f30581;

    @Override // p067l.InterfaceC24057
    /* JADX INFO: renamed from: ۧ */
    public final int mo12654(Object obj) {
        return ((C9029) obj).f24504;
    }

    @Override // p067l.InterfaceC8635
    /* JADX INFO: renamed from: ܿ */
    public final Set mo20052(Object obj) {
        return ((C9029) obj).f24503;
    }

    @Override // p067l.InterfaceC13329
    /* JADX INFO: renamed from: ᩳ */
    public final int mo25451(Object obj) {
        C9029 c9029 = (C9029) obj;
        if (c9029 == null) {
            return 0;
        }
        return c9029.f24504;
    }

    public C11041(C20765 c20765) {
        super(c20765);
        this.f30581 = new ConcurrentMapC12768();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9029 m25450(Set set) {
        if (set == null) {
            return C9029.f24502;
        }
        ConcurrentMapC12768 concurrentMapC12768 = this.f30581;
        C9029 c9029 = (C9029) concurrentMapC12768.get(set);
        if (c9029 != null) {
            return c9029;
        }
        C9029 c90210 = new C9029(AbstractC8146.m18920(C6786.m15486(set.iterator(), new C22441(this))));
        C9029 c90211 = (C9029) concurrentMapC12768.putIfAbsent(c90210, c90210);
        return c90211 == null ? c90210 : c90211;
    }

    @Override // p067l.InterfaceC24057
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo12652() {
        return new C11712(this.f30581.values());
    }
}
