package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܿۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6TT */
/* JADX INFO: loaded from: classes4.dex */
public final class C17083 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f52387;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f52388;

    public C17083(int i, Object obj) {
        this.f52387 = i;
        this.f52388 = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17083)) {
            return false;
        }
        C17083 c17083 = (C17083) obj;
        return this.f52387 == c17083.f52387 && C11003.equals(this.f52388, c17083.f52388);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f52388) + (this.f52387 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f52387), this.f52388};
        String[] strArrSplit = "type;value".length() == 0 ? new String[0] : "type;value".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C17083.class, sb, "[");
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
