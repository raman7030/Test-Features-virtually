package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ۢᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9759 extends AbstractC11854 implements IntConsumer, InterfaceC18764 {
    public final IntPredicate e;
    public int f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }

    @Override // l.AbstractC11854, l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C3947.a(this, consumer);
    }

    @Override // l.InterfaceC1124
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C3947.$default$forEachRemaining(this, intConsumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C3947.b(this, consumer);
    }

    public AbstractC9759(InterfaceC18764 interfaceC18764, IntPredicate intPredicate) {
        super(interfaceC18764);
        this.e = intPredicate;
    }

    public AbstractC9759(InterfaceC18764 interfaceC18764, AbstractC9759 abstractC9759) {
        super(interfaceC18764, abstractC9759);
        this.e = abstractC9759.e;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.d = (this.d + 1) & 63;
        this.f = i;
    }

    @Override // l.InterfaceC1124
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((IntConsumer) obj);
    }
}
