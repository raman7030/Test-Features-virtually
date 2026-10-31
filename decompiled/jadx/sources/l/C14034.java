package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܰ᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R9JP */
/* JADX INFO: loaded from: classes4.dex */
public final class C14034 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f42429;

    public C14034(boolean z) {
        this.f42429 = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C14034) && this.f42429 == ((C14034) obj).f42429 && "".equals("") && "".equals("");
    }

    public final int hashCode() {
        return "".hashCode() + (("".hashCode() + ((this.f42429 ? 1231 : 1237) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Boolean.valueOf(this.f42429)};
        String[] strArrSplit = "signingDisabledCandidate".length() == 0 ? new String[0] : "signingDisabledCandidate".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C14034.class, sb, "[");
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
    public final boolean m33647() {
        return this.f42429;
    }
}
