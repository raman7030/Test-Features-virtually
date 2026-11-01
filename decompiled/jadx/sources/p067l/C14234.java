package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.۫ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes4.dex */
public final class C14234 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final long f40537;

    /* JADX INFO: renamed from: ۧ */
    public final int f40538;

    /* JADX INFO: renamed from: ܽ */
    public final int f40539;

    public C14234(int i, int i2, long j) {
        this.f40537 = j;
        this.f40539 = i;
        this.f40538 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14234)) {
            return false;
        }
        C14234 c14234 = (C14234) obj;
        return this.f40539 == c14234.f40539 && this.f40538 == c14234.f40538 && this.f40537 == c14234.f40537;
    }

    public final int hashCode() {
        int iM14441 = C6316.m14441(this.f40539, 31, this.f40538, 31);
        long j = this.f40537;
        return iM14441 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f40537), Integer.valueOf(this.f40539), Integer.valueOf(this.f40538)};
        String[] strArrSplit = "bucketIndex;widthPx;heightPx".length() == 0 ? new String[0] : "bucketIndex;widthPx;heightPx".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C14234.class, sb, "[");
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
