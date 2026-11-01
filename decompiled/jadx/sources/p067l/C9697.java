package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۟᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9697 extends AbstractC5202 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f26731;

    /* JADX INFO: renamed from: ۙ */
    public boolean f26732;

    /* JADX INFO: renamed from: ۛ */
    public List f26733;

    /* JADX INFO: renamed from: ۤ */
    public C15969 f26734;

    /* JADX INFO: renamed from: ۫ */
    public C8041 f26735;

    /* JADX INFO: renamed from: ۬ */
    public C17310 f26736;

    /* JADX INFO: renamed from: ᩶ */
    public int f26737;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f26738;

    public C9697(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f26733 = Collections.EMPTY_LIST;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m22607();
            m22606();
        }
    }

    public /* synthetic */ C9697(int i) {
        this();
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC5202 clear() {
        m22609();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m22609();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m22609();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m22609();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m22609();
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
        C11650 c11650 = C12539.f35198;
        c11650.m26787(C4018.class, C9697.class);
        return c11650;
    }

    public C9697() {
        this.f26733 = Collections.EMPTY_LIST;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m22607();
            m22606();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m22609() {
        super.clear();
        this.f26737 = 0;
        this.f26738 = false;
        this.f26731 = false;
        this.f26732 = false;
        this.f26735 = null;
        C17310 c17310 = this.f26736;
        if (c17310 != null) {
            c17310.m39271();
            this.f26736 = null;
        }
        C15969 c15969 = this.f26734;
        if (c15969 == null) {
            this.f26733 = Collections.EMPTY_LIST;
        } else {
            this.f26733 = null;
            c15969.m36302();
        }
        this.f26737 &= -17;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35194;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C4018.getDefaultInstance();
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C4018.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C4018 c4018BuildPartial = buildPartial();
        if (c4018BuildPartial.isInitialized()) {
            return c4018BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c4018BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C4018 c4018BuildPartial = buildPartial();
        if (c4018BuildPartial.isInitialized()) {
            return c4018BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c4018BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C4018 buildPartial() {
        int i;
        C8041 c8041;
        C4018 c4018 = new C4018(this);
        C15969 c15969 = this.f26734;
        if (c15969 != null) {
            c4018.f8783 = c15969.m36296();
        } else {
            if ((this.f26737 & 16) != 0) {
                this.f26733 = C21562.unmodifiableList(this.f26733);
                this.f26737 &= -17;
            }
            c4018.f8783 = this.f26733;
        }
        int i2 = this.f26737;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c4018.f8787 = this.f26738;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c4018.f8781 = this.f26731;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c4018.f8782 = this.f26732;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                C17310 c17310 = this.f26736;
                if (c17310 == null) {
                    c8041 = this.f26735;
                } else {
                    c8041 = (C8041) c17310.m39268();
                }
                c4018.f8785 = c8041;
                i |= 8;
            }
            c4018.f8786 = i | c4018.f8786;
        }
        onBuilt();
        return c4018;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C4018) {
            m22608((C4018) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C4018) {
            m22608((C4018) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22608(C4018 c4018) {
        C8041 c8041;
        if (c4018 == C4018.getDefaultInstance()) {
            return;
        }
        if (c4018.m8018()) {
            this.f26738 = c4018.m8016();
            this.f26737 |= 1;
            onChanged();
        }
        if (c4018.m8019()) {
            this.f26731 = c4018.m8017();
            this.f26737 |= 2;
            onChanged();
        }
        if (c4018.m8012()) {
            this.f26732 = c4018.m8013();
            this.f26737 |= 4;
            onChanged();
        }
        if (c4018.m8015()) {
            C8041 c8041M8014 = c4018.m8014();
            C17310 c17310 = this.f26736;
            if (c17310 == null) {
                if ((this.f26737 & 8) == 0 || (c8041 = this.f26735) == null || c8041 == C8041.getDefaultInstance()) {
                    this.f26735 = c8041M8014;
                } else {
                    this.f26737 |= 8;
                    onChanged();
                    ((C2676) m22607().m39273()).m4130(c8041M8014);
                }
            } else {
                c17310.m39267(c8041M8014);
            }
            if (this.f26735 != null) {
                this.f26737 |= 8;
                onChanged();
            }
        }
        if (this.f26734 == null) {
            if (!c4018.f8783.isEmpty()) {
                if (this.f26733.isEmpty()) {
                    this.f26733 = c4018.f8783;
                    this.f26737 &= -17;
                } else {
                    if ((this.f26737 & 16) == 0) {
                        this.f26733 = new ArrayList(this.f26733);
                        this.f26737 |= 16;
                    }
                    this.f26733.addAll(c4018.f8783);
                }
                onChanged();
            }
        } else if (!c4018.f8783.isEmpty()) {
            if (!this.f26734.m36307()) {
                this.f26734.m36294(c4018.f8783);
            } else {
                this.f26734.m36305();
                this.f26734 = null;
                this.f26733 = c4018.f8783;
                this.f26737 &= -17;
                this.f26734 = AbstractC6285.alwaysUseFieldBuilders ? m22606() : null;
            }
        }
        m11167((AbstractC13919) c4018);
        mergeUnknownFields(c4018.getUnknownFields());
        onChanged();
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final C9697 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 16) {
                            this.f26738 = abstractC9303.mo21539();
                            this.f26737 |= 1;
                        } else if (iMo21535 == 24) {
                            this.f26731 = abstractC9303.mo21539();
                            this.f26737 |= 2;
                        } else if (iMo21535 == 48) {
                            this.f26732 = abstractC9303.mo21539();
                            this.f26737 |= 4;
                        } else if (iMo21535 == 58) {
                            abstractC9303.mo21524(m22607().m39273(), c19283);
                            this.f26737 |= 8;
                        } else if (iMo21535 == 7994) {
                            C3821 c3821 = (C3821) abstractC9303.mo21520(C3821.parser(), c19283);
                            C15969 c15969 = this.f26734;
                            if (c15969 != null) {
                                c15969.m36299(c3821);
                            } else {
                                if ((this.f26737 & 16) == 0) {
                                    this.f26733 = new ArrayList(this.f26733);
                                    this.f26737 = 16 | this.f26737;
                                }
                                this.f26733.add(c3821);
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
    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        int i;
        C15969 c15969;
        int iM36300;
        C15969 c159610;
        C3821 c3821;
        C8041 defaultInstance;
        if ((this.f26737 & 8) == 0) {
            i = 0;
            while (true) {
                c15969 = this.f26734;
                if (c15969 == null) {
                    iM36300 = this.f26733.size();
                } else {
                    iM36300 = c15969.m36300();
                }
                if (i < iM36300) {
                    if (!m11168()) {
                        break;
                    }
                    return true;
                }
                c159610 = this.f26734;
                if (c159610 == null) {
                    c3821 = (C3821) this.f26733.get(i);
                } else {
                    c3821 = (C3821) c159610.m36297(i);
                }
                if (!c3821.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C17310 c17310 = this.f26736;
            if (c17310 == null) {
                defaultInstance = this.f26735;
                if (defaultInstance == null) {
                    defaultInstance = C8041.getDefaultInstance();
                }
            } else {
                defaultInstance = (C8041) c17310.m39272();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c15969 = this.f26734;
                    if (c15969 == null) {
                        iM36300 = this.f26733.size();
                    } else {
                        iM36300 = c15969.m36300();
                    }
                    if (i < iM36300) {
                        if (!m11168()) {
                            break;
                        }
                        return true;
                    }
                    c159610 = this.f26734;
                    if (c159610 == null) {
                        c3821 = (C3821) this.f26733.get(i);
                    } else {
                        c3821 = (C3821) c159610.m36297(i);
                    }
                    if (!c3821.isInitialized()) {
                        break;
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    private C17310 m22607() {
        C8041 defaultInstance;
        C17310 c17310 = this.f26736;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f26735;
                if (defaultInstance == null) {
                    defaultInstance = C8041.getDefaultInstance();
                }
            } else {
                defaultInstance = (C8041) c17310.m39272();
            }
            this.f26736 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f26735 = null;
        }
        return this.f26736;
    }

    /* JADX INFO: renamed from: ܿ */
    private C15969 m22606() {
        if (this.f26734 == null) {
            this.f26734 = new C15969(this.f26733, (this.f26737 & 16) != 0, getParentForChildren(), isClean());
            this.f26733 = null;
        }
        return this.f26734;
    }
}
