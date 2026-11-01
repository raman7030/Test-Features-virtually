package p067l;

/* JADX INFO: renamed from: l.ᩳۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes5.dex */
public final class C19281 extends AbstractC10564 {

    /* JADX INFO: renamed from: ۧ */
    public final Object f57613;

    @Override // p067l.AbstractC10564
    /* JADX INFO: renamed from: ֫ */
    public final void mo7611(InterfaceC11235 interfaceC11235) {
        interfaceC11235.mo26029(this);
    }

    public C19281(Object obj, AbstractC6462 abstractC6462) {
        super(abstractC6462);
        this.f57613 = obj;
    }

    @Override // p067l.InterfaceC12404
    public final String toString() {
        return C23232.m51781(this.f57613, this.f29256);
    }

    @Override // p067l.AbstractC10564, p067l.InterfaceC12404
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7610(InterfaceC8380 interfaceC8380) {
        Object obj = this.f57613;
        if (obj instanceof String) {
            return Boolean.FALSE;
        }
        boolean z = obj instanceof Integer;
        AbstractC6462 abstractC6462 = this.f29256;
        if (z) {
            int i = C9184.f24850[abstractC6462.mo5577().ordinal()];
            if (i == 1) {
                return Boolean.FALSE;
            }
            if (i == 2) {
                return Boolean.FALSE;
            }
            if (i == 3) {
                return Boolean.FALSE;
            }
            if (i == 4) {
                return Boolean.FALSE;
            }
            if (i == 5) {
                return Boolean.FALSE;
            }
        }
        int i2 = C9184.f24850[abstractC6462.mo5577().ordinal()];
        if (i2 == 6) {
            ((Long) obj).getClass();
            return Boolean.FALSE;
        }
        if (i2 == 7) {
            ((Float) obj).getClass();
            return Boolean.FALSE;
        }
        if (i2 != 8) {
            throw new AssertionError(C7470.m17246(obj, "Bad annotation element value: "));
        }
        ((Double) obj).getClass();
        return Boolean.FALSE;
    }
}
