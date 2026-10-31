package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۟ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68N9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7366 extends AbstractC14626 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String[] f22627;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC14626[] f22628;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f22629;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f22630;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f22631;

    public C7366(String str, boolean z, boolean z2, String[] strArr, AbstractC14626[] abstractC14626Arr) {
        super("CTOC");
        this.f22629 = str;
        this.f22630 = z;
        this.f22631 = z2;
        this.f22627 = strArr;
        this.f22628 = abstractC14626Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7366.class == obj.getClass()) {
            C7366 c7366 = (C7366) obj;
            if (this.f22630 == c7366.f22630 && this.f22631 == c7366.f22631 && C11003.equals(this.f22629, c7366.f22629) && Arrays.equals(this.f22627, c7366.f22627) && Arrays.equals(this.f22628, c7366.f22628)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.f22630 ? 1 : 0) + 527) * 31) + (this.f22631 ? 1 : 0)) * 31;
        String str = this.f22629;
        return i + (str != null ? str.hashCode() : 0);
    }
}
