package l;

/* JADX INFO: renamed from: l.ۘܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6N4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4048 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13035 f12857;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f12858;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 f12859;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13035 f12860;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f12861;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23097 f12862;

    public C4048(InterfaceC7785 interfaceC7785, C23097 c23097, int i, int i2, C13035 c13035, C13035 c13036) {
        this.f12859 = interfaceC7785;
        this.f12862 = c23097;
        this.f12858 = i;
        this.f12861 = i2;
        this.f12860 = c13035;
        this.f12857 = c13036;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12169(Object obj, C23097 c23097, int i, int i2) {
        return this.f12859 == obj && this.f12862 == c23097 && this.f12858 == i && this.f12861 == i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4048 m12167(C13035 c13035) {
        C13035 c13036;
        int i = c13035.f39036;
        int i2 = c13035.f39035;
        C13035 c13037 = this.f12860;
        int i3 = c13037.f39035;
        C9302 c9302 = c13037.f39034;
        int i4 = c13037.f39036;
        if (i > i3 || i4 > i2) {
            c13036 = c13035;
        } else {
            int iMax = Math.max(Math.min(i4, i), i2 - 65536);
            int iMin = (int) Math.min(Math.max(c13037.f39035, i2), ((long) iMax) + 65536);
            C9302 c9302M23878 = C9302.m23878();
            int i5 = c13035.f39036;
            if (iMax < i5) {
                c9302M23878 = c9302.m23886(iMax - i4, i5 - i4);
            }
            C9302 c9302M23882 = c9302M23878.m23882(c13035.f39034);
            if (iMin > i2) {
                c9302M23882 = c9302M23882.m23882(c9302.m23886(i2 - i4, iMin - i4));
            }
            c13036 = new C13035(iMax, c9302M23882);
        }
        return new C4048(this.f12859, this.f12862, this.f12858, this.f12861, c13036, c13035);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4048 m12166(C7185 c7185) {
        if (c7185 != null && c7185.m19250()) {
            C13035 c13035 = this.f12860;
            int i = c13035.f39036;
            int i2 = c13035.f39036;
            int iMax = Math.max(i, c7185.m19245());
            int iMin = Math.min(c13035.f39035, c7185.m19241());
            if (iMax < iMin) {
                C16356 c16356 = new C16356();
                C9302 c9302M19248 = c7185.m19248();
                int iM19245 = iMax - c7185.m19245();
                c9302M19248.getClass();
                C17768 c17768 = new C17768();
                c17768.m41620(c9302M19248);
                c17768.m41621(iM19245);
                do {
                    int iMax2 = Math.max(iMax, c17768.m41622() + c7185.m19245());
                    int iMin2 = Math.min(iMin, c17768.m41619() + c7185.m19245());
                    C21834 c21834M41624 = c17768.m41624();
                    c16356.m38503(iMin2 - iMax2, new C21834(null, c21834M41624.m49210(), 0, c21834M41624.m49212(), 0, 0), false);
                    if (iMin2 == iMin) {
                        break;
                    }
                } while (c17768.m41625());
                return new C4048(this.f12859, this.f12862, this.f12858, this.f12861, new C13035(i2, c13035.f39034.m23881(iMax - i2, iMin - i2, c16356.m38502())), this.f12857);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4048 m12168(InterfaceC20445 interfaceC20445, C23097 c23097, int i, int i2, int i3, int i4, int i5, C21834 c21834) {
        C9302 c9302M23868;
        if (!m12169(interfaceC20445, c23097, i - 1, (i2 - i5) + i4) || i3 < 0 || i4 < 0 || i5 < 0 || ((long) i3) + ((long) i4) > this.f12861) {
            return null;
        }
        int i6 = i3 + i4;
        int i7 = i5 - i4;
        C13035 c13035 = this.f12860;
        int iMin = c13035.f39036;
        C9302 c9302M23881 = c13035.f39034;
        if (i3 < iMin && i6 <= iMin) {
            iMin += i7;
        } else if (i3 < c13035.f39035) {
            int iMax = Math.max(0, i3 - iMin);
            int iMin2 = Math.min(c9302M23881.m23880(), i6 - iMin);
            C21834 c21834M23883 = i3 > iMin ? c9302M23881.m23883(iMax - 1) : c21834;
            if (i5 == 0) {
                c9302M23868 = C9302.m23878();
            } else {
                c9302M23868 = C9302.m23868(i5, new C21834(null, c21834M23883.m49210(), 0, c21834M23883.m49212(), 0, 0), false);
            }
            c9302M23881 = c9302M23881.m23881(iMax, Math.max(iMax, iMin2), c9302M23868);
            iMin = Math.min(iMin, i3);
            if (c9302M23881.m23880() == 0) {
                return null;
            }
            if (c9302M23881.m23880() > 65536) {
                c9302M23881 = c9302M23881.m23886(0, 65536);
            }
        }
        return new C4048(this.f12859, this.f12862, i, i2, new C13035(iMin, c9302M23881), null);
    }
}
