package l;

/* JADX INFO: renamed from: l.֡ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BBC */
/* JADX INFO: loaded from: classes3.dex */
public final class C0475 extends AbstractC1181 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C15375 f2057;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f2058;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21064 f2059;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C15375[] f2060;

    public C0475(C10191 c10191, C15375 c15375, C21064 c21064, C15375[] c15375Arr) {
        super(c10191, C20069.f65002);
        if (c15375 == null) {
            throw new NullPointerException("user == null");
        }
        if (c21064 == null) {
            throw new NullPointerException("cases == null");
        }
        if (c15375Arr == null) {
            throw new NullPointerException("targets == null");
        }
        int size = c21064.size();
        if (size != c15375Arr.length) {
            throw new IllegalArgumentException("cases / targets mismatch");
        }
        if (size > 65535) {
            throw new IllegalArgumentException("too many cases");
        }
        this.f2057 = c15375;
        this.f2059 = c21064;
        this.f2060 = c15375Arr;
        boolean z = true;
        if (c21064.size() >= 2) {
            long jM2079 = m2079(c21064);
            long size2 = (((long) c21064.size()) * 4) + 2;
            if (jM2079 < 0 || jM2079 > (size2 * 5) / 4) {
                z = false;
            }
        }
        this.f2058 = z;
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo2084() {
        boolean z = this.f2058;
        C21064 c21064 = this.f2059;
        return (int) (z ? m2079(c21064) : (((long) c21064.size()) * 4) + 2);
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2082(C18241 c18241) {
        int iM13990;
        int iM13991 = this.f2057.m13990();
        int iMo7129 = C12554.f37829.m32168().mo7129();
        C15375[] c15375Arr = this.f2060;
        int length = c15375Arr.length;
        boolean z = this.f2058;
        C21064 c21064 = this.f2059;
        int i = 0;
        if (z) {
            int i2 = length == 0 ? 0 : c21064.get(0);
            int i3 = ((length == 0 ? 0 : c21064.get(length - 1)) - i2) + 1;
            c18241.m42511(256);
            c18241.m42511(i3);
            c18241.m42514(i2);
            int i4 = 0;
            while (i < i3) {
                if (c21064.get(i4) > i2 + i) {
                    iM13990 = iMo7129;
                } else {
                    iM13990 = c15375Arr[i4].m13990() - iM13991;
                    i4++;
                }
                c18241.m42514(iM13990);
                i++;
            }
            return;
        }
        c18241.m42511(512);
        c18241.m42511(length);
        for (int i5 = 0; i5 < length; i5++) {
            c18241.m42514(c21064.get(i5));
        }
        while (i < length) {
            c18241.m42514(c15375Arr[i].m13990() - iM13991);
            i++;
        }
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4793 mo2081(C20069 c20069) {
        return new C0475(m13983(), this.f2057, this.f2059, this.f2060);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m2083() {
        return this.f2058;
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo2080() {
        StringBuilder sb = new StringBuilder(100);
        C15375[] c15375Arr = this.f2060;
        int length = c15375Arr.length;
        for (int i = 0; i < length; i++) {
            sb.append("\n    ");
            sb.append(this.f2059.get(i));
            sb.append(": ");
            sb.append(c15375Arr[i]);
        }
        return sb.toString();
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String mo2085() {
        int iM13990 = this.f2057.m13990();
        StringBuilder sb = new StringBuilder(100);
        C15375[] c15375Arr = this.f2060;
        int length = c15375Arr.length;
        sb.append(this.f2058 ? "packed" : "sparse");
        sb.append("-switch-payload // for switch @ ");
        sb.append(C14712.m35006(iM13990));
        for (int i = 0; i < length; i++) {
            int iM13991 = c15375Arr[i].m13990();
            sb.append("\n  ");
            sb.append(this.f2059.get(i));
            sb.append(": ");
            sb.append(C14712.m35008(iM13991));
            sb.append(" // ");
            sb.append(C14712.m35003(iM13991 - iM13990));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m2079(C21064 c21064) {
        long j = (((((long) c21064.get(c21064.size() - 1)) - ((long) c21064.get(0))) + 1) * 2) + 4;
        if (j <= 2147483647L) {
            return j;
        }
        return -1L;
    }
}
