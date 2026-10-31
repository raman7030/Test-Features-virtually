package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܳ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6PS */
/* JADX INFO: loaded from: classes4.dex */
public final class C14384 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f43337;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f43338;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f43339;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f43340;

    public C14384(int i, int i2, int i3, int i4) {
        this.f43340 = i;
        this.f43337 = i2;
        this.f43339 = i3;
        this.f43338 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14384)) {
            return false;
        }
        C14384 c14384 = (C14384) obj;
        return this.f43340 == c14384.f43340 && this.f43337 == c14384.f43337 && this.f43339 == c14384.f43339 && this.f43338 == c14384.f43338;
    }

    public final int hashCode() {
        return (((((this.f43340 * 31) + this.f43337) * 31) + this.f43339) * 31) + this.f43338;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f43340), Integer.valueOf(this.f43337), Integer.valueOf(this.f43339), Integer.valueOf(this.f43338)};
        String[] strArrSplit = "start;end;selectionStart;selectionEnd".length() == 0 ? new String[0] : "start;end;selectionStart;selectionEnd".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C14384.class, sb, "[");
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
    public final int m34354() {
        return this.f43337;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m34356() {
        return this.f43340;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m34357() {
        return this.f43338;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m34358() {
        return this.f43339;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m34355(int i) {
        return (i >= this.f43340 && i < this.f43337) || i == this.f43339 || i == this.f43338;
    }
}
