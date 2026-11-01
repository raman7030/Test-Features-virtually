package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֫ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6Y6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4196 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f9238;

    /* JADX INFO: renamed from: ۧ */
    public final String f9239;

    /* JADX INFO: renamed from: ܽ */
    public final String f9240;

    public C4196(String str, String str2, String str3) {
        this.f9240 = str;
        this.f9239 = str2;
        this.f9238 = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4196)) {
            return false;
        }
        C4196 c4196 = (C4196) obj;
        return C12826.equals(this.f9240, c4196.f9240) && C12826.equals(this.f9239, c4196.f9239) && C12826.equals(this.f9238, c4196.f9238);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f9238) + C21720.m49003(C12826.hashCode(this.f9240) * 31, 31, this.f9239);
    }

    public final String toString() {
        Object[] objArr = {this.f9240, this.f9239, this.f9238};
        String[] strArrSplit = "traversalId;policyRevision;directoryPath".length() == 0 ? new String[0] : "traversalId;policyRevision;directoryPath".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C4196.class, sb, "[");
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
