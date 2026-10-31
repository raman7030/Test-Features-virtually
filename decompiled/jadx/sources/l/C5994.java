package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۛۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7TV */
/* JADX INFO: loaded from: classes3.dex */
public final class C5994 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f18429;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f18430;

    public C5994(int i, byte[] bArr) {
        this.f18430 = i;
        this.f18429 = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5994)) {
            return false;
        }
        C5994 c5994 = (C5994) obj;
        return this.f18430 == c5994.f18430 && C11003.equals(this.f18429, c5994.f18429);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f18429) + (this.f18430 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f18430), this.f18429};
        String[] strArrSplit = "type;data".length() == 0 ? new String[0] : "type;data".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C5994.class, sb, "[");
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
