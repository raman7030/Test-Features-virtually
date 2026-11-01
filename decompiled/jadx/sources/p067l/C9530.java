package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۟ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public final class C9530 extends AbstractC19177 implements InterfaceC8705, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C22531 f26094;

    @Override // p067l.AbstractC19177, p067l.InterfaceC8705, p067l.InterfaceC16177, java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C24798.m54480(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // p067l.AbstractC19177
    /* JADX INFO: renamed from: ֫ */
    public final void mo22195(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f26094.f71035[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9530(C22531 c22531) {
        super(c22531);
        this.f26094 = c22531;
    }

    @Override // p067l.InterfaceC16177
    public final int nextInt() {
        return this.f26094.f71035[m43665()];
    }
}
