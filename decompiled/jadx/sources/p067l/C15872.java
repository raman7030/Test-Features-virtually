package p067l;

/* JADX INFO: renamed from: l.ܳ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8EK */
/* JADX INFO: loaded from: classes3.dex */
public final class C15872 {

    /* JADX INFO: renamed from: ֫ */
    public final int f45965;

    /* JADX INFO: renamed from: ۧ */
    public final int f45966;

    /* JADX INFO: renamed from: ܽ */
    public final int f45967;

    public C15872(C8497 c8497, String str, String str2, String str3) {
        this.f45965 = c8497.m19756(str);
        this.f45966 = c8497.m19756(str2);
        this.f45967 = c8497.m19756(str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15872.class == obj.getClass()) {
            C15872 c15872 = (C15872) obj;
            if (this.f45965 == c15872.f45965 && this.f45966 == c15872.f45966 && this.f45967 == c15872.f45967) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f45965 * 31) + this.f45966) * 31) + this.f45967;
    }
}
