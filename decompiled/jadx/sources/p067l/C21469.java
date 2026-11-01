package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: KAHM */
/* JADX INFO: loaded from: classes5.dex */
public final class C21469 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final List f67731;

    /* JADX INFO: renamed from: ۧ */
    public final List f67732;

    public C21469(List list, List list2) {
        this.f67732 = list;
        this.f67731 = list2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21469)) {
            return false;
        }
        C21469 c21469 = (C21469) obj;
        return C12826.equals(this.f67732, c21469.f67732) && C12826.equals(this.f67731, c21469.f67731);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f67731) + (C12826.hashCode(this.f67732) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f67732, this.f67731};
        String[] strArrSplit = "uidList;gidList".length() == 0 ? new String[0] : "uidList;gidList".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C21469.class, sb, "[");
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
    public final List m48659() {
        return this.f67731;
    }

    /* JADX INFO: renamed from: ܽ */
    public final List m48660() {
        return this.f67732;
    }
}
