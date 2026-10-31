package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* JADX INFO: renamed from: l.ۡܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9011 extends AbstractC11854 implements DoubleConsumer, InterfaceC8160 {
    public final DoublePredicate e;
    public double f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC16169.a(this, doubleConsumer);
    }

    @Override // l.AbstractC11854, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC16169.b(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC16169.g(this, consumer);
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    public AbstractC9011(InterfaceC8160 interfaceC8160, DoublePredicate doublePredicate) {
        super(interfaceC8160);
        this.e = doublePredicate;
    }

    public AbstractC9011(InterfaceC8160 interfaceC8160, AbstractC9011 abstractC9011) {
        super(interfaceC8160, abstractC9011);
        this.e = abstractC9011.e;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.d = (this.d + 1) & 63;
        this.f = d;
    }

    @Override // l.InterfaceC1124
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((DoubleConsumer) obj);
    }
}
