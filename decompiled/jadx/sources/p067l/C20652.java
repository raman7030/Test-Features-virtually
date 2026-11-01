package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5DS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20652 implements InterfaceC18202 {

    /* JADX INFO: renamed from: ֫ */
    public int f63782;

    /* JADX INFO: renamed from: ۧ */
    public int[] f63783;

    /* JADX INFO: renamed from: ܽ */
    public int f63784;

    /* JADX INFO: renamed from: ᩳ */
    public int f63785;

    /* JADX INFO: renamed from: ֫ */
    public final void m46668(C14849 c14849, boolean z) {
        this.f63782 = 0;
        int[] iArr = this.f63783;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC18873 abstractC18873 = c14849.mLayout;
        if (c14849.mAdapter == null || abstractC18873 == null || !abstractC18873.isItemPrefetchEnabled()) {
            return;
        }
        if (z) {
            if (!c14849.mAdapterHelper.m6943()) {
                abstractC18873.collectInitialPrefetchPositions(c14849.mAdapter.getItemCount(), this);
            }
        } else if (!c14849.hasPendingAdapterUpdates()) {
            abstractC18873.collectAdjacentPrefetchPositions(this.f63784, this.f63785, c14849.mState, this);
        }
        int i = this.f63782;
        if (i > abstractC18873.mPrefetchMaxCountObserved) {
            abstractC18873.mPrefetchMaxCountObserved = i;
            abstractC18873.mPrefetchMaxObservedInInitialPrefetch = z;
            c14849.mRecycler.m10110();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46667(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f63782;
        int i4 = i3 * 2;
        int[] iArr = this.f63783;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f63783 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f63783 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f63783;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f63782++;
    }
}
