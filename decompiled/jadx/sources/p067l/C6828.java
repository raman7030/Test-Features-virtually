package p067l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۙܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6828 extends AbstractC21406 implements InterfaceC10124, DoubleConsumer {

    /* JADX INFO: renamed from: f */
    public double f17742f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC17736.m40299a(this, doubleConsumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC17736.m40300b(this, consumer);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC17736.m40305g(this, consumer);
    }

    @Override // p067l.AbstractC23262
    /* JADX INFO: renamed from: b */
    public final InterfaceC16847 mo7434b(InterfaceC16847 interfaceC16847) {
        return new C6828((InterfaceC10124) interfaceC16847, this);
    }

    @Override // p067l.AbstractC21406
    /* JADX INFO: renamed from: g */
    public final void mo9815g(Object obj) {
        ((DoubleConsumer) obj).accept(this.f17742f);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.f17742f = d;
    }

    @Override // p067l.AbstractC21406
    /* JADX INFO: renamed from: j */
    public final AbstractC24187 mo9816j(int i) {
        return new C15214(i);
    }
}
