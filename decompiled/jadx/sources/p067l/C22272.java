package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩷ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22272 extends AbstractC6178 implements InterfaceC8705, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C7519 f70386;

    @Override // p067l.AbstractC6178, java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C24798.m54480(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // p067l.AbstractC6178
    /* JADX INFO: renamed from: ֫ */
    public final void mo14007(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f70386.f19744[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22272(C7519 c7519) {
        super(c7519);
        this.f70386 = c7519;
    }

    @Override // p067l.InterfaceC16177
    public final int nextInt() {
        return this.f70386.f19744[m14006()];
    }
}
