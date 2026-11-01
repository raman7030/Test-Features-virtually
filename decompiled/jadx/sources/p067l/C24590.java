package p067l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩻֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8FO */
/* JADX INFO: loaded from: classes.dex */
public final class C24590 {

    /* JADX INFO: renamed from: ֫ */
    public final int f77869;

    /* JADX INFO: renamed from: ۧ */
    public final int f77870;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f77871;

    /* JADX INFO: renamed from: ᩳ */
    public final int f77872;

    public C24590(C8497 c8497, String str, String str2, List list, String str3) {
        this.f77869 = c8497.m19756(str);
        this.f77870 = c8497.m19756(str2);
        this.f77871 = new int[list.size()];
        this.f77872 = c8497.m19756(str3);
        for (int i = 0; i < list.size(); i++) {
            this.f77871[i] = c8497.m19756(((CharSequence) list.get(i)).toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C24590.class == obj.getClass()) {
            C24590 c24590 = (C24590) obj;
            if (this.f77869 == c24590.f77869 && this.f77870 == c24590.f77870 && this.f77872 == c24590.f77872 && Arrays.equals(this.f77871, c24590.f77871)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f77871) + (((this.f77869 * 31) + this.f77870) * 31)) * 31) + this.f77872;
    }
}
