package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19560 extends AbstractC2982 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C14311 f63226;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5969 f63227;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f63228;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15722 f63229;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f63230;

    public C19560(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f63228 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m44982();
            m44981();
        }
    }

    public /* synthetic */ C19560(int i) {
        this();
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC2982 clear() {
        m44985();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m44985();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m44985();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m44985();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m44985();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m44984(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m44984(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m44984(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m44984(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32263;
        c9766.m24773(C0508.class, C19560.class);
        return c9766;
    }

    public C19560() {
        this.f63228 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m44982();
            m44981();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m44985() {
        super.clear();
        this.f63230 = 0;
        this.f63227 = null;
        C15722 c15722 = this.f63229;
        if (c15722 != null) {
            c15722.m37102();
            this.f63229 = null;
        }
        C14311 c14311 = this.f63226;
        if (c14311 == null) {
            this.f63228 = Collections.EMPTY_LIST;
        } else {
            this.f63228 = null;
            c14311.m34169();
        }
        this.f63230 &= -3;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32261;
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C0508.getDefaultInstance();
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C0508.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C0508 c0508BuildPartial = buildPartial();
        if (c0508BuildPartial.isInitialized()) {
            return c0508BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c0508BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C0508 c0508BuildPartial = buildPartial();
        if (c0508BuildPartial.isInitialized()) {
            return c0508BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c0508BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C0508 buildPartial() {
        C5969 c5969;
        C0508 c0508 = new C0508(this);
        C14311 c14311 = this.f63226;
        if (c14311 != null) {
            c0508.f2136 = c14311.m34163();
        } else {
            if ((this.f63230 & 2) != 0) {
                this.f63228 = C20195.unmodifiableList(this.f63228);
                this.f63230 &= -3;
            }
            c0508.f2136 = this.f63228;
        }
        int i = this.f63230;
        if (i != 0) {
            int i2 = 1;
            if ((i & 1) != 0) {
                C15722 c15722 = this.f63229;
                if (c15722 == null) {
                    c5969 = this.f63227;
                } else {
                    c5969 = (C5969) c15722.m37099();
                }
                c0508.f2138 = c5969;
            } else {
                i2 = 0;
            }
            c0508.f2139 = i2 | c0508.f2139;
        }
        onBuilt();
        return c0508;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C0508) {
            m44983((C0508) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C0508) {
            m44983((C0508) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44983(C0508 c0508) {
        C5969 c5969;
        if (c0508 == C0508.getDefaultInstance()) {
            return;
        }
        if (c0508.m2201()) {
            C5969 c5969M2200 = c0508.m2200();
            C15722 c15722 = this.f63229;
            if (c15722 == null) {
                if ((this.f63230 & 1) == 0 || (c5969 = this.f63227) == null || c5969 == C5969.getDefaultInstance()) {
                    this.f63227 = c5969M2200;
                } else {
                    this.f63230 |= 1;
                    onChanged();
                    ((C0324) m44982().m37104()).m1732(c5969M2200);
                }
            } else {
                c15722.m37098(c5969M2200);
            }
            if (this.f63227 != null) {
                this.f63230 |= 1;
                onChanged();
            }
        }
        if (this.f63226 == null) {
            if (!c0508.f2136.isEmpty()) {
                if (this.f63228.isEmpty()) {
                    this.f63228 = c0508.f2136;
                    this.f63230 &= -3;
                } else {
                    if ((this.f63230 & 2) == 0) {
                        this.f63228 = new ArrayList(this.f63228);
                        this.f63230 |= 2;
                    }
                    this.f63228.addAll(c0508.f2136);
                }
                onChanged();
            }
        } else if (!c0508.f2136.isEmpty()) {
            if (!this.f63226.m34174()) {
                this.f63226.m34161(c0508.f2136);
            } else {
                this.f63226.m34172();
                this.f63226 = null;
                this.f63228 = c0508.f2136;
                this.f63230 &= -3;
                this.f63226 = AbstractC4121.alwaysUseFieldBuilders ? m44981() : null;
            }
        }
        m9115((AbstractC12154) c0508);
        mergeUnknownFields(c0508.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44984(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 10) {
                            abstractC7297.mo19556(m44982().m37104(), c17798);
                            this.f63230 |= 1;
                        } else if (iMo19567 == 7994) {
                            C1529 c1529 = (C1529) abstractC7297.mo19552(C1529.parser(), c17798);
                            C14311 c14311 = this.f63226;
                            if (c14311 != null) {
                                c14311.m34166(c1529);
                            } else {
                                if ((this.f63230 & 2) == 0) {
                                    this.f63228 = new ArrayList(this.f63228);
                                    this.f63230 |= 2;
                                }
                                this.f63228.add(c1529);
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
    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0056 A[EDGE_INSN: B:32:0x0056->B:29:0x0056 BREAK  A[LOOP:0: B:14:0x0022->B:26:0x004d], SYNTHETIC] */
    @Override // l.AbstractC2982, l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        int i;
        C14311 c14311;
        int iM34167;
        C14311 c14312;
        C1529 c1529;
        C5969 defaultInstance;
        if ((this.f63230 & 1) == 0) {
            i = 0;
            while (true) {
                c14311 = this.f63226;
                if (c14311 == null) {
                    iM34167 = this.f63228.size();
                } else {
                    iM34167 = c14311.m34167();
                }
                if (i < iM34167) {
                    if (!m9116()) {
                        break;
                    }
                    return true;
                }
                c14312 = this.f63226;
                if (c14312 == null) {
                    c1529 = (C1529) this.f63228.get(i);
                } else {
                    c1529 = (C1529) c14312.m34164(i);
                }
                if (!c1529.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C15722 c15722 = this.f63229;
            if (c15722 == null) {
                defaultInstance = this.f63227;
                if (defaultInstance == null) {
                    defaultInstance = C5969.getDefaultInstance();
                }
            } else {
                defaultInstance = (C5969) c15722.m37103();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c14311 = this.f63226;
                    if (c14311 == null) {
                        iM34167 = this.f63228.size();
                    } else {
                        iM34167 = c14311.m34167();
                    }
                    if (i < iM34167) {
                        if (!m9116()) {
                            break;
                        }
                        return true;
                    }
                    c14312 = this.f63226;
                    if (c14312 == null) {
                        c1529 = (C1529) this.f63228.get(i);
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
    private C15722 m44982() {
        C5969 defaultInstance;
        C15722 c15722 = this.f63229;
        if (c15722 == null) {
            if (c15722 == null) {
                defaultInstance = this.f63227;
                if (defaultInstance == null) {
                    defaultInstance = C5969.getDefaultInstance();
                }
            } else {
                defaultInstance = (C5969) c15722.m37103();
            }
            this.f63229 = new C15722(defaultInstance, getParentForChildren(), isClean());
            this.f63227 = null;
        }
        return this.f63229;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C14311 m44981() {
        if (this.f63226 == null) {
            this.f63226 = new C14311(this.f63228, (this.f63230 & 2) != 0, getParentForChildren(), isClean());
            this.f63228 = null;
        }
        return this.f63226;
    }
}
