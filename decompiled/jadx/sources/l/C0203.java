package l;

import android.graphics.Bitmap;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֡ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes2.dex */
public final class C0203 extends AbstractC13301 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C0203 f1445 = new C0203(null, null);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13547 f1446;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Bitmap f1447;

    public C0203(Bitmap bitmap, C13547 c13547) {
        this.f1447 = bitmap;
        this.f1446 = c13547;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0203)) {
            return false;
        }
        C0203 c0203 = (C0203) obj;
        return C11003.equals(this.f1447, c0203.f1447) && C11003.equals(this.f1446, c0203.f1446);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f1446) + (C11003.hashCode(this.f1447) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f1447, this.f1446};
        String[] strArrSplit = "bitmap;aspectRatio".length() == 0 ? new String[0] : "bitmap;aspectRatio".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C0203.class, sb, "[");
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
    public final C13547 m1363() {
        return this.f1446;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Bitmap m1364() {
        return this.f1447;
    }
}
