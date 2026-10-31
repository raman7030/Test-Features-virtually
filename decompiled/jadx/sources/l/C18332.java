package l;

import com.alipay.sdk.m.y.l;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 18FX */
/* JADX INFO: loaded from: classes5.dex */
public final class C18332 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f56982;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map f56983;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f56984;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3326 f56985;

    public C18332() {
        throw null;
    }

    public C18332(List list, Map map, C3326 c3326, long j) {
        this.f56982 = list;
        this.f56983 = map;
        this.f56985 = c3326;
        this.f56984 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18332)) {
            return false;
        }
        C18332 c18332 = (C18332) obj;
        return this.f56984 == c18332.f56984 && C11003.equals(this.f56982, c18332.f56982) && C11003.equals(this.f56983, c18332.f56983) && C11003.equals(this.f56985, c18332.f56985);
    }

    public final int hashCode() {
        long j = this.f56984;
        return C11003.hashCode(this.f56985) + ((C11003.hashCode(this.f56983) + ((C11003.hashCode(this.f56982) + (((int) (j ^ (j >>> 32))) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f56982, this.f56983, this.f56985, Long.valueOf(this.f56984)};
        String[] strArrSplit = "entries;entryMap;fileTree;fileTime".length() == 0 ? new String[0] : "entries;entryMap;fileTree;fileTime".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C18332.class, sb, "[");
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
