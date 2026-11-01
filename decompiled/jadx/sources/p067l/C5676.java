package p067l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95UO */
/* JADX INFO: loaded from: classes2.dex */
public final class C5676 extends C18416 implements InterfaceC24057 {

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f13833;

    @Override // p067l.InterfaceC24057
    /* JADX INFO: renamed from: ۧ */
    public final int mo12654(Object obj) {
        return ((C14393) obj).f41136;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final List m12655(Object obj) {
        return ((C14393) obj).f41135;
    }

    public C5676(C20765 c20765) {
        super(c20765);
        this.f13833 = new ConcurrentMapC12768();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14393 m12653(AbstractC10147 abstractC10147) {
        ConcurrentMapC12768 concurrentMapC12768 = this.f13833;
        C14393 c14393 = (C14393) concurrentMapC12768.get(abstractC10147);
        if (c14393 != null) {
            return c14393;
        }
        C14393 c14394 = (C14393) this.f55000.m46904(abstractC10147);
        C14393 c14395 = (C14393) concurrentMapC12768.putIfAbsent(c14394, c14394);
        return c14395 == null ? c14394 : c14395;
    }

    @Override // p067l.InterfaceC24057
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo12652() {
        return new C7017(this.f13833.values());
    }
}
