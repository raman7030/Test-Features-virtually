package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֫ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6Y6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1923 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f6457;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f6458;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f6459;

    public C1923(String str, String str2, String str3) {
        this.f6459 = str;
        this.f6458 = str2;
        this.f6457 = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1923)) {
            return false;
        }
        C1923 c1923 = (C1923) obj;
        return C11003.equals(this.f6459, c1923.f6459) && C11003.equals(this.f6458, c1923.f6458) && C11003.equals(this.f6457, c1923.f6457);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f6457) + C20361.m46680(C11003.hashCode(this.f6459) * 31, 31, this.f6458);
    }

    public final String toString() {
        Object[] objArr = {this.f6459, this.f6458, this.f6457};
        String[] strArrSplit = "traversalId;policyRevision;directoryPath".length() == 0 ? new String[0] : "traversalId;policyRevision;directoryPath".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C1923.class, sb, "[");
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
