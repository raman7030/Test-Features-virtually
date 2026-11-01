package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ܽۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4ND */
/* JADX INFO: loaded from: classes4.dex */
public final class C17928 {

    /* JADX INFO: renamed from: ֫ */
    public int f53536;

    /* JADX INFO: renamed from: ۧ */
    public boolean f53537;

    /* JADX INFO: renamed from: ܽ */
    public AbstractC4518 f53538;

    /* JADX INFO: renamed from: ܿ */
    public boolean f53539;

    /* JADX INFO: renamed from: ᩳ */
    public int f53540;

    public C17928() {
        m40753();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40753() {
        this.f53540 = -1;
        this.f53536 = Integer.MIN_VALUE;
        this.f53537 = false;
        this.f53539 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40751() {
        int iMo9560;
        if (this.f53537) {
            iMo9560 = this.f53538.mo9558();
        } else {
            iMo9560 = this.f53538.mo9560();
        }
        this.f53536 = iMo9560;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f53540 + ", mCoordinate=" + this.f53536 + ", mLayoutFromEnd=" + this.f53537 + ", mValid=" + this.f53539 + '}';
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40754(int i, View view) {
        int iM9557 = this.f53538.m9557();
        if (iM9557 >= 0) {
            m40752(i, view);
            return;
        }
        this.f53540 = i;
        if (this.f53537) {
            int iMo9558 = (this.f53538.mo9558() - iM9557) - this.f53538.mo9555(view);
            this.f53536 = this.f53538.mo9558() - iMo9558;
            if (iMo9558 > 0) {
                int iMo9559 = this.f53536 - this.f53538.mo9559(view);
                int iMo9560 = this.f53538.mo9560();
                int iMin = iMo9559 - (Math.min(this.f53538.mo9567(view) - iMo9560, 0) + iMo9560);
                if (iMin < 0) {
                    this.f53536 = Math.min(iMo9558, -iMin) + this.f53536;
                    return;
                }
                return;
            }
            return;
        }
        int iMo9567 = this.f53538.mo9567(view);
        int iMo9561 = iMo9567 - this.f53538.mo9560();
        this.f53536 = iMo9567;
        if (iMo9561 > 0) {
            int iMo95510 = (this.f53538.mo9558() - Math.min(0, (this.f53538.mo9558() - iM9557) - this.f53538.mo9555(view))) - (this.f53538.mo9559(view) + iMo9567);
            if (iMo95510 < 0) {
                this.f53536 -= Math.min(iMo9561, -iMo95510);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40752(int i, View view) {
        if (this.f53537) {
            this.f53536 = this.f53538.m9557() + this.f53538.mo9555(view);
        } else {
            this.f53536 = this.f53538.mo9567(view);
        }
        this.f53540 = i;
    }
}
