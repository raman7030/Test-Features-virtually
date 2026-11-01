package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import net.p069sf.sevenzipjbinding.ExtractOperationResult;

/* JADX INFO: renamed from: l.ܽ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes4.dex */
public final class C18505 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f55270;

    /* JADX INFO: renamed from: ۧ */
    public final ExtractOperationResult f55271;

    public C18505(ExtractOperationResult extractOperationResult, boolean z) {
        this.f55271 = extractOperationResult;
        this.f55270 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18505)) {
            return false;
        }
        C18505 c18505 = (C18505) obj;
        return this.f55270 == c18505.f55270 && C12826.equals(this.f55271, c18505.f55271);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f55271) + ((this.f55270 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f55271, Boolean.valueOf(this.f55270)};
        String[] strArrSplit = "result;encrypted".length() == 0 ? new String[0] : "result;encrypted".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C18505.class, sb, "[");
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
    public final boolean m42052() {
        return this.f55270;
    }

    /* JADX INFO: renamed from: ܽ */
    public final ExtractOperationResult m42053() {
        return this.f55271;
    }
}
