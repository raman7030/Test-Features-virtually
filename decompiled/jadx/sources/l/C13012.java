package l;

/* JADX INFO: renamed from: l.۬ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B9F */
/* JADX INFO: loaded from: classes3.dex */
public final class C13012 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17246 f38952;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21064 f38953;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f38954;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C21064[] f38955;

    public C13012(C17246 c17246, int i) {
        if (c17246 == null) {
            throw new NullPointerException("blocks == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("firstLabel < 0");
        }
        this.f38952 = c17246;
        this.f38954 = i;
        this.f38955 = null;
        this.f38953 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17246 m31591() {
        return this.f38952;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m31593() {
        return this.f38954;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21064 m31592(int i) {
        if (this.f38953 == null) {
            C17246 c17246 = this.f38952;
            int iM38023 = c17246.m38023();
            C21064[] c21064Arr = new C21064[iM38023];
            C21064 c21064 = new C21064(10);
            int size = c17246.size();
            for (int i2 = 0; i2 < size; i2++) {
                C16540 c16540M41002get = c17246.m41002get(i2);
                int iMo2269 = c16540M41002get.mo2269();
                C21064 c21064M38911 = c16540M41002get.m38911();
                int size2 = c21064M38911.size();
                if (size2 == 0) {
                    c21064.add(iMo2269);
                } else {
                    for (int i3 = 0; i3 < size2; i3++) {
                        int i4 = c21064M38911.get(i3);
                        C21064 c21065 = c21064Arr[i4];
                        if (c21065 == null) {
                            c21065 = new C21064(10);
                            c21064Arr[i4] = c21065;
                        }
                        c21065.add(iMo2269);
                    }
                }
            }
            for (int i5 = 0; i5 < iM38023; i5++) {
                C21064 c21066 = c21064Arr[i5];
                if (c21066 != null) {
                    c21066.m47914();
                    c21066.mo20349();
                }
            }
            c21064.m47914();
            c21064.mo20349();
            int i6 = this.f38954;
            if (c21064Arr[i6] == null) {
                c21064Arr[i6] = C21064.f67936;
            }
            this.f38955 = c21064Arr;
            this.f38953 = c21064;
        }
        C21064 c21067 = this.f38955[i];
        if (c21067 != null) {
            return c21067;
        }
        throw new RuntimeException("no such block: ".concat(C14712.m35006(i)));
    }
}
