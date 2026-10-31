package l;

import com.alipay.sdk.m.y.l;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes.dex */
public final class C23632 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence f76569;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23190 f76570;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f76571;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f76572;

    public C23632() {
        throw null;
    }

    public C23632(C23190 c23190, List list, String str, int i) {
        this.f76570 = c23190;
        this.f76572 = list;
        this.f76569 = str;
        this.f76571 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23632)) {
            return false;
        }
        C23632 c23632 = (C23632) obj;
        return this.f76571 == c23632.f76571 && C11003.equals(this.f76570, c23632.f76570) && C11003.equals(this.f76572, c23632.f76572) && C11003.equals(this.f76569, c23632.f76569);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f76569) + ((C11003.hashCode(this.f76572) + ((C11003.hashCode(this.f76570) + (this.f76571 * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f76570, this.f76572, this.f76569, Integer.valueOf(this.f76571)};
        String[] strArrSplit = "group;supportedTrackIndices;displayName;logicalIndex".length() == 0 ? new String[0] : "group;supportedTrackIndices;displayName;logicalIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C23632.class, sb, "[");
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
    public final CharSequence m52118() {
        return this.f76569;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m52119() {
        return this.f76572;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23190 m52120() {
        return this.f76570;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m52121() {
        return this.f76571;
    }
}
