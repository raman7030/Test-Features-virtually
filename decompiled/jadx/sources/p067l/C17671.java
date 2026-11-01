package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܺᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes4.dex */
public final class C17671 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C10967 f52780;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f52781;

    public C17671(C10967 c10967, boolean z) {
        this.f52780 = c10967;
        this.f52781 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17671)) {
            return false;
        }
        C17671 c17671 = (C17671) obj;
        return this.f52781 == c17671.f52781 && C12826.equals(this.f52780, c17671.f52780);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f52780) + ((this.f52781 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f52780, Boolean.valueOf(this.f52781)};
        String[] strArrSplit = "node;removedPatternIdentity".length() == 0 ? new String[0] : "node;removedPatternIdentity".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C17671.class, sb, "[");
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
    public final C10967 m40186() {
        return this.f52780;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m40187() {
        return this.f52781;
    }
}
