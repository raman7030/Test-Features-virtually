package l;

import com.alipay.sdk.m.y.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6VB */
/* JADX INFO: loaded from: classes3.dex */
public final class C8629 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11459 f26350;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f26351;

    public C8629(C11459 c11459, String str, boolean z) {
        List listUnmodifiableList;
        int iIntValue;
        this.f26350 = c11459;
        if (z) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            int iGroupCount = c11459.matcher("").groupCount();
            Map mapM28267 = c11459.m28267();
            int i = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                char c = '$';
                if (cCharAt == '\\') {
                    i++;
                    if (i == str.length()) {
                        throw m22389();
                    }
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 != '$') {
                        if (cCharAt2 == '\\') {
                            c = '\\';
                        } else if (cCharAt2 == 'n') {
                            c = '\n';
                        } else if (cCharAt2 == 'r') {
                            c = '\r';
                        } else {
                            if (cCharAt2 != 't') {
                                throw m22389();
                            }
                            c = '\t';
                        }
                    }
                    sb.append(c);
                } else if (cCharAt == '$') {
                    int iIndexOf = i + 1;
                    if (iIndexOf == str.length()) {
                        throw m22389();
                    }
                    char cCharAt3 = str.charAt(iIndexOf);
                    if (cCharAt3 == '{') {
                        int i2 = i + 2;
                        iIndexOf = str.indexOf(q.h, i2);
                        if (iIndexOf < 0 || iIndexOf == i2) {
                            throw m22389();
                        }
                        String strSubstring = str.substring(i2, iIndexOf);
                        if (strSubstring.charAt(0) < '0' || strSubstring.charAt(0) > '9') {
                            Integer num = (Integer) mapM28267.get(strSubstring);
                            if (num == null) {
                                throw m22389();
                            }
                            iIntValue = num.intValue();
                        } else {
                            for (int i3 = 0; i3 < strSubstring.length(); i3++) {
                                if (strSubstring.charAt(i3) < '0' || strSubstring.charAt(i3) > '9') {
                                    throw m22389();
                                }
                            }
                            try {
                                iIntValue = Integer.parseInt(strSubstring);
                            } catch (NumberFormatException unused) {
                                throw m22389();
                            }
                        }
                    } else {
                        if (cCharAt3 < '0' || cCharAt3 > '9') {
                            throw m22389();
                        }
                        iIntValue = cCharAt3 - '0';
                    }
                    if (iIntValue > iGroupCount) {
                        throw m22389();
                    }
                    if (sb.length() != 0) {
                        arrayList.add(new C6512(sb.toString(), -1));
                        sb.setLength(0);
                    }
                    arrayList.add(new C6512(null, iIntValue));
                    i = iIndexOf;
                } else {
                    sb.append(cCharAt);
                }
                i++;
            }
            listUnmodifiableList = arrayList;
            if (sb.length() != 0) {
                arrayList.add(new C6512(sb.toString(), -1));
                listUnmodifiableList = arrayList;
            }
        } else {
            Object[] objArr = {new C6512(str, -1)};
            ArrayList arrayList2 = new ArrayList(1);
            Object obj = objArr[0];
            C11003.requireNonNull(obj);
            arrayList2.add(obj);
            listUnmodifiableList = C20195.unmodifiableList(arrayList2);
        }
        this.f26351 = listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9335 m22390(String str, boolean z) throws C23445 {
        m22387();
        C12164 c12164Matcher = this.f26350.matcher((CharSequence) str);
        StringBuilder sb = new StringBuilder(Math.min(str.length(), 20971520));
        int iEnd = 0;
        int i = 0;
        do {
            boolean zFind = c12164Matcher.find();
            m22387();
            if (c12164Matcher.m29603() || c12164Matcher.m29613()) {
                throw new C23445(EnumC20624.REGEX_FAILED);
            }
            if (!zFind) {
                break;
            }
            m22388(iEnd, c12164Matcher.start(), str, sb);
            for (C6512 c6512 : this.f26351) {
                m22387();
                if (c6512.f20103 < 0) {
                    m22388(0, c6512.f20104.length(), c6512.f20104, sb);
                } else {
                    int iStart = c12164Matcher.start(c6512.f20103);
                    if (iStart >= 0) {
                        m22388(iStart, c12164Matcher.end(c6512.f20103), str, sb);
                    }
                }
            }
            iEnd = c12164Matcher.end();
            i++;
        } while (!z);
        m22388(iEnd, str.length(), str, sb);
        m22387();
        return new C9335(sb.toString(), i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22388(int i, int i2, String str, StringBuilder sb) throws C23445 {
        if ((((long) sb.length()) + ((long) i2)) - ((long) i) > 20971520) {
            throw new C23445(EnumC20624.RESULT_TOO_LARGE);
        }
        sb.append((CharSequence) str, i, i2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m22389() {
        return new IllegalArgumentException("Invalid replacement template or unknown capture group.");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22387() throws C23445 {
        if (Thread.currentThread().isInterrupted()) {
            throw new C23445(EnumC20624.CANCELED);
        }
    }
}
