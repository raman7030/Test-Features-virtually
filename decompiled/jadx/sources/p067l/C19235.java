package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ᩳ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4H6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19235 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C18564 f57490;

    /* JADX INFO: renamed from: ۧ */
    public final EnumC24599 f57491;

    /* JADX INFO: renamed from: ܽ */
    public final C11189 f57492;

    public C19235(C18564 c18564, C11189 c11189, EnumC24599 enumC24599) {
        this.f57490 = c18564;
        this.f57492 = c11189;
        this.f57491 = enumC24599;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19235)) {
            return false;
        }
        C19235 c19235 = (C19235) obj;
        return C12826.equals(this.f57490, c19235.f57490) && C12826.equals(this.f57492, c19235.f57492) && C12826.equals(this.f57491, c19235.f57491);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f57491) + ((C12826.hashCode(this.f57492) + (C12826.hashCode(this.f57490) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f57490, this.f57492, this.f57491};
        String[] strArrSplit = "request;store;state".length() == 0 ? new String[0] : "request;store;state".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C19235.class, sb, "[");
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
