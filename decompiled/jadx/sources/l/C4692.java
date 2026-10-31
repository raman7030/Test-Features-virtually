package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۙܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4692 extends AbstractC20031 implements InterfaceC8160, DoubleConsumer {
    public double f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC16169.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC16169.b(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC16169.g(this, consumer);
    }

    @Override // l.AbstractC21984
    public final InterfaceC15234 b(InterfaceC15234 interfaceC15234) {
        return new C4692((InterfaceC8160) interfaceC15234, this);
    }

    @Override // l.AbstractC20031
    public final void g(Object obj) {
        ((DoubleConsumer) obj).accept(this.f);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.f = d;
    }

    @Override // l.AbstractC20031
    public final AbstractC22957 j(int i) {
        return new C13516(i);
    }
}
