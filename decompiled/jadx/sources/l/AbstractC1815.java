package l;

/* JADX INFO: renamed from: l.֫۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: W5CU */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1815 extends AbstractC7479 implements InterfaceC7155 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17337 f6241;

    public AbstractC1815(EnumC0841 enumC0841, C17337 c17337) {
        super(enumC0841);
        this.f6241 = c17337;
    }

    @Override // l.InterfaceC7155
    /* JADX INFO: renamed from: ۖ */
    public final int mo2818() {
        int i = this.f6241.m40667().f49185 - m20099().f49185;
        if (mo3974() == 1) {
            if (i < -128 || i > 127) {
                throw new C15431(null, "Invalid instruction offset: %d. Offset must be in [-128, 127]", Integer.valueOf(i));
            }
        } else if (mo3974() == 2 && (i < -32768 || i > 32767)) {
            throw new C15431(null, "Invalid instruction offset: %d. Offset must be in [-32768, 32767]", Integer.valueOf(i));
        }
        return i;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C17337 m6037() {
        return this.f6241;
    }
}
