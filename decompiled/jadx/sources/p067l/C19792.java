package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 18FX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19792 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final List f60200;

    /* JADX INFO: renamed from: ۧ */
    public final Map f60201;

    /* JADX INFO: renamed from: ܽ */
    public final long f60202;

    /* JADX INFO: renamed from: ᩳ */
    public final C5530 f60203;

    public C19792() {
        throw null;
    }

    public C19792(List list, Map map, C5530 c5530, long j) {
        this.f60200 = list;
        this.f60201 = map;
        this.f60203 = c5530;
        this.f60202 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19792)) {
            return false;
        }
        C19792 c19792 = (C19792) obj;
        return this.f60202 == c19792.f60202 && C12826.equals(this.f60200, c19792.f60200) && C12826.equals(this.f60201, c19792.f60201) && C12826.equals(this.f60203, c19792.f60203);
    }

    public final int hashCode() {
        long j = this.f60202;
        return C12826.hashCode(this.f60203) + ((C12826.hashCode(this.f60201) + ((C12826.hashCode(this.f60200) + (((int) (j ^ (j >>> 32))) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f60200, this.f60201, this.f60203, Long.valueOf(this.f60202)};
        String[] strArrSplit = "entries;entryMap;fileTree;fileTime".length() == 0 ? new String[0] : "entries;entryMap;fileTree;fileTime".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C19792.class, sb, "[");
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
