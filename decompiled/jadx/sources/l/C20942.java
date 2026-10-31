package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩷ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20942 extends AbstractC4008 implements InterfaceC6667, InterfaceC12433 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5419 f67701;

    @Override // l.AbstractC4008, java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23600.m52077(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // l.AbstractC4008
    /* JADX INFO: renamed from: ֫ */
    public final void mo12087(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f67701.f16906[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20942(C5419 c5419) {
        super(c5419);
        this.f67701 = c5419;
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        return this.f67701.f16906[m12086()];
    }
}
