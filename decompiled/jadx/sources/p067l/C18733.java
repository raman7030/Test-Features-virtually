package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܿ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes5.dex */
public final class C18733 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f56007;

    /* JADX INFO: renamed from: ۧ */
    public final EnumC21890 f56008;

    /* JADX INFO: renamed from: ܽ */
    public final C16050 f56009;

    /* JADX INFO: renamed from: ᩳ */
    public final C16050 f56010;

    public C18733(EnumC21890 enumC21890, C16050 c16050, C16050 c16051, String str) {
        this.f56008 = enumC21890;
        this.f56009 = c16050;
        this.f56010 = c16051;
        this.f56007 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18733)) {
            return false;
        }
        C18733 c18733 = (C18733) obj;
        return C12826.equals(this.f56008, c18733.f56008) && C12826.equals(this.f56009, c18733.f56009) && C12826.equals(this.f56010, c18733.f56010) && C12826.equals(this.f56007, c18733.f56007);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f56007) + ((C12826.hashCode(this.f56010) + ((C12826.hashCode(this.f56009) + (C12826.hashCode(this.f56008) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f56008, this.f56009, this.f56010, this.f56007};
        String[] strArrSplit = "containerType;initialization;media;bitmapCacheKey".length() == 0 ? new String[0] : "containerType;initialization;media;bitmapCacheKey".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C18733.class, sb, "[");
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
