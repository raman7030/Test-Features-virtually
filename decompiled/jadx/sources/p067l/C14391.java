package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14391 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ۗ */
    public C4964 f41126;

    /* JADX INFO: renamed from: ۙ */
    public C4018 f41127;

    /* JADX INFO: renamed from: ۛ */
    public List f41128;

    /* JADX INFO: renamed from: ۤ */
    public C15969 f41129;

    /* JADX INFO: renamed from: ۫ */
    public List f41130;

    /* JADX INFO: renamed from: ۬ */
    public C15969 f41131;

    /* JADX INFO: renamed from: ᩶ */
    public C17310 f41132;

    /* JADX INFO: renamed from: ᩸ */
    public int f41133;

    /* JADX INFO: renamed from: ᩹ */
    public Object f41134;

    public /* synthetic */ C14391(int i) {
        this();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m33008();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m33008();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m33008();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m33008();
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
        C11650 c11650 = C12539.f35227;
        c11650.m26787(C24449.class, C14391.class);
        return c11650;
    }

    public C14391() {
        this.f41134 = "";
        List list = Collections.EMPTY_LIST;
        this.f41128 = list;
        this.f41130 = list;
        this.f41126 = C4964.m10513();
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m33006();
            m33005();
            m33007();
        }
    }

    public C14391(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f41134 = "";
        List list = Collections.EMPTY_LIST;
        this.f41128 = list;
        this.f41130 = list;
        this.f41126 = C4964.m10513();
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m33006();
            m33005();
            m33007();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33008() {
        super.clear();
        this.f41133 = 0;
        this.f41134 = "";
        C15969 c15969 = this.f41129;
        if (c15969 == null) {
            this.f41128 = Collections.EMPTY_LIST;
        } else {
            this.f41128 = null;
            c15969.m36302();
        }
        this.f41133 &= -3;
        this.f41127 = null;
        C17310 c17310 = this.f41132;
        if (c17310 != null) {
            c17310.m39271();
            this.f41132 = null;
        }
        C15969 c159610 = this.f41131;
        if (c159610 == null) {
            this.f41130 = Collections.EMPTY_LIST;
        } else {
            this.f41130 = null;
            c159610.m36302();
        }
        this.f41133 &= -9;
        this.f41126 = C4964.m10513();
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35210;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C24449.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C24449.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C24449 c24449BuildPartial = buildPartial();
        if (c24449BuildPartial.isInitialized()) {
            return c24449BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c24449BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C24449 c24449BuildPartial = buildPartial();
        if (c24449BuildPartial.isInitialized()) {
            return c24449BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c24449BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C24449 buildPartial() {
        C4018 c4018;
        int i = 0;
        C24449 c24449 = new C24449(this, 0);
        C15969 c15969 = this.f41129;
        if (c15969 != null) {
            c24449.f77397 = c15969.m36296();
        } else {
            if ((this.f41133 & 2) != 0) {
                this.f41128 = C21562.unmodifiableList(this.f41128);
                this.f41133 &= -3;
            }
            c24449.f77397 = this.f41128;
        }
        C15969 c159610 = this.f41131;
        if (c159610 != null) {
            c24449.f77398 = c159610.m36296();
        } else {
            if ((this.f41133 & 8) != 0) {
                this.f41130 = C21562.unmodifiableList(this.f41130);
                this.f41133 &= -9;
            }
            c24449.f77398 = this.f41130;
        }
        int i2 = this.f41133;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c24449.f77399 = this.f41134;
                i = 1;
            }
            if ((i2 & 4) != 0) {
                C17310 c17310 = this.f41132;
                if (c17310 == null) {
                    c4018 = this.f41127;
                } else {
                    c4018 = (C4018) c17310.m39268();
                }
                c24449.f77396 = c4018;
                i |= 2;
            }
            if ((i2 & 16) != 0) {
                this.f41126.mo46787();
                c24449.f77395 = this.f41126;
            }
            c24449.f77400 = i | c24449.f77400;
        }
        onBuilt();
        return c24449;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C24449) {
            m33009((C24449) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C24449) {
            m33009((C24449) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33009(C24449 c24449) {
        C4018 c4018;
        if (c24449 == C24449.getDefaultInstance()) {
            return;
        }
        if (c24449.hasName()) {
            this.f41134 = c24449.f77399;
            this.f41133 |= 1;
            onChanged();
        }
        if (this.f41129 == null) {
            if (!c24449.f77397.isEmpty()) {
                if (this.f41128.isEmpty()) {
                    this.f41128 = c24449.f77397;
                    this.f41133 &= -3;
                } else {
                    if ((this.f41133 & 2) == 0) {
                        this.f41128 = new ArrayList(this.f41128);
                        this.f41133 |= 2;
                    }
                    this.f41128.addAll(c24449.f77397);
                }
                onChanged();
            }
        } else if (!c24449.f77397.isEmpty()) {
            if (!this.f41129.m36307()) {
                this.f41129.m36294(c24449.f77397);
            } else {
                this.f41129.m36305();
                this.f41129 = null;
                this.f41128 = c24449.f77397;
                this.f41133 &= -3;
                this.f41129 = AbstractC6285.alwaysUseFieldBuilders ? m33006() : null;
            }
        }
        if (c24449.m53955()) {
            C4018 c4018M53954 = c24449.m53954();
            C17310 c17310 = this.f41132;
            if (c17310 == null) {
                if ((this.f41133 & 4) == 0 || (c4018 = this.f41127) == null || c4018 == C4018.getDefaultInstance()) {
                    this.f41127 = c4018M53954;
                } else {
                    this.f41133 |= 4;
                    onChanged();
                    ((C9697) m33005().m39273()).m22608(c4018M53954);
                }
            } else {
                c17310.m39267(c4018M53954);
            }
            if (this.f41127 != null) {
                this.f41133 |= 4;
                onChanged();
            }
        }
        if (this.f41131 == null) {
            if (!c24449.f77398.isEmpty()) {
                if (this.f41130.isEmpty()) {
                    this.f41130 = c24449.f77398;
                    this.f41133 &= -9;
                } else {
                    if ((this.f41133 & 8) == 0) {
                        this.f41130 = new ArrayList(this.f41130);
                        this.f41133 |= 8;
                    }
                    this.f41130.addAll(c24449.f77398);
                }
                onChanged();
            }
        } else if (!c24449.f77398.isEmpty()) {
            if (!this.f41131.m36307()) {
                this.f41131.m36294(c24449.f77398);
            } else {
                this.f41131.m36305();
                this.f41131 = null;
                this.f41130 = c24449.f77398;
                this.f41133 &= -9;
                this.f41131 = AbstractC6285.alwaysUseFieldBuilders ? m33007() : null;
            }
        }
        if (!c24449.f77395.isEmpty()) {
            if (this.f41126.isEmpty()) {
                this.f41126 = c24449.f77395;
                this.f41133 |= 16;
            } else {
                if (!this.f41126.mo46785()) {
                    this.f41126 = new C4964(this.f41126);
                }
                this.f41133 |= 16;
                this.f41126.addAll(c24449.f77395);
            }
            onChanged();
        }
        mergeUnknownFields(c24449.getUnknownFields());
        onChanged();
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final C14391 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 10) {
                            this.f41134 = abstractC9303.mo21534();
                            this.f41133 |= 1;
                        } else if (iMo21535 == 18) {
                            C19441 c19441 = (C19441) abstractC9303.mo21520(C19441.parser(), c19283);
                            C15969 c15969 = this.f41129;
                            if (c15969 != null) {
                                c15969.m36299(c19441);
                            } else {
                                if ((this.f41133 & 2) == 0) {
                                    this.f41128 = new ArrayList(this.f41128);
                                    this.f41133 |= 2;
                                }
                                this.f41128.add(c19441);
                            }
                        } else if (iMo21535 == 26) {
                            abstractC9303.mo21524(m33005().m39273(), c19283);
                            this.f41133 |= 4;
                        } else if (iMo21535 == 34) {
                            C13721 c13721 = (C13721) abstractC9303.mo21520(C13721.parser(), c19283);
                            C15969 c159610 = this.f41131;
                            if (c159610 != null) {
                                c159610.m36299(c13721);
                            } else {
                                if ((this.f41133 & 8) == 0) {
                                    this.f41130 = new ArrayList(this.f41130);
                                    this.f41133 |= 8;
                                }
                                this.f41130.add(c13721);
                            }
                        } else if (iMo21535 == 42) {
                            AbstractC7962 abstractC7962Mo21534 = abstractC9303.mo21534();
                            if (!this.f41126.mo46785()) {
                                this.f41126 = new C4964(this.f41126);
                            }
                            this.f41133 |= 16;
                            this.f41126.mo10516(abstractC7962Mo21534);
                        } else if (!super.parseUnknownField(abstractC9303, c19283, iMo21535)) {
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

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        int iM36300;
        C4018 defaultInstance;
        C19441 c19441;
        int i = 0;
        while (true) {
            C15969 c15969 = this.f41129;
            if (c15969 == null) {
                iM36300 = this.f41128.size();
            } else {
                iM36300 = c15969.m36300();
            }
            if (i < iM36300) {
                C15969 c159610 = this.f41129;
                if (c159610 == null) {
                    c19441 = (C19441) this.f41128.get(i);
                } else {
                    c19441 = (C19441) c159610.m36297(i);
                }
                if (!c19441.isInitialized()) {
                    break;
                }
                i++;
            } else {
                if ((this.f41133 & 4) == 0) {
                    return true;
                }
                C17310 c17310 = this.f41132;
                if (c17310 == null) {
                    defaultInstance = this.f41127;
                    if (defaultInstance == null) {
                        defaultInstance = C4018.getDefaultInstance();
                    }
                } else {
                    defaultInstance = (C4018) c17310.m39272();
                }
                if (!defaultInstance.isInitialized()) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ */
    private C15969 m33006() {
        if (this.f41129 == null) {
            this.f41129 = new C15969(this.f41128, (this.f41133 & 2) != 0, getParentForChildren(), isClean());
            this.f41128 = null;
        }
        return this.f41129;
    }

    /* JADX INFO: renamed from: ܽ */
    private C17310 m33005() {
        C4018 defaultInstance;
        C17310 c17310 = this.f41132;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f41127;
                if (defaultInstance == null) {
                    defaultInstance = C4018.getDefaultInstance();
                }
            } else {
                defaultInstance = (C4018) c17310.m39272();
            }
            this.f41132 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f41127 = null;
        }
        return this.f41132;
    }

    /* JADX INFO: renamed from: ᩳ */
    private C15969 m33007() {
        if (this.f41131 == null) {
            this.f41131 = new C15969(this.f41130, (this.f41133 & 8) != 0, getParentForChildren(), isClean());
            this.f41130 = null;
        }
        return this.f41131;
    }
}
