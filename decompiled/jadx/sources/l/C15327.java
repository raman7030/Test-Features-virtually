package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܶܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16WT */
/* JADX INFO: loaded from: classes4.dex */
public final class C15327 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f46985;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f46986;

    public final int hashCode() {
        long j = this.f46986;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f46985;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C15327(long j, long j2) {
        this.f46986 = j;
        this.f46985 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15327)) {
            return false;
        }
        C15327 c15327 = (C15327) obj;
        return this.f46986 == c15327.f46986 && this.f46985 == c15327.f46985;
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f46986), Long.valueOf(this.f46985)};
        String[] strArrSplit = "line;column".length() == 0 ? new String[0] : "line;column".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C15327.class, sb, "[");
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m36358() {
        return this.f46985;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m36359() {
        return this.f46986;
    }
}
