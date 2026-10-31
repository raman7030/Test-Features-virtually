package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۧܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11128 extends AbstractC20300 implements InterfaceC14696 {
    public final LongConsumer b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C2351.$default$andThen(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // l.InterfaceC14696
    public final /* synthetic */ void l(Long l2) {
        AbstractC9198.r(this, l2);
    }

    @Override // l.InterfaceC21048
    public final Object b(AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234) {
        abstractC12725.f0(interfaceC15234, this);
        return null;
    }

    @Override // l.InterfaceC21048
    public final /* bridge */ /* synthetic */ Object e(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234) {
        a(abstractC9198, interfaceC15234);
        return null;
    }

    public C11128(LongConsumer longConsumer, boolean z) {
        super(z);
        this.b = longConsumer;
    }

    @Override // l.AbstractC20300, l.InterfaceC0585
    public final void accept(long j) {
        this.b.accept(j);
    }
}
