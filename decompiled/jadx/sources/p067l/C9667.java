package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6VW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9667 implements InterfaceC12628 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12628 f26633;

    /* JADX INFO: renamed from: ۧ */
    public final int f26634;

    /* JADX INFO: renamed from: ܽ */
    public volatile C15701 f26635;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC12628 f26636;

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
        return C3910.m7732(this, interfaceC12628);
    }

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
        return C3910.m7733(this, interfaceC12628);
    }

    public C9667(int i, InterfaceC12628 interfaceC12628, InterfaceC12628 interfaceC12629) {
        this.f26634 = i;
        this.f26633 = interfaceC12628;
        this.f26636 = interfaceC12629;
    }

    /* JADX INFO: renamed from: ܽ */
    public static C9667 m22548(InterfaceC12628 interfaceC12628) {
        return new C9667(2, interfaceC12628, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC12628 m22544(InterfaceC12628 interfaceC12628, InterfaceC12628 interfaceC12629, boolean z) {
        C9667 c9667 = new C9667(0, interfaceC12628, interfaceC12629);
        return z ? new C8326(c9667) : c9667;
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC12628 m22547(InterfaceC12628 interfaceC12628, InterfaceC12628 interfaceC12629, boolean z) {
        C9667 c9667 = new C9667(1, interfaceC12628, interfaceC12629);
        return z ? new C8326(c9667) : c9667;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m22549(InterfaceC12628 interfaceC12628) {
        if (interfaceC12628 instanceof C8326) {
            ((C8326) interfaceC12628).f22273.m22545();
        } else if (interfaceC12628 instanceof C9667) {
            ((C9667) interfaceC12628).m22545();
        }
    }

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4821(int i) {
        return m22545().mo4821(i);
    }

    /* JADX INFO: renamed from: ֫ */
    private C15701 m22545() {
        C15701 c15701M22546;
        C15701 c15701 = this.f26635;
        if (c15701 != null) {
            return c15701;
        }
        synchronized (this) {
            c15701M22546 = this.f26635;
            if (c15701M22546 == null) {
                c15701M22546 = m22546(this);
                this.f26635 = c15701M22546;
            }
        }
        return c15701M22546;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15701 m22546(C9667 c9667) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = -2;
        arrayList.add(new C13691(c9667, -1, -2));
        while (!arrayList.isEmpty()) {
            C13691 c13691 = (C13691) C20013.m45383(arrayList, 1);
            InterfaceC12628 interfaceC12628 = c13691.f38622;
            if (interfaceC12628 instanceof C8326) {
                c13691.f38622 = ((C8326) interfaceC12628).f22273;
            }
            InterfaceC12628 interfaceC12629 = c13691.f38622;
            if (interfaceC12629 instanceof C9667) {
                C9667 c9668 = (C9667) interfaceC12629;
                InterfaceC12628 interfaceC126210 = c9668.f26633;
                int i = c9668.f26634;
                if (i == 2) {
                    c13691.f38622 = interfaceC126210;
                    int i2 = c13691.f38621;
                    c13691.f38621 = c13691.f38620;
                    c13691.f38620 = i2;
                } else {
                    int i3 = c13691.f38623;
                    if (i3 == 0) {
                        c13691.f38623 = 1;
                        arrayList.add(new C13691(c9668.f26636, c13691.f38621, c13691.f38620));
                    } else if (i3 == 1) {
                        c13691.f38623 = 2;
                        arrayList.add(new C13691(interfaceC126210, i == 0 ? size : c13691.f38621, i == 1 ? size : c13691.f38620));
                    } else {
                        C19925.m45229(arrayList, 1);
                    }
                }
            } else {
                size = arrayList2.size();
                arrayList2.add(new C24419(c13691.f38622, c13691.f38621, c13691.f38620));
                arrayList.remove(arrayList.size() - 1);
            }
        }
        return new C15701(arrayList2, size);
    }

    @Override // p067l.InterfaceC12628
    public final C9667 negate() {
        C7933 c7933 = C16057.f47257;
        return m22548(this);
    }
}
