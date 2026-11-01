package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16087 extends AbstractC5202 {

    /* JADX INFO: renamed from: ۗ */
    public C17310 f47336;

    /* JADX INFO: renamed from: ۙ */
    public boolean f47337;

    /* JADX INFO: renamed from: ۛ */
    public C15969 f47338;

    /* JADX INFO: renamed from: ۤ */
    public C8041 f47339;

    /* JADX INFO: renamed from: ۨ */
    public List f47340;

    /* JADX INFO: renamed from: ۫ */
    public C17310 f47341;

    /* JADX INFO: renamed from: ۬ */
    public C3327 f47342;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f47343;

    /* JADX INFO: renamed from: ᩹ */
    public int f47344;

    public C16087(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f47340 = Collections.EMPTY_LIST;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m36594();
            m36595();
            m36593();
        }
    }

    public /* synthetic */ C16087(int i) {
        this();
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC5202 clear() {
        m36597();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m36597();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m36597();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m36597();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m36597();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        mergeFrom(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        mergeFrom(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        mergeFrom(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        mergeFrom(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35202;
        c11650.m26787(C24805.class, C16087.class);
        return c11650;
    }

    public C16087() {
        this.f47340 = Collections.EMPTY_LIST;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m36594();
            m36595();
            m36593();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m36597() {
        super.clear();
        this.f47344 = 0;
        this.f47337 = false;
        this.f47339 = null;
        C17310 c17310 = this.f47341;
        if (c17310 != null) {
            c17310.m39271();
            this.f47341 = null;
        }
        this.f47343 = false;
        this.f47342 = null;
        C17310 c17311 = this.f47336;
        if (c17311 != null) {
            c17311.m39271();
            this.f47336 = null;
        }
        C15969 c15969 = this.f47338;
        if (c15969 == null) {
            this.f47340 = Collections.EMPTY_LIST;
        } else {
            this.f47340 = null;
            c15969.m36302();
        }
        this.f47344 &= -17;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35188;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C24805.getDefaultInstance();
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C24805.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C24805 c24805BuildPartial = buildPartial();
        if (c24805BuildPartial.isInitialized()) {
            return c24805BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c24805BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C24805 c24805BuildPartial = buildPartial();
        if (c24805BuildPartial.isInitialized()) {
            return c24805BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c24805BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C24805 buildPartial() {
        int i;
        C3327 c3327;
        C8041 c8041;
        C24805 c24805 = new C24805(this);
        C15969 c15969 = this.f47338;
        if (c15969 != null) {
            c24805.f79268 = c15969.m36296();
        } else {
            if ((this.f47344 & 16) != 0) {
                this.f47340 = C21562.unmodifiableList(this.f47340);
                this.f47344 &= -17;
            }
            c24805.f79268 = this.f47340;
        }
        int i2 = this.f47344;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c24805.f79267 = this.f47337;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                C17310 c17310 = this.f47341;
                if (c17310 == null) {
                    c8041 = this.f47339;
                } else {
                    c8041 = (C8041) c17310.m39268();
                }
                c24805.f79270 = c8041;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c24805.f79271 = this.f47343;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                C17310 c17311 = this.f47336;
                if (c17311 == null) {
                    c3327 = this.f47342;
                } else {
                    c3327 = (C3327) c17311.m39268();
                }
                c24805.f79266 = c3327;
                i |= 8;
            }
            c24805.f79272 = i | c24805.f79272;
        }
        onBuilt();
        return c24805;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C24805) {
            m36596((C24805) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C24805) {
            m36596((C24805) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36596(C24805 c24805) {
        C3327 c3327;
        C8041 c8041;
        if (c24805 == C24805.getDefaultInstance()) {
            return;
        }
        if (c24805.m54504()) {
            this.f47337 = c24805.m54502();
            this.f47344 |= 1;
            onChanged();
        }
        if (c24805.m54500()) {
            C8041 c8041M54499 = c24805.m54499();
            C17310 c17310 = this.f47341;
            if (c17310 == null) {
                if ((this.f47344 & 2) == 0 || (c8041 = this.f47339) == null || c8041 == C8041.getDefaultInstance()) {
                    this.f47339 = c8041M54499;
                } else {
                    this.f47344 |= 2;
                    onChanged();
                    ((C2676) m36594().m39273()).m4130(c8041M54499);
                }
            } else {
                c17310.m39267(c8041M54499);
            }
            if (this.f47339 != null) {
                this.f47344 |= 2;
                onChanged();
            }
        }
        if (c24805.m54503()) {
            this.f47343 = c24805.m54501();
            this.f47344 |= 4;
            onChanged();
        }
        if (c24805.m54497()) {
            C3327 c3327M54498 = c24805.m54498();
            C17310 c17311 = this.f47336;
            if (c17311 == null) {
                if ((this.f47344 & 8) == 0 || (c3327 = this.f47342) == null || c3327 == C3327.getDefaultInstance()) {
                    this.f47342 = c3327M54498;
                } else {
                    this.f47344 |= 8;
                    onChanged();
                    ((C7351) m36595().m39273()).m17032(c3327M54498);
                }
            } else {
                c17311.m39267(c3327M54498);
            }
            if (this.f47342 != null) {
                this.f47344 |= 8;
                onChanged();
            }
        }
        if (this.f47338 == null) {
            if (!c24805.f79268.isEmpty()) {
                if (this.f47340.isEmpty()) {
                    this.f47340 = c24805.f79268;
                    this.f47344 &= -17;
                } else {
                    if ((this.f47344 & 16) == 0) {
                        this.f47340 = new ArrayList(this.f47340);
                        this.f47344 |= 16;
                    }
                    this.f47340.addAll(c24805.f79268);
                }
                onChanged();
            }
        } else if (!c24805.f79268.isEmpty()) {
            if (!this.f47338.m36307()) {
                this.f47338.m36294(c24805.f79268);
            } else {
                this.f47338.m36305();
                this.f47338 = null;
                this.f47340 = c24805.f79268;
                this.f47344 &= -17;
                this.f47338 = AbstractC6285.alwaysUseFieldBuilders ? m36593() : null;
            }
        }
        m11167((AbstractC13919) c24805);
        mergeUnknownFields(c24805.getUnknownFields());
        onChanged();
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final C16087 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 8) {
                            this.f47337 = abstractC9303.mo21539();
                            this.f47344 |= 1;
                        } else if (iMo21535 == 18) {
                            abstractC9303.mo21524(m36594().m39273(), c19283);
                            this.f47344 |= 2;
                        } else if (iMo21535 == 24) {
                            this.f47343 = abstractC9303.mo21539();
                            this.f47344 |= 4;
                        } else if (iMo21535 == 34) {
                            abstractC9303.mo21524(m36595().m39273(), c19283);
                            this.f47344 |= 8;
                        } else if (iMo21535 == 7994) {
                            C3821 c3821 = (C3821) abstractC9303.mo21520(C3821.parser(), c19283);
                            C15969 c15969 = this.f47338;
                            if (c15969 != null) {
                                c15969.m36299(c3821);
                            } else {
                                if ((this.f47344 & 16) == 0) {
                                    this.f47340 = new ArrayList(this.f47340);
                                    this.f47344 |= 16;
                                }
                                this.f47340.add(c3821);
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
        return this;
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
        if ((this.f47344 & 2) == 0) {
            i = 0;
            while (true) {
                c15969 = this.f47338;
                if (c15969 == null) {
                    iM36300 = this.f47340.size();
                } else {
                    iM36300 = c15969.m36300();
                }
                if (i < iM36300) {
                    if (!m11168()) {
                        break;
                    }
                    return true;
                }
                c159610 = this.f47338;
                if (c159610 == null) {
                    c3821 = (C3821) this.f47340.get(i);
                } else {
                    c3821 = (C3821) c159610.m36297(i);
                }
                if (!c3821.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C17310 c17310 = this.f47341;
            if (c17310 == null) {
                defaultInstance = this.f47339;
                if (defaultInstance == null) {
                    defaultInstance = C8041.getDefaultInstance();
                }
            } else {
                defaultInstance = (C8041) c17310.m39272();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c15969 = this.f47338;
                    if (c15969 == null) {
                        iM36300 = this.f47340.size();
                    } else {
                        iM36300 = c15969.m36300();
                    }
                    if (i < iM36300) {
                        if (!m11168()) {
                            break;
                        }
                        return true;
                    }
                    c159610 = this.f47338;
                    if (c159610 == null) {
                        c3821 = (C3821) this.f47340.get(i);
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

    /* JADX INFO: renamed from: ܿ */
    private C17310 m36594() {
        C8041 defaultInstance;
        C17310 c17310 = this.f47341;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f47339;
                if (defaultInstance == null) {
                    defaultInstance = C8041.getDefaultInstance();
                }
            } else {
                defaultInstance = (C8041) c17310.m39272();
            }
            this.f47341 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f47339 = null;
        }
        return this.f47341;
    }

    /* JADX INFO: renamed from: ᩳ */
    private C17310 m36595() {
        C3327 defaultInstance;
        C17310 c17310 = this.f47336;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f47342;
                if (defaultInstance == null) {
                    defaultInstance = C3327.getDefaultInstance();
                }
            } else {
                defaultInstance = (C3327) c17310.m39272();
            }
            this.f47336 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f47342 = null;
        }
        return this.f47336;
    }

    /* JADX INFO: renamed from: ܳ */
    private C15969 m36593() {
        if (this.f47338 == null) {
            this.f47338 = new C15969(this.f47340, (this.f47344 & 16) != 0, getParentForChildren(), isClean());
            this.f47340 = null;
        }
        return this.f47338;
    }
}
