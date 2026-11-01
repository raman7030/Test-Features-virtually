package p067l;

/* JADX INFO: renamed from: l.֫ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58I0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4200 extends AbstractC16269 {

    /* JADX INFO: renamed from: ۧ */
    public final String f9244;

    /* JADX INFO: renamed from: ܽ */
    public final String f9245;

    /* JADX INFO: renamed from: ᩳ */
    public final String f9246;

    public C4200(String str, String str2, String str3) {
        super("COMM");
        this.f9245 = str;
        this.f9244 = str2;
        this.f9246 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4200.class == obj.getClass()) {
            C4200 c4200 = (C4200) obj;
            if (C12826.equals(this.f9244, c4200.f9244) && C12826.equals(this.f9245, c4200.f9245) && C12826.equals(this.f9246, c4200.f9246)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9245;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f9244;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9246;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p067l.AbstractC16269
    public final String toString() {
        return this.f47841 + ": language=" + this.f9245 + ", description=" + this.f9244 + ", text=" + this.f9246;
    }
}
