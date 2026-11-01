package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.color.MaterialColors;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.C0655am;
import java.io.Closeable;
import java.io.IOException;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.۟᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZAX9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9731 {
    /* JADX INFO: renamed from: ۧ */
    public static boolean m22758(C11155 c11155) {
        while (c11155.m25721()) {
            switch (c11155.m25726()) {
                case '[':
                    return false;
                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                    c11155.m25724();
                    char cM25726 = c11155.m25726();
                    switch (cM25726) {
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                        case '.':
                        case '/':
                            c11155.m25724();
                            break;
                        default:
                            switch (cM25726) {
                                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    c11155.m25724();
                                    break;
                                default:
                                    switch (cM25726) {
                                        case '[':
                                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                        case ']':
                                        case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                        case '_':
                                        case '`':
                                            c11155.m25724();
                                            break;
                                        default:
                                            switch (cM25726) {
                                                case '{':
                                                case '|':
                                                case C0254q.f1218h /* 125 */:
                                                case '~':
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            c11155.m25724();
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
                case ']':
                    return true;
                default:
                    c11155.m25724();
                    break;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0097 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m22756(C11155 c11155) {
        char cM25726;
        if (c11155.m25721()) {
            if (c11155.m25727('<')) {
                while (c11155.m25721() && (cM25726 = c11155.m25726()) != '\n' && cM25726 != '<') {
                    if (cM25726 == '>') {
                        c11155.m25724();
                        return true;
                    }
                    if (cM25726 == '\\') {
                        c11155.m25724();
                        char cM25727 = c11155.m25726();
                        switch (cM25727) {
                            case '!':
                            case '\"':
                            case '#':
                            case '$':
                            case '%':
                            case '&':
                            case '\'':
                            case '(':
                            case ')':
                            case '*':
                            case '+':
                            case ',':
                            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                            case '.':
                            case '/':
                                c11155.m25724();
                                break;
                            default:
                                switch (cM25727) {
                                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                        c11155.m25724();
                                        break;
                                    default:
                                        switch (cM25727) {
                                            case '[':
                                            case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                            case ']':
                                            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                            case '_':
                                            case '`':
                                                c11155.m25724();
                                                break;
                                            default:
                                                switch (cM25727) {
                                                    case '{':
                                                    case '|':
                                                    case C0254q.f1218h /* 125 */:
                                                    case '~':
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                c11155.m25724();
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        c11155.m25724();
                    }
                }
            } else {
                boolean z = true;
                int i = 0;
                while (c11155.m25721()) {
                    char cM25728 = c11155.m25726();
                    if (cM25728 != ' ') {
                        if (cM25728 == '\\') {
                            c11155.m25724();
                            char cM25729 = c11155.m25726();
                            switch (cM25729) {
                                default:
                                    switch (cM25729) {
                                        default:
                                            switch (cM25729) {
                                                case '[':
                                                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                case ']':
                                                case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                                case '_':
                                                case '`':
                                                    break;
                                                default:
                                                    switch (cM25729) {
                                                        case '{':
                                                        case '|':
                                                        case C0254q.f1218h /* 125 */:
                                                        case '~':
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    break;
                                            }
                                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                        case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                        case '<':
                                        case '=':
                                        case '>':
                                        case '?':
                                        case '@':
                                            c11155.m25724();
                                            break;
                                    }
                                case '!':
                                case '\"':
                                case '#':
                                case '$':
                                case '%':
                                case '&':
                                case '\'':
                                case '(':
                                case ')':
                                case '*':
                                case '+':
                                case ',':
                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                case '.':
                                case '/':
                                    c11155.m25724();
                                    break;
                            }
                        } else if (cM25728 == '(') {
                            i++;
                            if (i <= 32) {
                                c11155.m25724();
                            }
                        } else if (cM25728 != ')') {
                            if (!Character.isISOControl(cM25728)) {
                                c11155.m25724();
                            }
                        } else {
                            if (i == 0) {
                                return true;
                            }
                            i--;
                            c11155.m25724();
                        }
                        z = false;
                    }
                    return !z;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m22755(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C12710.m29224(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m22753(InterfaceC11851 interfaceC11851) {
        StringBuilder sb = new StringBuilder("{");
        int iMo5886 = interfaceC11851.mo5886();
        if (iMo5886 == 1) {
            sb.append(C0655am.f2277aE);
            sb.append(interfaceC11851.mo5885());
        } else if (iMo5886 == 2) {
            sb.append(C0655am.f2277aE);
            sb.append(interfaceC11851.mo5885());
            sb.append(", v");
            sb.append(interfaceC11851.mo5883());
        } else if (iMo5886 == 3) {
            sb.append(C0655am.f2277aE);
            sb.append(interfaceC11851.mo5885());
            sb.append(", v");
            sb.append(interfaceC11851.mo5883());
            sb.append(", v");
            sb.append(interfaceC11851.mo5882());
        } else if (iMo5886 == 4) {
            sb.append(C0655am.f2277aE);
            sb.append(interfaceC11851.mo5885());
            sb.append(", v");
            sb.append(interfaceC11851.mo5883());
            sb.append(", v");
            sb.append(interfaceC11851.mo5882());
            sb.append(", v");
            sb.append(interfaceC11851.mo5884());
        } else if (iMo5886 == 5) {
            sb.append(C0655am.f2277aE);
            sb.append(interfaceC11851.mo5885());
            sb.append(", v");
            sb.append(interfaceC11851.mo5883());
            sb.append(", v");
            sb.append(interfaceC11851.mo5882());
            sb.append(", v");
            sb.append(interfaceC11851.mo5884());
            sb.append(", v");
            sb.append(interfaceC11851.mo5881());
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m22759(C11155 c11155) {
        if (!c11155.m25721()) {
            return false;
        }
        char cM25726 = c11155.m25726();
        char c = '\"';
        if (cM25726 != '\"') {
            c = '\'';
            if (cM25726 != '\'') {
                if (cM25726 != '(') {
                    return false;
                }
                c = ')';
            }
        }
        c11155.m25724();
        if (!m22757(c11155, c) || !c11155.m25721()) {
            return false;
        }
        c11155.m25724();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m22754(InterfaceC18140 interfaceC18140) {
        int iMo5886 = interfaceC18140.mo5886();
        if (iMo5886 == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{v");
        int iMo11756 = interfaceC18140.mo11756();
        sb.append(iMo11756);
        sb.append(" .. v");
        sb.append((iMo11756 + iMo5886) - 1);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m22757(C11155 c11155, char c) {
        while (c11155.m25721()) {
            char cM25726 = c11155.m25726();
            if (cM25726 == '\\') {
                c11155.m25724();
                char cM25727 = c11155.m25726();
                switch (cM25727) {
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                    case ',':
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case '.':
                    case '/':
                        c11155.m25724();
                        break;
                    default:
                        switch (cM25727) {
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                            case '<':
                            case '=':
                            case '>':
                            case '?':
                            case '@':
                                c11155.m25724();
                                break;
                            default:
                                switch (cM25727) {
                                    case '[':
                                    case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                    case ']':
                                    case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                    case '_':
                                    case '`':
                                        c11155.m25724();
                                        break;
                                    default:
                                        switch (cM25727) {
                                            case '{':
                                            case '|':
                                            case C0254q.f1218h /* 125 */:
                                            case '~':
                                                break;
                                            default:
                                                continue;
                                        }
                                        c11155.m25724();
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                if (cM25726 == c) {
                    return true;
                }
                if (c == ')' && cM25726 == '(') {
                    return false;
                }
                c11155.m25724();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m22752(int i) {
        char[] cArr = new char[2];
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[1 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }
}
