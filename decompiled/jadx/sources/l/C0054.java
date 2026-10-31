package l;

/* JADX INFO: renamed from: l.֡֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0054 implements InterfaceC0760 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3687 f931;

    public C0054(C3687 c3687) {
        this.f931 = c3687;
    }

    @Override // l.InterfaceC0760
    public final boolean hasField(C0117 c0117) {
        return this.f931.m11245(c0117);
    }

    @Override // l.InterfaceC0760
    public final InterfaceC0760 setField(C0117 c0117, Object obj) {
        this.f931.m11243(c0117, obj);
        return this;
    }

    @Override // l.InterfaceC0760
    public final InterfaceC0760 addRepeatedField(C0117 c0117, Object obj) {
        this.f931.m11239(c0117, obj);
        return this;
    }

    @Override // l.InterfaceC0760
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC4994 mo967() {
        return EnumC4994.EXTENSION_SET;
    }

    @Override // l.InterfaceC0760
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7174 mo968(C1570 c1570, C17757 c17757, int i) {
        return c1570.m5385(c17757, i);
    }

    @Override // l.InterfaceC0760
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo972(AbstractC7297 abstractC7297, C17798 c17798, C0117 c0117, InterfaceC23338 interfaceC23338) {
        InterfaceC9228 builder;
        if (!c0117.mo1129()) {
            C3687 c3687 = this.f931;
            if (c3687.m11245(c0117)) {
                Object objM11234 = c3687.m11234((InterfaceC18504) c0117);
                if (objM11234 instanceof InterfaceC9228) {
                    builder = (InterfaceC9228) objM11234;
                } else {
                    builder = ((InterfaceC8522) objM11234).toBuilder();
                    c3687.m11243(c0117, builder);
                }
                abstractC7297.mo19555(c0117.getNumber(), builder, c17798);
                return;
            }
            InterfaceC14165 interfaceC14165NewBuilderForType = interfaceC23338.newBuilderForType();
            abstractC7297.mo19555(c0117.getNumber(), interfaceC14165NewBuilderForType, c17798);
            setField(c0117, interfaceC14165NewBuilderForType);
            return;
        }
        InterfaceC14165 interfaceC14165NewBuilderForType2 = interfaceC23338.newBuilderForType();
        abstractC7297.mo19555(c0117.getNumber(), interfaceC14165NewBuilderForType2, c17798);
        addRepeatedField(c0117, interfaceC14165NewBuilderForType2.buildPartial());
    }

    @Override // l.InterfaceC0760
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo971(AbstractC7297 abstractC7297, C17798 c17798, C0117 c0117, InterfaceC23338 interfaceC23338) {
        InterfaceC9228 builder;
        if (!c0117.mo1129()) {
            C3687 c3687 = this.f931;
            if (c3687.m11245(c0117)) {
                Object objM11234 = c3687.m11234((InterfaceC18504) c0117);
                if (objM11234 instanceof InterfaceC9228) {
                    builder = (InterfaceC9228) objM11234;
                } else {
                    builder = ((InterfaceC8522) objM11234).toBuilder();
                    c3687.m11243(c0117, builder);
                }
                abstractC7297.mo19556(builder, c17798);
                return;
            }
            InterfaceC14165 interfaceC14165NewBuilderForType = interfaceC23338.newBuilderForType();
            abstractC7297.mo19556(interfaceC14165NewBuilderForType, c17798);
            setField(c0117, interfaceC14165NewBuilderForType);
            return;
        }
        InterfaceC14165 interfaceC14165NewBuilderForType2 = interfaceC23338.newBuilderForType();
        abstractC7297.mo19556(interfaceC14165NewBuilderForType2, c17798);
        addRepeatedField(c0117, interfaceC14165NewBuilderForType2.buildPartial());
    }

    @Override // l.InterfaceC0760
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23338 mo970(AbstractC5886 abstractC5886, C17798 c17798, C0117 c0117, InterfaceC23338 interfaceC23338) {
        InterfaceC23338 interfaceC23339;
        InterfaceC14165 interfaceC14165NewBuilderForType = interfaceC23338.newBuilderForType();
        if (!c0117.mo1129() && (interfaceC23339 = (InterfaceC23338) this.f931.m11241(c0117)) != null) {
            interfaceC14165NewBuilderForType.mergeFrom(interfaceC23339);
        }
        interfaceC14165NewBuilderForType.mergeFrom(abstractC5886, c17798);
        return interfaceC14165NewBuilderForType.buildPartial();
    }

    @Override // l.InterfaceC0760
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC17216 mo969(C0117 c0117) {
        if (c0117.m1149()) {
            return EnumC17216.f52820;
        }
        return EnumC17216.f52821;
    }
}
