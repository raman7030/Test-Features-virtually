package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩺᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V743 */
/* JADX INFO: loaded from: classes.dex */
public final class C23215 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f74602;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f74603;

    public C23215(long j, String str) {
        this.f74603 = str;
        this.f74602 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23215)) {
            return false;
        }
        C23215 c23215 = (C23215) obj;
        return this.f74602 == c23215.f74602 && C11003.equals(this.f74603, c23215.f74603);
    }

    public final int hashCode() {
        long j = this.f74602;
        return C11003.hashCode(this.f74603) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f74603, Long.valueOf(this.f74602)};
        String[] strArrSplit = "resourceKey;pageNumber".length() == 0 ? new String[0] : "resourceKey;pageNumber".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C23215.class, sb, "[");
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
