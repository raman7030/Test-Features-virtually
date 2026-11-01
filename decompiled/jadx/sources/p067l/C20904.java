package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes5.dex */
public final class C20904 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C8500 f65650;

    /* JADX INFO: renamed from: ۧ */
    public final List f65651;

    public C20904() {
        throw null;
    }

    public C20904(ArrayList arrayList, C8500 c8500) {
        this.f65651 = arrayList;
        this.f65650 = c8500;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20904)) {
            return false;
        }
        C20904 c20904 = (C20904) obj;
        return C12826.equals(this.f65651, c20904.f65651) && C12826.equals(this.f65650, c20904.f65650);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f65650) + (C12826.hashCode(this.f65651) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f65651, this.f65650};
        String[] strArrSplit = "tokens;root".length() == 0 ? new String[0] : "tokens;root".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C20904.class, sb, "[");
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
