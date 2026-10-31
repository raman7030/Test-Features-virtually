package l;

/* JADX INFO: renamed from: l.ܺܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8UQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16037 extends AbstractC14626 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f49457;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f49458;

    public C16037(String str, String str2, String str3) {
        super(str);
        this.f49457 = str2;
        this.f49458 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16037.class == obj.getClass()) {
            C16037 c16037 = (C16037) obj;
            if (this.f44734.equals(c16037.f44734) && C11003.equals(this.f49457, c16037.f49457) && C11003.equals(this.f49458, c16037.f49458)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM27349 = C11010.m27349(527, 31, this.f44734);
        String str = this.f49457;
        int iHashCode = (iM27349 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f49458;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // l.AbstractC14626
    public final String toString() {
        return this.f44734 + ": url=" + this.f49458;
    }
}
