package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21676 extends AbstractC2982 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C5969 f69528;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15722 f69529;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f69530;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C14311 f69531;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f69532;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f69533;

    public C21676(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f69530 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m48942();
            m48941();
        }
    }

    public /* synthetic */ C21676(int i) {
        this();
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC2982 clear() {
        m48945();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m48945();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m48945();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m48945();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m48945();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m48943(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m48943(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m48943(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m48943(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32234;
        c9766.m24773(C22381.class, C21676.class);
        return c9766;
    }

    public C21676() {
        this.f69530 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m48942();
            m48941();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m48945() {
        super.clear();
        this.f69533 = 0;
        this.f69528 = null;
        C15722 c15722 = this.f69529;
        if (c15722 != null) {
            c15722.m37102();
            this.f69529 = null;
        }
        this.f69532 = false;
        C14311 c14311 = this.f69531;
        if (c14311 == null) {
            this.f69530 = Collections.EMPTY_LIST;
        } else {
            this.f69530 = null;
            c14311.m34169();
        }
        this.f69533 &= -5;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32216;
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C22381.getDefaultInstance();
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C22381.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C22381 c22381BuildPartial = buildPartial();
        if (c22381BuildPartial.isInitialized()) {
            return c22381BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c22381BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C22381 c22381BuildPartial = buildPartial();
        if (c22381BuildPartial.isInitialized()) {
            return c22381BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c22381BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C22381 buildPartial() {
        int i;
        C5969 c5969;
        C22381 c22381 = new C22381(this);
        C14311 c14311 = this.f69531;
        if (c14311 != null) {
            c22381.f72532 = c14311.m34163();
        } else {
            if ((this.f69533 & 4) != 0) {
                this.f69530 = C20195.unmodifiableList(this.f69530);
                this.f69533 &= -5;
            }
            c22381.f72532 = this.f69530;
        }
        int i2 = this.f69533;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                C15722 c15722 = this.f69529;
                if (c15722 == null) {
                    c5969 = this.f69528;
                } else {
                    c5969 = (C5969) c15722.m37099();
                }
                c22381.f72531 = c5969;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c22381.f72533 = this.f69532;
                i |= 2;
            }
            c22381.f72534 = i | c22381.f72534;
        }
        onBuilt();
        return c22381;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C22381) {
            m48944((C22381) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C22381) {
            m48944((C22381) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48944(C22381 c22381) {
        C5969 c5969;
        if (c22381 == C22381.getDefaultInstance()) {
            return;
        }
        if (c22381.m50251()) {
            C5969 c5969M50253 = c22381.m50253();
            C15722 c15722 = this.f69529;
            if (c15722 == null) {
                if ((this.f69533 & 1) == 0 || (c5969 = this.f69528) == null || c5969 == C5969.getDefaultInstance()) {
                    this.f69528 = c5969M50253;
                } else {
                    this.f69533 |= 1;
                    onChanged();
                    ((C0324) m48942().m37104()).m1732(c5969M50253);
                }
            } else {
                c15722.m37098(c5969M50253);
            }
            if (this.f69528 != null) {
                this.f69533 |= 1;
                onChanged();
            }
        }
        if (c22381.m50250()) {
            this.f69532 = c22381.m50252();
            this.f69533 |= 2;
            onChanged();
        }
        if (this.f69531 == null) {
            if (!c22381.f72532.isEmpty()) {
                if (this.f69530.isEmpty()) {
                    this.f69530 = c22381.f72532;
                    this.f69533 &= -5;
                } else {
                    if ((this.f69533 & 4) == 0) {
                        this.f69530 = new ArrayList(this.f69530);
                        this.f69533 |= 4;
                    }
                    this.f69530.addAll(c22381.f72532);
                }
                onChanged();
            }
        } else if (!c22381.f72532.isEmpty()) {
            if (!this.f69531.m34174()) {
                this.f69531.m34161(c22381.f72532);
            } else {
                this.f69531.m34172();
                this.f69531 = null;
                this.f69530 = c22381.f72532;
                this.f69533 &= -5;
                this.f69531 = AbstractC4121.alwaysUseFieldBuilders ? m48941() : null;
            }
        }
        m9115((AbstractC12154) c22381);
        mergeUnknownFields(c22381.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48943(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 264) {
                            this.f69532 = abstractC7297.mo19571();
                            this.f69533 |= 2;
                        } else if (iMo19567 == 274) {
                            abstractC7297.mo19556(m48942().m37104(), c17798);
                            this.f69533 |= 1;
                        } else if (iMo19567 == 7994) {
                            C1529 c1529 = (C1529) abstractC7297.mo19552(C1529.parser(), c17798);
                            C14311 c14311 = this.f69531;
                            if (c14311 != null) {
                                c14311.m34166(c1529);
                            } else {
                                if ((this.f69533 & 4) == 0) {
                                    this.f69530 = new ArrayList(this.f69530);
                                    this.f69533 |= 4;
                                }
                                this.f69530.add(c1529);
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
        if ((this.f69533 & 1) == 0) {
            i = 0;
            while (true) {
                c14311 = this.f69531;
                if (c14311 == null) {
                    iM34167 = this.f69530.size();
                } else {
                    iM34167 = c14311.m34167();
                }
                if (i < iM34167) {
                    if (!m9116()) {
                        break;
                    }
                    return true;
                }
                c14312 = this.f69531;
                if (c14312 == null) {
                    c1529 = (C1529) this.f69530.get(i);
                } else {
                    c1529 = (C1529) c14312.m34164(i);
                }
                if (!c1529.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C15722 c15722 = this.f69529;
            if (c15722 == null) {
                defaultInstance = this.f69528;
                if (defaultInstance == null) {
                    defaultInstance = C5969.getDefaultInstance();
                }
            } else {
                defaultInstance = (C5969) c15722.m37103();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c14311 = this.f69531;
                    if (c14311 == null) {
                        iM34167 = this.f69530.size();
                    } else {
                        iM34167 = c14311.m34167();
                    }
                    if (i < iM34167) {
                        if (!m9116()) {
                            break;
                        }
                        return true;
                    }
                    c14312 = this.f69531;
                    if (c14312 == null) {
                        c1529 = (C1529) this.f69530.get(i);
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
    private C15722 m48942() {
        C5969 defaultInstance;
        C15722 c15722 = this.f69529;
        if (c15722 == null) {
            if (c15722 == null) {
                defaultInstance = this.f69528;
                if (defaultInstance == null) {
                    defaultInstance = C5969.getDefaultInstance();
                }
            } else {
                defaultInstance = (C5969) c15722.m37103();
            }
            this.f69529 = new C15722(defaultInstance, getParentForChildren(), isClean());
            this.f69528 = null;
        }
        return this.f69529;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C14311 m48941() {
        if (this.f69531 == null) {
            this.f69531 = new C14311(this.f69530, (this.f69533 & 4) != 0, getParentForChildren(), isClean());
            this.f69530 = null;
        }
        return this.f69531;
    }
}
