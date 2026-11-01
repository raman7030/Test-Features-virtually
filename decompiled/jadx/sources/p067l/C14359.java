package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.۫᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes4.dex */
public final class C14359 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final long f41049;

    /* JADX INFO: renamed from: ۧ */
    public final long f41050;

    /* JADX INFO: renamed from: ܽ */
    public final String f41051;

    public C14359(String str, long j, long j2) {
        this.f41051 = str;
        this.f41050 = j;
        this.f41049 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14359)) {
            return false;
        }
        C14359 c14359 = (C14359) obj;
        return this.f41050 == c14359.f41050 && this.f41049 == c14359.f41049 && C12826.equals(this.f41051, c14359.f41051);
    }

    public final int hashCode() {
        long j = this.f41050;
        long j2 = this.f41049;
        return C12826.hashCode(this.f41051) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f41051, Long.valueOf(this.f41050), Long.valueOf(this.f41049)};
        String[] strArrSplit = "path;length;lastModified".length() == 0 ? new String[0] : "path;length;lastModified".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C14359.class, sb, "[");
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
}
