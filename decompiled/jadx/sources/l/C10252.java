package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۤۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C10252 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f30895;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6018 f30896;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m25980(C10252 c10252) {
        return c10252.f30895;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C6018 m25981(C10252 c10252) {
        return c10252.f30896;
    }

    public C10252(C6018 c6018, boolean z) {
        this.f30896 = c6018;
        this.f30895 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10252)) {
            return false;
        }
        C10252 c10252 = (C10252) obj;
        return this.f30895 == c10252.f30895 && C11003.equals(this.f30896, c10252.f30896);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f30896) + ((this.f30895 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f30896, Boolean.valueOf(this.f30895)};
        String[] strArrSplit = "recipe;exit".length() == 0 ? new String[0] : "recipe;exit".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C10252.class, sb, "[");
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
