package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes4.dex */
public final class C14727 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f44977;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f44978;

    public C14727() {
        throw null;
    }

    public C14727(ArrayList arrayList, ArrayList arrayList2) {
        this.f44977 = arrayList;
        this.f44978 = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14727)) {
            return false;
        }
        C14727 c14727 = (C14727) obj;
        return C11003.equals(this.f44977, c14727.f44977) && C11003.equals(this.f44978, c14727.f44978);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f44978) + (C11003.hashCode(this.f44977) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f44977, this.f44978};
        String[] strArrSplit = "directories;files".length() == 0 ? new String[0] : "directories;files".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C14727.class, sb, "[");
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
