package l;

/* JADX INFO: renamed from: l.ܳ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7L9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14391 implements InterfaceC6631 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C2609 f43357 = C2609.m8239();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2609 f43358;

    public C14391(C2609 c2609) {
        this.f43358 = c2609;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m34382() {
        return this.f43358;
    }

    @Override // l.InterfaceC6631
    /* JADX INFO: renamed from: ֫ */
    public final C14391 mo18159(C14391 c14391) {
        C12171.m29642(this.f43358 == f43357);
        this.f43358 = c14391.f43358;
        return this;
    }

    public final String toString() {
        return "ANNOTATIONS [ " + this.f43358 + " ]";
    }
}
