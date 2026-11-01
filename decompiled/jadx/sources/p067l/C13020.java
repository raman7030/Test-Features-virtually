package p067l;

/* JADX INFO: renamed from: l.ۧ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: AB81 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13020 extends AbstractC19054 {

    /* JADX INFO: renamed from: ۧ */
    public final String f36634;

    public C13020(String str, String str2) {
        super(str);
        this.f36634 = str2;
    }

    @Override // p067l.AbstractC19054
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC19054 mo29840(String str) {
        return new C13020(str, this.f36634);
    }

    @Override // p067l.AbstractC19054
    /* JADX INFO: renamed from: ֫ */
    public final EnumC19725 mo29841() {
        return EnumC19725.FIELD;
    }

    @Override // p067l.AbstractC19054
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13020)) {
            return false;
        }
        C13020 c13020 = (C13020) obj;
        return this.f56854.equals(c13020.f56854) && this.f36634.equals(c13020.f36634);
    }

    @Override // p067l.AbstractC19054
    public final int hashCode() {
        return this.f36634.hashCode() + (this.f56854.hashCode() * 31);
    }

    @Override // p067l.AbstractC19054
    public final String toString() {
        return this.f36634 + " " + this.f56854;
    }
}
