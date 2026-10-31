package l;

import com.alipay.sdk.m.y.l;
import net.sf.sevenzipjbinding.ExtractOperationResult;

/* JADX INFO: renamed from: l.ܽ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes4.dex */
public final class C16978 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f52090;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ExtractOperationResult f52091;

    public C16978(ExtractOperationResult extractOperationResult, boolean z) {
        this.f52091 = extractOperationResult;
        this.f52090 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16978)) {
            return false;
        }
        C16978 c16978 = (C16978) obj;
        return this.f52090 == c16978.f52090 && C11003.equals(this.f52091, c16978.f52091);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f52091) + ((this.f52090 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f52091, Boolean.valueOf(this.f52090)};
        String[] strArrSplit = "result;encrypted".length() == 0 ? new String[0] : "result;encrypted".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C16978.class, sb, "[");
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
    public final boolean m39809() {
        return this.f52090;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ExtractOperationResult m39810() {
        return this.f52091;
    }
}
