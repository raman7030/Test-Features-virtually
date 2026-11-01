package p067l;

/* JADX INFO: renamed from: l.ᩴ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20215 extends AbstractC5189 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C14849 f62509;

    public C20215(C14849 c14849) {
        this.f62509 = c14849;
    }

    @Override // p067l.AbstractC5189
    public final void onChanged() {
        C14849 c14849 = this.f62509;
        c14849.assertNotInLayoutOrScroll(null);
        c14849.mState.f72061 = true;
        c14849.processDataSetCompletelyChanged(true);
        if (c14849.mAdapterHelper.m6943()) {
            return;
        }
        c14849.requestLayout();
    }

    @Override // p067l.AbstractC5189
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        C14849 c14849 = this.f62509;
        c14849.assertNotInLayoutOrScroll(null);
        if (c14849.mAdapterHelper.m6940(i, i2, obj)) {
            m45703();
        }
    }

    @Override // p067l.AbstractC5189
    public final void onItemRangeInserted(int i, int i2) {
        C14849 c14849 = this.f62509;
        c14849.assertNotInLayoutOrScroll(null);
        if (c14849.mAdapterHelper.m6942(i, i2)) {
            m45703();
        }
    }

    @Override // p067l.AbstractC5189
    public final void onItemRangeRemoved(int i, int i2) {
        C14849 c14849 = this.f62509;
        c14849.assertNotInLayoutOrScroll(null);
        if (c14849.mAdapterHelper.m6944(i, i2)) {
            m45703();
        }
    }

    @Override // p067l.AbstractC5189
    public final void onItemRangeMoved(int i, int i2, int i3) {
        C14849 c14849 = this.f62509;
        c14849.assertNotInLayoutOrScroll(null);
        if (c14849.mAdapterHelper.m6939(i, i2, i3)) {
            m45703();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45703() {
        boolean z = C14849.POST_UPDATES_ON_ANIMATION;
        C14849 c14849 = this.f62509;
        if (z && c14849.mHasFixedSize && c14849.mIsAttached) {
            Runnable runnable = c14849.mUpdateChildViewsRunnable;
            int i = C1717.f57146;
            c14849.postOnAnimation(runnable);
        } else {
            c14849.mAdapterUpdateDuringMeasure = true;
            c14849.requestLayout();
        }
    }

    @Override // p067l.AbstractC5189
    public final void onStateRestorationPolicyChanged() {
        AbstractC21283 abstractC21283;
        C14849 c14849 = this.f62509;
        if (c14849.mPendingSavedState == null || (abstractC21283 = c14849.mAdapter) == null || !abstractC21283.canRestoreState()) {
            return;
        }
        c14849.requestLayout();
    }
}
