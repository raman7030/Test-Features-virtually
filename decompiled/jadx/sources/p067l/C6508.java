package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.CharBuffer;
import java.util.HashSet;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ۙۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7RX */
/* JADX INFO: loaded from: classes3.dex */
public class C6508 extends C13923 {

    /* JADX INFO: renamed from: ֡ */
    public AbstractC12224 f16816;

    /* JADX INFO: renamed from: ֨ */
    public C24387 f16817;

    /* JADX INFO: renamed from: ۖ */
    public boolean f16818;

    /* JADX INFO: renamed from: ۘ */
    public boolean f16819;

    /* JADX INFO: renamed from: ۚ */
    public final C8200 f16820;

    /* JADX INFO: renamed from: ۠ */
    public int f16821;

    /* JADX INFO: renamed from: ۡ */
    public int f16822;

    /* JADX INFO: renamed from: ۢ */
    public int f16823;

    /* JADX INFO: renamed from: ܶ */
    public StringBuilder f16824;

    /* JADX INFO: renamed from: ܺ */
    public C5876 f16825;

    /* JADX INFO: renamed from: ᩴ */
    public C6953 f16826;

    /* JADX INFO: renamed from: ᩵ */
    public final C23623 f16827;

    /* JADX INFO: renamed from: ᩶ */
    public final C6547 f16828;

    /* JADX INFO: renamed from: ᩸ */
    public EnumC17840 f16829;

    /* JADX INFO: renamed from: ᩹ */
    public EnumC21300 f16830;

    /* JADX INFO: renamed from: ܿ */
    public static boolean m14924(char c) {
        if (c == '!' || c == '-' || c == ':' || c == '^' || c == '|' || c == '~' || c == '%' || c == '&' || c == '*' || c == '+') {
            return true;
        }
        switch (c) {
            case '<':
            case '=':
            case '>':
            case '?':
            case '@':
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6508(C5876 c5876, CharBuffer charBuffer) {
        char[] charArray;
        int i = C13625.f38343;
        if (charBuffer.hasArray()) {
            charArray = (char[]) charBuffer.compact().flip().array();
        } else {
            charArray = charBuffer.toString().toCharArray();
        }
        this(c5876, charArray, charBuffer.limit());
    }

    public C6508(C5876 c5876, char[] cArr, int i) {
        super(c5876, cArr, i);
        this.f16823 = -1;
        this.f16822 = -1;
        this.f16825 = c5876;
        this.f16827 = c5876.f14446;
        this.f16820 = c5876.f14448;
        this.f16828 = c5876.f14447;
        this.f16829 = c5876.f14449;
        this.f16817 = c5876.f14450;
        this.f16826 = c5876.f14445;
        this.f16824 = new StringBuilder(256);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14929(int i, EnumC12477 enumC12477) {
        C24387 c24387 = this.f16817;
        boolean zM53747 = c24387.m53747(enumC12477);
        C23623 c23623 = this.f16827;
        if (!zM53747 || c24387.m53743()) {
            EnumC17840 enumC17840 = this.f16829;
            if (enumC12477.m28726(enumC17840)) {
                if (c24387.m53747(enumC12477)) {
                    c24387.m53740(new C9346(i), enumC12477);
                    return;
                }
                return;
            }
            c23623.m9358(EnumC21417.SOURCE_LEVEL, i, enumC12477.m28724(enumC17840.f53238));
        } else {
            c23623.m9358(EnumC21417.SOURCE_LEVEL, i, c24387.m53738(enumC12477));
        }
        this.f16822 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14930(int i, C14040 c14040) {
        this.f16827.m9348(i, c14040);
        this.f16830 = EnumC21300.f67053;
        this.f16822 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m14936(char c) {
        this.f16824.append(c);
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m14935() {
        if (m31655()) {
            this.f16824.appendCodePoint(m31652());
        } else {
            m14936(m31645());
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m14931() {
        m14935();
        mo11169();
    }

    /* JADX INFO: renamed from: ᩵ */
    private void m14927() {
        if (m31656('\\')) {
            m14936(m31645());
            mo11169();
            this.f16818 = true;
            char cM31645 = m31645();
            if (cM31645 != '\n' && cM31645 != '\r') {
                if (cM31645 != '\"' && cM31645 != '\'' && cM31645 != '\\' && cM31645 != 'b' && cM31645 != 'f' && cM31645 != 'n') {
                    switch (cM31645) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                            char cM31646 = m31645();
                            m14931();
                            if (m31654('7')) {
                                m14931();
                                if (cM31646 > '3' || !m31654('7')) {
                                    return;
                                }
                                m14931();
                                return;
                            }
                            return;
                        default:
                            switch (cM31645) {
                                case 'r':
                                case 't':
                                    break;
                                case 's':
                                    m14929(m31660(), EnumC12477.f34969);
                                    m14931();
                                    break;
                                default:
                                    m14930(m31660(), C8300.f22080);
                                    break;
                            }
                            return;
                    }
                }
                m14931();
                return;
            }
            if (this.f16819) {
                m31647('\r');
                m31647('\n');
                m14936('\n');
                return;
            }
            m14930(m31660(), C8300.f22080);
            return;
        }
        m14931();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m14934(char c, char c2) {
        if (!m31648(c, c2)) {
            return false;
        }
        m14936(m31645());
        mo11169();
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m14922(int i) {
        int iM31660;
        boolean zM31656 = m31656('_');
        int i2 = this.f16823;
        int iM31661 = zM31656 ? m31660() : i2;
        while (true) {
            if (!m31656('_')) {
                m14935();
                iM31660 = i2;
            } else {
                iM31660 = m31660();
            }
            mo11169();
            if (m31646(i) < 0 && !m31656('_')) {
                break;
            }
        }
        if (iM31661 != i2) {
            m14930(iM31661, C8300.f22125);
        } else if (iM31660 != i2) {
            m14930(iM31660, C8300.f22125);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m14923(int i) {
        if (m14934('p', 'P')) {
            m14920();
            m14934('+', '-');
            m14920();
            if (m31646(10) >= 0) {
                m14922(10);
            } else {
                m14930(i, C8300.f22164);
            }
        } else {
            m14930(i, C8300.f22164);
        }
        if (m14934('f', 'F')) {
            this.f16830 = EnumC21300.f67012;
            this.f16821 = 16;
        } else {
            m14934('d', 'D');
            this.f16830 = EnumC21300.f67107;
            this.f16821 = 16;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m14925(int i) {
        this.f16821 = 10;
        m14920();
        if (m31646(10) >= 0) {
            m14922(10);
        }
        StringBuilder sb = this.f16824;
        int length = sb.length();
        if (m14934('e', 'E')) {
            m14920();
            m14934('+', '-');
            m14920();
            if (m31646(10) >= 0) {
                m14922(10);
            } else {
                m14930(i, C8300.f22164);
                sb.setLength(length);
            }
        }
        if (m14934('f', 'F')) {
            this.f16830 = EnumC21300.f67012;
        } else {
            m14934('d', 'D');
            this.f16830 = EnumC21300.f67107;
        }
    }

    /* JADX INFO: renamed from: ֡ */
    private void m14920() {
        if (m31656('_')) {
            m14930(m31660(), C8300.f22125);
            while (m31647('_')) {
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m14921(int i, int i2) {
        this.f16821 = i2;
        int i3 = i2 == 8 ? 10 : i2;
        int iM31646 = m31646(Math.max(10, i3));
        boolean z = false;
        boolean z2 = true;
        boolean z3 = iM31646 >= 0;
        boolean z4 = iM31646 >= 0 && iM31646 < i3;
        if (z3) {
            m14922(i3);
        }
        if (i2 == 16 && m31656('.')) {
            this.f16821 = 16;
            C1446.m31704(m31656('.'));
            m14931();
            m14920();
            if (m31646(16) >= 0) {
                m14922(16);
            } else {
                z2 = z3;
            }
            if (!z2) {
                m14930(i, C8300.f22027);
                return;
            } else {
                m14923(i);
                return;
            }
        }
        if (z3 && i2 == 16 && m31648('p', 'P')) {
            m14923(i);
            return;
        }
        if (i3 != 10 || !m31656('.')) {
            if (i3 == 10) {
                if (m31656('e') || m31656('E') || m31656('f') || m31656('F') || m31656('d') || m31656('D')) {
                    m14925(i);
                    return;
                }
            }
            if (!z4) {
                if (i2 == 2) {
                    m14930(i, C8300.f21989);
                } else if (i2 == 16) {
                    m14930(i, C8300.f22027);
                }
            }
            if (i2 == 8) {
                this.f16824.setLength(0);
                m31653(i);
                m14922(8);
            }
            if (m31648('l', 'L')) {
                mo11169();
                z = true;
            }
            if (z) {
                this.f16830 = EnumC21300.f67080;
                return;
            } else {
                this.f16830 = EnumC21300.f67006;
                return;
            }
        }
        m14931();
        m14925(i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x001c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x001f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0022. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0025. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0013. Please report as an issue. */
    /* JADX INFO: renamed from: ᩴ */
    private void m14926() {
        C6547 c6547;
        StringBuilder sb;
        C8200 c8200;
        boolean zIsJavaIdentifierPart;
        m14931();
        while (true) {
            char cM31645 = m31645();
            if (cM31645 != '$' && cM31645 != '_') {
                if (cM31645 != 127) {
                    switch (cM31645) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                            break;
                    }
                    c6547 = this.f16828;
                    sb = this.f16824;
                    c8200 = this.f16820;
                    switch (cM31645) {
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 27:
                            break;
                        case 26:
                            if (m31658()) {
                                mo11169();
                            }
                            break;
                        default:
                            switch (cM31645) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                case '8':
                                case '9':
                                    break;
                                default:
                                    switch (cM31645) {
                                        case 'A':
                                        case 'B':
                                        case 'C':
                                        case 'D':
                                        case 'E':
                                        case 'F':
                                        case 'G':
                                        case 'H':
                                        case 'I':
                                        case 'J':
                                        case 'K':
                                        case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                        case 'M':
                                        case 'N':
                                        case 'O':
                                        case 'P':
                                        case 'Q':
                                        case 'R':
                                        case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                        case 'T':
                                        case 'U':
                                        case HRSS1373Polynomial.f81792K /* 86 */:
                                        case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                        case 'X':
                                        case 'Y':
                                        case 'Z':
                                            break;
                                        default:
                                            switch (cM31645) {
                                                case 'a':
                                                case 'b':
                                                case C0254q.f1216f /* 99 */:
                                                case 'd':
                                                case 'e':
                                                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                                case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                                case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                                case 'l':
                                                case 'm':
                                                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                                case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                                case 'r':
                                                case 's':
                                                case 't':
                                                case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                                case 'v':
                                                case 'w':
                                                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                                case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                                case 'z':
                                                    break;
                                                default:
                                                    if (m31659()) {
                                                        zIsJavaIdentifierPart = false;
                                                    } else if (Character.isIdentifierIgnorable(m31645())) {
                                                        mo11169();
                                                    } else if (m31655()) {
                                                        zIsJavaIdentifierPart = Character.isJavaIdentifierPart(m31652());
                                                    } else {
                                                        zIsJavaIdentifierPart = Character.isJavaIdentifierPart(m31645());
                                                    }
                                                    if (!zIsJavaIdentifierPart) {
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                }
                mo11169();
            }
            m14931();
        }
        AbstractC12224 abstractC12224M32717 = c8200.f21738.m32717(sb.toString());
        this.f16816 = abstractC12224M32717;
        this.f16830 = c6547.m14989(abstractC12224M32717);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x017e  */
    /* JADX WARN: Code duplicated, block: B:192:0x036a  */
    /* JADX WARN: Code duplicated, block: B:193:0x036d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0374  */
    /* JADX WARN: Code duplicated, block: B:200:0x0384  */
    /* JADX WARN: Code duplicated, block: B:202:0x038a  */
    /* JADX WARN: Code duplicated, block: B:204:0x038e  */
    /* JADX WARN: Code duplicated, block: B:206:0x0398  */
    /* JADX WARN: Code duplicated, block: B:208:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:210:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:212:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:215:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:219:0x03da A[PHI: r0
      0x03da: PHI (r0v2 java.lang.String) = (r0v1 java.lang.String), (r0v1 java.lang.String), (r0v11 java.lang.String) binds: [B:207:0x039e, B:218:0x03d9, B:216:0x03d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:227:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:229:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:238:0x03de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0161 A[LOOP:2: B:93:0x0161->B:282:0x0161, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:95:0x0167  */
    /* JADX INFO: renamed from: ۘ */
    public final C23311 m14932() {
        int iM31660;
        C14040 c14040;
        int iM31661;
        int iM31662;
        EnumC21300 enumC21300;
        EnumC22641 enumC22641;
        String string;
        EnumC21706 enumC21706;
        HashSet hashSetM46627;
        boolean zContains;
        C23623 c23623;
        boolean z;
        String string2;
        EnumC2522 enumC2522;
        InterfaceC7217 interfaceC7217Mo14928;
        StringBuilder sb = this.f16824;
        boolean z2 = false;
        sb.setLength(0);
        this.f16816 = null;
        this.f16821 = 0;
        this.f16819 = false;
        this.f16818 = false;
        C4848 c4848M10290 = null;
        while (true) {
            int iM31663 = m31660();
            char cM31645 = m31645();
            if (cM31645 != '\t') {
                if (cM31645 == '\n') {
                    mo11169();
                } else if (cM31645 != '\f') {
                    if (cM31645 == '\r') {
                        mo11169();
                        m31647('\n');
                    } else if (cM31645 != ' ') {
                        if (cM31645 != '\"') {
                            if (cM31645 != '$') {
                                if (cM31645 == ',') {
                                    mo11169();
                                    this.f16830 = EnumC21300.f67022;
                                } else if (cM31645 == ';') {
                                    mo11169();
                                    this.f16830 = EnumC21300.f67048;
                                } else if (cM31645 == ']') {
                                    mo11169();
                                    this.f16830 = EnumC21300.f67038;
                                } else if (cM31645 != '_') {
                                    if (cM31645 != '}') {
                                        switch (cM31645) {
                                            case '\'':
                                                mo11169();
                                                if (!m31647('\'')) {
                                                    if (m31648('\n', '\r')) {
                                                        m14930(iM31663, C8300.f22031);
                                                    }
                                                    m14927();
                                                    if (!m31647('\'')) {
                                                        m14930(iM31663, C8300.f22045);
                                                    } else {
                                                        this.f16830 = EnumC21300.f67049;
                                                    }
                                                } else {
                                                    m14930(iM31663, C8300.f22112);
                                                }
                                                break;
                                            case '(':
                                                mo11169();
                                                this.f16830 = EnumC21300.f67108;
                                                break;
                                            case ')':
                                                mo11169();
                                                this.f16830 = EnumC21300.f67051;
                                                break;
                                            default:
                                                boolean z3 = true;
                                                switch (cM31645) {
                                                    case '.':
                                                        if (!m31649("...")) {
                                                            mo11169();
                                                            int iM31664 = m31660();
                                                            if (m31647('.')) {
                                                                m14930(iM31664, C8300.f22010);
                                                            } else if (m31646(10) < 0) {
                                                                this.f16830 = EnumC21300.f67043;
                                                            } else {
                                                                m14936('.');
                                                                m14925(iM31663);
                                                            }
                                                        } else {
                                                            sb.append("...");
                                                            this.f16830 = EnumC21300.f67110;
                                                        }
                                                        break;
                                                    case '/':
                                                        mo11169();
                                                        if (m31647('/')) {
                                                            while (m31658() && !m31648('\r', '\n')) {
                                                                mo11169();
                                                            }
                                                            if (m31658()) {
                                                                interfaceC7217Mo14928 = mo14928(iM31663, m31660(), EnumC2522.LINE);
                                                                if (c4848M10290 != null) {
                                                                }
                                                            }
                                                        } else if (m31647('*')) {
                                                            if (m31647('*')) {
                                                                enumC2522 = EnumC2522.JAVADOC;
                                                                if (!m31656('/')) {
                                                                }
                                                                if (!z3) {
                                                                    while (m31658()) {
                                                                        if (m31647('*')) {
                                                                            mo11169();
                                                                        } else if (m31656('/')) {
                                                                        }
                                                                    }
                                                                }
                                                                if (m31647('/')) {
                                                                    m14930(iM31663, C8300.f22001);
                                                                } else {
                                                                    interfaceC7217Mo14928 = mo14928(iM31663, m31660(), enumC2522);
                                                                    c4848M10290 = c4848M10290 == null ? c4848M10290.m10290(interfaceC7217Mo14928) : C4848.m10276of((Object) interfaceC7217Mo14928);
                                                                }
                                                            } else {
                                                                enumC2522 = EnumC2522.BLOCK;
                                                            }
                                                            z3 = false;
                                                            if (!z3) {
                                                                while (m31658()) {
                                                                    if (m31647('*')) {
                                                                        mo11169();
                                                                    } else if (m31656('/')) {
                                                                    }
                                                                }
                                                            }
                                                            if (m31647('/')) {
                                                                m14930(iM31663, C8300.f22001);
                                                            } else {
                                                                interfaceC7217Mo14928 = mo14928(iM31663, m31660(), enumC2522);
                                                                if (c4848M10290 == null) {
                                                                }
                                                            }
                                                            break;
                                                        } else if (!m31647(C0184a.f880h)) {
                                                            this.f16830 = EnumC21300.f67017;
                                                        } else {
                                                            this.f16830 = EnumC21300.f67024;
                                                        }
                                                        break;
                                                    case '0':
                                                        mo11169();
                                                        if (m31648('x', 'X')) {
                                                            mo11169();
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (!z) {
                                                            if (m31648('b', 'B')) {
                                                                mo11169();
                                                                z2 = true;
                                                            }
                                                            if (!z2) {
                                                                m14936('0');
                                                                if (m31656('_')) {
                                                                    int iM31665 = m31660();
                                                                    while (m31647('_')) {
                                                                    }
                                                                    if (m31646(10) < 0) {
                                                                        m14930(iM31665, C8300.f22125);
                                                                    }
                                                                }
                                                                m14921(iM31663, 8);
                                                            } else {
                                                                m14920();
                                                                m14921(iM31663, 2);
                                                            }
                                                        } else {
                                                            m14920();
                                                            m14921(iM31663, 16);
                                                        }
                                                        break;
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                                    case '8':
                                                    case '9':
                                                        m14921(iM31663, 10);
                                                        break;
                                                    default:
                                                        switch (cM31645) {
                                                            case 'A':
                                                            case 'B':
                                                            case 'C':
                                                            case 'D':
                                                            case 'E':
                                                            case 'F':
                                                            case 'G':
                                                            case 'H':
                                                            case 'I':
                                                            case 'J':
                                                            case 'K':
                                                            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                                            case 'M':
                                                            case 'N':
                                                            case 'O':
                                                            case 'P':
                                                            case 'Q':
                                                            case 'R':
                                                            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                                            case 'T':
                                                            case 'U':
                                                            case HRSS1373Polynomial.f81792K /* 86 */:
                                                            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                                            case 'X':
                                                            case 'Y':
                                                            case 'Z':
                                                                break;
                                                            case '[':
                                                                mo11169();
                                                                this.f16830 = EnumC21300.f67009;
                                                                break;
                                                            default:
                                                                switch (cM31645) {
                                                                    case 'a':
                                                                    case 'b':
                                                                    case C0254q.f1216f /* 99 */:
                                                                    case 'd':
                                                                    case 'e':
                                                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                                                    case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                                                    case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                                                    case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                                                    case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                                                    case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                                                    case 'l':
                                                                    case 'm':
                                                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                                                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                                                    case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                                                    case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                                                    case 'r':
                                                                    case 's':
                                                                    case 't':
                                                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                                                    case 'v':
                                                                    case 'w':
                                                                    case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                                                    case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                                                    case 'z':
                                                                        break;
                                                                    case '{':
                                                                        mo11169();
                                                                        this.f16830 = EnumC21300.f67030;
                                                                        break;
                                                                    default:
                                                                        if (!m14924(m31645())) {
                                                                            if (m31659() ? false : m31655() ? Character.isJavaIdentifierStart(m31652()) : Character.isJavaIdentifierStart(m31645())) {
                                                                                m14926();
                                                                            } else if (m31646(10) >= 0) {
                                                                                m14921(iM31663, 10);
                                                                            } else if (!m31656((char) 26) && m31658()) {
                                                                                if (m31655()) {
                                                                                    int iM31652 = m31652();
                                                                                    string2 = String.format("\\u%04x\\u%04x", Integer.valueOf(Character.highSurrogate(iM31652)), Integer.valueOf(Character.lowSurrogate(iM31652)));
                                                                                } else {
                                                                                    char cM31646 = m31645();
                                                                                    if (' ' >= cM31646 || cM31646 >= 127) {
                                                                                        string2 = String.format("\\u%04x", Integer.valueOf(cM31646));
                                                                                    } else {
                                                                                        StringBuilder sb2 = new StringBuilder();
                                                                                        sb2.append(cM31646);
                                                                                        string2 = sb2.toString();
                                                                                    }
                                                                                }
                                                                                C14040 c14041 = C8300.f21997;
                                                                                m14930(iM31663, new C14040("compiler", "illegal.char", string2));
                                                                                mo11169();
                                                                            } else {
                                                                                this.f16830 = EnumC21300.f67019;
                                                                                iM31661 = m31660();
                                                                            }
                                                                        } else {
                                                                            do {
                                                                                m14935();
                                                                                EnumC21300 enumC21300M14988 = this.f16828.m14988(sb.toString());
                                                                                if (enumC21300M14988 == EnumC21300.f67050) {
                                                                                    sb.setLength(sb.length() - 1);
                                                                                } else {
                                                                                    this.f16830 = enumC21300M14988;
                                                                                    mo11169();
                                                                                }
                                                                            } while (m14924(m31645()));
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        iM31662 = m31660();
                                        enumC21300 = this.f16830;
                                        enumC22641 = enumC21300.f67121;
                                        if (enumC22641 == EnumC22641.DEFAULT) {
                                            return new C23311(enumC21300, iM31661, iM31662, c4848M10290);
                                        }
                                        if (enumC22641 == EnumC22641.NAMED) {
                                            return new C3193(enumC21300, iM31661, iM31662, this.f16816, c4848M10290);
                                        }
                                        string = sb.toString();
                                        if (this.f16819) {
                                            if (this.f16818) {
                                                string = C13144.m30064(string);
                                            }
                                            String str = string;
                                            EnumC21300 enumC21301 = this.f16830;
                                            if (enumC21301.f67121 == EnumC22641.STRING) {
                                            }
                                        }
                                        enumC21706 = EnumC21706.TEXT_BLOCKS;
                                        if (this.f16826.m15935(enumC21706)) {
                                            hashSetM46627 = C20629.m46627(string);
                                            zContains = hashSetM46627.contains(EnumC19958.INCONSISTENT);
                                            c23623 = this.f16827;
                                            if (zContains) {
                                                c23623.m9365(enumC21706, new C9346(iM31661), C15675.f45421);
                                            }
                                            if (hashSetM46627.contains(EnumC19958.TRAILING)) {
                                                c23623.m9365(enumC21706, new C9346(iM31661), C15675.f45436);
                                            }
                                        }
                                        try {
                                            string = C13144.m30063(string);
                                        } catch (Exception unused) {
                                        }
                                        if (this.f16818) {
                                            try {
                                                string = C13144.m30064(string);
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        String str2 = string;
                                        EnumC21300 enumC21302 = this.f16830;
                                        return enumC21302.f67121 == EnumC22641.STRING ? new C16604(enumC21302, iM31661, iM31662, str2, c4848M10290) : new C9899(enumC21302, iM31661, iM31662, str2, this.f16821, c4848M10290);
                                        throw th;
                                    }
                                    mo11169();
                                    this.f16830 = EnumC21300.f67119;
                                }
                            }
                            m14926();
                        } else {
                            this.f16830 = EnumC21300.f67010;
                            boolean zM31649 = m31649("\"\"\"");
                            this.f16819 = zM31649;
                            int i = this.f16823;
                            if (zM31649) {
                                m14929(iM31663, EnumC12477.f34969);
                                m31651();
                                if (m31648('\n', '\r')) {
                                    m31647('\r');
                                    m31647('\n');
                                    iM31660 = i;
                                    while (true) {
                                        if (!m31658()) {
                                            if (this.f16819) {
                                                c14040 = C8300.f22115;
                                            } else {
                                                c14040 = C8300.f22072;
                                            }
                                            m14930(iM31663, c14040);
                                            if (iM31660 != i) {
                                                m31653(iM31660);
                                            }
                                        } else if (!m31649("\"\"\"")) {
                                            if (m31648('\n', '\r')) {
                                                m31647('\r');
                                                m31647('\n');
                                                m14936('\n');
                                                if (iM31660 == i) {
                                                    iM31660 = m31660();
                                                }
                                            } else {
                                                m14927();
                                            }
                                        }
                                    }
                                } else {
                                    m14930(m31660(), C8300.f22113);
                                }
                            } else {
                                mo11169();
                                while (true) {
                                    if (m31658()) {
                                        if (!m31647('\"')) {
                                            if (!m31648('\n', '\r')) {
                                                m14927();
                                            }
                                        }
                                    }
                                    iM31660 = i;
                                    if (this.f16819) {
                                        c14040 = C8300.f22115;
                                    } else {
                                        c14040 = C8300.f22072;
                                    }
                                    m14930(iM31663, c14040);
                                    if (iM31660 != i) {
                                        m31653(iM31660);
                                    }
                                }
                            }
                        }
                        iM31661 = iM31663;
                        iM31662 = m31660();
                        enumC21300 = this.f16830;
                        enumC22641 = enumC21300.f67121;
                        if (enumC22641 == EnumC22641.DEFAULT) {
                            return new C23311(enumC21300, iM31661, iM31662, c4848M10290);
                        }
                        if (enumC22641 == EnumC22641.NAMED) {
                            return new C3193(enumC21300, iM31661, iM31662, this.f16816, c4848M10290);
                        }
                        string = sb.toString();
                        if (this.f16819) {
                            if (this.f16818) {
                                string = C13144.m30064(string);
                            }
                            String str3 = string;
                            EnumC21300 enumC21303 = this.f16830;
                            if (enumC21303.f67121 == EnumC22641.STRING) {
                            }
                        }
                        enumC21706 = EnumC21706.TEXT_BLOCKS;
                        if (this.f16826.m15935(enumC21706)) {
                            hashSetM46627 = C20629.m46627(string);
                            zContains = hashSetM46627.contains(EnumC19958.INCONSISTENT);
                            c23623 = this.f16827;
                            if (zContains) {
                                c23623.m9365(enumC21706, new C9346(iM31661), C15675.f45421);
                            }
                            if (hashSetM46627.contains(EnumC19958.TRAILING)) {
                                c23623.m9365(enumC21706, new C9346(iM31661), C15675.f45436);
                            }
                        }
                        string = C13144.m30063(string);
                        if (this.f16818) {
                            string = C13144.m30064(string);
                        }
                        String str4 = string;
                        EnumC21300 enumC21304 = this.f16830;
                        if (enumC21304.f67121 == EnumC22641.STRING) {
                        }
                        throw th;
                    }
                }
            }
            m31651();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC7217 mo14928(int i, int i2, EnumC2522 enumC2522) {
        return new C21261(enumC2522, this.f16825, m31650(i, i2), i);
    }

    /* JADX INFO: renamed from: ۡ */
    public InterfaceC15575 mo14933() {
        return C13075.m29938(m31657(), m31661(), false);
    }
}
