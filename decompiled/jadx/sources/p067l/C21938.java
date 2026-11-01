package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩷ۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21938 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8526 f68968;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC8526 f68969;

    public C21938(AbstractC8526 abstractC8526, AbstractC8526 abstractC8527) {
        this.f68968 = abstractC8526;
        this.f68969 = abstractC8527;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21938)) {
            return false;
        }
        C21938 c21938 = (C21938) obj;
        return C12826.equals(this.f68968, c21938.f68968) && C12826.equals(this.f68969, c21938.f68969);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f68969) + (C12826.hashCode(this.f68968) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f68968, this.f68969};
        String[] strArrSplit = "left;right".length() == 0 ? new String[0] : "left;right".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C21938.class, sb, "[");
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
}
