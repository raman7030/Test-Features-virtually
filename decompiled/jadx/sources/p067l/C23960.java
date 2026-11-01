package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩺ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47EO */
/* JADX INFO: loaded from: classes.dex */
public final class C23960 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final EnumC22620 f76125;

    /* JADX INFO: renamed from: ۧ */
    public final String f76126;

    public C23960(EnumC22620 enumC22620, String str) {
        this.f76125 = enumC22620;
        this.f76126 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23960)) {
            return false;
        }
        C23960 c23960 = (C23960) obj;
        return C12826.equals(this.f76125, c23960.f76125) && C12826.equals(this.f76126, c23960.f76126);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f76126) + (C12826.hashCode(this.f76125) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f76125, this.f76126};
        String[] strArrSplit = "kind;text".length() == 0 ? new String[0] : "kind;text".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C23960.class, sb, "[");
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
    public final EnumC22620 m53080() {
        return this.f76125;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m53082() {
        return this.f76126;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m53081() {
        return this.f76125 == EnumC22620.ERROR && this.f76126 == null;
    }
}
