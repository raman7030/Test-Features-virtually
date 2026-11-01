package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6MY */
/* JADX INFO: loaded from: classes5.dex */
public final class C22330 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final List f70497;

    /* JADX INFO: renamed from: ۧ */
    public final int f70498;

    public C22330(ArrayList arrayList, int i) {
        this.f70497 = arrayList;
        this.f70498 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22330)) {
            return false;
        }
        C22330 c22330 = (C22330) obj;
        return this.f70498 == c22330.f70498 && C12826.equals(this.f70497, c22330.f70497);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f70497) + (this.f70498 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f70497, Integer.valueOf(this.f70498)};
        String[] strArrSplit = "parts;rows".length() == 0 ? new String[0] : "parts;rows".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C22330.class, sb, "[");
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

    /* JADX INFO: renamed from: ܽ */
    public final List m50152() {
        return this.f70497;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m50151() {
        return ((C11601) C9179.m21131(1, this.f70497)).f32356;
    }
}
