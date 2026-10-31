package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1457 extends AbstractC4985 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C22624 f5204;

    public C1457(C10630 c10630) {
        super(c10630);
        this.f5204 = new C22624(c10630);
    }

    @Override // l.AbstractC4985
    /* JADX INFO: renamed from: ֫ */
    public final void mo2887(int i, Object obj) {
        C22624 c22624 = this.f5204;
        c22624.f73075 = i;
        ((Consumer) obj).accept(c22624);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM14472 = m14472();
        C22624 c22624 = this.f5204;
        c22624.f73075 = iM14472;
        return c22624;
    }
}
