package l;

/* JADX INFO: renamed from: l.᩻֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes2.dex */
public final class C23342 extends AbstractC12612 implements InterfaceC1918 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public EnumC9454 f74996;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Object f74997;

    @Override // l.AbstractC12612
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12612 mo30870(AbstractC4308 abstractC4308) {
        this.f16086 = abstractC4308;
        return this;
    }

    @Override // l.AbstractC5144
    /* JADX INFO: renamed from: ֫ */
    public final void mo988(AbstractC0204 abstractC0204) {
        abstractC0204.mo1427(this);
    }

    @Override // l.InterfaceC13206
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3329 mo987() {
        return this.f74996.m24295();
    }

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final Object m51753() {
        Object obj = this.f74997;
        int i = C16845.f51705[this.f74996.ordinal()];
        if (i == 1) {
            return Boolean.valueOf(((Integer) obj).intValue() != 0);
        }
        if (i != 2) {
            return obj;
        }
        int iIntValue = ((Integer) obj).intValue();
        char c = (char) iIntValue;
        if (c != iIntValue) {
            throw new AssertionError("bad value for char literal");
        }
        return Character.valueOf(c);
    }

    @Override // l.AbstractC5144, l.InterfaceC13206
    /* JADX INFO: renamed from: ֫ */
    public final Object mo986(InterfaceC12501 interfaceC12501, Object obj) {
        return interfaceC12501.mo11832(this, obj);
    }

    @Override // l.AbstractC5144
    /* JADX INFO: renamed from: ܽ֫ */
    public final EnumC18550 mo989() {
        return EnumC18550.f57580;
    }
}
