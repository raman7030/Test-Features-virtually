package p067l;

/* JADX INFO: renamed from: l.ۚᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26O7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7612 {

    /* JADX INFO: renamed from: ֫ */
    public static final C13259 f19915 = C13259.m30304(" *+(?<directive>\\.class) ++(?<modifiers>(?:(?>public|private|protected|static|final|synchronized|volatile|bridge|transient|varargs|native|interface|abstract|strictfp|synthetic|annotation|enum|constructor|declared-synchronized|whitelist|greylist-max-o|greylist-max-p|greylist-max-q|greylist-max-r|greylist|blacklist|core-platform-api|test-api) ++)*+)(?<type>L[^;\\r\\n]*+;)");

    /* JADX INFO: renamed from: ܿ */
    public static final C13259 f19920 = C13259.m30304(" *+(?<directive>\\.)method ++(?<modifiers>(?:(?>public|private|protected|static|final|synchronized|volatile|bridge|transient|varargs|native|interface|abstract|strictfp|synthetic|annotation|enum|constructor|declared-synchronized|whitelist|greylist-max-o|greylist-max-p|greylist-max-q|greylist-max-r|greylist|blacklist|core-platform-api|test-api) ++)*+)(?<name>[^ \\r\\n(]++) *+\\( *+(?<parameters>[^ \\r\\n)]*+) *+\\) *+(?<type>\\[*+(?:[VCZBISJDF]|L[^;\\r\\n]*+;))");

    /* JADX INFO: renamed from: ۧ */
    public static final C13259 f19917 = C13259.m30304(" *+(?<directive>\\.)field ++(?<modifiers>(?:(?>public|private|protected|static|final|synchronized|volatile|bridge|transient|varargs|native|interface|abstract|strictfp|synthetic|annotation|enum|constructor|declared-synchronized|whitelist|greylist-max-o|greylist-max-p|greylist-max-q|greylist-max-r|greylist|blacklist|core-platform-api|test-api) ++)*+)(?<name>[^ \\r\\n:]++) *+: *+(?<type>\\[*+(?:[VCZBISJDF]|L[^;\\r\\n]*+;))(?: *+= *+(?<value>[^ \\f\\t\\r\\n\\u00a0\\u1680\\u180e\\u2000-\\u200a\\u2028\\u2029\\u202f\\u205f\\u3000\\ufeff]++))?+");

    /* JADX INFO: renamed from: ܳ */
    public static final C13259 f19918 = C13259.m30304(" *+\\.end ++method");

    /* JADX INFO: renamed from: ܽ */
    public static final C13259 f19919 = C13259.m30304(" *+\\.end ++field");

    /* JADX INFO: renamed from: ۜ */
    public static final C13259 f19916 = C13259.m30304(" *+(?:const-string(?:/jumbo)?+ ++[vp][0-9]++ *+,|\\.field [^\\r\\n=]++=) *+\"");

    /* JADX INFO: renamed from: ᩻ */
    public static final C13259 f19922 = C13259.m30304("method ++(?<modifiers>(?:(?>public|private|protected|static|final|synchronized|volatile|bridge|transient|varargs|native|interface|abstract|strictfp|synthetic|annotation|enum|constructor|declared-synchronized|whitelist|greylist-max-o|greylist-max-p|greylist-max-q|greylist-max-r|greylist|blacklist|core-platform-api|test-api) ++)*+)(?<name>[^ \\r\\n(]++) *+\\( *+(?<parameters>[^ \\r\\n)]*+) *+\\) *+(?<type>[^ \\r\\n]++)");

    /* JADX INFO: renamed from: ᩳ */
    public static final C13259 f19921 = C13259.m30304("field ++(?<modifiers>(?:(?>public|private|protected|static|final|synchronized|volatile|bridge|transient|varargs|native|interface|abstract|strictfp|synthetic|annotation|enum|constructor|declared-synchronized|whitelist|greylist-max-o|greylist-max-p|greylist-max-q|greylist-max-r|greylist|blacklist|core-platform-api|test-api) ++)*+)(?<name>[^ \\r\\n:]++) *+: *+(?<type>[^ \\r\\n=]++)");

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0035 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:21:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0049  */
    /* JADX WARN: Code duplicated, block: B:37:0x0050 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m17564(C13929 c13929, int i) {
        char cCharAt;
        int i2;
        int i3;
        CharSequence text = c13929.getText();
        int length = text.length();
        if (i >= length) {
            return false;
        }
        if (i != 0) {
            int i4 = i - 1;
            if (text.charAt(i4) != '\n' && (text.charAt(i4) != '\r' || text.charAt(i) == '\n')) {
                while (i < length) {
                    cCharAt = text.charAt(i);
                    if (cCharAt != '\r') {
                        if (cCharAt == '\r') {
                            i = i3;
                        }
                        i2 = i + 1;
                        if (i2 < length) {
                            continue;
                        }
                    } else {
                        if (cCharAt == '\r') {
                            i = i3;
                        }
                        i2 = i + 1;
                        if (i2 < length) {
                            continue;
                        }
                    }
                    i++;
                }
                return false;
            }
            if (!c13929.lookingAt(i)) {
                while (i < length) {
                    cCharAt = text.charAt(i);
                    if (cCharAt != '\r' || cCharAt == '\n') {
                        if (cCharAt == '\r' && (i3 = i + 1) < length && text.charAt(i3) == '\n') {
                            i = i3;
                        }
                        i2 = i + 1;
                        if (i2 < length || !c13929.lookingAt(i2)) {
                        }
                    }
                    i++;
                }
                return false;
            }
        } else if (!c13929.lookingAt(i)) {
            while (i < length) {
                cCharAt = text.charAt(i);
                if (cCharAt != '\r') {
                    if (cCharAt == '\r') {
                        i = i3;
                    }
                    i2 = i + 1;
                    if (i2 < length) {
                        continue;
                    }
                } else {
                    if (cCharAt == '\r') {
                        i = i3;
                    }
                    i2 = i + 1;
                    if (i2 < length) {
                        continue;
                    }
                }
                i++;
            }
            return false;
        }
        return true;
    }
}
