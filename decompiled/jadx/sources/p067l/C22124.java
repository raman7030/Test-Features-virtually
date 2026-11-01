package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22124 extends AbstractC5202 {

    /* JADX INFO: renamed from: ۗ */
    public C17310 f69994;

    /* JADX INFO: renamed from: ۙ */
    public List f69995;

    /* JADX INFO: renamed from: ۛ */
    public int f69996;

    /* JADX INFO: renamed from: ۤ */
    public List f69997;

    /* JADX INFO: renamed from: ۫ */
    public C15969 f69998;

    /* JADX INFO: renamed from: ۬ */
    public C8041 f69999;

    /* JADX INFO: renamed from: ᩶ */
    public C15969 f70000;

    /* JADX INFO: renamed from: ᩹ */
    public int f70001;

    public C22124(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        List list = Collections.EMPTY_LIST;
        this.f69997 = list;
        this.f69995 = list;
        this.f69996 = 1;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m49911();
            m49913();
            m49912();
        }
    }

    public /* synthetic */ C22124(int i) {
        this();
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC5202 clear() {
        m49915();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m49915();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m49915();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m49915();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m49915();
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
        C11650 c11650 = C12539.f35243;
        c11650.m26787(C20112.class, C22124.class);
        return c11650;
    }

    public C22124() {
        List list = Collections.EMPTY_LIST;
        this.f69997 = list;
        this.f69995 = list;
        this.f69996 = 1;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m49911();
            m49913();
            m49912();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m49915() {
        super.clear();
        this.f70001 = 0;
        C15969 c15969 = this.f69998;
        if (c15969 == null) {
            this.f69997 = Collections.EMPTY_LIST;
        } else {
            this.f69997 = null;
            c15969.m36302();
        }
        this.f70001 &= -2;
        C15969 c159610 = this.f70000;
        if (c159610 == null) {
            this.f69995 = Collections.EMPTY_LIST;
        } else {
            this.f69995 = null;
            c159610.m36302();
        }
        this.f70001 &= -3;
        this.f69999 = null;
        C17310 c17310 = this.f69994;
        if (c17310 != null) {
            c17310.m39271();
            this.f69994 = null;
        }
        this.f69996 = 1;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35225;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C20112.getDefaultInstance();
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C20112.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C20112 c20112BuildPartial = buildPartial();
        if (c20112BuildPartial.isInitialized()) {
            return c20112BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c20112BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C20112 c20112BuildPartial = buildPartial();
        if (c20112BuildPartial.isInitialized()) {
            return c20112BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c20112BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C20112 buildPartial() {
        C8041 c8041;
        C20112 c20112 = new C20112(this);
        C15969 c15969 = this.f69998;
        int i = 1;
        if (c15969 != null) {
            c20112.f62220 = c15969.m36296();
        } else {
            if ((this.f70001 & 1) != 0) {
                this.f69997 = C21562.unmodifiableList(this.f69997);
                this.f70001 &= -2;
            }
            c20112.f62220 = this.f69997;
        }
        C15969 c159610 = this.f70000;
        if (c159610 != null) {
            c20112.f62221 = c159610.m36296();
        } else {
            if ((this.f70001 & 2) != 0) {
                this.f69995 = C21562.unmodifiableList(this.f69995);
                this.f70001 &= -3;
            }
            c20112.f62221 = this.f69995;
        }
        int i2 = this.f70001;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                C17310 c17310 = this.f69994;
                if (c17310 == null) {
                    c8041 = this.f69999;
                } else {
                    c8041 = (C8041) c17310.m39268();
                }
                c20112.f62218 = c8041;
            } else {
                i = 0;
            }
            if ((i2 & 8) != 0) {
                c20112.f62219 = this.f69996;
                i |= 2;
            }
            c20112.f62222 = i | c20112.f62222;
        }
        onBuilt();
        return c20112;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C20112) {
            m49914((C20112) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C20112) {
            m49914((C20112) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49914(C20112 c20112) {
        C8041 c8041;
        if (c20112 == C20112.getDefaultInstance()) {
            return;
        }
        if (this.f69998 == null) {
            if (!c20112.f62220.isEmpty()) {
                if (this.f69997.isEmpty()) {
                    this.f69997 = c20112.f62220;
                    this.f70001 &= -2;
                } else {
                    if ((this.f70001 & 1) == 0) {
                        this.f69997 = new ArrayList(this.f69997);
                        this.f70001 |= 1;
                    }
                    this.f69997.addAll(c20112.f62220);
                }
                onChanged();
            }
        } else if (!c20112.f62220.isEmpty()) {
            if (!this.f69998.m36307()) {
                this.f69998.m36294(c20112.f62220);
            } else {
                this.f69998.m36305();
                this.f69998 = null;
                this.f69997 = c20112.f62220;
                this.f70001 &= -2;
                this.f69998 = AbstractC6285.alwaysUseFieldBuilders ? m49911() : null;
            }
        }
        if (this.f70000 == null) {
            if (!c20112.f62221.isEmpty()) {
                if (this.f69995.isEmpty()) {
                    this.f69995 = c20112.f62221;
                    this.f70001 &= -3;
                } else {
                    if ((this.f70001 & 2) == 0) {
                        this.f69995 = new ArrayList(this.f69995);
                        this.f70001 |= 2;
                    }
                    this.f69995.addAll(c20112.f62221);
                }
                onChanged();
            }
        } else if (!c20112.f62221.isEmpty()) {
            if (!this.f70000.m36307()) {
                this.f70000.m36294(c20112.f62221);
            } else {
                this.f70000.m36305();
                this.f70000 = null;
                this.f69995 = c20112.f62221;
                this.f70001 &= -3;
                this.f70000 = AbstractC6285.alwaysUseFieldBuilders ? m49913() : null;
            }
        }
        if (c20112.m45550()) {
            C8041 c8041M45552 = c20112.m45552();
            C17310 c17310 = this.f69994;
            if (c17310 == null) {
                if ((this.f70001 & 4) == 0 || (c8041 = this.f69999) == null || c8041 == C8041.getDefaultInstance()) {
                    this.f69999 = c8041M45552;
                } else {
                    this.f70001 |= 4;
                    onChanged();
                    ((C2676) m49912().m39273()).m4130(c8041M45552);
                }
            } else {
                c17310.m39267(c8041M45552);
            }
            if (this.f69999 != null) {
                this.f70001 |= 4;
                onChanged();
            }
        }
        if (c20112.m45551()) {
            EnumC6030 enumC6030M45553 = c20112.m45553();
            enumC6030M45553.getClass();
            this.f70001 |= 8;
            this.f69996 = enumC6030M45553.getNumber();
            onChanged();
        }
        m11167((AbstractC13919) c20112);
        mergeUnknownFields(c20112.getUnknownFields());
        onChanged();
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final C22124 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 18) {
                            C17428 c17428 = (C17428) abstractC9303.mo21520(C17428.parser(), c19283);
                            C15969 c15969 = this.f70000;
                            if (c15969 != null) {
                                c15969.m36299(c17428);
                            } else {
                                if ((this.f70001 & 2) == 0) {
                                    this.f69995 = new ArrayList(this.f69995);
                                    this.f70001 |= 2;
                                }
                                this.f69995.add(c17428);
                            }
                        } else if (iMo21535 == 24) {
                            int iMo21528 = abstractC9303.mo21528();
                            if (EnumC6030.m13536(iMo21528) == null) {
                                mergeUnknownVarintField(3, iMo21528);
                            } else {
                                this.f69996 = iMo21528;
                                this.f70001 |= 8;
                            }
                        } else if (iMo21535 == 402) {
                            abstractC9303.mo21524(m49912().m39273(), c19283);
                            this.f70001 |= 4;
                        } else if (iMo21535 == 7994) {
                            C3821 c3821 = (C3821) abstractC9303.mo21520(C3821.parser(), c19283);
                            C15969 c159610 = this.f69998;
                            if (c159610 != null) {
                                c159610.m36299(c3821);
                            } else {
                                if ((this.f70001 & 1) == 0) {
                                    this.f69997 = new ArrayList(this.f69997);
                                    this.f70001 |= 1;
                                }
                                this.f69997.add(c3821);
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

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[RETURN] */
    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        int iM36300;
        C8041 defaultInstance;
        C3821 c3821;
        int i = 0;
        while (true) {
            C15969 c15969 = this.f69998;
            if (c15969 == null) {
                iM36300 = this.f69997.size();
            } else {
                iM36300 = c15969.m36300();
            }
            if (i < iM36300) {
                C15969 c159610 = this.f69998;
                if (c159610 == null) {
                    c3821 = (C3821) this.f69997.get(i);
                } else {
                    c3821 = (C3821) c159610.m36297(i);
                }
                if (!c3821.isInitialized()) {
                    break;
                }
                i++;
            } else {
                if ((this.f70001 & 4) == 0) {
                    if (!m11168()) {
                        break;
                    }
                    return true;
                }
                C17310 c17310 = this.f69994;
                if (c17310 == null) {
                    defaultInstance = this.f69999;
                    if (defaultInstance == null) {
                        defaultInstance = C8041.getDefaultInstance();
                    }
                } else {
                    defaultInstance = (C8041) c17310.m39272();
                }
                if (!defaultInstance.isInitialized()) {
                    break;
                }
                if (!m11168()) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ */
    private C15969 m49911() {
        if (this.f69998 == null) {
            this.f69998 = new C15969(this.f69997, (this.f70001 & 1) != 0, getParentForChildren(), isClean());
            this.f69997 = null;
        }
        return this.f69998;
    }

    /* JADX INFO: renamed from: ᩳ */
    private C15969 m49913() {
        if (this.f70000 == null) {
            this.f70000 = new C15969(this.f69995, (this.f70001 & 2) != 0, getParentForChildren(), isClean());
            this.f69995 = null;
        }
        return this.f70000;
    }

    /* JADX INFO: renamed from: ܿ */
    private C17310 m49912() {
        C8041 defaultInstance;
        C17310 c17310 = this.f69994;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f69999;
                if (defaultInstance == null) {
                    defaultInstance = C8041.getDefaultInstance();
                }
            } else {
                defaultInstance = (C8041) c17310.m39272();
            }
            this.f69994 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f69999 = null;
        }
        return this.f69994;
    }
}
