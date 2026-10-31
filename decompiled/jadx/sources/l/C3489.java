package l;

/* JADX INFO: renamed from: l.ۗ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I97D */
/* JADX INFO: loaded from: classes2.dex */
public final class C3489 implements Comparable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f11053 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f11054;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f11055;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8720 f11056;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f11057;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f11057 - ((C3489) obj).f11057;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3489 m10672(int i, String str) {
        if (str.startsWith("parseColor(")) {
            str = str.replace(" ", "");
        }
        String str2 = str + "::" + i;
        ConcurrentMapC10942 concurrentMapC10942 = f11053;
        C3489 c3489 = (C3489) concurrentMapC10942.get(str2);
        if (c3489 != null) {
            return c3489;
        }
        C3489 c34810 = new C3489(str, i);
        concurrentMapC10942.put(str2, c34810);
        return c34810;
    }

    public C3489(String str, int i) {
        this.f11054 = str;
        this.f11057 = i;
        if (str.startsWith("parseColor(")) {
            this.f11056 = C8720.m22528(str);
            this.f11055 = 0;
        } else {
            this.f11056 = null;
            this.f11055 = C4900.m14261(str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8720 m10673() {
        C8720 c8720 = this.f11056;
        C11003.requireNonNull(c8720);
        return c8720;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3489.class == obj.getClass()) {
            C3489 c3489 = (C3489) obj;
            if (this.f11057 == c3489.f11057 && this.f11054.equals(c3489.f11054)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C11003.hash(this.f11054, Integer.valueOf(this.f11057));
    }
}
