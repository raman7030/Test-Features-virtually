package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ᩳ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes5.dex */
public final class C19719 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f59991;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f59992;

    /* JADX INFO: renamed from: ܽ */
    public final String f59993;

    /* JADX INFO: renamed from: ᩳ */
    public final int f59994;

    public C19719(String str, int i, String str2, boolean z) {
        this.f59993 = str;
        this.f59991 = str2;
        this.f59992 = z;
        this.f59994 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19719)) {
            return false;
        }
        C19719 c19719 = (C19719) obj;
        return this.f59992 == c19719.f59992 && this.f59994 == c19719.f59994 && C12826.equals(this.f59993, c19719.f59993) && C12826.equals(this.f59991, c19719.f59991);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f59991) + C21720.m49003(C6316.m14441(this.f59992 ? 1231 : 1237, 31, this.f59994, 31), 31, this.f59993);
    }

    public final String toString() {
        Object[] objArr = {this.f59993, this.f59991, Boolean.valueOf(this.f59992), Integer.valueOf(this.f59994)};
        String[] strArrSplit = "entryPath;destinationPath;directory;index".length() == 0 ? new String[0] : "entryPath;destinationPath;directory;index".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C19719.class, sb, "[");
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
