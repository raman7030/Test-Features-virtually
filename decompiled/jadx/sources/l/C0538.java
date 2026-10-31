package l;

/* JADX INFO: renamed from: l.֡ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBHJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0538 implements InterfaceC9069 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8300 f2200;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f2201;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f2202;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21064 f2203;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f2204;

    public C0538(int i, int i2, int i3, C21064 c21064, C8300 c8300) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i3 <= i2) {
            throw new IllegalArgumentException("end <= start");
        }
        int size = c21064.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (c21064.get(i4) < 0) {
                StringBuilder sbM32308 = C13325.m32308(i4, "successors[", "] == ");
                sbM32308.append(c21064.get(i4));
                throw new IllegalArgumentException(sbM32308.toString());
            }
        }
        if (c8300 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f2202 = i;
        this.f2204 = i2;
        this.f2201 = i3;
        this.f2203 = c21064;
        this.f2200 = c8300;
    }

    public final String toString() {
        return "{" + C14712.m35006(this.f2202) + ": " + C14712.m35006(this.f2204) + ".." + C14712.m35006(this.f2201) + '}';
    }

    @Override // l.InterfaceC9069
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo2269() {
        return this.f2202;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m2273() {
        return this.f2204;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m2271() {
        return this.f2201;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21064 m2272() {
        return this.f2203;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8300 m2270() {
        return this.f2200;
    }
}
