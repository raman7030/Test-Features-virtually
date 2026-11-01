package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֨ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3370 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f6657;

    /* JADX INFO: renamed from: ۧ */
    public final String f6658;

    public C3370(String str, String str2) {
        this.f6657 = str;
        this.f6658 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3370)) {
            return false;
        }
        C3370 c3370 = (C3370) obj;
        return C12826.equals(this.f6657, c3370.f6657) && C12826.equals(this.f6658, c3370.f6658);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f6658) + (C12826.hashCode(this.f6657) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f6657, this.f6658};
        String[] strArrSplit = "playbackPositionKey;subtitlePath".length() == 0 ? new String[0] : "playbackPositionKey;subtitlePath".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C3370.class, sb, "[");
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
    public final String m5894() {
        return this.f6657;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m5895() {
        return this.f6658;
    }
}
