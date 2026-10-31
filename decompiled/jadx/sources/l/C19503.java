package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes5.dex */
public final class C19503 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6452 f63033;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f63034;

    public C19503() {
        throw null;
    }

    public C19503(ArrayList arrayList, C6452 c6452) {
        this.f63034 = arrayList;
        this.f63033 = c6452;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19503)) {
            return false;
        }
        C19503 c19503 = (C19503) obj;
        return C11003.equals(this.f63034, c19503.f63034) && C11003.equals(this.f63033, c19503.f63033);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f63033) + (C11003.hashCode(this.f63034) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f63034, this.f63033};
        String[] strArrSplit = "tokens;root".length() == 0 ? new String[0] : "tokens;root".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C19503.class, sb, "[");
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
