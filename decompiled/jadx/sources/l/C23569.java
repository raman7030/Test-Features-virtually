package l;

import android.graphics.Bitmap;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩻۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes.dex */
public final class C23569 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap f75650;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC6636 f75651;

    public C23569(EnumC6636 enumC6636, Bitmap bitmap) {
        this.f75651 = enumC6636;
        this.f75650 = bitmap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23569)) {
            return false;
        }
        C23569 c23569 = (C23569) obj;
        return C11003.equals(this.f75651, c23569.f75651) && C11003.equals(this.f75650, c23569.f75650);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f75650) + (C11003.hashCode(this.f75651) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f75651, this.f75650};
        String[] strArrSplit = "status;bitmap".length() == 0 ? new String[0] : "status;bitmap".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C23569.class, sb, "[");
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
    public final Bitmap m52037() {
        return this.f75650;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC6636 m52038() {
        return this.f75651;
    }
}
