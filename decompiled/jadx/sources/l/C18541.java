package l;

import com.alipay.sdk.m.y.l;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AHU */
/* JADX INFO: loaded from: classes5.dex */
public final class C18541 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f57453;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map f57454;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f57455;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23734 f57456;

    public C18541() {
        throw null;
    }

    public C18541(List list, Map map, C23734 c23734, long j) {
        this.f57453 = list;
        this.f57454 = map;
        this.f57456 = c23734;
        this.f57455 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18541)) {
            return false;
        }
        C18541 c18541 = (C18541) obj;
        return this.f57455 == c18541.f57455 && C11003.equals(this.f57453, c18541.f57453) && C11003.equals(this.f57454, c18541.f57454) && C11003.equals(this.f57456, c18541.f57456);
    }

    public final int hashCode() {
        long j = this.f57455;
        return C11003.hashCode(this.f57456) + ((C11003.hashCode(this.f57454) + ((C11003.hashCode(this.f57453) + (((int) (j ^ (j >>> 32))) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f57453, this.f57454, this.f57456, Long.valueOf(this.f57455)};
        String[] strArrSplit = "entries;entryMap;fileTree;fileTime".length() == 0 ? new String[0] : "entries;entryMap;fileTree;fileTime".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C18541.class, sb, "[");
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
