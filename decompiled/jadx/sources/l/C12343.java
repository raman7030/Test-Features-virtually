package l;

import com.alipay.sdk.m.y.l;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C12343 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f36942;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f36943;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f36944;

    public /* synthetic */ C12343(String str, List list, int i, int i2) {
        this(i, str, list);
    }

    public C12343(int i, String str, List list) {
        this.f36943 = str;
        this.f36944 = list;
        this.f36942 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12343)) {
            return false;
        }
        C12343 c12343 = (C12343) obj;
        return this.f36942 == c12343.f36942 && C11003.equals(this.f36943, c12343.f36943) && C11003.equals(this.f36944, c12343.f36944);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f36944) + C20361.m46680(this.f36942 * 31, 31, this.f36943);
    }

    public final String toString() {
        Object[] objArr = {this.f36943, this.f36944, Integer.valueOf(this.f36942)};
        String[] strArrSplit = "mediaIdentity;options;checkedIndex".length() == 0 ? new String[0] : "mediaIdentity;options;checkedIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C12343.class, sb, "[");
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
    public final int m29945() {
        return this.f36942;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m29946() {
        return this.f36943;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List m29947() {
        return this.f36944;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12343 m29944(String str) {
        return new C12343(-1, str, Collections.EMPTY_LIST);
    }
}
