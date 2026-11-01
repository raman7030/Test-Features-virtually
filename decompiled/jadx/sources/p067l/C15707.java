package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܰ᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R9JP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15707 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f45512;

    public C15707(boolean z) {
        this.f45512 = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C15707) && this.f45512 == ((C15707) obj).f45512 && "".equals("") && "".equals("");
    }

    public final int hashCode() {
        return "".hashCode() + (("".hashCode() + ((this.f45512 ? 1231 : 1237) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Boolean.valueOf(this.f45512)};
        String[] strArrSplit = "signingDisabledCandidate".length() == 0 ? new String[0] : "signingDisabledCandidate".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C15707.class, sb, "[");
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
    public final boolean m35767() {
        return this.f45512;
    }
}
