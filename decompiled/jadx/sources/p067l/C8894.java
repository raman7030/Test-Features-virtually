package p067l;

/* JADX INFO: renamed from: l.ۜܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8IW */
/* JADX INFO: loaded from: classes3.dex */
public final class C8894 extends AbstractC16269 {

    /* JADX INFO: renamed from: ۧ */
    public final String f24102;

    /* JADX INFO: renamed from: ܽ */
    public final String f24103;

    /* JADX INFO: renamed from: ᩳ */
    public final String f24104;

    public C8894(String str, String str2, String str3) {
        super("----");
        this.f24103 = str;
        this.f24102 = str2;
        this.f24104 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8894.class == obj.getClass()) {
            C8894 c8894 = (C8894) obj;
            if (C12826.equals(this.f24102, c8894.f24102) && C12826.equals(this.f24103, c8894.f24103) && C12826.equals(this.f24104, c8894.f24104)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f24103;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f24102;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f24104;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p067l.AbstractC16269
    public final String toString() {
        return this.f47841 + ": domain=" + this.f24103 + ", description=" + this.f24102;
    }
}
