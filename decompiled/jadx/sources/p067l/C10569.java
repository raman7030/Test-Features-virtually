package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6VB */
/* JADX INFO: loaded from: classes3.dex */
public final class C10569 {

    /* JADX INFO: renamed from: ֫ */
    public final C13259 f29268;

    /* JADX INFO: renamed from: ۧ */
    public final List f29269;

    public C10569(C13259 c13259, String str, boolean z) {
        List listUnmodifiableList;
        int iIntValue;
        this.f29268 = c13259;
        if (z) {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            int iGroupCount = c13259.matcher("").groupCount();
            Map mapM30311 = c13259.m30311();
            int i = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                char c = '$';
                if (cCharAt == '\\') {
                    i++;
                    if (i == str.length()) {
                        throw m24358();
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
                                throw m24358();
                            }
                            c = '\t';
                        }
                    }
                    sb.append(c);
                } else if (cCharAt == '$') {
                    int iIndexOf = i + 1;
                    if (iIndexOf == str.length()) {
                        throw m24358();
                    }
                    char cCharAt3 = str.charAt(iIndexOf);
                    if (cCharAt3 == '{') {
                        int i2 = i + 2;
                        iIndexOf = str.indexOf(C0254q.f1218h, i2);
                        if (iIndexOf < 0 || iIndexOf == i2) {
                            throw m24358();
                        }
                        String strSubstring = str.substring(i2, iIndexOf);
                        if (strSubstring.charAt(0) < '0' || strSubstring.charAt(0) > '9') {
                            Integer num = (Integer) mapM30311.get(strSubstring);
                            if (num == null) {
                                throw m24358();
                            }
                            iIntValue = num.intValue();
                        } else {
                            for (int i3 = 0; i3 < strSubstring.length(); i3++) {
                                if (strSubstring.charAt(i3) < '0' || strSubstring.charAt(i3) > '9') {
                                    throw m24358();
                                }
                            }
                            try {
                                iIntValue = Integer.parseInt(strSubstring);
                            } catch (NumberFormatException unused) {
                                throw m24358();
                            }
                        }
                    } else {
                        if (cCharAt3 < '0' || cCharAt3 > '9') {
                            throw m24358();
                        }
                        iIntValue = cCharAt3 - '0';
                    }
                    if (iIntValue > iGroupCount) {
                        throw m24358();
                    }
                    if (sb.length() != 0) {
                        arrayList.add(new C8557(sb.toString(), -1));
                        sb.setLength(0);
                    }
                    arrayList.add(new C8557(null, iIntValue));
                    i = iIndexOf;
                } else {
                    sb.append(cCharAt);
                }
                i++;
            }
            listUnmodifiableList = arrayList;
            if (sb.length() != 0) {
                arrayList.add(new C8557(sb.toString(), -1));
                listUnmodifiableList = arrayList;
            }
        } else {
            Object[] objArr = {new C8557(str, -1)};
            ArrayList arrayList2 = new ArrayList(1);
            Object obj = objArr[0];
            C12826.requireNonNull(obj);
            arrayList2.add(obj);
            listUnmodifiableList = C21562.unmodifiableList(arrayList2);
        }
        this.f29269 = listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11240 m24359(String str, boolean z) throws C24650 {
        m24356();
        C13929 c13929Matcher = this.f29268.matcher((CharSequence) str);
        StringBuilder sb = new StringBuilder(Math.min(str.length(), 20971520));
        int iEnd = 0;
        int i = 0;
        do {
            boolean zFind = c13929Matcher.find();
            m24356();
            if (c13929Matcher.m31668() || c13929Matcher.m31678()) {
                throw new C24650(EnumC21969.REGEX_FAILED);
            }
            if (!zFind) {
                break;
            }
            m24357(iEnd, c13929Matcher.start(), str, sb);
            for (C8557 c8557 : this.f29269) {
                m24356();
                if (c8557.f22981 < 0) {
                    m24357(0, c8557.f22982.length(), c8557.f22982, sb);
                } else {
                    int iStart = c13929Matcher.start(c8557.f22981);
                    if (iStart >= 0) {
                        m24357(iStart, c13929Matcher.end(c8557.f22981), str, sb);
                    }
                }
            }
            iEnd = c13929Matcher.end();
            i++;
        } while (!z);
        m24357(iEnd, str.length(), str, sb);
        m24356();
        return new C11240(sb.toString(), i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24357(int i, int i2, String str, StringBuilder sb) throws C24650 {
        if ((((long) sb.length()) + ((long) i2)) - ((long) i) > 20971520) {
            throw new C24650(EnumC21969.RESULT_TOO_LARGE);
        }
        sb.append((CharSequence) str, i, i2);
    }

    /* JADX INFO: renamed from: ۧ */
    public static IllegalArgumentException m24358() {
        return new IllegalArgumentException("Invalid replacement template or unknown capture group.");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24356() throws C24650 {
        if (Thread.currentThread().isInterrupted()) {
            throw new C24650(EnumC21969.CANCELED);
        }
    }
}
