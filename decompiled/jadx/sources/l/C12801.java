package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.۬֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12801 implements InterfaceC0369 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f38428;

    public C12801(C22406 c22406) {
        this.f38428 = c22406;
    }

    @Override // l.InterfaceC0369
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1823(AbstractC4308 abstractC4308, C2609 c2609, C2609 c26010) {
        if (abstractC4308.mo12948() || AbstractC4308.m12905(c2609)) {
            return false;
        }
        return c26010 == null || !AbstractC4308.m12905(c26010);
    }

    @Override // l.InterfaceC0369
    /* JADX INFO: renamed from: ֫ */
    public final C2609 mo1822(AbstractC5698 abstractC5698, C2609 c2609) {
        EnumC13829 enumC13829 = EnumC13829.SPECULATIVE;
        C22406 c22406 = this.f38428;
        EnumC16761 enumC16761 = c22406.f72579.f37061;
        C12399 c12399 = c22406.f72606;
        C11003.requireNonNull(c12399);
        return c2609.m8243((Function) new C0533(c12399, enumC13829, abstractC5698, enumC16761));
    }
}
