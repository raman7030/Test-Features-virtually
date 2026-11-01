package p067l;

/* JADX INFO: renamed from: l.᩸ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBF0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23038 implements InterfaceC12548 {

    /* JADX INFO: renamed from: ᩶ */
    public final int f72423;

    /* JADX INFO: renamed from: ᩸ */
    public final C13000 f72424;

    /* JADX INFO: renamed from: ᩹ */
    public final C12249 f72425;

    @Override // p067l.InterfaceC12548
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo28931() {
        return false;
    }

    public C23038(C13000 c13000, int i, int i2, C12249 c12249) {
        if (i2 < 0) {
            throw new IllegalArgumentException("size < 0");
        }
        C13000 c13000M29812 = c13000.m29812(i, (i2 * 2) + i);
        this.f72424 = c13000M29812;
        this.f72423 = i2;
        this.f72425 = c12249;
        for (int i3 = 0; i3 < i2; i3++) {
            try {
            } catch (ClassCastException e) {
                throw new RuntimeException("bogus class cpi", e);
            }
        }
    }

    @Override // p067l.InterfaceC12548
    public final int size() {
        return this.f72423;
    }

    @Override // p067l.InterfaceC12548
    public final C9566 getType(int i) {
        return ((C14260) this.f72425.get(this.f72424.m29815(i * 2))).m32771();
    }

    @Override // p067l.InterfaceC12548
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12548 mo28930(C9566 c9566) {
        throw new UnsupportedOperationException("unsupported");
    }
}
