package p067l;

/* JADX INFO: renamed from: l.᩻֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes2.dex */
public final class C24552 extends AbstractC14355 implements InterfaceC4191 {

    /* JADX INFO: renamed from: ۗ */
    public EnumC11353 f77743;

    /* JADX INFO: renamed from: ۬ */
    public Object f77744;

    @Override // p067l.AbstractC14355
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14355 mo32947(AbstractC6462 abstractC6462) {
        this.f18925 = abstractC6462;
        return this;
    }

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ֫ */
    public final void mo3382(AbstractC2562 abstractC2562) {
        abstractC2562.mo3840(this);
    }

    @Override // p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5532 mo3381() {
        return this.f77743.m26305();
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final Object m54150() {
        Object obj = this.f77744;
        int i = C18378.f54885[this.f77743.ordinal()];
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

    @Override // p067l.AbstractC7257, p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3380(InterfaceC14249 interfaceC14249, Object obj) {
        return interfaceC14249.mo13768(this, obj);
    }

    @Override // p067l.AbstractC7257
    /* JADX INFO: renamed from: ܽ֫ */
    public final EnumC19998 mo3383() {
        return EnumC19998.f60804;
    }
}
