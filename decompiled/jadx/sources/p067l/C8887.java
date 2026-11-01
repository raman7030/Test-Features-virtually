package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۜܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8887 extends AbstractC5202 {

    /* JADX INFO: renamed from: ۗ */
    public C8041 f24087;

    /* JADX INFO: renamed from: ۙ */
    public C17310 f24088;

    /* JADX INFO: renamed from: ۤ */
    public List f24089;

    /* JADX INFO: renamed from: ۫ */
    public C15969 f24090;

    /* JADX INFO: renamed from: ۬ */
    public int f24091;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f24092;

    /* JADX INFO: renamed from: ᩹ */
    public int f24093;

    public C8887(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f24091 = 0;
        this.f24089 = Collections.EMPTY_LIST;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m20493();
            m20492();
        }
    }

    public /* synthetic */ C8887(int i) {
        this();
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC5202 clear() {
        m20496();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m20496();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m20496();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m20496();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m20496();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m20494(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m20494(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m20494(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m20494(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35228;
        c11650.m26787(C10899.class, C8887.class);
        return c11650;
    }

    public C8887() {
        this.f24091 = 0;
        this.f24089 = Collections.EMPTY_LIST;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m20493();
            m20492();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m20496() {
        super.clear();
        this.f24093 = 0;
        this.f24092 = false;
        this.f24091 = 0;
        this.f24087 = null;
        C17310 c17310 = this.f24088;
        if (c17310 != null) {
            c17310.m39271();
            this.f24088 = null;
        }
        C15969 c15969 = this.f24090;
        if (c15969 == null) {
            this.f24089 = Collections.EMPTY_LIST;
        } else {
            this.f24089 = null;
            c15969.m36302();
        }
        this.f24093 &= -9;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35211;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C10899.getDefaultInstance();
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C10899.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C10899 c10899BuildPartial = buildPartial();
        if (c10899BuildPartial.isInitialized()) {
            return c10899BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c10899BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C10899 c10899BuildPartial = buildPartial();
        if (c10899BuildPartial.isInitialized()) {
            return c10899BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c10899BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C10899 buildPartial() {
        int i;
        C8041 c8041;
        C10899 c10899 = new C10899(this);
        C15969 c15969 = this.f24090;
        if (c15969 != null) {
            c10899.f30204 = c15969.m36296();
        } else {
            if ((this.f24093 & 8) != 0) {
                this.f24089 = C21562.unmodifiableList(this.f24089);
                this.f24093 &= -9;
            }
            c10899.f30204 = this.f24089;
        }
        int i2 = this.f24093;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c10899.f30206 = this.f24092;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c10899.f30202 = this.f24091;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C17310 c17310 = this.f24088;
                if (c17310 == null) {
                    c8041 = this.f24087;
                } else {
                    c8041 = (C8041) c17310.m39268();
                }
                c10899.f30203 = c8041;
                i |= 4;
            }
            c10899.f30207 = i | c10899.f30207;
        }
        onBuilt();
        return c10899;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C10899) {
            m20495((C10899) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C10899) {
            m20495((C10899) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20495(C10899 c10899) {
        C8041 c8041;
        if (c10899 == C10899.getDefaultInstance()) {
            return;
        }
        if (c10899.m25138()) {
            this.f24092 = c10899.m25139();
            this.f24093 |= 1;
            onChanged();
        }
        if (c10899.m25142()) {
            EnumC11570 enumC11570M25137 = c10899.m25137();
            enumC11570M25137.getClass();
            this.f24093 |= 2;
            this.f24091 = enumC11570M25137.getNumber();
            onChanged();
        }
        if (c10899.m25141()) {
            C8041 c8041M25140 = c10899.m25140();
            C17310 c17310 = this.f24088;
            if (c17310 == null) {
                if ((this.f24093 & 4) == 0 || (c8041 = this.f24087) == null || c8041 == C8041.getDefaultInstance()) {
                    this.f24087 = c8041M25140;
                } else {
                    this.f24093 |= 4;
                    onChanged();
                    ((C2676) m20493().m39273()).m4130(c8041M25140);
                }
            } else {
                c17310.m39267(c8041M25140);
            }
            if (this.f24087 != null) {
                this.f24093 |= 4;
                onChanged();
            }
        }
        if (this.f24090 == null) {
            if (!c10899.f30204.isEmpty()) {
                if (this.f24089.isEmpty()) {
                    this.f24089 = c10899.f30204;
                    this.f24093 &= -9;
                } else {
                    if ((this.f24093 & 8) == 0) {
                        this.f24089 = new ArrayList(this.f24089);
                        this.f24093 |= 8;
                    }
                    this.f24089.addAll(c10899.f30204);
                }
                onChanged();
            }
        } else if (!c10899.f30204.isEmpty()) {
            if (!this.f24090.m36307()) {
                this.f24090.m36294(c10899.f30204);
            } else {
                this.f24090.m36305();
                this.f24090 = null;
                this.f24089 = c10899.f30204;
                this.f24093 &= -9;
                this.f24090 = AbstractC6285.alwaysUseFieldBuilders ? m20492() : null;
            }
        }
        m11167((AbstractC13919) c10899);
        mergeUnknownFields(c10899.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20494(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 264) {
                            this.f24092 = abstractC9303.mo21539();
                            this.f24093 |= 1;
                        } else if (iMo21535 == 272) {
                            int iMo21528 = abstractC9303.mo21528();
                            if (EnumC11570.m26634(iMo21528) == null) {
                                mergeUnknownVarintField(34, iMo21528);
                            } else {
                                this.f24091 = iMo21528;
                                this.f24093 |= 2;
                            }
                        } else if (iMo21535 == 282) {
                            abstractC9303.mo21524(m20493().m39273(), c19283);
                            this.f24093 |= 4;
                        } else if (iMo21535 == 7994) {
                            C3821 c3821 = (C3821) abstractC9303.mo21520(C3821.parser(), c19283);
                            C15969 c15969 = this.f24090;
                            if (c15969 != null) {
                                c15969.m36299(c3821);
                            } else {
                                if ((this.f24093 & 8) == 0) {
                                    this.f24089 = new ArrayList(this.f24089);
                                    this.f24093 |= 8;
                                }
                                this.f24089.add(c3821);
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
        if ((this.f24093 & 4) == 0) {
            i = 0;
            while (true) {
                c15969 = this.f24090;
                if (c15969 == null) {
                    iM36300 = this.f24089.size();
                } else {
                    iM36300 = c15969.m36300();
                }
                if (i < iM36300) {
                    if (!m11168()) {
                        break;
                    }
                    return true;
                }
                c159610 = this.f24090;
                if (c159610 == null) {
                    c3821 = (C3821) this.f24089.get(i);
                } else {
                    c3821 = (C3821) c159610.m36297(i);
                }
                if (!c3821.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C17310 c17310 = this.f24088;
            if (c17310 == null) {
                defaultInstance = this.f24087;
                if (defaultInstance == null) {
                    defaultInstance = C8041.getDefaultInstance();
                }
            } else {
                defaultInstance = (C8041) c17310.m39272();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c15969 = this.f24090;
                    if (c15969 == null) {
                        iM36300 = this.f24089.size();
                    } else {
                        iM36300 = c15969.m36300();
                    }
                    if (i < iM36300) {
                        if (!m11168()) {
                            break;
                        }
                        return true;
                    }
                    c159610 = this.f24090;
                    if (c159610 == null) {
                        c3821 = (C3821) this.f24089.get(i);
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
    private C17310 m20493() {
        C8041 defaultInstance;
        C17310 c17310 = this.f24088;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f24087;
                if (defaultInstance == null) {
                    defaultInstance = C8041.getDefaultInstance();
                }
            } else {
                defaultInstance = (C8041) c17310.m39272();
            }
            this.f24088 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f24087 = null;
        }
        return this.f24088;
    }

    /* JADX INFO: renamed from: ܿ */
    private C15969 m20492() {
        if (this.f24090 == null) {
            this.f24090 = new C15969(this.f24089, (this.f24093 & 8) != 0, getParentForChildren(), isClean());
            this.f24089 = null;
        }
        return this.f24090;
    }
}
