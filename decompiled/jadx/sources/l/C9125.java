package l;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45BU */
/* JADX INFO: loaded from: classes4.dex */
public final class C9125 extends C16885 implements InterfaceC6594 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f27641;

    @Override // l.InterfaceC22821
    /* JADX INFO: renamed from: ۧ */
    public final int mo10659(Object obj) {
        return ((C7008) obj).f21623;
    }

    @Override // l.InterfaceC6594
    /* JADX INFO: renamed from: ܿ */
    public final Set mo18100(Object obj) {
        return ((C7008) obj).f21622;
    }

    @Override // l.InterfaceC11533
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo23500(Object obj) {
        C7008 c7008 = (C7008) obj;
        if (c7008 == null) {
            return 0;
        }
        return c7008.f21623;
    }

    public C9125(C19357 c19357) {
        super(c19357);
        this.f27641 = new ConcurrentMapC10942();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7008 m23499(Set set) {
        if (set == null) {
            return C7008.f21621;
        }
        ConcurrentMapC10942 concurrentMapC10942 = this.f27641;
        C7008 c7008 = (C7008) concurrentMapC10942.get(set);
        if (c7008 != null) {
            return c7008;
        }
        C7008 c7009 = new C7008(AbstractC6079.m16989(C4648.m13611(set.iterator(), new C21120(this))));
        C7008 c70010 = (C7008) concurrentMapC10942.putIfAbsent(c7009, c7009);
        return c70010 == null ? c7009 : c70010;
    }

    @Override // l.InterfaceC22821
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo10657() {
        return new C9831(this.f27641.values());
    }
}
