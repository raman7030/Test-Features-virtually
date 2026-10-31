package l;

/* JADX INFO: renamed from: l.۟۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A67V */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7479 implements InterfaceC22677 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15925 f23059;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC0841 f23060;

    /* JADX INFO: renamed from: ۫ */
    public abstract EnumC3664 mo1791();

    public AbstractC7479(EnumC0841 enumC0841) {
        C11166.m27695(enumC0841, mo1791());
        this.f23060 = enumC0841;
    }

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ۢ */
    public final EnumC0841 mo3975() {
        return this.f23060;
    }

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ۚ */
    public int mo3974() {
        return mo1791().f11595 / 2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15925 m20099() {
        C15925 c15925 = this.f23059;
        if (c15925 != null) {
            return c15925;
        }
        throw new IllegalStateException("Cannot get the location of an instruction that hasn't been added to a method.");
    }

    public final String toString() {
        return mo1789();
    }
}
