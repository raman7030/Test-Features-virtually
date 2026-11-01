package p067l;

import android.net.Uri;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۖ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274F */
/* JADX INFO: loaded from: classes2.dex */
public final class C4455 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final long f10000;

    /* JADX INFO: renamed from: ۧ */
    public final C19878 f10001;

    /* JADX INFO: renamed from: ܳ */
    public final long f10002;

    /* JADX INFO: renamed from: ܽ */
    public final C7074 f10003;

    /* JADX INFO: renamed from: ܿ */
    public final C23168 f10004;

    /* JADX INFO: renamed from: ᩳ */
    public final Uri f10005;

    public C4455(Uri uri, long j, C7074 c7074, long j2, C19878 c19878, C23168 c23168) {
        this.f10005 = uri;
        this.f10002 = j;
        this.f10003 = c7074;
        this.f10000 = j2;
        this.f10001 = c19878;
        this.f10004 = c23168;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4455)) {
            return false;
        }
        C4455 c4455 = (C4455) obj;
        return this.f10002 == c4455.f10002 && this.f10000 == c4455.f10000 && C12826.equals(this.f10005, c4455.f10005) && C12826.equals(this.f10003, c4455.f10003) && C12826.equals(this.f10001, c4455.f10001) && C12826.equals(this.f10004, c4455.f10004);
    }

    public final int hashCode() {
        long j = this.f10002;
        long j2 = this.f10000;
        return C12826.hashCode(this.f10004) + ((C12826.hashCode(this.f10001) + ((C12826.hashCode(this.f10003) + ((C12826.hashCode(this.f10005) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f10005, Long.valueOf(this.f10002), this.f10003, Long.valueOf(this.f10000), this.f10001, this.f10004};
        String[] strArrSplit = "playlistUri;snapshotGeneration;playlist;initialStartTimeUs;openedSegment;segment".length() == 0 ? new String[0] : "playlistUri;snapshotGeneration;playlist;initialStartTimeUs;openedSegment;segment".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C4455.class, sb, "[");
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
    public final long m9341() {
        return this.f10000;
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m9342() {
        return this.f10002;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C7074 m9343() {
        return this.f10003;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Uri m9344() {
        return this.f10005;
    }
}
