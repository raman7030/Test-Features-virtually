package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۤۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470D */
/* JADX INFO: loaded from: classes3.dex */
public final class C10049 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4404 f30205;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f30206;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC5815 f30207;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f30208;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f30209;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f30210;

    public C10049(int i, int i2, int i3, int i4, EnumC5815 enumC5815, C4404 c4404) {
        this.f30210 = i;
        this.f30206 = i2;
        this.f30209 = i3;
        this.f30208 = i4;
        this.f30207 = enumC5815;
        this.f30205 = c4404;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10049)) {
            return false;
        }
        C10049 c10049 = (C10049) obj;
        return this.f30210 == c10049.f30210 && this.f30206 == c10049.f30206 && this.f30209 == c10049.f30209 && this.f30208 == c10049.f30208 && C11003.equals(this.f30207, c10049.f30207) && C11003.equals(this.f30205, c10049.f30205);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f30205) + ((C11003.hashCode(this.f30207) + (((((((this.f30210 * 31) + this.f30206) * 31) + this.f30209) * 31) + this.f30208) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f30210), Integer.valueOf(this.f30206), Integer.valueOf(this.f30209), Integer.valueOf(this.f30208), this.f30207, this.f30205};
        String[] strArrSplit = "oldReplayOffset;newReplayOffset;oldSuffixOffset;newSuffixOffset;reason;affectedDecisions".length() == 0 ? new String[0] : "oldReplayOffset;newReplayOffset;oldSuffixOffset;newSuffixOffset;reason;affectedDecisions".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C10049.class, sb, "[");
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
    public final C4404 m25215() {
        return this.f30205;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m25216() {
        return this.f30210;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m25217() {
        return this.f30206;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m25218() {
        return this.f30208;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m25219() {
        return this.f30209;
    }
}
