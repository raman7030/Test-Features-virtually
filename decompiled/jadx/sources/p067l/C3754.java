package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3754 extends AbstractC7107 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final C23871 f7977;

    public C3754(C12472 c12472) {
        super(c12472);
        this.f7977 = new C23871(c12472);
    }

    @Override // p067l.AbstractC7107
    /* JADX INFO: renamed from: ֫ */
    public final void mo5216(int i, Object obj) {
        C23871 c23871 = this.f7977;
        c23871.f75803 = i;
        ((Consumer) obj).accept(c23871);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM16376 = m16376();
        C23871 c23871 = this.f7977;
        c23871.f75803 = iM16376;
        return c23871;
    }
}
