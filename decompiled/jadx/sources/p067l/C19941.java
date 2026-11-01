package p067l;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: renamed from: l.ᩴۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 63JU */
/* JADX INFO: loaded from: classes5.dex */
public class C19941 extends AbstractC9485 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC4518 f60538;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC4518 f60539;

    @Override // p067l.AbstractC9485
    public final int[] calculateDistanceToFinalSnap(AbstractC18873 abstractC18873, View view) {
        int[] iArr = new int[2];
        if (abstractC18873.canScrollHorizontally()) {
            iArr[0] = m45260(view, m45262(abstractC18873));
        } else {
            iArr[0] = 0;
        }
        if (abstractC18873.canScrollVertically()) {
            iArr[1] = m45260(view, m45263(abstractC18873));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // p067l.AbstractC9485
    public View findSnapView(AbstractC18873 abstractC18873) {
        if (abstractC18873.canScrollVertically()) {
            return m45261(abstractC18873, m45263(abstractC18873));
        }
        if (abstractC18873.canScrollHorizontally()) {
            return m45261(abstractC18873, m45262(abstractC18873));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC9485
    public final int findTargetSnapPosition(AbstractC18873 abstractC18873, int i, int i2) {
        AbstractC4518 abstractC4518M45262;
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = abstractC18873.getItemCount();
        if (itemCount != 0) {
            View view = null;
            if (abstractC18873.canScrollVertically()) {
                abstractC4518M45262 = m45263(abstractC18873);
            } else {
                abstractC4518M45262 = abstractC18873.canScrollHorizontally() ? m45262(abstractC18873) : null;
            }
            if (abstractC4518M45262 != null) {
                int childCount = abstractC18873.getChildCount();
                boolean z = false;
                View view2 = null;
                int i3 = Integer.MIN_VALUE;
                int i4 = Integer.MAX_VALUE;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = abstractC18873.getChildAt(i5);
                    if (childAt != null) {
                        int iM45260 = m45260(childAt, abstractC4518M45262);
                        if (iM45260 <= 0 && iM45260 > i3) {
                            view2 = childAt;
                            i3 = iM45260;
                        }
                        if (iM45260 >= 0 && iM45260 < i4) {
                            view = childAt;
                            i4 = iM45260;
                        }
                    }
                }
                boolean z2 = !abstractC18873.canScrollHorizontally() ? i2 <= 0 : i <= 0;
                if (z2 && view != null) {
                    return abstractC18873.getPosition(view);
                }
                if (!z2 && view2 != null) {
                    return abstractC18873.getPosition(view2);
                }
                if (z2) {
                    view = view2;
                }
                if (view != null) {
                    int position = abstractC18873.getPosition(view);
                    int itemCount2 = abstractC18873.getItemCount();
                    if ((abstractC18873 instanceof InterfaceC10156) && (pointFComputeScrollVectorForPosition = ((InterfaceC10156) abstractC18873).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f)) {
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

    @Override // p067l.AbstractC9485
    public final AbstractC16860 createScroller(AbstractC18873 abstractC18873) {
        if (abstractC18873 instanceof InterfaceC10156) {
            return new C5859(this, this.mRecyclerView.getContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m45260(View view, AbstractC4518 abstractC4518) {
        return ((abstractC4518.mo9559(view) / 2) + abstractC4518.mo9567(view)) - ((abstractC4518.mo9569() / 2) + abstractC4518.mo9560());
    }

    /* JADX INFO: renamed from: ֫ */
    public static View m45261(AbstractC18873 abstractC18873, AbstractC4518 abstractC4518) {
        int childCount = abstractC18873.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iMo9569 = (abstractC4518.mo9569() / 2) + abstractC4518.mo9560();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = abstractC18873.getChildAt(i2);
            int iAbs = Math.abs(((abstractC4518.mo9559(childAt) / 2) + abstractC4518.mo9567(childAt)) - iMo9569);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: ۧ */
    private AbstractC4518 m45263(AbstractC18873 abstractC18873) {
        AbstractC4518 abstractC4518 = this.f60539;
        if (abstractC4518 == null || abstractC4518.f10137 != abstractC18873) {
            this.f60539 = new C17257(abstractC18873);
        }
        return this.f60539;
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC4518 m45262(AbstractC18873 abstractC18873) {
        AbstractC4518 abstractC4518 = this.f60538;
        if (abstractC4518 == null || abstractC4518.f10137 != abstractC18873) {
            this.f60538 = new C10553(abstractC18873);
        }
        return this.f60538;
    }
}
