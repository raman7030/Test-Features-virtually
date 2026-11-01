package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.֡᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2991 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ֫֫ */
    public List f5279;

    /* JADX INFO: renamed from: ۗ */
    public C15969 f5280;

    /* JADX INFO: renamed from: ۙ */
    public C15969 f5281;

    /* JADX INFO: renamed from: ۛ */
    public List f5282;

    /* JADX INFO: renamed from: ۟ */
    public C15969 f5283;

    /* JADX INFO: renamed from: ۤ */
    public C15969 f5284;

    /* JADX INFO: renamed from: ۧ֫ */
    public C17310 f5285;

    /* JADX INFO: renamed from: ۨ */
    public Object f5286;

    /* JADX INFO: renamed from: ۫ */
    public List f5287;

    /* JADX INFO: renamed from: ۬ */
    public List f5288;

    /* JADX INFO: renamed from: ܰ */
    public List f5289;

    /* JADX INFO: renamed from: ܳ֫ */
    public List f5290;

    /* JADX INFO: renamed from: ܽ֫ */
    public C18274 f5291;

    /* JADX INFO: renamed from: ܿ֫ */
    public C15969 f5292;

    /* JADX INFO: renamed from: ᩳ֫ */
    public C4964 f5293;

    /* JADX INFO: renamed from: ᩶ */
    public List f5294;

    /* JADX INFO: renamed from: ᩸ */
    public int f5295;

    /* JADX INFO: renamed from: ᩹ */
    public C15969 f5296;

    /* JADX INFO: renamed from: ᩺ */
    public C15969 f5297;

    public /* synthetic */ C2991(int i) {
        this();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m55692clear();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m55692clear();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m55692clear();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m55692clear();
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
        C11650 c11650 = C12539.f35205;
        c11650.m26787(C21768.class, C2991.class);
        return c11650;
    }

    public C2991() {
        this.f5286 = "";
        List list = Collections.EMPTY_LIST;
        this.f5282 = list;
        this.f5287 = list;
        this.f5289 = list;
        this.f5294 = list;
        this.f5288 = list;
        this.f5279 = list;
        this.f5290 = list;
        this.f5293 = C4964.m10513();
        maybeForceBuilderInitialization();
    }

    public C2991(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f5286 = "";
        List list = Collections.EMPTY_LIST;
        this.f5282 = list;
        this.f5287 = list;
        this.f5289 = list;
        this.f5294 = list;
        this.f5288 = list;
        this.f5279 = list;
        this.f5290 = list;
        this.f5293 = C4964.m10513();
        maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m5019();
            m5022();
            m5016();
            m5020();
            m5021();
            m5023();
            m5018();
            m5017();
        }
    }

    /* JADX INFO: renamed from: clear, reason: collision with other method in class */
    public final void m55692clear() {
        super.clear();
        this.f5295 = 0;
        this.f5286 = "";
        C15969 c15969 = this.f5284;
        if (c15969 == null) {
            this.f5282 = Collections.EMPTY_LIST;
        } else {
            this.f5282 = null;
            c15969.m36302();
        }
        this.f5295 &= -3;
        C15969 c159610 = this.f5281;
        if (c159610 == null) {
            this.f5287 = Collections.EMPTY_LIST;
        } else {
            this.f5287 = null;
            c159610.m36302();
        }
        this.f5295 &= -5;
        C15969 c159611 = this.f5297;
        if (c159611 == null) {
            this.f5289 = Collections.EMPTY_LIST;
        } else {
            this.f5289 = null;
            c159611.m36302();
        }
        this.f5295 &= -9;
        C15969 c159612 = this.f5296;
        if (c159612 == null) {
            this.f5294 = Collections.EMPTY_LIST;
        } else {
            this.f5294 = null;
            c159612.m36302();
        }
        this.f5295 &= -17;
        C15969 c159613 = this.f5280;
        if (c159613 == null) {
            this.f5288 = Collections.EMPTY_LIST;
        } else {
            this.f5288 = null;
            c159613.m36302();
        }
        this.f5295 &= -33;
        C15969 c159614 = this.f5283;
        if (c159614 == null) {
            this.f5279 = Collections.EMPTY_LIST;
        } else {
            this.f5279 = null;
            c159614.m36302();
        }
        this.f5295 &= -65;
        this.f5291 = null;
        C17310 c17310 = this.f5285;
        if (c17310 != null) {
            c17310.m39271();
            this.f5285 = null;
        }
        C15969 c159615 = this.f5292;
        if (c159615 == null) {
            this.f5290 = Collections.EMPTY_LIST;
        } else {
            this.f5290 = null;
            c159615.m36302();
        }
        this.f5295 &= -257;
        this.f5293 = C4964.m10513();
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35248;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C21768.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C21768.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C21768 build() {
        C21768 c21768BuildPartial = buildPartial();
        if (c21768BuildPartial.isInitialized()) {
            return c21768BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c21768BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C21768 buildPartial() {
        C18274 c18274;
        int i = 0;
        C21768 c21768 = new C21768(this, 0);
        C15969 c15969 = this.f5284;
        if (c15969 != null) {
            c21768.f68530 = c15969.m36296();
        } else {
            if ((this.f5295 & 2) != 0) {
                this.f5282 = C21562.unmodifiableList(this.f5282);
                this.f5295 &= -3;
            }
            c21768.f68530 = this.f5282;
        }
        C15969 c159610 = this.f5281;
        if (c159610 != null) {
            c21768.f68531 = c159610.m36296();
        } else {
            if ((this.f5295 & 4) != 0) {
                this.f5287 = C21562.unmodifiableList(this.f5287);
                this.f5295 &= -5;
            }
            c21768.f68531 = this.f5287;
        }
        C15969 c159611 = this.f5297;
        if (c159611 != null) {
            c21768.f68533 = c159611.m36296();
        } else {
            if ((this.f5295 & 8) != 0) {
                this.f5289 = C21562.unmodifiableList(this.f5289);
                this.f5295 &= -9;
            }
            c21768.f68533 = this.f5289;
        }
        C15969 c159612 = this.f5296;
        if (c159612 != null) {
            c21768.f68540 = c159612.m36296();
        } else {
            if ((this.f5295 & 16) != 0) {
                this.f5294 = C21562.unmodifiableList(this.f5294);
                this.f5295 &= -17;
            }
            c21768.f68540 = this.f5294;
        }
        C15969 c159613 = this.f5280;
        if (c159613 != null) {
            c21768.f68538 = c159613.m36296();
        } else {
            if ((this.f5295 & 32) != 0) {
                this.f5288 = C21562.unmodifiableList(this.f5288);
                this.f5295 &= -33;
            }
            c21768.f68538 = this.f5288;
        }
        C15969 c159614 = this.f5283;
        if (c159614 != null) {
            c21768.f68532 = c159614.m36296();
        } else {
            if ((this.f5295 & 64) != 0) {
                this.f5279 = C21562.unmodifiableList(this.f5279);
                this.f5295 &= -65;
            }
            c21768.f68532 = this.f5279;
        }
        C15969 c159615 = this.f5292;
        if (c159615 != null) {
            c21768.f68537 = c159615.m36296();
        } else {
            if ((this.f5295 & 256) != 0) {
                this.f5290 = C21562.unmodifiableList(this.f5290);
                this.f5295 &= -257;
            }
            c21768.f68537 = this.f5290;
        }
        int i2 = this.f5295;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c21768.f68535 = this.f5286;
                i = 1;
            }
            if ((i2 & 128) != 0) {
                C17310 c17310 = this.f5285;
                if (c17310 == null) {
                    c18274 = this.f5291;
                } else {
                    c18274 = (C18274) c17310.m39268();
                }
                c21768.f68534 = c18274;
                i |= 2;
            }
            if ((i2 & 512) != 0) {
                this.f5293.mo46787();
                c21768.f68541 = this.f5293;
            }
            c21768.f68539 = i | c21768.f68539;
        }
        onBuilt();
        return c21768;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C21768) {
            m5025((C21768) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C21768) {
            m5025((C21768) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5025(C21768 c21768) {
        C18274 c18274;
        if (c21768 == C21768.getDefaultInstance()) {
            return;
        }
        if (c21768.hasName()) {
            this.f5286 = c21768.f68535;
            this.f5295 |= 1;
            onChanged();
        }
        if (this.f5284 == null) {
            if (!c21768.f68530.isEmpty()) {
                if (this.f5282.isEmpty()) {
                    this.f5282 = c21768.f68530;
                    this.f5295 &= -3;
                } else {
                    if ((this.f5295 & 2) == 0) {
                        this.f5282 = new ArrayList(this.f5282);
                        this.f5295 |= 2;
                    }
                    this.f5282.addAll(c21768.f68530);
                }
                onChanged();
            }
        } else if (!c21768.f68530.isEmpty()) {
            if (!this.f5284.m36307()) {
                this.f5284.m36294(c21768.f68530);
            } else {
                this.f5284.m36305();
                this.f5284 = null;
                this.f5282 = c21768.f68530;
                this.f5295 &= -3;
                this.f5284 = AbstractC6285.alwaysUseFieldBuilders ? m5019() : null;
            }
        }
        if (this.f5281 == null) {
            if (!c21768.f68531.isEmpty()) {
                if (this.f5287.isEmpty()) {
                    this.f5287 = c21768.f68531;
                    this.f5295 &= -5;
                } else {
                    if ((this.f5295 & 4) == 0) {
                        this.f5287 = new ArrayList(this.f5287);
                        this.f5295 |= 4;
                    }
                    this.f5287.addAll(c21768.f68531);
                }
                onChanged();
            }
        } else if (!c21768.f68531.isEmpty()) {
            if (!this.f5281.m36307()) {
                this.f5281.m36294(c21768.f68531);
            } else {
                this.f5281.m36305();
                this.f5281 = null;
                this.f5287 = c21768.f68531;
                this.f5295 &= -5;
                this.f5281 = AbstractC6285.alwaysUseFieldBuilders ? m5022() : null;
            }
        }
        if (this.f5297 == null) {
            if (!c21768.f68533.isEmpty()) {
                if (this.f5289.isEmpty()) {
                    this.f5289 = c21768.f68533;
                    this.f5295 &= -9;
                } else {
                    if ((this.f5295 & 8) == 0) {
                        this.f5289 = new ArrayList(this.f5289);
                        this.f5295 |= 8;
                    }
                    this.f5289.addAll(c21768.f68533);
                }
                onChanged();
            }
        } else if (!c21768.f68533.isEmpty()) {
            if (!this.f5297.m36307()) {
                this.f5297.m36294(c21768.f68533);
            } else {
                this.f5297.m36305();
                this.f5297 = null;
                this.f5289 = c21768.f68533;
                this.f5295 &= -9;
                this.f5297 = AbstractC6285.alwaysUseFieldBuilders ? m5016() : null;
            }
        }
        if (this.f5296 == null) {
            if (!c21768.f68540.isEmpty()) {
                if (this.f5294.isEmpty()) {
                    this.f5294 = c21768.f68540;
                    this.f5295 &= -17;
                } else {
                    if ((this.f5295 & 16) == 0) {
                        this.f5294 = new ArrayList(this.f5294);
                        this.f5295 |= 16;
                    }
                    this.f5294.addAll(c21768.f68540);
                }
                onChanged();
            }
        } else if (!c21768.f68540.isEmpty()) {
            if (!this.f5296.m36307()) {
                this.f5296.m36294(c21768.f68540);
            } else {
                this.f5296.m36305();
                this.f5296 = null;
                this.f5294 = c21768.f68540;
                this.f5295 &= -17;
                this.f5296 = AbstractC6285.alwaysUseFieldBuilders ? m5020() : null;
            }
        }
        if (this.f5280 == null) {
            if (!c21768.f68538.isEmpty()) {
                if (this.f5288.isEmpty()) {
                    this.f5288 = c21768.f68538;
                    this.f5295 &= -33;
                } else {
                    m5015();
                    this.f5288.addAll(c21768.f68538);
                }
                onChanged();
            }
        } else if (!c21768.f68538.isEmpty()) {
            if (!this.f5280.m36307()) {
                this.f5280.m36294(c21768.f68538);
            } else {
                this.f5280.m36305();
                this.f5280 = null;
                this.f5288 = c21768.f68538;
                this.f5295 &= -33;
                this.f5280 = AbstractC6285.alwaysUseFieldBuilders ? m5021() : null;
            }
        }
        if (this.f5283 == null) {
            if (!c21768.f68532.isEmpty()) {
                if (this.f5279.isEmpty()) {
                    this.f5279 = c21768.f68532;
                    this.f5295 &= -65;
                } else {
                    if ((this.f5295 & 64) == 0) {
                        this.f5279 = new ArrayList(this.f5279);
                        this.f5295 |= 64;
                    }
                    this.f5279.addAll(c21768.f68532);
                }
                onChanged();
            }
        } else if (!c21768.f68532.isEmpty()) {
            if (!this.f5283.m36307()) {
                this.f5283.m36294(c21768.f68532);
            } else {
                this.f5283.m36305();
                this.f5283 = null;
                this.f5279 = c21768.f68532;
                this.f5295 &= -65;
                this.f5283 = AbstractC6285.alwaysUseFieldBuilders ? m5023() : null;
            }
        }
        if (c21768.m49089()) {
            C18274 c18274M49088 = c21768.m49088();
            C17310 c17310 = this.f5285;
            if (c17310 == null) {
                if ((this.f5295 & 128) == 0 || (c18274 = this.f5291) == null || c18274 == C18274.getDefaultInstance()) {
                    this.f5291 = c18274M49088;
                } else {
                    this.f5295 |= 128;
                    onChanged();
                    ((C12911) m5018().m39273()).m29586(c18274M49088);
                }
            } else {
                c17310.m39267(c18274M49088);
            }
            if (this.f5291 != null) {
                this.f5295 |= 128;
                onChanged();
            }
        }
        if (this.f5292 == null) {
            if (!c21768.f68537.isEmpty()) {
                if (this.f5290.isEmpty()) {
                    this.f5290 = c21768.f68537;
                    this.f5295 &= -257;
                } else {
                    if ((this.f5295 & 256) == 0) {
                        this.f5290 = new ArrayList(this.f5290);
                        this.f5295 |= 256;
                    }
                    this.f5290.addAll(c21768.f68537);
                }
                onChanged();
            }
        } else if (!c21768.f68537.isEmpty()) {
            if (!this.f5292.m36307()) {
                this.f5292.m36294(c21768.f68537);
            } else {
                this.f5292.m36305();
                this.f5292 = null;
                this.f5290 = c21768.f68537;
                this.f5295 &= -257;
                this.f5292 = AbstractC6285.alwaysUseFieldBuilders ? m5017() : null;
            }
        }
        if (!c21768.f68541.isEmpty()) {
            if (this.f5293.isEmpty()) {
                this.f5293 = c21768.f68541;
                this.f5295 |= 512;
            } else {
                if (!this.f5293.mo46785()) {
                    this.f5293 = new C4964(this.f5293);
                }
                this.f5295 |= 512;
                this.f5293.addAll(c21768.f68541);
            }
            onChanged();
        }
        mergeUnknownFields(c21768.getUnknownFields());
        onChanged();
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final C2991 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
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
                            this.f5286 = abstractC9303.mo21534();
                            this.f5295 |= 1;
                            continue;
                        case 18:
                            C22104 c22104 = (C22104) abstractC9303.mo21520(C22104.parser(), c19283);
                            C15969 c15969 = this.f5284;
                            if (c15969 != null) {
                                c15969.m36299(c22104);
                                continue;
                            } else {
                                if ((this.f5295 & 2) == 0) {
                                    this.f5282 = new ArrayList(this.f5282);
                                    this.f5295 |= 2;
                                }
                                this.f5282.add(c22104);
                            }
                            break;
                        case 26:
                            C21768 c21768 = (C21768) abstractC9303.mo21520(C21768.parser(), c19283);
                            C15969 c159610 = this.f5297;
                            if (c159610 != null) {
                                c159610.m36299(c21768);
                                continue;
                            } else {
                                if ((this.f5295 & 8) == 0) {
                                    this.f5289 = new ArrayList(this.f5289);
                                    this.f5295 |= 8;
                                }
                                this.f5289.add(c21768);
                            }
                            break;
                        case 34:
                            C24449 c24449 = (C24449) abstractC9303.mo21520(C24449.parser(), c19283);
                            C15969 c159611 = this.f5296;
                            if (c159611 != null) {
                                c159611.m36299(c24449);
                                continue;
                            } else {
                                if ((this.f5295 & 16) == 0) {
                                    this.f5294 = new ArrayList(this.f5294);
                                    this.f5295 |= 16;
                                }
                                this.f5294.add(c24449);
                            }
                            break;
                        case 42:
                            C10368 c10368 = (C10368) abstractC9303.mo21520(C10368.parser(), c19283);
                            C15969 c159612 = this.f5280;
                            if (c159612 == null) {
                                m5015();
                                this.f5288.add(c10368);
                            } else {
                                c159612.m36299(c10368);
                                continue;
                            }
                            break;
                        case 50:
                            C22104 c22105 = (C22104) abstractC9303.mo21520(C22104.parser(), c19283);
                            C15969 c159613 = this.f5281;
                            if (c159613 != null) {
                                c159613.m36299(c22105);
                                continue;
                            } else {
                                if ((this.f5295 & 4) == 0) {
                                    this.f5287 = new ArrayList(this.f5287);
                                    this.f5295 |= 4;
                                }
                                this.f5287.add(c22105);
                            }
                            break;
                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            abstractC9303.mo21524(m5018().m39273(), c19283);
                            this.f5295 |= 128;
                            continue;
                        case 66:
                            C6205 c6205 = (C6205) abstractC9303.mo21520(C6205.parser(), c19283);
                            C15969 c159614 = this.f5283;
                            if (c159614 != null) {
                                c159614.m36299(c6205);
                                continue;
                            } else {
                                if ((this.f5295 & 64) == 0) {
                                    this.f5279 = new ArrayList(this.f5279);
                                    this.f5295 |= 64;
                                }
                                this.f5279.add(c6205);
                            }
                            break;
                        case 74:
                            C23779 c23779 = (C23779) abstractC9303.mo21520(C23779.parser(), c19283);
                            C15969 c159615 = this.f5292;
                            if (c159615 != null) {
                                c159615.m36299(c23779);
                                continue;
                            } else {
                                if ((this.f5295 & 256) == 0) {
                                    this.f5290 = new ArrayList(this.f5290);
                                    this.f5295 |= 256;
                                }
                                this.f5290.add(c23779);
                            }
                            break;
                        case 82:
                            AbstractC7962 abstractC7962Mo21534 = abstractC9303.mo21534();
                            if (!this.f5293.mo46785()) {
                                this.f5293 = new C4964(this.f5293);
                            }
                            this.f5295 |= 512;
                            this.f5293.mo10516(abstractC7962Mo21534);
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
        return this;
    }

    public final void setName(String str) {
        str.getClass();
        this.f5286 = str;
        this.f5295 |= 1;
        onChanged();
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        int iM36300;
        int iM36301;
        int iM36302;
        int iM36303;
        int iM36304;
        int iM36305;
        C18274 defaultInstance;
        C6205 c6205;
        C10368 c10368;
        C24449 c24449;
        C21768 c21768;
        C22104 c22104;
        C22104 c22105;
        int i = 0;
        while (true) {
            C15969 c15969 = this.f5284;
            if (c15969 == null) {
                iM36300 = this.f5282.size();
            } else {
                iM36300 = c15969.m36300();
            }
            if (i < iM36300) {
                C15969 c159610 = this.f5284;
                if (c159610 == null) {
                    c22105 = (C22104) this.f5282.get(i);
                } else {
                    c22105 = (C22104) c159610.m36297(i);
                }
                if (!c22105.isInitialized()) {
                    break;
                }
                i++;
            } else {
                int i2 = 0;
                while (true) {
                    C15969 c159611 = this.f5281;
                    if (c159611 == null) {
                        iM36301 = this.f5287.size();
                    } else {
                        iM36301 = c159611.m36300();
                    }
                    if (i2 < iM36301) {
                        C15969 c159612 = this.f5281;
                        if (c159612 == null) {
                            c22104 = (C22104) this.f5287.get(i2);
                        } else {
                            c22104 = (C22104) c159612.m36297(i2);
                        }
                        if (!c22104.isInitialized()) {
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 0;
                        while (true) {
                            C15969 c159613 = this.f5297;
                            if (c159613 == null) {
                                iM36302 = this.f5289.size();
                            } else {
                                iM36302 = c159613.m36300();
                            }
                            if (i3 < iM36302) {
                                C15969 c159614 = this.f5297;
                                if (c159614 == null) {
                                    c21768 = (C21768) this.f5289.get(i3);
                                } else {
                                    c21768 = (C21768) c159614.m36297(i3);
                                }
                                if (!c21768.isInitialized()) {
                                    break;
                                }
                                i3++;
                            } else {
                                int i4 = 0;
                                while (true) {
                                    C15969 c159615 = this.f5296;
                                    if (c159615 == null) {
                                        iM36303 = this.f5294.size();
                                    } else {
                                        iM36303 = c159615.m36300();
                                    }
                                    if (i4 < iM36303) {
                                        C15969 c159616 = this.f5296;
                                        if (c159616 == null) {
                                            c24449 = (C24449) this.f5294.get(i4);
                                        } else {
                                            c24449 = (C24449) c159616.m36297(i4);
                                        }
                                        if (!c24449.isInitialized()) {
                                            break;
                                        }
                                        i4++;
                                    } else {
                                        int i5 = 0;
                                        while (true) {
                                            C15969 c159617 = this.f5280;
                                            if (c159617 == null) {
                                                iM36304 = this.f5288.size();
                                            } else {
                                                iM36304 = c159617.m36300();
                                            }
                                            if (i5 < iM36304) {
                                                C15969 c159618 = this.f5280;
                                                if (c159618 == null) {
                                                    c10368 = (C10368) this.f5288.get(i5);
                                                } else {
                                                    c10368 = (C10368) c159618.m36297(i5);
                                                }
                                                if (!c10368.isInitialized()) {
                                                    break;
                                                }
                                                i5++;
                                            } else {
                                                int i6 = 0;
                                                while (true) {
                                                    C15969 c159619 = this.f5283;
                                                    if (c159619 == null) {
                                                        iM36305 = this.f5279.size();
                                                    } else {
                                                        iM36305 = c159619.m36300();
                                                    }
                                                    if (i6 < iM36305) {
                                                        C15969 c159620 = this.f5283;
                                                        if (c159620 == null) {
                                                            c6205 = (C6205) this.f5279.get(i6);
                                                        } else {
                                                            c6205 = (C6205) c159620.m36297(i6);
                                                        }
                                                        if (!c6205.isInitialized()) {
                                                            break;
                                                        }
                                                        i6++;
                                                    } else {
                                                        if ((this.f5295 & 128) == 0) {
                                                            return true;
                                                        }
                                                        C17310 c17310 = this.f5285;
                                                        if (c17310 == null) {
                                                            defaultInstance = this.f5291;
                                                            if (defaultInstance == null) {
                                                                defaultInstance = C18274.getDefaultInstance();
                                                            }
                                                        } else {
                                                            defaultInstance = (C18274) c17310.m39272();
                                                        }
                                                        if (!defaultInstance.isInitialized()) {
                                                            break;
                                                        }
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ */
    private C15969 m5019() {
        if (this.f5284 == null) {
            this.f5284 = new C15969(this.f5282, (this.f5295 & 2) != 0, getParentForChildren(), isClean());
            this.f5282 = null;
        }
        return this.f5284;
    }

    /* JADX INFO: renamed from: ᩳ */
    private C15969 m5022() {
        if (this.f5281 == null) {
            this.f5281 = new C15969(this.f5287, (this.f5295 & 4) != 0, getParentForChildren(), isClean());
            this.f5287 = null;
        }
        return this.f5281;
    }

    /* JADX INFO: renamed from: ۜ */
    private C15969 m5016() {
        if (this.f5297 == null) {
            this.f5297 = new C15969(this.f5289, (this.f5295 & 8) != 0, getParentForChildren(), isClean());
            this.f5289 = null;
        }
        return this.f5297;
    }

    /* JADX INFO: renamed from: ܽ */
    private C15969 m5020() {
        if (this.f5296 == null) {
            this.f5296 = new C15969(this.f5294, (this.f5295 & 16) != 0, getParentForChildren(), isClean());
            this.f5294 = null;
        }
        return this.f5296;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m5015() {
        if ((this.f5295 & 32) == 0) {
            this.f5288 = new ArrayList(this.f5288);
            this.f5295 |= 32;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5024(C10368 c10368) {
        C15969 c15969 = this.f5280;
        if (c15969 == null) {
            m5015();
            this.f5288.add(c10368);
            onChanged();
            return;
        }
        c15969.m36299(c10368);
    }

    /* JADX INFO: renamed from: ܿ */
    private C15969 m5021() {
        if (this.f5280 == null) {
            this.f5280 = new C15969(this.f5288, (this.f5295 & 32) != 0, getParentForChildren(), isClean());
            this.f5288 = null;
        }
        return this.f5280;
    }

    /* JADX INFO: renamed from: ᩷ */
    private C15969 m5023() {
        if (this.f5283 == null) {
            this.f5283 = new C15969(this.f5279, (this.f5295 & 64) != 0, getParentForChildren(), isClean());
            this.f5279 = null;
        }
        return this.f5283;
    }

    /* JADX INFO: renamed from: ۢ */
    private C17310 m5018() {
        C18274 defaultInstance;
        C17310 c17310 = this.f5285;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f5291;
                if (defaultInstance == null) {
                    defaultInstance = C18274.getDefaultInstance();
                }
            } else {
                defaultInstance = (C18274) c17310.m39272();
            }
            this.f5285 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f5291 = null;
        }
        return this.f5285;
    }

    /* JADX INFO: renamed from: ۡ */
    private C15969 m5017() {
        if (this.f5292 == null) {
            this.f5292 = new C15969(this.f5290, (this.f5295 & 256) != 0, getParentForChildren(), isClean());
            this.f5290 = null;
        }
        return this.f5292;
    }
}
