package p067l;

/* JADX INFO: renamed from: l.ۗ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I97D */
/* JADX INFO: loaded from: classes2.dex */
public final class C5685 implements Comparable {

    /* JADX INFO: renamed from: ۗ */
    public static final ConcurrentMapC12768 f13858 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ۙ */
    public final String f13859;

    /* JADX INFO: renamed from: ᩶ */
    public final int f13860;

    /* JADX INFO: renamed from: ᩸ */
    public final C10656 f13861;

    /* JADX INFO: renamed from: ᩹ */
    public final int f13862;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f13862 - ((C5685) obj).f13862;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5685 m12667(int i, String str) {
        if (str.startsWith("parseColor(")) {
            str = str.replace(" ", "");
        }
        String str2 = str + "::" + i;
        ConcurrentMapC12768 concurrentMapC12768 = f13858;
        C5685 c5685 = (C5685) concurrentMapC12768.get(str2);
        if (c5685 != null) {
            return c5685;
        }
        C5685 c5686 = new C5685(str, i);
        concurrentMapC12768.put(str2, c5686);
        return c5686;
    }

    public C5685(String str, int i) {
        this.f13859 = str;
        this.f13862 = i;
        if (str.startsWith("parseColor(")) {
            this.f13861 = C10656.m24497(str);
            this.f13860 = 0;
        } else {
            this.f13861 = null;
            this.f13860 = C7026.m16158(str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10656 m12668() {
        C10656 c10656 = this.f13861;
        C12826.requireNonNull(c10656);
        return c10656;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5685.class == obj.getClass()) {
            C5685 c5685 = (C5685) obj;
            if (this.f13862 == c5685.f13862 && this.f13859.equals(c5685.f13859)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C12826.hash(this.f13859, Integer.valueOf(this.f13862));
    }
}
