package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֫ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74F */
/* JADX INFO: loaded from: classes2.dex */
public final class C1636 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8353 f5726;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23190 f5727;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f5728;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f5729;

    public C1636(C23190 c23190, int i, C8353 c8353, int i2) {
        this.f5727 = c23190;
        this.f5729 = i;
        this.f5726 = c8353;
        this.f5728 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1636)) {
            return false;
        }
        C1636 c1636 = (C1636) obj;
        return this.f5729 == c1636.f5729 && this.f5728 == c1636.f5728 && C11003.equals(this.f5727, c1636.f5727) && C11003.equals(this.f5726, c1636.f5726);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f5726) + ((C11003.hashCode(this.f5727) + C4153.m12551(this.f5729, 31, this.f5728, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f5727, Integer.valueOf(this.f5729), this.f5726, Integer.valueOf(this.f5728)};
        String[] strArrSplit = "group;trackIndex;format;sourceOrder".length() == 0 ? new String[0] : "group;trackIndex;format;sourceOrder".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C1636.class, sb, "[");
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8353 m5512() {
        return this.f5726;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m5513() {
        return this.f5729;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23190 m5514() {
        return this.f5727;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m5515() {
        return this.f5728;
    }
}
