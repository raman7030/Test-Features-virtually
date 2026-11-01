package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۜܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5YY */
/* JADX INFO: loaded from: classes3.dex */
public final class C8839 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f24009;

    /* JADX INFO: renamed from: ۧ */
    public final int f24010;

    public C8839(int i, int i2) {
        this.f24009 = i;
        this.f24010 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8839)) {
            return false;
        }
        C8839 c8839 = (C8839) obj;
        return this.f24009 == c8839.f24009 && this.f24010 == c8839.f24010;
    }

    public final int hashCode() {
        return (this.f24009 * 31) + this.f24010;
    }

    public final int length() {
        return this.f24010;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f24009), Integer.valueOf(this.f24010)};
        String[] strArrSplit = "index;length".length() == 0 ? new String[0] : "index;length".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C8839.class, sb, "[");
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
    public final int m20447() {
        return this.f24009;
    }
}
