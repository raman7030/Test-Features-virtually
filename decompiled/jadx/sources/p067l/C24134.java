package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24134 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ۗ */
    public int f76565;

    /* JADX INFO: renamed from: ۙ */
    public int f76566;

    /* JADX INFO: renamed from: ᩶ */
    public List f76567;

    /* JADX INFO: renamed from: ᩸ */
    public int f76568;

    /* JADX INFO: renamed from: ᩹ */
    public C15969 f76569;

    public /* synthetic */ C24134(int i) {
        this();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m53381();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m53381();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m53381();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m53381();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m53382(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m53382(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m53382(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m53382(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35196;
        c11650.m26787(C12716.class, C24134.class);
        return c11650;
    }

    public C24134() {
        this.f76567 = Collections.EMPTY_LIST;
        this.f76565 = 0;
        this.f76566 = 0;
    }

    public C24134(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f76567 = Collections.EMPTY_LIST;
        this.f76565 = 0;
        this.f76566 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53381() {
        super.clear();
        this.f76568 = 0;
        C15969 c15969 = this.f76569;
        if (c15969 == null) {
            this.f76567 = Collections.EMPTY_LIST;
        } else {
            this.f76567 = null;
            c15969.m36302();
        }
        this.f76568 &= -2;
        this.f76565 = 0;
        this.f76566 = 0;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35200;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C12716.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C12716.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C12716 c12716BuildPartial = buildPartial();
        if (c12716BuildPartial.isInitialized()) {
            return c12716BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c12716BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C12716 c12716BuildPartial = buildPartial();
        if (c12716BuildPartial.isInitialized()) {
            return c12716BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c12716BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C12716 buildPartial() {
        int i = 0;
        C12716 c12716 = new C12716(this, 0);
        C15969 c15969 = this.f76569;
        if (c15969 != null) {
            c12716.f35707 = c15969.m36296();
        } else {
            if ((this.f76568 & 1) != 0) {
                this.f76567 = C21562.unmodifiableList(this.f76567);
                this.f76568 &= -2;
            }
            c12716.f35707 = this.f76567;
        }
        int i2 = this.f76568;
        if (i2 != 0) {
            if ((i2 & 2) != 0) {
                c12716.f35703 = this.f76565;
                i = 1;
            }
            if ((i2 & 4) != 0) {
                c12716.f35705 = this.f76566;
                i |= 2;
            }
            c12716.f35706 = i | c12716.f35706;
        }
        onBuilt();
        return c12716;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C12716) {
            m53383((C12716) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C12716) {
            m53383((C12716) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53383(C12716 c12716) {
        if (c12716 == C12716.getDefaultInstance()) {
            return;
        }
        if (this.f76569 == null) {
            if (!c12716.f35707.isEmpty()) {
                if (this.f76567.isEmpty()) {
                    this.f76567 = c12716.f35707;
                    this.f76568 &= -2;
                } else {
                    if ((this.f76568 & 1) == 0) {
                        this.f76567 = new ArrayList(this.f76567);
                        this.f76568 |= 1;
                    }
                    this.f76567.addAll(c12716.f35707);
                }
                onChanged();
            }
        } else if (!c12716.f35707.isEmpty()) {
            if (!this.f76569.m36307()) {
                this.f76569.m36294(c12716.f35707);
            } else {
                this.f76569.m36305();
                C15969 c15969 = null;
                this.f76569 = null;
                List list = c12716.f35707;
                this.f76567 = list;
                this.f76568 &= -2;
                if (AbstractC6285.alwaysUseFieldBuilders) {
                    if (this.f76569 == null) {
                        this.f76569 = new C15969(list, false, getParentForChildren(), isClean());
                        this.f76567 = null;
                    }
                    c15969 = this.f76569;
                }
                this.f76569 = c15969;
            }
        }
        if (c12716.m29237()) {
            EnumC5674 enumC5674M29236 = c12716.m29236();
            enumC5674M29236.getClass();
            this.f76568 |= 2;
            this.f76565 = enumC5674M29236.getNumber();
            onChanged();
        }
        if (c12716.m29235()) {
            EnumC5674 enumC5674M29238 = c12716.m29238();
            enumC5674M29238.getClass();
            this.f76568 |= 4;
            this.f76566 = enumC5674M29238.getNumber();
            onChanged();
        }
        mergeUnknownFields(c12716.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53382(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 10) {
                            C3998 c3998 = (C3998) abstractC9303.mo21520(C3998.parser(), c19283);
                            C15969 c15969 = this.f76569;
                            if (c15969 != null) {
                                c15969.m36299(c3998);
                            } else {
                                if ((this.f76568 & 1) == 0) {
                                    this.f76567 = new ArrayList(this.f76567);
                                    this.f76568 |= 1;
                                }
                                this.f76567.add(c3998);
                            }
                        } else if (iMo21535 == 32) {
                            int iMo21528 = abstractC9303.mo21528();
                            if (EnumC5674.m12645(iMo21528) == null) {
                                mergeUnknownVarintField(4, iMo21528);
                            } else {
                                this.f76565 = iMo21528;
                                this.f76568 |= 2;
                            }
                        } else if (iMo21535 == 40) {
                            int iMo21529 = abstractC9303.mo21528();
                            if (EnumC5674.m12645(iMo21529) == null) {
                                mergeUnknownVarintField(5, iMo21529);
                            } else {
                                this.f76566 = iMo21529;
                                this.f76568 |= 4;
                            }
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
        C3998 c3998;
        int i = 0;
        while (true) {
            C15969 c15969 = this.f76569;
            if (c15969 == null) {
                iM36300 = this.f76567.size();
            } else {
                iM36300 = c15969.m36300();
            }
            if (i >= iM36300) {
                return true;
            }
            C15969 c159610 = this.f76569;
            if (c159610 == null) {
                c3998 = (C3998) this.f76567.get(i);
            } else {
                c3998 = (C3998) c159610.m36297(i);
            }
            if (!c3998.isInitialized()) {
                return false;
            }
            i++;
        }
    }
}
