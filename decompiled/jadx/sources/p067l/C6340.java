package p067l;

import android.graphics.Bitmap;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۘ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes3.dex */
public final class C6340 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final Bitmap f16438;

    /* JADX INFO: renamed from: ۧ */
    public final String f16439;

    /* JADX INFO: renamed from: ܽ */
    public final CharSequence f16440;

    public C6340(String str, CharSequence charSequence, Bitmap bitmap) {
        this.f16439 = str;
        this.f16440 = charSequence;
        this.f16438 = bitmap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6340)) {
            return false;
        }
        C6340 c6340 = (C6340) obj;
        return C12826.equals(this.f16439, c6340.f16439) && C12826.equals(this.f16440, c6340.f16440) && C12826.equals(this.f16438, c6340.f16438);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f16438) + ((C12826.hashCode(this.f16440) + (C12826.hashCode(this.f16439) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f16439, this.f16440, this.f16438};
        String[] strArrSplit = "id;label;icon".length() == 0 ? new String[0] : "id;label;icon".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C6340.class, sb, "[");
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
    public final Bitmap m14498() {
        return this.f16438;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m14499() {
        return this.f16439;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final CharSequence m14500() {
        return this.f16440;
    }
}
