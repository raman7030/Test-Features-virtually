package l;

/* JADX INFO: renamed from: l.ۨۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 84VE */
/* JADX INFO: loaded from: classes4.dex */
public final class C11632 implements InterfaceC18007 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f34716;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC10988 f34717;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17337 f34718;

    public C11632(AbstractC10988 abstractC10988, int i, C17337 c17337) {
        this.f34717 = abstractC10988;
        this.f34716 = i;
        this.f34718 = c17337;
    }

    @Override // l.InterfaceC18007
    public final int getKey() {
        return this.f34716;
    }

    @Override // l.InterfaceC18007
    /* JADX INFO: renamed from: ֫ */
    public final int mo12019() {
        return this.f34718.m40668() - this.f34717.m27301().m37699();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17337 m28523() {
        return this.f34718;
    }
}
