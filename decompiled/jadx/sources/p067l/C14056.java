package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.۫ۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14056 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ֫֫ */
    public InterfaceC8296 f39623;

    /* JADX INFO: renamed from: ۗ */
    public List f39624;

    /* JADX INFO: renamed from: ۙ */
    public C15969 f39625;

    /* JADX INFO: renamed from: ۛ */
    public List f39626;

    /* JADX INFO: renamed from: ۟ */
    public Object f39627;

    /* JADX INFO: renamed from: ۤ */
    public C15969 f39628;

    /* JADX INFO: renamed from: ۧ֫ */
    public C15969 f39629;

    /* JADX INFO: renamed from: ۨ */
    public Object f39630;

    /* JADX INFO: renamed from: ۫ */
    public List f39631;

    /* JADX INFO: renamed from: ۬ */
    public C15969 f39632;

    /* JADX INFO: renamed from: ܰ */
    public C9362 f39633;

    /* JADX INFO: renamed from: ܳ֫ */
    public Object f39634;

    /* JADX INFO: renamed from: ܽ֫ */
    public List f39635;

    /* JADX INFO: renamed from: ܿ֫ */
    public C12240 f39636;

    /* JADX INFO: renamed from: ᩳ֫ */
    public C17310 f39637;

    /* JADX INFO: renamed from: ᩶ */
    public int f39638;

    /* JADX INFO: renamed from: ᩸ */
    public int f39639;

    /* JADX INFO: renamed from: ᩹ */
    public C4964 f39640;

    /* JADX INFO: renamed from: ᩺ */
    public C17310 f39641;

    /* JADX INFO: renamed from: ᩻֫ */
    public InterfaceC8296 f39642;

    public /* synthetic */ C14056(int i) {
        this();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m31896();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m31896();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m31896();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m31896();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m31898(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m31898(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m31898(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m31898(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35234;
        c11650.m26787(C12045.class, C14056.class);
        return c11650;
    }

    public C14056() {
        this.f39630 = "";
        this.f39627 = "";
        this.f39640 = C4964.m10513();
        this.f39623 = AbstractC6285.m14287();
        this.f39642 = AbstractC6285.m14287();
        List list = Collections.EMPTY_LIST;
        this.f39626 = list;
        this.f39624 = list;
        this.f39635 = list;
        this.f39631 = list;
        this.f39634 = "";
        this.f39638 = 0;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m31895();
            m31890();
            m31888();
            m31887();
            m31889();
            m31891();
        }
    }

    public C14056(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f39630 = "";
        this.f39627 = "";
        this.f39640 = C4964.m10513();
        this.f39623 = AbstractC6285.m14287();
        this.f39642 = AbstractC6285.m14287();
        List list = Collections.EMPTY_LIST;
        this.f39626 = list;
        this.f39624 = list;
        this.f39635 = list;
        this.f39631 = list;
        this.f39634 = "";
        this.f39638 = 0;
        if (AbstractC6285.alwaysUseFieldBuilders) {
            m31895();
            m31890();
            m31888();
            m31887();
            m31889();
            m31891();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31896() {
        super.clear();
        this.f39639 = 0;
        this.f39630 = "";
        this.f39627 = "";
        this.f39640 = C4964.m10513();
        this.f39623 = AbstractC6285.m14287();
        this.f39642 = AbstractC6285.m14287();
        C15969 c15969 = this.f39628;
        if (c15969 == null) {
            this.f39626 = Collections.EMPTY_LIST;
        } else {
            this.f39626 = null;
            c15969.m36302();
        }
        this.f39639 &= -33;
        C15969 c159610 = this.f39625;
        if (c159610 == null) {
            this.f39624 = Collections.EMPTY_LIST;
        } else {
            this.f39624 = null;
            c159610.m36302();
        }
        this.f39639 &= -65;
        C15969 c159611 = this.f39629;
        if (c159611 == null) {
            this.f39635 = Collections.EMPTY_LIST;
        } else {
            this.f39635 = null;
            c159611.m36302();
        }
        this.f39639 &= -129;
        C15969 c159612 = this.f39632;
        if (c159612 == null) {
            this.f39631 = Collections.EMPTY_LIST;
        } else {
            this.f39631 = null;
            c159612.m36302();
        }
        this.f39639 &= -257;
        this.f39633 = null;
        C17310 c17310 = this.f39641;
        if (c17310 != null) {
            c17310.m39271();
            this.f39641 = null;
        }
        this.f39636 = null;
        C17310 c17311 = this.f39637;
        if (c17311 != null) {
            c17311.m39271();
            this.f39637 = null;
        }
        this.f39634 = "";
        this.f39638 = 0;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35230;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C12045.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C12045.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C12045 c12045BuildPartial = buildPartial();
        if (c12045BuildPartial.isInitialized()) {
            return c12045BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c12045BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C12045 c12045BuildPartial = buildPartial();
        if (c12045BuildPartial.isInitialized()) {
            return c12045BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c12045BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C12045 buildPartial() {
        C12240 c12240;
        C9362 c9362;
        int i = 0;
        C12045 c12045 = new C12045(this, 0);
        C15969 c15969 = this.f39628;
        if (c15969 != null) {
            c12045.f33556 = c15969.m36296();
        } else {
            if ((this.f39639 & 32) != 0) {
                this.f39626 = C21562.unmodifiableList(this.f39626);
                this.f39639 &= -33;
            }
            c12045.f33556 = this.f39626;
        }
        C15969 c159610 = this.f39625;
        if (c159610 != null) {
            c12045.f33550 = c159610.m36296();
        } else {
            if ((this.f39639 & 64) != 0) {
                this.f39624 = C21562.unmodifiableList(this.f39624);
                this.f39639 &= -65;
            }
            c12045.f33550 = this.f39624;
        }
        C15969 c159611 = this.f39629;
        if (c159611 != null) {
            c12045.f33558 = c159611.m36296();
        } else {
            if ((this.f39639 & 128) != 0) {
                this.f39635 = C21562.unmodifiableList(this.f39635);
                this.f39639 &= -129;
            }
            c12045.f33558 = this.f39635;
        }
        C15969 c159612 = this.f39632;
        if (c159612 != null) {
            c12045.f33549 = c159612.m36296();
        } else {
            if ((this.f39639 & 256) != 0) {
                this.f39631 = C21562.unmodifiableList(this.f39631);
                this.f39639 &= -257;
            }
            c12045.f33549 = this.f39631;
        }
        int i2 = this.f39639;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c12045.f33553 = this.f39630;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c12045.f33555 = this.f39627;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                this.f39640.mo46787();
                c12045.f33561 = this.f39640;
            }
            if ((i2 & 8) != 0) {
                this.f39623.mo46787();
                c12045.f33562 = this.f39623;
            }
            if ((i2 & 16) != 0) {
                this.f39642.mo46787();
                c12045.f33554 = this.f39642;
            }
            if ((i2 & 512) != 0) {
                C17310 c17310 = this.f39641;
                if (c17310 == null) {
                    c9362 = this.f39633;
                } else {
                    c9362 = (C9362) c17310.m39268();
                }
                c12045.f33551 = c9362;
                i |= 4;
            }
            if ((i2 & 1024) != 0) {
                C17310 c17311 = this.f39637;
                if (c17311 == null) {
                    c12240 = this.f39636;
                } else {
                    c12240 = (C12240) c17311.m39268();
                }
                c12045.f33552 = c12240;
                i |= 8;
            }
            if ((i2 & 2048) != 0) {
                c12045.f33548 = this.f39634;
                i |= 16;
            }
            if ((i2 & 4096) != 0) {
                c12045.f33559 = this.f39638;
                i |= 32;
            }
            c12045.f33560 = i | c12045.f33560;
        }
        onBuilt();
        return c12045;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C12045) {
            m31899((C12045) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C12045) {
            m31899((C12045) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31899(C12045 c12045) {
        C12240 c12240;
        C9362 c9362;
        if (c12045 == C12045.getDefaultInstance()) {
            return;
        }
        if (c12045.hasName()) {
            this.f39630 = c12045.f33553;
            this.f39639 |= 1;
            onChanged();
        }
        if (c12045.m27595()) {
            this.f39627 = c12045.f33555;
            this.f39639 |= 2;
            onChanged();
        }
        if (!c12045.f33561.isEmpty()) {
            if (this.f39640.isEmpty()) {
                this.f39640 = c12045.f33561;
                this.f39639 |= 4;
            } else {
                if (!this.f39640.mo46785()) {
                    this.f39640 = new C4964(this.f39640);
                }
                this.f39639 |= 4;
                this.f39640.addAll(c12045.f33561);
            }
            onChanged();
        }
        if (!c12045.f33562.isEmpty()) {
            if (this.f39623.isEmpty()) {
                InterfaceC8296 interfaceC8296 = c12045.f33562;
                this.f39623 = interfaceC8296;
                interfaceC8296.mo46787();
                this.f39639 |= 8;
            } else {
                m31894();
                this.f39623.addAll(c12045.f33562);
            }
            onChanged();
        }
        if (!c12045.f33554.isEmpty()) {
            if (this.f39642.isEmpty()) {
                InterfaceC8296 interfaceC8297 = c12045.f33554;
                this.f39642 = interfaceC8297;
                interfaceC8297.mo46787();
                this.f39639 |= 16;
            } else {
                m31893();
                this.f39642.addAll(c12045.f33554);
            }
            onChanged();
        }
        if (this.f39628 == null) {
            if (!c12045.f33556.isEmpty()) {
                if (this.f39626.isEmpty()) {
                    this.f39626 = c12045.f33556;
                    this.f39639 &= -33;
                } else {
                    m31892();
                    this.f39626.addAll(c12045.f33556);
                }
                onChanged();
            }
        } else if (!c12045.f33556.isEmpty()) {
            if (!this.f39628.m36307()) {
                this.f39628.m36294(c12045.f33556);
            } else {
                this.f39628.m36305();
                this.f39628 = null;
                this.f39626 = c12045.f33556;
                this.f39639 &= -33;
                this.f39628 = AbstractC6285.alwaysUseFieldBuilders ? m31895() : null;
            }
        }
        if (this.f39625 == null) {
            if (!c12045.f33550.isEmpty()) {
                if (this.f39624.isEmpty()) {
                    this.f39624 = c12045.f33550;
                    this.f39639 &= -65;
                } else {
                    if ((this.f39639 & 64) == 0) {
                        this.f39624 = new ArrayList(this.f39624);
                        this.f39639 |= 64;
                    }
                    this.f39624.addAll(c12045.f33550);
                }
                onChanged();
            }
        } else if (!c12045.f33550.isEmpty()) {
            if (!this.f39625.m36307()) {
                this.f39625.m36294(c12045.f33550);
            } else {
                this.f39625.m36305();
                this.f39625 = null;
                this.f39624 = c12045.f33550;
                this.f39639 &= -65;
                this.f39625 = AbstractC6285.alwaysUseFieldBuilders ? m31890() : null;
            }
        }
        if (this.f39629 == null) {
            if (!c12045.f33558.isEmpty()) {
                if (this.f39635.isEmpty()) {
                    this.f39635 = c12045.f33558;
                    this.f39639 &= -129;
                } else {
                    if ((this.f39639 & 128) == 0) {
                        this.f39635 = new ArrayList(this.f39635);
                        this.f39639 |= 128;
                    }
                    this.f39635.addAll(c12045.f33558);
                }
                onChanged();
            }
        } else if (!c12045.f33558.isEmpty()) {
            if (!this.f39629.m36307()) {
                this.f39629.m36294(c12045.f33558);
            } else {
                this.f39629.m36305();
                this.f39629 = null;
                this.f39635 = c12045.f33558;
                this.f39639 &= -129;
                this.f39629 = AbstractC6285.alwaysUseFieldBuilders ? m31888() : null;
            }
        }
        if (this.f39632 == null) {
            if (!c12045.f33549.isEmpty()) {
                if (this.f39631.isEmpty()) {
                    this.f39631 = c12045.f33549;
                    this.f39639 &= -257;
                } else {
                    if ((this.f39639 & 256) == 0) {
                        this.f39631 = new ArrayList(this.f39631);
                        this.f39639 |= 256;
                    }
                    this.f39631.addAll(c12045.f33549);
                }
                onChanged();
            }
        } else if (!c12045.f33549.isEmpty()) {
            if (!this.f39632.m36307()) {
                this.f39632.m36294(c12045.f33549);
            } else {
                this.f39632.m36305();
                this.f39632 = null;
                this.f39631 = c12045.f33549;
                this.f39639 &= -257;
                this.f39632 = AbstractC6285.alwaysUseFieldBuilders ? m31887() : null;
            }
        }
        if (c12045.m27590()) {
            C9362 c9362M27586 = c12045.m27586();
            C17310 c17310 = this.f39641;
            if (c17310 == null) {
                if ((this.f39639 & 512) == 0 || (c9362 = this.f39633) == null || c9362 == C9362.getDefaultInstance()) {
                    this.f39633 = c9362M27586;
                } else {
                    this.f39639 |= 512;
                    onChanged();
                    ((C13386) m31889().m39273()).m30533(c9362M27586);
                }
            } else {
                c17310.m39267(c9362M27586);
            }
            if (this.f39633 != null) {
                this.f39639 |= 512;
                onChanged();
            }
        }
        if (c12045.m27603()) {
            C12240 c12240M27583 = c12045.m27583();
            C17310 c17311 = this.f39637;
            if (c17311 == null) {
                if ((this.f39639 & 1024) == 0 || (c12240 = this.f39636) == null || c12240 == C12240.getDefaultInstance()) {
                    this.f39636 = c12240M27583;
                } else {
                    this.f39639 |= 1024;
                    onChanged();
                    ((C6875) m31891().m39273()).m15769(c12240M27583);
                }
            } else {
                c17311.m39267(c12240M27583);
            }
            if (this.f39636 != null) {
                this.f39639 |= 1024;
                onChanged();
            }
        }
        if (c12045.m27604()) {
            this.f39634 = c12045.f33548;
            this.f39639 |= 2048;
            onChanged();
        }
        if (c12045.m27584()) {
            EnumC5674 enumC5674M27602 = c12045.m27602();
            enumC5674M27602.getClass();
            this.f39639 |= 4096;
            this.f39638 = enumC5674M27602.getNumber();
            onChanged();
        }
        mergeUnknownFields(c12045.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31898(AbstractC9303 abstractC9303, C19283 c19283) {
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
                            this.f39630 = abstractC9303.mo21534();
                            this.f39639 |= 1;
                            continue;
                        case 18:
                            this.f39627 = abstractC9303.mo21534();
                            this.f39639 |= 2;
                            continue;
                        case 26:
                            AbstractC7962 abstractC7962Mo21534 = abstractC9303.mo21534();
                            if (!this.f39640.mo46785()) {
                                this.f39640 = new C4964(this.f39640);
                            }
                            this.f39639 |= 4;
                            this.f39640.mo10516(abstractC7962Mo21534);
                            continue;
                        case 34:
                            C21768 c21768 = (C21768) abstractC9303.mo21520(C21768.parser(), c19283);
                            C15969 c15969 = this.f39628;
                            if (c15969 == null) {
                                m31892();
                                this.f39626.add(c21768);
                            } else {
                                c15969.m36299(c21768);
                                continue;
                            }
                            break;
                        case 42:
                            C24449 c24449 = (C24449) abstractC9303.mo21520(C24449.parser(), c19283);
                            C15969 c159610 = this.f39625;
                            if (c159610 != null) {
                                c159610.m36299(c24449);
                                continue;
                            } else {
                                if ((this.f39639 & 64) == 0) {
                                    this.f39624 = new ArrayList(this.f39624);
                                    this.f39639 |= 64;
                                }
                                this.f39624.add(c24449);
                            }
                            break;
                        case 50:
                            C10228 c10228 = (C10228) abstractC9303.mo21520(C10228.parser(), c19283);
                            C15969 c159611 = this.f39629;
                            if (c159611 != null) {
                                c159611.m36299(c10228);
                                continue;
                            } else {
                                if ((this.f39639 & 128) == 0) {
                                    this.f39635 = new ArrayList(this.f39635);
                                    this.f39639 |= 128;
                                }
                                this.f39635.add(c10228);
                            }
                            break;
                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            C22104 c22104 = (C22104) abstractC9303.mo21520(C22104.parser(), c19283);
                            C15969 c159612 = this.f39632;
                            if (c159612 != null) {
                                c159612.m36299(c22104);
                                continue;
                            } else {
                                if ((this.f39639 & 256) == 0) {
                                    this.f39631 = new ArrayList(this.f39631);
                                    this.f39639 |= 256;
                                }
                                this.f39631.add(c22104);
                            }
                            break;
                        case 66:
                            abstractC9303.mo21524(m31889().m39273(), c19283);
                            this.f39639 |= 512;
                            continue;
                        case 74:
                            abstractC9303.mo21524(m31891().m39273(), c19283);
                            this.f39639 |= 1024;
                            continue;
                        case 80:
                            int iMo21536 = abstractC9303.mo21536();
                            m31894();
                            this.f39623.mo19112(iMo21536);
                            continue;
                        case 82:
                            int iMo21538 = abstractC9303.mo21538(abstractC9303.mo21526());
                            m31894();
                            while (abstractC9303.mo21532() > 0) {
                                this.f39623.mo19112(abstractC9303.mo21536());
                            }
                            abstractC9303.mo21533(iMo21538);
                            continue;
                        case 88:
                            int iMo21537 = abstractC9303.mo21536();
                            m31893();
                            this.f39642.mo19112(iMo21537);
                            continue;
                        case 90:
                            int iMo21539 = abstractC9303.mo21538(abstractC9303.mo21526());
                            m31893();
                            while (abstractC9303.mo21532() > 0) {
                                this.f39642.mo19112(abstractC9303.mo21536());
                            }
                            abstractC9303.mo21533(iMo21539);
                            continue;
                        case 98:
                            this.f39634 = abstractC9303.mo21534();
                            this.f39639 |= 2048;
                            continue;
                        case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                            int iMo21528 = abstractC9303.mo21528();
                            if (EnumC5674.m12645(iMo21528) == null) {
                                mergeUnknownVarintField(14, iMo21528);
                            } else {
                                this.f39638 = iMo21528;
                                this.f39639 |= 4096;
                                continue;
                            }
                            break;
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

    /* JADX INFO: renamed from: ֫ */
    public final void m31897(String str) {
        str.getClass();
        this.f39630 = str;
        this.f39639 |= 1;
        onChanged();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31901(String str) {
        str.getClass();
        this.f39627 = str;
        this.f39639 |= 2;
        onChanged();
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m31894() {
        if (!this.f39623.mo46785()) {
            this.f39623 = (InterfaceC8296) AbstractC6285.m14263((InterfaceC24389) this.f39623);
        }
        this.f39639 |= 8;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m31893() {
        if (!this.f39642.mo46785()) {
            this.f39642 = (InterfaceC8296) AbstractC6285.m14263((InterfaceC24389) this.f39642);
        }
        this.f39639 |= 16;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m31892() {
        if ((this.f39639 & 32) == 0) {
            this.f39626 = new ArrayList(this.f39626);
            this.f39639 |= 32;
        }
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        int iM36300;
        int iM36301;
        int iM36302;
        int iM36303;
        C9362 defaultInstance;
        C22104 c22104;
        C10228 c10228;
        C24449 c24449;
        C21768 c21768;
        int i = 0;
        while (true) {
            C15969 c15969 = this.f39628;
            if (c15969 == null) {
                iM36300 = this.f39626.size();
            } else {
                iM36300 = c15969.m36300();
            }
            if (i < iM36300) {
                C15969 c159610 = this.f39628;
                if (c159610 == null) {
                    c21768 = (C21768) this.f39626.get(i);
                } else {
                    c21768 = (C21768) c159610.m36297(i);
                }
                if (!c21768.isInitialized()) {
                    break;
                }
                i++;
            } else {
                int i2 = 0;
                while (true) {
                    C15969 c159611 = this.f39625;
                    if (c159611 == null) {
                        iM36301 = this.f39624.size();
                    } else {
                        iM36301 = c159611.m36300();
                    }
                    if (i2 < iM36301) {
                        C15969 c159612 = this.f39625;
                        if (c159612 == null) {
                            c24449 = (C24449) this.f39624.get(i2);
                        } else {
                            c24449 = (C24449) c159612.m36297(i2);
                        }
                        if (!c24449.isInitialized()) {
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 0;
                        while (true) {
                            C15969 c159613 = this.f39629;
                            if (c159613 == null) {
                                iM36302 = this.f39635.size();
                            } else {
                                iM36302 = c159613.m36300();
                            }
                            if (i3 < iM36302) {
                                C15969 c159614 = this.f39629;
                                if (c159614 == null) {
                                    c10228 = (C10228) this.f39635.get(i3);
                                } else {
                                    c10228 = (C10228) c159614.m36297(i3);
                                }
                                if (!c10228.isInitialized()) {
                                    break;
                                }
                                i3++;
                            } else {
                                int i4 = 0;
                                while (true) {
                                    C15969 c159615 = this.f39632;
                                    if (c159615 == null) {
                                        iM36303 = this.f39631.size();
                                    } else {
                                        iM36303 = c159615.m36300();
                                    }
                                    if (i4 < iM36303) {
                                        C15969 c159616 = this.f39632;
                                        if (c159616 == null) {
                                            c22104 = (C22104) this.f39631.get(i4);
                                        } else {
                                            c22104 = (C22104) c159616.m36297(i4);
                                        }
                                        if (!c22104.isInitialized()) {
                                            break;
                                        }
                                        i4++;
                                    } else {
                                        if ((this.f39639 & 512) == 0) {
                                            return true;
                                        }
                                        C17310 c17310 = this.f39641;
                                        if (c17310 == null) {
                                            defaultInstance = this.f39633;
                                            if (defaultInstance == null) {
                                                defaultInstance = C9362.getDefaultInstance();
                                            }
                                        } else {
                                            defaultInstance = (C9362) c17310.m39272();
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
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31900(C21768 c21768) {
        C15969 c15969 = this.f39628;
        if (c15969 == null) {
            c21768.getClass();
            m31892();
            this.f39626.add(c21768);
            onChanged();
            return;
        }
        c15969.m36299(c21768);
    }

    /* JADX INFO: renamed from: ᩷ */
    private C15969 m31895() {
        if (this.f39628 == null) {
            this.f39628 = new C15969(this.f39626, (this.f39639 & 32) != 0, getParentForChildren(), isClean());
            this.f39626 = null;
        }
        return this.f39628;
    }

    /* JADX INFO: renamed from: ܳ */
    private C15969 m31890() {
        if (this.f39625 == null) {
            this.f39625 = new C15969(this.f39624, (this.f39639 & 64) != 0, getParentForChildren(), isClean());
            this.f39624 = null;
        }
        return this.f39625;
    }

    /* JADX INFO: renamed from: ۡ */
    private C15969 m31888() {
        if (this.f39629 == null) {
            this.f39629 = new C15969(this.f39635, (this.f39639 & 128) != 0, getParentForChildren(), isClean());
            this.f39635 = null;
        }
        return this.f39629;
    }

    /* JADX INFO: renamed from: ۜ */
    private C15969 m31887() {
        if (this.f39632 == null) {
            this.f39632 = new C15969(this.f39631, (this.f39639 & 256) != 0, getParentForChildren(), isClean());
            this.f39631 = null;
        }
        return this.f39632;
    }

    /* JADX INFO: renamed from: ۢ */
    private C17310 m31889() {
        C9362 defaultInstance;
        C17310 c17310 = this.f39641;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f39633;
                if (defaultInstance == null) {
                    defaultInstance = C9362.getDefaultInstance();
                }
            } else {
                defaultInstance = (C9362) c17310.m39272();
            }
            this.f39641 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f39633 = null;
        }
        return this.f39641;
    }

    /* JADX INFO: renamed from: ܺ */
    private C17310 m31891() {
        C12240 defaultInstance;
        C17310 c17310 = this.f39637;
        if (c17310 == null) {
            if (c17310 == null) {
                defaultInstance = this.f39636;
                if (defaultInstance == null) {
                    defaultInstance = C12240.getDefaultInstance();
                }
            } else {
                defaultInstance = (C12240) c17310.m39272();
            }
            this.f39637 = new C17310(defaultInstance, getParentForChildren(), isClean());
            this.f39636 = null;
        }
        return this.f39637;
    }
}
