package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10704 extends AbstractC5202 {

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f29646;

    /* JADX INFO: renamed from: ۗ */
    public boolean f29647;

    /* JADX INFO: renamed from: ۙ */
    public boolean f29648;

    /* JADX INFO: renamed from: ۛ */
    public C3327 f29649;

    /* JADX INFO: renamed from: ۟ */
    public boolean f29650;

    /* JADX INFO: renamed from: ۤ */
    public C17310 f29651;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f29652;

    /* JADX INFO: renamed from: ۨ */
    public C17310 f29653;

    /* JADX INFO: renamed from: ۫ */
    public List f29654;

    /* JADX INFO: renamed from: ۬ */
    public C15969 f29655;

    /* JADX INFO: renamed from: ܰ */
    public int f29656;

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean f29657;

    /* JADX INFO: renamed from: ܽ֫ */
    public List f29658;

    /* JADX INFO: renamed from: ܿ֫ */
    public List f29659;

    /* JADX INFO: renamed from: ᩳ֫ */
    public C15969 f29660;

    /* JADX INFO: renamed from: ᩶ */
    public int f29661;

    /* JADX INFO: renamed from: ᩹ */
    public int f29662;

    /* JADX INFO: renamed from: ᩺ */
    public C8041 f29663;

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean f29664;

    public C10704(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f29661 = 0;
        this.f29656 = 0;
        this.f29652 = 0;
        List list = Collections.EMPTY_LIST;
        this.f29658 = list;
        this.f29654 = list;
        this.f29659 = list;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m24630();
            m24628();
            m24629();
            m24632();
        }
    }

    public /* synthetic */ C10704(int i) {
        this();
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC5202 clear() {
        m24635();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m24635();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m24635();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m24635();
        return this;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m24635();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m24634(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m24634(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m24634(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m24634(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35216;
        c11650.m26787(C5339.class, C10704.class);
        return c11650;
    }

    public C10704() {
        this.f29661 = 0;
        this.f29656 = 0;
        this.f29652 = 0;
        List list = Collections.EMPTY_LIST;
        this.f29658 = list;
        this.f29654 = list;
        this.f29659 = list;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m24630();
            m24628();
            m24629();
            m24632();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m24635() {
        super.clear();
        this.f29662 = 0;
        this.f29661 = 0;
        this.f29646 = false;
        this.f29656 = 0;
        this.f29650 = false;
        this.f29657 = false;
        this.f29647 = false;
        this.f29664 = false;
        this.f29648 = false;
        this.f29652 = 0;
        List list = Collections.EMPTY_LIST;
        this.f29658 = list;
        this.f29662 = 0;
        C15969 c15969 = this.f29655;
        if (c15969 == null) {
            this.f29654 = list;
        } else {
            this.f29654 = null;
            c15969.m36302();
        }
        this.f29662 &= -1025;
        this.f29663 = null;
        C17310 c17310 = this.f29653;
        if (c17310 != null) {
            c17310.m39271();
            this.f29653 = null;
        }
        this.f29649 = null;
        C17310 c17311 = this.f29651;
        if (c17311 != null) {
            c17311.m39271();
            this.f29651 = null;
        }
        C15969 c159610 = this.f29660;
        if (c159610 == null) {
            this.f29659 = list;
        } else {
            this.f29659 = null;
            c159610.m36302();
        }
        this.f29662 &= -8193;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35193;
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C5339.getDefaultInstance();
    }

    @Override // p067l.AbstractC5202, p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C5339.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C5339 c5339BuildPartial = buildPartial();
        if (c5339BuildPartial.isInitialized()) {
            return c5339BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c5339BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C5339 c5339BuildPartial = buildPartial();
        if (c5339BuildPartial.isInitialized()) {
            return c5339BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c5339BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C5339 buildPartial() {
        int i;
        C3327 c3327;
        C8041 c8041;
        C5339 c5339 = new C5339(this);
        if ((this.f29662 & 512) != 0) {
            this.f29658 = C21562.unmodifiableList(this.f29658);
            this.f29662 &= -513;
        }
        c5339.f12575 = this.f29658;
        C15969 c15969 = this.f29655;
        if (c15969 != null) {
            c5339.f12584 = c15969.m36296();
        } else {
            if ((this.f29662 & 1024) != 0) {
                this.f29654 = C21562.unmodifiableList(this.f29654);
                this.f29662 &= -1025;
            }
            c5339.f12584 = this.f29654;
        }
        C15969 c159610 = this.f29660;
        if (c159610 != null) {
            c5339.f12581 = c159610.m36296();
        } else {
            if ((this.f29662 & 8192) != 0) {
                this.f29659 = C21562.unmodifiableList(this.f29659);
                this.f29662 &= -8193;
            }
            c5339.f12581 = this.f29659;
        }
        int i2 = this.f29662;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c5339.f12588 = this.f29661;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c5339.f12585 = this.f29646;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c5339.f12578 = this.f29656;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c5339.f12582 = this.f29650;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c5339.f12586 = this.f29657;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                c5339.f12576 = this.f29647;
                i |= 32;
            }
            if ((i2 & 64) != 0) {
                c5339.f12587 = this.f29664;
                i |= 64;
            }
            if ((i2 & 128) != 0) {
                c5339.f12577 = this.f29648;
                i |= 128;
            }
            if ((i2 & 256) != 0) {
                c5339.f12579 = this.f29652;
                i |= 256;
            }
            if ((i2 & 2048) != 0) {
                C17310 c17310 = this.f29653;
                if (c17310 == null) {
                    c8041 = this.f29663;
                } else {
                    c8041 = (C8041) c17310.m39268();
                }
                c5339.f12580 = c8041;
                i |= 512;
            }
            if ((i2 & 4096) != 0) {
                C17310 c17311 = this.f29651;
                if (c17311 == null) {
                    c3327 = this.f29649;
                } else {
                    c3327 = (C3327) c17311.m39268();
                }
                c5339.f12583 = c3327;
                i |= 1024;
            }
            c5339.f12589 = i | c5339.f12589;
        }
        onBuilt();
        return c5339;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C5339) {
            m24633((C5339) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C5339) {
            m24633((C5339) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24633(C5339 c5339) {
        C3327 c3327;
        C8041 c8041;
        if (c5339 == C5339.getDefaultInstance()) {
            return;
        }
        if (c5339.m11594()) {
            EnumC4669 enumC4669M11584 = c5339.m11584();
            enumC4669M11584.getClass();
            this.f29662 |= 1;
            this.f29661 = enumC4669M11584.getNumber();
            onChanged();
        }
        if (c5339.m11585()) {
            this.f29646 = c5339.m11581();
            this.f29662 |= 2;
            onChanged();
        }
        if (c5339.m11588()) {
            EnumC16737 enumC16737M11592 = c5339.m11592();
            enumC16737M11592.getClass();
            this.f29662 |= 4;
            this.f29656 = enumC16737M11592.getNumber();
            onChanged();
        }
        if (c5339.m11587()) {
            this.f29650 = c5339.m11575();
            this.f29662 |= 8;
            onChanged();
        }
        if (c5339.m11586()) {
            this.f29657 = c5339.m11583();
            this.f29662 |= 16;
            onChanged();
        }
        if (c5339.m11593()) {
            this.f29647 = c5339.m11577();
            this.f29662 |= 32;
            onChanged();
        }
        if (c5339.m11596()) {
            this.f29664 = c5339.m11589();
            this.f29662 |= 64;
            onChanged();
        }
        if (c5339.m11595()) {
            this.f29648 = c5339.m11590();
            this.f29662 |= 128;
            onChanged();
        }
        if (c5339.m11582()) {
            EnumC23444 enumC23444M11576 = c5339.m11576();
            enumC23444M11576.getClass();
            this.f29662 |= 256;
            this.f29652 = enumC23444M11576.getNumber();
            onChanged();
        }
        if (!c5339.f12575.isEmpty()) {
            if (this.f29658.isEmpty()) {
                this.f29658 = c5339.f12575;
                this.f29662 &= -513;
            } else {
                m24631();
                this.f29658.addAll(c5339.f12575);
            }
            onChanged();
        }
        if (this.f29655 == null) {
            if (!c5339.f12584.isEmpty()) {
                if (this.f29654.isEmpty()) {
                    this.f29654 = c5339.f12584;
                    this.f29662 &= -1025;
                } else {
                    if ((this.f29662 & 1024) == 0) {
                        this.f29654 = new ArrayList(this.f29654);
                        this.f29662 |= 1024;
                    }
                    this.f29654.addAll(c5339.f12584);
                }
                onChanged();
            }
        } else if (!c5339.f12584.isEmpty()) {
            if (!this.f29655.m36307()) {
                this.f29655.m36294(c5339.f12584);
            } else {
                this.f29655.m36305();
                this.f29655 = null;
                this.f29654 = c5339.f12584;
                this.f29662 &= -1025;
                this.f29655 = AbstractC6285.alwaysUseFieldBuilders ? m24630() : null;
            }
        }
        if (c5339.m11578()) {
            C8041 c8041M11591 = c5339.m11591();
            C17310 c17310 = this.f29653;
            if (c17310 == null) {
                if ((this.f29662 & 2048) == 0 || (c8041 = this.f29663) == null || c8041 == C8041.getDefaultInstance()) {
                    this.f29663 = c8041M11591;
                } else {
                    this.f29662 |= 2048;
                    onChanged();
                    ((C2676) m24628().m39273()).m4130(c8041M11591);
                }
            } else {
                c17310.m39267(c8041M11591);
            }
            if (this.f29663 != null) {
                this.f29662 |= 2048;
                onChanged();
            }
        }
        if (c5339.m11580()) {
            C3327 c3327M11579 = c5339.m11579();
            C17310 c17311 = this.f29651;
            if (c17311 == null) {
                if ((this.f29662 & 4096) == 0 || (c3327 = this.f29649) == null || c3327 == C3327.getDefaultInstance()) {
                    this.f29649 = c3327M11579;
                } else {
                    this.f29662 |= 4096;
                    onChanged();
                    ((C7351) m24629().m39273()).m17032(c3327M11579);
                }
            } else {
                c17311.m39267(c3327M11579);
            }
            if (this.f29649 != null) {
                this.f29662 |= 4096;
                onChanged();
            }
        }
        if (this.f29660 == null) {
            if (!c5339.f12581.isEmpty()) {
                if (this.f29659.isEmpty()) {
                    this.f29659 = c5339.f12581;
                    this.f29662 &= -8193;
                } else {
                    if ((this.f29662 & 8192) == 0) {
                        this.f29659 = new ArrayList(this.f29659);
                        this.f29662 |= 8192;
                    }
                    this.f29659.addAll(c5339.f12581);
                }
                onChanged();
            }
        } else if (!c5339.f12581.isEmpty()) {
            if (!this.f29660.m36307()) {
                this.f29660.m36294(c5339.f12581);
            } else {
                this.f29660.m36305();
                this.f29660 = null;
                this.f29659 = c5339.f12581;
                this.f29662 &= -8193;
                this.f29660 = AbstractC6285.alwaysUseFieldBuilders ? m24632() : null;
            }
        }
        m11167((AbstractC13919) c5339);
        mergeUnknownFields(c5339.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24634(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    switch (iMo21535) {
                        case 0:
                            break;
                        case 8:
                            int iMo21528 = abstractC9303.mo21528();
                            if (EnumC4669.m9895(iMo21528) == null) {
                                mergeUnknownVarintField(1, iMo21528);
                            } else {
                                this.f29661 = iMo21528;
                                this.f29662 |= 1;
                                continue;
                            }
                            break;
                        case 16:
                            this.f29646 = abstractC9303.mo21539();
                            this.f29662 |= 2;
                            continue;
                        case 24:
                            this.f29647 = abstractC9303.mo21539();
                            this.f29662 |= 32;
                            continue;
                        case 40:
                            this.f29650 = abstractC9303.mo21539();
                            this.f29662 |= 8;
                            continue;
                        case 48:
                            int iMo21529 = abstractC9303.mo21528();
                            if (EnumC16737.m37972(iMo21529) == null) {
                                mergeUnknownVarintField(6, iMo21529);
                            } else {
                                this.f29656 = iMo21529;
                                this.f29662 |= 4;
                                continue;
                            }
                            break;
                        case 80:
                            this.f29664 = abstractC9303.mo21539();
                            this.f29662 |= 64;
                            continue;
                        case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                            this.f29657 = abstractC9303.mo21539();
                            this.f29662 |= 16;
                            continue;
                        case 128:
                            this.f29648 = abstractC9303.mo21539();
                            this.f29662 |= 128;
                            continue;
                        case 136:
                            int iMo215210 = abstractC9303.mo21528();
                            if (EnumC23444.m52143(iMo215210) == null) {
                                mergeUnknownVarintField(17, iMo215210);
                            } else {
                                this.f29652 = iMo215210;
                                this.f29662 |= 256;
                                continue;
                            }
                            break;
                        case 152:
                            int iMo215211 = abstractC9303.mo21528();
                            if (EnumC6680.m15195(iMo215211) == null) {
                                mergeUnknownVarintField(19, iMo215211);
                            } else {
                                m24631();
                                this.f29658.add(Integer.valueOf(iMo215211));
                                continue;
                            }
                            break;
                        case EnumC19222.f57460 /* 154 */:
                            int iMo21538 = abstractC9303.mo21538(abstractC9303.mo21526());
                            while (abstractC9303.mo21532() > 0) {
                                int iMo215212 = abstractC9303.mo21528();
                                if (EnumC6680.m15195(iMo215212) == null) {
                                    mergeUnknownVarintField(19, iMo215212);
                                } else {
                                    m24631();
                                    this.f29658.add(Integer.valueOf(iMo215212));
                                }
                            }
                            abstractC9303.mo21533(iMo21538);
                            continue;
                        case 162:
                            C20763 c20763 = (C20763) abstractC9303.mo21520(C20763.parser(), c19283);
                            C15969 c15969 = this.f29655;
                            if (c15969 != null) {
                                c15969.m36299(c20763);
                                continue;
                            } else {
                                if ((this.f29662 & 1024) == 0) {
                                    this.f29654 = new ArrayList(this.f29654);
                                    this.f29662 |= 1024;
                                }
                                this.f29654.add(c20763);
                            }
                            break;
                        case 170:
                            abstractC9303.mo21524(m24628().m39273(), c19283);
                            this.f29662 |= 2048;
                            continue;
                        case 178:
                            abstractC9303.mo21524(m24629().m39273(), c19283);
                            this.f29662 |= 4096;
                            continue;
                        case 7994:
                            C3821 c3821 = (C3821) abstractC9303.mo21520(C3821.parser(), c19283);
                            C15969 c159610 = this.f29660;
                            if (c159610 != null) {
                                c159610.m36299(c3821);
                                continue;
                            } else {
                                if ((this.f29662 & 8192) == 0) {
                                    this.f29659 = new ArrayList(this.f29659);
                                    this.f29662 |= 8192;
                                }
                                this.f29659.add(c3821);
                            }
                            break;
                        default:
                            if (!parseUnknownField(abstractC9303, c19283, iMo21535)) {
                                break;
                            }
                            break;
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

    /* JADX INFO: renamed from: ᩳ */
    private void m24631() {
        if ((this.f29662 & 512) == 0) {
            this.f29658 = new ArrayList(this.f29658);
            this.f29662 |= 512;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private C15969 m24630() {
        if (this.f29655 == null) {
            this.f29655 = new C15969(this.f29654, (this.f29662 & 1024) != 0, getParentForChildren(), isClean());
            this.f29654 = null;
        }
        return this.f29655;
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
        if ((this.f29662 & 2048) == 0) {
            i = 0;
            while (true) {
                c15969 = this.f29660;
                if (c15969 == null) {
                    iM36300 = this.f29659.size();
                } else {
                    iM36300 = c15969.m36300();
                }
                if (i < iM36300) {
                    if (!m11168()) {
                        break;
                    }
                    return true;
                }
                c159610 = this.f29660;
                if (c159610 == null) {
                    c3821 = (C3821) this.f29659.get(i);
                } else {
                    c3821 = (C3821) c159610.m36297(i);
                }
                if (!c3821.isInitialized()) {
                    break;
                }
                i++;
            }
        } else {
            C17310 c17310 = this.f29653;
            if (c17310 == null) {
                defaultInstance = this.f29663;
                if (defaultInstance == null) {
                    defaultInstance = C8041.getDefaultInstance();
                }
            } else {
                defaultInstance = (C8041) c17310.m39272();
            }
            if (defaultInstance.isInitialized()) {
                i = 0;
                while (true) {
                    c15969 = this.f29660;
                    if (c15969 == null) {
                        iM36300 = this.f29659.size();
                    } else {
                        iM36300 = c15969.m36300();
                    }
                    if (i < iM36300) {
                        if (!m11168()) {
                            break;
                        }
                        return true;
                    }
                    c159610 = this.f29660;
                    if (c159610 == null) {
                        c3821 = (C3821) this.f29659.get(i);
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

    /* JADX INFO: renamed from: ۜ */
    private C17310 m24628() {
        C8041 defaultInstance;
        C17310 c17310 = this.f29653;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f29663;
                if (defaultInstance == null) {
                    defaultInstance = C8041.getDefaultInstance();
                }
            } else {
                defaultInstance = (C8041) c17310.m39272();
            }
            this.f29653 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f29663 = null;
        }
        return this.f29653;
    }

    /* JADX INFO: renamed from: ܳ */
    private C17310 m24629() {
        C3327 defaultInstance;
        C17310 c17310 = this.f29651;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f29649;
                if (defaultInstance == null) {
                    defaultInstance = C3327.getDefaultInstance();
                }
            } else {
                defaultInstance = (C3327) c17310.m39272();
            }
            this.f29651 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f29649 = null;
        }
        return this.f29651;
    }

    /* JADX INFO: renamed from: ᩷ */
    private C15969 m24632() {
        if (this.f29660 == null) {
            this.f29660 = new C15969(this.f29659, (this.f29662 & 8192) != 0, getParentForChildren(), isClean());
            this.f29659 = null;
        }
        return this.f29660;
    }
}
