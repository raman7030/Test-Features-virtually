package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩳ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4H6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17747 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17041 f54298;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC23391 f54299;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9281 f54300;

    public C17747(C17041 c17041, C9281 c9281, EnumC23391 enumC23391) {
        this.f54298 = c17041;
        this.f54300 = c9281;
        this.f54299 = enumC23391;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17747)) {
            return false;
        }
        C17747 c17747 = (C17747) obj;
        return C11003.equals(this.f54298, c17747.f54298) && C11003.equals(this.f54300, c17747.f54300) && C11003.equals(this.f54299, c17747.f54299);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f54299) + ((C11003.hashCode(this.f54300) + (C11003.hashCode(this.f54298) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f54298, this.f54300, this.f54299};
        String[] strArrSplit = "request;store;state".length() == 0 ? new String[0] : "request;store;state".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C17747.class, sb, "[");
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
