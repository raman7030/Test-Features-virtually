package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۟ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public final class C7535 extends AbstractC17685 implements InterfaceC6667, InterfaceC12433 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21214 f23181;

    @Override // l.AbstractC17685, l.InterfaceC6667, l.InterfaceC14529, java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23600.m52077(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // l.AbstractC17685
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo20219(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f23181.f68352[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7535(C21214 c21214) {
        super(c21214);
        this.f23181 = c21214;
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        return this.f23181.f68352[m41419()];
    }
}
