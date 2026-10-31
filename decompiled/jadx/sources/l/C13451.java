package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۬᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13451 extends AbstractC4985 implements InterfaceC6667, InterfaceC12433 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10630 f40177;

    @Override // l.AbstractC4985, l.InterfaceC6667, l.InterfaceC14529, java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23600.m52077(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // l.AbstractC4985
    /* JADX INFO: renamed from: ֫ */
    public final void mo2887(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f40177.f31942[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13451(C10630 c10630) {
        super(c10630);
        this.f40177 = c10630;
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        return this.f40177.f31942[m14472()];
    }
}
