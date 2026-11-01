package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16110 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f47399;

    /* JADX INFO: renamed from: ۧ */
    public final String f47400;

    /* JADX INFO: renamed from: ܽ */
    public final List f47401;

    /* JADX INFO: renamed from: ᩳ */
    public final String f47402;

    public /* synthetic */ C16110(String str, String str2, List list, int i, int i2) {
        this(i, str, str2, list);
    }

    public C16110(int i, String str, String str2, List list) {
        this.f47400 = str;
        this.f47402 = str2;
        this.f47401 = list;
        this.f47399 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16110)) {
            return false;
        }
        C16110 c16110 = (C16110) obj;
        return this.f47399 == c16110.f47399 && C12826.equals(this.f47400, c16110.f47400) && C12826.equals(this.f47402, c16110.f47402) && C12826.equals(this.f47401, c16110.f47401);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f47401) + C21720.m49003(C21720.m49003(this.f47399 * 31, 31, this.f47400), 31, this.f47402);
    }

    public final String toString() {
        Object[] objArr = {this.f47400, this.f47402, this.f47401, Integer.valueOf(this.f47399)};
        String[] strArrSplit = "mediaIdentity;playbackPositionKey;options;checkedIndex".length() == 0 ? new String[0] : "mediaIdentity;playbackPositionKey;options;checkedIndex".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C16110.class, sb, "[");
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
    public final int m36654() {
        return this.f47399;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m36655() {
        return this.f47402;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m36656() {
        return this.f47400;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final List m36657() {
        return this.f47401;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16110 m36653(String str, String str2) {
        return new C16110(-1, str, str2, Collections.EMPTY_LIST);
    }
}
