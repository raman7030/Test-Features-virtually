package p067l;

import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ᩳۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19421 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ۗ */
    public int f59131;

    /* JADX INFO: renamed from: ۙ */
    public Object f59132;

    /* JADX INFO: renamed from: ۛ */
    public C17310 f59133;

    /* JADX INFO: renamed from: ۟ */
    public int f59134;

    /* JADX INFO: renamed from: ۤ */
    public int f59135;

    /* JADX INFO: renamed from: ۨ */
    public C5339 f59136;

    /* JADX INFO: renamed from: ۫ */
    public int f59137;

    /* JADX INFO: renamed from: ۬ */
    public Object f59138;

    /* JADX INFO: renamed from: ܰ */
    public Object f59139;

    /* JADX INFO: renamed from: ᩶ */
    public Object f59140;

    /* JADX INFO: renamed from: ᩸ */
    public int f59141;

    /* JADX INFO: renamed from: ᩹ */
    public Object f59142;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f59143;

    public /* synthetic */ C19421(int i) {
        this();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m44192();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m44192();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m44192();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m44192();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m44193(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m44193(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m44193(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m44193(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35204;
        c11650.m26787(C22104.class, C19421.class);
        return c11650;
    }

    public C19421() {
        this.f59138 = "";
        this.f59131 = 1;
        this.f59134 = 1;
        this.f59139 = "";
        this.f59140 = "";
        this.f59142 = "";
        this.f59132 = "";
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m44191();
        }
    }

    public C19421(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f59138 = "";
        this.f59131 = 1;
        this.f59134 = 1;
        this.f59139 = "";
        this.f59140 = "";
        this.f59142 = "";
        this.f59132 = "";
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m44191();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44192() {
        super.clear();
        this.f59141 = 0;
        this.f59138 = "";
        this.f59137 = 0;
        this.f59131 = 1;
        this.f59134 = 1;
        this.f59139 = "";
        this.f59140 = "";
        this.f59142 = "";
        this.f59135 = 0;
        this.f59132 = "";
        this.f59136 = null;
        C17310 c17310 = this.f59133;
        if (c17310 != null) {
            c17310.m39271();
            this.f59133 = null;
        }
        this.f59143 = false;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35214;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C22104.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C22104.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C22104 c22104BuildPartial = buildPartial();
        if (c22104BuildPartial.isInitialized()) {
            return c22104BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c22104BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C22104 c22104BuildPartial = buildPartial();
        if (c22104BuildPartial.isInitialized()) {
            return c22104BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c22104BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C22104 buildPartial() {
        C5339 c5339;
        int i = 0;
        C22104 c22104 = new C22104(this, 0);
        int i2 = this.f59141;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c22104.f69948 = this.f59138;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c22104.f69946 = this.f59137;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c22104.f69942 = this.f59131;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c22104.f69945 = this.f59134;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c22104.f69950 = this.f59139;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                c22104.f69951 = this.f59140;
                i |= 32;
            }
            if ((i2 & 64) != 0) {
                c22104.f69953 = this.f59142;
                i |= 64;
            }
            if ((i2 & 128) != 0) {
                c22104.f69944 = this.f59135;
                i |= 128;
            }
            if ((i2 & 256) != 0) {
                c22104.f69943 = this.f59132;
                i |= 256;
            }
            if ((i2 & 512) != 0) {
                C17310 c17310 = this.f59133;
                if (c17310 == null) {
                    c5339 = this.f59136;
                } else {
                    c5339 = (C5339) c17310.m39268();
                }
                c22104.f69947 = c5339;
                i |= 512;
            }
            if ((i2 & 1024) != 0) {
                c22104.f69954 = this.f59143;
                i |= 1024;
            }
            c22104.f69952 = i | c22104.f69952;
        }
        onBuilt();
        return c22104;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C22104) {
            m44194((C22104) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C22104) {
            m44194((C22104) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44194(C22104 c22104) {
        C5339 c5339;
        if (c22104 == C22104.getDefaultInstance()) {
            return;
        }
        if (c22104.hasName()) {
            this.f59138 = c22104.f69948;
            this.f59141 |= 1;
            onChanged();
        }
        if (c22104.m49794()) {
            this.f59137 = c22104.m49795();
            this.f59141 |= 2;
            onChanged();
        }
        if (c22104.m49791()) {
            EnumC16067 enumC16067M49792 = c22104.m49792();
            enumC16067M49792.getClass();
            this.f59141 |= 4;
            this.f59131 = enumC16067M49792.getNumber();
            onChanged();
        }
        if (c22104.hasType()) {
            EnumC8692 type = c22104.getType();
            type.getClass();
            this.f59141 |= 8;
            this.f59134 = type.getNumber();
            onChanged();
        }
        if (c22104.m49788()) {
            this.f59139 = c22104.f69950;
            this.f59141 |= 16;
            onChanged();
        }
        if (c22104.m49789()) {
            this.f59140 = c22104.f69951;
            this.f59141 |= 32;
            onChanged();
        }
        if (c22104.m49784()) {
            this.f59142 = c22104.f69953;
            this.f59141 |= 64;
            onChanged();
        }
        if (c22104.m49800()) {
            this.f59135 = c22104.m49786();
            this.f59141 |= 128;
            onChanged();
        }
        if (c22104.m49785()) {
            this.f59132 = c22104.f69943;
            this.f59141 |= 256;
            onChanged();
        }
        if (c22104.m49801()) {
            C5339 c5339M49787 = c22104.m49787();
            C17310 c17310 = this.f59133;
            if (c17310 == null) {
                if ((this.f59141 & 512) == 0 || (c5339 = this.f59136) == null || c5339 == C5339.getDefaultInstance()) {
                    this.f59136 = c5339M49787;
                } else {
                    this.f59141 |= 512;
                    onChanged();
                    ((C10704) m44191().m39273()).m24633(c5339M49787);
                }
            } else {
                c17310.m39267(c5339M49787);
            }
            if (this.f59136 != null) {
                this.f59141 |= 512;
                onChanged();
            }
        }
        if (c22104.m49798()) {
            this.f59143 = c22104.m49796();
            this.f59141 |= 1024;
            onChanged();
        }
        mergeUnknownFields(c22104.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44193(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    switch (iMo21535) {
                        case 0:
                            break;
                        case 10:
                            this.f59138 = abstractC9303.mo21534();
                            this.f59141 |= 1;
                            continue;
                        case 18:
                            this.f59140 = abstractC9303.mo21534();
                            this.f59141 |= 32;
                            continue;
                        case 24:
                            this.f59137 = abstractC9303.mo21536();
                            this.f59141 |= 2;
                            continue;
                        case 32:
                            int iMo21528 = abstractC9303.mo21528();
                            if (EnumC16067.m36572(iMo21528) == null) {
                                mergeUnknownVarintField(4, iMo21528);
                            } else {
                                this.f59131 = iMo21528;
                                this.f59141 |= 4;
                                continue;
                            }
                            break;
                        case 40:
                            int iMo21529 = abstractC9303.mo21528();
                            if (EnumC8692.m20122(iMo21529) == null) {
                                mergeUnknownVarintField(5, iMo21529);
                            } else {
                                this.f59134 = iMo21529;
                                this.f59141 |= 8;
                                continue;
                            }
                            break;
                        case 50:
                            this.f59139 = abstractC9303.mo21534();
                            this.f59141 |= 16;
                            continue;
                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            this.f59142 = abstractC9303.mo21534();
                            this.f59141 |= 64;
                            continue;
                        case 66:
                            abstractC9303.mo21524(m44191().m39273(), c19283);
                            this.f59141 |= 512;
                            continue;
                        case 72:
                            this.f59135 = abstractC9303.mo21536();
                            this.f59141 |= 128;
                            continue;
                        case 82:
                            this.f59132 = abstractC9303.mo21534();
                            this.f59141 |= 256;
                            continue;
                        case 136:
                            this.f59143 = abstractC9303.mo21539();
                            this.f59141 |= 1024;
                            continue;
                        default:
                            if (!super.parseUnknownField(abstractC9303, c19283, iMo21535)) {
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

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        C5339 defaultInstance;
        if ((this.f59141 & 512) == 0) {
            return true;
        }
        C17310 c17310 = this.f59133;
        if (c17310 == null) {
            defaultInstance = this.f59136;
            if (defaultInstance == null) {
                defaultInstance = C5339.getDefaultInstance();
            }
        } else {
            defaultInstance = (C5339) c17310.m39272();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ܽ */
    private C17310 m44191() {
        C5339 defaultInstance;
        C17310 c17310 = this.f59133;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f59136;
                if (defaultInstance == null) {
                    defaultInstance = C5339.getDefaultInstance();
                }
            } else {
                defaultInstance = (C5339) c17310.m39272();
            }
            this.f59133 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f59136 = null;
        }
        return this.f59133;
    }
}
