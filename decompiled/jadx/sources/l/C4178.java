package l;

import android.graphics.Bitmap;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۘ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes3.dex */
public final class C4178 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap f13625;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f13626;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence f13627;

    public C4178(String str, CharSequence charSequence, Bitmap bitmap) {
        this.f13626 = str;
        this.f13627 = charSequence;
        this.f13625 = bitmap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4178)) {
            return false;
        }
        C4178 c4178 = (C4178) obj;
        return C11003.equals(this.f13626, c4178.f13626) && C11003.equals(this.f13627, c4178.f13627) && C11003.equals(this.f13625, c4178.f13625);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f13625) + ((C11003.hashCode(this.f13627) + (C11003.hashCode(this.f13626) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f13626, this.f13627, this.f13625};
        String[] strArrSplit = "id;label;icon".length() == 0 ? new String[0] : "id;label;icon".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C4178.class, sb, "[");
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
    public final Bitmap m12623() {
        return this.f13625;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m12624() {
        return this.f13626;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CharSequence m12625() {
        return this.f13627;
    }
}
