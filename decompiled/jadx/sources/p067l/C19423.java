package p067l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZW */
/* JADX INFO: loaded from: classes5.dex */
public final class C19423 extends C18416 implements InterfaceC4335 {

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f59144;

    @Override // p067l.InterfaceC4335
    /* JADX INFO: renamed from: ֫ */
    public final List mo8935(Object obj) {
        C4000 c4000 = (C4000) obj;
        return c4000 == null ? C4000.f8718 : c4000.f8720;
    }

    @Override // p067l.InterfaceC13329
    /* JADX INFO: renamed from: ᩳ */
    public final int mo25451(Object obj) {
        C4000 c4000 = (C4000) obj;
        if (c4000 == null || c4000.f8720.size() == 0) {
            return 0;
        }
        return c4000.f8719;
    }

    public C19423(C20765 c20765) {
        super(c20765);
        this.f59144 = new ConcurrentMapC12768();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4000 m44195(List list) {
        if (list == null || list.size() == 0) {
            return C4000.f8718;
        }
        ConcurrentMapC12768 concurrentMapC12768 = this.f59144;
        C4000 c4000 = (C4000) concurrentMapC12768.get(list);
        if (c4000 != null) {
            return c4000;
        }
        C4000 c4001 = new C4000(AbstractC16192.m36879(C10810.m24920(list, new C12718(this))));
        C4000 c4002 = (C4000) concurrentMapC12768.putIfAbsent(c4001, c4001);
        return c4002 == null ? c4001 : c4002;
    }

    @Override // p067l.InterfaceC24057
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo12652() {
        return new C18081(this.f59144.values());
    }
}
