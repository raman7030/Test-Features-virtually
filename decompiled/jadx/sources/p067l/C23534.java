package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩹ۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes.dex */
public final class C23534 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5390 f74971;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC9768 f74972;

    /* JADX INFO: renamed from: ܽ */
    public final int f74973;

    /* JADX INFO: renamed from: ܿ */
    public final int f74974;

    /* JADX INFO: renamed from: ᩳ */
    public final int f74975;

    public C23534(AbstractC5390 abstractC5390, InterfaceC9768 interfaceC9768, int i, int i2, int i3) {
        this.f74971 = abstractC5390;
        this.f74972 = interfaceC9768;
        this.f74973 = i;
        this.f74975 = i2;
        this.f74974 = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23534)) {
            return false;
        }
        C23534 c23534 = (C23534) obj;
        return this.f74973 == c23534.f74973 && this.f74975 == c23534.f74975 && this.f74974 == c23534.f74974 && C12826.equals(this.f74971, c23534.f74971) && C12826.equals(this.f74972, c23534.f74972);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f74972) + ((C12826.hashCode(this.f74971) + (((((this.f74973 * 31) + this.f74975) * 31) + this.f74974) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f74971, this.f74972, Integer.valueOf(this.f74973), Integer.valueOf(this.f74975), Integer.valueOf(this.f74974)};
        String[] strArrSplit = "layout;owner;version;x;y".length() == 0 ? new String[0] : "layout;owner;version;x;y".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C23534.class, sb, "[");
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
