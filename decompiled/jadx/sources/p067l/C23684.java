package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩹ܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes.dex */
public final class C23684 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f75393;

    /* JADX INFO: renamed from: ۧ */
    public final int f75394;

    /* JADX INFO: renamed from: ܳ */
    public final int f75395;

    /* JADX INFO: renamed from: ܽ */
    public final int f75396;

    /* JADX INFO: renamed from: ܿ */
    public final int f75397;

    /* JADX INFO: renamed from: ᩳ */
    public final int f75398;

    /* JADX INFO: renamed from: ᩻ */
    public final int f75399;

    public C23684(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f75394 = i;
        this.f75396 = i2;
        this.f75399 = i3;
        this.f75395 = i4;
        this.f75393 = i5;
        this.f75397 = i6;
        this.f75398 = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23684)) {
            return false;
        }
        C23684 c23684 = (C23684) obj;
        return this.f75394 == c23684.f75394 && this.f75396 == c23684.f75396 && this.f75399 == c23684.f75399 && this.f75395 == c23684.f75395 && this.f75393 == c23684.f75393 && this.f75397 == c23684.f75397 && this.f75398 == c23684.f75398;
    }

    public final int hashCode() {
        return (((((((((((this.f75394 * 31) + this.f75396) * 31) + this.f75399) * 31) + this.f75395) * 31) + this.f75393) * 31) + this.f75397) * 31) + this.f75398;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f75394), Integer.valueOf(this.f75396), Integer.valueOf(this.f75399), Integer.valueOf(this.f75395), Integer.valueOf(this.f75393), Integer.valueOf(this.f75397), Integer.valueOf(this.f75398)};
        String[] strArrSplit = "first;last;type;start;end;line;level".length() == 0 ? new String[0] : "first;last;type;start;end;line;level".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C23684.class, sb, "[");
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
