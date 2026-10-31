package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۖ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274F */
/* JADX INFO: loaded from: classes2.dex */
public final class C2196 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f7215;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18424 f7216;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f7217;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4951 f7218;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21885 f7219;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Uri f7220;

    public C2196(Uri uri, long j, C4951 c4951, long j2, C18424 c18424, C21885 c21885) {
        this.f7220 = uri;
        this.f7217 = j;
        this.f7218 = c4951;
        this.f7215 = j2;
        this.f7216 = c18424;
        this.f7219 = c21885;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2196)) {
            return false;
        }
        C2196 c2196 = (C2196) obj;
        return this.f7217 == c2196.f7217 && this.f7215 == c2196.f7215 && C11003.equals(this.f7220, c2196.f7220) && C11003.equals(this.f7218, c2196.f7218) && C11003.equals(this.f7216, c2196.f7216) && C11003.equals(this.f7219, c2196.f7219);
    }

    public final int hashCode() {
        long j = this.f7217;
        long j2 = this.f7215;
        return C11003.hashCode(this.f7219) + ((C11003.hashCode(this.f7216) + ((C11003.hashCode(this.f7218) + ((C11003.hashCode(this.f7220) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f7220, Long.valueOf(this.f7217), this.f7218, Long.valueOf(this.f7215), this.f7216, this.f7219};
        String[] strArrSplit = "playlistUri;snapshotGeneration;playlist;initialStartTimeUs;openedSegment;segment".length() == 0 ? new String[0] : "playlistUri;snapshotGeneration;playlist;initialStartTimeUs;openedSegment;segment".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C2196.class, sb, "[");
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
    public final long m7262() {
        return this.f7215;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m7263() {
        return this.f7217;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4951 m7264() {
        return this.f7218;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Uri m7265() {
        return this.f7220;
    }
}
