package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 44FR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10338 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String[] f31136;

    public C10338(C12454 c12454) {
        ArrayList arrayList = c12454.f37457;
        this.f31136 = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public C10338(String[] strArr) {
        this.f31136 = strArr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m26139() {
        return this.f31136.length / 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m26136(int i) {
        return this.f31136[i * 2];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m26140(int i) {
        return this.f31136[(i * 2) + 1];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m26141(String str) {
        int iM26139 = m26139();
        ArrayList arrayList = null;
        for (int i = 0; i < iM26139; i++) {
            if (str.equalsIgnoreCase(m26136(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m26140(i));
            }
        }
        if (arrayList != null) {
            return C20195.unmodifiableList(arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12454 m26138() {
        C12454 c12454 = new C12454();
        Collections.addAll(c12454.f37457, this.f31136);
        return c12454;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C10338) && Arrays.equals(((C10338) obj).f31136, this.f31136);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f31136);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iM26139 = m26139();
        for (int i = 0; i < iM26139; i++) {
            sb.append(m26136(i));
            sb.append(": ");
            sb.append(m26140(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m26137(String str) {
        String[] strArr = this.f31136;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10338 m26132(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i = 0; i < strArr2.length; i++) {
            String str = strArr2[i];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i] = str.trim();
        }
        for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
            String str2 = strArr2[i2];
            String str3 = strArr2[i2 + 1];
            m26135(str2);
            m26133(str3, str2);
        }
        return new C10338(strArr2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C10338 m26134() {
        Map map = Collections.EMPTY_MAP;
        if (map == null) {
            throw new NullPointerException("headers == null");
        }
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            String strTrim = ((String) entry.getKey()).trim();
            String strTrim2 = ((String) entry.getValue()).trim();
            m26135(strTrim);
            m26133(strTrim2, strTrim);
            strArr[i] = strTrim;
            strArr[i + 1] = strTrim2;
            i += 2;
        }
        return new C10338(strArr);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m26135(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                Object[] objArr = {Integer.valueOf(cCharAt), Integer.valueOf(i), str};
                byte[] bArr = C20032.f64884;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", objArr));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26133(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(C4860.m14172("value for name ", str2, " == null"));
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                Object[] objArr = {Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str};
                byte[] bArr = C20032.f64884;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in %s value: %s", objArr));
            }
        }
    }
}
