package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۤۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66ND */
/* JADX INFO: loaded from: classes3.dex */
public final class C10105 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f30427;

    public C10105(int i) {
        this.f30427 = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C10105) && this.f30427 == ((C10105) obj).f30427;
    }

    public final int hashCode() {
        return this.f30427;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f30427)};
        String[] strArrSplit = "extra".length() == 0 ? new String[0] : "extra".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C10105.class, sb, "[");
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
