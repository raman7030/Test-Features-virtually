package p067l;

import android.graphics.Bitmap;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩻۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes.dex */
public final class C24768 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final Bitmap f78396;

    /* JADX INFO: renamed from: ۧ */
    public final EnumC8675 f78397;

    public C24768(EnumC8675 enumC8675, Bitmap bitmap) {
        this.f78397 = enumC8675;
        this.f78396 = bitmap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24768)) {
            return false;
        }
        C24768 c24768 = (C24768) obj;
        return C12826.equals(this.f78397, c24768.f78397) && C12826.equals(this.f78396, c24768.f78396);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f78396) + (C12826.hashCode(this.f78397) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f78397, this.f78396};
        String[] strArrSplit = "status;bitmap".length() == 0 ? new String[0] : "status;bitmap".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C24768.class, sb, "[");
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
    public final Bitmap m54439() {
        return this.f78396;
    }

    /* JADX INFO: renamed from: ܽ */
    public final EnumC8675 m54440() {
        return this.f78397;
    }
}
