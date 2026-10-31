package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۖ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2392 extends AbstractC20031 implements InterfaceC0418, LongConsumer {
    public long f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C2351.$default$andThen(this, longConsumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C19470.a(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C19470.b(this, consumer);
    }

    @Override // l.AbstractC21984
    public final InterfaceC15234 b(InterfaceC15234 interfaceC15234) {
        return new C2392((InterfaceC0418) interfaceC15234, this);
    }

    @Override // l.AbstractC20031
    public final void g(Object obj) {
        ((LongConsumer) obj).accept(this.f);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f = j;
    }

    @Override // l.AbstractC20031
    public final AbstractC22957 j(int i) {
        return new C15195(i);
    }
}
