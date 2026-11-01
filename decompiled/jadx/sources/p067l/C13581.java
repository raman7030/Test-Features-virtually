package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۨܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13581 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ۗ */
    public C15969 f38186;

    /* JADX INFO: renamed from: ۙ */
    public Object f38187;

    /* JADX INFO: renamed from: ۛ */
    public AbstractC7962 f38188;

    /* JADX INFO: renamed from: ۤ */
    public long f38189;

    /* JADX INFO: renamed from: ۫ */
    public long f38190;

    /* JADX INFO: renamed from: ۬ */
    public List f38191;

    /* JADX INFO: renamed from: ᩶ */
    public double f38192;

    /* JADX INFO: renamed from: ᩸ */
    public Object f38193;

    /* JADX INFO: renamed from: ᩹ */
    public int f38194;

    public /* synthetic */ C13581(int i) {
        this();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m30901();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m30901();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m30901();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m30901();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m30903(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m30903(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m30903(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m30903(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35219;
        c11650.m26787(C3821.class, C13581.class);
        return c11650;
    }

    public C13581() {
        this.f38191 = Collections.EMPTY_LIST;
        this.f38187 = "";
        this.f38188 = AbstractC7962.f20935;
        this.f38193 = "";
    }

    public C13581(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f38191 = Collections.EMPTY_LIST;
        this.f38187 = "";
        this.f38188 = AbstractC7962.f20935;
        this.f38193 = "";
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30901() {
        super.clear();
        this.f38194 = 0;
        C15969 c15969 = this.f38186;
        if (c15969 == null) {
            this.f38191 = Collections.EMPTY_LIST;
        } else {
            this.f38191 = null;
            c15969.m36302();
        }
        this.f38194 &= -2;
        this.f38187 = "";
        this.f38189 = 0L;
        this.f38190 = 0L;
        this.f38192 = 0.0d;
        this.f38188 = AbstractC7962.f20935;
        this.f38193 = "";
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35221;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C3821.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C3821.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C3821 c3821BuildPartial = buildPartial();
        if (c3821BuildPartial.isInitialized()) {
            return c3821BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c3821BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C3821 c3821BuildPartial = buildPartial();
        if (c3821BuildPartial.isInitialized()) {
            return c3821BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c3821BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C3821 buildPartial() {
        int i = 0;
        C3821 c3821 = new C3821(this, 0);
        C15969 c15969 = this.f38186;
        if (c15969 != null) {
            c3821.f8190 = c15969.m36296();
        } else {
            if ((this.f38194 & 1) != 0) {
                this.f38191 = C21562.unmodifiableList(this.f38191);
                this.f38194 &= -2;
            }
            c3821.f8190 = this.f38191;
        }
        int i2 = this.f38194;
        if (i2 != 0) {
            if ((i2 & 2) != 0) {
                c3821.f8186 = this.f38187;
                i = 1;
            }
            if ((i2 & 4) != 0) {
                c3821.f8188 = this.f38189;
                i |= 2;
            }
            if ((i2 & 8) != 0) {
                c3821.f8189 = this.f38190;
                i |= 4;
            }
            if ((i2 & 16) != 0) {
                c3821.f8191 = this.f38192;
                i |= 8;
            }
            if ((i2 & 32) != 0) {
                c3821.f8187 = this.f38188;
                i |= 16;
            }
            if ((i2 & 64) != 0) {
                c3821.f8192 = this.f38193;
                i |= 32;
            }
            c3821.f8193 = i | c3821.f8193;
        }
        onBuilt();
        return c3821;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C3821) {
            m30902((C3821) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C3821) {
            m30902((C3821) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30902(C3821 c3821) {
        if (c3821 == C3821.getDefaultInstance()) {
            return;
        }
        if (this.f38186 == null) {
            if (!c3821.f8190.isEmpty()) {
                if (this.f38191.isEmpty()) {
                    this.f38191 = c3821.f8190;
                    this.f38194 &= -2;
                } else {
                    if ((this.f38194 & 1) == 0) {
                        this.f38191 = new ArrayList(this.f38191);
                        this.f38194 |= 1;
                    }
                    this.f38191.addAll(c3821.f8190);
                }
                onChanged();
            }
        } else if (!c3821.f8190.isEmpty()) {
            if (!this.f38186.m36307()) {
                this.f38186.m36294(c3821.f8190);
            } else {
                this.f38186.m36305();
                C15969 c15969 = null;
                this.f38186 = null;
                List list = c3821.f8190;
                this.f38191 = list;
                this.f38194 &= -2;
                if (AbstractC6285.alwaysUseFieldBuilders) {
                    if (this.f38186 == null) {
                        this.f38186 = new C15969(list, false, getParentForChildren(), isClean());
                        this.f38191 = null;
                    }
                    c15969 = this.f38186;
                }
                this.f38186 = c15969;
            }
        }
        if (c3821.m7464()) {
            this.f38187 = c3821.f8186;
            this.f38194 |= 2;
            onChanged();
        }
        if (c3821.m7458()) {
            this.f38189 = c3821.m7462();
            this.f38194 |= 4;
            onChanged();
        }
        if (c3821.m7454()) {
            this.f38190 = c3821.m7460();
            this.f38194 |= 8;
            onChanged();
        }
        if (c3821.m7463()) {
            this.f38192 = c3821.m7465();
            this.f38194 |= 16;
            onChanged();
        }
        if (c3821.m7455()) {
            AbstractC7962 abstractC7962M7456 = c3821.m7456();
            abstractC7962M7456.getClass();
            this.f38188 = abstractC7962M7456;
            this.f38194 |= 32;
            onChanged();
        }
        if (c3821.m7457()) {
            this.f38193 = c3821.f8192;
            this.f38194 |= 64;
            onChanged();
        }
        mergeUnknownFields(c3821.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30903(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 18) {
                            C9557 c9557 = (C9557) abstractC9303.mo21520(C9557.parser(), c19283);
                            C15969 c15969 = this.f38186;
                            if (c15969 != null) {
                                c15969.m36299(c9557);
                            } else {
                                if ((this.f38194 & 1) == 0) {
                                    this.f38191 = new ArrayList(this.f38191);
                                    this.f38194 |= 1;
                                }
                                this.f38191.add(c9557);
                            }
                        } else if (iMo21535 == 26) {
                            this.f38187 = abstractC9303.mo21534();
                            this.f38194 |= 2;
                        } else if (iMo21535 == 32) {
                            this.f38189 = abstractC9303.mo21546();
                            this.f38194 |= 4;
                        } else if (iMo21535 == 40) {
                            this.f38190 = abstractC9303.mo21525();
                            this.f38194 |= 8;
                        } else if (iMo21535 == 49) {
                            this.f38192 = abstractC9303.mo21547();
                            this.f38194 |= 16;
                        } else if (iMo21535 == 58) {
                            this.f38188 = abstractC9303.mo21534();
                            this.f38194 |= 32;
                        } else if (iMo21535 == 66) {
                            this.f38193 = abstractC9303.mo21534();
                            this.f38194 |= 64;
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
        C9557 c9557;
        int i = 0;
        while (true) {
            C15969 c15969 = this.f38186;
            if (c15969 == null) {
                iM36300 = this.f38191.size();
            } else {
                iM36300 = c15969.m36300();
            }
            if (i >= iM36300) {
                return true;
            }
            C15969 c159610 = this.f38186;
            if (c159610 == null) {
                c9557 = (C9557) this.f38191.get(i);
            } else {
                c9557 = (C9557) c159610.m36297(i);
            }
            if (!c9557.isInitialized()) {
                return false;
            }
            i++;
        }
    }
}
