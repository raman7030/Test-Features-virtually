package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۚۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7394 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f19360;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f19361;

    public C7394(String str, boolean z) {
        this.f19360 = str;
        this.f19361 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7394)) {
            return false;
        }
        C7394 c7394 = (C7394) obj;
        return this.f19361 == c7394.f19361 && C12826.equals(this.f19360, c7394.f19360);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f19360) + ((this.f19361 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f19360, Boolean.valueOf(this.f19361)};
        String[] strArrSplit = "playbackPositionKey;skipRememberedFileSelection".length() == 0 ? new String[0] : "playbackPositionKey;skipRememberedFileSelection".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C7394.class, sb, "[");
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
    public final String m17119() {
        return this.f19360;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m17120() {
        return this.f19361;
    }
}
