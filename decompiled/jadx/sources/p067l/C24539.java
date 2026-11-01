package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩺᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: E708 */
/* JADX INFO: loaded from: classes.dex */
public final class C24539 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f77728;

    /* JADX INFO: renamed from: ۧ */
    public final String f77729;

    public C24539(int i, String str) {
        this.f77728 = i;
        this.f77729 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24539)) {
            return false;
        }
        C24539 c24539 = (C24539) obj;
        return this.f77728 == c24539.f77728 && C12826.equals(this.f77729, c24539.f77729);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f77729) + (this.f77728 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f77728), this.f77729};
        String[] strArrSplit = "group;name".length() == 0 ? new String[0] : "group;name".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder("CaptureExport[");
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
    public final int m54130() {
        return this.f77728;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m54131() {
        return this.f77729;
    }
}
