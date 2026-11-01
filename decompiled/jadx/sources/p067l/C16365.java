package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes4.dex */
public final class C16365 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f48090;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f48091;

    public C16365() {
        throw null;
    }

    public C16365(ArrayList arrayList, ArrayList arrayList2) {
        this.f48090 = arrayList;
        this.f48091 = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16365)) {
            return false;
        }
        C16365 c16365 = (C16365) obj;
        return C12826.equals(this.f48090, c16365.f48090) && C12826.equals(this.f48091, c16365.f48091);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f48091) + (C12826.hashCode(this.f48090) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f48090, this.f48091};
        String[] strArrSplit = "directories;files".length() == 0 ? new String[0] : "directories;files".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C16365.class, sb, "[");
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
