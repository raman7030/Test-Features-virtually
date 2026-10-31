package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩺ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BE0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23095 implements Comparable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f74300 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f74301 = new ConcurrentMapC10942(10000, 0.75f);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7573 f74302;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13922 f74303;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f74304;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C13922 f74305;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C23095 m51255(String str) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        ConcurrentMapC10942 concurrentMapC10942 = f74301;
        C23095 c23095 = (C23095) concurrentMapC10942.get(str);
        if (c23095 != null) {
            return c23095;
        }
        C23095 c23095M51254 = m51254(str);
        C23095 c23096 = (C23095) concurrentMapC10942.putIfAbsent(c23095M51254.f74304, c23095M51254);
        return c23096 != null ? c23096 : c23095M51254;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23095 m51254(String str) {
        C7573 c7573M20297;
        int i;
        C23095 c23095 = (C23095) f74301.get(str);
        if (c23095 != null) {
            return c23095;
        }
        int length = str.length();
        if (str.charAt(0) != '(') {
            throw new IllegalArgumentException("bad descriptor");
        }
        int i2 = 1;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = 0;
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt == ')') {
                break;
            }
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                i3++;
            }
            i2++;
        }
        if (i2 == 0 || i2 == length - 1) {
            throw new IllegalArgumentException("bad descriptor");
        }
        if (str.indexOf(41, i2 + 1) != -1) {
            throw new IllegalArgumentException("bad descriptor");
        }
        C7573[] c7573Arr = new C7573[i3];
        int i4 = 1;
        int i5 = 0;
        while (true) {
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 != ')') {
                int i6 = i4;
                while (cCharAt2 == '[') {
                    i6++;
                    cCharAt2 = str.charAt(i6);
                }
                if (cCharAt2 == 'L') {
                    int iIndexOf = str.indexOf(59, i6);
                    if (iIndexOf == -1) {
                        throw new IllegalArgumentException("bad descriptor");
                    }
                    i = iIndexOf + 1;
                } else {
                    i = i6 + 1;
                }
                c7573Arr[i5] = C7573.m20297(str.substring(i4, i));
                i5++;
                i4 = i;
            } else {
                String strSubstring = str.substring(i4 + 1);
                C7573 c7573 = C7573.f23402;
                try {
                    if (strSubstring.equals("V")) {
                        c7573M20297 = C7573.f23406;
                    } else {
                        c7573M20297 = C7573.m20297(strSubstring);
                    }
                    C13922 c13922 = new C13922(i5);
                    for (int i7 = 0; i7 < i5; i7++) {
                        c13922.m40983(i7, c7573Arr[i7]);
                    }
                    return new C23095(str, c7573M20297, c13922);
                } catch (NullPointerException unused) {
                    throw new NullPointerException("descriptor == null");
                }
            }
        }
    }

    public C23095(String str, C7573 c7573, C13922 c13922) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        if (c7573 == null) {
            throw new NullPointerException("returnType == null");
        }
        this.f74304 = str;
        this.f74302 = c7573;
        this.f74303 = c13922;
        this.f74305 = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23095)) {
            return false;
        }
        return this.f74304.equals(((C23095) obj).f74304);
    }

    public final int hashCode() {
        return this.f74304.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C23095 c23095) {
        if (this == c23095) {
            return 0;
        }
        C7573 c7573 = c23095.f74302;
        C13922 c13922 = c23095.f74303;
        int iCompareTo = this.f74302.compareTo(c7573);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        C13922 c13923 = this.f74303;
        int size = c13923.size();
        int size2 = c13922.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo2 = c13923.m40995get(i).compareTo(c13922.m40995get(i));
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }

    public final String toString() {
        return this.f74304;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m51257() {
        return this.f74304;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7573 m51261() {
        return this.f74302;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C13922 m51259() {
        return this.f74303;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13922 m51260() {
        if (this.f74305 == null) {
            C13922 c13922 = this.f74303;
            int size = c13922.size();
            C13922 c13923 = new C13922(size);
            boolean z = false;
            for (int i = 0; i < size; i++) {
                C7573 c7573M40995get = c13922.m40995get(i);
                if (c7573M40995get.m20312()) {
                    c7573M40995get = C7573.f23413;
                    z = true;
                }
                c13923.m40983(i, c7573M40995get);
            }
            if (z) {
                c13922 = c13923;
            }
            this.f74305 = c13922;
        }
        return this.f74305;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23095 m51258(C7573 c7573) {
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        sb.append(c7573.m20300());
        String strM46305 = C20087.m46305(1, this.f74304, sb);
        C13922 c13922M33358 = this.f74303.m33358(c7573);
        c13922M33358.mo20349();
        C23095 c23095 = new C23095(strM46305, this.f74302, c13922M33358);
        C23095 c23096 = (C23095) f74301.putIfAbsent(strM46305, c23095);
        return c23096 != null ? c23096 : c23095;
    }
}
