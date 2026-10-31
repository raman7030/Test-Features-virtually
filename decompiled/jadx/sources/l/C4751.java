package l;

/* JADX INFO: renamed from: l.ۙܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BAP */
/* JADX INFO: loaded from: classes3.dex */
public final class C4751 extends AbstractC6162 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23095 f15066;

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo2229() {
        return false;
    }

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ᩻ */
    public final String mo8292() {
        return "proto";
    }

    public C4751(C23095 c23095) {
        this.f15066 = c23095;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4751) {
            return this.f15066.equals(((C4751) obj).f15066);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15066.hashCode();
    }

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ۧ */
    public final int mo2228(AbstractC13717 abstractC13717) {
        return this.f15066.compareTo(((C4751) abstractC13717).f15066);
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        return this.f15066.m51257();
    }

    public final String toString() {
        return "proto{" + this.f15066.m51257() + '}';
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C23095 m13898() {
        return this.f15066;
    }

    @Override // l.InterfaceC1538
    public final C7573 getType() {
        return C7573.f23399;
    }
}
