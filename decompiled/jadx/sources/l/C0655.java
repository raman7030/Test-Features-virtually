package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.֡᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0655 extends AbstractC19916 implements InterfaceC3583 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public List f2506;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C14311 f2507;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14311 f2508;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public List f2509;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C14311 f2510;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14311 f2511;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C15722 f2512;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Object f2513;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f2514;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f2515;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f2516;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public List f2517;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C16736 f2518;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public C14311 f2519;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C2731 f2520;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f2521;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f2522;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C14311 f2523;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C14311 f2524;

    public /* synthetic */ C0655(int i) {
        this();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m2686clear();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m2686clear();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m2686clear();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m2686clear();
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
        C9766 c9766 = C10702.f32230;
        c9766.m24773(C20412.class, C0655.class);
        return c9766;
    }

    public C0655() {
        this.f2513 = "";
        List list = Collections.EMPTY_LIST;
        this.f2509 = list;
        this.f2514 = list;
        this.f2516 = list;
        this.f2521 = list;
        this.f2515 = list;
        this.f2506 = list;
        this.f2517 = list;
        this.f2520 = C2731.m8466();
        maybeForceBuilderInitialization();
    }

    public C0655(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f2513 = "";
        List list = Collections.EMPTY_LIST;
        this.f2509 = list;
        this.f2514 = list;
        this.f2516 = list;
        this.f2521 = list;
        this.f2515 = list;
        this.f2506 = list;
        this.f2517 = list;
        this.f2520 = C2731.m8466();
        maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m2679();
            m2682();
            m2676();
            m2680();
            m2681();
            m2683();
            m2678();
            m2677();
        }
    }

    /* JADX INFO: renamed from: clear, reason: collision with other method in class */
    public final void m2686clear() {
        super.clear();
        this.f2522 = 0;
        this.f2513 = "";
        C14311 c14311 = this.f2511;
        if (c14311 == null) {
            this.f2509 = Collections.EMPTY_LIST;
        } else {
            this.f2509 = null;
            c14311.m34169();
        }
        this.f2522 &= -3;
        C14311 c14312 = this.f2508;
        if (c14312 == null) {
            this.f2514 = Collections.EMPTY_LIST;
        } else {
            this.f2514 = null;
            c14312.m34169();
        }
        this.f2522 &= -5;
        C14311 c14313 = this.f2524;
        if (c14313 == null) {
            this.f2516 = Collections.EMPTY_LIST;
        } else {
            this.f2516 = null;
            c14313.m34169();
        }
        this.f2522 &= -9;
        C14311 c14314 = this.f2523;
        if (c14314 == null) {
            this.f2521 = Collections.EMPTY_LIST;
        } else {
            this.f2521 = null;
            c14314.m34169();
        }
        this.f2522 &= -17;
        C14311 c14315 = this.f2507;
        if (c14315 == null) {
            this.f2515 = Collections.EMPTY_LIST;
        } else {
            this.f2515 = null;
            c14315.m34169();
        }
        this.f2522 &= -33;
        C14311 c14316 = this.f2510;
        if (c14316 == null) {
            this.f2506 = Collections.EMPTY_LIST;
        } else {
            this.f2506 = null;
            c14316.m34169();
        }
        this.f2522 &= -65;
        this.f2518 = null;
        C15722 c15722 = this.f2512;
        if (c15722 != null) {
            c15722.m37102();
            this.f2512 = null;
        }
        C14311 c14317 = this.f2519;
        if (c14317 == null) {
            this.f2517 = Collections.EMPTY_LIST;
        } else {
            this.f2517 = null;
            c14317.m34169();
        }
        this.f2522 &= -257;
        this.f2520 = C2731.m8466();
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return C10702.f32273;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C20412.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C20412.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C20412 build() {
        C20412 c20412BuildPartial = buildPartial();
        if (c20412BuildPartial.isInitialized()) {
            return c20412BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c20412BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C20412 buildPartial() {
        C16736 c16736;
        int i = 0;
        C20412 c20412 = new C20412(this, 0);
        C14311 c14311 = this.f2511;
        if (c14311 != null) {
            c20412.f65854 = c14311.m34163();
        } else {
            if ((this.f2522 & 2) != 0) {
                this.f2509 = C20195.unmodifiableList(this.f2509);
                this.f2522 &= -3;
            }
            c20412.f65854 = this.f2509;
        }
        C14311 c14312 = this.f2508;
        if (c14312 != null) {
            c20412.f65855 = c14312.m34163();
        } else {
            if ((this.f2522 & 4) != 0) {
                this.f2514 = C20195.unmodifiableList(this.f2514);
                this.f2522 &= -5;
            }
            c20412.f65855 = this.f2514;
        }
        C14311 c14313 = this.f2524;
        if (c14313 != null) {
            c20412.f65857 = c14313.m34163();
        } else {
            if ((this.f2522 & 8) != 0) {
                this.f2516 = C20195.unmodifiableList(this.f2516);
                this.f2522 &= -9;
            }
            c20412.f65857 = this.f2516;
        }
        C14311 c14314 = this.f2523;
        if (c14314 != null) {
            c20412.f65864 = c14314.m34163();
        } else {
            if ((this.f2522 & 16) != 0) {
                this.f2521 = C20195.unmodifiableList(this.f2521);
                this.f2522 &= -17;
            }
            c20412.f65864 = this.f2521;
        }
        C14311 c14315 = this.f2507;
        if (c14315 != null) {
            c20412.f65862 = c14315.m34163();
        } else {
            if ((this.f2522 & 32) != 0) {
                this.f2515 = C20195.unmodifiableList(this.f2515);
                this.f2522 &= -33;
            }
            c20412.f65862 = this.f2515;
        }
        C14311 c14316 = this.f2510;
        if (c14316 != null) {
            c20412.f65856 = c14316.m34163();
        } else {
            if ((this.f2522 & 64) != 0) {
                this.f2506 = C20195.unmodifiableList(this.f2506);
                this.f2522 &= -65;
            }
            c20412.f65856 = this.f2506;
        }
        C14311 c14317 = this.f2519;
        if (c14317 != null) {
            c20412.f65861 = c14317.m34163();
        } else {
            if ((this.f2522 & 256) != 0) {
                this.f2517 = C20195.unmodifiableList(this.f2517);
                this.f2522 &= -257;
            }
            c20412.f65861 = this.f2517;
        }
        int i2 = this.f2522;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c20412.f65859 = this.f2513;
                i = 1;
            }
            if ((i2 & 128) != 0) {
                C15722 c15722 = this.f2512;
                if (c15722 == null) {
                    c16736 = this.f2518;
                } else {
                    c16736 = (C16736) c15722.m37099();
                }
                c20412.f65858 = c16736;
                i |= 2;
            }
            if ((i2 & 512) != 0) {
                this.f2520.mo44493();
                c20412.f65865 = this.f2520;
            }
            c20412.f65863 = i | c20412.f65863;
        }
        onBuilt();
        return c20412;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C20412) {
            m2685((C20412) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C20412) {
            m2685((C20412) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2685(C20412 c20412) {
        C16736 c16736;
        if (c20412 == C20412.getDefaultInstance()) {
            return;
        }
        if (c20412.hasName()) {
            this.f2513 = c20412.f65859;
            this.f2522 |= 1;
            onChanged();
        }
        if (this.f2511 == null) {
            if (!c20412.f65854.isEmpty()) {
                if (this.f2509.isEmpty()) {
                    this.f2509 = c20412.f65854;
                    this.f2522 &= -3;
                } else {
                    if ((this.f2522 & 2) == 0) {
                        this.f2509 = new ArrayList(this.f2509);
                        this.f2522 |= 2;
                    }
                    this.f2509.addAll(c20412.f65854);
                }
                onChanged();
            }
        } else if (!c20412.f65854.isEmpty()) {
            if (!this.f2511.m34174()) {
                this.f2511.m34161(c20412.f65854);
            } else {
                this.f2511.m34172();
                this.f2511 = null;
                this.f2509 = c20412.f65854;
                this.f2522 &= -3;
                this.f2511 = AbstractC4121.alwaysUseFieldBuilders ? m2679() : null;
            }
        }
        if (this.f2508 == null) {
            if (!c20412.f65855.isEmpty()) {
                if (this.f2514.isEmpty()) {
                    this.f2514 = c20412.f65855;
                    this.f2522 &= -5;
                } else {
                    if ((this.f2522 & 4) == 0) {
                        this.f2514 = new ArrayList(this.f2514);
                        this.f2522 |= 4;
                    }
                    this.f2514.addAll(c20412.f65855);
                }
                onChanged();
            }
        } else if (!c20412.f65855.isEmpty()) {
            if (!this.f2508.m34174()) {
                this.f2508.m34161(c20412.f65855);
            } else {
                this.f2508.m34172();
                this.f2508 = null;
                this.f2514 = c20412.f65855;
                this.f2522 &= -5;
                this.f2508 = AbstractC4121.alwaysUseFieldBuilders ? m2682() : null;
            }
        }
        if (this.f2524 == null) {
            if (!c20412.f65857.isEmpty()) {
                if (this.f2516.isEmpty()) {
                    this.f2516 = c20412.f65857;
                    this.f2522 &= -9;
                } else {
                    if ((this.f2522 & 8) == 0) {
                        this.f2516 = new ArrayList(this.f2516);
                        this.f2522 |= 8;
                    }
                    this.f2516.addAll(c20412.f65857);
                }
                onChanged();
            }
        } else if (!c20412.f65857.isEmpty()) {
            if (!this.f2524.m34174()) {
                this.f2524.m34161(c20412.f65857);
            } else {
                this.f2524.m34172();
                this.f2524 = null;
                this.f2516 = c20412.f65857;
                this.f2522 &= -9;
                this.f2524 = AbstractC4121.alwaysUseFieldBuilders ? m2676() : null;
            }
        }
        if (this.f2523 == null) {
            if (!c20412.f65864.isEmpty()) {
                if (this.f2521.isEmpty()) {
                    this.f2521 = c20412.f65864;
                    this.f2522 &= -17;
                } else {
                    if ((this.f2522 & 16) == 0) {
                        this.f2521 = new ArrayList(this.f2521);
                        this.f2522 |= 16;
                    }
                    this.f2521.addAll(c20412.f65864);
                }
                onChanged();
            }
        } else if (!c20412.f65864.isEmpty()) {
            if (!this.f2523.m34174()) {
                this.f2523.m34161(c20412.f65864);
            } else {
                this.f2523.m34172();
                this.f2523 = null;
                this.f2521 = c20412.f65864;
                this.f2522 &= -17;
                this.f2523 = AbstractC4121.alwaysUseFieldBuilders ? m2680() : null;
            }
        }
        if (this.f2507 == null) {
            if (!c20412.f65862.isEmpty()) {
                if (this.f2515.isEmpty()) {
                    this.f2515 = c20412.f65862;
                    this.f2522 &= -33;
                } else {
                    m2675();
                    this.f2515.addAll(c20412.f65862);
                }
                onChanged();
            }
        } else if (!c20412.f65862.isEmpty()) {
            if (!this.f2507.m34174()) {
                this.f2507.m34161(c20412.f65862);
            } else {
                this.f2507.m34172();
                this.f2507 = null;
                this.f2515 = c20412.f65862;
                this.f2522 &= -33;
                this.f2507 = AbstractC4121.alwaysUseFieldBuilders ? m2681() : null;
            }
        }
        if (this.f2510 == null) {
            if (!c20412.f65856.isEmpty()) {
                if (this.f2506.isEmpty()) {
                    this.f2506 = c20412.f65856;
                    this.f2522 &= -65;
                } else {
                    if ((this.f2522 & 64) == 0) {
                        this.f2506 = new ArrayList(this.f2506);
                        this.f2522 |= 64;
                    }
                    this.f2506.addAll(c20412.f65856);
                }
                onChanged();
            }
        } else if (!c20412.f65856.isEmpty()) {
            if (!this.f2510.m34174()) {
                this.f2510.m34161(c20412.f65856);
            } else {
                this.f2510.m34172();
                this.f2510 = null;
                this.f2506 = c20412.f65856;
                this.f2522 &= -65;
                this.f2510 = AbstractC4121.alwaysUseFieldBuilders ? m2683() : null;
            }
        }
        if (c20412.m46766()) {
            C16736 c16736M46765 = c20412.m46765();
            C15722 c15722 = this.f2512;
            if (c15722 == null) {
                if ((this.f2522 & 128) == 0 || (c16736 = this.f2518) == null || c16736 == C16736.getDefaultInstance()) {
                    this.f2518 = c16736M46765;
                } else {
                    this.f2522 |= 128;
                    onChanged();
                    ((C11093) m2678().m37104()).m27524(c16736M46765);
                }
            } else {
                c15722.m37098(c16736M46765);
            }
            if (this.f2518 != null) {
                this.f2522 |= 128;
                onChanged();
            }
        }
        if (this.f2519 == null) {
            if (!c20412.f65861.isEmpty()) {
                if (this.f2517.isEmpty()) {
                    this.f2517 = c20412.f65861;
                    this.f2522 &= -257;
                } else {
                    if ((this.f2522 & 256) == 0) {
                        this.f2517 = new ArrayList(this.f2517);
                        this.f2522 |= 256;
                    }
                    this.f2517.addAll(c20412.f65861);
                }
                onChanged();
            }
        } else if (!c20412.f65861.isEmpty()) {
            if (!this.f2519.m34174()) {
                this.f2519.m34161(c20412.f65861);
            } else {
                this.f2519.m34172();
                this.f2519 = null;
                this.f2517 = c20412.f65861;
                this.f2522 &= -257;
                this.f2519 = AbstractC4121.alwaysUseFieldBuilders ? m2677() : null;
            }
        }
        if (!c20412.f65865.isEmpty()) {
            if (this.f2520.isEmpty()) {
                this.f2520 = c20412.f65865;
                this.f2522 |= 512;
            } else {
                if (!this.f2520.mo44491()) {
                    this.f2520 = new C2731(this.f2520);
                }
                this.f2522 |= 512;
                this.f2520.addAll(c20412.f65865);
            }
            onChanged();
        }
        mergeUnknownFields(c20412.getUnknownFields());
        onChanged();
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final C0655 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
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
                            this.f2513 = abstractC7297.mo19566();
                            this.f2522 |= 1;
                            continue;
                        case 18:
                            C20766 c20766 = (C20766) abstractC7297.mo19552(C20766.parser(), c17798);
                            C14311 c14311 = this.f2511;
                            if (c14311 != null) {
                                c14311.m34166(c20766);
                                continue;
                            } else {
                                if ((this.f2522 & 2) == 0) {
                                    this.f2509 = new ArrayList(this.f2509);
                                    this.f2522 |= 2;
                                }
                                this.f2509.add(c20766);
                            }
                            break;
                        case 26:
                            C20412 c20412 = (C20412) abstractC7297.mo19552(C20412.parser(), c17798);
                            C14311 c14312 = this.f2524;
                            if (c14312 != null) {
                                c14312.m34166(c20412);
                                continue;
                            } else {
                                if ((this.f2522 & 8) == 0) {
                                    this.f2516 = new ArrayList(this.f2516);
                                    this.f2522 |= 8;
                                }
                                this.f2516.add(c20412);
                            }
                            break;
                        case 34:
                            C23233 c23233 = (C23233) abstractC7297.mo19552(C23233.parser(), c17798);
                            C14311 c14313 = this.f2523;
                            if (c14313 != null) {
                                c14313.m34166(c23233);
                                continue;
                            } else {
                                if ((this.f2522 & 16) == 0) {
                                    this.f2521 = new ArrayList(this.f2521);
                                    this.f2522 |= 16;
                                }
                                this.f2521.add(c23233);
                            }
                            break;
                        case 42:
                            C8417 c8417 = (C8417) abstractC7297.mo19552(C8417.parser(), c17798);
                            C14311 c14314 = this.f2507;
                            if (c14314 == null) {
                                m2675();
                                this.f2515.add(c8417);
                            } else {
                                c14314.m34166(c8417);
                                continue;
                            }
                            break;
                        case 50:
                            C20766 c20767 = (C20766) abstractC7297.mo19552(C20766.parser(), c17798);
                            C14311 c14315 = this.f2508;
                            if (c14315 != null) {
                                c14315.m34166(c20767);
                                continue;
                            } else {
                                if ((this.f2522 & 4) == 0) {
                                    this.f2514 = new ArrayList(this.f2514);
                                    this.f2522 |= 4;
                                }
                                this.f2514.add(c20767);
                            }
                            break;
                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            abstractC7297.mo19556(m2678().m37104(), c17798);
                            this.f2522 |= 128;
                            continue;
                        case 66:
                            C4037 c4037 = (C4037) abstractC7297.mo19552(C4037.parser(), c17798);
                            C14311 c14316 = this.f2510;
                            if (c14316 != null) {
                                c14316.m34166(c4037);
                                continue;
                            } else {
                                if ((this.f2522 & 64) == 0) {
                                    this.f2506 = new ArrayList(this.f2506);
                                    this.f2522 |= 64;
                                }
                                this.f2506.add(c4037);
                            }
                            break;
                        case 74:
                            C22528 c22528 = (C22528) abstractC7297.mo19552(C22528.parser(), c17798);
                            C14311 c14317 = this.f2519;
                            if (c14317 != null) {
                                c14317.m34166(c22528);
                                continue;
                            } else {
                                if ((this.f2522 & 256) == 0) {
                                    this.f2517 = new ArrayList(this.f2517);
                                    this.f2522 |= 256;
                                }
                                this.f2517.add(c22528);
                            }
                            break;
                        case 82:
                            AbstractC5886 abstractC5886Mo19566 = abstractC7297.mo19566();
                            if (!this.f2520.mo44491()) {
                                this.f2520 = new C2731(this.f2520);
                            }
                            this.f2522 |= 512;
                            this.f2520.mo8469(abstractC5886Mo19566);
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
        return this;
    }

    public final void setName(String str) {
        str.getClass();
        this.f2513 = str;
        this.f2522 |= 1;
        onChanged();
    }

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        int iM34167;
        int iM34168;
        int iM34169;
        int iM341610;
        int iM341611;
        int iM341612;
        C16736 defaultInstance;
        C4037 c4037;
        C8417 c8417;
        C23233 c23233;
        C20412 c20412;
        C20766 c20766;
        C20766 c20767;
        int i = 0;
        while (true) {
            C14311 c14311 = this.f2511;
            if (c14311 == null) {
                iM34167 = this.f2509.size();
            } else {
                iM34167 = c14311.m34167();
            }
            if (i < iM34167) {
                C14311 c14312 = this.f2511;
                if (c14312 == null) {
                    c20767 = (C20766) this.f2509.get(i);
                } else {
                    c20767 = (C20766) c14312.m34164(i);
                }
                if (!c20767.isInitialized()) {
                    break;
                }
                i++;
            } else {
                int i2 = 0;
                while (true) {
                    C14311 c14313 = this.f2508;
                    if (c14313 == null) {
                        iM34168 = this.f2514.size();
                    } else {
                        iM34168 = c14313.m34167();
                    }
                    if (i2 < iM34168) {
                        C14311 c14314 = this.f2508;
                        if (c14314 == null) {
                            c20766 = (C20766) this.f2514.get(i2);
                        } else {
                            c20766 = (C20766) c14314.m34164(i2);
                        }
                        if (!c20766.isInitialized()) {
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 0;
                        while (true) {
                            C14311 c14315 = this.f2524;
                            if (c14315 == null) {
                                iM34169 = this.f2516.size();
                            } else {
                                iM34169 = c14315.m34167();
                            }
                            if (i3 < iM34169) {
                                C14311 c14316 = this.f2524;
                                if (c14316 == null) {
                                    c20412 = (C20412) this.f2516.get(i3);
                                } else {
                                    c20412 = (C20412) c14316.m34164(i3);
                                }
                                if (!c20412.isInitialized()) {
                                    break;
                                }
                                i3++;
                            } else {
                                int i4 = 0;
                                while (true) {
                                    C14311 c14317 = this.f2523;
                                    if (c14317 == null) {
                                        iM341610 = this.f2521.size();
                                    } else {
                                        iM341610 = c14317.m34167();
                                    }
                                    if (i4 < iM341610) {
                                        C14311 c14318 = this.f2523;
                                        if (c14318 == null) {
                                            c23233 = (C23233) this.f2521.get(i4);
                                        } else {
                                            c23233 = (C23233) c14318.m34164(i4);
                                        }
                                        if (!c23233.isInitialized()) {
                                            break;
                                        }
                                        i4++;
                                    } else {
                                        int i5 = 0;
                                        while (true) {
                                            C14311 c14319 = this.f2507;
                                            if (c14319 == null) {
                                                iM341611 = this.f2515.size();
                                            } else {
                                                iM341611 = c14319.m34167();
                                            }
                                            if (i5 < iM341611) {
                                                C14311 c143110 = this.f2507;
                                                if (c143110 == null) {
                                                    c8417 = (C8417) this.f2515.get(i5);
                                                } else {
                                                    c8417 = (C8417) c143110.m34164(i5);
                                                }
                                                if (!c8417.isInitialized()) {
                                                    break;
                                                }
                                                i5++;
                                            } else {
                                                int i6 = 0;
                                                while (true) {
                                                    C14311 c143111 = this.f2510;
                                                    if (c143111 == null) {
                                                        iM341612 = this.f2506.size();
                                                    } else {
                                                        iM341612 = c143111.m34167();
                                                    }
                                                    if (i6 < iM341612) {
                                                        C14311 c143112 = this.f2510;
                                                        if (c143112 == null) {
                                                            c4037 = (C4037) this.f2506.get(i6);
                                                        } else {
                                                            c4037 = (C4037) c143112.m34164(i6);
                                                        }
                                                        if (!c4037.isInitialized()) {
                                                            break;
                                                        }
                                                        i6++;
                                                    } else {
                                                        if ((this.f2522 & 128) == 0) {
                                                            return true;
                                                        }
                                                        C15722 c15722 = this.f2512;
                                                        if (c15722 == null) {
                                                            defaultInstance = this.f2518;
                                                            if (defaultInstance == null) {
                                                                defaultInstance = C16736.getDefaultInstance();
                                                            }
                                                        } else {
                                                            defaultInstance = (C16736) c15722.m37103();
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

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C14311 m2679() {
        if (this.f2511 == null) {
            this.f2511 = new C14311(this.f2509, (this.f2522 & 2) != 0, getParentForChildren(), isClean());
            this.f2509 = null;
        }
        return this.f2511;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C14311 m2682() {
        if (this.f2508 == null) {
            this.f2508 = new C14311(this.f2514, (this.f2522 & 4) != 0, getParentForChildren(), isClean());
            this.f2514 = null;
        }
        return this.f2508;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private C14311 m2676() {
        if (this.f2524 == null) {
            this.f2524 = new C14311(this.f2516, (this.f2522 & 8) != 0, getParentForChildren(), isClean());
            this.f2516 = null;
        }
        return this.f2524;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C14311 m2680() {
        if (this.f2523 == null) {
            this.f2523 = new C14311(this.f2521, (this.f2522 & 16) != 0, getParentForChildren(), isClean());
            this.f2521 = null;
        }
        return this.f2523;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m2675() {
        if ((this.f2522 & 32) == 0) {
            this.f2515 = new ArrayList(this.f2515);
            this.f2522 |= 32;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2684(C8417 c8417) {
        C14311 c14311 = this.f2507;
        if (c14311 == null) {
            m2675();
            this.f2515.add(c8417);
            onChanged();
            return;
        }
        c14311.m34166(c8417);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C14311 m2681() {
        if (this.f2507 == null) {
            this.f2507 = new C14311(this.f2515, (this.f2522 & 32) != 0, getParentForChildren(), isClean());
            this.f2515 = null;
        }
        return this.f2507;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C14311 m2683() {
        if (this.f2510 == null) {
            this.f2510 = new C14311(this.f2506, (this.f2522 & 64) != 0, getParentForChildren(), isClean());
            this.f2506 = null;
        }
        return this.f2510;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private C15722 m2678() {
        C16736 defaultInstance;
        C15722 c15722 = this.f2512;
        if (c15722 == null) {
            if (c15722 == null) {
                defaultInstance = this.f2518;
                if (defaultInstance == null) {
                    defaultInstance = C16736.getDefaultInstance();
                }
            } else {
                defaultInstance = (C16736) c15722.m37103();
            }
            this.f2512 = new C15722(defaultInstance, getParentForChildren(), isClean());
            this.f2518 = null;
        }
        return this.f2512;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private C14311 m2677() {
        if (this.f2519 == null) {
            this.f2519 = new C14311(this.f2517, (this.f2522 & 256) != 0, getParentForChildren(), isClean());
            this.f2517 = null;
        }
        return this.f2519;
    }
}
