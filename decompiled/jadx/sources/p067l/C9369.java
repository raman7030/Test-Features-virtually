package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۟ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68N9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9369 extends AbstractC16269 {

    /* JADX INFO: renamed from: ۧ */
    public final String[] f25540;

    /* JADX INFO: renamed from: ܳ */
    public final AbstractC16269[] f25541;

    /* JADX INFO: renamed from: ܽ */
    public final String f25542;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f25543;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f25544;

    public C9369(String str, boolean z, boolean z2, String[] strArr, AbstractC16269[] abstractC16269Arr) {
        super("CTOC");
        this.f25542 = str;
        this.f25543 = z;
        this.f25544 = z2;
        this.f25540 = strArr;
        this.f25541 = abstractC16269Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9369.class == obj.getClass()) {
            C9369 c9369 = (C9369) obj;
            if (this.f25543 == c9369.f25543 && this.f25544 == c9369.f25544 && C12826.equals(this.f25542, c9369.f25542) && Arrays.equals(this.f25540, c9369.f25540) && Arrays.equals(this.f25541, c9369.f25541)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.f25543 ? 1 : 0) + 527) * 31) + (this.f25544 ? 1 : 0)) * 31;
        String str = this.f25542;
        return i + (str != null ? str.hashCode() : 0);
    }
}
