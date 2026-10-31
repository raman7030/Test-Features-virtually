package l;

/* JADX INFO: renamed from: l.ۤۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VU */
/* JADX INFO: loaded from: classes3.dex */
public final class C10008 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 f30139;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17768 f30140 = new C17768();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f30141;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f30142;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f30143;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16356 f30144;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C9302 f30145;

    public C10008(C9302 c9302, C21834 c21834, int i) {
        this.f30145 = c9302;
        this.f30139 = c21834;
        this.f30142 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25176(int i, int i2, C21834 c21834) {
        int i3;
        int i4 = this.f30142;
        int iMax = Math.max(i, i4) - i4;
        int iMin = Math.min(i2 - i4, this.f30145.m23880());
        if (iMax >= iMin) {
            return;
        }
        if (this.f30144 != null && iMax < this.f30143) {
            m25174();
        }
        if (this.f30144 != null && iMax > (i3 = this.f30143)) {
            C9302 c9302 = this.f30145;
            C17768 c17768 = this.f30140;
            c17768.m41620(c9302);
            c17768.m41621(i3);
            if (c17768.m41619() < iMax) {
                m25174();
            } else {
                this.f30144.m38503(iMax - this.f30143, c17768.m41624(), c17768.m41626() && c17768.m41622() == this.f30143);
            }
            c17768.m41620(C9302.m23878());
        }
        if (this.f30144 == null) {
            this.f30144 = new C16356();
            this.f30141 = iMax;
        }
        this.f30144.m38503(iMin - iMax, c21834, iMax + i4 == i);
        this.f30143 = iMin;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12829 m25175(C5774 c5774) {
        boolean zIsEmpty = c5774.f17749.isEmpty();
        C21834 c21834 = this.f30139;
        if (zIsEmpty) {
            m25176(c5774.f17750, c5774.f17748, c21834);
            return null;
        }
        if (c5774.f17749.size() == 1) {
            C12124 c12124 = (C12124) c5774.f17749.get(0);
            if (c12124.f36212 == c5774.f17750 && c12124.f36211 == c5774.f17748) {
                m25176(c5774.f17750, c5774.f17748, c21834.m49203(c12124.f36213));
                return null;
            }
        }
        return new C12829(c5774, m25174(), c21834, this.f30142);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25177(C12829 c12829) {
        this.f30145 = c12829.m31206();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9302 m25174() {
        C16356 c16356 = this.f30144;
        if (c16356 != null) {
            this.f30145 = this.f30145.m23881(this.f30141, this.f30143, c16356.m38502());
            this.f30144 = null;
        }
        return this.f30145;
    }
}
