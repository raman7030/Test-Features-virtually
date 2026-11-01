package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14653 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C10631 f41835;

    /* JADX INFO: renamed from: ۧ */
    public final List f41836;

    public C14653() {
        throw null;
    }

    public C14653(ArrayList arrayList, C10631 c10631) {
        this.f41836 = arrayList;
        this.f41835 = c10631;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14653)) {
            return false;
        }
        C14653 c14653 = (C14653) obj;
        return C12826.equals(this.f41836, c14653.f41836) && C12826.equals(this.f41835, c14653.f41835);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f41835) + (C12826.hashCode(this.f41836) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f41836, this.f41835};
        String[] strArrSplit = "tokens;root".length() == 0 ? new String[0] : "tokens;root".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C14653.class, sb, "[");
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
