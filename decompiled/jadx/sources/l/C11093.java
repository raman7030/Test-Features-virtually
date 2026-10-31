package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۧܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11093 extends AbstractC2982 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C15722 f33291;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f33292;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f33293;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f33294;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C14311 f33295;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f33296;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C5969 f33297;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f33298;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f33299;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public List f33300;

    public C11093(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f33300 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m27523();
            m27522();
        }
    }

    public /* synthetic */ C11093(int i) {
        this();
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC2982 clear() {
        m27526();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m27526();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m27526();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m27526();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m27526();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m27525(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m27525(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m27525(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m27525(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32231;
        c9766.m24773(C16736.class, C11093.class);
        return c9766;
    }

    public C11093() {
        this.f33300 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m27523();
            m27522();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m27526() {
        super.clear();
        this.f33299 = 0;
        this.f33294 = false;
        this.f33293 = false;
        this.f33292 = false;
        this.f33296 = false;
        this.f33298 = false;
        this.f33297 = null;
        C15722 c15722 = this.f33291;
        if (c15722 != null) {
            c15722.m37102();
            this.f33291 = null;
        }
        C14311 c14311 = this.f33295;
        if (c14311 == null) {
            this.f33300 = Collections.EMPTY_LIST;
        } else {
            this.f33300 = null;
            c14311.m34169();
        }
        this.f33299 &= -65;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32274;
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C16736.getDefaultInstance();
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C16736.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C16736 c16736BuildPartial = buildPartial();
        if (c16736BuildPartial.isInitialized()) {
            return c16736BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c16736BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C16736 c16736BuildPartial = buildPartial();
        if (c16736BuildPartial.isInitialized()) {
            return c16736BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c16736BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C16736 buildPartial() {
        int i;
        C5969 c5969;
        C16736 c16736 = new C16736(this);
        C14311 c14311 = this.f33295;
        if (c14311 != null) {
            c16736.f51377 = c14311.m34163();
        } else {
            if ((this.f33299 & 64) != 0) {
                this.f33300 = C20195.unmodifiableList(this.f33300);
                this.f33299 &= -65;
            }
            c16736.f51377 = this.f33300;
        }
        int i2 = this.f33299;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c16736.f51376 = this.f33294;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c16736.f51375 = this.f33293;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c16736.f51374 = this.f33292;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c16736.f51379 = this.f33296;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c16736.f51380 = this.f33298;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                C15722 c15722 = this.f33291;
                if (c15722 == null) {
                    c5969 = this.f33297;
                } else {
                    c5969 = (C5969) c15722.m37099();
                }
                c16736.f51373 = c5969;
                i |= 32;
            }
            c16736.f51381 = i | c16736.f51381;
        }
        onBuilt();
        return c16736;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C16736) {
            m27524((C16736) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C16736) {
            m27524((C16736) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11093 m27524(C16736 c16736) {
        C5969 c5969;
        if (c16736 == C16736.getDefaultInstance()) {
            return this;
        }
        if (c16736.m39378()) {
            this.f33294 = c16736.m39380();
            this.f33299 |= 1;
            onChanged();
        }
        if (c16736.m39382()) {
            this.f33293 = c16736.m39381();
            this.f33299 |= 2;
            onChanged();
        }
        if (c16736.m39371()) {
            this.f33292 = c16736.m39377();
            this.f33299 |= 4;
            onChanged();
        }
        if (c16736.m39376()) {
            this.f33296 = c16736.m39374();
            this.f33299 |= 8;
            onChanged();
        }
        if (c16736.m39375()) {
            this.f33298 = c16736.m39379();
            this.f33299 |= 16;
            onChanged();
        }
        if (c16736.m39372()) {
            C5969 c5969M39373 = c16736.m39373();
            C15722 c15722 = this.f33291;
            if (c15722 == null) {
                if ((this.f33299 & 32) == 0 || (c5969 = this.f33297) == null || c5969 == C5969.getDefaultInstance()) {
                    this.f33297 = c5969M39373;
                } else {
                    this.f33299 |= 32;
                    onChanged();
                    ((C0324) m27523().m37104()).m1732(c5969M39373);
                }
            } else {
                c15722.m37098(c5969M39373);
            }
            if (this.f33297 != null) {
                this.f33299 |= 32;
                onChanged();
            }
        }
        if (this.f33295 == null) {
            if (!c16736.f51377.isEmpty()) {
                if (this.f33300.isEmpty()) {
                    this.f33300 = c16736.f51377;
                    this.f33299 &= -65;
                } else {
                    if ((this.f33299 & 64) == 0) {
                        this.f33300 = new ArrayList(this.f33300);
                        this.f33299 |= 64;
                    }
                    this.f33300.addAll(c16736.f51377);
                }
                onChanged();
            }
        } else if (!c16736.f51377.isEmpty()) {
            if (!this.f33295.m34174()) {
                this.f33295.m34161(c16736.f51377);
            } else {
                this.f33295.m34172();
                this.f33295 = null;
                this.f33300 = c16736.f51377;
                this.f33299 &= -65;
                this.f33295 = AbstractC4121.alwaysUseFieldBuilders ? m27522() : null;
            }
        }
        m9115((AbstractC12154) c16736);
        mergeUnknownFields(c16736.getUnknownFields());
        onChanged();
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27525(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 8) {
                            this.f33294 = abstractC7297.mo19571();
                            this.f33299 |= 1;
                        } else if (iMo19567 == 16) {
                            this.f33293 = abstractC7297.mo19571();
                            this.f33299 |= 2;
                        } else if (iMo19567 == 24) {
                            this.f33292 = abstractC7297.mo19571();
                            this.f33299 |= 4;
                        } else if (iMo19567 == 56) {
                            this.f33296 = abstractC7297.mo19571();
                            this.f33299 |= 8;
                        } else if (iMo19567 == 88) {
                            this.f33298 = abstractC7297.mo19571();
                            this.f33299 |= 16;
                        } else if (iMo19567 == 98) {
                            abstractC7297.mo19556(m27523().m37104(), c17798);
                            this.f33299 |= 32;
                        } else if (iMo19567 == 7994) {
                            C1529 c1529 = (C1529) abstractC7297.mo19552(C1529.parser(), c17798);
                            C14311 c14311 = this.f33295;
                            if (c14311 != null) {
                                c14311.m34166(c1529);
                            } else {
                                if ((this.f33299 & 64) == 0) {
                                    this.f33300 = new ArrayList(this.f33300);
                                    this.f33299 |= 64;
                                }
                                this.f33300.add(c1529);
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
        if ((this.f33299 & 32) == 0) {
            i = 0;
            while (true) {
                c14311 = this.f33295;
                if (c14311 == null) {
                    iM34167 = this.f33300.size();
                } else {
                    iM34167 = c14311.m34167();
                }
                if (i < iM34167) {
                    if (!m9116()) {
                        break;
                    }
                    return true;
                }
                c14312 = this.f33295;
                if (c14312 == null) {
                    c1529 = (C1529) this.f33300.get(i);
                } else {
                    c1529 = (C1529) c14312.m34164(i);
                }
                if (!c1529.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C15722 c15722 = this.f33291;
            if (c15722 == null) {
                defaultInstance = this.f33297;
                if (defaultInstance == null) {
                    defaultInstance = C5969.getDefaultInstance();
                }
            } else {
                defaultInstance = (C5969) c15722.m37103();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c14311 = this.f33295;
                    if (c14311 == null) {
                        iM34167 = this.f33300.size();
                    } else {
                        iM34167 = c14311.m34167();
                    }
                    if (i < iM34167) {
                        if (!m9116()) {
                            break;
                        }
                        return true;
                    }
                    c14312 = this.f33295;
                    if (c14312 == null) {
                        c1529 = (C1529) this.f33300.get(i);
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

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m27527() {
        this.f33299 &= -33;
        this.f33297 = null;
        C15722 c15722 = this.f33291;
        if (c15722 != null) {
            c15722.m37102();
            this.f33291 = null;
        }
        onChanged();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C15722 m27523() {
        C5969 defaultInstance;
        C15722 c15722 = this.f33291;
        if (c15722 == null) {
            if (c15722 == null) {
                defaultInstance = this.f33297;
                if (defaultInstance == null) {
                    defaultInstance = C5969.getDefaultInstance();
                }
            } else {
                defaultInstance = (C5969) c15722.m37103();
            }
            this.f33291 = new C15722(defaultInstance, getParentForChildren(), isClean());
            this.f33297 = null;
        }
        return this.f33291;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C14311 m27522() {
        if (this.f33295 == null) {
            this.f33295 = new C14311(this.f33300, (this.f33299 & 64) != 0, getParentForChildren(), isClean());
            this.f33300 = null;
        }
        return this.f33295;
    }
}
