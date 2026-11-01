package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۠᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10460 extends AbstractC7107 implements InterfaceC8705, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C12472 f28941;

    @Override // p067l.AbstractC7107, p067l.InterfaceC8705, p067l.InterfaceC16177, java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C24798.m54480(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // p067l.AbstractC7107
    /* JADX INFO: renamed from: ֫ */
    public final void mo5216(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f28941.f34906[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10460(C12472 c12472) {
        super(c12472);
        this.f28941 = c12472;
    }

    @Override // p067l.InterfaceC16177
    public final int nextInt() {
        return this.f28941.f34906[m16376()];
    }
}
