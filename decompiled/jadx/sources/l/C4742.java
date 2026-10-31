package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۙܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4742 extends AbstractC19916 implements InterfaceC3583 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f15046;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f15047;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C14311 f15048;

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C4742(int i) {
        this();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m13887();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m13887();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m13887();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m13887();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m13888(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m13888(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m13888(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m13888(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32265;
        c9766.m24773(C10387.class, C4742.class);
        return c9766;
    }

    public C4742() {
        this.f15046 = Collections.EMPTY_LIST;
    }

    public C4742(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f15046 = Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13887() {
        super.clear();
        this.f15047 = 0;
        C14311 c14311 = this.f15048;
        if (c14311 == null) {
            this.f15046 = Collections.EMPTY_LIST;
        } else {
            this.f15046 = null;
            c14311.m34169();
        }
        this.f15047 &= -2;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32271;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C10387.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C10387.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C10387 c10387BuildPartial = buildPartial();
        if (c10387BuildPartial.isInitialized()) {
            return c10387BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c10387BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C10387 c10387BuildPartial = buildPartial();
        if (c10387BuildPartial.isInitialized()) {
            return c10387BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c10387BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C10387 buildPartial() {
        C10387 c10387 = new C10387(this, 0);
        C14311 c14311 = this.f15048;
        if (c14311 != null) {
            c10387.f31233 = c14311.m34163();
        } else {
            if ((this.f15047 & 1) != 0) {
                this.f15046 = C20195.unmodifiableList(this.f15046);
                this.f15047 &= -2;
            }
            c10387.f31233 = this.f15046;
        }
        onBuilt();
        return c10387;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C10387) {
            m13889((C10387) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C10387) {
            m13889((C10387) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13889(C10387 c10387) {
        if (c10387 == C10387.getDefaultInstance()) {
            return;
        }
        if (this.f15048 == null) {
            if (!c10387.f31233.isEmpty()) {
                if (this.f15046.isEmpty()) {
                    this.f15046 = c10387.f31233;
                    this.f15047 &= -2;
                } else {
                    if ((this.f15047 & 1) == 0) {
                        this.f15046 = new ArrayList(this.f15046);
                        this.f15047 |= 1;
                    }
                    this.f15046.addAll(c10387.f31233);
                }
                onChanged();
            }
        } else if (!c10387.f31233.isEmpty()) {
            if (!this.f15048.m34174()) {
                this.f15048.m34161(c10387.f31233);
            } else {
                this.f15048.m34172();
                C14311 c14311 = null;
                this.f15048 = null;
                List list = c10387.f31233;
                this.f15046 = list;
                this.f15047 &= -2;
                if (AbstractC4121.alwaysUseFieldBuilders) {
                    if (this.f15048 == null) {
                        this.f15048 = new C14311(list, false, getParentForChildren(), isClean());
                        this.f15046 = null;
                    }
                    c14311 = this.f15048;
                }
                this.f15048 = c14311;
            }
        }
        mergeUnknownFields(c10387.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13888(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 10) {
                            C12503 c12503 = (C12503) abstractC7297.mo19552(C12503.parser(), c17798);
                            C14311 c14311 = this.f15048;
                            if (c14311 != null) {
                                c14311.m34166(c12503);
                            } else {
                                if ((this.f15047 & 1) == 0) {
                                    this.f15046 = new ArrayList(this.f15046);
                                    this.f15047 |= 1;
                                }
                                this.f15046.add(c12503);
                            }
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
}
