package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0751 extends AbstractC4985 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10630 f2803;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22624 f2804;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0751(C10630 c10630) {
        super(c10630);
        this.f2803 = c10630;
    }

    @Override // l.AbstractC4985
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2887(int i, Object obj) {
        C22624 c22624 = new C22624(this.f2803, i);
        this.f2804 = c22624;
        ((Consumer) obj).accept(c22624);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C22624 c22624 = new C22624(this.f2803, m14472());
        this.f2804 = c22624;
        return c22624;
    }

    @Override // l.AbstractC4985, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f2804.f73075 = -1;
    }
}
