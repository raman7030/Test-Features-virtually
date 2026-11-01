package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AHU */
/* JADX INFO: loaded from: classes5.dex */
public final class C19990 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final List f60677;

    /* JADX INFO: renamed from: ۧ */
    public final Map f60678;

    /* JADX INFO: renamed from: ܽ */
    public final long f60679;

    /* JADX INFO: renamed from: ᩳ */
    public final C24925 f60680;

    public C19990() {
        throw null;
    }

    public C19990(List list, Map map, C24925 c24925, long j) {
        this.f60677 = list;
        this.f60678 = map;
        this.f60680 = c24925;
        this.f60679 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19990)) {
            return false;
        }
        C19990 c19990 = (C19990) obj;
        return this.f60679 == c19990.f60679 && C12826.equals(this.f60677, c19990.f60677) && C12826.equals(this.f60678, c19990.f60678) && C12826.equals(this.f60680, c19990.f60680);
    }

    public final int hashCode() {
        long j = this.f60679;
        return C12826.hashCode(this.f60680) + ((C12826.hashCode(this.f60678) + ((C12826.hashCode(this.f60677) + (((int) (j ^ (j >>> 32))) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f60677, this.f60678, this.f60680, Long.valueOf(this.f60679)};
        String[] strArrSplit = "entries;entryMap;fileTree;fileTime".length() == 0 ? new String[0] : "entries;entryMap;fileTree;fileTime".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C19990.class, sb, "[");
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
