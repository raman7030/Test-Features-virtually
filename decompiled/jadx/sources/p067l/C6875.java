package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۙܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6875 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ᩶ */
    public List f17877;

    /* JADX INFO: renamed from: ᩸ */
    public int f17878;

    /* JADX INFO: renamed from: ᩹ */
    public C15969 f17879;

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C6875(int i) {
        this();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC11138 clear() {
        m15767();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 clear() {
        m15767();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC21296 clear() {
        m15767();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 clear() {
        m15767();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m15768(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m15768(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m15768(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        m15768(abstractC9303, c19283);
        return this;
    }

    @Override // p067l.AbstractC21296
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35240;
        c11650.m26787(C12240.class, C6875.class);
        return c11650;
    }

    public C6875() {
        this.f17877 = Collections.EMPTY_LIST;
    }

    public C6875(InterfaceC11316 interfaceC11316, int i) {
        super(interfaceC11316);
        this.f17877 = Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15767() {
        super.clear();
        this.f17878 = 0;
        C15969 c15969 = this.f17879;
        if (c15969 == null) {
            this.f17877 = Collections.EMPTY_LIST;
        } else {
            this.f17877 = null;
            c15969.m36302();
        }
        this.f17878 &= -2;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return C12539.f35246;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C12240.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C12240.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC10467 build() {
        C12240 c12240BuildPartial = buildPartial();
        if (c12240BuildPartial.isInitialized()) {
            return c12240BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c12240BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final InterfaceC24548 build() {
        C12240 c12240BuildPartial = buildPartial();
        if (c12240BuildPartial.isInitialized()) {
            return c12240BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c12240BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C12240 buildPartial() {
        C12240 c12240 = new C12240(this, 0);
        C15969 c15969 = this.f17879;
        if (c15969 != null) {
            c12240.f34198 = c15969.m36296();
        } else {
            if ((this.f17878 & 1) != 0) {
                this.f17877 = C21562.unmodifiableList(this.f17877);
                this.f17878 &= -2;
            }
            c12240.f34198 = this.f17877;
        }
        onBuilt();
        return c12240;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C12240) {
            m15769((C12240) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C12240) {
            m15769((C12240) interfaceC24548);
            return this;
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15769(C12240 c12240) {
        if (c12240 == C12240.getDefaultInstance()) {
            return;
        }
        if (this.f17879 == null) {
            if (!c12240.f34198.isEmpty()) {
                if (this.f17877.isEmpty()) {
                    this.f17877 = c12240.f34198;
                    this.f17878 &= -2;
                } else {
                    if ((this.f17878 & 1) == 0) {
                        this.f17877 = new ArrayList(this.f17877);
                        this.f17878 |= 1;
                    }
                    this.f17877.addAll(c12240.f34198);
                }
                onChanged();
            }
        } else if (!c12240.f34198.isEmpty()) {
            if (!this.f17879.m36307()) {
                this.f17879.m36294(c12240.f34198);
            } else {
                this.f17879.m36305();
                C15969 c15969 = null;
                this.f17879 = null;
                List list = c12240.f34198;
                this.f17877 = list;
                this.f17878 &= -2;
                if (AbstractC6285.alwaysUseFieldBuilders) {
                    if (this.f17879 == null) {
                        this.f17879 = new C15969(list, false, getParentForChildren(), isClean());
                        this.f17877 = null;
                    }
                    c15969 = this.f17879;
                }
                this.f17879 = c15969;
            }
        }
        mergeUnknownFields(c12240.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15768(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 10) {
                            C14251 c14251 = (C14251) abstractC9303.mo21520(C14251.parser(), c19283);
                            C15969 c15969 = this.f17879;
                            if (c15969 != null) {
                                c15969.m36299(c14251);
                            } else {
                                if ((this.f17878 & 1) == 0) {
                                    this.f17877 = new ArrayList(this.f17877);
                                    this.f17878 |= 1;
                                }
                                this.f17877.add(c14251);
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
}
