package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5DS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19238 implements InterfaceC16660 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f60551;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f60552;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f60553;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f60554;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44374(C13132 c13132, boolean z) {
        this.f60551 = 0;
        int[] iArr = this.f60552;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC17366 abstractC17366 = c13132.mLayout;
        if (c13132.mAdapter == null || abstractC17366 == null || !abstractC17366.isItemPrefetchEnabled()) {
            return;
        }
        if (z) {
            if (!c13132.mAdapterHelper.m4711()) {
                abstractC17366.collectInitialPrefetchPositions(c13132.mAdapter.getItemCount(), this);
            }
        } else if (!c13132.hasPendingAdapterUpdates()) {
            abstractC17366.collectAdjacentPrefetchPositions(this.f60553, this.f60554, c13132.mState, this);
        }
        int i = this.f60551;
        if (i > abstractC17366.mPrefetchMaxCountObserved) {
            abstractC17366.mPrefetchMaxCountObserved = i;
            abstractC17366.mPrefetchMaxObservedInInitialPrefetch = z;
            c13132.mRecycler.m8079();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44373(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f60551;
        int i4 = i3 * 2;
        int[] iArr = this.f60552;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f60552 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f60552 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f60552;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f60551++;
    }
}
