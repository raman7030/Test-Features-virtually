package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩷ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes5.dex */
public final class C21949 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final Integer f68989;

    /* JADX INFO: renamed from: ۧ */
    public final Integer f68990;

    public C21949(Integer num, Integer num2) {
        this.f68989 = num;
        this.f68990 = num2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21949)) {
            return false;
        }
        C21949 c21949 = (C21949) obj;
        return this.f68989.equals(c21949.f68989) && this.f68990.equals(c21949.f68990);
    }

    public final int hashCode() {
        return this.f68990.hashCode() + (this.f68989.hashCode() * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f68989, this.f68990};
        String[] strArrSplit = "from;to".length() == 0 ? new String[0] : "from;to".split(C0249l.f1196b);
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

    /* JADX INFO: renamed from: ֫ */
    public final Comparable m49471() {
        return this.f68989;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m49472(Integer num) {
        return this.f68989.compareTo(num) <= 0 && this.f68990.compareTo(num) >= 0;
    }
}
