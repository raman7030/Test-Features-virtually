package p067l;

/* JADX INFO: renamed from: l.֡֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2419 implements InterfaceC3090 {

    /* JADX INFO: renamed from: ֫ */
    public final C5872 f3707;

    public C2419(C5872 c5872) {
        this.f3707 = c5872;
    }

    @Override // p067l.InterfaceC3090
    public final boolean hasField(C2479 c2479) {
        return this.f3707.m13191(c2479);
    }

    @Override // p067l.InterfaceC3090
    public final InterfaceC3090 setField(C2479 c2479, Object obj) {
        this.f3707.m13189(c2479, obj);
        return this;
    }

    @Override // p067l.InterfaceC3090
    public final InterfaceC3090 addRepeatedField(C2479 c2479, Object obj) {
        this.f3707.m13185(c2479, obj);
        return this;
    }

    @Override // p067l.InterfaceC3090
    /* JADX INFO: renamed from: ֫ */
    public final EnumC7114 mo3362() {
        return EnumC7114.EXTENSION_SET;
    }

    @Override // p067l.InterfaceC3090
    /* JADX INFO: renamed from: ֫ */
    public final C9186 mo3363(C3860 c3860, C19244 c19244, int i) {
        return c3860.m7614(c19244, i);
    }

    @Override // p067l.InterfaceC3090
    /* JADX INFO: renamed from: ۧ */
    public final void mo3367(AbstractC9303 abstractC9303, C19283 c19283, C2479 c2479, InterfaceC24548 interfaceC24548) {
        InterfaceC11138 builder;
        if (!c2479.mo3530()) {
            C5872 c5872 = this.f3707;
            if (c5872.m13191(c2479)) {
                Object objM13180 = c5872.m13180((InterfaceC19954) c2479);
                if (objM13180 instanceof InterfaceC11138) {
                    builder = (InterfaceC11138) objM13180;
                } else {
                    builder = ((InterfaceC10467) objM13180).toBuilder();
                    c5872.m13189(c2479, builder);
                }
                abstractC9303.mo21523(c2479.getNumber(), builder, c19283);
                return;
            }
            InterfaceC15830 interfaceC15830NewBuilderForType = interfaceC24548.newBuilderForType();
            abstractC9303.mo21523(c2479.getNumber(), interfaceC15830NewBuilderForType, c19283);
            setField(c2479, interfaceC15830NewBuilderForType);
            return;
        }
        InterfaceC15830 interfaceC15830NewBuilderForType2 = interfaceC24548.newBuilderForType();
        abstractC9303.mo21523(c2479.getNumber(), interfaceC15830NewBuilderForType2, c19283);
        addRepeatedField(c2479, interfaceC15830NewBuilderForType2.buildPartial());
    }

    @Override // p067l.InterfaceC3090
    /* JADX INFO: renamed from: ֫ */
    public final void mo3366(AbstractC9303 abstractC9303, C19283 c19283, C2479 c2479, InterfaceC24548 interfaceC24548) {
        InterfaceC11138 builder;
        if (!c2479.mo3530()) {
            C5872 c5872 = this.f3707;
            if (c5872.m13191(c2479)) {
                Object objM13180 = c5872.m13180((InterfaceC19954) c2479);
                if (objM13180 instanceof InterfaceC11138) {
                    builder = (InterfaceC11138) objM13180;
                } else {
                    builder = ((InterfaceC10467) objM13180).toBuilder();
                    c5872.m13189(c2479, builder);
                }
                abstractC9303.mo21524(builder, c19283);
                return;
            }
            InterfaceC15830 interfaceC15830NewBuilderForType = interfaceC24548.newBuilderForType();
            abstractC9303.mo21524(interfaceC15830NewBuilderForType, c19283);
            setField(c2479, interfaceC15830NewBuilderForType);
            return;
        }
        InterfaceC15830 interfaceC15830NewBuilderForType2 = interfaceC24548.newBuilderForType();
        abstractC9303.mo21524(interfaceC15830NewBuilderForType2, c19283);
        addRepeatedField(c2479, interfaceC15830NewBuilderForType2.buildPartial());
    }

    @Override // p067l.InterfaceC3090
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC24548 mo3365(AbstractC7962 abstractC7962, C19283 c19283, C2479 c2479, InterfaceC24548 interfaceC24548) {
        InterfaceC24548 interfaceC24549;
        InterfaceC15830 interfaceC15830NewBuilderForType = interfaceC24548.newBuilderForType();
        if (!c2479.mo3530() && (interfaceC24549 = (InterfaceC24548) this.f3707.m13187(c2479)) != null) {
            interfaceC15830NewBuilderForType.mergeFrom(interfaceC24549);
        }
        interfaceC15830NewBuilderForType.mergeFrom(abstractC7962, c19283);
        return interfaceC15830NewBuilderForType.buildPartial();
    }

    @Override // p067l.InterfaceC3090
    /* JADX INFO: renamed from: ֫ */
    public final EnumC18730 mo3364(C2479 c2479) {
        if (c2479.m3550()) {
            return EnumC18730.f56002;
        }
        return EnumC18730.f56003;
    }
}
