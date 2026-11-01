package p067l;

/* JADX INFO: renamed from: l.ܺܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8UQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17610 extends AbstractC16269 {

    /* JADX INFO: renamed from: ۧ */
    public final String f52621;

    /* JADX INFO: renamed from: ܽ */
    public final String f52622;

    public C17610(String str, String str2, String str3) {
        super(str);
        this.f52621 = str2;
        this.f52622 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17610.class == obj.getClass()) {
            C17610 c17610 = (C17610) obj;
            if (this.f47841.equals(c17610.f47841) && C12826.equals(this.f52621, c17610.f52621) && C12826.equals(this.f52622, c17610.f52622)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM29411 = C12832.m29411(527, 31, this.f47841);
        String str = this.f52621;
        int iHashCode = (iM29411 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f52622;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p067l.AbstractC16269
    public final String toString() {
        return this.f47841 + ": url=" + this.f52622;
    }
}
