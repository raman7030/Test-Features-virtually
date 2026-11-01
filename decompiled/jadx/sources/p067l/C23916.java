package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩺֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 37EB */
/* JADX INFO: loaded from: classes.dex */
public final class C23916 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C3384 f75907;

    /* JADX INFO: renamed from: ۧ */
    public final String f75908;

    public C23916(String str, C3384 c3384) {
        this.f75908 = str;
        this.f75907 = c3384;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23916)) {
            return false;
        }
        C23916 c23916 = (C23916) obj;
        return C12826.equals(this.f75908, c23916.f75908) && C12826.equals(this.f75907, c23916.f75907);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f75907) + (C12826.hashCode(this.f75908) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f75908, this.f75907};
        String[] strArrSplit = "strBsm;cpx2Const".length() == 0 ? new String[0] : "strBsm;cpx2Const".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C23916.class, sb, "[");
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
    public final C3384 m52988() {
        return this.f75907;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m52989() {
        return this.f75908;
    }
}
