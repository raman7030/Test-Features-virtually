package l;

/* JADX INFO: renamed from: l.᩵֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19106 implements InterfaceC0760 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC20704 f60185;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f60186 = true;

    public C19106(AbstractC20704 abstractC20704) {
        this.f60185 = abstractC20704;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private InterfaceC14165 m44035(C0117 c0117) {
        if (!this.f60186) {
            return null;
        }
        try {
            return this.f60185.getFieldBuilder(c0117);
        } catch (UnsupportedOperationException unused) {
            this.f60186 = false;
            return null;
        }
    }

    @Override // l.InterfaceC0760
    public final boolean hasField(C0117 c0117) {
        return this.f60185.hasField(c0117);
    }

    @Override // l.InterfaceC0760
    public final InterfaceC0760 setField(C0117 c0117, Object obj) {
        boolean zMo1129 = c0117.mo1129();
        AbstractC20704 abstractC20704 = this.f60185;
        if (!zMo1129 && (obj instanceof InterfaceC9228)) {
            if (obj != m44035(c0117)) {
                abstractC20704.setField(c0117, ((InterfaceC9228) obj).buildPartial());
            }
            return this;
        }
        abstractC20704.setField(c0117, obj);
        return this;
    }

    @Override // l.InterfaceC0760
    public final InterfaceC0760 addRepeatedField(C0117 c0117, Object obj) {
        if (obj instanceof InterfaceC9228) {
            obj = ((InterfaceC9228) obj).buildPartial();
        }
        this.f60185.addRepeatedField(c0117, obj);
        return this;
    }

    @Override // l.InterfaceC0760
    /* JADX INFO: renamed from: ֫ */
    public final EnumC4994 mo967() {
        return EnumC4994.MESSAGE;
    }

    @Override // l.InterfaceC0760
    /* JADX INFO: renamed from: ֫ */
    public final C7174 mo968(C1570 c1570, C17757 c17757, int i) {
        return c1570.m5385(c17757, i);
    }

    @Override // l.InterfaceC0760
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC23338 mo970(AbstractC5886 abstractC5886, C17798 c17798, C0117 c0117, InterfaceC23338 interfaceC23338) {
        InterfaceC14165 interfaceC14165NewBuilderForField;
        InterfaceC23338 interfaceC23339;
        AbstractC20704 abstractC20704 = this.f60185;
        if (interfaceC23338 != null) {
            interfaceC14165NewBuilderForField = interfaceC23338.newBuilderForType();
        } else {
            interfaceC14165NewBuilderForField = abstractC20704.newBuilderForField(c0117);
        }
        if (!c0117.mo1129() && (interfaceC23339 = (InterfaceC23338) abstractC20704.getField(c0117)) != null) {
            interfaceC14165NewBuilderForField.mergeFrom(interfaceC23339);
        }
        interfaceC14165NewBuilderForField.mergeFrom(abstractC5886, c17798);
        return interfaceC14165NewBuilderForField.buildPartial();
    }

    @Override // l.InterfaceC0760
    /* JADX INFO: renamed from: ۧ */
    public final void mo972(AbstractC7297 abstractC7297, C17798 c17798, C0117 c0117, InterfaceC23338 interfaceC23338) {
        InterfaceC14165 interfaceC14165M44034;
        if (!c0117.mo1129()) {
            AbstractC20704 abstractC20704 = this.f60185;
            if (abstractC20704.hasField(c0117)) {
                InterfaceC14165 interfaceC14165M44035 = m44035(c0117);
                if (interfaceC14165M44035 != null) {
                    abstractC7297.mo19555(c0117.getNumber(), interfaceC14165M44035, c17798);
                    return;
                } else {
                    interfaceC14165M44034 = m44034(c0117, interfaceC23338);
                    interfaceC14165M44034.mergeFrom((InterfaceC23338) abstractC20704.getField(c0117));
                }
            } else {
                interfaceC14165M44034 = m44034(c0117, interfaceC23338);
            }
            abstractC7297.mo19555(c0117.getNumber(), interfaceC14165M44034, c17798);
            setField(c0117, interfaceC14165M44034.buildPartial());
            return;
        }
        InterfaceC14165 interfaceC14165M44036 = m44034(c0117, interfaceC23338);
        abstractC7297.mo19555(c0117.getNumber(), interfaceC14165M44036, c17798);
        addRepeatedField(c0117, interfaceC14165M44036.buildPartial());
    }

    @Override // l.InterfaceC0760
    /* JADX INFO: renamed from: ֫ */
    public final void mo971(AbstractC7297 abstractC7297, C17798 c17798, C0117 c0117, InterfaceC23338 interfaceC23338) {
        InterfaceC14165 interfaceC14165M44034;
        if (!c0117.mo1129()) {
            AbstractC20704 abstractC20704 = this.f60185;
            if (abstractC20704.hasField(c0117)) {
                InterfaceC14165 interfaceC14165M44035 = m44035(c0117);
                if (interfaceC14165M44035 != null) {
                    abstractC7297.mo19556(interfaceC14165M44035, c17798);
                    return;
                } else {
                    interfaceC14165M44034 = m44034(c0117, interfaceC23338);
                    interfaceC14165M44034.mergeFrom((InterfaceC23338) abstractC20704.getField(c0117));
                }
            } else {
                interfaceC14165M44034 = m44034(c0117, interfaceC23338);
            }
            abstractC7297.mo19556(interfaceC14165M44034, c17798);
            setField(c0117, interfaceC14165M44034.buildPartial());
            return;
        }
        InterfaceC14165 interfaceC14165M44036 = m44034(c0117, interfaceC23338);
        abstractC7297.mo19556(interfaceC14165M44036, c17798);
        addRepeatedField(c0117, interfaceC14165M44036.buildPartial());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC14165 m44034(C0117 c0117, InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 != null) {
            return interfaceC23338.newBuilderForType();
        }
        return this.f60185.newBuilderForField(c0117);
    }

    @Override // l.InterfaceC0760
    /* JADX INFO: renamed from: ֫ */
    public final EnumC17216 mo969(C0117 c0117) {
        if (c0117.m1149()) {
            return EnumC17216.f52820;
        }
        if (!c0117.mo1129() && (this.f60185 instanceof AbstractC19916)) {
            return EnumC17216.f52823;
        }
        return EnumC17216.f52821;
    }
}
