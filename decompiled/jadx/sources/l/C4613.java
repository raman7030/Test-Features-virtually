package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۙۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4613 extends AbstractC20300 implements InterfaceC10422 {
    public final IntConsumer b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC10422
    public final /* synthetic */ void d(Integer num) {
        AbstractC9198.p(this, num);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
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

    public C4613(IntConsumer intConsumer, boolean z) {
        super(z);
        this.b = intConsumer;
    }

    @Override // l.AbstractC20300, l.InterfaceC0585
    public final void accept(int i) {
        this.b.accept(i);
    }
}
