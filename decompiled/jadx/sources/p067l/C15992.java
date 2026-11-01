package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܳۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7FP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15992 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f46317;

    /* JADX INFO: renamed from: ۧ */
    public final String f46318;

    /* JADX INFO: renamed from: ܽ */
    public final EnumC8617 f46319;

    public C15992(EnumC8617 enumC8617, int i, String str) {
        this.f46319 = enumC8617;
        this.f46317 = i;
        this.f46318 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15992)) {
            return false;
        }
        C15992 c15992 = (C15992) obj;
        return this.f46317 == c15992.f46317 && C12826.equals(this.f46319, c15992.f46319) && C12826.equals(this.f46318, c15992.f46318);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f46318) + ((C12826.hashCode(this.f46319) + (this.f46317 * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f46319, Integer.valueOf(this.f46317), this.f46318};
        String[] strArrSplit = "type;logicalIndex;subtitleFilename".length() == 0 ? new String[0] : "type;logicalIndex;subtitleFilename".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C15992.class, sb, "[");
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
    public final int m36340() {
        return this.f46317;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m36341() {
        return this.f46318;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC8617 m36342() {
        return this.f46319;
    }
}
