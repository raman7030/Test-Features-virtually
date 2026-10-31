package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۨܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11798 extends AbstractC19916 implements InterfaceC3583 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C14311 f35184;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f35185;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC5886 f35186;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f35187;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f35188;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f35189;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public double f35190;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f35191;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f35192;

    public /* synthetic */ C11798(int i) {
        this();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m28852();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m28852();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m28852();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m28852();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m28854(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m28854(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m28854(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m28854(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32244;
        c9766.m24773(C1529.class, C11798.class);
        return c9766;
    }

    public C11798() {
        this.f35189 = Collections.EMPTY_LIST;
        this.f35185 = "";
        this.f35186 = AbstractC5886.f18080;
        this.f35191 = "";
    }

    public C11798(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f35189 = Collections.EMPTY_LIST;
        this.f35185 = "";
        this.f35186 = AbstractC5886.f18080;
        this.f35191 = "";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28852() {
        super.clear();
        this.f35192 = 0;
        C14311 c14311 = this.f35184;
        if (c14311 == null) {
            this.f35189 = Collections.EMPTY_LIST;
        } else {
            this.f35189 = null;
            c14311.m34169();
        }
        this.f35192 &= -2;
        this.f35185 = "";
        this.f35187 = 0L;
        this.f35188 = 0L;
        this.f35190 = 0.0d;
        this.f35186 = AbstractC5886.f18080;
        this.f35191 = "";
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32246;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C1529.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C1529.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C1529 c1529BuildPartial = buildPartial();
        if (c1529BuildPartial.isInitialized()) {
            return c1529BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c1529BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C1529 c1529BuildPartial = buildPartial();
        if (c1529BuildPartial.isInitialized()) {
            return c1529BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c1529BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C1529 buildPartial() {
        int i = 0;
        C1529 c1529 = new C1529(this, 0);
        C14311 c14311 = this.f35184;
        if (c14311 != null) {
            c1529.f5408 = c14311.m34163();
        } else {
            if ((this.f35192 & 1) != 0) {
                this.f35189 = C20195.unmodifiableList(this.f35189);
                this.f35192 &= -2;
            }
            c1529.f5408 = this.f35189;
        }
        int i2 = this.f35192;
        if (i2 != 0) {
            if ((i2 & 2) != 0) {
                c1529.f5404 = this.f35185;
                i = 1;
            }
            if ((i2 & 4) != 0) {
                c1529.f5406 = this.f35187;
                i |= 2;
            }
            if ((i2 & 8) != 0) {
                c1529.f5407 = this.f35188;
                i |= 4;
            }
            if ((i2 & 16) != 0) {
                c1529.f5409 = this.f35190;
                i |= 8;
            }
            if ((i2 & 32) != 0) {
                c1529.f5405 = this.f35186;
                i |= 16;
            }
            if ((i2 & 64) != 0) {
                c1529.f5410 = this.f35191;
                i |= 32;
            }
            c1529.f5411 = i | c1529.f5411;
        }
        onBuilt();
        return c1529;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C1529) {
            m28853((C1529) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C1529) {
            m28853((C1529) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28853(C1529 c1529) {
        if (c1529 == C1529.getDefaultInstance()) {
            return;
        }
        if (this.f35184 == null) {
            if (!c1529.f5408.isEmpty()) {
                if (this.f35189.isEmpty()) {
                    this.f35189 = c1529.f5408;
                    this.f35192 &= -2;
                } else {
                    if ((this.f35192 & 1) == 0) {
                        this.f35189 = new ArrayList(this.f35189);
                        this.f35192 |= 1;
                    }
                    this.f35189.addAll(c1529.f5408);
                }
                onChanged();
            }
        } else if (!c1529.f5408.isEmpty()) {
            if (!this.f35184.m34174()) {
                this.f35184.m34161(c1529.f5408);
            } else {
                this.f35184.m34172();
                C14311 c14311 = null;
                this.f35184 = null;
                List list = c1529.f5408;
                this.f35189 = list;
                this.f35192 &= -2;
                if (AbstractC4121.alwaysUseFieldBuilders) {
                    if (this.f35184 == null) {
                        this.f35184 = new C14311(list, false, getParentForChildren(), isClean());
                        this.f35189 = null;
                    }
                    c14311 = this.f35184;
                }
                this.f35184 = c14311;
            }
        }
        if (c1529.m5236()) {
            this.f35185 = c1529.f5404;
            this.f35192 |= 2;
            onChanged();
        }
        if (c1529.m5230()) {
            this.f35187 = c1529.m5234();
            this.f35192 |= 4;
            onChanged();
        }
        if (c1529.m5226()) {
            this.f35188 = c1529.m5232();
            this.f35192 |= 8;
            onChanged();
        }
        if (c1529.m5235()) {
            this.f35190 = c1529.m5237();
            this.f35192 |= 16;
            onChanged();
        }
        if (c1529.m5227()) {
            AbstractC5886 abstractC5886M5228 = c1529.m5228();
            abstractC5886M5228.getClass();
            this.f35186 = abstractC5886M5228;
            this.f35192 |= 32;
            onChanged();
        }
        if (c1529.m5229()) {
            this.f35191 = c1529.f5410;
            this.f35192 |= 64;
            onChanged();
        }
        mergeUnknownFields(c1529.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28854(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 18) {
                            C7564 c7564 = (C7564) abstractC7297.mo19552(C7564.parser(), c17798);
                            C14311 c14311 = this.f35184;
                            if (c14311 != null) {
                                c14311.m34166(c7564);
                            } else {
                                if ((this.f35192 & 1) == 0) {
                                    this.f35189 = new ArrayList(this.f35189);
                                    this.f35192 |= 1;
                                }
                                this.f35189.add(c7564);
                            }
                        } else if (iMo19567 == 26) {
                            this.f35185 = abstractC7297.mo19566();
                            this.f35192 |= 2;
                        } else if (iMo19567 == 32) {
                            this.f35187 = abstractC7297.mo19578();
                            this.f35192 |= 4;
                        } else if (iMo19567 == 40) {
                            this.f35188 = abstractC7297.mo19557();
                            this.f35192 |= 8;
                        } else if (iMo19567 == 49) {
                            this.f35190 = abstractC7297.mo19579();
                            this.f35192 |= 16;
                        } else if (iMo19567 == 58) {
                            this.f35186 = abstractC7297.mo19566();
                            this.f35192 |= 32;
                        } else if (iMo19567 == 66) {
                            this.f35191 = abstractC7297.mo19566();
                            this.f35192 |= 64;
                        } else if (!super.parseUnknownField(abstractC7297, c17798, iMo19567)) {
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

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        int iM34167;
        C7564 c7564;
        int i = 0;
        while (true) {
            C14311 c14311 = this.f35184;
            if (c14311 == null) {
                iM34167 = this.f35189.size();
            } else {
                iM34167 = c14311.m34167();
            }
            if (i >= iM34167) {
                return true;
            }
            C14311 c14312 = this.f35184;
            if (c14312 == null) {
                c7564 = (C7564) this.f35189.get(i);
            } else {
                c7564 = (C7564) c14312.m34164(i);
            }
            if (!c7564.isInitialized()) {
                return false;
            }
            i++;
        }
    }
}
