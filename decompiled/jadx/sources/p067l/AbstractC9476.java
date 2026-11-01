package p067l;

/* JADX INFO: renamed from: l.۟۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A67V */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9476 implements InterfaceC23920 {

    /* JADX INFO: renamed from: ᩸ */
    public C17503 f25972;

    /* JADX INFO: renamed from: ᩹ */
    public final EnumC3167 f25973;

    /* JADX INFO: renamed from: ۫ */
    public abstract EnumC5850 mo4190();

    public AbstractC9476(EnumC3167 enumC3167) {
        C12981.m29757(enumC3167, mo4190());
        this.f25973 = enumC3167;
    }

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ۢ */
    public final EnumC3167 mo6217() {
        return this.f25973;
    }

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ۚ */
    public int mo6216() {
        return mo4190().f14399 / 2;
    }

    /* JADX INFO: renamed from: ۤ */
    public final C17503 m22075() {
        C17503 c17503 = this.f25972;
        if (c17503 != null) {
            return c17503;
        }
        throw new IllegalStateException("Cannot get the location of an instruction that hasn't been added to a method.");
    }

    public final String toString() {
        return mo4188();
    }
}
