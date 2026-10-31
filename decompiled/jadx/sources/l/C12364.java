package l;

/* JADX INFO: renamed from: l.۫ۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12364 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f37059;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC8131 f37062;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2609 f37058 = C2609.m8239();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EnumC16761 f37061 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f37060 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC13829 f37057 = EnumC13829.SPECULATIVE;

    public C12364(C22406 c22406) {
        this.f37059 = c22406;
        this.f37062 = c22406.f72585;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30000(AbstractC5698 abstractC5698, C16719 c16719) {
        this.f37058 = this.f37058.m8242(new C13069(this.f37059.f72579.f37061, abstractC5698, c16719, null));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29999(AbstractC5698 abstractC5698, AbstractC4308 abstractC4308) {
        this.f37058 = this.f37058.m8242(new C13069(this.f37059.f72579.f37061, abstractC5698, null, abstractC4308));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6755 m29997(AbstractC5698 abstractC5698, C0384 c0384, C23420 c23420, C1386 c1386) {
        C6755 c6755Mo3860;
        C22406 c22406 = this.f37059;
        if (c23420 == null) {
            c6755Mo3860 = c22406.f72606.f37355;
        } else {
            c6755Mo3860 = c23420.f75215.mo3860();
        }
        C12399 c12399 = c22406.f72606;
        C11003.requireNonNull(c12399);
        return new C6755(c12399, this.f37057, abstractC5698, this.f37061, c0384, c6755Mo3860, c1386);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC13829 m29998() {
        return this.f37057;
    }
}
