package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۡۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W261 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10732 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final long f29730;

    /* JADX INFO: renamed from: ۧ */
    public final long f29731;

    public final int hashCode() {
        long j = this.f29731;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f29730;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C10732(long j, long j2) {
        this.f29731 = j;
        this.f29730 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10732)) {
            return false;
        }
        C10732 c10732 = (C10732) obj;
        return this.f29731 == c10732.f29731 && this.f29730 == c10732.f29730;
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f29731), Long.valueOf(this.f29730)};
        String[] strArrSplit = "minTime;maxTime".length() == 0 ? new String[0] : "minTime;maxTime".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C10732.class, sb, "[");
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

    /* JADX INFO: renamed from: ۧ */
    public final boolean m24674(long j) {
        return this.f29731 <= j && j < this.f29730;
    }
}
