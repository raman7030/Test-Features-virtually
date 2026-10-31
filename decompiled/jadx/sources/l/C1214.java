package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֨ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1214 extends AbstractC19916 implements InterfaceC3583 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C15722 f4364;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f4365;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C22381 f4366;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f4367;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f4368;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C14311 f4369;

    public /* synthetic */ C1214(int i) {
        this();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m4054();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m4054();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m4054();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m4054();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m4055(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m4055(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m4055(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m4055(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32228;
        c9766.m24773(C8270.class, C1214.class);
        return c9766;
    }

    public C1214() {
        this.f4365 = "";
        this.f4367 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m4052();
            m4053();
        }
    }

    public C1214(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f4365 = "";
        this.f4367 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m4052();
            m4053();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4054() {
        super.clear();
        this.f4368 = 0;
        this.f4365 = "";
        C14311 c14311 = this.f4369;
        if (c14311 == null) {
            this.f4367 = Collections.EMPTY_LIST;
        } else {
            this.f4367 = null;
            c14311.m34169();
        }
        this.f4368 &= -3;
        this.f4366 = null;
        C15722 c15722 = this.f4364;
        if (c15722 != null) {
            c15722.m37102();
            this.f4364 = null;
        }
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32214;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C8270.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C8270.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C8270 c8270BuildPartial = buildPartial();
        if (c8270BuildPartial.isInitialized()) {
            return c8270BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c8270BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C8270 c8270BuildPartial = buildPartial();
        if (c8270BuildPartial.isInitialized()) {
            return c8270BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c8270BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C8270 buildPartial() {
        C22381 c22381;
        int i = 0;
        C8270 c8270 = new C8270(this, 0);
        C14311 c14311 = this.f4369;
        if (c14311 != null) {
            c8270.f25436 = c14311.m34163();
        } else {
            if ((this.f4368 & 2) != 0) {
                this.f4367 = C20195.unmodifiableList(this.f4367);
                this.f4368 &= -3;
            }
            c8270.f25436 = this.f4367;
        }
        int i2 = this.f4368;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c8270.f25435 = this.f4365;
                i = 1;
            }
            if ((i2 & 4) != 0) {
                C15722 c15722 = this.f4364;
                if (c15722 == null) {
                    c22381 = this.f4366;
                } else {
                    c22381 = (C22381) c15722.m37099();
                }
                c8270.f25434 = c22381;
                i |= 2;
            }
            c8270.f25437 = i | c8270.f25437;
        }
        onBuilt();
        return c8270;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C8270) {
            m4056((C8270) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C8270) {
            m4056((C8270) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4056(C8270 c8270) {
        C22381 c22381;
        if (c8270 == C8270.getDefaultInstance()) {
            return;
        }
        if (c8270.hasName()) {
            this.f4365 = c8270.f25435;
            this.f4368 |= 1;
            onChanged();
        }
        if (this.f4369 == null) {
            if (!c8270.f25436.isEmpty()) {
                if (this.f4367.isEmpty()) {
                    this.f4367 = c8270.f25436;
                    this.f4368 &= -3;
                } else {
                    if ((this.f4368 & 2) == 0) {
                        this.f4367 = new ArrayList(this.f4367);
                        this.f4368 |= 2;
                    }
                    this.f4367.addAll(c8270.f25436);
                }
                onChanged();
            }
        } else if (!c8270.f25436.isEmpty()) {
            if (!this.f4369.m34174()) {
                this.f4369.m34161(c8270.f25436);
            } else {
                this.f4369.m34172();
                this.f4369 = null;
                this.f4367 = c8270.f25436;
                this.f4368 &= -3;
                this.f4369 = AbstractC4121.alwaysUseFieldBuilders ? m4052() : null;
            }
        }
        if (c8270.m21876()) {
            C22381 c22381M21877 = c8270.m21877();
            C15722 c15722 = this.f4364;
            if (c15722 == null) {
                if ((this.f4368 & 4) == 0 || (c22381 = this.f4366) == null || c22381 == C22381.getDefaultInstance()) {
                    this.f4366 = c22381M21877;
                } else {
                    this.f4368 |= 4;
                    onChanged();
                    ((C21676) m4053().m37104()).m48944(c22381M21877);
                }
            } else {
                c15722.m37098(c22381M21877);
            }
            if (this.f4366 != null) {
                this.f4368 |= 4;
                onChanged();
            }
        }
        mergeUnknownFields(c8270.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4055(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 10) {
                            this.f4365 = abstractC7297.mo19566();
                            this.f4368 |= 1;
                        } else if (iMo19567 == 18) {
                            C14619 c14619 = (C14619) abstractC7297.mo19552(C14619.parser(), c17798);
                            C14311 c14311 = this.f4369;
                            if (c14311 != null) {
                                c14311.m34166(c14619);
                            } else {
                                if ((this.f4368 & 2) == 0) {
                                    this.f4367 = new ArrayList(this.f4367);
                                    this.f4368 |= 2;
                                }
                                this.f4367.add(c14619);
                            }
                        } else if (iMo19567 == 26) {
                            abstractC7297.mo19556(m4053().m37104(), c17798);
                            this.f4368 |= 4;
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
    }

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        int iM34167;
        C22381 defaultInstance;
        C14619 c14619;
        int i = 0;
        while (true) {
            C14311 c14311 = this.f4369;
            if (c14311 == null) {
                iM34167 = this.f4367.size();
            } else {
                iM34167 = c14311.m34167();
            }
            if (i < iM34167) {
                C14311 c14312 = this.f4369;
                if (c14312 == null) {
                    c14619 = (C14619) this.f4367.get(i);
                } else {
                    c14619 = (C14619) c14312.m34164(i);
                }
                if (!c14619.isInitialized()) {
                    break;
                }
                i++;
            } else {
                if ((this.f4368 & 4) == 0) {
                    return true;
                }
                C15722 c15722 = this.f4364;
                if (c15722 == null) {
                    defaultInstance = this.f4366;
                    if (defaultInstance == null) {
                        defaultInstance = C22381.getDefaultInstance();
                    }
                } else {
                    defaultInstance = (C22381) c15722.m37103();
                }
                if (!defaultInstance.isInitialized()) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C14311 m4052() {
        if (this.f4369 == null) {
            this.f4369 = new C14311(this.f4367, (this.f4368 & 2) != 0, getParentForChildren(), isClean());
            this.f4367 = null;
        }
        return this.f4369;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C15722 m4053() {
        C22381 defaultInstance;
        C15722 c15722 = this.f4364;
        if (c15722 == null) {
            if (c15722 == null) {
                defaultInstance = this.f4366;
                if (defaultInstance == null) {
                    defaultInstance = C22381.getDefaultInstance();
                }
            } else {
                defaultInstance = (C22381) c15722.m37103();
            }
            this.f4364 = new C15722(defaultInstance, getParentForChildren(), isClean());
            this.f4366 = null;
        }
        return this.f4364;
    }
}
