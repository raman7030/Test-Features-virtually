package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֫۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1685 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7513 f5851;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7513 f5852;

    public C1685(C7513 c7513, C7513 c7514) {
        this.f5851 = c7513;
        this.f5852 = c7514;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1685)) {
            return false;
        }
        C1685 c1685 = (C1685) obj;
        return C11003.equals(this.f5851, c1685.f5851) && C11003.equals(this.f5852, c1685.f5852);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f5852) + (C11003.hashCode(this.f5851) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f5851, this.f5852};
        String[] strArrSplit = "left;right".length() == 0 ? new String[0] : "left;right".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C1685.class, sb, "[");
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
