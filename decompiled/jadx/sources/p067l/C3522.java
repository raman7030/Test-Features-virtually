package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֨ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3522 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ۗ */
    public C17310 f7134;

    /* JADX INFO: renamed from: ۙ */
    public Object f7135;

    /* JADX INFO: renamed from: ۬ */
    public C23639 f7136;

    /* JADX INFO: renamed from: ᩶ */
    public List f7137;

    /* JADX INFO: renamed from: ᩸ */
    public int f7138;

    /* JADX INFO: renamed from: ᩹ */
    public C15969 f7139;

    public /* synthetic */ C3522(int i) {
        this();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m6298();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m6298();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m6298();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m6298();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m6299(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m6299(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m6299(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m6299(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35203;
        c11650.m26787(C10228.class, C3522.class);
        return c11650;
    }

    public C3522() {
        this.f7135 = "";
        this.f7137 = Collections.EMPTY_LIST;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m6296();
            m6297();
        }
    }

    public C3522(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f7135 = "";
        this.f7137 = Collections.EMPTY_LIST;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m6296();
            m6297();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6298() {
        super.clear();
        this.f7138 = 0;
        this.f7135 = "";
        C15969 c15969 = this.f7139;
        if (c15969 == null) {
            this.f7137 = Collections.EMPTY_LIST;
        } else {
            this.f7137 = null;
            c15969.m36302();
        }
        this.f7138 &= -3;
        this.f7136 = null;
        C17310 c17310 = this.f7134;
        if (c17310 != null) {
            c17310.m39271();
            this.f7134 = null;
        }
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35189;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C10228.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C10228.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C10228 c10228BuildPartial = buildPartial();
        if (c10228BuildPartial.isInitialized()) {
            return c10228BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c10228BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C10228 c10228BuildPartial = buildPartial();
        if (c10228BuildPartial.isInitialized()) {
            return c10228BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c10228BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C10228 buildPartial() {
        C23639 c23639;
        int i = 0;
        C10228 c10228 = new C10228(this, 0);
        C15969 c15969 = this.f7139;
        if (c15969 != null) {
            c10228.f28346 = c15969.m36296();
        } else {
            if ((this.f7138 & 2) != 0) {
                this.f7137 = C21562.unmodifiableList(this.f7137);
                this.f7138 &= -3;
            }
            c10228.f28346 = this.f7137;
        }
        int i2 = this.f7138;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c10228.f28345 = this.f7135;
                i = 1;
            }
            if ((i2 & 4) != 0) {
                C17310 c17310 = this.f7134;
                if (c17310 == null) {
                    c23639 = this.f7136;
                } else {
                    c23639 = (C23639) c17310.m39268();
                }
                c10228.f28344 = c23639;
                i |= 2;
            }
            c10228.f28347 = i | c10228.f28347;
        }
        onBuilt();
        return c10228;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C10228) {
            m6300((C10228) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C10228) {
            m6300((C10228) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6300(C10228 c10228) {
        C23639 c23639;
        if (c10228 == C10228.getDefaultInstance()) {
            return;
        }
        if (c10228.hasName()) {
            this.f7135 = c10228.f28345;
            this.f7138 |= 1;
            onChanged();
        }
        if (this.f7139 == null) {
            if (!c10228.f28346.isEmpty()) {
                if (this.f7137.isEmpty()) {
                    this.f7137 = c10228.f28346;
                    this.f7138 &= -3;
                } else {
                    if ((this.f7138 & 2) == 0) {
                        this.f7137 = new ArrayList(this.f7137);
                        this.f7138 |= 2;
                    }
                    this.f7137.addAll(c10228.f28346);
                }
                onChanged();
            }
        } else if (!c10228.f28346.isEmpty()) {
            if (!this.f7139.m36307()) {
                this.f7139.m36294(c10228.f28346);
            } else {
                this.f7139.m36305();
                this.f7139 = null;
                this.f7137 = c10228.f28346;
                this.f7138 &= -3;
                this.f7139 = AbstractC6285.alwaysUseFieldBuilders ? m6296() : null;
            }
        }
        if (c10228.m23846()) {
            C23639 c23639M23847 = c10228.m23847();
            C17310 c17310 = this.f7134;
            if (c17310 == null) {
                if ((this.f7138 & 4) == 0 || (c23639 = this.f7136) == null || c23639 == C23639.getDefaultInstance()) {
                    this.f7136 = c23639M23847;
                } else {
                    this.f7138 |= 4;
                    onChanged();
                    ((C22969) m6297().m39273()).m51293(c23639M23847);
                }
            } else {
                c17310.m39267(c23639M23847);
            }
            if (this.f7136 != null) {
                this.f7138 |= 4;
                onChanged();
            }
        }
        mergeUnknownFields(c10228.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6299(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 10) {
                            this.f7135 = abstractC9303.mo21534();
                            this.f7138 |= 1;
                        } else if (iMo21535 == 18) {
                            C16262 c16262 = (C16262) abstractC9303.mo21520(C16262.parser(), c19283);
                            C15969 c15969 = this.f7139;
                            if (c15969 != null) {
                                c15969.m36299(c16262);
                            } else {
                                if ((this.f7138 & 2) == 0) {
                                    this.f7137 = new ArrayList(this.f7137);
                                    this.f7138 |= 2;
                                }
                                this.f7137.add(c16262);
                            }
                        } else if (iMo21535 == 26) {
                            abstractC9303.mo21524(m6297().m39273(), c19283);
                            this.f7138 |= 4;
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
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        int iM36300;
        C23639 defaultInstance;
        C16262 c16262;
        int i = 0;
        while (true) {
            C15969 c15969 = this.f7139;
            if (c15969 == null) {
                iM36300 = this.f7137.size();
            } else {
                iM36300 = c15969.m36300();
            }
            if (i < iM36300) {
                C15969 c159610 = this.f7139;
                if (c159610 == null) {
                    c16262 = (C16262) this.f7137.get(i);
                } else {
                    c16262 = (C16262) c159610.m36297(i);
                }
                if (!c16262.isInitialized()) {
                    break;
                }
                i++;
            } else {
                if ((this.f7138 & 4) == 0) {
                    return true;
                }
                C17310 c17310 = this.f7134;
                if (c17310 == null) {
                    defaultInstance = this.f7136;
                    if (defaultInstance == null) {
                        defaultInstance = C23639.getDefaultInstance();
                    }
                } else {
                    defaultInstance = (C23639) c17310.m39272();
                }
                if (!defaultInstance.isInitialized()) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    private C15969 m6296() {
        if (this.f7139 == null) {
            this.f7139 = new C15969(this.f7137, (this.f7138 & 2) != 0, getParentForChildren(), isClean());
            this.f7137 = null;
        }
        return this.f7139;
    }

    /* JADX INFO: renamed from: ᩳ */
    private C17310 m6297() {
        C23639 defaultInstance;
        C17310 c17310 = this.f7134;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f7136;
                if (defaultInstance == null) {
                    defaultInstance = C23639.getDefaultInstance();
                }
            } else {
                defaultInstance = (C23639) c17310.m39272();
            }
            this.f7134 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f7136 = null;
        }
        return this.f7134;
    }
}
