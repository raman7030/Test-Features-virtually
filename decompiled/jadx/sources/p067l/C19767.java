package p067l;

/* JADX INFO: renamed from: l.ᩳ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19767 {

    /* JADX INFO: renamed from: ֫ */
    public final int f60130;

    /* JADX INFO: renamed from: ۧ */
    public final String f60131;

    public C19767(String str, int i) {
        this.f60131 = str;
        this.f60130 = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && C19767.class == obj.getClass()) {
            C19767 c19767 = (C19767) obj;
            if (this.f60130 == c19767.f60130 && this.f60131.equals(c19767.f60131)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f60131.hashCode() * 31) + this.f60130;
    }
}
