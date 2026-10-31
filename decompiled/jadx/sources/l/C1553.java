package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֫ۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7FV */
/* JADX INFO: loaded from: classes2.dex */
public final class C1553 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 f5470;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f5471;

    public C1553(InterfaceC17889 interfaceC17889, String str) {
        this.f5470 = interfaceC17889;
        this.f5471 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1553)) {
            return false;
        }
        C1553 c1553 = (C1553) obj;
        return C11003.equals(this.f5470, c1553.f5470) && C11003.equals(this.f5471, c1553.f5471);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f5471) + (C11003.hashCode(this.f5470) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f5470, this.f5471};
        String[] strArrSplit = "fileItem;mimeType".length() == 0 ? new String[0] : "fileItem;mimeType".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C1553.class, sb, "[");
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
    public final InterfaceC17889 m5311() {
        return this.f5470;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m5312() {
        return this.f5471;
    }
}
