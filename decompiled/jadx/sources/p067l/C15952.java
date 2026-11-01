package p067l;

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
public final class C15952 {

    /* JADX INFO: renamed from: ܽ */
    public static final C15952 f46170 = new C15952(Collections.EMPTY_MAP, false);

    /* JADX INFO: renamed from: ᩳ */
    public static final Set f46171;

    /* JADX INFO: renamed from: ֫ */
    public final boolean f46172;

    /* JADX INFO: renamed from: ۧ */
    public final Map f46173;

    static {
        Object[] objArr = {"range", "accept-encoding", "content-length", "transfer-encoding", "if-none-match", "if-modified-since"};
        HashSet hashSet = new HashSet(6);
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            C12826.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
            }
        }
        f46171 = C21562.unmodifiableSet(hashSet);
    }

    public C15952(Map map, boolean z) {
        this.f46173 = C21562.unmodifiableMap(new LinkedHashMap(map));
        this.f46172 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15952 m36209(String str, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        while (i2 <= str.length()) {
            if (i2 >= str.length() || str.charAt(i2) == '\n') {
                String strM36208 = m36208(str.substring(i3, (i2 <= i3 || str.charAt(i2 + (-1)) != '\r') ? i2 : i2 - 1));
                if (!strM36208.isEmpty()) {
                    int iIndexOf = strM36208.indexOf(58);
                    if (iIndexOf < 0) {
                        throw new C19306(i, EnumC18635.INVALID_FORMAT);
                    }
                    String strM36209 = m36208(strM36208.substring(0, iIndexOf));
                    if (!strM36209.isEmpty()) {
                        for (int i4 = 0; i4 < strM36209.length(); i4++) {
                            char cCharAt = strM36209.charAt(i4);
                            if ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= '0' && cCharAt <= '9') || "!#$%&'*+-.^_`|~".indexOf(cCharAt) >= 0))) {
                            }
                        }
                        String strM362010 = m36208(strM36208.substring(iIndexOf + 1));
                        for (int i5 = 0; i5 < strM362010.length(); i5++) {
                            char cCharAt2 = strM362010.charAt(i5);
                            if ((cCharAt2 < ' ' && cCharAt2 != '\t') || cCharAt2 == 127) {
                                throw new C19306(i, EnumC18635.INVALID_VALUE);
                            }
                        }
                        if (f46171.contains(strM36209.toLowerCase(Locale.ROOT))) {
                            throw new C19306(i, EnumC18635.MANAGED_HEADER);
                        }
                        if (!treeSet.add(strM36209)) {
                            throw new C19306(i, EnumC18635.DUPLICATE_NAME);
                        }
                        linkedHashMap.put(strM36209, strM362010);
                    }
                    throw new C19306(i, EnumC18635.INVALID_NAME);
                }
                i3 = i2 + 1;
                i++;
            }
            i2++;
        }
        return (!linkedHashMap.isEmpty() || z) ? new C15952(linkedHashMap, z) : f46170;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m36208(String str) {
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

    /* JADX INFO: renamed from: ܽ */
    public final Map m36212() {
        return this.f46173;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m36210() {
        return this.f46172;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m36211() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : this.f46173.entrySet()) {
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
