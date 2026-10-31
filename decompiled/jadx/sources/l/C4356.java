package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.CharBuffer;
import java.util.HashSet;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ۙۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7RX */
/* JADX INFO: loaded from: classes3.dex */
public class C4356 extends C12158 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC10370 f14000;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C23168 f14001;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f14002;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f14003;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C6136 f14004;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f14005;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f14006;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f14007;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public StringBuilder f14008;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C3691 f14009;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C4824 f14010;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C22364 f14011;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4397 f14012;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC16280 f14013;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumC19920 f14014;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m13060(char c) {
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
    public C4356(C3691 c3691, CharBuffer charBuffer) {
        char[] charArray;
        int i = C11844.f35338;
        if (charBuffer.hasArray()) {
            charArray = (char[]) charBuffer.compact().flip().array();
        } else {
            charArray = charBuffer.toString().toCharArray();
        }
        this(c3691, charArray, charBuffer.limit());
    }

    public C4356(C3691 c3691, char[] cArr, int i) {
        super(c3691, cArr, i);
        this.f14007 = -1;
        this.f14006 = -1;
        this.f14009 = c3691;
        this.f14011 = c3691.f11643;
        this.f14004 = c3691.f11645;
        this.f14012 = c3691.f11644;
        this.f14013 = c3691.f11646;
        this.f14001 = c3691.f11647;
        this.f14010 = c3691.f11642;
        this.f14008 = new StringBuilder(256);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13065(int i, EnumC10637 enumC10637) {
        C23168 c23168 = this.f14001;
        boolean zM51351 = c23168.m51351(enumC10637);
        C22364 c22364 = this.f14011;
        if (!zM51351 || c23168.m51347()) {
            EnumC16280 enumC16280 = this.f14013;
            if (enumC10637.m26686(enumC16280)) {
                if (c23168.m51351(enumC10637)) {
                    c23168.m51344(new C7342(i), enumC10637);
                    return;
                }
                return;
            }
            c22364.m7279(EnumC20043.SOURCE_LEVEL, i, enumC10637.m26684(enumC16280.f50071));
        } else {
            c22364.m7279(EnumC20043.SOURCE_LEVEL, i, c23168.m51342(enumC10637));
        }
        this.f14006 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13066(int i, C12281 c12281) {
        this.f14011.m7269(i, c12281);
        this.f14014 = EnumC19920.f64415;
        this.f14006 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m13072(char c) {
        this.f14008.append(c);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m13071() {
        if (m29590()) {
            this.f14008.appendCodePoint(m29587());
        } else {
            m13072(m29580());
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m13067() {
        m13071();
        mo9118();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m13063() {
        if (m29591('\\')) {
            m13072(m29580());
            mo9118();
            this.f14002 = true;
            char cM29580 = m29580();
            if (cM29580 != '\n' && cM29580 != '\r') {
                if (cM29580 != '\"' && cM29580 != '\'' && cM29580 != '\\' && cM29580 != 'b' && cM29580 != 'f' && cM29580 != 'n') {
                    switch (cM29580) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                        case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                            char cM29581 = m29580();
                            m13067();
                            if (m29589('7')) {
                                m13067();
                                if (cM29581 > '3' || !m29589('7')) {
                                    return;
                                }
                                m13067();
                                return;
                            }
                            return;
                        default:
                            switch (cM29580) {
                                case 'r':
                                case 't':
                                    break;
                                case 's':
                                    m13065(m29595(), EnumC10637.f31998);
                                    m13067();
                                    break;
                                default:
                                    m13066(m29595(), C6241.f19215);
                                    break;
                            }
                            return;
                    }
                }
                m13067();
                return;
            }
            if (this.f14003) {
                m29582('\r');
                m29582('\n');
                m13072('\n');
                return;
            }
            m13066(m29595(), C6241.f19215);
            return;
        }
        m13067();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m13070(char c, char c2) {
        if (!m29583(c, c2)) {
            return false;
        }
        m13072(m29580());
        mo9118();
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m13058(int i) {
        int iM29595;
        boolean zM29591 = m29591('_');
        int i2 = this.f14007;
        int iM29596 = zM29591 ? m29595() : i2;
        while (true) {
            if (!m29591('_')) {
                m13071();
                iM29595 = i2;
            } else {
                iM29595 = m29595();
            }
            mo9118();
            if (m29581(i) < 0 && !m29591('_')) {
                break;
            }
        }
        if (iM29596 != i2) {
            m13066(iM29596, C6241.f19260);
        } else if (iM29595 != i2) {
            m13066(iM29595, C6241.f19260);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m13059(int i) {
        if (m13070('p', 'P')) {
            m13056();
            m13070('+', '-');
            m13056();
            if (m29581(10) >= 0) {
                m13058(10);
            } else {
                m13066(i, C6241.f19299);
            }
        } else {
            m13066(i, C6241.f19299);
        }
        if (m13070('f', 'F')) {
            this.f14014 = EnumC19920.f64374;
            this.f14005 = 16;
        } else {
            m13070('d', 'D');
            this.f14014 = EnumC19920.f64469;
            this.f14005 = 16;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m13061(int i) {
        this.f14005 = 10;
        m13056();
        if (m29581(10) >= 0) {
            m13058(10);
        }
        StringBuilder sb = this.f14008;
        int length = sb.length();
        if (m13070('e', 'E')) {
            m13056();
            m13070('+', '-');
            m13056();
            if (m29581(10) >= 0) {
                m13058(10);
            } else {
                m13066(i, C6241.f19299);
                sb.setLength(length);
            }
        }
        if (m13070('f', 'F')) {
            this.f14014 = EnumC19920.f64374;
        } else {
            m13070('d', 'D');
            this.f14014 = EnumC19920.f64469;
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m13056() {
        if (m29591('_')) {
            m13066(m29595(), C6241.f19260);
            while (m29582('_')) {
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m13057(int i, int i2) {
        this.f14005 = i2;
        int i3 = i2 == 8 ? 10 : i2;
        int iM29581 = m29581(Math.max(10, i3));
        boolean z = false;
        boolean z2 = true;
        boolean z3 = iM29581 >= 0;
        boolean z4 = iM29581 >= 0 && iM29581 < i3;
        if (z3) {
            m13058(i3);
        }
        if (i2 == 16 && m29591('.')) {
            this.f14005 = 16;
            C12171.m29642(m29591('.'));
            m13067();
            m13056();
            if (m29581(16) >= 0) {
                m13058(16);
            } else {
                z2 = z3;
            }
            if (!z2) {
                m13066(i, C6241.f19162);
                return;
            } else {
                m13059(i);
                return;
            }
        }
        if (z3 && i2 == 16 && m29583('p', 'P')) {
            m13059(i);
            return;
        }
        if (i3 != 10 || !m29591('.')) {
            if (i3 == 10) {
                if (m29591('e') || m29591('E') || m29591('f') || m29591('F') || m29591('d') || m29591('D')) {
                    m13061(i);
                    return;
                }
            }
            if (!z4) {
                if (i2 == 2) {
                    m13066(i, C6241.f19124);
                } else if (i2 == 16) {
                    m13066(i, C6241.f19162);
                }
            }
            if (i2 == 8) {
                this.f14008.setLength(0);
                m29588(i);
                m13058(8);
            }
            if (m29583('l', 'L')) {
                mo9118();
                z = true;
            }
            if (z) {
                this.f14014 = EnumC19920.f64442;
                return;
            } else {
                this.f14014 = EnumC19920.f64368;
                return;
            }
        }
        m13067();
        m13061(i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x001c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x001f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0022. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0025. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0013. Please report as an issue. */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m13062() {
        C4397 c4397;
        StringBuilder sb;
        C6136 c6136;
        boolean zIsJavaIdentifierPart;
        m13067();
        while (true) {
            char cM29580 = m29580();
            if (cM29580 != '$' && cM29580 != '_') {
                if (cM29580 != 127) {
                    switch (cM29580) {
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
                    c4397 = this.f14012;
                    sb = this.f14008;
                    c6136 = this.f14004;
                    switch (cM29580) {
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
                            if (m29593()) {
                                mo9118();
                            }
                            break;
                        default:
                            switch (cM29580) {
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
                                    switch (cM29580) {
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
                                        case HRSS1373Polynomial.K /* 86 */:
                                        case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                        case 'X':
                                        case 'Y':
                                        case 'Z':
                                            break;
                                        default:
                                            switch (cM29580) {
                                                case 'a':
                                                case 'b':
                                                case q.f /* 99 */:
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
                                                    if (m29594()) {
                                                        zIsJavaIdentifierPart = false;
                                                    } else if (Character.isIdentifierIgnorable(m29580())) {
                                                        mo9118();
                                                    } else if (m29590()) {
                                                        zIsJavaIdentifierPart = Character.isJavaIdentifierPart(m29587());
                                                    } else {
                                                        zIsJavaIdentifierPart = Character.isJavaIdentifierPart(m29580());
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
                mo9118();
            }
            m13067();
        }
        AbstractC10370 abstractC10370M30652 = c6136.f18880.m30652(sb.toString());
        this.f14000 = abstractC10370M30652;
        this.f14014 = c4397.m13125(abstractC10370M30652);
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
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C22036 m13068() {
        int iM29595;
        C12281 c12281;
        int iM29596;
        int iM29597;
        EnumC19920 enumC19920;
        EnumC21331 enumC21331;
        String string;
        EnumC20347 enumC20347;
        HashSet hashSetM44333;
        boolean zContains;
        C22364 c22364;
        boolean z;
        String string2;
        EnumC0162 enumC0162;
        InterfaceC5102 interfaceC5102Mo13064;
        StringBuilder sb = this.f14008;
        boolean z2 = false;
        sb.setLength(0);
        this.f14000 = null;
        this.f14005 = 0;
        this.f14003 = false;
        this.f14002 = false;
        C2609 c2609M8246 = null;
        while (true) {
            int iM29598 = m29595();
            char cM29580 = m29580();
            if (cM29580 != '\t') {
                if (cM29580 == '\n') {
                    mo9118();
                } else if (cM29580 != '\f') {
                    if (cM29580 == '\r') {
                        mo9118();
                        m29582('\n');
                    } else if (cM29580 != ' ') {
                        if (cM29580 != '\"') {
                            if (cM29580 != '$') {
                                if (cM29580 == ',') {
                                    mo9118();
                                    this.f14014 = EnumC19920.f64384;
                                } else if (cM29580 == ';') {
                                    mo9118();
                                    this.f14014 = EnumC19920.f64410;
                                } else if (cM29580 == ']') {
                                    mo9118();
                                    this.f14014 = EnumC19920.f64400;
                                } else if (cM29580 != '_') {
                                    if (cM29580 != '}') {
                                        switch (cM29580) {
                                            case '\'':
                                                mo9118();
                                                if (!m29582('\'')) {
                                                    if (m29583('\n', '\r')) {
                                                        m13066(iM29598, C6241.f19166);
                                                    }
                                                    m13063();
                                                    if (!m29582('\'')) {
                                                        m13066(iM29598, C6241.f19180);
                                                    } else {
                                                        this.f14014 = EnumC19920.f64411;
                                                    }
                                                } else {
                                                    m13066(iM29598, C6241.f19247);
                                                }
                                                break;
                                            case '(':
                                                mo9118();
                                                this.f14014 = EnumC19920.f64470;
                                                break;
                                            case ')':
                                                mo9118();
                                                this.f14014 = EnumC19920.f64413;
                                                break;
                                            default:
                                                boolean z3 = true;
                                                switch (cM29580) {
                                                    case '.':
                                                        if (!m29584("...")) {
                                                            mo9118();
                                                            int iM29599 = m29595();
                                                            if (m29582('.')) {
                                                                m13066(iM29599, C6241.f19145);
                                                            } else if (m29581(10) < 0) {
                                                                this.f14014 = EnumC19920.f64405;
                                                            } else {
                                                                m13072('.');
                                                                m13061(iM29598);
                                                            }
                                                        } else {
                                                            sb.append("...");
                                                            this.f14014 = EnumC19920.f64472;
                                                        }
                                                        break;
                                                    case '/':
                                                        mo9118();
                                                        if (m29582('/')) {
                                                            while (m29593() && !m29583('\r', '\n')) {
                                                                mo9118();
                                                            }
                                                            if (m29593()) {
                                                                interfaceC5102Mo13064 = mo13064(iM29598, m29595(), EnumC0162.LINE);
                                                                if (c2609M8246 != null) {
                                                                }
                                                            }
                                                        } else if (m29582('*')) {
                                                            if (m29582('*')) {
                                                                enumC0162 = EnumC0162.JAVADOC;
                                                                if (!m29591('/')) {
                                                                }
                                                                if (!z3) {
                                                                    while (m29593()) {
                                                                        if (m29582('*')) {
                                                                            mo9118();
                                                                        } else if (m29591('/')) {
                                                                        }
                                                                    }
                                                                }
                                                                if (m29582('/')) {
                                                                    m13066(iM29598, C6241.f19136);
                                                                } else {
                                                                    interfaceC5102Mo13064 = mo13064(iM29598, m29595(), enumC0162);
                                                                    c2609M8246 = c2609M8246 == null ? c2609M8246.m8246(interfaceC5102Mo13064) : C2609.of((Object) interfaceC5102Mo13064);
                                                                }
                                                            } else {
                                                                enumC0162 = EnumC0162.BLOCK;
                                                            }
                                                            z3 = false;
                                                            if (!z3) {
                                                                while (m29593()) {
                                                                    if (m29582('*')) {
                                                                        mo9118();
                                                                    } else if (m29591('/')) {
                                                                    }
                                                                }
                                                            }
                                                            if (m29582('/')) {
                                                                m13066(iM29598, C6241.f19136);
                                                            } else {
                                                                interfaceC5102Mo13064 = mo13064(iM29598, m29595(), enumC0162);
                                                                if (c2609M8246 == null) {
                                                                }
                                                            }
                                                            break;
                                                        } else if (!m29582(a.h)) {
                                                            this.f14014 = EnumC19920.f64379;
                                                        } else {
                                                            this.f14014 = EnumC19920.f64386;
                                                        }
                                                        break;
                                                    case '0':
                                                        mo9118();
                                                        if (m29583('x', 'X')) {
                                                            mo9118();
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (!z) {
                                                            if (m29583('b', 'B')) {
                                                                mo9118();
                                                                z2 = true;
                                                            }
                                                            if (!z2) {
                                                                m13072('0');
                                                                if (m29591('_')) {
                                                                    int iM295910 = m29595();
                                                                    while (m29582('_')) {
                                                                    }
                                                                    if (m29581(10) < 0) {
                                                                        m13066(iM295910, C6241.f19260);
                                                                    }
                                                                }
                                                                m13057(iM29598, 8);
                                                            } else {
                                                                m13056();
                                                                m13057(iM29598, 2);
                                                            }
                                                        } else {
                                                            m13056();
                                                            m13057(iM29598, 16);
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
                                                        m13057(iM29598, 10);
                                                        break;
                                                    default:
                                                        switch (cM29580) {
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
                                                            case HRSS1373Polynomial.K /* 86 */:
                                                            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                                            case 'X':
                                                            case 'Y':
                                                            case 'Z':
                                                                break;
                                                            case '[':
                                                                mo9118();
                                                                this.f14014 = EnumC19920.f64371;
                                                                break;
                                                            default:
                                                                switch (cM29580) {
                                                                    case 'a':
                                                                    case 'b':
                                                                    case q.f /* 99 */:
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
                                                                        mo9118();
                                                                        this.f14014 = EnumC19920.f64392;
                                                                        break;
                                                                    default:
                                                                        if (!m13060(m29580())) {
                                                                            if (m29594() ? false : m29590() ? Character.isJavaIdentifierStart(m29587()) : Character.isJavaIdentifierStart(m29580())) {
                                                                                m13062();
                                                                            } else if (m29581(10) >= 0) {
                                                                                m13057(iM29598, 10);
                                                                            } else if (!m29591((char) 26) && m29593()) {
                                                                                if (m29590()) {
                                                                                    int iM29587 = m29587();
                                                                                    string2 = String.format("\\u%04x\\u%04x", Integer.valueOf(Character.highSurrogate(iM29587)), Integer.valueOf(Character.lowSurrogate(iM29587)));
                                                                                } else {
                                                                                    char cM29581 = m29580();
                                                                                    if (' ' >= cM29581 || cM29581 >= 127) {
                                                                                        string2 = String.format("\\u%04x", Integer.valueOf(cM29581));
                                                                                    } else {
                                                                                        StringBuilder sb2 = new StringBuilder();
                                                                                        sb2.append(cM29581);
                                                                                        string2 = sb2.toString();
                                                                                    }
                                                                                }
                                                                                C12281 c12282 = C6241.f19132;
                                                                                m13066(iM29598, new C12281("compiler", "illegal.char", string2));
                                                                                mo9118();
                                                                            } else {
                                                                                this.f14014 = EnumC19920.f64381;
                                                                                iM29596 = m29595();
                                                                            }
                                                                        } else {
                                                                            do {
                                                                                m13071();
                                                                                EnumC19920 enumC19920M13124 = this.f14012.m13124(sb.toString());
                                                                                if (enumC19920M13124 == EnumC19920.f64412) {
                                                                                    sb.setLength(sb.length() - 1);
                                                                                } else {
                                                                                    this.f14014 = enumC19920M13124;
                                                                                    mo9118();
                                                                                }
                                                                            } while (m13060(m29580()));
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        iM29597 = m29595();
                                        enumC19920 = this.f14014;
                                        enumC21331 = enumC19920.f64483;
                                        if (enumC21331 == EnumC21331.DEFAULT) {
                                            return new C22036(enumC19920, iM29596, iM29597, c2609M8246);
                                        }
                                        if (enumC21331 == EnumC21331.NAMED) {
                                            return new C0868(enumC19920, iM29596, iM29597, this.f14000, c2609M8246);
                                        }
                                        string = sb.toString();
                                        if (this.f14003) {
                                            if (this.f14002) {
                                                string = C11337.m28003(string);
                                            }
                                            String str = string;
                                            EnumC19920 enumC19921 = this.f14014;
                                            if (enumC19921.f64483 == EnumC21331.STRING) {
                                            }
                                        }
                                        enumC20347 = EnumC20347.TEXT_BLOCKS;
                                        if (this.f14010.m14055(enumC20347)) {
                                            hashSetM44333 = C19214.m44333(string);
                                            zContains = hashSetM44333.contains(EnumC18508.INCONSISTENT);
                                            c22364 = this.f14011;
                                            if (zContains) {
                                                c22364.m7286(enumC20347, new C7342(iM29596), C14001.f42338);
                                            }
                                            if (hashSetM44333.contains(EnumC18508.TRAILING)) {
                                                c22364.m7286(enumC20347, new C7342(iM29596), C14001.f42353);
                                            }
                                        }
                                        try {
                                            string = C11337.m28002(string);
                                        } catch (Exception unused) {
                                        }
                                        if (this.f14002) {
                                            try {
                                                string = C11337.m28003(string);
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        String str2 = string;
                                        EnumC19920 enumC19922 = this.f14014;
                                        return enumC19922.f64483 == EnumC21331.STRING ? new C14979(enumC19922, iM29596, iM29597, str2, c2609M8246) : new C7924(enumC19922, iM29596, iM29597, str2, this.f14005, c2609M8246);
                                        throw th;
                                    }
                                    mo9118();
                                    this.f14014 = EnumC19920.f64481;
                                }
                            }
                            m13062();
                        } else {
                            this.f14014 = EnumC19920.f64372;
                            boolean zM29584 = m29584("\"\"\"");
                            this.f14003 = zM29584;
                            int i = this.f14007;
                            if (zM29584) {
                                m13065(iM29598, EnumC10637.f31998);
                                m29586();
                                if (m29583('\n', '\r')) {
                                    m29582('\r');
                                    m29582('\n');
                                    iM29595 = i;
                                    while (true) {
                                        if (!m29593()) {
                                            if (this.f14003) {
                                                c12281 = C6241.f19250;
                                            } else {
                                                c12281 = C6241.f19207;
                                            }
                                            m13066(iM29598, c12281);
                                            if (iM29595 != i) {
                                                m29588(iM29595);
                                            }
                                        } else if (!m29584("\"\"\"")) {
                                            if (m29583('\n', '\r')) {
                                                m29582('\r');
                                                m29582('\n');
                                                m13072('\n');
                                                if (iM29595 == i) {
                                                    iM29595 = m29595();
                                                }
                                            } else {
                                                m13063();
                                            }
                                        }
                                    }
                                } else {
                                    m13066(m29595(), C6241.f19248);
                                }
                            } else {
                                mo9118();
                                while (true) {
                                    if (m29593()) {
                                        if (!m29582('\"')) {
                                            if (!m29583('\n', '\r')) {
                                                m13063();
                                            }
                                        }
                                    }
                                    iM29595 = i;
                                    if (this.f14003) {
                                        c12281 = C6241.f19250;
                                    } else {
                                        c12281 = C6241.f19207;
                                    }
                                    m13066(iM29598, c12281);
                                    if (iM29595 != i) {
                                        m29588(iM29595);
                                    }
                                }
                            }
                        }
                        iM29596 = iM29598;
                        iM29597 = m29595();
                        enumC19920 = this.f14014;
                        enumC21331 = enumC19920.f64483;
                        if (enumC21331 == EnumC21331.DEFAULT) {
                            return new C22036(enumC19920, iM29596, iM29597, c2609M8246);
                        }
                        if (enumC21331 == EnumC21331.NAMED) {
                            return new C0868(enumC19920, iM29596, iM29597, this.f14000, c2609M8246);
                        }
                        string = sb.toString();
                        if (this.f14003) {
                            if (this.f14002) {
                                string = C11337.m28003(string);
                            }
                            String str3 = string;
                            EnumC19920 enumC19923 = this.f14014;
                            if (enumC19923.f64483 == EnumC21331.STRING) {
                            }
                        }
                        enumC20347 = EnumC20347.TEXT_BLOCKS;
                        if (this.f14010.m14055(enumC20347)) {
                            hashSetM44333 = C19214.m44333(string);
                            zContains = hashSetM44333.contains(EnumC18508.INCONSISTENT);
                            c22364 = this.f14011;
                            if (zContains) {
                                c22364.m7286(enumC20347, new C7342(iM29596), C14001.f42338);
                            }
                            if (hashSetM44333.contains(EnumC18508.TRAILING)) {
                                c22364.m7286(enumC20347, new C7342(iM29596), C14001.f42353);
                            }
                        }
                        string = C11337.m28002(string);
                        if (this.f14002) {
                            string = C11337.m28003(string);
                        }
                        String str4 = string;
                        EnumC19920 enumC19924 = this.f14014;
                        if (enumC19924.f64483 == EnumC21331.STRING) {
                        }
                        throw th;
                    }
                }
            }
            m29586();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC5102 mo13064(int i, int i2, EnumC0162 enumC0162) {
        return new C19879(enumC0162, this.f14009, m29585(i, i2), i);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public InterfaceC13896 mo13069() {
        return C11265.m27877(m29592(), m29596(), false);
    }
}
