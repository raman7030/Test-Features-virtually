package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22969 extends AbstractC5202 {

    /* JADX INFO: renamed from: ۗ */
    public C8041 f72233;

    /* JADX INFO: renamed from: ۙ */
    public C17310 f72234;

    /* JADX INFO: renamed from: ۫ */
    public List f72235;

    /* JADX INFO: renamed from: ۬ */
    public C15969 f72236;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f72237;

    /* JADX INFO: renamed from: ᩹ */
    public int f72238;

    public C22969(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f72235 = Collections.EMPTY_LIST;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m51291();
            m51290();
        }
    }

    public /* synthetic */ C22969(int i) {
        this();
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC5202 clear() {
        m51294();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m51294();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m51294();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m51294();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m51294();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m51292(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m51292(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m51292(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m51292(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35209;
        c11650.m26787(C23639.class, C22969.class);
        return c11650;
    }

    public C22969() {
        this.f72235 = Collections.EMPTY_LIST;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m51291();
            m51290();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m51294() {
        super.clear();
        this.f72238 = 0;
        this.f72233 = null;
        C17310 c17310 = this.f72234;
        if (c17310 != null) {
            c17310.m39271();
            this.f72234 = null;
        }
        this.f72237 = false;
        C15969 c15969 = this.f72236;
        if (c15969 == null) {
            this.f72235 = Collections.EMPTY_LIST;
        } else {
            this.f72235 = null;
            c15969.m36302();
        }
        this.f72238 &= -5;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35191;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C23639.getDefaultInstance();
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C23639.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C23639 c23639BuildPartial = buildPartial();
        if (c23639BuildPartial.isInitialized()) {
            return c23639BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c23639BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C23639 c23639BuildPartial = buildPartial();
        if (c23639BuildPartial.isInitialized()) {
            return c23639BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c23639BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C23639 buildPartial() {
        int i;
        C8041 c8041;
        C23639 c23639 = new C23639(this);
        C15969 c15969 = this.f72236;
        if (c15969 != null) {
            c23639.f75258 = c15969.m36296();
        } else {
            if ((this.f72238 & 4) != 0) {
                this.f72235 = C21562.unmodifiableList(this.f72235);
                this.f72238 &= -5;
            }
            c23639.f75258 = this.f72235;
        }
        int i2 = this.f72238;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                C17310 c17310 = this.f72234;
                if (c17310 == null) {
                    c8041 = this.f72233;
                } else {
                    c8041 = (C8041) c17310.m39268();
                }
                c23639.f75257 = c8041;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c23639.f75259 = this.f72237;
                i |= 2;
            }
            c23639.f75260 = i | c23639.f75260;
        }
        onBuilt();
        return c23639;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C23639) {
            m51293((C23639) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C23639) {
            m51293((C23639) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51293(C23639 c23639) {
        C8041 c8041;
        if (c23639 == C23639.getDefaultInstance()) {
            return;
        }
        if (c23639.m52591()) {
            C8041 c8041M52593 = c23639.m52593();
            C17310 c17310 = this.f72234;
            if (c17310 == null) {
                if ((this.f72238 & 1) == 0 || (c8041 = this.f72233) == null || c8041 == C8041.getDefaultInstance()) {
                    this.f72233 = c8041M52593;
                } else {
                    this.f72238 |= 1;
                    onChanged();
                    ((C2676) m51291().m39273()).m4130(c8041M52593);
                }
            } else {
                c17310.m39267(c8041M52593);
            }
            if (this.f72233 != null) {
                this.f72238 |= 1;
                onChanged();
            }
        }
        if (c23639.m52590()) {
            this.f72237 = c23639.m52592();
            this.f72238 |= 2;
            onChanged();
        }
        if (this.f72236 == null) {
            if (!c23639.f75258.isEmpty()) {
                if (this.f72235.isEmpty()) {
                    this.f72235 = c23639.f75258;
                    this.f72238 &= -5;
                } else {
                    if ((this.f72238 & 4) == 0) {
                        this.f72235 = new ArrayList(this.f72235);
                        this.f72238 |= 4;
                    }
                    this.f72235.addAll(c23639.f75258);
                }
                onChanged();
            }
        } else if (!c23639.f75258.isEmpty()) {
            if (!this.f72236.m36307()) {
                this.f72236.m36294(c23639.f75258);
            } else {
                this.f72236.m36305();
                this.f72236 = null;
                this.f72235 = c23639.f75258;
                this.f72238 &= -5;
                this.f72236 = AbstractC6285.alwaysUseFieldBuilders ? m51290() : null;
            }
        }
        m11167((AbstractC13919) c23639);
        mergeUnknownFields(c23639.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51292(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 264) {
                            this.f72237 = abstractC9303.mo21539();
                            this.f72238 |= 2;
                        } else if (iMo21535 == 274) {
                            abstractC9303.mo21524(m51291().m39273(), c19283);
                            this.f72238 |= 1;
                        } else if (iMo21535 == 7994) {
                            C3821 c3821 = (C3821) abstractC9303.mo21520(C3821.parser(), c19283);
                            C15969 c15969 = this.f72236;
                            if (c15969 != null) {
                                c15969.m36299(c3821);
                            } else {
                                if ((this.f72238 & 4) == 0) {
                                    this.f72235 = new ArrayList(this.f72235);
                                    this.f72238 |= 4;
                                }
                                this.f72235.add(c3821);
                            }
                        } else if (!parseUnknownField(abstractC9303, c19283, iMo21535)) {
                        }
                    }
                    z = true;
                } catch (C4293 e) {
                    throw e.m8712();
                }
            } catch (Throwable th) {
                onChanged();
                throw th;
            }
        }
        onChanged();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d A[LOOP:0: B:14:0x0022->B:26:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0056 A[EDGE_INSN: B:32:0x0056->B:29:0x0056 BREAK  A[LOOP:0: B:14:0x0022->B:26:0x004d], SYNTHETIC] */
    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        int i;
        C15969 c15969;
        int iM36300;
        C15969 c159610;
        C3821 c3821;
        C8041 defaultInstance;
        if ((this.f72238 & 1) == 0) {
            i = 0;
            while (true) {
                c15969 = this.f72236;
                if (c15969 == null) {
                    iM36300 = this.f72235.size();
                } else {
                    iM36300 = c15969.m36300();
                }
                if (i < iM36300) {
                    if (!m11168()) {
                        break;
                    }
                    return true;
                }
                c159610 = this.f72236;
                if (c159610 == null) {
                    c3821 = (C3821) this.f72235.get(i);
                } else {
                    c3821 = (C3821) c159610.m36297(i);
                }
                if (!c3821.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C17310 c17310 = this.f72234;
            if (c17310 == null) {
                defaultInstance = this.f72233;
                if (defaultInstance == null) {
                    defaultInstance = C8041.getDefaultInstance();
                }
            } else {
                defaultInstance = (C8041) c17310.m39272();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c15969 = this.f72236;
                    if (c15969 == null) {
                        iM36300 = this.f72235.size();
                    } else {
                        iM36300 = c15969.m36300();
                    }
                    if (i < iM36300) {
                        if (!m11168()) {
                            break;
                        }
                        return true;
                    }
                    c159610 = this.f72236;
                    if (c159610 == null) {
                        c3821 = (C3821) this.f72235.get(i);
                    } else {
                        c3821 = (C3821) c159610.m36297(i);
                    }
                    if (!c3821.isInitialized()) {
                        break;
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    private C17310 m51291() {
        C8041 defaultInstance;
        C17310 c17310 = this.f72234;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f72233;
                if (defaultInstance == null) {
                    defaultInstance = C8041.getDefaultInstance();
                }
            } else {
                defaultInstance = (C8041) c17310.m39272();
            }
            this.f72234 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f72233 = null;
        }
        return this.f72234;
    }

    /* JADX INFO: renamed from: ܿ */
    private C15969 m51290() {
        if (this.f72236 == null) {
            this.f72236 = new C15969(this.f72235, (this.f72238 & 4) != 0, getParentForChildren(), isClean());
            this.f72235 = null;
        }
        return this.f72236;
    }
}
