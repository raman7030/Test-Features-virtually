package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩺᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V743 */
/* JADX INFO: loaded from: classes.dex */
public final class C24432 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final long f77345;

    /* JADX INFO: renamed from: ۧ */
    public final String f77346;

    public C24432(long j, String str) {
        this.f77346 = str;
        this.f77345 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24432)) {
            return false;
        }
        C24432 c24432 = (C24432) obj;
        return this.f77345 == c24432.f77345 && C12826.equals(this.f77346, c24432.f77346);
    }

    public final int hashCode() {
        long j = this.f77345;
        return C12826.hashCode(this.f77346) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f77346, Long.valueOf(this.f77345)};
        String[] strArrSplit = "resourceKey;pageNumber".length() == 0 ? new String[0] : "resourceKey;pageNumber".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C24432.class, sb, "[");
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
