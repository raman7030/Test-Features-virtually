package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ᩳᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19674 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f59814;

    /* JADX INFO: renamed from: ۧ */
    public final int f59815;

    public C19674(int i, int i2) {
        this.f59815 = i;
        this.f59814 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19674)) {
            return false;
        }
        C19674 c19674 = (C19674) obj;
        return this.f59815 == c19674.f59815 && this.f59814 == c19674.f59814;
    }

    public final int hashCode() {
        return (this.f59815 * 31) + this.f59814;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f59815), Integer.valueOf(this.f59814)};
        String[] strArrSplit = "visibleParameterAnnotationsCount;invisibleParameterAnnotationsCount".length() == 0 ? new String[0] : "visibleParameterAnnotationsCount;invisibleParameterAnnotationsCount".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C19674.class, sb, "[");
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

    /* JADX INFO: renamed from: ܽ */
    public final int m44686() {
        return this.f59814;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m44687() {
        return this.f59815;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m44685() {
        return this.f59815 > 0 || this.f59814 > 0;
    }
}
