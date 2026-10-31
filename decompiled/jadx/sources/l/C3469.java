package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۗ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56R4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3469 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f10983;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f10984;

    public C3469(String str, int i) {
        this.f10984 = str;
        this.f10983 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3469)) {
            return false;
        }
        C3469 c3469 = (C3469) obj;
        return this.f10983 == c3469.f10983 && C11003.equals(this.f10984, c3469.f10984);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f10984) + (this.f10983 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f10984, Integer.valueOf(this.f10983)};
        String[] strArrSplit = "text;restoredHash".length() == 0 ? new String[0] : "text;restoredHash".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C3469.class, sb, "[");
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
    public final int m10614() {
        return this.f10983;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m10615() {
        return this.f10984;
    }
}
