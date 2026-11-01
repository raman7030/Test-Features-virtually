package p067l;

import android.graphics.Bitmap;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֡ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes2.dex */
public final class C2561 extends AbstractC15010 {

    /* JADX INFO: renamed from: ܽ */
    public static final C2561 f4224 = new C2561(null, null);

    /* JADX INFO: renamed from: ֫ */
    public final C15243 f4225;

    /* JADX INFO: renamed from: ۧ */
    public final Bitmap f4226;

    public C2561(Bitmap bitmap, C15243 c15243) {
        this.f4226 = bitmap;
        this.f4225 = c15243;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2561)) {
            return false;
        }
        C2561 c2561 = (C2561) obj;
        return C12826.equals(this.f4226, c2561.f4226) && C12826.equals(this.f4225, c2561.f4225);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f4225) + (C12826.hashCode(this.f4226) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f4226, this.f4225};
        String[] strArrSplit = "bitmap;aspectRatio".length() == 0 ? new String[0] : "bitmap;aspectRatio".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C2561.class, sb, "[");
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
    public final C15243 m3776() {
        return this.f4225;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Bitmap m3777() {
        return this.f4226;
    }
}
