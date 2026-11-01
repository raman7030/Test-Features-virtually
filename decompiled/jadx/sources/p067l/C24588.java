package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩻֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7ND */
/* JADX INFO: loaded from: classes.dex */
public final class C24588 extends AbstractC10763 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16192 f77865;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC16192 f77866;

    public C24588(AbstractC16192 abstractC16192, AbstractC16192 abstractC16193) {
        if (abstractC16192 == null) {
            throw new NullPointerException("Null declarationModifiers");
        }
        this.f77865 = abstractC16192;
        if (abstractC16193 == null) {
            throw new NullPointerException("Null typeAnnotations");
        }
        this.f77866 = abstractC16193;
    }

    @Override // p067l.AbstractC10763
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16192 mo24796() {
        return this.f77865;
    }

    @Override // p067l.AbstractC10763
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC16192 mo24798() {
        return this.f77866;
    }

    public final String toString() {
        return "DeclarationModifiersAndTypeAnnotations{declarationModifiers=" + this.f77865 + ", typeAnnotations=" + this.f77866 + C0249l.f1198d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10763)) {
            return false;
        }
        AbstractC10763 abstractC10763 = (AbstractC10763) obj;
        return this.f77865.equals(abstractC10763.mo24796()) && this.f77866.equals(abstractC10763.mo24798());
    }

    public final int hashCode() {
        return ((this.f77865.hashCode() ^ 1000003) * 1000003) ^ this.f77866.hashCode();
    }
}
