package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩷ۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20591 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC6479 f66287;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC6479 f66288;

    public C20591(AbstractC6479 abstractC6479, AbstractC6479 abstractC64710) {
        this.f66287 = abstractC6479;
        this.f66288 = abstractC64710;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20591)) {
            return false;
        }
        C20591 c20591 = (C20591) obj;
        return C11003.equals(this.f66287, c20591.f66287) && C11003.equals(this.f66288, c20591.f66288);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f66288) + (C11003.hashCode(this.f66287) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f66287, this.f66288};
        String[] strArrSplit = "left;right".length() == 0 ? new String[0] : "left;right".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C20591.class, sb, "[");
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
