package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes.dex */
public final class C24828 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence f79313;

    /* JADX INFO: renamed from: ۧ */
    public final C24408 f79314;

    /* JADX INFO: renamed from: ܽ */
    public final int f79315;

    /* JADX INFO: renamed from: ᩳ */
    public final List f79316;

    public C24828() {
        throw null;
    }

    public C24828(C24408 c24408, List list, String str, int i) {
        this.f79314 = c24408;
        this.f79316 = list;
        this.f79313 = str;
        this.f79315 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24828)) {
            return false;
        }
        C24828 c24828 = (C24828) obj;
        return this.f79315 == c24828.f79315 && C12826.equals(this.f79314, c24828.f79314) && C12826.equals(this.f79316, c24828.f79316) && C12826.equals(this.f79313, c24828.f79313);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f79313) + ((C12826.hashCode(this.f79316) + ((C12826.hashCode(this.f79314) + (this.f79315 * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f79314, this.f79316, this.f79313, Integer.valueOf(this.f79315)};
        String[] strArrSplit = "group;supportedTrackIndices;displayName;logicalIndex".length() == 0 ? new String[0] : "group;supportedTrackIndices;displayName;logicalIndex".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C24828.class, sb, "[");
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
    public final CharSequence m54521() {
        return this.f79313;
    }

    /* JADX INFO: renamed from: ܳ */
    public final List m54522() {
        return this.f79316;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C24408 m54523() {
        return this.f79314;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m54524() {
        return this.f79315;
    }
}
