package p067l;

import com.umeng.commonsdk.debug.UMLog;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.᩷֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: IC6V */
/* JADX INFO: loaded from: classes4.dex */
public final class C21869 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f68789 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public static final String[] f68794 = {"", " ", EnumC2483.f3919, "   ", ASN1Dump.TAB, UMLog.INDENT, "      ", "       ", EnumC2483.f3936, "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* JADX INFO: renamed from: ܽ */
    public static final Pattern f68792 = Pattern.compile("^/((\\.{1,2}/)+)");

    /* JADX INFO: renamed from: ܳ */
    public static final Pattern f68791 = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");

    /* JADX INFO: renamed from: ۧ */
    public static final Pattern f68790 = Pattern.compile("[\\x00-\\x1f]*");

    /* JADX INFO: renamed from: ܿ */
    public static final ThreadLocal f68793 = new C8457();

    /* JADX INFO: renamed from: ֫ */
    public static boolean m49326(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m49322(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String string = it.next().toString();
        if (!it.hasNext()) {
            return string;
        }
        StringBuilder sbM49323 = m49323();
        C18515.m42065(sbM49323);
        Object obj = string;
        while (true) {
            sbM49323.append(obj);
            if (it.hasNext()) {
                Object next = it.next();
                sbM49323.append(str);
                obj = next;
            } else {
                return m49321(sbM49323);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m49319(int i, int i2) {
        if (!(i >= 0)) {
            throw new C15832("width must be >= 0");
        }
        C18515.m42068(i2 >= -1);
        if (i2 != -1) {
            i = Math.min(i, i2);
        }
        if (i < 21) {
            return f68794[i];
        }
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = ' ';
        }
        return String.valueOf(cArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m49327(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!m49326(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49325(String str, StringBuilder sb, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt == 32 || iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13 || iCodePointAt == 160) {
                if ((!z || z2) && !z3) {
                    sb.append(' ');
                    z3 = true;
                }
            } else if (iCodePointAt != 8203 && iCodePointAt != 173) {
                sb.appendCodePoint(iCodePointAt);
                z2 = true;
                z3 = false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m49328(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m49320(String str, String str2) {
        Pattern pattern = f68790;
        String strReplaceAll = pattern.matcher(str).replaceAll("");
        String strReplaceAll2 = pattern.matcher(str2).replaceAll("");
        try {
            try {
                return m49324(new URL(strReplaceAll), strReplaceAll2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(strReplaceAll2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return f68791.matcher(strReplaceAll2).find() ? strReplaceAll2 : "";
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static URL m49324(URL url, String str) {
        String strReplaceAll = f68790.matcher(str).replaceAll("");
        if (strReplaceAll.startsWith("?")) {
            strReplaceAll = C17588.m40053(url.getPath(), strReplaceAll);
        }
        URL url2 = new URL(url, strReplaceAll);
        String strReplaceFirst = f68792.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            strReplaceFirst = C24104.m53357(strReplaceFirst, "#", url2.getRef());
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), strReplaceFirst);
    }

    /* JADX INFO: renamed from: ֫ */
    public static StringBuilder m49323() {
        Stack stack = (Stack) f68793.get();
        if (stack.empty()) {
            return new StringBuilder(8192);
        }
        return (StringBuilder) stack.pop();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m49321(StringBuilder sb) {
        C18515.m42065(sb);
        String string = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack stack = (Stack) f68793.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return string;
    }
}
