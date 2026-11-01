package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۙ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N9ZJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6460 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C21213 f16697;

    /* JADX INFO: renamed from: ۧ */
    public final EnumC17187 f16698;

    public C6460(C21213 c21213, EnumC17187 enumC17187) {
        this.f16697 = c21213;
        this.f16698 = enumC17187;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6460)) {
            return false;
        }
        C6460 c6460 = (C6460) obj;
        return C12826.equals(this.f16697, c6460.f16697) && C12826.equals(this.f16698, c6460.f16698);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f16698) + (C12826.hashCode(this.f16697) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f16697, this.f16698};
        String[] strArrSplit = "context;state".length() == 0 ? new String[0] : "context;state".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C6460.class, sb, "[");
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
