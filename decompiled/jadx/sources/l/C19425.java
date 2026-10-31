package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes5.dex */
public final class C19425 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f62832;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f62833;

    public C19425() {
        throw null;
    }

    public C19425(ArrayList arrayList, int[] iArr) {
        this.f62833 = arrayList;
        this.f62832 = iArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19425)) {
            return false;
        }
        C19425 c19425 = (C19425) obj;
        return C11003.equals(this.f62833, c19425.f62833) && C11003.equals(this.f62832, c19425.f62832);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f62832) + (C11003.hashCode(this.f62833) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f62833, this.f62832};
        String[] strArrSplit = "ownerSets;componentByCandidate".length() == 0 ? new String[0] : "ownerSets;componentByCandidate".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C19425.class, sb, "[");
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] m44728() {
        return this.f62832;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m44729() {
        return this.f62833;
    }
}
