package l;

/* JADX INFO: renamed from: l.֫ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58I0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1927 extends AbstractC14626 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f6464;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f6465;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f6466;

    public C1927(String str, String str2, String str3) {
        super("COMM");
        this.f6465 = str;
        this.f6464 = str2;
        this.f6466 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1927.class == obj.getClass()) {
            C1927 c1927 = (C1927) obj;
            if (C11003.equals(this.f6464, c1927.f6464) && C11003.equals(this.f6465, c1927.f6465) && C11003.equals(this.f6466, c1927.f6466)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6465;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f6464;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6466;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // l.AbstractC14626
    public final String toString() {
        return this.f44734 + ": language=" + this.f6465 + ", description=" + this.f6464 + ", text=" + this.f6466;
    }
}
