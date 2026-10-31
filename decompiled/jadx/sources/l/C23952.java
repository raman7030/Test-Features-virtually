package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩻᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes2.dex */
public final class C23952 extends AbstractC16190 implements InterfaceC6667, InterfaceC12433 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19720 f77668;

    @Override // l.AbstractC16190, l.InterfaceC6667, l.InterfaceC14529, java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23600.m52077(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // l.AbstractC16190
    /* JADX INFO: renamed from: ֫ */
    public final void mo12660(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f77668.f63729[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23952(C19720 c19720) {
        super(c19720);
        this.f77668 = c19720;
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        return this.f77668.f63729[m38125()];
    }
}
