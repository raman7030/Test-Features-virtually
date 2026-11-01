package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 44FR */
/* JADX INFO: loaded from: classes3.dex */
public final class C12194 {

    /* JADX INFO: renamed from: ֫ */
    public final String[] f34098;

    public C12194(C14205 c14205) {
        ArrayList arrayList = c14205.f40477;
        this.f34098 = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public C12194(String[] strArr) {
        this.f34098 = strArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m28164() {
        return this.f34098.length / 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m28161(int i) {
        return this.f34098[i * 2];
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m28165(int i) {
        return this.f34098[(i * 2) + 1];
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m28166(String str) {
        int iM28164 = m28164();
        ArrayList arrayList = null;
        for (int i = 0; i < iM28164; i++) {
            if (str.equalsIgnoreCase(m28161(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m28165(i));
            }
        }
        if (arrayList != null) {
            return C21562.unmodifiableList(arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14205 m28163() {
        C14205 c14205 = new C14205();
        Collections.addAll(c14205.f40477, this.f34098);
        return c14205;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C12194) && Arrays.equals(((C12194) obj).f34098, this.f34098);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f34098);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iM28164 = m28164();
        for (int i = 0; i < iM28164; i++) {
            sb.append(m28161(i));
            sb.append(": ");
            sb.append(m28165(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m28162(String str) {
        String[] strArr = this.f34098;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12194 m28157(String... strArr) {
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
            m28160(str2);
            m28158(str3, str2);
        }
        return new C12194(strArr2);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C12194 m28159() {
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
            m28160(strTrim);
            m28158(strTrim2, strTrim);
            strArr[i] = strTrim;
            strArr[i + 1] = strTrim2;
            i += 2;
        }
        return new C12194(strArr);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m28160(String str) {
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
                byte[] bArr = C21407.f67526;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", objArr));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28158(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(C6988.m16053("value for name ", str2, " == null"));
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                Object[] objArr = {Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str};
                byte[] bArr = C21407.f67526;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in %s value: %s", objArr));
            }
        }
    }
}
