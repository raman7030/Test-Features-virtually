package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashMap;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ۗ۬ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76QN */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5461 extends AbstractC11527 {

    /* JADX INFO: renamed from: ۖ */
    public HashMap f13029;

    /* JADX INFO: renamed from: ۘ */
    public C24888 f13030;

    /* JADX INFO: renamed from: ܺ */
    public C19524 f13031;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f13032;

    public AbstractC5461(C4150 c4150) {
        super(c4150);
        this.f13029 = new HashMap();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11985(boolean z) {
        this.f13032 = z;
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public final boolean m11999() {
        return this.f13032;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11984(C19524 c19524) {
        this.f13031 = c19524;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final boolean m12005() {
        C19524 c19524 = this.f13031;
        return c19524 == null || c19524.m44358(this.f32157.mo8413(1).mo4434());
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final boolean m12000() {
        C19524 c19524 = this.f13031;
        return c19524 == null || c19524.m44361(this.f32157.mo8413(1).mo4434());
    }

    /* JADX INFO: renamed from: ۗ */
    public final boolean m11987() {
        boolean zM11983;
        int iMo8405 = this.f32157.mo8405(1);
        if (iMo8405 == 40) {
            zM11983 = m12000();
        } else {
            if (iMo8405 != 44 || !m12005()) {
                return true;
            }
            zM11983 = m11983(this.f32157.mo8405(2));
        }
        return !zM11983;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ܿ */
    private boolean m11983(int i) {
        if (i != 5 && i != 6 && i != 7 && i != 100 && i != 101 && i != 125 && i != 126 && i != 133 && i != 134) {
            switch (i) {
                case 11:
                case 16:
                case 23:
                case 25:
                case 28:
                case 30:
                case 32:
                case 35:
                case 37:
                case 89:
                case 91:
                    break;
                case 115:
                    return this.f13032;
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                case 138:
                                case 139:
                                case 140:
                                    break;
                                default:
                                    return i >= 40 && i <= 83 && i != 43;
                            }
                        case 84:
                        case 85:
                        case HRSS1373Polynomial.f81792K /* 86 */:
                        case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                            return true;
                    }
                    break;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۛ */
    public final boolean m11989() {
        return m11982(this.f32157.mo8413(1), this.f32157.mo8413(2));
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    public final boolean m12002() {
        int i = this.f32157.mo8405(1) == 44 ? 2 : 1;
        return this.f32157.mo8405(i) == 83 && m11982(this.f32157.mo8413(1), this.f32157.mo8413(i + 1));
    }

    /* JADX INFO: renamed from: ᩶ */
    public final boolean m12003() {
        return m11982(this.f32157.mo8413(1), this.f32157.mo8413(2));
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public final boolean m11993() {
        return m11982(this.f32157.mo8413(1), this.f32157.mo8413(2));
    }

    /* JADX INFO: renamed from: ᩺ */
    public final boolean m12006() {
        return this.f13032 && this.f32157.mo8405(1) != 91;
    }

    /* JADX INFO: renamed from: ܶ */
    public final boolean m11998() {
        int i = 3;
        if (this.f32157.mo8405(2) == 89) {
            int i2 = 1;
            while (i2 != 0) {
                int i3 = i + 1;
                int iMo8405 = this.f32157.mo8405(i);
                if (iMo8405 == -1) {
                    return false;
                }
                if (iMo8405 == 89) {
                    i2++;
                } else if (iMo8405 == 90) {
                    i2--;
                }
                i = i3;
            }
        }
        return this.f32157.mo8405(i) == 87;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b7 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: ֫֫ */
    public final boolean m11986() {
        boolean z = false;
        if (this.f13032 && this.f32157.mo8405(1) == 115) {
            int iIndex = this.f32157.index();
            Boolean bool = (Boolean) this.f13029.get(Integer.valueOf(iIndex));
            if (bool != null) {
                return bool.booleanValue();
            }
            this.f13029.put(Integer.valueOf(iIndex), Boolean.FALSE);
            try {
                C6802 c6802 = new C6802(this.f32157);
                if (this.f13030 == null) {
                    this.f13030 = new C24888(C6802.f17660);
                }
                c6802.m45726(new C10807(c6802, this.f13030));
                c6802.f13032 = true;
                c6802.f13031 = this.f13031;
                c6802.f13029 = this.f13029;
                c6802.f13030 = this.f13030;
                c6802.m26582();
                c6802.m45727();
                c6802.m26578(new C12277());
                c6802.m15560();
                int iMo8405 = this.f32157.mo8405(1);
                if (iMo8405 == 87 || iMo8405 == 7) {
                    z = true;
                } else if (iMo8405 != 115 && iMo8405 != 116 && iMo8405 != 125 && iMo8405 != 126) {
                    if (m11994() && iMo8405 != 26 && iMo8405 != 27 && iMo8405 != 64 && iMo8405 != 65 && iMo8405 != 103) {
                        switch (iMo8405) {
                            default:
                                switch (iMo8405) {
                                    default:
                                        if (!m11983(iMo8405)) {
                                        }
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                        z = true;
                                        break;
                                }
                            case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                            case 108:
                            case 109:
                            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                            case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                            case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                            case 114:
                                z = true;
                                break;
                        }
                    } else {
                        z = true;
                    }
                }
            } catch (C11707 unused) {
            } catch (Throwable th) {
                this.f32157.mo8403(iIndex);
                throw th;
            }
            this.f32157.mo8403(iIndex);
            this.f13029.put(Integer.valueOf(iIndex), Boolean.valueOf(z));
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x005e A[RETURN] */
    /* JADX INFO: renamed from: ۟ */
    public final int m11990() {
        switch (this.f32157.mo8405(1)) {
            case 5:
            case 6:
            case 7:
            case 16:
            case 28:
            case 30:
            case 32:
            case 35:
            case 37:
            case 84:
            case 85:
            case HRSS1373Polynomial.f81792K /* 86 */:
            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
            case 89:
            case 100:
            case 101:
            case C0254q.f1218h /* 125 */:
            case 126:
            case 133:
            case 134:
            case 138:
            case 139:
                return 36;
            case 8:
            case 13:
            case 29:
            case 33:
                return 26;
            case 11:
                return this.f13032 ? -1 : 16;
            case 12:
                if (this.f13032) {
                    return -1;
                }
                return 3;
            case 17:
            case 22:
            case 38:
                return 22;
            case 19:
                return 33;
            case 23:
                return this.f13032 ? -1 : 13;
            case 24:
                return 21;
            case 31:
                return 23;
            case 34:
                return 25;
            case 36:
                return 3;
            case 41:
                if (this.f32157.mo8405(2) == 140 && this.f32157.mo8405(3) == 135 && m11982(this.f32157.mo8413(1), this.f32157.mo8413(2))) {
                    return 3;
                }
                return -1;
            case 91:
                return 2;
            case 140:
                return this.f32157.mo8405(2) == 95 ? 70 : 36;
            default:
                return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0053 A[FALL_THROUGH, RETURN] */
    /* JADX INFO: renamed from: ܰ */
    public final boolean m11997() {
        int iMo8405 = this.f32157.mo8405(1);
        if (iMo8405 != 125 && iMo8405 != 126 && iMo8405 != 127) {
            return false;
        }
        int iMo8406 = this.f32157.mo8405(2);
        if (iMo8406 != 5 && iMo8406 != 6 && iMo8406 != 32 && iMo8406 != 138 && iMo8406 != 140) {
            switch (iMo8406) {
                case 84:
                case 85:
                case HRSS1373Polynomial.f81792K /* 86 */:
                    break;
                default:
                    return false;
            }
        }
        int iMo8407 = this.f32157.mo8405(3);
        if (iMo8407 != 88 && iMo8407 != 90 && iMo8407 != 103 && iMo8407 != 136) {
            switch (iMo8407) {
                default:
                    switch (iMo8407) {
                        default:
                            switch (iMo8407) {
                                case C0254q.f1218h /* 125 */:
                                case 126:
                                case 127:
                                case 128:
                                case 129:
                                case 130:
                                case 131:
                                case 132:
                                    break;
                                default:
                                    return false;
                            }
                        case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                        case 108:
                        case 109:
                        case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                        case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                        case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                        case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                        case 114:
                            return true;
                    }
                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                case 93:
                case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                case 95:
                    return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۤ */
    public final int m11992() {
        int iMo8405 = this.f32157.mo8405(1);
        if (iMo8405 != 7 && iMo8405 != 87 && iMo8405 != 89) {
            if (iMo8405 == 115) {
                return this.f13032 ? 0 : 2;
            }
            if (iMo8405 != 133) {
                if (iMo8405 != 97 && iMo8405 != 98) {
                    return 2;
                }
            } else if (!this.f13032 || !m11994()) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m12001(int i) {
        int i2 = 1;
        while (i2 < i) {
            int iMo4433 = this.f32157.mo8413(i2).mo4433() + 1;
            i2++;
            if (iMo4433 != this.f32157.mo8413(i2).mo4434()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final boolean m12004() {
        return this.f32157.mo8405(1) == 45 && m11982(this.f32157.mo8413(1), this.f32157.mo8413(2));
    }

    /* JADX INFO: renamed from: ۬ */
    public final int m11996() {
        int iMo8405;
        if (!m11994() || (iMo8405 = this.f32157.mo8405(1)) == 93 || iMo8405 == 92) {
            return 2;
        }
        return m11983(iMo8405) ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۨ */
    public final boolean m11994() {
        return m11982(this.f32157.mo8413(-1), this.f32157.mo8413(1));
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m11982(InterfaceC2808 interfaceC2808, InterfaceC2808 interfaceC2809) {
        if (interfaceC2808 != null) {
            for (int iMo4432 = interfaceC2808.mo4432() + 1; iMo4432 < interfaceC2809.mo4432(); iMo4432++) {
                String text = this.f32157.m8415(iMo4432).getText();
                for (int i = 0; i < text.length(); i++) {
                    char cCharAt = text.charAt(i);
                    if (cCharAt == '\n' || cCharAt == '\r' || cCharAt == 8232 || cCharAt == 8233) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۫ */
    public final boolean m11995() {
        return this.f32157.mo8405(1) == -1 || this.f32157.mo8405(1) == 92 || !m11994();
    }

    /* JADX INFO: renamed from: ۙ */
    public final boolean m11988() {
        return ((this.f32157.mo8405(1) == 45 && this.f32157.mo8405(2) == 23 && m12004()) || this.f32157.mo8405(1) == 91 || this.f32157.mo8405(1) == 23 || this.f32157.mo8405(1) == 11) ? false : true;
    }

    @Override // p067l.AbstractC11527
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC2808 mo11991() {
        C20195.m45697();
        return super.mo11991();
    }
}
