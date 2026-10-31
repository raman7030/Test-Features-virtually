package l;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: renamed from: l.ᩴۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 63JU */
/* JADX INFO: loaded from: classes5.dex */
public class C18490 extends AbstractC7488 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC2262 f57319;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC2262 f57320;

    @Override // l.AbstractC7488
    public final int[] calculateDistanceToFinalSnap(AbstractC17366 abstractC17366, View view) {
        int[] iArr = new int[2];
        if (abstractC17366.canScrollHorizontally()) {
            iArr[0] = m42984(view, m42986(abstractC17366));
        } else {
            iArr[0] = 0;
        }
        if (abstractC17366.canScrollVertically()) {
            iArr[1] = m42984(view, m42987(abstractC17366));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // l.AbstractC7488
    public View findSnapView(AbstractC17366 abstractC17366) {
        if (abstractC17366.canScrollVertically()) {
            return m42985(abstractC17366, m42987(abstractC17366));
        }
        if (abstractC17366.canScrollHorizontally()) {
            return m42985(abstractC17366, m42986(abstractC17366));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC7488
    public final int findTargetSnapPosition(AbstractC17366 abstractC17366, int i, int i2) {
        AbstractC2262 abstractC2262M42986;
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = abstractC17366.getItemCount();
        if (itemCount != 0) {
            View view = null;
            if (abstractC17366.canScrollVertically()) {
                abstractC2262M42986 = m42987(abstractC17366);
            } else {
                abstractC2262M42986 = abstractC17366.canScrollHorizontally() ? m42986(abstractC17366) : null;
            }
            if (abstractC2262M42986 != null) {
                int childCount = abstractC17366.getChildCount();
                boolean z = false;
                View view2 = null;
                int i3 = Integer.MIN_VALUE;
                int i4 = Integer.MAX_VALUE;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = abstractC17366.getChildAt(i5);
                    if (childAt != null) {
                        int iM42984 = m42984(childAt, abstractC2262M42986);
                        if (iM42984 <= 0 && iM42984 > i3) {
                            view2 = childAt;
                            i3 = iM42984;
                        }
                        if (iM42984 >= 0 && iM42984 < i4) {
                            view = childAt;
                            i4 = iM42984;
                        }
                    }
                }
                boolean z2 = !abstractC17366.canScrollHorizontally() ? i2 <= 0 : i <= 0;
                if (z2 && view != null) {
                    return abstractC17366.getPosition(view);
                }
                if (!z2 && view2 != null) {
                    return abstractC17366.getPosition(view2);
                }
                if (z2) {
                    view = view2;
                }
                if (view != null) {
                    int position = abstractC17366.getPosition(view);
                    int itemCount2 = abstractC17366.getItemCount();
                    if ((abstractC17366 instanceof InterfaceC8194) && (pointFComputeScrollVectorForPosition = ((InterfaceC8194) abstractC17366).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f)) {
                        z = true;
                    }
                    int i6 = position + (z == z2 ? -1 : 1);
                    if (i6 >= 0 && i6 < itemCount) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    @Override // l.AbstractC7488
    public final AbstractC15248 createScroller(AbstractC17366 abstractC17366) {
        if (abstractC17366 instanceof InterfaceC8194) {
            return new C3673(this, this.mRecyclerView.getContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m42984(View view, AbstractC2262 abstractC2262) {
        return ((abstractC2262.mo7477(view) / 2) + abstractC2262.mo7485(view)) - ((abstractC2262.mo7487() / 2) + abstractC2262.mo7478());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static View m42985(AbstractC17366 abstractC17366, AbstractC2262 abstractC2262) {
        int childCount = abstractC17366.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iMo7487 = (abstractC2262.mo7487() / 2) + abstractC2262.mo7478();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = abstractC17366.getChildAt(i2);
            int iAbs = Math.abs(((abstractC2262.mo7477(childAt) / 2) + abstractC2262.mo7485(childAt)) - iMo7487);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private AbstractC2262 m42987(AbstractC17366 abstractC17366) {
        AbstractC2262 abstractC2262 = this.f57320;
        if (abstractC2262 == null || abstractC2262.f7349 != abstractC17366) {
            this.f57320 = new C15666(abstractC17366);
        }
        return this.f57320;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC2262 m42986(AbstractC17366 abstractC17366) {
        AbstractC2262 abstractC2262 = this.f57319;
        if (abstractC2262 == null || abstractC2262.f7349 != abstractC17366) {
            this.f57319 = new C8612(abstractC17366);
        }
        return this.f57319;
    }
}
