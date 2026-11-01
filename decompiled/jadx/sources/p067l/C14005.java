package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.۫ۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes4.dex */
public final class C14005 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C21265 f39514;

    /* JADX INFO: renamed from: ۧ */
    public final String f39515;

    /* JADX INFO: renamed from: ܽ */
    public final String f39516;

    public C14005(String str, String str2, C21265 c21265) {
        this.f39516 = str;
        this.f39515 = str2;
        this.f39514 = c21265;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14005)) {
            return false;
        }
        C14005 c14005 = (C14005) obj;
        return C12826.equals(this.f39516, c14005.f39516) && C12826.equals(this.f39515, c14005.f39515) && C12826.equals(this.f39514, c14005.f39514);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f39514) + C21720.m49003(C12826.hashCode(this.f39516) * 31, 31, this.f39515);
    }

    public final String toString() {
        Object[] objArr = {this.f39516, this.f39515, this.f39514};
        String[] strArrSplit = "title;path;icon".length() == 0 ? new String[0] : "title;path;icon".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C14005.class, sb, "[");
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
    public final C21265 m31804() {
        return this.f39514;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m31805() {
        return this.f39515;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m31806() {
        return this.f39516;
    }
}
