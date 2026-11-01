package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0698cb;
import com.umeng.commonsdk.UMConfigure;
import net.engio.mbassy.listener.MessageHandler;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.util.encoders.UTF8;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۗ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X441 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5698 {
    RELEASE_0,
    RELEASE_1,
    RELEASE_2,
    RELEASE_3,
    RELEASE_4,
    RELEASE_5,
    RELEASE_6,
    RELEASE_7,
    RELEASE_8,
    RELEASE_9,
    RELEASE_10,
    RELEASE_11,
    RELEASE_12,
    RELEASE_13,
    RELEASE_14,
    RELEASE_15,
    RELEASE_16,
    RELEASE_17;


    /* JADX INFO: renamed from: ᩻֫ */
    public static final EnumC5698 f13927 = m12685();

    /* JADX INFO: renamed from: ܿ */
    public static EnumC5698 m12689() {
        return RELEASE_17;
    }

    /* JADX INFO: renamed from: ۧ */
    public static EnumC5698 m12685() {
        return RELEASE_10;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static EnumC5698 m12690() {
        return f13927;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m12682(CharSequence charSequence) {
        String string = charSequence.toString();
        if (string.length() == 0) {
            return false;
        }
        int iCodePointAt = string.codePointAt(0);
        if (!Character.isJavaIdentifierStart(iCodePointAt)) {
            return false;
        }
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < string.length()) {
            int iCodePointAt2 = string.codePointAt(iCharCount);
            if (!Character.isJavaIdentifierPart(iCodePointAt2)) {
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m12688(CharSequence charSequence) {
        return m12687(charSequence, m12689());
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m12687(CharSequence charSequence, EnumC5698 enumC5698) {
        for (String str : charSequence.toString().split("\\.", -1)) {
            if (!m12682(str) || m12683(str, enumC5698)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m12686(CharSequence charSequence) {
        return m12683(charSequence, m12689());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m12683(CharSequence charSequence, EnumC5698 enumC5698) {
        String string = charSequence.toString();
        string.getClass();
        byte b = -1;
        switch (string.hashCode()) {
            case -1888027236:
                if (string.equals("volatile")) {
                    b = 0;
                }
                break;
            case -1466596076:
                if (string.equals(MessageHandler.Properties.IsSynchronized)) {
                    b = 1;
                }
                break;
            case -1408208058:
                if (string.equals("assert")) {
                    b = 2;
                }
                break;
            case -1325958191:
                if (string.equals(ClassTransform.DOUBLE)) {
                    b = 3;
                }
                break;
            case -1305664359:
                if (string.equals("extends")) {
                    b = 4;
                }
                break;
            case -1184795739:
                if (string.equals("import")) {
                    b = 5;
                }
                break;
            case -1052618729:
                if (string.equals(UMConfigure.WRAPER_TYPE_NATIVE)) {
                    b = 6;
                }
                break;
            case -977423767:
                if (string.equals("public")) {
                    b = 7;
                }
                break;
            case -934396624:
                if (string.equals("return")) {
                    b = 8;
                }
                break;
            case -915384400:
                if (string.equals("implements")) {
                    b = 9;
                }
                break;
            case -892481938:
                if (string.equals("static")) {
                    b = 10;
                }
                break;
            case -889473228:
                if (string.equals("switch")) {
                    b = 11;
                }
                break;
            case -874432947:
                if (string.equals("throws")) {
                    b = 12;
                }
                break;
            case -853259901:
                if (string.equals("finally")) {
                    b = C0698cb.f2569k;
                }
                break;
            case -807062458:
                if (string.equals("package")) {
                    b = C0698cb.f2570l;
                }
                break;
            case -608539730:
                if (string.equals("protected")) {
                    b = 15;
                }
                break;
            case -567202649:
                if (string.equals("continue")) {
                    b = 16;
                }
                break;
            case -314497661:
                if (string.equals("private")) {
                    b = 17;
                }
                break;
            case 95:
                if (string.equals("_")) {
                    b = 18;
                }
                break;
            case 3211:
                if (string.equals("do")) {
                    b = 19;
                }
                break;
            case 3357:
                if (string.equals("if")) {
                    b = 20;
                }
                break;
            case 101577:
                if (string.equals("for")) {
                    b = 21;
                }
                break;
            case 104431:
                if (string.equals(ClassTransform.INTEGER)) {
                    b = 22;
                }
                break;
            case 108960:
                if (string.equals("new")) {
                    b = 23;
                }
                break;
            case 115131:
                if (string.equals("try")) {
                    b = 24;
                }
                break;
            case 3039496:
                if (string.equals(ClassTransform.BYTE)) {
                    b = 25;
                }
                break;
            case 3046192:
                if (string.equals("case")) {
                    b = 26;
                }
                break;
            case 3052374:
                if (string.equals(ClassTransform.CHARACTER)) {
                    b = 27;
                }
                break;
            case 3116345:
                if (string.equals("else")) {
                    b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                }
                break;
            case 3118337:
                if (string.equals("enum")) {
                    b = 29;
                }
                break;
            case 3178851:
                if (string.equals("goto")) {
                    b = 30;
                }
                break;
            case 3327612:
                if (string.equals(ClassTransform.LONG)) {
                    b = C0684bo.f2505j;
                }
                break;
            case 3392903:
                if (string.equals("null")) {
                    b = UTF8.S_CS3;
                }
                break;
            case 3559070:
                if (string.equals("this")) {
                    b = PublicSuffixDatabase.EXCEPTION_MARKER;
                }
                break;
            case 3569038:
                if (string.equals("true")) {
                    b = 34;
                }
                break;
            case 3625364:
                if (string.equals(ClassTransform.VOID)) {
                    b = 35;
                }
                break;
            case 64711720:
                if (string.equals(ClassTransform.BOOLEAN)) {
                    b = 36;
                }
                break;
            case 94001407:
                if (string.equals("break")) {
                    b = 37;
                }
                break;
            case 94432955:
                if (string.equals("catch")) {
                    b = 38;
                }
                break;
            case 94742904:
                if (string.equals(Name.LABEL)) {
                    b = 39;
                }
                break;
            case 94844771:
                if (string.equals("const")) {
                    b = 40;
                }
                break;
            case 97196323:
                if (string.equals("false")) {
                    b = 41;
                }
                break;
            case 97436022:
                if (string.equals("final")) {
                    b = 42;
                }
                break;
            case 97526364:
                if (string.equals(ClassTransform.FLOAT)) {
                    b = 43;
                }
                break;
            case 109413500:
                if (string.equals(ClassTransform.SHORT)) {
                    b = 44;
                }
                break;
            case 109801339:
                if (string.equals("super")) {
                    b = 45;
                }
                break;
            case 110339814:
                if (string.equals("throw")) {
                    b = 46;
                }
                break;
            case 113101617:
                if (string.equals("while")) {
                    b = 47;
                }
                break;
            case 502623545:
                if (string.equals("interface")) {
                    b = UTF8.S_P3A;
                }
                break;
            case 902025516:
                if (string.equals("instanceof")) {
                    b = 49;
                }
                break;
            case 1052746378:
                if (string.equals("transient")) {
                    b = 50;
                }
                break;
            case 1544803905:
                if (string.equals("default")) {
                    b = 51;
                }
                break;
            case 1732898850:
                if (string.equals("abstract")) {
                    b = 52;
                }
                break;
            case 1794694483:
                if (string.equals("strictfp")) {
                    b = 53;
                }
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                return true;
            case 2:
                return enumC5698.compareTo(RELEASE_4) >= 0;
            case 18:
                return enumC5698.compareTo(RELEASE_9) >= 0;
            case 29:
                return enumC5698.compareTo(RELEASE_5) >= 0;
            case 53:
                return enumC5698.compareTo(RELEASE_2) >= 0;
            default:
                return false;
        }
    }
}
