package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۘ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9PM */
/* JADX INFO: loaded from: classes2.dex */
public final class C6345 {

    /* JADX INFO: renamed from: ֫ */
    public C14490[] f16444 = new C14490[2];

    /* JADX INFO: renamed from: ֫ */
    public final C14490 m14504(Class cls, C16561 c16561) {
        int iM37539 = c16561.m37539();
        C14490[] c14490Arr = this.f16444;
        if (iM37539 >= c14490Arr.length) {
            this.f16444 = (C14490[]) Arrays.copyOf(c14490Arr, iM37539 * 2);
        }
        C14490 c14490 = this.f16444[iM37539];
        if (c14490 != null) {
            return c14490;
        }
        String strM46108 = C20427.m46108(c16561.getName());
        C14490 c14491 = new C14490(C20427.m46113(cls, C17588.m40053(strM46108, "Case_")), C20427.m46113(cls, C17588.m40053(strM46108, "_")));
        this.f16444[iM37539] = c14491;
        return c14491;
    }
}
