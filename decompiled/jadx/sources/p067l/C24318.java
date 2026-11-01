package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩺ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BE0 */
/* JADX INFO: loaded from: classes.dex */
public final class C24318 implements Comparable {

    /* JADX INFO: renamed from: ۗ */
    public static final /* synthetic */ int f77046 = 0;

    /* JADX INFO: renamed from: ۬ */
    public static final ConcurrentMapC12768 f77047 = new ConcurrentMapC12768(10000, 0.75f);

    /* JADX INFO: renamed from: ۙ */
    public final C9566 f77048;

    /* JADX INFO: renamed from: ᩶ */
    public final C15600 f77049;

    /* JADX INFO: renamed from: ᩸ */
    public final String f77050;

    /* JADX INFO: renamed from: ᩹ */
    public C15600 f77051;

    /* JADX INFO: renamed from: ۧ */
    public static C24318 m53649(String str) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        ConcurrentMapC12768 concurrentMapC12768 = f77047;
        C24318 c24318 = (C24318) concurrentMapC12768.get(str);
        if (c24318 != null) {
            return c24318;
        }
        C24318 c24318M53648 = m53648(str);
        C24318 c24319 = (C24318) concurrentMapC12768.putIfAbsent(c24318M53648.f77050, c24318M53648);
        return c24319 != null ? c24319 : c24318M53648;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24318 m53648(String str) {
        C9566 c9566M22274;
        int i;
        C24318 c24318 = (C24318) f77047.get(str);
        if (c24318 != null) {
            return c24318;
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
        C9566[] c9566Arr = new C9566[i3];
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
                c9566Arr[i5] = C9566.m22274(str.substring(i4, i));
                i5++;
                i4 = i;
            } else {
                String strSubstring = str.substring(i4 + 1);
                C9566 c9566 = C9566.f26314;
                try {
                    if (strSubstring.equals("V")) {
                        c9566M22274 = C9566.f26318;
                    } else {
                        c9566M22274 = C9566.m22274(strSubstring);
                    }
                    C15600 c15600 = new C15600(i5);
                    for (int i7 = 0; i7 < i5; i7++) {
                        c15600.m43243(i7, c9566Arr[i7]);
                    }
                    return new C24318(str, c9566M22274, c15600);
                } catch (NullPointerException unused) {
                    throw new NullPointerException("descriptor == null");
                }
            }
        }
    }

    public C24318(String str, C9566 c9566, C15600 c15600) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        }
        if (c9566 == null) {
            throw new NullPointerException("returnType == null");
        }
        this.f77050 = str;
        this.f77048 = c9566;
        this.f77049 = c15600;
        this.f77051 = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24318)) {
            return false;
        }
        return this.f77050.equals(((C24318) obj).f77050);
    }

    public final int hashCode() {
        return this.f77050.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C24318 c24318) {
        if (this == c24318) {
            return 0;
        }
        C9566 c9566 = c24318.f77048;
        C15600 c15600 = c24318.f77049;
        int iCompareTo = this.f77048.compareTo(c9566);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        C15600 c15601 = this.f77049;
        int size = c15601.size();
        int size2 = c15600.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo2 = c15601.m56515get(i).compareTo(c15600.m56515get(i));
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
        return this.f77050;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m53651() {
        return this.f77050;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C9566 m53655() {
        return this.f77048;
    }

    /* JADX INFO: renamed from: ۘ */
    public final C15600 m53653() {
        return this.f77049;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C15600 m53654() {
        if (this.f77051 == null) {
            C15600 c15600 = this.f77049;
            int size = c15600.size();
            C15600 c15601 = new C15600(size);
            boolean z = false;
            for (int i = 0; i < size; i++) {
                C9566 c9566M56515get = c15600.m56515get(i);
                if (c9566M56515get.m22289()) {
                    c9566M56515get = C9566.f26325;
                    z = true;
                }
                c15601.m43243(i, c9566M56515get);
            }
            if (z) {
                c15600 = c15601;
            }
            this.f77051 = c15600;
        }
        return this.f77051;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24318 m53652(C9566 c9566) {
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        sb.append(c9566.m22277());
        String strM48621 = C21459.m48621(1, this.f77050, sb);
        C15600 c15600M35477 = this.f77049.m35477(c9566);
        c15600M35477.mo22326();
        C24318 c24318 = new C24318(strM48621, this.f77048, c15600M35477);
        C24318 c24319 = (C24318) f77047.putIfAbsent(strM48621, c24318);
        return c24319 != null ? c24319 : c24318;
    }
}
