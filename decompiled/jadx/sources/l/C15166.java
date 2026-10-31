package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܶۤۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C15166 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f46331;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f46332;

    public C15166(int i, int i2) {
        this.f46331 = i;
        this.f46332 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15166)) {
            return false;
        }
        C15166 c15166 = (C15166) obj;
        return this.f46331 == c15166.f46331 && this.f46332 == c15166.f46332;
    }

    public final int hashCode() {
        return (this.f46331 * 31) + this.f46332;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f46331), Integer.valueOf(this.f46332)};
        String[] strArrSplit = "end;offset".length() == 0 ? new String[0] : "end;offset".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C15166.class, sb, "[");
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
