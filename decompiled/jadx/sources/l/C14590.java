package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14590 extends AbstractC4008 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5419 f44678;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C16001 f44679;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14590(C5419 c5419) {
        super(c5419);
        this.f44678 = c5419;
    }

    @Override // l.AbstractC4008
    /* JADX INFO: renamed from: ֫ */
    public final void mo12087(int i, Object obj) {
        C16001 c16001 = new C16001(this.f44678, i);
        this.f44679 = c16001;
        ((Consumer) obj).accept(c16001);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C16001 c16001 = new C16001(this.f44678, m12086());
        this.f44679 = c16001;
        return c16001;
    }

    @Override // l.AbstractC4008, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f44679.f49369 = -1;
    }
}
