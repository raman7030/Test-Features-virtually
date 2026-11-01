package p067l;

import android.net.Uri;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۘ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274F */
/* JADX INFO: loaded from: classes3.dex */
public final class C5796 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C7074 f14237;

    /* JADX INFO: renamed from: ۧ */
    public final Uri f14238;

    /* JADX INFO: renamed from: ܽ */
    public final C23168 f14239;

    public C5796(Uri uri, C7074 c7074, C23168 c23168) {
        this.f14238 = uri;
        this.f14237 = c7074;
        this.f14239 = c23168;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5796)) {
            return false;
        }
        C5796 c5796 = (C5796) obj;
        return C12826.equals(this.f14238, c5796.f14238) && C12826.equals(this.f14237, c5796.f14237) && C12826.equals(this.f14239, c5796.f14239);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f14239) + ((C12826.hashCode(this.f14237) + (C12826.hashCode(this.f14238) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f14238, this.f14237, this.f14239};
        String[] strArrSplit = "playlistUri;playlist;segment".length() == 0 ? new String[0] : "playlistUri;playlist;segment".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C5796.class, sb, "[");
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
