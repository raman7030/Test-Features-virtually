package p067l;

/* JADX INFO: renamed from: l.᩵֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PG */
/* JADX INFO: loaded from: classes5.dex */
public final class C20526 implements InterfaceC3090 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC22045 f63418;

    /* JADX INFO: renamed from: ۧ */
    public boolean f63419 = true;

    public C20526(AbstractC22045 abstractC22045) {
        this.f63418 = abstractC22045;
    }

    /* JADX INFO: renamed from: ۧ */
    private InterfaceC15830 m46329(C2479 c2479) {
        if (!this.f63419) {
            return null;
        }
        try {
            return this.f63418.getFieldBuilder(c2479);
        } catch (UnsupportedOperationException unused) {
            this.f63419 = false;
            return null;
        }
    }

    @Override // p067l.InterfaceC3090
    public final boolean hasField(C2479 c2479) {
        return this.f63418.hasField(c2479);
    }

    @Override // p067l.InterfaceC3090
    public final InterfaceC3090 setField(C2479 c2479, Object obj) {
        boolean zMo3530 = c2479.mo3530();
        AbstractC22045 abstractC22045 = this.f63418;
        if (!zMo3530 && (obj instanceof InterfaceC11138)) {
            if (obj != m46329(c2479)) {
                abstractC22045.setField(c2479, ((InterfaceC11138) obj).buildPartial());
            }
            return this;
        }
        abstractC22045.setField(c2479, obj);
        return this;
    }

    @Override // p067l.InterfaceC3090
    public final InterfaceC3090 addRepeatedField(C2479 c2479, Object obj) {
        if (obj instanceof InterfaceC11138) {
            obj = ((InterfaceC11138) obj).buildPartial();
        }
        this.f63418.addRepeatedField(c2479, obj);
        return this;
    }

    @Override // p067l.InterfaceC3090
    /* JADX INFO: renamed from: ֫ */
    public final EnumC7114 mo3362() {
        return EnumC7114.MESSAGE;
    }

    @Override // p067l.InterfaceC3090
    /* JADX INFO: renamed from: ֫ */
    public final C9186 mo3363(C3860 c3860, C19244 c19244, int i) {
        return c3860.m7614(c19244, i);
    }

    @Override // p067l.InterfaceC3090
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC24548 mo3365(AbstractC7962 abstractC7962, C19283 c19283, C2479 c2479, InterfaceC24548 interfaceC24548) {
        InterfaceC15830 interfaceC15830NewBuilderForField;
        InterfaceC24548 interfaceC24549;
        AbstractC22045 abstractC22045 = this.f63418;
        if (interfaceC24548 != null) {
            interfaceC15830NewBuilderForField = interfaceC24548.newBuilderForType();
        } else {
            interfaceC15830NewBuilderForField = abstractC22045.newBuilderForField(c2479);
        }
        if (!c2479.mo3530() && (interfaceC24549 = (InterfaceC24548) abstractC22045.getField(c2479)) != null) {
            interfaceC15830NewBuilderForField.mergeFrom(interfaceC24549);
        }
        interfaceC15830NewBuilderForField.mergeFrom(abstractC7962, c19283);
        return interfaceC15830NewBuilderForField.buildPartial();
    }

    @Override // p067l.InterfaceC3090
    /* JADX INFO: renamed from: ۧ */
    public final void mo3367(AbstractC9303 abstractC9303, C19283 c19283, C2479 c2479, InterfaceC24548 interfaceC24548) {
        InterfaceC15830 interfaceC15830M46328;
        if (!c2479.mo3530()) {
            AbstractC22045 abstractC22045 = this.f63418;
            if (abstractC22045.hasField(c2479)) {
                InterfaceC15830 interfaceC15830M46329 = m46329(c2479);
                if (interfaceC15830M46329 != null) {
                    abstractC9303.mo21523(c2479.getNumber(), interfaceC15830M46329, c19283);
                    return;
                } else {
                    interfaceC15830M46328 = m46328(c2479, interfaceC24548);
                    interfaceC15830M46328.mergeFrom((InterfaceC24548) abstractC22045.getField(c2479));
                }
            } else {
                interfaceC15830M46328 = m46328(c2479, interfaceC24548);
            }
            abstractC9303.mo21523(c2479.getNumber(), interfaceC15830M46328, c19283);
            setField(c2479, interfaceC15830M46328.buildPartial());
            return;
        }
        InterfaceC15830 interfaceC15830M463210 = m46328(c2479, interfaceC24548);
        abstractC9303.mo21523(c2479.getNumber(), interfaceC15830M463210, c19283);
        addRepeatedField(c2479, interfaceC15830M463210.buildPartial());
    }

    @Override // p067l.InterfaceC3090
    /* JADX INFO: renamed from: ֫ */
    public final void mo3366(AbstractC9303 abstractC9303, C19283 c19283, C2479 c2479, InterfaceC24548 interfaceC24548) {
        InterfaceC15830 interfaceC15830M46328;
        if (!c2479.mo3530()) {
            AbstractC22045 abstractC22045 = this.f63418;
            if (abstractC22045.hasField(c2479)) {
                InterfaceC15830 interfaceC15830M46329 = m46329(c2479);
                if (interfaceC15830M46329 != null) {
                    abstractC9303.mo21524(interfaceC15830M46329, c19283);
                    return;
                } else {
                    interfaceC15830M46328 = m46328(c2479, interfaceC24548);
                    interfaceC15830M46328.mergeFrom((InterfaceC24548) abstractC22045.getField(c2479));
                }
            } else {
                interfaceC15830M46328 = m46328(c2479, interfaceC24548);
            }
            abstractC9303.mo21524(interfaceC15830M46328, c19283);
            setField(c2479, interfaceC15830M46328.buildPartial());
            return;
        }
        InterfaceC15830 interfaceC15830M463210 = m46328(c2479, interfaceC24548);
        abstractC9303.mo21524(interfaceC15830M463210, c19283);
        addRepeatedField(c2479, interfaceC15830M463210.buildPartial());
    }

    /* JADX INFO: renamed from: ֫ */
    private InterfaceC15830 m46328(C2479 c2479, InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 != null) {
            return interfaceC24548.newBuilderForType();
        }
        return this.f63418.newBuilderForField(c2479);
    }

    @Override // p067l.InterfaceC3090
    /* JADX INFO: renamed from: ֫ */
    public final EnumC18730 mo3364(C2479 c2479) {
        if (c2479.m3550()) {
            return EnumC18730.f56002;
        }
        if (!c2479.mo3530() && (this.f63418 instanceof AbstractC21296)) {
            return EnumC18730.f56005;
        }
        return EnumC18730.f56003;
    }
}
