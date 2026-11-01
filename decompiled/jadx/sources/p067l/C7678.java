package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۚ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6SY */
/* JADX INFO: loaded from: classes3.dex */
public final class C7678 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f20137;

    /* JADX INFO: renamed from: ۧ */
    public final C4563 f20138;

    /* JADX INFO: renamed from: ܽ */
    public final C13773 f20139;

    public C7678(C13773 c13773, C4563 c4563, int i) {
        this.f20139 = c13773;
        this.f20138 = c4563;
        this.f20137 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7678)) {
            return false;
        }
        C7678 c7678 = (C7678) obj;
        return this.f20137 == c7678.f20137 && C12826.equals(this.f20139, c7678.f20139) && C12826.equals(this.f20138, c7678.f20138);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f20138) + ((C12826.hashCode(this.f20139) + (this.f20137 * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f20139, this.f20138, Integer.valueOf(this.f20137)};
        String[] strArrSplit = "text;history;activePageOffset".length() == 0 ? new String[0] : "text;history;activePageOffset".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C7678.class, sb, "[");
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
    public final int m17789() {
        return this.f20137;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C4563 m17790() {
        return this.f20138;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C13773 m17791() {
        return this.f20139;
    }
}
