package l;

import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ᩳۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17943 extends AbstractC19916 implements InterfaceC3583 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f55934;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f55935;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C15722 f55936;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f55937;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f55938;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C3126 f55939;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f55940;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Object f55941;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f55942;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f55943;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f55944;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object f55945;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f55946;

    public /* synthetic */ C17943(int i) {
        this();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m41943();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m41943();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m41943();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m41943();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m41944(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m41944(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m41944(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m41944(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C10702.f32229;
        c9766.m24773(C20766.class, C17943.class);
        return c9766;
    }

    public C17943() {
        this.f55941 = "";
        this.f55934 = 1;
        this.f55937 = 1;
        this.f55942 = "";
        this.f55943 = "";
        this.f55945 = "";
        this.f55935 = "";
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m41942();
        }
    }

    public C17943(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f55941 = "";
        this.f55934 = 1;
        this.f55937 = 1;
        this.f55942 = "";
        this.f55943 = "";
        this.f55945 = "";
        this.f55935 = "";
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m41942();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41943() {
        super.clear();
        this.f55944 = 0;
        this.f55941 = "";
        this.f55940 = 0;
        this.f55934 = 1;
        this.f55937 = 1;
        this.f55942 = "";
        this.f55943 = "";
        this.f55945 = "";
        this.f55938 = 0;
        this.f55935 = "";
        this.f55939 = null;
        C15722 c15722 = this.f55936;
        if (c15722 != null) {
            c15722.m37102();
            this.f55936 = null;
        }
        this.f55946 = false;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32239;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C20766.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C20766.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C20766 c20766BuildPartial = buildPartial();
        if (c20766BuildPartial.isInitialized()) {
            return c20766BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c20766BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C20766 c20766BuildPartial = buildPartial();
        if (c20766BuildPartial.isInitialized()) {
            return c20766BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c20766BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C20766 buildPartial() {
        C3126 c3126;
        int i = 0;
        C20766 c20766 = new C20766(this, 0);
        int i2 = this.f55944;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c20766.f67264 = this.f55941;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c20766.f67262 = this.f55940;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c20766.f67258 = this.f55934;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c20766.f67261 = this.f55937;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c20766.f67266 = this.f55942;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                c20766.f67267 = this.f55943;
                i |= 32;
            }
            if ((i2 & 64) != 0) {
                c20766.f67269 = this.f55945;
                i |= 64;
            }
            if ((i2 & 128) != 0) {
                c20766.f67260 = this.f55938;
                i |= 128;
            }
            if ((i2 & 256) != 0) {
                c20766.f67259 = this.f55935;
                i |= 256;
            }
            if ((i2 & 512) != 0) {
                C15722 c15722 = this.f55936;
                if (c15722 == null) {
                    c3126 = this.f55939;
                } else {
                    c3126 = (C3126) c15722.m37099();
                }
                c20766.f67263 = c3126;
                i |= 512;
            }
            if ((i2 & 1024) != 0) {
                c20766.f67270 = this.f55946;
                i |= 1024;
            }
            c20766.f67268 = i | c20766.f67268;
        }
        onBuilt();
        return c20766;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C20766) {
            m41945((C20766) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C20766) {
            m41945((C20766) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41945(C20766 c20766) {
        C3126 c3126;
        if (c20766 == C20766.getDefaultInstance()) {
            return;
        }
        if (c20766.hasName()) {
            this.f55941 = c20766.f67264;
            this.f55944 |= 1;
            onChanged();
        }
        if (c20766.m47466()) {
            this.f55940 = c20766.m47467();
            this.f55944 |= 2;
            onChanged();
        }
        if (c20766.m47463()) {
            EnumC14414 enumC14414M47464 = c20766.m47464();
            enumC14414M47464.getClass();
            this.f55944 |= 4;
            this.f55934 = enumC14414M47464.getNumber();
            onChanged();
        }
        if (c20766.hasType()) {
            EnumC6654 type = c20766.getType();
            type.getClass();
            this.f55944 |= 8;
            this.f55937 = type.getNumber();
            onChanged();
        }
        if (c20766.m47460()) {
            this.f55942 = c20766.f67266;
            this.f55944 |= 16;
            onChanged();
        }
        if (c20766.m47461()) {
            this.f55943 = c20766.f67267;
            this.f55944 |= 32;
            onChanged();
        }
        if (c20766.m47456()) {
            this.f55945 = c20766.f67269;
            this.f55944 |= 64;
            onChanged();
        }
        if (c20766.m47472()) {
            this.f55938 = c20766.m47458();
            this.f55944 |= 128;
            onChanged();
        }
        if (c20766.m47457()) {
            this.f55935 = c20766.f67259;
            this.f55944 |= 256;
            onChanged();
        }
        if (c20766.m47473()) {
            C3126 c3126M47459 = c20766.m47459();
            C15722 c15722 = this.f55936;
            if (c15722 == null) {
                if ((this.f55944 & 512) == 0 || (c3126 = this.f55939) == null || c3126 == C3126.getDefaultInstance()) {
                    this.f55939 = c3126M47459;
                } else {
                    this.f55944 |= 512;
                    onChanged();
                    ((C8771) m41942().m37104()).m22663(c3126M47459);
                }
            } else {
                c15722.m37098(c3126M47459);
            }
            if (this.f55939 != null) {
                this.f55944 |= 512;
                onChanged();
            }
        }
        if (c20766.m47470()) {
            this.f55946 = c20766.m47468();
            this.f55944 |= 1024;
            onChanged();
        }
        mergeUnknownFields(c20766.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41944(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    switch (iMo19567) {
                        case 0:
                            break;
                        case 10:
                            this.f55941 = abstractC7297.mo19566();
                            this.f55944 |= 1;
                            continue;
                        case 18:
                            this.f55943 = abstractC7297.mo19566();
                            this.f55944 |= 32;
                            continue;
                        case 24:
                            this.f55940 = abstractC7297.mo19568();
                            this.f55944 |= 2;
                            continue;
                        case 32:
                            int iMo19560 = abstractC7297.mo19560();
                            if (EnumC14414.m34439(iMo19560) == null) {
                                mergeUnknownVarintField(4, iMo19560);
                            } else {
                                this.f55934 = iMo19560;
                                this.f55944 |= 4;
                                continue;
                            }
                            break;
                        case 40:
                            int iMo19561 = abstractC7297.mo19560();
                            if (EnumC6654.m18174(iMo19561) == null) {
                                mergeUnknownVarintField(5, iMo19561);
                            } else {
                                this.f55937 = iMo19561;
                                this.f55944 |= 8;
                                continue;
                            }
                            break;
                        case 50:
                            this.f55942 = abstractC7297.mo19566();
                            this.f55944 |= 16;
                            continue;
                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            this.f55945 = abstractC7297.mo19566();
                            this.f55944 |= 64;
                            continue;
                        case 66:
                            abstractC7297.mo19556(m41942().m37104(), c17798);
                            this.f55944 |= 512;
                            continue;
                        case 72:
                            this.f55938 = abstractC7297.mo19568();
                            this.f55944 |= 128;
                            continue;
                        case 82:
                            this.f55935 = abstractC7297.mo19566();
                            this.f55944 |= 256;
                            continue;
                        case 136:
                            this.f55946 = abstractC7297.mo19571();
                            this.f55944 |= 1024;
                            continue;
                        default:
                            if (!super.parseUnknownField(abstractC7297, c17798, iMo19567)) {
                                break;
                            }
                            break;
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
        C3126 defaultInstance;
        if ((this.f55944 & 512) == 0) {
            return true;
        }
        C15722 c15722 = this.f55936;
        if (c15722 == null) {
            defaultInstance = this.f55939;
            if (defaultInstance == null) {
                defaultInstance = C3126.getDefaultInstance();
            }
        } else {
            defaultInstance = (C3126) c15722.m37103();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C15722 m41942() {
        C3126 defaultInstance;
        C15722 c15722 = this.f55936;
        if (c15722 == null) {
            if (c15722 == null) {
                defaultInstance = this.f55939;
                if (defaultInstance == null) {
                    defaultInstance = C3126.getDefaultInstance();
                }
            } else {
                defaultInstance = (C3126) c15722.m37103();
            }
            this.f55936 = new C15722(defaultInstance, getParentForChildren(), isClean());
            this.f55939 = null;
        }
        return this.f55936;
    }
}
