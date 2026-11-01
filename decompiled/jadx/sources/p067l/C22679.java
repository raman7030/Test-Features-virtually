package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩸ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes5.dex */
public final class C22679 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC23291 f71539;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC16642 f71540;

    /* JADX INFO: renamed from: ܽ */
    public final int f71541;

    /* JADX INFO: renamed from: ܿ */
    public final int f71542;

    /* JADX INFO: renamed from: ᩳ */
    public final int f71543;

    public C22679(InterfaceC16642 interfaceC16642, int i, C18122 c18122, int i2, int i3) {
        this.f71540 = interfaceC16642;
        this.f71541 = i;
        this.f71539 = c18122;
        this.f71542 = i2;
        this.f71543 = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22679)) {
            return false;
        }
        C22679 c22679 = (C22679) obj;
        return this.f71541 == c22679.f71541 && this.f71542 == c22679.f71542 && this.f71543 == c22679.f71543 && C12826.equals(this.f71540, c22679.f71540) && C12826.equals(this.f71539, c22679.f71539);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f71539) + ((C12826.hashCode(this.f71540) + (((((this.f71541 * 31) + this.f71542) * 31) + this.f71543) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f71540, Integer.valueOf(this.f71541), this.f71539, Integer.valueOf(this.f71542), Integer.valueOf(this.f71543)};
        String[] strArrSplit = "descriptor;generation;callback;width;height".length() == 0 ? new String[0] : "descriptor;generation;callback;width;height".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C22679.class, sb, "[");
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
    public final InterfaceC23291 m50768() {
        return this.f71539;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m50769() {
        return this.f71543;
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC16642 m50770() {
        return this.f71540;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m50771() {
        return this.f71541;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m50772() {
        return this.f71542;
    }
}
