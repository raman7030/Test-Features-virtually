package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۧܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12911 extends AbstractC5202 {

    /* JADX INFO: renamed from: ۗ */
    public C17310 f36293;

    /* JADX INFO: renamed from: ۙ */
    public boolean f36294;

    /* JADX INFO: renamed from: ۛ */
    public boolean f36295;

    /* JADX INFO: renamed from: ۤ */
    public boolean f36296;

    /* JADX INFO: renamed from: ۨ */
    public C15969 f36297;

    /* JADX INFO: renamed from: ۫ */
    public boolean f36298;

    /* JADX INFO: renamed from: ۬ */
    public C8041 f36299;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f36300;

    /* JADX INFO: renamed from: ᩹ */
    public int f36301;

    /* JADX INFO: renamed from: ᩺ */
    public List f36302;

    public C12911(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f36302 = Collections.EMPTY_LIST;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m29585();
            m29584();
        }
    }

    public /* synthetic */ C12911(int i) {
        this();
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC5202 clear() {
        m29588();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m29588();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m29588();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m29588();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m29588();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m29587(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m29587(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m29587(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m29587(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35206;
        c11650.m26787(C18274.class, C12911.class);
        return c11650;
    }

    public C12911() {
        this.f36302 = Collections.EMPTY_LIST;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m29585();
            m29584();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m29588() {
        super.clear();
        this.f36301 = 0;
        this.f36296 = false;
        this.f36295 = false;
        this.f36294 = false;
        this.f36298 = false;
        this.f36300 = false;
        this.f36299 = null;
        C17310 c17310 = this.f36293;
        if (c17310 != null) {
            c17310.m39271();
            this.f36293 = null;
        }
        C15969 c15969 = this.f36297;
        if (c15969 == null) {
            this.f36302 = Collections.EMPTY_LIST;
        } else {
            this.f36302 = null;
            c15969.m36302();
        }
        this.f36301 &= -65;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35249;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C18274.getDefaultInstance();
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C18274.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C18274 c18274BuildPartial = buildPartial();
        if (c18274BuildPartial.isInitialized()) {
            return c18274BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c18274BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C18274 c18274BuildPartial = buildPartial();
        if (c18274BuildPartial.isInitialized()) {
            return c18274BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c18274BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C18274 buildPartial() {
        int i;
        C8041 c8041;
        C18274 c18274 = new C18274(this);
        C15969 c15969 = this.f36297;
        if (c15969 != null) {
            c18274.f54560 = c15969.m36296();
        } else {
            if ((this.f36301 & 64) != 0) {
                this.f36302 = C21562.unmodifiableList(this.f36302);
                this.f36301 &= -65;
            }
            c18274.f54560 = this.f36302;
        }
        int i2 = this.f36301;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c18274.f54559 = this.f36296;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c18274.f54558 = this.f36295;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c18274.f54557 = this.f36294;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c18274.f54562 = this.f36298;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c18274.f54563 = this.f36300;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                C17310 c17310 = this.f36293;
                if (c17310 == null) {
                    c8041 = this.f36299;
                } else {
                    c8041 = (C8041) c17310.m39268();
                }
                c18274.f54556 = c8041;
                i |= 32;
            }
            c18274.f54564 = i | c18274.f54564;
        }
        onBuilt();
        return c18274;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C18274) {
            m29586((C18274) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C18274) {
            m29586((C18274) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12911 m29586(C18274 c18274) {
        C8041 c8041;
        if (c18274 == C18274.getDefaultInstance()) {
            return this;
        }
        if (c18274.m41614()) {
            this.f36296 = c18274.m41616();
            this.f36301 |= 1;
            onChanged();
        }
        if (c18274.m41618()) {
            this.f36295 = c18274.m41617();
            this.f36301 |= 2;
            onChanged();
        }
        if (c18274.m41607()) {
            this.f36294 = c18274.m41613();
            this.f36301 |= 4;
            onChanged();
        }
        if (c18274.m41612()) {
            this.f36298 = c18274.m41610();
            this.f36301 |= 8;
            onChanged();
        }
        if (c18274.m41611()) {
            this.f36300 = c18274.m41615();
            this.f36301 |= 16;
            onChanged();
        }
        if (c18274.m41608()) {
            C8041 c8041M41609 = c18274.m41609();
            C17310 c17310 = this.f36293;
            if (c17310 == null) {
                if ((this.f36301 & 32) == 0 || (c8041 = this.f36299) == null || c8041 == C8041.getDefaultInstance()) {
                    this.f36299 = c8041M41609;
                } else {
                    this.f36301 |= 32;
                    onChanged();
                    ((C2676) m29585().m39273()).m4130(c8041M41609);
                }
            } else {
                c17310.m39267(c8041M41609);
            }
            if (this.f36299 != null) {
                this.f36301 |= 32;
                onChanged();
            }
        }
        if (this.f36297 == null) {
            if (!c18274.f54560.isEmpty()) {
                if (this.f36302.isEmpty()) {
                    this.f36302 = c18274.f54560;
                    this.f36301 &= -65;
                } else {
                    if ((this.f36301 & 64) == 0) {
                        this.f36302 = new ArrayList(this.f36302);
                        this.f36301 |= 64;
                    }
                    this.f36302.addAll(c18274.f54560);
                }
                onChanged();
            }
        } else if (!c18274.f54560.isEmpty()) {
            if (!this.f36297.m36307()) {
                this.f36297.m36294(c18274.f54560);
            } else {
                this.f36297.m36305();
                this.f36297 = null;
                this.f36302 = c18274.f54560;
                this.f36301 &= -65;
                this.f36297 = AbstractC6285.alwaysUseFieldBuilders ? m29584() : null;
            }
        }
        m11167((AbstractC13919) c18274);
        mergeUnknownFields(c18274.getUnknownFields());
        onChanged();
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29587(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 8) {
                            this.f36296 = abstractC9303.mo21539();
                            this.f36301 |= 1;
                        } else if (iMo21535 == 16) {
                            this.f36295 = abstractC9303.mo21539();
                            this.f36301 |= 2;
                        } else if (iMo21535 == 24) {
                            this.f36294 = abstractC9303.mo21539();
                            this.f36301 |= 4;
                        } else if (iMo21535 == 56) {
                            this.f36298 = abstractC9303.mo21539();
                            this.f36301 |= 8;
                        } else if (iMo21535 == 88) {
                            this.f36300 = abstractC9303.mo21539();
                            this.f36301 |= 16;
                        } else if (iMo21535 == 98) {
                            abstractC9303.mo21524(m29585().m39273(), c19283);
                            this.f36301 |= 32;
                        } else if (iMo21535 == 7994) {
                            C3821 c3821 = (C3821) abstractC9303.mo21520(C3821.parser(), c19283);
                            C15969 c15969 = this.f36297;
                            if (c15969 != null) {
                                c15969.m36299(c3821);
                            } else {
                                if ((this.f36301 & 64) == 0) {
                                    this.f36302 = new ArrayList(this.f36302);
                                    this.f36301 |= 64;
                                }
                                this.f36302.add(c3821);
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
    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0056 A[EDGE_INSN: B:33:0x0056->B:29:0x0056 BREAK  A[LOOP:0: B:14:0x0022->B:26:0x004d], SYNTHETIC] */
    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        int i;
        C15969 c15969;
        int iM36300;
        C15969 c159610;
        C3821 c3821;
        C8041 defaultInstance;
        if ((this.f36301 & 32) == 0) {
            i = 0;
            while (true) {
                c15969 = this.f36297;
                if (c15969 == null) {
                    iM36300 = this.f36302.size();
                } else {
                    iM36300 = c15969.m36300();
                }
                if (i < iM36300) {
                    if (!m11168()) {
                        break;
                    }
                    return true;
                }
                c159610 = this.f36297;
                if (c159610 == null) {
                    c3821 = (C3821) this.f36302.get(i);
                } else {
                    c3821 = (C3821) c159610.m36297(i);
                }
                if (!c3821.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C17310 c17310 = this.f36293;
            if (c17310 == null) {
                defaultInstance = this.f36299;
                if (defaultInstance == null) {
                    defaultInstance = C8041.getDefaultInstance();
                }
            } else {
                defaultInstance = (C8041) c17310.m39272();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c15969 = this.f36297;
                    if (c15969 == null) {
                        iM36300 = this.f36302.size();
                    } else {
                        iM36300 = c15969.m36300();
                    }
                    if (i < iM36300) {
                        if (!m11168()) {
                            break;
                        }
                        return true;
                    }
                    c159610 = this.f36297;
                    if (c159610 == null) {
                        c3821 = (C3821) this.f36302.get(i);
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
    public final void m29589() {
        this.f36301 &= -33;
        this.f36299 = null;
        C17310 c17310 = this.f36293;
        if (c17310 != null) {
            c17310.m39271();
            this.f36293 = null;
        }
        onChanged();
    }

    /* JADX INFO: renamed from: ܿ */
    private C17310 m29585() {
        C8041 defaultInstance;
        C17310 c17310 = this.f36293;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f36299;
                if (defaultInstance == null) {
                    defaultInstance = C8041.getDefaultInstance();
                }
            } else {
                defaultInstance = (C8041) c17310.m39272();
            }
            this.f36293 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f36299 = null;
        }
        return this.f36293;
    }

    /* JADX INFO: renamed from: ܳ */
    private C15969 m29584() {
        if (this.f36297 == null) {
            this.f36297 = new C15969(this.f36302, (this.f36301 & 64) != 0, getParentForChildren(), isClean());
            this.f36302 = null;
        }
        return this.f36297;
    }
}
