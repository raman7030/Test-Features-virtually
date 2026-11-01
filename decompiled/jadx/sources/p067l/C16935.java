package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܶܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16WT */
/* JADX INFO: loaded from: classes4.dex */
public final class C16935 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final long f50111;

    /* JADX INFO: renamed from: ۧ */
    public final long f50112;

    public final int hashCode() {
        long j = this.f50112;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f50111;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C16935(long j, long j2) {
        this.f50112 = j;
        this.f50111 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16935)) {
            return false;
        }
        C16935 c16935 = (C16935) obj;
        return this.f50112 == c16935.f50112 && this.f50111 == c16935.f50111;
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f50112), Long.valueOf(this.f50111)};
        String[] strArrSplit = "line;column".length() == 0 ? new String[0] : "line;column".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C16935.class, sb, "[");
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
    public final long m38516() {
        return this.f50111;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m38517() {
        return this.f50112;
    }
}
