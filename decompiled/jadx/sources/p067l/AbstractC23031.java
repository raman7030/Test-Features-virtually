package p067l;

/* JADX INFO: renamed from: l.᩸ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5D2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23031 implements InterfaceC23920 {

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC3167 f72418;

    /* JADX INFO: renamed from: ۫ */
    public abstract EnumC5850 mo38590();

    public AbstractC23031(EnumC3167 enumC3167) {
        C12981.m29757(enumC3167, mo38590());
        this.f72418 = enumC3167;
    }

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ۢ */
    public final EnumC3167 mo6217() {
        return this.f72418;
    }

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ۚ */
    public int mo6216() {
        return mo38590().f14399 / 2;
    }
}
