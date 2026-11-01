package p067l;

import android.net.Uri;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֫۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes2.dex */
public final class C3981 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f8662;

    /* JADX INFO: renamed from: ۧ */
    public final Uri f8663;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC12439 f8664;

    public C3981(AbstractC12439 abstractC12439, Uri uri, String str) {
        this.f8664 = abstractC12439;
        this.f8663 = uri;
        this.f8662 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3981)) {
            return false;
        }
        C3981 c3981 = (C3981) obj;
        return C12826.equals(this.f8664, c3981.f8664) && C12826.equals(this.f8663, c3981.f8663) && C12826.equals(this.f8662, c3981.f8662);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f8662) + ((C12826.hashCode(this.f8663) + (C12826.hashCode(this.f8664) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f8664, this.f8663, this.f8662};
        String[] strArrSplit = "playlist;finalUri;bodySha256".length() == 0 ? new String[0] : "playlist;finalUri;bodySha256".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C3981.class, sb, "[");
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
