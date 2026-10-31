package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZW */
/* JADX INFO: loaded from: classes5.dex */
public final class C17945 extends C16885 implements InterfaceC2069 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f55947;

    @Override // l.InterfaceC2069
    /* JADX INFO: renamed from: ֫ */
    public final List mo6809(Object obj) {
        C1717 c1717 = (C1717) obj;
        return c1717 == null ? C1717.f5940 : c1717.f5942;
    }

    @Override // l.InterfaceC11533
    /* JADX INFO: renamed from: ᩳ */
    public final int mo23500(Object obj) {
        C1717 c1717 = (C1717) obj;
        if (c1717 == null || c1717.f5942.size() == 0) {
            return 0;
        }
        return c1717.f5941;
    }

    public C17945(C19357 c19357) {
        super(c19357);
        this.f55947 = new ConcurrentMapC10942();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1717 m41946(List list) {
        if (list == null || list.size() == 0) {
            return C1717.f5940;
        }
        ConcurrentMapC10942 concurrentMapC10942 = this.f55947;
        C1717 c1717 = (C1717) concurrentMapC10942.get(list);
        if (c1717 != null) {
            return c1717;
        }
        C1717 c1718 = new C1717(AbstractC14545.m34730(C8882.m22949(list, new C10890(this))));
        C1717 c1719 = (C1717) concurrentMapC10942.putIfAbsent(c1718, c1718);
        return c1719 == null ? c1718 : c1719;
    }

    @Override // l.InterfaceC22821
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo10657() {
        return new C16533(this.f55947.values());
    }
}
