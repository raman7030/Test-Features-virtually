package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩻֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7ND */
/* JADX INFO: loaded from: classes.dex */
public final class C23380 extends AbstractC8833 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f75119;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f75120;

    public C23380(AbstractC14545 abstractC14545, AbstractC14545 abstractC14546) {
        if (abstractC14545 == null) {
            throw new NullPointerException("Null declarationModifiers");
        }
        this.f75119 = abstractC14545;
        if (abstractC14546 == null) {
            throw new NullPointerException("Null typeAnnotations");
        }
        this.f75120 = abstractC14546;
    }

    @Override // l.AbstractC8833
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14545 mo22826() {
        return this.f75119;
    }

    @Override // l.AbstractC8833
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14545 mo22828() {
        return this.f75120;
    }

    public final String toString() {
        return "DeclarationModifiersAndTypeAnnotations{declarationModifiers=" + this.f75119 + ", typeAnnotations=" + this.f75120 + l.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8833)) {
            return false;
        }
        AbstractC8833 abstractC8833 = (AbstractC8833) obj;
        return this.f75119.equals(abstractC8833.mo22826()) && this.f75120.equals(abstractC8833.mo22828());
    }

    public final int hashCode() {
        return ((this.f75119.hashCode() ^ 1000003) * 1000003) ^ this.f75120.hashCode();
    }
}
