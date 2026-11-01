package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۜۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8735 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C24408 f23682;

    /* JADX INFO: renamed from: ۧ */
    public final int f23683;

    /* JADX INFO: renamed from: ܽ */
    public final C10307 f23684;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f23685;

    public C8735() {
        throw null;
    }

    public C8735(C24408 c24408, ArrayList arrayList, C10307 c10307, int i) {
        this.f23682 = c24408;
        this.f23685 = arrayList;
        this.f23684 = c10307;
        this.f23683 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8735)) {
            return false;
        }
        C8735 c8735 = (C8735) obj;
        return this.f23683 == c8735.f23683 && C12826.equals(this.f23682, c8735.f23682) && C12826.equals(this.f23685, c8735.f23685) && C12826.equals(this.f23684, c8735.f23684);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f23684) + ((C12826.hashCode(this.f23685) + ((C12826.hashCode(this.f23682) + (this.f23683 * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f23682, this.f23685, this.f23684, Integer.valueOf(this.f23683)};
        String[] strArrSplit = "group;supportedTrackIndices;representativeFormat;logicalIndex".length() == 0 ? new String[0] : "group;supportedTrackIndices;representativeFormat;logicalIndex".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C8735.class, sb, "[");
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
    public final C24408 m20195() {
        return this.f23682;
    }

    /* JADX INFO: renamed from: ܳ */
    public final List m20196() {
        return this.f23685;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m20197() {
        return this.f23683;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C10307 m20198() {
        return this.f23684;
    }
}
