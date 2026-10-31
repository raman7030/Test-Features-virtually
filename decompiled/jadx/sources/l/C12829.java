package l;

import java.util.List;

/* JADX INFO: renamed from: l.۬ۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VU */
/* JADX INFO: loaded from: classes3.dex */
public final class C12829 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12124 f38524;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C9302 f38525;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C17768 f38526;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f38527;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21834 f38528;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f38529;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f38530 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5774 f38531;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16356 f38532;

    public C12829(C5774 c5774, C9302 c9302, C21834 c21834, int i) {
        this.f38531 = c5774;
        this.f38525 = c9302;
        this.f38528 = c21834;
        this.f38529 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m31205() {
        int i = this.f38530;
        C5774 c5774 = this.f38531;
        int i2 = this.f38529;
        if (i < 0) {
            int iMax = Math.max(c5774.f17750, i2) - i2;
            int iMin = Math.min(c5774.f17748 - i2, this.f38525.m23880());
            if (iMax < iMin) {
                this.f38525 = this.f38525.m23881(iMax, iMin, C9302.m23868(iMin - iMax, this.f38528, c5774.f17750 == i2 + iMax));
            }
            this.f38530 = 0;
            return false;
        }
        C12124 c12124 = this.f38524;
        if (c12124 == null) {
            if (i == c5774.f17749.size()) {
                return true;
            }
            List list = c5774.f17749;
            int i3 = this.f38530;
            this.f38530 = i3 + 1;
            C12124 c12125 = (C12124) list.get(i3);
            int iMax2 = Math.max(c12125.f36212, i2) - i2;
            int iMin2 = Math.min(c12125.f36211 - i2, this.f38525.m23880());
            if (iMax2 >= iMin2 || c12125.f36213 == C21834.f69949) {
                this.f38524 = null;
                return false;
            }
            C12124 c12126 = new C12124(iMax2, iMin2, c12125.f36213);
            this.f38524 = c12126;
            C9302 c9302 = this.f38525;
            int i4 = c12126.f36212;
            c9302.getClass();
            C17768 c17768 = new C17768();
            c17768.m41620(c9302);
            c17768.m41621(i4);
            this.f38526 = c17768;
            this.f38532 = new C16356();
            this.f38527 = this.f38524.f36212;
            return false;
        }
        int iMin3 = Math.min(c12124.f36211, this.f38526.m41619());
        this.f38532.m38503(iMin3 - this.f38527, this.f38526.m41624().m49203(this.f38524.f36213), this.f38526.m41626() && this.f38527 == this.f38526.m41622());
        this.f38527 = iMin3;
        if (iMin3 == this.f38524.f36211) {
            this.f38525 = this.f38525.m23881(this.f38524.f36212, this.f38524.f36211, this.f38532.m38502());
            this.f38524 = null;
            this.f38526 = null;
            this.f38532 = null;
            return false;
        }
        if (this.f38526.m41625()) {
            return false;
        }
        throw new IllegalStateException("Incomplete syntax style transaction coverage");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9302 m31206() {
        return this.f38525;
    }
}
