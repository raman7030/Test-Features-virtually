package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩻᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes2.dex */
public final class C25133 extends AbstractC17756 implements InterfaceC8705, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C21111 f80420;

    @Override // p067l.AbstractC17756, p067l.InterfaceC8705, p067l.InterfaceC16177, java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C24798.m54480(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // p067l.AbstractC17756
    /* JADX INFO: renamed from: ֫ */
    public final void mo14536(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f80420.f66360[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25133(C21111 c21111) {
        super(c21111);
        this.f80420 = c21111;
    }

    @Override // p067l.InterfaceC16177
    public final int nextInt() {
        return this.f80420.f66360[m40337()];
    }
}
