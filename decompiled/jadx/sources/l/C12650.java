package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12650 extends AbstractC19916 implements InterfaceC3583 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C2731 f38098;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1736 f38099;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public List f38100;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14311 f38101;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f38102;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C14311 f38103;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15722 f38104;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f38105;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object f38106;

    public /* synthetic */ C12650(int i) {
        this();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m30930();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m30930();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m30930();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m30930();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32252;
        c9766.m24773(C23233.class, C12650.class);
        return c9766;
    }

    public C12650() {
        this.f38106 = "";
        List list = Collections.EMPTY_LIST;
        this.f38100 = list;
        this.f38102 = list;
        this.f38098 = C2731.m8466();
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m30928();
            m30927();
            m30929();
        }
    }

    public C12650(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f38106 = "";
        List list = Collections.EMPTY_LIST;
        this.f38100 = list;
        this.f38102 = list;
        this.f38098 = C2731.m8466();
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m30928();
            m30927();
            m30929();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30930() {
        super.clear();
        this.f38105 = 0;
        this.f38106 = "";
        C14311 c14311 = this.f38101;
        if (c14311 == null) {
            this.f38100 = Collections.EMPTY_LIST;
        } else {
            this.f38100 = null;
            c14311.m34169();
        }
        this.f38105 &= -3;
        this.f38099 = null;
        C15722 c15722 = this.f38104;
        if (c15722 != null) {
            c15722.m37102();
            this.f38104 = null;
        }
        C14311 c14312 = this.f38103;
        if (c14312 == null) {
            this.f38102 = Collections.EMPTY_LIST;
        } else {
            this.f38102 = null;
            c14312.m34169();
        }
        this.f38105 &= -9;
        this.f38098 = C2731.m8466();
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32235;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C23233.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C23233.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C23233 c23233BuildPartial = buildPartial();
        if (c23233BuildPartial.isInitialized()) {
            return c23233BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c23233BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C23233 c23233BuildPartial = buildPartial();
        if (c23233BuildPartial.isInitialized()) {
            return c23233BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c23233BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C23233 buildPartial() {
        C1736 c1736;
        int i = 0;
        C23233 c23233 = new C23233(this, 0);
        C14311 c14311 = this.f38101;
        if (c14311 != null) {
            c23233.f74654 = c14311.m34163();
        } else {
            if ((this.f38105 & 2) != 0) {
                this.f38100 = C20195.unmodifiableList(this.f38100);
                this.f38105 &= -3;
            }
            c23233.f74654 = this.f38100;
        }
        C14311 c14312 = this.f38103;
        if (c14312 != null) {
            c23233.f74655 = c14312.m34163();
        } else {
            if ((this.f38105 & 8) != 0) {
                this.f38102 = C20195.unmodifiableList(this.f38102);
                this.f38105 &= -9;
            }
            c23233.f74655 = this.f38102;
        }
        int i2 = this.f38105;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c23233.f74656 = this.f38106;
                i = 1;
            }
            if ((i2 & 4) != 0) {
                C15722 c15722 = this.f38104;
                if (c15722 == null) {
                    c1736 = this.f38099;
                } else {
                    c1736 = (C1736) c15722.m37099();
                }
                c23233.f74653 = c1736;
                i |= 2;
            }
            if ((i2 & 16) != 0) {
                this.f38098.mo44493();
                c23233.f74652 = this.f38098;
            }
            c23233.f74657 = i | c23233.f74657;
        }
        onBuilt();
        return c23233;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C23233) {
            m30931((C23233) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C23233) {
            m30931((C23233) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30931(C23233 c23233) {
        C1736 c1736;
        if (c23233 == C23233.getDefaultInstance()) {
            return;
        }
        if (c23233.hasName()) {
            this.f38106 = c23233.f74656;
            this.f38105 |= 1;
            onChanged();
        }
        if (this.f38101 == null) {
            if (!c23233.f74654.isEmpty()) {
                if (this.f38100.isEmpty()) {
                    this.f38100 = c23233.f74654;
                    this.f38105 &= -3;
                } else {
                    if ((this.f38105 & 2) == 0) {
                        this.f38100 = new ArrayList(this.f38100);
                        this.f38105 |= 2;
                    }
                    this.f38100.addAll(c23233.f74654);
                }
                onChanged();
            }
        } else if (!c23233.f74654.isEmpty()) {
            if (!this.f38101.m34174()) {
                this.f38101.m34161(c23233.f74654);
            } else {
                this.f38101.m34172();
                this.f38101 = null;
                this.f38100 = c23233.f74654;
                this.f38105 &= -3;
                this.f38101 = AbstractC4121.alwaysUseFieldBuilders ? m30928() : null;
            }
        }
        if (c23233.m51558()) {
            C1736 c1736M51557 = c23233.m51557();
            C15722 c15722 = this.f38104;
            if (c15722 == null) {
                if ((this.f38105 & 4) == 0 || (c1736 = this.f38099) == null || c1736 == C1736.getDefaultInstance()) {
                    this.f38099 = c1736M51557;
                } else {
                    this.f38105 |= 4;
                    onChanged();
                    ((C7711) m30927().m37104()).m20628(c1736M51557);
                }
            } else {
                c15722.m37098(c1736M51557);
            }
            if (this.f38099 != null) {
                this.f38105 |= 4;
                onChanged();
            }
        }
        if (this.f38103 == null) {
            if (!c23233.f74655.isEmpty()) {
                if (this.f38102.isEmpty()) {
                    this.f38102 = c23233.f74655;
                    this.f38105 &= -9;
                } else {
                    if ((this.f38105 & 8) == 0) {
                        this.f38102 = new ArrayList(this.f38102);
                        this.f38105 |= 8;
                    }
                    this.f38102.addAll(c23233.f74655);
                }
                onChanged();
            }
        } else if (!c23233.f74655.isEmpty()) {
            if (!this.f38103.m34174()) {
                this.f38103.m34161(c23233.f74655);
            } else {
                this.f38103.m34172();
                this.f38103 = null;
                this.f38102 = c23233.f74655;
                this.f38105 &= -9;
                this.f38103 = AbstractC4121.alwaysUseFieldBuilders ? m30929() : null;
            }
        }
        if (!c23233.f74652.isEmpty()) {
            if (this.f38098.isEmpty()) {
                this.f38098 = c23233.f74652;
                this.f38105 |= 16;
            } else {
                if (!this.f38098.mo44491()) {
                    this.f38098 = new C2731(this.f38098);
                }
                this.f38105 |= 16;
                this.f38098.addAll(c23233.f74652);
            }
            onChanged();
        }
        mergeUnknownFields(c23233.getUnknownFields());
        onChanged();
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final C12650 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 10) {
                            this.f38106 = abstractC7297.mo19566();
                            this.f38105 |= 1;
                        } else if (iMo19567 == 18) {
                            C17964 c17964 = (C17964) abstractC7297.mo19552(C17964.parser(), c17798);
                            C14311 c14311 = this.f38101;
                            if (c14311 != null) {
                                c14311.m34166(c17964);
                            } else {
                                if ((this.f38105 & 2) == 0) {
                                    this.f38100 = new ArrayList(this.f38100);
                                    this.f38105 |= 2;
                                }
                                this.f38100.add(c17964);
                            }
                        } else if (iMo19567 == 26) {
                            abstractC7297.mo19556(m30927().m37104(), c17798);
                            this.f38105 |= 4;
                        } else if (iMo19567 == 34) {
                            C11945 c11945 = (C11945) abstractC7297.mo19552(C11945.parser(), c17798);
                            C14311 c14312 = this.f38103;
                            if (c14312 != null) {
                                c14312.m34166(c11945);
                            } else {
                                if ((this.f38105 & 8) == 0) {
                                    this.f38102 = new ArrayList(this.f38102);
                                    this.f38105 |= 8;
                                }
                                this.f38102.add(c11945);
                            }
                        } else if (iMo19567 == 42) {
                            AbstractC5886 abstractC5886Mo19566 = abstractC7297.mo19566();
                            if (!this.f38098.mo44491()) {
                                this.f38098 = new C2731(this.f38098);
                            }
                            this.f38105 |= 16;
                            this.f38098.mo8469(abstractC5886Mo19566);
                        } else if (!super.parseUnknownField(abstractC7297, c17798, iMo19567)) {
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
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        int iM34167;
        C1736 defaultInstance;
        C17964 c17964;
        int i = 0;
        while (true) {
            C14311 c14311 = this.f38101;
            if (c14311 == null) {
                iM34167 = this.f38100.size();
            } else {
                iM34167 = c14311.m34167();
            }
            if (i < iM34167) {
                C14311 c14312 = this.f38101;
                if (c14312 == null) {
                    c17964 = (C17964) this.f38100.get(i);
                } else {
                    c17964 = (C17964) c14312.m34164(i);
                }
                if (!c17964.isInitialized()) {
                    break;
                }
                i++;
            } else {
                if ((this.f38105 & 4) == 0) {
                    return true;
                }
                C15722 c15722 = this.f38104;
                if (c15722 == null) {
                    defaultInstance = this.f38099;
                    if (defaultInstance == null) {
                        defaultInstance = C1736.getDefaultInstance();
                    }
                } else {
                    defaultInstance = (C1736) c15722.m37103();
                }
                if (!defaultInstance.isInitialized()) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C14311 m30928() {
        if (this.f38101 == null) {
            this.f38101 = new C14311(this.f38100, (this.f38105 & 2) != 0, getParentForChildren(), isClean());
            this.f38100 = null;
        }
        return this.f38101;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C15722 m30927() {
        C1736 defaultInstance;
        C15722 c15722 = this.f38104;
        if (c15722 == null) {
            if (c15722 == null) {
                defaultInstance = this.f38099;
                if (defaultInstance == null) {
                    defaultInstance = C1736.getDefaultInstance();
                }
            } else {
                defaultInstance = (C1736) c15722.m37103();
            }
            this.f38104 = new C15722(defaultInstance, getParentForChildren(), isClean());
            this.f38099 = null;
        }
        return this.f38104;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C14311 m30929() {
        if (this.f38103 == null) {
            this.f38103 = new C14311(this.f38102, (this.f38105 & 8) != 0, getParentForChildren(), isClean());
            this.f38102 = null;
        }
        return this.f38103;
    }
}
