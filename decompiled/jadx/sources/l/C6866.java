package l;

/* JADX INFO: renamed from: l.ۜܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8IW */
/* JADX INFO: loaded from: classes3.dex */
public final class C6866 extends AbstractC14626 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f21223;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f21224;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f21225;

    public C6866(String str, String str2, String str3) {
        super("----");
        this.f21224 = str;
        this.f21223 = str2;
        this.f21225 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6866.class == obj.getClass()) {
            C6866 c6866 = (C6866) obj;
            if (C11003.equals(this.f21223, c6866.f21223) && C11003.equals(this.f21224, c6866.f21224) && C11003.equals(this.f21225, c6866.f21225)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f21224;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f21223;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f21225;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // l.AbstractC14626
    public final String toString() {
        return this.f44734 + ": domain=" + this.f21224 + ", description=" + this.f21223;
    }
}
