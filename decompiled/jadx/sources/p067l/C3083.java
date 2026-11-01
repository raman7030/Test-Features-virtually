package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3083 extends AbstractC7107 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C12472 f5576;

    /* JADX INFO: renamed from: ۫ */
    public C23871 f5577;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3083(C12472 c12472) {
        super(c12472);
        this.f5576 = c12472;
    }

    @Override // p067l.AbstractC7107
    /* JADX INFO: renamed from: ֫ */
    public final void mo5216(int i, Object obj) {
        C23871 c23871 = new C23871(this.f5576, i);
        this.f5577 = c23871;
        ((Consumer) obj).accept(c23871);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C23871 c23871 = new C23871(this.f5576, m16376());
        this.f5577 = c23871;
        return c23871;
    }

    @Override // p067l.AbstractC7107, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f5577.f75803 = -1;
    }
}
