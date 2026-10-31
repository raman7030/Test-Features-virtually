package l;

/* JADX INFO: renamed from: l.ܳ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: AB81 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14733 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC17556 f44997;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC17556 f44998;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14733)) {
            return false;
        }
        C14733 c14733 = (C14733) obj;
        return this.f44998.equals(c14733.f44998) && this.f44997.equals(c14733.f44997);
    }

    public final int hashCode() {
        return this.f44997.hashCode() + (this.f44998.hashCode() * 31);
    }

    public C14733(AbstractC17556 abstractC17556, String str) {
        this.f44998 = abstractC17556;
        this.f44997 = abstractC17556.mo27778(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m35040() {
        return this.f44998.mo27779() == EnumC18262.METHOD;
    }

    public final String toString() {
        return this.f44998.toString() + " -> " + this.f44997.f53664;
    }
}
