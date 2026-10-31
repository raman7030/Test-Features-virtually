package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֨۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E762 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0983 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f3680;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f3681;

    public C0983(long j, String str) {
        this.f3681 = j;
        this.f3680 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0983)) {
            return false;
        }
        C0983 c0983 = (C0983) obj;
        return this.f3681 == c0983.f3681 && C11003.equals(this.f3680, c0983.f3680);
    }

    public final int hashCode() {
        long j = this.f3681;
        return C11003.hashCode(this.f3680) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f3681), this.f3680};
        String[] strArrSplit = "value;hex".length() == 0 ? new String[0] : "value;hex".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C0983.class, sb, "[");
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
