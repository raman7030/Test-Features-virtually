package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܿ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes5.dex */
public final class C17550 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f53645;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f53646;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3545 f53647;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f53648;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f53649;

    public C17550(C3545 c3545, String str, String str2, boolean z, int i) {
        this.f53647 = c3545;
        this.f53649 = str;
        this.f53645 = str2;
        this.f53646 = z;
        this.f53648 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17550)) {
            return false;
        }
        C17550 c17550 = (C17550) obj;
        return this.f53646 == c17550.f53646 && this.f53648 == c17550.f53648 && C11003.equals(this.f53647, c17550.f53647) && C11003.equals(this.f53649, c17550.f53649) && C11003.equals(this.f53645, c17550.f53645);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f53645) + C20361.m46680((C11003.hashCode(this.f53647) + C4153.m12551(this.f53646 ? 1231 : 1237, 31, this.f53648, 31)) * 31, 31, this.f53649);
    }

    public final String toString() {
        Object[] objArr = {this.f53647, this.f53649, this.f53645, Boolean.valueOf(this.f53646), Integer.valueOf(this.f53648)};
        String[] strArrSplit = "entry;entryPath;destinationPath;directory;index".length() == 0 ? new String[0] : "entry;entryPath;destinationPath;directory;index".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C17550.class, sb, "[");
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
