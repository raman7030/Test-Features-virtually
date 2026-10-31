package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֨᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T72Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C1343 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2608 f4888;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f4889;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f4890;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f4891;

    public C1343(C2608 c2608, boolean z, int i, long j) {
        this.f4888 = c2608;
        this.f4889 = z;
        this.f4890 = i;
        this.f4891 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1343)) {
            return false;
        }
        C1343 c1343 = (C1343) obj;
        return this.f4889 == c1343.f4889 && this.f4890 == c1343.f4890 && this.f4891 == c1343.f4891 && C11003.equals(this.f4888, c1343.f4888);
    }

    public final int hashCode() {
        int iM12551 = C4153.m12551(this.f4889 ? 1231 : 1237, 31, this.f4890, 31);
        long j = this.f4891;
        return C11003.hashCode(this.f4888) + ((iM12551 + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f4888, Boolean.valueOf(this.f4889), Integer.valueOf(this.f4890), Long.valueOf(this.f4891)};
        String[] strArrSplit = "arguments;historyChanged;pausedPosition;sourceGeneration".length() == 0 ? new String[0] : "arguments;historyChanged;pausedPosition;sourceGeneration".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C1343.class, sb, "[");
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
    public final C2608 m4688() {
        return this.f4888;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m4689() {
        return this.f4891;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m4690() {
        return this.f4889;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m4691() {
        return this.f4890;
    }
}
