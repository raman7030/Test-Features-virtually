package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۟ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7259 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f22273;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Uri f22274;

    public C7259(Uri uri, byte[] bArr) {
        this.f22273 = bArr;
        this.f22274 = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7259)) {
            return false;
        }
        C7259 c7259 = (C7259) obj;
        return C11003.equals(this.f22273, c7259.f22273) && C11003.equals(this.f22274, c7259.f22274);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f22274) + (C11003.hashCode(this.f22273) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f22273, this.f22274};
        String[] strArrSplit = "body;finalUri".length() == 0 ? new String[0] : "body;finalUri".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C7259.class, sb, "[");
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
    public final byte[] m19427() {
        return this.f22273;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Uri m19428() {
        return this.f22274;
    }
}
