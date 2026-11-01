package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩸ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes5.dex */
public final class C22961 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f72227;

    /* JADX INFO: renamed from: ۧ */
    public final C20279 f72228;

    public C22961(boolean z, C20279 c20279) {
        this.f72227 = z;
        this.f72228 = c20279;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22961)) {
            return false;
        }
        C22961 c22961 = (C22961) obj;
        return this.f72227 == c22961.f72227 && C12826.equals(this.f72228, c22961.f72228);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f72228) + ((this.f72227 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {Boolean.valueOf(this.f72227), this.f72228};
        String[] strArrSplit = "active;inactive".length() == 0 ? new String[0] : "active;inactive".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C22961.class, sb, "[");
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
