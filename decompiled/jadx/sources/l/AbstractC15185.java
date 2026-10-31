package l;

/* JADX INFO: renamed from: l.ܶۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15185 implements InterfaceC3953 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6755 f46399;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C1386 f46400;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f46401;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f46402;

    public final String toString() {
        return "MethodCheckContext";
    }

    public AbstractC15185(C22406 c22406, boolean z, C6755 c6755, C1386 c1386) {
        this.f46402 = c22406;
        this.f46401 = z;
        this.f46399 = c6755;
        this.f46400 = c1386;
    }

    @Override // l.InterfaceC3953
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3859(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309, C1386 c1386) {
        C0384 c0384 = this.f46399.f20968;
        boolean z = this.f46401;
        C22406 c22406 = this.f46402;
        if (z) {
            return c22406.f72597.m17551(c0384.m1868(abstractC4308), c0384.m1868(abstractC4309), c1386);
        }
        return c22406.f72597.m17556(c0384.m1868(abstractC4308), c0384.m1868(abstractC4309), c1386);
    }

    @Override // l.InterfaceC3953
    /* JADX INFO: renamed from: ֫ */
    public void mo1084(InterfaceC3109 interfaceC3109, C16719 c16719) {
        throw new C23653(c16719);
    }

    @Override // l.InterfaceC3953
    /* JADX INFO: renamed from: ֫ */
    public final C1386 mo3858(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        return this.f46400;
    }

    @Override // l.InterfaceC3953
    /* JADX INFO: renamed from: ֫ */
    public final C0384 mo3857() {
        return this.f46399.f20968;
    }

    @Override // l.InterfaceC3953
    /* JADX INFO: renamed from: ۧ */
    public final C6755 mo3860() {
        return this.f46399;
    }
}
