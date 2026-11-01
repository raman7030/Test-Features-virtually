package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܿ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4H6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18564 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f55406;

    /* JADX INFO: renamed from: ۧ */
    public final int f55407;

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC21800 f55408;

    /* JADX INFO: renamed from: ܽ */
    public final C13259 f55409;

    /* JADX INFO: renamed from: ܿ */
    public final int f55410;

    /* JADX INFO: renamed from: ᩳ */
    public final int f55411;

    /* JADX INFO: renamed from: ᩻ */
    public final int f55412;

    public C18564(int i, C13259 c13259, InterfaceC21800 interfaceC21800, int i2, int i3, int i4, int i5) {
        this.f55406 = i;
        this.f55409 = c13259;
        this.f55408 = interfaceC21800;
        this.f55407 = i2;
        this.f55412 = i3;
        this.f55410 = i4;
        this.f55411 = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18564)) {
            return false;
        }
        C18564 c18564 = (C18564) obj;
        return this.f55406 == c18564.f55406 && this.f55407 == c18564.f55407 && this.f55412 == c18564.f55412 && this.f55410 == c18564.f55410 && this.f55411 == c18564.f55411 && C12826.equals(this.f55409, c18564.f55409) && C12826.equals(this.f55408, c18564.f55408);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f55408) + ((C12826.hashCode(this.f55409) + (((((((((this.f55406 * 31) + this.f55407) * 31) + this.f55412) * 31) + this.f55410) * 31) + this.f55411) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f55406), this.f55409, this.f55408, Integer.valueOf(this.f55407), Integer.valueOf(this.f55412), Integer.valueOf(this.f55410), Integer.valueOf(this.f55411)};
        String[] strArrSplit = "generation;pattern;text;modifyCount;textLength;rangeStart;rangeEnd".length() == 0 ? new String[0] : "generation;pattern;text;modifyCount;textLength;rangeStart;rangeEnd".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C18564.class, sb, "[");
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

    /* JADX INFO: renamed from: ۜ */
    public static boolean m42249(C18564 c18564) {
        return c18564.f55410 >= 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static boolean m42255(C18564 c18564) {
        InterfaceC21800 interfaceC21800 = c18564.f55408;
        int iMo28581 = interfaceC21800.mo28581();
        int i = c18564.f55407;
        return iMo28581 == i && interfaceC21800.length() == c18564.f55412 && interfaceC21800.mo28581() == i;
    }
}
