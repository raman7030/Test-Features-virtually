package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۡۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W261 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8800 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f26805;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f26806;

    public final int hashCode() {
        long j = this.f26806;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f26805;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C8800(long j, long j2) {
        this.f26806 = j;
        this.f26805 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8800)) {
            return false;
        }
        C8800 c8800 = (C8800) obj;
        return this.f26806 == c8800.f26806 && this.f26805 == c8800.f26805;
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f26806), Long.valueOf(this.f26805)};
        String[] strArrSplit = "minTime;maxTime".length() == 0 ? new String[0] : "minTime;maxTime".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C8800.class, sb, "[");
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m22704(long j) {
        return this.f26806 <= j && j < this.f26805;
    }
}
