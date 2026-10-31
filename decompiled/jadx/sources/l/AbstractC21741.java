package l;

/* JADX INFO: renamed from: l.᩸ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5D2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21741 implements InterfaceC22677 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC0841 f69711;

    /* JADX INFO: renamed from: ۫ */
    public abstract EnumC3664 mo36432();

    public AbstractC21741(EnumC0841 enumC0841) {
        C11166.m27695(enumC0841, mo36432());
        this.f69711 = enumC0841;
    }

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ۢ */
    public final EnumC0841 mo3975() {
        return this.f69711;
    }

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ۚ */
    public int mo3974() {
        return mo36432().f11595 / 2;
    }
}
