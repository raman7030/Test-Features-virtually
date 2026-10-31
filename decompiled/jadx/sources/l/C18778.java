package l;

/* JADX INFO: renamed from: l.ᩴ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18778 extends AbstractC2968 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13132 f59287;

    public C18778(C13132 c13132) {
        this.f59287 = c13132;
    }

    @Override // l.AbstractC2968
    public final void onChanged() {
        C13132 c13132 = this.f59287;
        c13132.assertNotInLayoutOrScroll(null);
        c13132.mState.f69357 = true;
        c13132.processDataSetCompletelyChanged(true);
        if (c13132.mAdapterHelper.m4711()) {
            return;
        }
        c13132.requestLayout();
    }

    @Override // l.AbstractC2968
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        C13132 c13132 = this.f59287;
        c13132.assertNotInLayoutOrScroll(null);
        if (c13132.mAdapterHelper.m4708(i, i2, obj)) {
            m43435();
        }
    }

    @Override // l.AbstractC2968
    public final void onItemRangeInserted(int i, int i2) {
        C13132 c13132 = this.f59287;
        c13132.assertNotInLayoutOrScroll(null);
        if (c13132.mAdapterHelper.m4710(i, i2)) {
            m43435();
        }
    }

    @Override // l.AbstractC2968
    public final void onItemRangeRemoved(int i, int i2) {
        C13132 c13132 = this.f59287;
        c13132.assertNotInLayoutOrScroll(null);
        if (c13132.mAdapterHelper.m4712(i, i2)) {
            m43435();
        }
    }

    @Override // l.AbstractC2968
    public final void onItemRangeMoved(int i, int i2, int i3) {
        C13132 c13132 = this.f59287;
        c13132.assertNotInLayoutOrScroll(null);
        if (c13132.mAdapterHelper.m4707(i, i2, i3)) {
            m43435();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43435() {
        boolean z = C13132.POST_UPDATES_ON_ANIMATION;
        C13132 c13132 = this.f59287;
        if (z && c13132.mHasFixedSize && c13132.mIsAttached) {
            Runnable runnable = c13132.mUpdateChildViewsRunnable;
            int i = C17648.f53953;
            c13132.postOnAnimation(runnable);
        } else {
            c13132.mAdapterUpdateDuringMeasure = true;
            c13132.requestLayout();
        }
    }

    @Override // l.AbstractC2968
    public final void onStateRestorationPolicyChanged() {
        AbstractC19902 abstractC19902;
        C13132 c13132 = this.f59287;
        if (c13132.mPendingSavedState == null || (abstractC19902 = c13132.mAdapter) == null || !abstractC19902.canRestoreState()) {
            return;
        }
        c13132.requestLayout();
    }
}
