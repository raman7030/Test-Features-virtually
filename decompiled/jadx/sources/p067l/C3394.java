package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֨ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C3394 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C6077[] f6715;

    /* JADX INFO: renamed from: ۧ */
    public final int f6716;

    /* JADX INFO: renamed from: ܽ */
    public final int f6717;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC20315 f6718;

    public C3394(int i, InterfaceC20315 interfaceC20315, int i2, C6077[] c6077Arr) {
        this.f6716 = i;
        this.f6718 = interfaceC20315;
        this.f6717 = i2;
        this.f6715 = c6077Arr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3394)) {
            return false;
        }
        C3394 c3394 = (C3394) obj;
        return this.f6716 == c3394.f6716 && this.f6717 == c3394.f6717 && C12826.equals(this.f6718, c3394.f6718) && C12826.equals(this.f6715, c3394.f6715);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f6715) + ((C12826.hashCode(this.f6718) + C6316.m14441(this.f6716, 31, this.f6717, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f6716), this.f6718, Integer.valueOf(this.f6717), this.f6715};
        String[] strArrSplit = "index;source;occurrenceBytes;backings".length() == 0 ? new String[0] : "index;source;occurrenceBytes;backings".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C3394.class, sb, "[");
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
    public final C6077[] m5932() {
        return this.f6715;
    }

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC20315 m5933() {
        return this.f6718;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m5934() {
        return this.f6716;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m5935() {
        return this.f6717;
    }
}
