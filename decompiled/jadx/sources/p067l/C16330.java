package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܳᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes4.dex */
public final class C16330 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f47982;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f47983;

    /* JADX INFO: renamed from: ܳ */
    public final long f47984;

    /* JADX INFO: renamed from: ܽ */
    public final int f47985;

    /* JADX INFO: renamed from: ܿ */
    public final int f47986;

    /* JADX INFO: renamed from: ᩳ */
    public final int f47987;

    public C16330(int i, int i2, int i3, long j, boolean z, boolean z2) {
        this.f47985 = i;
        this.f47986 = i2;
        this.f47987 = i3;
        this.f47984 = j;
        this.f47982 = z;
        this.f47983 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16330)) {
            return false;
        }
        C16330 c16330 = (C16330) obj;
        return this.f47982 == c16330.f47982 && this.f47983 == c16330.f47983 && this.f47985 == c16330.f47985 && this.f47986 == c16330.f47986 && this.f47987 == c16330.f47987 && this.f47984 == c16330.f47984;
    }

    public final int hashCode() {
        int i = (((((((((this.f47982 ? 1231 : 1237) * 31) + (this.f47983 ? 1231 : 1237)) * 31) + this.f47985) * 31) + this.f47986) * 31) + this.f47987) * 31;
        long j = this.f47984;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f47985), Integer.valueOf(this.f47986), Integer.valueOf(this.f47987), Long.valueOf(this.f47984), Boolean.valueOf(this.f47982), Boolean.valueOf(this.f47983)};
        String[] strArrSplit = "height;length;leaves;patchBytes;allDelta;allMemory".length() == 0 ? new String[0] : "height;length;leaves;patchBytes;allDelta;allMemory".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C16330.class, sb, "[");
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
