package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C20105 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f65101;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f65102;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f65103;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f65104;

    public /* synthetic */ C20105(int i, String str, String str2, ArrayList arrayList) {
        this(i, str, str2, (List) arrayList);
    }

    public C20105(int i, String str, String str2, List list) {
        this.f65103 = str;
        this.f65104 = str2;
        this.f65101 = list;
        this.f65102 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20105)) {
            return false;
        }
        C20105 c20105 = (C20105) obj;
        return this.f65102 == c20105.f65102 && C11003.equals(this.f65103, c20105.f65103) && C11003.equals(this.f65104, c20105.f65104) && C11003.equals(this.f65101, c20105.f65101);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f65101) + C20361.m46680(C20361.m46680(this.f65102 * 31, 31, this.f65103), 31, this.f65104);
    }

    public final String toString() {
        Object[] objArr = {this.f65103, this.f65104, this.f65101, Integer.valueOf(this.f65102)};
        String[] strArrSplit = "mediaIdentity;playbackPositionKey;actions;checkedIndex".length() == 0 ? new String[0] : "mediaIdentity;playbackPositionKey;actions;checkedIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C20105.class, sb, "[");
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
    public final List m46358() {
        return this.f65101;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m46359() {
        return this.f65104;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m46360() {
        return this.f65102;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m46361() {
        return this.f65103;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20105 m46357(String str, String str2) {
        return new C20105(-1, str, str2, Collections.EMPTY_LIST);
    }
}
