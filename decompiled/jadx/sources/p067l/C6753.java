package p067l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۙۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6753 extends AbstractC21662 implements InterfaceC12274 {

    /* JADX INFO: renamed from: b */
    public final IntConsumer f17516b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
        mo6025d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C11309.$default$andThen(this, intConsumer);
    }

    @Override // p067l.InterfaceC12274
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo6025d(Integer num) {
        AbstractC11111.m25614p(this, num);
    }

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

    public C6753(IntConsumer intConsumer, boolean z) {
        super(z);
        this.f17516b = intConsumer;
    }

    @Override // p067l.AbstractC21662, p067l.InterfaceC2925
    public final void accept(int i) {
        this.f17516b.accept(i);
    }
}
