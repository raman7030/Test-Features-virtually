package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֫۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3970 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C9509 f8629;

    /* JADX INFO: renamed from: ۧ */
    public final C9509 f8630;

    public C3970(C9509 c9509, C9509 c95010) {
        this.f8629 = c9509;
        this.f8630 = c95010;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3970)) {
            return false;
        }
        C3970 c3970 = (C3970) obj;
        return C12826.equals(this.f8629, c3970.f8629) && C12826.equals(this.f8630, c3970.f8630);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f8630) + (C12826.hashCode(this.f8629) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f8629, this.f8630};
        String[] strArrSplit = "left;right".length() == 0 ? new String[0] : "left;right".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C3970.class, sb, "[");
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
