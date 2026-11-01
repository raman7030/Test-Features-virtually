package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܳ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6PS */
/* JADX INFO: loaded from: classes4.dex */
public final class C16039 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f46427;

    /* JADX INFO: renamed from: ۧ */
    public final int f46428;

    /* JADX INFO: renamed from: ܽ */
    public final int f46429;

    /* JADX INFO: renamed from: ᩳ */
    public final int f46430;

    public C16039(int i, int i2, int i3, int i4) {
        this.f46430 = i;
        this.f46427 = i2;
        this.f46429 = i3;
        this.f46428 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16039)) {
            return false;
        }
        C16039 c16039 = (C16039) obj;
        return this.f46430 == c16039.f46430 && this.f46427 == c16039.f46427 && this.f46429 == c16039.f46429 && this.f46428 == c16039.f46428;
    }

    public final int hashCode() {
        return (((((this.f46430 * 31) + this.f46427) * 31) + this.f46429) * 31) + this.f46428;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f46430), Integer.valueOf(this.f46427), Integer.valueOf(this.f46429), Integer.valueOf(this.f46428)};
        String[] strArrSplit = "start;end;selectionStart;selectionEnd".length() == 0 ? new String[0] : "start;end;selectionStart;selectionEnd".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C16039.class, sb, "[");
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
    public final int m36488() {
        return this.f46427;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m36490() {
        return this.f46430;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m36491() {
        return this.f46428;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m36492() {
        return this.f46429;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m36489(int i) {
        return (i >= this.f46430 && i < this.f46427) || i == this.f46429 || i == this.f46428;
    }
}
