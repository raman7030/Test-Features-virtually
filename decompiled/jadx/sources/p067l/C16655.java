package p067l;

/* JADX INFO: renamed from: l.ܶۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N7UA */
/* JADX INFO: loaded from: classes4.dex */
public final class C16655 {

    /* JADX INFO: renamed from: ֫ */
    public final String f48924;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f48925;

    /* JADX INFO: renamed from: ܳ */
    public final int f48926;

    /* JADX INFO: renamed from: ܽ */
    public final String f48927;

    /* JADX INFO: renamed from: ܿ */
    public final String f48928;

    /* JADX INFO: renamed from: ᩳ */
    public final String f48929;

    /* JADX INFO: renamed from: ֫ */
    public static C16655 m37713(int i, AbstractC5769 abstractC5769) {
        if (abstractC5769 instanceof C7269) {
            return new C16655(i, (C7269) abstractC5769);
        }
        throw new RuntimeException();
    }

    public C16655(int i, C7269 c7269) {
        this.f48926 = i;
        this.f48929 = c7269.f18962;
        this.f48928 = c7269.f18961;
        this.f48924 = c7269.f18958;
        this.f48927 = c7269.f18960;
        this.f48925 = c7269.f18959;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16655.class == obj.getClass()) {
            C16655 c16655 = (C16655) obj;
            if (this.f48926 == c16655.f48926 && this.f48925 == c16655.f48925 && this.f48929.equals(c16655.f48929) && this.f48928.equals(c16655.f48928) && this.f48924.equals(c16655.f48924) && this.f48927.equals(c16655.f48927)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C12832.m29411(C12832.m29411(C12832.m29411(C12832.m29411(this.f48926 * 31, 31, this.f48929), 31, this.f48928), 31, this.f48924), 31, this.f48927) + (this.f48925 ? 1231 : 1237);
    }
}
