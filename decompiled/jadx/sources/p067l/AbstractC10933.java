package p067l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* JADX INFO: renamed from: l.ۡܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10933 extends AbstractC13635 implements DoubleConsumer, InterfaceC10124 {

    /* JADX INFO: renamed from: e */
    public final DoublePredicate f30304e;

    /* JADX INFO: renamed from: f */
    public double f30305f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC17736.m40299a(this, doubleConsumer);
    }

    @Override // p067l.AbstractC13635, p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC17736.m40300b(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC17736.m40305g(this, consumer);
    }

    @Override // p067l.InterfaceC3437
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    public AbstractC10933(InterfaceC10124 interfaceC10124, DoublePredicate doublePredicate) {
        super(interfaceC10124);
        this.f30304e = doublePredicate;
    }

    public AbstractC10933(InterfaceC10124 interfaceC10124, AbstractC10933 abstractC10933) {
        super(interfaceC10124, abstractC10933);
        this.f30304e = abstractC10933.f30304e;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.f38388d = (this.f38388d + 1) & 63;
        this.f30305f = d;
    }

    @Override // p067l.InterfaceC3437
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((DoubleConsumer) obj);
    }
}
