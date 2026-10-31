package l;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ܳۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96ZB */
/* JADX INFO: loaded from: classes3.dex */
public final class C14293 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C14293 f43078 = new C14293(Collections.EMPTY_MAP, false);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Set f43079;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f43080;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map f43081;

    static {
        Object[] objArr = {"range", "accept-encoding", "content-length", "transfer-encoding", "if-none-match", "if-modified-since"};
        HashSet hashSet = new HashSet(6);
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            C11003.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        f43079 = C20195.unmodifiableSet(hashSet);
    }

    public C14293(Map map, boolean z) {
        this.f43081 = C20195.unmodifiableMap(new LinkedHashMap(map));
        this.f43080 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14293 m34076(String str, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        while (i2 <= str.length()) {
            if (i2 >= str.length() || str.charAt(i2) == '\n') {
                String strM34075 = m34075(str.substring(i3, (i2 <= i3 || str.charAt(i2 + (-1)) != '\r') ? i2 : i2 - 1));
                if (!strM34075.isEmpty()) {
                    int iIndexOf = strM34075.indexOf(58);
                    if (iIndexOf < 0) {
                        throw new C17822(i, EnumC17116.INVALID_FORMAT);
                    }
                    String strM34076 = m34075(strM34075.substring(0, iIndexOf));
                    if (!strM34076.isEmpty()) {
                        for (int i4 = 0; i4 < strM34076.length(); i4++) {
                            char cCharAt = strM34076.charAt(i4);
                            if ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= '0' && cCharAt <= '9') || "!#$%&'*+-.^_`|~".indexOf(cCharAt) >= 0))) {
                            }
                        }
                        String strM34077 = m34075(strM34075.substring(iIndexOf + 1));
                        for (int i5 = 0; i5 < strM34077.length(); i5++) {
                            char cCharAt2 = strM34077.charAt(i5);
                            if ((cCharAt2 < ' ' && cCharAt2 != '\t') || cCharAt2 == 127) {
                                throw new C17822(i, EnumC17116.INVALID_VALUE);
                            }
                        }
                        if (f43079.contains(strM34076.toLowerCase(Locale.ROOT))) {
                            throw new C17822(i, EnumC17116.MANAGED_HEADER);
                        }
                        if (!treeSet.add(strM34076)) {
                            throw new C17822(i, EnumC17116.DUPLICATE_NAME);
                        }
                        linkedHashMap.put(strM34076, strM34077);
                    }
                    throw new C17822(i, EnumC17116.INVALID_NAME);
                }
                i3 = i2 + 1;
                i++;
            }
            i2++;
        }
        return (!linkedHashMap.isEmpty() || z) ? new C14293(linkedHashMap, z) : f43078;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m34075(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && (str.charAt(i) == ' ' || str.charAt(i) == '\t')) {
            i++;
        }
        while (length > i) {
            int i2 = length - 1;
            if (str.charAt(i2) != ' ' && str.charAt(i2) != '\t') {
                break;
            }
            length--;
        }
        return str.substring(i, length);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Map m34079() {
        return this.f43081;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m34077() {
        return this.f43080;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m34078() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : this.f43081.entrySet()) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append((String) entry.getKey());
            sb.append(": ");
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }
}
