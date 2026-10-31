package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۟᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7711 extends AbstractC2982 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f23817;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f23818;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public List f23819;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14311 f23820;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C5969 f23821;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C15722 f23822;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f23823;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f23824;

    public C7711(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f23819 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m20627();
            m20626();
        }
    }

    public /* synthetic */ C7711(int i) {
        this();
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC2982 clear() {
        m20629();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m20629();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m20629();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m20629();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m20629();
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
        C9766 c9766 = C10702.f32223;
        c9766.m24773(C1736.class, C7711.class);
        return c9766;
    }

    public C7711() {
        this.f23819 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m20627();
            m20626();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m20629() {
        super.clear();
        this.f23823 = 0;
        this.f23824 = false;
        this.f23817 = false;
        this.f23818 = false;
        this.f23821 = null;
        C15722 c15722 = this.f23822;
        if (c15722 != null) {
            c15722.m37102();
            this.f23822 = null;
        }
        C14311 c14311 = this.f23820;
        if (c14311 == null) {
            this.f23819 = Collections.EMPTY_LIST;
        } else {
            this.f23819 = null;
            c14311.m34169();
        }
        this.f23823 &= -17;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32219;
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C1736.getDefaultInstance();
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C1736.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C1736 c1736BuildPartial = buildPartial();
        if (c1736BuildPartial.isInitialized()) {
            return c1736BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c1736BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C1736 c1736BuildPartial = buildPartial();
        if (c1736BuildPartial.isInitialized()) {
            return c1736BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c1736BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C1736 buildPartial() {
        int i;
        C5969 c5969;
        C1736 c1736 = new C1736(this);
        C14311 c14311 = this.f23820;
        if (c14311 != null) {
            c1736.f6006 = c14311.m34163();
        } else {
            if ((this.f23823 & 16) != 0) {
                this.f23819 = C20195.unmodifiableList(this.f23819);
                this.f23823 &= -17;
            }
            c1736.f6006 = this.f23819;
        }
        int i2 = this.f23823;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c1736.f6010 = this.f23824;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c1736.f6004 = this.f23817;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c1736.f6005 = this.f23818;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                C15722 c15722 = this.f23822;
                if (c15722 == null) {
                    c5969 = this.f23821;
                } else {
                    c5969 = (C5969) c15722.m37099();
                }
                c1736.f6008 = c5969;
                i |= 8;
            }
            c1736.f6009 = i | c1736.f6009;
        }
        onBuilt();
        return c1736;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C1736) {
            m20628((C1736) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C1736) {
            m20628((C1736) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20628(C1736 c1736) {
        C5969 c5969;
        if (c1736 == C1736.getDefaultInstance()) {
            return;
        }
        if (c1736.m5808()) {
            this.f23824 = c1736.m5806();
            this.f23823 |= 1;
            onChanged();
        }
        if (c1736.m5809()) {
            this.f23817 = c1736.m5807();
            this.f23823 |= 2;
            onChanged();
        }
        if (c1736.m5802()) {
            this.f23818 = c1736.m5803();
            this.f23823 |= 4;
            onChanged();
        }
        if (c1736.m5805()) {
            C5969 c5969M5804 = c1736.m5804();
            C15722 c15722 = this.f23822;
            if (c15722 == null) {
                if ((this.f23823 & 8) == 0 || (c5969 = this.f23821) == null || c5969 == C5969.getDefaultInstance()) {
                    this.f23821 = c5969M5804;
                } else {
                    this.f23823 |= 8;
                    onChanged();
                    ((C0324) m20627().m37104()).m1732(c5969M5804);
                }
            } else {
                c15722.m37098(c5969M5804);
            }
            if (this.f23821 != null) {
                this.f23823 |= 8;
                onChanged();
            }
        }
        if (this.f23820 == null) {
            if (!c1736.f6006.isEmpty()) {
                if (this.f23819.isEmpty()) {
                    this.f23819 = c1736.f6006;
                    this.f23823 &= -17;
                } else {
                    if ((this.f23823 & 16) == 0) {
                        this.f23819 = new ArrayList(this.f23819);
                        this.f23823 |= 16;
                    }
                    this.f23819.addAll(c1736.f6006);
                }
                onChanged();
            }
        } else if (!c1736.f6006.isEmpty()) {
            if (!this.f23820.m34174()) {
                this.f23820.m34161(c1736.f6006);
            } else {
                this.f23820.m34172();
                this.f23820 = null;
                this.f23819 = c1736.f6006;
                this.f23823 &= -17;
                this.f23820 = AbstractC4121.alwaysUseFieldBuilders ? m20626() : null;
            }
        }
        m9115((AbstractC12154) c1736);
        mergeUnknownFields(c1736.getUnknownFields());
        onChanged();
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final C7711 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 16) {
                            this.f23824 = abstractC7297.mo19571();
                            this.f23823 |= 1;
                        } else if (iMo19567 == 24) {
                            this.f23817 = abstractC7297.mo19571();
                            this.f23823 |= 2;
                        } else if (iMo19567 == 48) {
                            this.f23818 = abstractC7297.mo19571();
                            this.f23823 |= 4;
                        } else if (iMo19567 == 58) {
                            abstractC7297.mo19556(m20627().m37104(), c17798);
                            this.f23823 |= 8;
                        } else if (iMo19567 == 7994) {
                            C1529 c1529 = (C1529) abstractC7297.mo19552(C1529.parser(), c17798);
                            C14311 c14311 = this.f23820;
                            if (c14311 != null) {
                                c14311.m34166(c1529);
                            } else {
                                if ((this.f23823 & 16) == 0) {
                                    this.f23819 = new ArrayList(this.f23819);
                                    this.f23823 = 16 | this.f23823;
                                }
                                this.f23819.add(c1529);
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
        if ((this.f23823 & 8) == 0) {
            i = 0;
            while (true) {
                c14311 = this.f23820;
                if (c14311 == null) {
                    iM34167 = this.f23819.size();
                } else {
                    iM34167 = c14311.m34167();
                }
                if (i < iM34167) {
                    if (!m9116()) {
                        break;
                    }
                    return true;
                }
                c14312 = this.f23820;
                if (c14312 == null) {
                    c1529 = (C1529) this.f23819.get(i);
                } else {
                    c1529 = (C1529) c14312.m34164(i);
                }
                if (!c1529.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C15722 c15722 = this.f23822;
            if (c15722 == null) {
                defaultInstance = this.f23821;
                if (defaultInstance == null) {
                    defaultInstance = C5969.getDefaultInstance();
                }
            } else {
                defaultInstance = (C5969) c15722.m37103();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c14311 = this.f23820;
                    if (c14311 == null) {
                        iM34167 = this.f23819.size();
                    } else {
                        iM34167 = c14311.m34167();
                    }
                    if (i < iM34167) {
                        if (!m9116()) {
                            break;
                        }
                        return true;
                    }
                    c14312 = this.f23820;
                    if (c14312 == null) {
                        c1529 = (C1529) this.f23819.get(i);
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
    private C15722 m20627() {
        C5969 defaultInstance;
        C15722 c15722 = this.f23822;
        if (c15722 == null) {
            if (c15722 == null) {
                defaultInstance = this.f23821;
                if (defaultInstance == null) {
                    defaultInstance = C5969.getDefaultInstance();
                }
            } else {
                defaultInstance = (C5969) c15722.m37103();
            }
            this.f23822 = new C15722(defaultInstance, getParentForChildren(), isClean());
            this.f23821 = null;
        }
        return this.f23822;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C14311 m20626() {
        if (this.f23820 == null) {
            this.f23820 = new C14311(this.f23819, (this.f23823 & 16) != 0, getParentForChildren(), isClean());
            this.f23819 = null;
        }
        return this.f23820;
    }
}
