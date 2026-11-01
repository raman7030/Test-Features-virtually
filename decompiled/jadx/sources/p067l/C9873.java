package p067l;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Set;
import org.bouncycastle.math.p080ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.۠ۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F5Y4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9873 {

    /* JADX INFO: renamed from: ֫ */
    public final int f27379;

    /* JADX INFO: renamed from: ۧ */
    public final int f27380;

    /* JADX INFO: renamed from: ܽ */
    public final EnumMap f27381;

    /* JADX INFO: renamed from: ܿ */
    public final EnumC3167[] f27382 = new EnumC3167[256];

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f27383;

    public C9873(int i, int i2) {
        InterfaceC9410 interfaceC9410;
        int i3 = 19;
        int i4 = 39;
        if (i >= 21) {
            this.f27379 = i;
            if (i >= 19) {
                switch (i) {
                    case 19:
                    case 20:
                        i4 = 7;
                        break;
                    case 21:
                        break;
                    case 22:
                        i4 = 45;
                        break;
                    case 23:
                        i4 = 64;
                        break;
                    case 24:
                    case 25:
                        i4 = 79;
                        break;
                    case 26:
                        i4 = 124;
                        break;
                    case 27:
                        i4 = 131;
                        break;
                    case 28:
                        i4 = 138;
                        break;
                    case 29:
                        i4 = 170;
                        break;
                    case 30:
                        i4 = 183;
                        break;
                    case 31:
                    case 32:
                        i4 = 199;
                        break;
                    case 33:
                        i4 = HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS;
                        break;
                    case 34:
                        i4 = 230;
                        break;
                    case 35:
                        i4 = 244;
                        break;
                    default:
                        i4 = Scalar25519.TARGET_LENGTH;
                        break;
                }
            } else {
                i4 = -1;
            }
            this.f27380 = i4;
        } else if (i2 >= 0 && i2 < 39) {
            if (i2 >= 244) {
                i3 = 35;
            } else if (i2 >= 230) {
                i3 = 34;
            } else if (i2 >= 225) {
                i3 = 33;
            } else if (i2 >= 199) {
                i3 = 32;
            } else if (i2 >= 183) {
                i3 = 30;
            } else if (i2 >= 170) {
                i3 = 29;
            } else if (i2 >= 138) {
                i3 = 28;
            } else if (i2 >= 131) {
                i3 = 27;
            } else if (i2 >= 124) {
                i3 = 26;
            } else if (i2 >= 79) {
                i3 = 24;
            } else if (i2 >= 64) {
                i3 = 23;
            } else if (i2 >= 45) {
                i3 = 22;
            } else if (i2 >= 39) {
                i3 = 21;
            }
            this.f27379 = i3;
            this.f27380 = i2;
        } else {
            this.f27379 = i;
            this.f27380 = i2;
        }
        this.f27381 = new EnumMap(EnumC3167.class);
        this.f27383 = new HashMap();
        int i5 = this.f27380;
        i5 = i5 == -1 ? this.f27379 : i5;
        for (EnumC3167 enumC3167 : EnumC3167.values()) {
            if (this.f27380 != -1) {
                interfaceC9410 = enumC3167.f6095;
            } else {
                interfaceC9410 = enumC3167.f6094;
            }
            Short sh = (Short) interfaceC9410.mo13880(Integer.valueOf(i5));
            if (sh != null) {
                if (!enumC3167.f6090.f14398) {
                    this.f27382[sh.shortValue()] = enumC3167;
                }
                this.f27381.put(enumC3167, sh);
                this.f27383.put(enumC3167.f6089.toLowerCase(), enumC3167);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C9873 m23150(int i) {
        return new C9873(i, -1);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m23151(int i) {
        new C9873(-1, i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C9873 m23152(int i) {
        int iM48058 = C21274.m48058(i);
        if (iM48058 != -1) {
            return new C9873(iM48058, -1);
        }
        throw new RuntimeException(C20778.m46922(i, "Unsupported dex version "));
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC3167 m23156(String str) {
        return (EnumC3167) this.f27383.get(str.toLowerCase());
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC3167 m23155(int i) {
        if (i == 256) {
            return EnumC3167.f6043;
        }
        if (i == 512) {
            return EnumC3167.f5900;
        }
        if (i == 768) {
            return EnumC3167.f5951;
        }
        if (i < 0) {
            return null;
        }
        EnumC3167[] enumC3167Arr = this.f27382;
        if (i < enumC3167Arr.length) {
            return enumC3167Arr[i];
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Set m23154() {
        return this.f27381.keySet();
    }

    /* JADX INFO: renamed from: ֫ */
    public final Short m23153(EnumC3167 enumC3167) {
        return (Short) this.f27381.get(enumC3167);
    }
}
