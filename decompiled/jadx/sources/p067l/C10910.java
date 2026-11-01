package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۡܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M97E */
/* JADX INFO: loaded from: classes3.dex */
public final class C10910 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f30241;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC11581 f30242;

    public C10910(int i, AbstractC11581 abstractC11581) {
        this.f30241 = i;
        this.f30242 = abstractC11581;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10910)) {
            return false;
        }
        C10910 c10910 = (C10910) obj;
        return this.f30241 == c10910.f30241 && C12826.equals(this.f30242, c10910.f30242);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f30242) + (this.f30241 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f30241), this.f30242};
        String[] strArrSplit = "group;syntaxItem".length() == 0 ? new String[0] : "group;syntaxItem".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder("SyntaxItemMark[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m25166() {
        return this.f30241;
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC11581 m25168() {
        return this.f30242;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10910 m25167(AbstractC11581 abstractC11581) {
        return new C10910(this.f30241, this.f30242.mo3910(abstractC11581));
    }
}
