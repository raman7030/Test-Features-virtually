package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۚۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C5288 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f16523;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f16524;

    public C5288(String str, boolean z) {
        this.f16523 = str;
        this.f16524 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5288)) {
            return false;
        }
        C5288 c5288 = (C5288) obj;
        return this.f16524 == c5288.f16524 && C11003.equals(this.f16523, c5288.f16523);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f16523) + ((this.f16524 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f16523, Boolean.valueOf(this.f16524)};
        String[] strArrSplit = "playbackPositionKey;skipRememberedFileSelection".length() == 0 ? new String[0] : "playbackPositionKey;skipRememberedFileSelection".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C5288.class, sb, "[");
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
    public final String m15216() {
        return this.f16523;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m15217() {
        return this.f16524;
    }
}
