package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14435 extends AbstractC2982 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C15722 f44242;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f44243;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C14311 f44244;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C5969 f44245;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public List f44246;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15722 f44247;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C1009 f44248;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f44249;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f44250;

    public C14435(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f44246 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m34461();
            m34462();
            m34460();
        }
    }

    public /* synthetic */ C14435(int i) {
        this();
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC2982 clear() {
        m34464();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m34464();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m34464();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m34464();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m34464();
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
        C9766 c9766 = C10702.f32227;
        c9766.m24773(C23608.class, C14435.class);
        return c9766;
    }

    public C14435() {
        this.f44246 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m34461();
            m34462();
            m34460();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m34464() {
        super.clear();
        this.f44250 = 0;
        this.f44243 = false;
        this.f44245 = null;
        C15722 c15722 = this.f44247;
        if (c15722 != null) {
            c15722.m37102();
            this.f44247 = null;
        }
        this.f44249 = false;
        this.f44248 = null;
        C15722 c15723 = this.f44242;
        if (c15723 != null) {
            c15723.m37102();
            this.f44242 = null;
        }
        C14311 c14311 = this.f44244;
        if (c14311 == null) {
            this.f44246 = Collections.EMPTY_LIST;
        } else {
            this.f44246 = null;
            c14311.m34169();
        }
        this.f44250 &= -17;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32213;
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C23608.getDefaultInstance();
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C23608.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C23608 c23608BuildPartial = buildPartial();
        if (c23608BuildPartial.isInitialized()) {
            return c23608BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c23608BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C23608 c23608BuildPartial = buildPartial();
        if (c23608BuildPartial.isInitialized()) {
            return c23608BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c23608BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C23608 buildPartial() {
        int i;
        C1009 c1009;
        C5969 c5969;
        C23608 c23608 = new C23608(this);
        C14311 c14311 = this.f44244;
        if (c14311 != null) {
            c23608.f76524 = c14311.m34163();
        } else {
            if ((this.f44250 & 16) != 0) {
                this.f44246 = C20195.unmodifiableList(this.f44246);
                this.f44250 &= -17;
            }
            c23608.f76524 = this.f44246;
        }
        int i2 = this.f44250;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c23608.f76523 = this.f44243;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                C15722 c15722 = this.f44247;
                if (c15722 == null) {
                    c5969 = this.f44245;
                } else {
                    c5969 = (C5969) c15722.m37099();
                }
                c23608.f76526 = c5969;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c23608.f76527 = this.f44249;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                C15722 c15723 = this.f44242;
                if (c15723 == null) {
                    c1009 = this.f44248;
                } else {
                    c1009 = (C1009) c15723.m37099();
                }
                c23608.f76522 = c1009;
                i |= 8;
            }
            c23608.f76528 = i | c23608.f76528;
        }
        onBuilt();
        return c23608;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C23608) {
            m34463((C23608) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C23608) {
            m34463((C23608) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34463(C23608 c23608) {
        C1009 c1009;
        C5969 c5969;
        if (c23608 == C23608.getDefaultInstance()) {
            return;
        }
        if (c23608.m52101()) {
            this.f44243 = c23608.m52099();
            this.f44250 |= 1;
            onChanged();
        }
        if (c23608.m52097()) {
            C5969 c5969M52096 = c23608.m52096();
            C15722 c15722 = this.f44247;
            if (c15722 == null) {
                if ((this.f44250 & 2) == 0 || (c5969 = this.f44245) == null || c5969 == C5969.getDefaultInstance()) {
                    this.f44245 = c5969M52096;
                } else {
                    this.f44250 |= 2;
                    onChanged();
                    ((C0324) m34461().m37104()).m1732(c5969M52096);
                }
            } else {
                c15722.m37098(c5969M52096);
            }
            if (this.f44245 != null) {
                this.f44250 |= 2;
                onChanged();
            }
        }
        if (c23608.m52100()) {
            this.f44249 = c23608.m52098();
            this.f44250 |= 4;
            onChanged();
        }
        if (c23608.m52094()) {
            C1009 c1009M52095 = c23608.m52095();
            C15722 c15723 = this.f44242;
            if (c15723 == null) {
                if ((this.f44250 & 8) == 0 || (c1009 = this.f44248) == null || c1009 == C1009.getDefaultInstance()) {
                    this.f44248 = c1009M52095;
                } else {
                    this.f44250 |= 8;
                    onChanged();
                    ((C5243) m34462().m37104()).m15129(c1009M52095);
                }
            } else {
                c15723.m37098(c1009M52095);
            }
            if (this.f44248 != null) {
                this.f44250 |= 8;
                onChanged();
            }
        }
        if (this.f44244 == null) {
            if (!c23608.f76524.isEmpty()) {
                if (this.f44246.isEmpty()) {
                    this.f44246 = c23608.f76524;
                    this.f44250 &= -17;
                } else {
                    if ((this.f44250 & 16) == 0) {
                        this.f44246 = new ArrayList(this.f44246);
                        this.f44250 |= 16;
                    }
                    this.f44246.addAll(c23608.f76524);
                }
                onChanged();
            }
        } else if (!c23608.f76524.isEmpty()) {
            if (!this.f44244.m34174()) {
                this.f44244.m34161(c23608.f76524);
            } else {
                this.f44244.m34172();
                this.f44244 = null;
                this.f44246 = c23608.f76524;
                this.f44250 &= -17;
                this.f44244 = AbstractC4121.alwaysUseFieldBuilders ? m34460() : null;
            }
        }
        m9115((AbstractC12154) c23608);
        mergeUnknownFields(c23608.getUnknownFields());
        onChanged();
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final C14435 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 8) {
                            this.f44243 = abstractC7297.mo19571();
                            this.f44250 |= 1;
                        } else if (iMo19567 == 18) {
                            abstractC7297.mo19556(m34461().m37104(), c17798);
                            this.f44250 |= 2;
                        } else if (iMo19567 == 24) {
                            this.f44249 = abstractC7297.mo19571();
                            this.f44250 |= 4;
                        } else if (iMo19567 == 34) {
                            abstractC7297.mo19556(m34462().m37104(), c17798);
                            this.f44250 |= 8;
                        } else if (iMo19567 == 7994) {
                            C1529 c1529 = (C1529) abstractC7297.mo19552(C1529.parser(), c17798);
                            C14311 c14311 = this.f44244;
                            if (c14311 != null) {
                                c14311.m34166(c1529);
                            } else {
                                if ((this.f44250 & 16) == 0) {
                                    this.f44246 = new ArrayList(this.f44246);
                                    this.f44250 |= 16;
                                }
                                this.f44246.add(c1529);
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
    @Override // l.AbstractC2982, l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        int i;
        C14311 c14311;
        int iM34167;
        C14311 c14312;
        C1529 c1529;
        C5969 defaultInstance;
        if ((this.f44250 & 2) == 0) {
            i = 0;
            while (true) {
                c14311 = this.f44244;
                if (c14311 == null) {
                    iM34167 = this.f44246.size();
                } else {
                    iM34167 = c14311.m34167();
                }
                if (i < iM34167) {
                    if (!m9116()) {
                        break;
                    }
                    return true;
                }
                c14312 = this.f44244;
                if (c14312 == null) {
                    c1529 = (C1529) this.f44246.get(i);
                } else {
                    c1529 = (C1529) c14312.m34164(i);
                }
                if (!c1529.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C15722 c15722 = this.f44247;
            if (c15722 == null) {
                defaultInstance = this.f44245;
                if (defaultInstance == null) {
                    defaultInstance = C5969.getDefaultInstance();
                }
            } else {
                defaultInstance = (C5969) c15722.m37103();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c14311 = this.f44244;
                    if (c14311 == null) {
                        iM34167 = this.f44246.size();
                    } else {
                        iM34167 = c14311.m34167();
                    }
                    if (i < iM34167) {
                        if (!m9116()) {
                            break;
                        }
                        return true;
                    }
                    c14312 = this.f44244;
                    if (c14312 == null) {
                        c1529 = (C1529) this.f44246.get(i);
                    } else {
                        c1529 = (C1529) c14312.m34164(i);
                    }
                    if (!c1529.isInitialized()) {
                        break;
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C15722 m34461() {
        C5969 defaultInstance;
        C15722 c15722 = this.f44247;
        if (c15722 == null) {
            if (c15722 == null) {
                defaultInstance = this.f44245;
                if (defaultInstance == null) {
                    defaultInstance = C5969.getDefaultInstance();
                }
            } else {
                defaultInstance = (C5969) c15722.m37103();
            }
            this.f44247 = new C15722(defaultInstance, getParentForChildren(), isClean());
            this.f44245 = null;
        }
        return this.f44247;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C15722 m34462() {
        C1009 defaultInstance;
        C15722 c15722 = this.f44242;
        if (c15722 == null) {
            if (c15722 == null) {
                defaultInstance = this.f44248;
                if (defaultInstance == null) {
                    defaultInstance = C1009.getDefaultInstance();
                }
            } else {
                defaultInstance = (C1009) c15722.m37103();
            }
            this.f44242 = new C15722(defaultInstance, getParentForChildren(), isClean());
            this.f44248 = null;
        }
        return this.f44242;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C14311 m34460() {
        if (this.f44244 == null) {
            this.f44244 = new C14311(this.f44246, (this.f44250 & 16) != 0, getParentForChildren(), isClean());
            this.f44246 = null;
        }
        return this.f44244;
    }
}
