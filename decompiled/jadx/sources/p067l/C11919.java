package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۤۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470D */
/* JADX INFO: loaded from: classes3.dex */
public final class C11919 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C6554 f33163;

    /* JADX INFO: renamed from: ۧ */
    public final int f33164;

    /* JADX INFO: renamed from: ܳ */
    public final EnumC7895 f33165;

    /* JADX INFO: renamed from: ܽ */
    public final int f33166;

    /* JADX INFO: renamed from: ܿ */
    public final int f33167;

    /* JADX INFO: renamed from: ᩳ */
    public final int f33168;

    public C11919(int i, int i2, int i3, int i4, EnumC7895 enumC7895, C6554 c6554) {
        this.f33168 = i;
        this.f33164 = i2;
        this.f33167 = i3;
        this.f33166 = i4;
        this.f33165 = enumC7895;
        this.f33163 = c6554;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11919)) {
            return false;
        }
        C11919 c11919 = (C11919) obj;
        return this.f33168 == c11919.f33168 && this.f33164 == c11919.f33164 && this.f33167 == c11919.f33167 && this.f33166 == c11919.f33166 && C12826.equals(this.f33165, c11919.f33165) && C12826.equals(this.f33163, c11919.f33163);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f33163) + ((C12826.hashCode(this.f33165) + (((((((this.f33168 * 31) + this.f33164) * 31) + this.f33167) * 31) + this.f33166) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f33168), Integer.valueOf(this.f33164), Integer.valueOf(this.f33167), Integer.valueOf(this.f33166), this.f33165, this.f33163};
        String[] strArrSplit = "oldReplayOffset;newReplayOffset;oldSuffixOffset;newSuffixOffset;reason;affectedDecisions".length() == 0 ? new String[0] : "oldReplayOffset;newReplayOffset;oldSuffixOffset;newSuffixOffset;reason;affectedDecisions".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C11919.class, sb, "[");
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
    public final C6554 m27232() {
        return this.f33163;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m27233() {
        return this.f33168;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m27234() {
        return this.f33164;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m27235() {
        return this.f33166;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m27236() {
        return this.f33167;
    }
}
