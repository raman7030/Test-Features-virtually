package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩷ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes5.dex */
public final class C20603 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Integer f66309;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Integer f66310;

    public C20603(Integer num, Integer num2) {
        this.f66309 = num;
        this.f66310 = num2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20603)) {
            return false;
        }
        C20603 c20603 = (C20603) obj;
        return this.f66309.equals(c20603.f66309) && this.f66310.equals(c20603.f66310);
    }

    public final int hashCode() {
        return this.f66310.hashCode() + (this.f66309.hashCode() * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f66309, this.f66310};
        String[] strArrSplit = "from;to".length() == 0 ? new String[0] : "from;to".split(l.b);
        StringBuilder sb = new StringBuilder("Range[");
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
    public final Comparable m47145() {
        return this.f66309;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47146(Integer num) {
        return this.f66309.compareTo(num) <= 0 && this.f66310.compareTo(num) >= 0;
    }
}
