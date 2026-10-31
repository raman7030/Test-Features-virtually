package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20787 extends AbstractC2982 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C15722 f67311;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f67312;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f67313;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f67314;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14311 f67315;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C5969 f67316;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14311 f67317;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f67318;

    public C20787(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        List list = Collections.EMPTY_LIST;
        this.f67314 = list;
        this.f67312 = list;
        this.f67313 = 1;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m47583();
            m47585();
            m47584();
        }
    }

    public /* synthetic */ C20787(int i) {
        this();
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC2982 clear() {
        m47587();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m47587();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m47587();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m47587();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m47587();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32268;
        c9766.m24773(C18670.class, C20787.class);
        return c9766;
    }

    public C20787() {
        List list = Collections.EMPTY_LIST;
        this.f67314 = list;
        this.f67312 = list;
        this.f67313 = 1;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m47583();
            m47585();
            m47584();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m47587() {
        super.clear();
        this.f67318 = 0;
        C14311 c14311 = this.f67315;
        if (c14311 == null) {
            this.f67314 = Collections.EMPTY_LIST;
        } else {
            this.f67314 = null;
            c14311.m34169();
        }
        this.f67318 &= -2;
        C14311 c14312 = this.f67317;
        if (c14312 == null) {
            this.f67312 = Collections.EMPTY_LIST;
        } else {
            this.f67312 = null;
            c14312.m34169();
        }
        this.f67318 &= -3;
        this.f67316 = null;
        C15722 c15722 = this.f67311;
        if (c15722 != null) {
            c15722.m37102();
            this.f67311 = null;
        }
        this.f67313 = 1;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32250;
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C18670.getDefaultInstance();
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C18670.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C18670 c18670BuildPartial = buildPartial();
        if (c18670BuildPartial.isInitialized()) {
            return c18670BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c18670BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C18670 c18670BuildPartial = buildPartial();
        if (c18670BuildPartial.isInitialized()) {
            return c18670BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c18670BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C18670 buildPartial() {
        C5969 c5969;
        C18670 c18670 = new C18670(this);
        C14311 c14311 = this.f67315;
        int i = 1;
        if (c14311 != null) {
            c18670.f58997 = c14311.m34163();
        } else {
            if ((this.f67318 & 1) != 0) {
                this.f67314 = C20195.unmodifiableList(this.f67314);
                this.f67318 &= -2;
            }
            c18670.f58997 = this.f67314;
        }
        C14311 c14312 = this.f67317;
        if (c14312 != null) {
            c18670.f58998 = c14312.m34163();
        } else {
            if ((this.f67318 & 2) != 0) {
                this.f67312 = C20195.unmodifiableList(this.f67312);
                this.f67318 &= -3;
            }
            c18670.f58998 = this.f67312;
        }
        int i2 = this.f67318;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                C15722 c15722 = this.f67311;
                if (c15722 == null) {
                    c5969 = this.f67316;
                } else {
                    c5969 = (C5969) c15722.m37099();
                }
                c18670.f58995 = c5969;
            } else {
                i = 0;
            }
            if ((i2 & 8) != 0) {
                c18670.f58996 = this.f67313;
                i |= 2;
            }
            c18670.f58999 = i | c18670.f58999;
        }
        onBuilt();
        return c18670;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C18670) {
            m47586((C18670) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C18670) {
            m47586((C18670) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47586(C18670 c18670) {
        C5969 c5969;
        if (c18670 == C18670.getDefaultInstance()) {
            return;
        }
        if (this.f67315 == null) {
            if (!c18670.f58997.isEmpty()) {
                if (this.f67314.isEmpty()) {
                    this.f67314 = c18670.f58997;
                    this.f67318 &= -2;
                } else {
                    if ((this.f67318 & 1) == 0) {
                        this.f67314 = new ArrayList(this.f67314);
                        this.f67318 |= 1;
                    }
                    this.f67314.addAll(c18670.f58997);
                }
                onChanged();
            }
        } else if (!c18670.f58997.isEmpty()) {
            if (!this.f67315.m34174()) {
                this.f67315.m34161(c18670.f58997);
            } else {
                this.f67315.m34172();
                this.f67315 = null;
                this.f67314 = c18670.f58997;
                this.f67318 &= -2;
                this.f67315 = AbstractC4121.alwaysUseFieldBuilders ? m47583() : null;
            }
        }
        if (this.f67317 == null) {
            if (!c18670.f58998.isEmpty()) {
                if (this.f67312.isEmpty()) {
                    this.f67312 = c18670.f58998;
                    this.f67318 &= -3;
                } else {
                    if ((this.f67318 & 2) == 0) {
                        this.f67312 = new ArrayList(this.f67312);
                        this.f67318 |= 2;
                    }
                    this.f67312.addAll(c18670.f58998);
                }
                onChanged();
            }
        } else if (!c18670.f58998.isEmpty()) {
            if (!this.f67317.m34174()) {
                this.f67317.m34161(c18670.f58998);
            } else {
                this.f67317.m34172();
                this.f67317 = null;
                this.f67312 = c18670.f58998;
                this.f67318 &= -3;
                this.f67317 = AbstractC4121.alwaysUseFieldBuilders ? m47585() : null;
            }
        }
        if (c18670.m43284()) {
            C5969 c5969M43286 = c18670.m43286();
            C15722 c15722 = this.f67311;
            if (c15722 == null) {
                if ((this.f67318 & 4) == 0 || (c5969 = this.f67316) == null || c5969 == C5969.getDefaultInstance()) {
                    this.f67316 = c5969M43286;
                } else {
                    this.f67318 |= 4;
                    onChanged();
                    ((C0324) m47584().m37104()).m1732(c5969M43286);
                }
            } else {
                c15722.m37098(c5969M43286);
            }
            if (this.f67316 != null) {
                this.f67318 |= 4;
                onChanged();
            }
        }
        if (c18670.m43285()) {
            EnumC3853 enumC3853M43287 = c18670.m43287();
            enumC3853M43287.getClass();
            this.f67318 |= 8;
            this.f67313 = enumC3853M43287.getNumber();
            onChanged();
        }
        m9115((AbstractC12154) c18670);
        mergeUnknownFields(c18670.getUnknownFields());
        onChanged();
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final C20787 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 18) {
                            C15846 c15846 = (C15846) abstractC7297.mo19552(C15846.parser(), c17798);
                            C14311 c14311 = this.f67317;
                            if (c14311 != null) {
                                c14311.m34166(c15846);
                            } else {
                                if ((this.f67318 & 2) == 0) {
                                    this.f67312 = new ArrayList(this.f67312);
                                    this.f67318 |= 2;
                                }
                                this.f67312.add(c15846);
                            }
                        } else if (iMo19567 == 24) {
                            int iMo19560 = abstractC7297.mo19560();
                            if (EnumC3853.m11600(iMo19560) == null) {
                                mergeUnknownVarintField(3, iMo19560);
                            } else {
                                this.f67313 = iMo19560;
                                this.f67318 |= 8;
                            }
                        } else if (iMo19567 == 402) {
                            abstractC7297.mo19556(m47584().m37104(), c17798);
                            this.f67318 |= 4;
                        } else if (iMo19567 == 7994) {
                            C1529 c1529 = (C1529) abstractC7297.mo19552(C1529.parser(), c17798);
                            C14311 c14312 = this.f67315;
                            if (c14312 != null) {
                                c14312.m34166(c1529);
                            } else {
                                if ((this.f67318 & 1) == 0) {
                                    this.f67314 = new ArrayList(this.f67314);
                                    this.f67318 |= 1;
                                }
                                this.f67314.add(c1529);
                            }
                        } else if (!parseUnknownField(abstractC7297, c17798, iMo19567)) {
                        }
                    }
                    z = true;
                } catch (C2025 e) {
                    throw e.m6586();
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
    @Override // l.AbstractC2982, l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        int iM34167;
        C5969 defaultInstance;
        C1529 c1529;
        int i = 0;
        while (true) {
            C14311 c14311 = this.f67315;
            if (c14311 == null) {
                iM34167 = this.f67314.size();
            } else {
                iM34167 = c14311.m34167();
            }
            if (i < iM34167) {
                C14311 c14312 = this.f67315;
                if (c14312 == null) {
                    c1529 = (C1529) this.f67314.get(i);
                } else {
                    c1529 = (C1529) c14312.m34164(i);
                }
                if (!c1529.isInitialized()) {
                    break;
                }
                i++;
            } else {
                if ((this.f67318 & 4) == 0) {
                    if (!m9116()) {
                        break;
                    }
                    return true;
                }
                C15722 c15722 = this.f67311;
                if (c15722 == null) {
                    defaultInstance = this.f67316;
                    if (defaultInstance == null) {
                        defaultInstance = C5969.getDefaultInstance();
                    }
                } else {
                    defaultInstance = (C5969) c15722.m37103();
                }
                if (!defaultInstance.isInitialized()) {
                    break;
                }
                if (!m9116()) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C14311 m47583() {
        if (this.f67315 == null) {
            this.f67315 = new C14311(this.f67314, (this.f67318 & 1) != 0, getParentForChildren(), isClean());
            this.f67314 = null;
        }
        return this.f67315;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C14311 m47585() {
        if (this.f67317 == null) {
            this.f67317 = new C14311(this.f67312, (this.f67318 & 2) != 0, getParentForChildren(), isClean());
            this.f67312 = null;
        }
        return this.f67317;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C15722 m47584() {
        C5969 defaultInstance;
        C15722 c15722 = this.f67311;
        if (c15722 == null) {
            if (c15722 == null) {
                defaultInstance = this.f67316;
                if (defaultInstance == null) {
                    defaultInstance = C5969.getDefaultInstance();
                }
            } else {
                defaultInstance = (C5969) c15722.m37103();
            }
            this.f67311 = new C15722(defaultInstance, getParentForChildren(), isClean());
            this.f67316 = null;
        }
        return this.f67311;
    }
}
