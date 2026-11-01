package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes5.dex */
public final class C20830 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f65445;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f65446;

    public C20830() {
        throw null;
    }

    public C20830(ArrayList arrayList, int[] iArr) {
        this.f65446 = arrayList;
        this.f65445 = iArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20830)) {
            return false;
        }
        C20830 c20830 = (C20830) obj;
        return C12826.equals(this.f65446, c20830.f65446) && C12826.equals(this.f65445, c20830.f65445);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f65445) + (C12826.hashCode(this.f65446) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f65446, this.f65445};
        String[] strArrSplit = "ownerSets;componentByCandidate".length() == 0 ? new String[0] : "ownerSets;componentByCandidate".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C20830.class, sb, "[");
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
    public final int[] m47022() {
        return this.f65445;
    }

    /* JADX INFO: renamed from: ܽ */
    public final List m47023() {
        return this.f65446;
    }
}
