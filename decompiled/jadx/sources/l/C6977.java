package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes3.dex */
public final class C6977 extends AbstractC14737 implements InterfaceC6667, InterfaceC12433 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9800 f21504;

    @Override // l.AbstractC14737, l.InterfaceC6667, l.InterfaceC14529, java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23600.m52077(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // l.AbstractC14737
    /* JADX INFO: renamed from: ֫ */
    public final void mo6628(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f21504.f29636[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6977(C9800 c9800) {
        super(c9800);
        this.f21504 = c9800;
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        return this.f21504.f29636[m35041()];
    }
}
