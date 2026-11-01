package p067l;

/* JADX INFO: renamed from: l.᩸۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22897 {

    /* JADX INFO: renamed from: ֫ */
    public int f72053;

    /* JADX INFO: renamed from: ۖ */
    public int f72054;

    /* JADX INFO: renamed from: ۘ */
    public boolean f72055;

    /* JADX INFO: renamed from: ۜ */
    public int f72056;

    /* JADX INFO: renamed from: ۡ */
    public boolean f72057;

    /* JADX INFO: renamed from: ۢ */
    public boolean f72058;

    /* JADX INFO: renamed from: ۧ */
    public long f72059;

    /* JADX INFO: renamed from: ܳ */
    public boolean f72060;

    /* JADX INFO: renamed from: ܺ */
    public boolean f72061;

    /* JADX INFO: renamed from: ܽ */
    public int f72062;

    /* JADX INFO: renamed from: ܿ */
    public boolean f72063;

    /* JADX INFO: renamed from: ᩳ */
    public int f72064;

    /* JADX INFO: renamed from: ᩷ */
    public int f72065;

    /* JADX INFO: renamed from: ᩻ */
    public int f72066;

    /* JADX INFO: renamed from: ֫ */
    public final void m51125(int i) {
        if ((this.f72056 & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f72056));
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m51124() {
        if (this.f72063) {
            return this.f72065 - this.f72053;
        }
        return this.f72066;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f72054 + ", mData=null, mItemCount=" + this.f72066 + ", mIsMeasuring=" + this.f72060 + ", mPreviousLayoutItemCount=" + this.f72065 + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f72053 + ", mStructureChanged=" + this.f72061 + ", mInPreLayout=" + this.f72063 + ", mRunSimpleAnimations=" + this.f72057 + ", mRunPredictiveAnimations=" + this.f72058 + '}';
    }
}
