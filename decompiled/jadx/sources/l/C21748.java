package l;

/* JADX INFO: renamed from: l.᩸ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBF0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21748 implements InterfaceC10711 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f69716;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11186 f69717;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10396 f69718;

    @Override // l.InterfaceC10711
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo26891() {
        return false;
    }

    public C21748(C11186 c11186, int i, int i2, C10396 c10396) {
        if (i2 < 0) {
            throw new IllegalArgumentException("size < 0");
        }
        C11186 c11186M27750 = c11186.m27750(i, (i2 * 2) + i);
        this.f69717 = c11186M27750;
        this.f69716 = i2;
        this.f69718 = c10396;
        for (int i3 = 0; i3 < i2; i3++) {
            try {
            } catch (ClassCastException e) {
                throw new RuntimeException("bogus class cpi", e);
            }
        }
    }

    @Override // l.InterfaceC10711
    public final int size() {
        return this.f69716;
    }

    @Override // l.InterfaceC10711
    public final C7573 getType(int i) {
        return ((C12512) this.f69718.get(this.f69717.m27753(i * 2))).m30696();
    }

    @Override // l.InterfaceC10711
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10711 mo26890(C7573 c7573) {
        throw new UnsupportedOperationException("unsupported");
    }
}
