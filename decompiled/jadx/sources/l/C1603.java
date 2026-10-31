package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֫ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06RI */
/* JADX INFO: loaded from: classes2.dex */
public final class C1603 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15713 f5655;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9611 f5656;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f5657;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f5658;

    public C1603() {
        throw null;
    }

    public C1603(C15713 c15713, C9611 c9611, long j, long j2) {
        this.f5655 = c15713;
        this.f5656 = c9611;
        this.f5657 = j;
        this.f5658 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1603)) {
            return false;
        }
        C1603 c1603 = (C1603) obj;
        return this.f5657 == c1603.f5657 && this.f5658 == c1603.f5658 && C11003.equals(this.f5655, c1603.f5655) && C11003.equals(this.f5656, c1603.f5656);
    }

    public final int hashCode() {
        long j = this.f5657;
        long j2 = this.f5658;
        return C11003.hashCode(this.f5656) + ((C11003.hashCode(this.f5655) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f5655, this.f5656, Long.valueOf(this.f5657), Long.valueOf(this.f5658)};
        String[] strArrSplit = "changes;history;mark;markCount".length() == 0 ? new String[0] : "changes;history;mark;markCount".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C1603.class, sb, "[");
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
