package l;

/* JADX INFO: renamed from: l.ܳᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public class C14703 implements InterfaceC5804 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0117 f44905;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f44906;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17526 f44907;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Class f44908;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f44909;

    public C14703(C0117 c0117, String str, Class cls, Class cls2, String str2) {
        boolean z = c0117.m1148() != null;
        this.f44909 = z;
        boolean zM1145 = c0117.m1145();
        this.f44906 = zM1145;
        C17526 c17526 = new C17526(str, cls, cls2, str2, z, zM1145);
        this.f44905 = c0117;
        this.f44908 = c17526.f53530.getReturnType();
        this.f44907 = c17526;
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public Object mo16282(AbstractC4121 abstractC4121) {
        return this.f44907.m40962(abstractC4121);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ۧ */
    public Object mo16288(AbstractC19916 abstractC19916) {
        return this.f44907.m40966(abstractC19916);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ܽ */
    public Object mo16292(AbstractC4121 abstractC4121) {
        return mo16282(abstractC4121);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public void mo16287(AbstractC19916 abstractC19916, Object obj) {
        this.f44907.m40964(abstractC19916, obj);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final Object mo16281(int i, AbstractC4121 abstractC4121) {
        throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ۧ */
    public final Object mo16289(AbstractC19916 abstractC19916, int i) {
        throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final void mo16286(AbstractC19916 abstractC19916, int i, Object obj) {
        throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ۧ */
    public final void mo16290(AbstractC19916 abstractC19916, Object obj) {
        throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo16291(AbstractC4121 abstractC4121) {
        boolean z = this.f44906;
        C17526 c17526 = this.f44907;
        if (!z) {
            boolean z2 = this.f44909;
            C0117 c0117 = this.f44905;
            if (z2) {
                return c17526.m40965(abstractC4121) == c0117.getNumber();
            }
            return !mo16282(abstractC4121).equals(c0117.m1122());
        }
        return c17526.m40968(abstractC4121);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo16293(AbstractC19916 abstractC19916) {
        boolean z = this.f44906;
        C17526 c17526 = this.f44907;
        if (!z) {
            boolean z2 = this.f44909;
            C0117 c0117 = this.f44905;
            if (z2) {
                return c17526.m40967(abstractC19916) == c0117.getNumber();
            }
            return !mo16288(abstractC19916).equals(c0117.m1122());
        }
        return c17526.m40969(abstractC19916);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ᩳ */
    public final int mo16295(AbstractC4121 abstractC4121) {
        throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ܿ */
    public final int mo16294(AbstractC19916 abstractC19916) {
        throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final void mo16285(AbstractC19916 abstractC19916) {
        this.f44907.m40963(abstractC19916);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC14165 mo16283() {
        throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC14165 mo16296(AbstractC19916 abstractC19916) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC14165 mo16284(AbstractC19916 abstractC19916, int i) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }
}
