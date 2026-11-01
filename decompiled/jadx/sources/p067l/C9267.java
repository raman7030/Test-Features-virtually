package p067l;

import android.net.Uri;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.۟ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9267 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f25163;

    /* JADX INFO: renamed from: ۧ */
    public final Uri f25164;

    public C9267(Uri uri, byte[] bArr) {
        this.f25163 = bArr;
        this.f25164 = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9267)) {
            return false;
        }
        C9267 c9267 = (C9267) obj;
        return C12826.equals(this.f25163, c9267.f25163) && C12826.equals(this.f25164, c9267.f25164);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f25164) + (C12826.hashCode(this.f25163) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f25163, this.f25164};
        String[] strArrSplit = "body;finalUri".length() == 0 ? new String[0] : "body;finalUri".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C9267.class, sb, "[");
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
    public final byte[] m21393() {
        return this.f25163;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Uri m21394() {
        return this.f25164;
    }
}
