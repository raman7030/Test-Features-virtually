package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩳ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes5.dex */
public final class C18256 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f56774;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f56775;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f56776;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f56777;

    public C18256(String str, int i, String str2, boolean z) {
        this.f56776 = str;
        this.f56774 = str2;
        this.f56775 = z;
        this.f56777 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18256)) {
            return false;
        }
        C18256 c18256 = (C18256) obj;
        return this.f56775 == c18256.f56775 && this.f56777 == c18256.f56777 && C11003.equals(this.f56776, c18256.f56776) && C11003.equals(this.f56774, c18256.f56774);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f56774) + C20361.m46680(C4153.m12551(this.f56775 ? 1231 : 1237, 31, this.f56777, 31), 31, this.f56776);
    }

    public final String toString() {
        Object[] objArr = {this.f56776, this.f56774, Boolean.valueOf(this.f56775), Integer.valueOf(this.f56777)};
        String[] strArrSplit = "entryPath;destinationPath;directory;index".length() == 0 ? new String[0] : "entryPath;destinationPath;directory;index".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C18256.class, sb, "[");
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
