package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۗܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes2.dex */
public final class C3378 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f10675;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f10676;

    public C3378(int i, int i2) {
        this.f10676 = i;
        this.f10675 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3378)) {
            return false;
        }
        C3378 c3378 = (C3378) obj;
        return this.f10676 == c3378.f10676 && this.f10675 == c3378.f10675;
    }

    public final int hashCode() {
        return (this.f10676 * 31) + this.f10675;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f10676), Integer.valueOf(this.f10675)};
        String[] strArrSplit = "start;end".length() == 0 ? new String[0] : "start;end".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C3378.class, sb, "[");
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
