package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4898 extends AbstractC21662 {

    /* JADX INFO: renamed from: b */
    public final Consumer f11157b;

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // p067l.InterfaceC22373
    /* JADX INFO: renamed from: b */
    public final Object mo10392b(AbstractC14463 abstractC14463, InterfaceC16847 interfaceC16847) {
        abstractC14463.mo25629f0(interfaceC16847, this);
        return null;
    }

    @Override // p067l.InterfaceC22373
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo10393e(AbstractC11111 abstractC11111, InterfaceC16847 interfaceC16847) {
        m48868a(abstractC11111, interfaceC16847);
        return null;
    }

    public C4898(Consumer consumer, boolean z) {
        super(z);
        this.f11157b = consumer;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m45213n(Object obj) {
        this.f11157b.m45213n(obj);
    }
}
