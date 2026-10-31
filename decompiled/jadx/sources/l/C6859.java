package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۜܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6859 extends AbstractC2982 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C5969 f21208;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15722 f21209;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f21210;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14311 f21211;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f21212;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f21213;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f21214;

    public C6859(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f21212 = 0;
        this.f21210 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m18544();
            m18543();
        }
    }

    public /* synthetic */ C6859(int i) {
        this();
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC2982 clear() {
        m18547();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m18547();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m18547();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m18547();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m18547();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m18545(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m18545(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m18545(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m18545(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32253;
        c9766.m24773(C8976.class, C6859.class);
        return c9766;
    }

    public C6859() {
        this.f21212 = 0;
        this.f21210 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m18544();
            m18543();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18547() {
        super.clear();
        this.f21214 = 0;
        this.f21213 = false;
        this.f21212 = 0;
        this.f21208 = null;
        C15722 c15722 = this.f21209;
        if (c15722 != null) {
            c15722.m37102();
            this.f21209 = null;
        }
        C14311 c14311 = this.f21211;
        if (c14311 == null) {
            this.f21210 = Collections.EMPTY_LIST;
        } else {
            this.f21210 = null;
            c14311.m34169();
        }
        this.f21214 &= -9;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32236;
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C8976.getDefaultInstance();
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C8976.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C8976 c8976BuildPartial = buildPartial();
        if (c8976BuildPartial.isInitialized()) {
            return c8976BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c8976BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C8976 c8976BuildPartial = buildPartial();
        if (c8976BuildPartial.isInitialized()) {
            return c8976BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c8976BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C8976 buildPartial() {
        int i;
        C5969 c5969;
        C8976 c8976 = new C8976(this);
        C14311 c14311 = this.f21211;
        if (c14311 != null) {
            c8976.f27269 = c14311.m34163();
        } else {
            if ((this.f21214 & 8) != 0) {
                this.f21210 = C20195.unmodifiableList(this.f21210);
                this.f21214 &= -9;
            }
            c8976.f27269 = this.f21210;
        }
        int i2 = this.f21214;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c8976.f27271 = this.f21213;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c8976.f27267 = this.f21212;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C15722 c15722 = this.f21209;
                if (c15722 == null) {
                    c5969 = this.f21208;
                } else {
                    c5969 = (C5969) c15722.m37099();
                }
                c8976.f27268 = c5969;
                i |= 4;
            }
            c8976.f27272 = i | c8976.f27272;
        }
        onBuilt();
        return c8976;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C8976) {
            m18546((C8976) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C8976) {
            m18546((C8976) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18546(C8976 c8976) {
        C5969 c5969;
        if (c8976 == C8976.getDefaultInstance()) {
            return;
        }
        if (c8976.m23194()) {
            this.f21213 = c8976.m23195();
            this.f21214 |= 1;
            onChanged();
        }
        if (c8976.m23198()) {
            EnumC9682 enumC9682M23193 = c8976.m23193();
            enumC9682M23193.getClass();
            this.f21214 |= 2;
            this.f21212 = enumC9682M23193.getNumber();
            onChanged();
        }
        if (c8976.m23197()) {
            C5969 c5969M23196 = c8976.m23196();
            C15722 c15722 = this.f21209;
            if (c15722 == null) {
                if ((this.f21214 & 4) == 0 || (c5969 = this.f21208) == null || c5969 == C5969.getDefaultInstance()) {
                    this.f21208 = c5969M23196;
                } else {
                    this.f21214 |= 4;
                    onChanged();
                    ((C0324) m18544().m37104()).m1732(c5969M23196);
                }
            } else {
                c15722.m37098(c5969M23196);
            }
            if (this.f21208 != null) {
                this.f21214 |= 4;
                onChanged();
            }
        }
        if (this.f21211 == null) {
            if (!c8976.f27269.isEmpty()) {
                if (this.f21210.isEmpty()) {
                    this.f21210 = c8976.f27269;
                    this.f21214 &= -9;
                } else {
                    if ((this.f21214 & 8) == 0) {
                        this.f21210 = new ArrayList(this.f21210);
                        this.f21214 |= 8;
                    }
                    this.f21210.addAll(c8976.f27269);
                }
                onChanged();
            }
        } else if (!c8976.f27269.isEmpty()) {
            if (!this.f21211.m34174()) {
                this.f21211.m34161(c8976.f27269);
            } else {
                this.f21211.m34172();
                this.f21211 = null;
                this.f21210 = c8976.f27269;
                this.f21214 &= -9;
                this.f21211 = AbstractC4121.alwaysUseFieldBuilders ? m18543() : null;
            }
        }
        m9115((AbstractC12154) c8976);
        mergeUnknownFields(c8976.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18545(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 264) {
                            this.f21213 = abstractC7297.mo19571();
                            this.f21214 |= 1;
                        } else if (iMo19567 == 272) {
                            int iMo19560 = abstractC7297.mo19560();
                            if (EnumC9682.m24620(iMo19560) == null) {
                                mergeUnknownVarintField(34, iMo19560);
                            } else {
                                this.f21212 = iMo19560;
                                this.f21214 |= 2;
                            }
                        } else if (iMo19567 == 282) {
                            abstractC7297.mo19556(m18544().m37104(), c17798);
                            this.f21214 |= 4;
                        } else if (iMo19567 == 7994) {
                            C1529 c1529 = (C1529) abstractC7297.mo19552(C1529.parser(), c17798);
                            C14311 c14311 = this.f21211;
                            if (c14311 != null) {
                                c14311.m34166(c1529);
                            } else {
                                if ((this.f21214 & 8) == 0) {
                                    this.f21210 = new ArrayList(this.f21210);
                                    this.f21214 |= 8;
                                }
                                this.f21210.add(c1529);
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
        if ((this.f21214 & 4) == 0) {
            i = 0;
            while (true) {
                c14311 = this.f21211;
                if (c14311 == null) {
                    iM34167 = this.f21210.size();
                } else {
                    iM34167 = c14311.m34167();
                }
                if (i < iM34167) {
                    if (!m9116()) {
                        break;
                    }
                    return true;
                }
                c14312 = this.f21211;
                if (c14312 == null) {
                    c1529 = (C1529) this.f21210.get(i);
                } else {
                    c1529 = (C1529) c14312.m34164(i);
                }
                if (!c1529.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C15722 c15722 = this.f21209;
            if (c15722 == null) {
                defaultInstance = this.f21208;
                if (defaultInstance == null) {
                    defaultInstance = C5969.getDefaultInstance();
                }
            } else {
                defaultInstance = (C5969) c15722.m37103();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c14311 = this.f21211;
                    if (c14311 == null) {
                        iM34167 = this.f21210.size();
                    } else {
                        iM34167 = c14311.m34167();
                    }
                    if (i < iM34167) {
                        if (!m9116()) {
                            break;
                        }
                        return true;
                    }
                    c14312 = this.f21211;
                    if (c14312 == null) {
                        c1529 = (C1529) this.f21210.get(i);
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
    private C15722 m18544() {
        C5969 defaultInstance;
        C15722 c15722 = this.f21209;
        if (c15722 == null) {
            if (c15722 == null) {
                defaultInstance = this.f21208;
                if (defaultInstance == null) {
                    defaultInstance = C5969.getDefaultInstance();
                }
            } else {
                defaultInstance = (C5969) c15722.m37103();
            }
            this.f21209 = new C15722(defaultInstance, getParentForChildren(), isClean());
            this.f21208 = null;
        }
        return this.f21209;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C14311 m18543() {
        if (this.f21211 == null) {
            this.f21211 = new C14311(this.f21210, (this.f21214 & 8) != 0, getParentForChildren(), isClean());
            this.f21210 = null;
        }
        return this.f21211;
    }
}
