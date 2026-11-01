package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۛۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7868 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f20658;

    /* JADX INFO: renamed from: ۧ */
    public final int f20659;

    /* JADX INFO: renamed from: ܽ */
    public final int f20660;

    /* JADX INFO: renamed from: ܿ */
    public final int f20661;

    /* JADX INFO: renamed from: ᩳ */
    public final long f20662;

    public C7868(int i, int i2, int i3, int i4, long j) {
        this.f20660 = i;
        this.f20658 = i2;
        this.f20662 = j;
        this.f20661 = i3;
        this.f20659 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7868)) {
            return false;
        }
        C7868 c7868 = (C7868) obj;
        return this.f20660 == c7868.f20660 && this.f20658 == c7868.f20658 && this.f20661 == c7868.f20661 && this.f20659 == c7868.f20659 && this.f20662 == c7868.f20662;
    }

    public final int hashCode() {
        int i = ((((((this.f20660 * 31) + this.f20658) * 31) + this.f20661) * 31) + this.f20659) * 31;
        long j = this.f20662;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f20660), Integer.valueOf(this.f20658), Long.valueOf(this.f20662), Integer.valueOf(this.f20661), Integer.valueOf(this.f20659)};
        String[] strArrSplit = "mediaToken;generation;positionMs;widthPx;heightPx".length() == 0 ? new String[0] : "mediaToken;generation;positionMs;widthPx;heightPx".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C7868.class, sb, "[");
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
