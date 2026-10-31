package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashMap;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ۗ۬ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76QN */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3254 extends AbstractC9637 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashMap f10220;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C23695 f10221;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C18051 f10222;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f10223;

    public AbstractC3254(C1875 c1875) {
        super(c1875);
        this.f10220 = new HashMap();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9952(boolean z) {
        this.f10223 = z;
    }

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9966() {
        return this.f10223;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9951(C18051 c18051) {
        this.f10222 = c18051;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m9972() {
        C18051 c18051 = this.f10222;
        return c18051 == null || c18051.m42107(this.f29208.mo6211(1).mo2054());
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9967() {
        C18051 c18051 = this.f10222;
        return c18051 == null || c18051.m42110(this.f29208.mo6211(1).mo2054());
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m9954() {
        boolean zM9950;
        int iMo6203 = this.f29208.mo6203(1);
        if (iMo6203 == 40) {
            zM9950 = m9967();
        } else {
            if (iMo6203 != 44 || !m9972()) {
                return true;
            }
            zM9950 = m9950(this.f29208.mo6203(2));
        }
        return !zM9950;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m9950(int i) {
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
                    return this.f10223;
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
                        case HRSS1373Polynomial.K /* 86 */:
                        case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                            return true;
                    }
                    break;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m9956() {
        return m9949(this.f29208.mo6211(1), this.f29208.mo6211(2));
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9969() {
        int i = this.f29208.mo6203(1) == 44 ? 2 : 1;
        return this.f29208.mo6203(i) == 83 && m9949(this.f29208.mo6211(1), this.f29208.mo6211(i + 1));
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m9970() {
        return m9949(this.f29208.mo6211(1), this.f29208.mo6211(2));
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9960() {
        return m9949(this.f29208.mo6211(1), this.f29208.mo6211(2));
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m9973() {
        return this.f10223 && this.f29208.mo6203(1) != 91;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m9965() {
        int i = 3;
        if (this.f29208.mo6203(2) == 89) {
            int i2 = 1;
            while (i2 != 0) {
                int i3 = i + 1;
                int iMo6203 = this.f29208.mo6203(i);
                if (iMo6203 == -1) {
                    return false;
                }
                if (iMo6203 == 89) {
                    i2++;
                } else if (iMo6203 == 90) {
                    i2--;
                }
                i = i3;
            }
        }
        return this.f29208.mo6203(i) == 87;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b7 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final boolean m9953() {
        boolean z = false;
        if (this.f10223 && this.f29208.mo6203(1) == 115) {
            int iIndex = this.f29208.index();
            Boolean bool = (Boolean) this.f10220.get(Integer.valueOf(iIndex));
            if (bool != null) {
                return bool.booleanValue();
            }
            this.f10220.put(Integer.valueOf(iIndex), Boolean.FALSE);
            try {
                C4665 c4665 = new C4665(this.f29208);
                if (this.f10221 == null) {
                    this.f10221 = new C23695(C4665.f14830);
                }
                c4665.m43457(new C8879(c4665, this.f10221));
                c4665.f10223 = true;
                c4665.f10222 = this.f10222;
                c4665.f10220 = this.f10220;
                c4665.f10221 = this.f10221;
                c4665.m24568();
                c4665.m43458();
                c4665.m24564(new C10426());
                c4665.m13685();
                int iMo6203 = this.f29208.mo6203(1);
                if (iMo6203 == 87 || iMo6203 == 7) {
                    z = true;
                } else if (iMo6203 != 115 && iMo6203 != 116 && iMo6203 != 125 && iMo6203 != 126) {
                    if (m9961() && iMo6203 != 26 && iMo6203 != 27 && iMo6203 != 64 && iMo6203 != 65 && iMo6203 != 103) {
                        switch (iMo6203) {
                            default:
                                switch (iMo6203) {
                                    default:
                                        if (!m9950(iMo6203)) {
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
            } catch (C9826 unused) {
            } catch (Throwable th) {
                this.f29208.mo6201(iIndex);
                throw th;
            }
            this.f29208.mo6201(iIndex);
            this.f10220.put(Integer.valueOf(iIndex), Boolean.valueOf(z));
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x005e A[RETURN] */
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int m9957() {
        switch (this.f29208.mo6203(1)) {
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
            case HRSS1373Polynomial.K /* 86 */:
            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
            case 89:
            case 100:
            case 101:
            case q.h /* 125 */:
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
                return this.f10223 ? -1 : 16;
            case 12:
                if (this.f10223) {
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
                return this.f10223 ? -1 : 13;
            case 24:
                return 21;
            case 31:
                return 23;
            case 34:
                return 25;
            case 36:
                return 3;
            case 41:
                if (this.f29208.mo6203(2) == 140 && this.f29208.mo6203(3) == 135 && m9949(this.f29208.mo6211(1), this.f29208.mo6211(2))) {
                    return 3;
                }
                return -1;
            case 91:
                return 2;
            case 140:
                return this.f29208.mo6203(2) == 95 ? 70 : 36;
            default:
                return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0053 A[FALL_THROUGH, RETURN] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m9964() {
        int iMo6203 = this.f29208.mo6203(1);
        if (iMo6203 != 125 && iMo6203 != 126 && iMo6203 != 127) {
            return false;
        }
        int iMo6204 = this.f29208.mo6203(2);
        if (iMo6204 != 5 && iMo6204 != 6 && iMo6204 != 32 && iMo6204 != 138 && iMo6204 != 140) {
            switch (iMo6204) {
                case 84:
                case 85:
                case HRSS1373Polynomial.K /* 86 */:
                    break;
                default:
                    return false;
            }
        }
        int iMo6205 = this.f29208.mo6203(3);
        if (iMo6205 != 88 && iMo6205 != 90 && iMo6205 != 103 && iMo6205 != 136) {
            switch (iMo6205) {
                default:
                    switch (iMo6205) {
                        default:
                            switch (iMo6205) {
                                case q.h /* 125 */:
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m9959() {
        int iMo6203 = this.f29208.mo6203(1);
        if (iMo6203 != 7 && iMo6203 != 87 && iMo6203 != 89) {
            if (iMo6203 == 115) {
                return this.f10223 ? 0 : 2;
            }
            if (iMo6203 != 133) {
                if (iMo6203 != 97 && iMo6203 != 98) {
                    return 2;
                }
            } else if (!this.f10223 || !m9961()) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m9968(int i) {
        int i2 = 1;
        while (i2 < i) {
            int iMo2053 = this.f29208.mo6211(i2).mo2053() + 1;
            i2++;
            if (iMo2053 != this.f29208.mo6211(i2).mo2054()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m9971() {
        return this.f29208.mo6203(1) == 45 && m9949(this.f29208.mo6211(1), this.f29208.mo6211(2));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m9963() {
        int iMo6203;
        if (!m9961() || (iMo6203 = this.f29208.mo6203(1)) == 93 || iMo6203 == 92) {
            return 2;
        }
        return m9950(iMo6203) ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m9961() {
        return m9949(this.f29208.mo6211(-1), this.f29208.mo6211(1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m9949(InterfaceC0463 interfaceC0463, InterfaceC0463 interfaceC0464) {
        if (interfaceC0463 != null) {
            for (int iMo2052 = interfaceC0463.mo2052() + 1; iMo2052 < interfaceC0464.mo2052(); iMo2052++) {
                String text = this.f29208.m6213(iMo2052).getText();
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

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m9962() {
        return this.f29208.mo6203(1) == -1 || this.f29208.mo6203(1) == 92 || !m9961();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9955() {
        return ((this.f29208.mo6203(1) == 45 && this.f29208.mo6203(2) == 23 && m9971()) || this.f29208.mo6203(1) == 91 || this.f29208.mo6203(1) == 23 || this.f29208.mo6203(1) == 11) ? false : true;
    }

    @Override // l.AbstractC9637
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0463 mo9958() {
        C18757.m43430();
        return super.mo9958();
    }
}
