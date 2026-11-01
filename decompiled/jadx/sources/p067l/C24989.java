package p067l;

/* JADX INFO: renamed from: l.᩻ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBCT */
/* JADX INFO: loaded from: classes.dex */
public final class C24989 extends AbstractC15405 {

    /* JADX INFO: renamed from: ᩸ */
    public final int f79769;

    /* JADX INFO: renamed from: ᩹ */
    public final C20296 f79770;

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4596() {
        return false;
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ᩻ */
    public final String mo10336() {
        return "CallSiteRef";
    }

    public C24989(C20296 c20296, int i) {
        this.f79770 = c20296;
        this.f79769 = i;
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final int mo4595(AbstractC15405 abstractC15405) {
        C24989 c24989 = (C24989) abstractC15405;
        int iCompareTo = this.f79770.compareTo(c24989.f79770);
        return iCompareTo != 0 ? iCompareTo : Integer.compare(this.f79769, c24989.f79769);
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C24318 m54889() {
        return this.f79770.m45830();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C9566 m54888() {
        return this.f79770.m45836();
    }

    public final String toString() {
        return this.f79770.m45829().toString();
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return this.f79770.m45829().mo4819();
    }

    /* JADX INFO: renamed from: ܺ */
    public final C16271 m54887() {
        return this.f79770.m45829();
    }
}
