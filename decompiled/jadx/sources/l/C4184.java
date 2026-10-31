package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۘ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9PM */
/* JADX INFO: loaded from: classes2.dex */
public final class C4184 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12755[] f13631 = new C12755[2];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12755 m12629(Class cls, C14934 c14934) {
        int iM35387 = c14934.m35387();
        C12755[] c12755Arr = this.f13631;
        if (iM35387 >= c12755Arr.length) {
            this.f13631 = (C12755[]) Arrays.copyOf(c12755Arr, iM35387 * 2);
        }
        C12755 c12755 = this.f13631[iM35387];
        if (c12755 != null) {
            return c12755;
        }
        String strM43840 = C19001.m43840(c14934.getName());
        C12755 c12756 = new C12755(C19001.m43845(cls, C16014.m37867(strM43840, "Case_")), C19001.m43845(cls, C16014.m37867(strM43840, "_")));
        this.f13631[iM35387] = c12756;
        return c12756;
    }
}
