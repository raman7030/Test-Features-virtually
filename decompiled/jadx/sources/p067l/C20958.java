package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20958 extends AbstractC5202 {

    /* JADX INFO: renamed from: ۗ */
    public C15969 f65845;

    /* JADX INFO: renamed from: ۙ */
    public C8041 f65846;

    /* JADX INFO: renamed from: ۬ */
    public List f65847;

    /* JADX INFO: renamed from: ᩶ */
    public C17310 f65848;

    /* JADX INFO: renamed from: ᩹ */
    public int f65849;

    public C20958(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f65847 = Collections.EMPTY_LIST;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m47277();
            m47276();
        }
    }

    public /* synthetic */ C20958(int i) {
        this();
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC5202 clear() {
        m47280();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m47280();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m47280();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m47280();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m47280();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m47279(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m47279(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m47279(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m47279(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35238;
        c11650.m26787(C2851.class, C20958.class);
        return c11650;
    }

    public C20958() {
        this.f65847 = Collections.EMPTY_LIST;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m47277();
            m47276();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m47280() {
        super.clear();
        this.f65849 = 0;
        this.f65846 = null;
        C17310 c17310 = this.f65848;
        if (c17310 != null) {
            c17310.m39271();
            this.f65848 = null;
        }
        C15969 c15969 = this.f65845;
        if (c15969 == null) {
            this.f65847 = Collections.EMPTY_LIST;
        } else {
            this.f65847 = null;
            c15969.m36302();
        }
        this.f65849 &= -3;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35236;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C2851.getDefaultInstance();
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C2851.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C2851 c2851BuildPartial = buildPartial();
        if (c2851BuildPartial.isInitialized()) {
            return c2851BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c2851BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C2851 c2851BuildPartial = buildPartial();
        if (c2851BuildPartial.isInitialized()) {
            return c2851BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c2851BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C2851 buildPartial() {
        C8041 c8041;
        C2851 c2851 = new C2851(this);
        C15969 c15969 = this.f65845;
        if (c15969 != null) {
            c2851.f4909 = c15969.m36296();
        } else {
            if ((this.f65849 & 2) != 0) {
                this.f65847 = C21562.unmodifiableList(this.f65847);
                this.f65849 &= -3;
            }
            c2851.f4909 = this.f65847;
        }
        int i = this.f65849;
        if (i != 0) {
            int i2 = 1;
            if ((i & 1) != 0) {
                C17310 c17310 = this.f65848;
                if (c17310 == null) {
                    c8041 = this.f65846;
                } else {
                    c8041 = (C8041) c17310.m39268();
                }
                c2851.f4911 = c8041;
            } else {
                i2 = 0;
            }
            c2851.f4912 = i2 | c2851.f4912;
        }
        onBuilt();
        return c2851;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C2851) {
            m47278((C2851) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C2851) {
            m47278((C2851) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47278(C2851 c2851) {
        C8041 c8041;
        if (c2851 == C2851.getDefaultInstance()) {
            return;
        }
        if (c2851.m4568()) {
            C8041 c8041M4567 = c2851.m4567();
            C17310 c17310 = this.f65848;
            if (c17310 == null) {
                if ((this.f65849 & 1) == 0 || (c8041 = this.f65846) == null || c8041 == C8041.getDefaultInstance()) {
                    this.f65846 = c8041M4567;
                } else {
                    this.f65849 |= 1;
                    onChanged();
                    ((C2676) m47277().m39273()).m4130(c8041M4567);
                }
            } else {
                c17310.m39267(c8041M4567);
            }
            if (this.f65846 != null) {
                this.f65849 |= 1;
                onChanged();
            }
        }
        if (this.f65845 == null) {
            if (!c2851.f4909.isEmpty()) {
                if (this.f65847.isEmpty()) {
                    this.f65847 = c2851.f4909;
                    this.f65849 &= -3;
                } else {
                    if ((this.f65849 & 2) == 0) {
                        this.f65847 = new ArrayList(this.f65847);
                        this.f65849 |= 2;
                    }
                    this.f65847.addAll(c2851.f4909);
                }
                onChanged();
            }
        } else if (!c2851.f4909.isEmpty()) {
            if (!this.f65845.m36307()) {
                this.f65845.m36294(c2851.f4909);
            } else {
                this.f65845.m36305();
                this.f65845 = null;
                this.f65847 = c2851.f4909;
                this.f65849 &= -3;
                this.f65845 = AbstractC6285.alwaysUseFieldBuilders ? m47276() : null;
            }
        }
        m11167((AbstractC13919) c2851);
        mergeUnknownFields(c2851.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47279(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 10) {
                            abstractC9303.mo21524(m47277().m39273(), c19283);
                            this.f65849 |= 1;
                        } else if (iMo21535 == 7994) {
                            C3821 c3821 = (C3821) abstractC9303.mo21520(C3821.parser(), c19283);
                            C15969 c15969 = this.f65845;
                            if (c15969 != null) {
                                c15969.m36299(c3821);
                            } else {
                                if ((this.f65849 & 2) == 0) {
                                    this.f65847 = new ArrayList(this.f65847);
                                    this.f65849 |= 2;
                                }
                                this.f65847.add(c3821);
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
    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0056 A[EDGE_INSN: B:32:0x0056->B:29:0x0056 BREAK  A[LOOP:0: B:14:0x0022->B:26:0x004d], SYNTHETIC] */
    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        int i;
        C15969 c15969;
        int iM36300;
        C15969 c159610;
        C3821 c3821;
        C8041 defaultInstance;
        if ((this.f65849 & 1) == 0) {
            i = 0;
            while (true) {
                c15969 = this.f65845;
                if (c15969 == null) {
                    iM36300 = this.f65847.size();
                } else {
                    iM36300 = c15969.m36300();
                }
                if (i < iM36300) {
                    if (!m11168()) {
                        break;
                    }
                    return true;
                }
                c159610 = this.f65845;
                if (c159610 == null) {
                    c3821 = (C3821) this.f65847.get(i);
                } else {
                    c3821 = (C3821) c159610.m36297(i);
                }
                if (!c3821.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C17310 c17310 = this.f65848;
            if (c17310 == null) {
                defaultInstance = this.f65846;
                if (defaultInstance == null) {
                    defaultInstance = C8041.getDefaultInstance();
                }
            } else {
                defaultInstance = (C8041) c17310.m39272();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c15969 = this.f65845;
                    if (c15969 == null) {
                        iM36300 = this.f65847.size();
                    } else {
                        iM36300 = c15969.m36300();
                    }
                    if (i < iM36300) {
                        if (!m11168()) {
                            break;
                        }
                        return true;
                    }
                    c159610 = this.f65845;
                    if (c159610 == null) {
                        c3821 = (C3821) this.f65847.get(i);
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
    private C17310 m47277() {
        C8041 defaultInstance;
        C17310 c17310 = this.f65848;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f65846;
                if (defaultInstance == null) {
                    defaultInstance = C8041.getDefaultInstance();
                }
            } else {
                defaultInstance = (C8041) c17310.m39272();
            }
            this.f65848 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f65846 = null;
        }
        return this.f65848;
    }

    /* JADX INFO: renamed from: ܿ */
    private C15969 m47276() {
        if (this.f65845 == null) {
            this.f65845 = new C15969(this.f65847, (this.f65849 & 2) != 0, getParentForChildren(), isClean());
            this.f65847 = null;
        }
        return this.f65845;
    }
}
