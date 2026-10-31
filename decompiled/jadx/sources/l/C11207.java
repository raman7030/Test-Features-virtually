package l;

/* JADX INFO: renamed from: l.ۧ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: AB81 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11207 extends AbstractC17556 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f33635;

    public C11207(String str, String str2) {
        super(str);
        this.f33635 = str2;
    }

    @Override // l.AbstractC17556
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC17556 mo27778(String str) {
        return new C11207(str, this.f33635);
    }

    @Override // l.AbstractC17556
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC18262 mo27779() {
        return EnumC18262.FIELD;
    }

    @Override // l.AbstractC17556
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11207)) {
            return false;
        }
        C11207 c11207 = (C11207) obj;
        return this.f53664.equals(c11207.f53664) && this.f33635.equals(c11207.f33635);
    }

    @Override // l.AbstractC17556
    public final int hashCode() {
        return this.f33635.hashCode() + (this.f53664.hashCode() * 31);
    }

    @Override // l.AbstractC17556
    public final String toString() {
        return this.f33635 + " " + this.f53664;
    }
}
