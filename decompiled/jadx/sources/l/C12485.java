package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۫ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes4.dex */
public final class C12485 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f37514;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f37515;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f37516;

    public C12485(int i, int i2, long j) {
        this.f37514 = j;
        this.f37516 = i;
        this.f37515 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12485)) {
            return false;
        }
        C12485 c12485 = (C12485) obj;
        return this.f37516 == c12485.f37516 && this.f37515 == c12485.f37515 && this.f37514 == c12485.f37514;
    }

    public final int hashCode() {
        int iM12551 = C4153.m12551(this.f37516, 31, this.f37515, 31);
        long j = this.f37514;
        return iM12551 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f37514), Integer.valueOf(this.f37516), Integer.valueOf(this.f37515)};
        String[] strArrSplit = "bucketIndex;widthPx;heightPx".length() == 0 ? new String[0] : "bucketIndex;widthPx;heightPx".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C12485.class, sb, "[");
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
