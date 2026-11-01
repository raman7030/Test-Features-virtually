package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֨۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E762 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3303 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f6455;

    /* JADX INFO: renamed from: ۧ */
    public final long f6456;

    public C3303(long j, String str) {
        this.f6456 = j;
        this.f6455 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3303)) {
            return false;
        }
        C3303 c3303 = (C3303) obj;
        return this.f6456 == c3303.f6456 && C12826.equals(this.f6455, c3303.f6455);
    }

    public final int hashCode() {
        long j = this.f6456;
        return C12826.hashCode(this.f6455) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f6456), this.f6455};
        String[] strArrSplit = "value;hex".length() == 0 ? new String[0] : "value;hex".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C3303.class, sb, "[");
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
