package p067l;

/* JADX INFO: renamed from: l.۬ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 688Y */
/* JADX INFO: loaded from: classes4.dex */
public class C14941 extends AbstractC3482 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC10288 f42659 = null;

    /* JADX INFO: renamed from: ֫ */
    public final void m34193(AbstractC10288 abstractC10288) {
        if (this.f42659 != null) {
            throw new AssertionError("Delegate is already set");
        }
        this.f42659 = abstractC10288;
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) {
        AbstractC10288 abstractC10288 = this.f42659;
        if (abstractC10288 == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        return abstractC10288.mo5173(c18691);
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) {
        AbstractC10288 abstractC10288 = this.f42659;
        if (abstractC10288 == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        abstractC10288.mo5174(c24726, obj);
    }

    @Override // p067l.AbstractC3482
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC10288 mo6211() {
        AbstractC10288 abstractC10288 = this.f42659;
        if (abstractC10288 != null) {
            return abstractC10288;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
