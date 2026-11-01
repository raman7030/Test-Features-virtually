package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܿ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes5.dex */
public final class C19048 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f56835;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f56836;

    /* JADX INFO: renamed from: ܽ */
    public final C5738 f56837;

    /* JADX INFO: renamed from: ܿ */
    public final int f56838;

    /* JADX INFO: renamed from: ᩳ */
    public final String f56839;

    public C19048(C5738 c5738, String str, String str2, boolean z, int i) {
        this.f56837 = c5738;
        this.f56839 = str;
        this.f56835 = str2;
        this.f56836 = z;
        this.f56838 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19048)) {
            return false;
        }
        C19048 c19048 = (C19048) obj;
        return this.f56836 == c19048.f56836 && this.f56838 == c19048.f56838 && C12826.equals(this.f56837, c19048.f56837) && C12826.equals(this.f56839, c19048.f56839) && C12826.equals(this.f56835, c19048.f56835);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f56835) + C21720.m49003((C12826.hashCode(this.f56837) + C6316.m14441(this.f56836 ? 1231 : 1237, 31, this.f56838, 31)) * 31, 31, this.f56839);
    }

    public final String toString() {
        Object[] objArr = {this.f56837, this.f56839, this.f56835, Boolean.valueOf(this.f56836), Integer.valueOf(this.f56838)};
        String[] strArrSplit = "entry;entryPath;destinationPath;directory;index".length() == 0 ? new String[0] : "entry;entryPath;destinationPath;directory;index".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C19048.class, sb, "[");
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
