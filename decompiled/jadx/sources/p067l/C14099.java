package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14099 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f39955;

    /* JADX INFO: renamed from: ۧ */
    public final String f39956;

    /* JADX INFO: renamed from: ܽ */
    public final List f39957;

    public /* synthetic */ C14099(String str, List list, int i, int i2) {
        this(i, str, list);
    }

    public C14099(int i, String str, List list) {
        this.f39956 = str;
        this.f39957 = list;
        this.f39955 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14099)) {
            return false;
        }
        C14099 c14099 = (C14099) obj;
        return this.f39955 == c14099.f39955 && C12826.equals(this.f39956, c14099.f39956) && C12826.equals(this.f39957, c14099.f39957);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f39957) + C21720.m49003(this.f39955 * 31, 31, this.f39956);
    }

    public final String toString() {
        Object[] objArr = {this.f39956, this.f39957, Integer.valueOf(this.f39955)};
        String[] strArrSplit = "mediaIdentity;options;checkedIndex".length() == 0 ? new String[0] : "mediaIdentity;options;checkedIndex".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C14099.class, sb, "[");
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
    public final int m32005() {
        return this.f39955;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m32006() {
        return this.f39956;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final List m32007() {
        return this.f39957;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14099 m32004(String str) {
        return new C14099(-1, str, Collections.EMPTY_LIST);
    }
}
