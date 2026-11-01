package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩻᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes.dex */
public final class C25103 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C13010 f80343;

    /* JADX INFO: renamed from: ۧ */
    public final int f80344;

    public C25103(C13010 c13010, int i) {
        this.f80343 = c13010;
        this.f80344 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C25103)) {
            return false;
        }
        C25103 c25103 = (C25103) obj;
        return this.f80344 == c25103.f80344 && C12826.equals(this.f80343, c25103.f80343);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f80343) + (this.f80344 * 31);
    }

    public final int position() {
        return this.f80344;
    }

    public final String toString() {
        Object[] objArr = {this.f80343, Integer.valueOf(this.f80344)};
        String[] strArrSplit = "mediaItem;position".length() == 0 ? new String[0] : "mediaItem;position".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C25103.class, sb, "[");
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
    public final C13010 m55092() {
        return this.f80343;
    }
}
