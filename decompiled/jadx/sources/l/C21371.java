package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩸ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes5.dex */
public final class C21371 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC22015 f68843;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15019 f68844;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f68845;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f68846;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f68847;

    public C21371(InterfaceC15019 interfaceC15019, int i, C16576 c16576, int i2, int i3) {
        this.f68844 = interfaceC15019;
        this.f68845 = i;
        this.f68843 = c16576;
        this.f68846 = i2;
        this.f68847 = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21371)) {
            return false;
        }
        C21371 c21371 = (C21371) obj;
        return this.f68845 == c21371.f68845 && this.f68846 == c21371.f68846 && this.f68847 == c21371.f68847 && C11003.equals(this.f68844, c21371.f68844) && C11003.equals(this.f68843, c21371.f68843);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f68843) + ((C11003.hashCode(this.f68844) + (((((this.f68845 * 31) + this.f68846) * 31) + this.f68847) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f68844, Integer.valueOf(this.f68845), this.f68843, Integer.valueOf(this.f68846), Integer.valueOf(this.f68847)};
        String[] strArrSplit = "descriptor;generation;callback;width;height".length() == 0 ? new String[0] : "descriptor;generation;callback;width;height".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C21371.class, sb, "[");
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
    public final InterfaceC22015 m48432() {
        return this.f68843;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m48433() {
        return this.f68847;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15019 m48434() {
        return this.f68844;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m48435() {
        return this.f68845;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m48436() {
        return this.f68846;
    }
}
