package p067l;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ܿ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6OP */
/* JADX INFO: loaded from: classes5.dex */
public final class C18853 implements InterfaceC5001 {

    /* JADX INFO: renamed from: ۧ */
    public final boolean f56315;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f56317;

    /* JADX INFO: renamed from: ᩳ */
    public final C18182 f56319;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f56316 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final IdentityHashMap f56314 = new IdentityHashMap();

    /* JADX INFO: renamed from: ܿ */
    public final IdentityHashMap f56318 = new IdentityHashMap();

    public C18853(boolean z, boolean z2, boolean z3) {
        this.f56317 = z;
        this.f56315 = z2;
        this.f56319 = z3 ? new C18182() : null;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0078  */
    @Override // p067l.InterfaceC5001
    /* JADX INFO: renamed from: ۧ */
    public final void mo10607(C10856 c10856) {
        int iMo3481;
        C20195.m45697();
        C18182 c18182 = this.f56319;
        if (c18182 != null) {
            c18182.m41399(c10856);
        }
        if (this.f56315) {
            if (this.f56317) {
                if (c10856 instanceof C15518) {
                    iMo3481 = -2;
                } else if (c10856 instanceof C8143) {
                    iMo3481 = -3;
                } else {
                    iMo3481 = -1;
                }
            } else {
                iMo3481 = c10856.mo3481();
                if (iMo3481 != 1 && iMo3481 != 2 && iMo3481 != 8 && iMo3481 != 9 && iMo3481 != 14 && iMo3481 != 15 && iMo3481 != 17 && iMo3481 != 18 && iMo3481 != 40 && iMo3481 != 41 && iMo3481 != 50 && iMo3481 != 51 && iMo3481 != 54 && iMo3481 != 55 && iMo3481 != 30 && iMo3481 != 34 && iMo3481 != 43 && iMo3481 != 47 && iMo3481 != 72) {
                    switch (iMo3481) {
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (iMo3481) {
                                case 57:
                                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                case 60:
                                    break;
                                default:
                                    switch (iMo3481) {
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                            break;
                                        default:
                                            iMo3481 = -1;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                }
            }
            if (iMo3481 == -1) {
                return;
            }
            C4772 c4772 = new C4772(iMo3481, c10856);
            this.f56316.add(c4772);
            this.f56314.put(c10856, c4772);
        }
    }

    @Override // p067l.InterfaceC5001
    /* JADX INFO: renamed from: ֫ */
    public final void mo10604(C10856 c10856) {
        C4772 c4772;
        InterfaceC2808 interfaceC2808;
        C20195.m45697();
        C18182 c18182 = this.f56319;
        if (c18182 != null) {
            c18182.m41401(c10856);
        }
        IdentityHashMap identityHashMap = this.f56314;
        C4772 c4773 = (C4772) identityHashMap.remove(c10856);
        if (c4773 != null && (interfaceC2808 = c10856.f30090) != null) {
            c4773.f10821 = interfaceC2808.mo4432();
        }
        C10856 c10857 = c10856.f65695;
        C4772 c4774 = (C4772) identityHashMap.get(c10857);
        if ((c10856 instanceof C15284) && c4774 != null) {
            c4774.f10814 = true;
        }
        if ((c10856 instanceof C4120) && (c10857 instanceof C12838) && c4774 != null && c4774.f10816 < 0) {
            c4774.f10816 = c10856.f30091.mo4432();
        }
        IdentityHashMap identityHashMap2 = this.f56318;
        if (c4773 != null && c4773.f10822) {
            identityHashMap2.put(c10857, c4773);
        }
        if ((c10856 instanceof C22662) && (c4772 = (C4772) identityHashMap2.get(c10857)) != null) {
            c4772.f10822 = false;
        }
        if (c10856 instanceof C22623) {
            identityHashMap2.remove(c10856);
        }
        c10856.f30089 = null;
    }

    @Override // p067l.InterfaceC5001
    /* JADX INFO: renamed from: ֫ */
    public final void mo10606(C20424 c20424) {
        InterfaceC2808 interfaceC2808 = c20424.f63106;
        C10856 c10856 = (C10856) c20424.f63105;
        C4772 c4772 = (C4772) this.f56314.get(c10856);
        if (c4772 != null) {
            c4772.m10073(interfaceC2808);
        }
        C18182 c18182 = this.f56319;
        if (c18182 != null) {
            c18182.m41400(c10856, interfaceC2808);
        }
        c10856.f30089.clear();
    }

    @Override // p067l.InterfaceC5001
    /* JADX INFO: renamed from: ֫ */
    public final void mo10605(C11036 c11036) {
        mo10606((C20424) c11036);
    }
}
