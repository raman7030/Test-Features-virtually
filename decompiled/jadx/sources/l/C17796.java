package l;

/* JADX INFO: renamed from: l.ᩳۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes5.dex */
public final class C17796 extends AbstractC8624 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f54417;

    @Override // l.AbstractC8624
    /* JADX INFO: renamed from: ֫ */
    public final void mo5382(InterfaceC9330 interfaceC9330) {
        interfaceC9330.mo24020(this);
    }

    public C17796(Object obj, AbstractC4308 abstractC4308) {
        super(abstractC4308);
        this.f54417 = obj;
    }

    @Override // l.InterfaceC10559
    public final String toString() {
        return C21953.m49444(this.f54417, this.f26338);
    }

    @Override // l.AbstractC8624, l.InterfaceC10559
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5381(InterfaceC6325 interfaceC6325) {
        Object obj = this.f54417;
        if (obj instanceof String) {
            return Boolean.FALSE;
        }
        boolean z = obj instanceof Integer;
        AbstractC4308 abstractC4308 = this.f26338;
        if (z) {
            int i = C7172.f21970[abstractC4308.mo3258().ordinal()];
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
        int i2 = C7172.f21970[abstractC4308.mo3258().ordinal()];
        if (i2 == 6) {
            ((Long) obj).getClass();
            return Boolean.FALSE;
        }
        if (i2 == 7) {
            ((Float) obj).getClass();
            return Boolean.FALSE;
        }
        if (i2 != 8) {
            throw new AssertionError(C5368.m15337(obj, "Bad annotation element value: "));
        }
        ((Double) obj).getClass();
        return Boolean.FALSE;
    }
}
