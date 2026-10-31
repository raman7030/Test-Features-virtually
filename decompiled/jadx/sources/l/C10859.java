package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۧ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10859 extends AbstractC20031 implements InterfaceC18764, IntConsumer {
    public int f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C3947.a(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C3947.b(this, consumer);
    }

    @Override // l.AbstractC21984
    public final InterfaceC15234 b(InterfaceC15234 interfaceC15234) {
        return new C10859((InterfaceC18764) interfaceC15234, this);
    }

    @Override // l.AbstractC20031
    public final void g(Object obj) {
        ((IntConsumer) obj).accept(this.f);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f = i;
    }

    @Override // l.AbstractC20031
    public final AbstractC22957 j(int i) {
        return new C9553(i);
    }
}
