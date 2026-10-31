package l;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ܿ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6OP */
/* JADX INFO: loaded from: classes5.dex */
public final class C17345 implements InterfaceC2770 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f53131;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f53133;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16639 f53135;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53132 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f53130 = new IdentityHashMap();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f53134 = new IdentityHashMap();

    public C17345(boolean z, boolean z2, boolean z3) {
        this.f53133 = z;
        this.f53131 = z2;
        this.f53135 = z3 ? new C16639() : null;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0078  */
    @Override // l.InterfaceC2770
    /* JADX INFO: renamed from: ۧ */
    public final void mo8544(C8931 c8931) {
        int iMo1085;
        C18757.m43430();
        C16639 c16639 = this.f53135;
        if (c16639 != null) {
            c16639.m39171(c8931);
        }
        if (this.f53131) {
            if (this.f53133) {
                if (c8931 instanceof C13836) {
                    iMo1085 = -2;
                } else if (c8931 instanceof C6076) {
                    iMo1085 = -3;
                } else {
                    iMo1085 = -1;
                }
            } else {
                iMo1085 = c8931.mo1085();
                if (iMo1085 != 1 && iMo1085 != 2 && iMo1085 != 8 && iMo1085 != 9 && iMo1085 != 14 && iMo1085 != 15 && iMo1085 != 17 && iMo1085 != 18 && iMo1085 != 40 && iMo1085 != 41 && iMo1085 != 50 && iMo1085 != 51 && iMo1085 != 54 && iMo1085 != 55 && iMo1085 != 30 && iMo1085 != 34 && iMo1085 != 43 && iMo1085 != 47 && iMo1085 != 72) {
                    switch (iMo1085) {
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (iMo1085) {
                                case 57:
                                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                case 60:
                                    break;
                                default:
                                    switch (iMo1085) {
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                            break;
                                        default:
                                            iMo1085 = -1;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                }
            }
            if (iMo1085 == -1) {
                return;
            }
            C2529 c2529 = new C2529(iMo1085, c8931);
            this.f53132.add(c2529);
            this.f53130.put(c8931, c2529);
        }
    }

    @Override // l.InterfaceC2770
    /* JADX INFO: renamed from: ֫ */
    public final void mo8541(C8931 c8931) {
        C2529 c2529;
        InterfaceC0463 interfaceC0463;
        C18757.m43430();
        C16639 c16639 = this.f53135;
        if (c16639 != null) {
            c16639.m39173(c8931);
        }
        IdentityHashMap identityHashMap = this.f53130;
        C2529 c25210 = (C2529) identityHashMap.remove(c8931);
        if (c25210 != null && (interfaceC0463 = c8931.f27155) != null) {
            c25210.f8030 = interfaceC0463.mo2052();
        }
        C8931 c8932 = c8931.f63075;
        C2529 c25211 = (C2529) identityHashMap.get(c8932);
        if ((c8931 instanceof C13590) && c25211 != null) {
            c25211.f8023 = true;
        }
        if ((c8931 instanceof C1843) && (c8932 instanceof C11016) && c25211 != null && c25211.f8025 < 0) {
            c25211.f8025 = c8931.f27156.mo2052();
        }
        IdentityHashMap identityHashMap2 = this.f53134;
        if (c25210 != null && c25210.f8031) {
            identityHashMap2.put(c8932, c25210);
        }
        if ((c8931 instanceof C21353) && (c2529 = (C2529) identityHashMap2.get(c8932)) != null) {
            c2529.f8031 = false;
        }
        if (c8931 instanceof C21312) {
            identityHashMap2.remove(c8931);
        }
        c8931.f27154 = null;
    }

    @Override // l.InterfaceC2770
    /* JADX INFO: renamed from: ֫ */
    public final void mo8543(C18998 c18998) {
        InterfaceC0463 interfaceC0463 = c18998.f59877;
        C8931 c8931 = (C8931) c18998.f59876;
        C2529 c2529 = (C2529) this.f53130.get(c8931);
        if (c2529 != null) {
            c2529.m8043(interfaceC0463);
        }
        C16639 c16639 = this.f53135;
        if (c16639 != null) {
            c16639.m39172(c8931, interfaceC0463);
        }
        c8931.f27154.clear();
    }

    @Override // l.InterfaceC2770
    /* JADX INFO: renamed from: ֫ */
    public final void mo8542(C9120 c9120) {
        mo8543((C18998) c9120);
    }
}
