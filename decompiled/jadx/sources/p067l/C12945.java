package p067l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۧܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12945 extends AbstractC21662 implements InterfaceC16336 {

    /* JADX INFO: renamed from: b */
    public final LongConsumer f36402b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
        mo4235l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C4603.$default$andThen(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // p067l.InterfaceC16336
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo4235l(Long l2) {
        AbstractC11111.m25616r(this, l2);
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

    public C12945(LongConsumer longConsumer, boolean z) {
        super(z);
        this.f36402b = longConsumer;
    }

    @Override // p067l.AbstractC21662, p067l.InterfaceC2925
    public final void accept(long j) {
        this.f36402b.accept(j);
    }
}
