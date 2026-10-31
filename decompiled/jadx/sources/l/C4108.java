package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۘᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes3.dex */
public final class C4108 extends AbstractC13301 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C4108 f13053 = new C4108(0, 0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f13054;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f13055;

    public final int hashCode() {
        long j = this.f13054;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f13055;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C4108(long j, long j2) {
        this.f13054 = j;
        this.f13055 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4108)) {
            return false;
        }
        C4108 c4108 = (C4108) obj;
        return this.f13054 == c4108.f13054 && this.f13055 == c4108.f13055;
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f13054), Long.valueOf(this.f13055)};
        String[] strArrSplit = "deltaSourceBytes;historySourceBytes".length() == 0 ? new String[0] : "deltaSourceBytes;historySourceBytes".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C4108.class, sb, "[");
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
    public final long m12331() {
        return this.f13054;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m12332() {
        return this.f13055;
    }
}
