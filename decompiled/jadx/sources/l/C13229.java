package l;

/* JADX INFO: renamed from: l.۬ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 688Y */
/* JADX INFO: loaded from: classes4.dex */
public class C13229 extends AbstractC1172 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC8333 f39595 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32095(AbstractC8333 abstractC8333) {
        if (this.f39595 != null) {
            throw new AssertionError("Delegate is already set");
        }
        this.f39595 = abstractC8333;
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        AbstractC8333 abstractC8333 = this.f39595;
        if (abstractC8333 == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        return abstractC8333.mo2844(c17175);
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        AbstractC8333 abstractC8333 = this.f39595;
        if (abstractC8333 == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        abstractC8333.mo2845(c23525, obj);
    }

    @Override // l.AbstractC1172
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC8333 mo3969() {
        AbstractC8333 abstractC8333 = this.f39595;
        if (abstractC8333 != null) {
            return abstractC8333;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
