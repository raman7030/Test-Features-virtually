package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֫۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes2.dex */
public final class C1697 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f5883;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Uri f5884;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC10596 f5885;

    public C1697(AbstractC10596 abstractC10596, Uri uri, String str) {
        this.f5885 = abstractC10596;
        this.f5884 = uri;
        this.f5883 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1697)) {
            return false;
        }
        C1697 c1697 = (C1697) obj;
        return C11003.equals(this.f5885, c1697.f5885) && C11003.equals(this.f5884, c1697.f5884) && C11003.equals(this.f5883, c1697.f5883);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f5883) + ((C11003.hashCode(this.f5884) + (C11003.hashCode(this.f5885) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f5885, this.f5884, this.f5883};
        String[] strArrSplit = "playlist;finalUri;bodySha256".length() == 0 ? new String[0] : "playlist;finalUri;bodySha256".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C1697.class, sb, "[");
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
