package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩶۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E762 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20034 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f64902;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f64903;

    public C20034(String str, String str2) {
        this.f64903 = str;
        this.f64902 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20034)) {
            return false;
        }
        C20034 c20034 = (C20034) obj;
        return C11003.equals(this.f64903, c20034.f64903) && C11003.equals(this.f64902, c20034.f64902);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f64902) + (C11003.hashCode(this.f64903) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f64903, this.f64902};
        String[] strArrSplit = "locator;entryName".length() == 0 ? new String[0] : "locator;entryName".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C20034.class, sb, "[");
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
