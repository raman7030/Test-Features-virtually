package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۠ܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7EO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8254 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f25399;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f25400;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f25401;

    public C8254(String str, boolean z, boolean z2) {
        this.f25401 = str;
        this.f25399 = z;
        this.f25400 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8254)) {
            return false;
        }
        C8254 c8254 = (C8254) obj;
        return this.f25399 == c8254.f25399 && this.f25400 == c8254.f25400 && C11003.equals(this.f25401, c8254.f25401);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f25401) + ((((this.f25399 ? 1231 : 1237) * 31) + (this.f25400 ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f25401, Boolean.valueOf(this.f25399), Boolean.valueOf(this.f25400)};
        String[] strArrSplit = "name;defaultChecked;mainApkCandidate".length() == 0 ? new String[0] : "name;defaultChecked;mainApkCandidate".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C8254.class, sb, "[");
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
    public final boolean m21838() {
        return this.f25399;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m21839() {
        return this.f25400;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m21840() {
        return this.f25401;
    }
}
