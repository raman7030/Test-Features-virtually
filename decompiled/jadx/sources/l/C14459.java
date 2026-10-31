package l;

import com.alipay.sdk.m.y.l;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14459 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f44305;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f44306;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f44307;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f44308;

    public /* synthetic */ C14459(String str, String str2, List list, int i, int i2) {
        this(i, str, str2, list);
    }

    public C14459(int i, String str, String str2, List list) {
        this.f44306 = str;
        this.f44308 = str2;
        this.f44307 = list;
        this.f44305 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14459)) {
            return false;
        }
        C14459 c14459 = (C14459) obj;
        return this.f44305 == c14459.f44305 && C11003.equals(this.f44306, c14459.f44306) && C11003.equals(this.f44308, c14459.f44308) && C11003.equals(this.f44307, c14459.f44307);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f44307) + C20361.m46680(C20361.m46680(this.f44305 * 31, 31, this.f44306), 31, this.f44308);
    }

    public final String toString() {
        Object[] objArr = {this.f44306, this.f44308, this.f44307, Integer.valueOf(this.f44305)};
        String[] strArrSplit = "mediaIdentity;playbackPositionKey;options;checkedIndex".length() == 0 ? new String[0] : "mediaIdentity;playbackPositionKey;options;checkedIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C14459.class, sb, "[");
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
    public final int m34520() {
        return this.f44305;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m34521() {
        return this.f44308;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m34522() {
        return this.f44306;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List m34523() {
        return this.f44307;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14459 m34519(String str, String str2) {
        return new C14459(-1, str, str2, Collections.EMPTY_LIST);
    }
}
