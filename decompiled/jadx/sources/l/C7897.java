package l;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Set;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.۠ۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F5Y4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7897 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f24463;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f24464;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumMap f24465;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC0841[] f24466 = new EnumC0841[256];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f24467;

    public C7897(int i, int i2) {
        InterfaceC7409 interfaceC7409;
        int i3 = 19;
        int i4 = 39;
        if (i >= 21) {
            this.f24463 = i;
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
            this.f24464 = i4;
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
            this.f24463 = i3;
            this.f24464 = i2;
        } else {
            this.f24463 = i;
            this.f24464 = i2;
        }
        this.f24465 = new EnumMap(EnumC0841.class);
        this.f24467 = new HashMap();
        int i5 = this.f24464;
        i5 = i5 == -1 ? this.f24463 : i5;
        for (EnumC0841 enumC0841 : EnumC0841.values()) {
            if (this.f24464 != -1) {
                interfaceC7409 = enumC0841.f3321;
            } else {
                interfaceC7409 = enumC0841.f3320;
            }
            Short sh = (Short) interfaceC7409.mo11960(Integer.valueOf(i5));
            if (sh != null) {
                if (!enumC0841.f3316.f11594) {
                    this.f24466[sh.shortValue()] = enumC0841;
                }
                this.f24465.put(enumC0841, sh);
                this.f24467.put(enumC0841.f3315.toLowerCase(), enumC0841);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C7897 m21184(int i) {
        return new C7897(i, -1);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m21185(int i) {
        new C7897(-1, i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C7897 m21186(int i) {
        int iM45747 = C19893.m45747(i);
        if (iM45747 != -1) {
            return new C7897(iM45747, -1);
        }
        throw new RuntimeException(C19370.m44628(i, "Unsupported dex version "));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC0841 m21190(String str) {
        return (EnumC0841) this.f24467.get(str.toLowerCase());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC0841 m21189(int i) {
        if (i == 256) {
            return EnumC0841.f3269;
        }
        if (i == 512) {
            return EnumC0841.f3126;
        }
        if (i == 768) {
            return EnumC0841.f3177;
        }
        if (i < 0) {
            return null;
        }
        EnumC0841[] enumC0841Arr = this.f24466;
        if (i < enumC0841Arr.length) {
            return enumC0841Arr[i];
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set m21188() {
        return this.f24465.keySet();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Short m21187(EnumC0841 enumC0841) {
        return (Short) this.f24465.get(enumC0841);
    }
}
