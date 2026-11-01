package p067l;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܿ᩸ */
/* JADX INFO: compiled from: Z1JV */
/* JADX INFO: loaded from: classes4.dex */
public class C1715 extends ViewGroup {
    public static final boolean DEBUG = false;
    public static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    public static final boolean MEASURE = false;
    public static final String TAG = "ConstraintLayout";
    public static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.0.4";
    public SparseArray mChildrenByIds;
    public ArrayList mConstraintHelpers;
    public C1190 mConstraintLayoutSpec;
    public C1050 mConstraintSet;
    public int mConstraintSetId;
    public AbstractC0875 mConstraintsChangedListener;
    public HashMap mDesignIds;
    public boolean mDirtyHierarchy;
    public int mLastMeasureHeight;
    public int mLastMeasureHeightMode;
    public int mLastMeasureHeightSize;
    public int mLastMeasureWidth;
    public int mLastMeasureWidthMode;
    public int mLastMeasureWidthSize;
    public C1906 mLayoutWidget;
    public int mMaxHeight;
    public int mMaxWidth;
    public C1750 mMeasurer;
    public C1556 mMetrics;
    public int mMinHeight;
    public int mMinWidth;
    public int mOnMeasureHeightMeasureSpec;
    public int mOnMeasureWidthMeasureSpec;
    public int mOptimizationLevel;
    public SparseArray mTempMapIdToWidget;

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.mDesignIds.put(strSubstring, (Integer) obj2);
        }
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public C1715(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C1906();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new C1750(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m43398(null, 0, 0);
    }

    public C1715(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C1906();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new C1750(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m43398(attributeSet, 0, 0);
    }

    public C1715(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C1906();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new C1750(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m43398(attributeSet, i, 0);
    }

    @TargetApi(21)
    public C1715(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C1906();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray();
        this.mMeasurer = new C1750(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m43398(attributeSet, i, i2);
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m43398(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.m37870(this);
        this.mLayoutWidget.m50904(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1925.f72689, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 9) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 10) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 7) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 8) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 90) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 39) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C1050 c1050 = new C1050();
                        this.mConstraintSet = c1050;
                        c1050.m14547(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.m50909(this.mOptimizationLevel);
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new C1190(getContext(), this, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C1591 viewWidget = getViewWidget(view);
        if ((view instanceof C0910) && !(viewWidget instanceof C0996)) {
            C1680 c1680 = (C1680) view.getLayoutParams();
            C0996 c0996 = new C0996();
            c1680.f55082 = c0996;
            c1680.f55092 = true;
            c0996.m11505(c1680.f55121);
        }
        if (view instanceof AbstractC1216) {
            AbstractC1216 abstractC1216 = (AbstractC1216) view;
            abstractC1216.m22212();
            ((C1680) view.getLayoutParams()).f55081 = true;
            if (!this.mConstraintHelpers.contains(abstractC1216)) {
                this.mConstraintHelpers.add(abstractC1216);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        C1591 viewWidget = getViewWidget(view);
        this.mLayoutWidget.f21023.remove(viewWidget);
        viewWidget.mo18537();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m43402() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
        }
        if (z) {
            m43401();
        }
        return z;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m43401() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C1591 viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.mo18537();
            }
        }
        if (zIsInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    m43397(childAt.getId()).m37871(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof C1820)) {
                    C1820 c1820 = (C1820) childAt2;
                    if (c1820.f66376 == null) {
                        c1820.f66376 = new C1050();
                    }
                    c1820.f66376.m14553(c1820);
                    this.mConstraintSet = c1820.f66376;
                }
            }
        }
        C1050 c1050 = this.mConstraintSet;
        if (c1050 != null) {
            c1050.m14558(this);
        }
        this.mLayoutWidget.f21023.clear();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ((AbstractC1216) this.mConstraintHelpers.get(i4)).m22214(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof C1260) {
                ((C1260) childAt3).m24085(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            C1591 viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                C1680 c1680 = (C1680) childAt5.getLayoutParams();
                C1906 c1906 = this.mLayoutWidget;
                c1906.f21023.add(viewWidget2);
                C1591 c1591 = viewWidget2.f49252;
                if (c1591 != null) {
                    ((C1136) c1591).f21023.remove(viewWidget2);
                    viewWidget2.mo18537();
                }
                viewWidget2.f49252 = c1906;
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, c1680, this.mTempMapIdToWidget);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:52:0x0103  */
    /* JADX WARN: Code duplicated, block: B:59:0x0121  */
    /* JADX WARN: Code duplicated, block: B:61:0x012a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0138  */
    /* JADX WARN: Code duplicated, block: B:69:0x0155  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01af  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public void applyConstraintsFromLayoutParams(boolean z, View view, C1591 c1591, C1680 c1680, SparseArray sparseArray) {
        float f;
        C1591 c1592;
        boolean z2;
        boolean z3;
        C1591 c1593;
        int i;
        int i2;
        C1591 c1594;
        int i3;
        int i4;
        C1591 c1595;
        int i5;
        float f2;
        ?? r2;
        float f3;
        View view2;
        C1591 c1596;
        C1591 c1597;
        C1591 c1598;
        C1591 c1599;
        int i6;
        c1680.m42001();
        c1591.m37926(view.getVisibility());
        if (c1680.f55096) {
            c1591.m37917();
            c1591.m37926(8);
        }
        c1591.m37870(view);
        if (view instanceof AbstractC1216) {
            ((AbstractC1216) view).mo18972(c1591, this.mLayoutWidget.m50915());
        }
        if (c1680.f55092) {
            C0996 c0996 = (C0996) c1591;
            int i7 = c1680.f55107;
            int i8 = c1680.f55072;
            float f4 = c1680.f55076;
            if (f4 != -1.0f) {
                c0996.m11503(f4);
                return;
            } else if (i7 != -1) {
                c0996.m11498(i7);
                return;
            } else {
                if (i8 != -1) {
                    c0996.m11502(i8);
                    return;
                }
                return;
            }
        }
        int i9 = c1680.f55117;
        int i10 = c1680.f55066;
        int i11 = c1680.f55080;
        int i12 = c1680.f55068;
        int i13 = c1680.f55091;
        int i14 = c1680.f55089;
        float f5 = c1680.f55115;
        int i15 = c1680.f55110;
        if (i15 != -1) {
            C1591 c15910 = (C1591) sparseArray.get(i15);
            if (c15910 != null) {
                c1591.m37876(c15910, c1680.f55112, c1680.f55102);
            }
            f3 = 0.0f;
            r2 = 1;
        } else {
            if (i9 != -1) {
                C1591 c15911 = (C1591) sparseArray.get(i9);
                if (c15911 != null) {
                    EnumC0856 enumC0856 = EnumC0856.LEFT;
                    f = 0.0f;
                    c1591.m37873(enumC0856, c15911, enumC0856, ((ViewGroup.MarginLayoutParams) c1680).leftMargin, i13);
                } else {
                    z2 = true;
                    f = 0.0f;
                }
                if (i11 != -1) {
                    c1599 = (C1591) sparseArray.get(i11);
                    if (c1599 != null) {
                        z3 = z2;
                        c1591.m37873(EnumC0856.RIGHT, c1599, EnumC0856.LEFT, ((ViewGroup.MarginLayoutParams) c1680).rightMargin, i14);
                    } else {
                        z3 = z2;
                    }
                } else {
                    z3 = z2;
                    if (i12 != -1 && (c1593 = (C1591) sparseArray.get(i12)) != null) {
                        EnumC0856 enumC0857 = EnumC0856.RIGHT;
                        c1591.m37873(enumC0857, c1593, enumC0857, ((ViewGroup.MarginLayoutParams) c1680).rightMargin, i14);
                    }
                }
                i = c1680.f55078;
                if (i != -1) {
                    c1598 = (C1591) sparseArray.get(i);
                    if (c1598 != null) {
                        EnumC0856 enumC0858 = EnumC0856.TOP;
                        c1591.m37873(enumC0858, c1598, enumC0858, ((ViewGroup.MarginLayoutParams) c1680).topMargin, c1680.f55104);
                    }
                } else {
                    i2 = c1680.f55119;
                    if (i2 != -1 && (c1594 = (C1591) sparseArray.get(i2)) != null) {
                        c1591.m37873(EnumC0856.TOP, c1594, EnumC0856.BOTTOM, ((ViewGroup.MarginLayoutParams) c1680).topMargin, c1680.f55104);
                    }
                }
                i3 = c1680.f55108;
                if (i3 != -1) {
                    c1597 = (C1591) sparseArray.get(i3);
                    if (c1597 != null) {
                        c1591.m37873(EnumC0856.BOTTOM, c1597, EnumC0856.TOP, ((ViewGroup.MarginLayoutParams) c1680).bottomMargin, c1680.f55116);
                    }
                } else {
                    i4 = c1680.f55094;
                    if (i4 != -1 && (c1595 = (C1591) sparseArray.get(i4)) != null) {
                        EnumC0856 enumC0859 = EnumC0856.BOTTOM;
                        c1591.m37873(enumC0859, c1595, enumC0859, ((ViewGroup.MarginLayoutParams) c1680).bottomMargin, c1680.f55116);
                    }
                }
                i5 = c1680.f55069;
                if (i5 != -1) {
                    view2 = (View) this.mChildrenByIds.get(i5);
                    c1596 = (C1591) sparseArray.get(c1680.f55069);
                    if (c1596 != null && view2 != null && (view2.getLayoutParams() instanceof C1680)) {
                        C1680 c1681 = (C1680) view2.getLayoutParams();
                        c1680.f55084 = z3;
                        c1681.f55084 = z3;
                        EnumC0856 enumC08510 = EnumC0856.BASELINE;
                        c1591.mo11496(enumC08510).m16910(c1596.mo11496(enumC08510), 0, -1, z3);
                        c1591.m37879(z3);
                        c1681.f55082.m37879(z3);
                        c1591.mo11496(EnumC0856.TOP).m16913();
                        c1591.mo11496(EnumC0856.BOTTOM).m16913();
                    }
                }
                if (f5 >= f) {
                    c1591.m37867(f5);
                }
                f2 = c1680.f55074;
                if (f2 >= f) {
                    c1591.m37901(f2);
                }
                r2 = z3;
                f3 = f;
            } else {
                f = 0.0f;
                if (i10 != -1 && (c1592 = (C1591) sparseArray.get(i10)) != null) {
                    c1591.m37873(EnumC0856.LEFT, c1592, EnumC0856.RIGHT, ((ViewGroup.MarginLayoutParams) c1680).leftMargin, i13);
                }
            }
            z2 = true;
            if (i11 != -1) {
                c1599 = (C1591) sparseArray.get(i11);
                if (c1599 != null) {
                    z3 = z2;
                    c1591.m37873(EnumC0856.RIGHT, c1599, EnumC0856.LEFT, ((ViewGroup.MarginLayoutParams) c1680).rightMargin, i14);
                } else {
                    z3 = z2;
                }
            } else {
                z3 = z2;
                if (i12 != -1) {
                    EnumC0856 enumC08511 = EnumC0856.RIGHT;
                    c1591.m37873(enumC08511, c1593, enumC08511, ((ViewGroup.MarginLayoutParams) c1680).rightMargin, i14);
                }
            }
            i = c1680.f55078;
            if (i != -1) {
                c1598 = (C1591) sparseArray.get(i);
                if (c1598 != null) {
                    EnumC0856 enumC08512 = EnumC0856.TOP;
                    c1591.m37873(enumC08512, c1598, enumC08512, ((ViewGroup.MarginLayoutParams) c1680).topMargin, c1680.f55104);
                }
            } else {
                i2 = c1680.f55119;
                if (i2 != -1) {
                    c1591.m37873(EnumC0856.TOP, c1594, EnumC0856.BOTTOM, ((ViewGroup.MarginLayoutParams) c1680).topMargin, c1680.f55104);
                }
            }
            i3 = c1680.f55108;
            if (i3 != -1) {
                c1597 = (C1591) sparseArray.get(i3);
                if (c1597 != null) {
                    c1591.m37873(EnumC0856.BOTTOM, c1597, EnumC0856.TOP, ((ViewGroup.MarginLayoutParams) c1680).bottomMargin, c1680.f55116);
                }
            } else {
                i4 = c1680.f55094;
                if (i4 != -1) {
                    EnumC0856 enumC08513 = EnumC0856.BOTTOM;
                    c1591.m37873(enumC08513, c1595, enumC08513, ((ViewGroup.MarginLayoutParams) c1680).bottomMargin, c1680.f55116);
                }
            }
            i5 = c1680.f55069;
            if (i5 != -1) {
                view2 = (View) this.mChildrenByIds.get(i5);
                c1596 = (C1591) sparseArray.get(c1680.f55069);
                if (c1596 != null) {
                    C1680 c1682 = (C1680) view2.getLayoutParams();
                    c1680.f55084 = z3;
                    c1682.f55084 = z3;
                    EnumC0856 enumC08514 = EnumC0856.BASELINE;
                    c1591.mo11496(enumC08514).m16910(c1596.mo11496(enumC08514), 0, -1, z3);
                    c1591.m37879(z3);
                    c1682.f55082.m37879(z3);
                    c1591.mo11496(EnumC0856.TOP).m16913();
                    c1591.mo11496(EnumC0856.BOTTOM).m16913();
                }
            }
            if (f5 >= f) {
                c1591.m37867(f5);
            }
            f2 = c1680.f55074;
            if (f2 >= f) {
                c1591.m37901(f2);
            }
            r2 = z3;
            f3 = f;
        }
        if (z && ((i6 = c1680.f55106) != -1 || c1680.f55071 != -1)) {
            c1591.m37923(i6, c1680.f55071);
        }
        if (!c1680.f55099) {
            if (((ViewGroup.MarginLayoutParams) c1680).width == -1) {
                if (c1680.f55083) {
                    c1591.m37875(EnumC1241.MATCH_CONSTRAINT);
                } else {
                    c1591.m37875(EnumC1241.MATCH_PARENT);
                }
                c1591.mo11496(EnumC0856.LEFT).f19183 = ((ViewGroup.MarginLayoutParams) c1680).leftMargin;
                c1591.mo11496(EnumC0856.RIGHT).f19183 = ((ViewGroup.MarginLayoutParams) c1680).rightMargin;
            } else {
                c1591.m37875(EnumC1241.MATCH_CONSTRAINT);
                c1591.m37928(0);
            }
        } else {
            c1591.m37875(EnumC1241.FIXED);
            c1591.m37928(((ViewGroup.MarginLayoutParams) c1680).width);
            if (((ViewGroup.MarginLayoutParams) c1680).width == -2) {
                c1591.m37875(EnumC1241.WRAP_CONTENT);
            }
        }
        if (!c1680.f55098) {
            if (((ViewGroup.MarginLayoutParams) c1680).height == -1) {
                if (c1680.f55127) {
                    c1591.m37904(EnumC1241.MATCH_CONSTRAINT);
                } else {
                    c1591.m37904(EnumC1241.MATCH_PARENT);
                }
                c1591.mo11496(EnumC0856.TOP).f19183 = ((ViewGroup.MarginLayoutParams) c1680).topMargin;
                c1591.mo11496(EnumC0856.BOTTOM).f19183 = ((ViewGroup.MarginLayoutParams) c1680).bottomMargin;
            } else {
                c1591.m37904(EnumC1241.MATCH_CONSTRAINT);
                c1591.m37891(0);
            }
        } else {
            c1591.m37904(EnumC1241.FIXED);
            c1591.m37891(((ViewGroup.MarginLayoutParams) c1680).height);
            if (((ViewGroup.MarginLayoutParams) c1680).height == -2) {
                c1591.m37904(EnumC1241.WRAP_CONTENT);
            }
        }
        c1591.m37903(c1680.f55090);
        float f6 = c1680.f55097;
        float[] fArr = c1591.f49287;
        fArr[0] = f6;
        fArr[r2] = c1680.f55093;
        c1591.m37931(c1680.f55073);
        c1591.m37886(c1680.f55100);
        int i16 = c1680.f55070;
        int i17 = c1680.f55111;
        int i18 = c1680.f55109;
        float f7 = c1680.f55128;
        c1591.f49265 = i16;
        c1591.f49273 = i17;
        if (i18 == Integer.MAX_VALUE) {
            i18 = 0;
        }
        c1591.f49233 = i18;
        c1591.f49275 = f7;
        if (f7 > f3 && f7 < 1.0f && i16 == 0) {
            c1591.f49265 = 2;
        }
        int i19 = c1680.f55085;
        int i20 = c1680.f55113;
        int i21 = c1680.f55095;
        float f8 = c1680.f55103;
        c1591.f49290 = i19;
        c1591.f49258 = i20;
        c1591.f49248 = i21 != Integer.MAX_VALUE ? i21 : 0;
        c1591.f49277 = f8;
        if (f8 <= f3 || f8 >= 1.0f || i19 != 0) {
            return;
        }
        c1591.f49290 = 2;
    }

    /* JADX INFO: renamed from: ֫ */
    private final C1591 m43397(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View viewFindViewById = (View) this.mChildrenByIds.get(i);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((C1680) viewFindViewById.getLayoutParams()).f55082;
    }

    public final C1591 getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((C1680) view.getLayoutParams()).f55082;
    }

    public void fillMetrics(C1556 c1556) {
        this.mLayoutWidget.m50918();
    }

    public void resolveSystem(C1906 c1906, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i4 = iMax + iMax2;
        int iM43395 = m43395();
        C1750 c1750 = this.mMeasurer;
        c1750.f60151 = iMax;
        c1750.f60154 = iMax2;
        c1750.f60155 = iM43395;
        c1750.f60153 = i4;
        c1750.f60152 = i2;
        c1750.f60150 = i3;
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (isRtl()) {
                iMax3 = iMax4;
            }
        } else {
            iMax3 = Math.max(0, getPaddingLeft());
        }
        int i5 = size - iM43395;
        int i6 = size2 - i4;
        setSelfDimensionBehaviour(c1906, mode, i5, mode2, i6);
        c1906.m50902(i, mode, i5, mode2, i6, iMax3, iMax);
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C1750 c1750 = this.mMeasurer;
        int i5 = c1750.f60153;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + c1750.f60155, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (getChildAt(i3).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
            }
        }
        if (!this.mDirtyHierarchy) {
            int i4 = this.mOnMeasureWidthMeasureSpec;
            if (i4 == i && this.mOnMeasureHeightMeasureSpec == i2) {
                resolveMeasuredDimension(i, i2, this.mLayoutWidget.m37911(), this.mLayoutWidget.m37890(), this.mLayoutWidget.m50906(), this.mLayoutWidget.m50910());
                return;
            }
            if (i4 == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.mOnMeasureHeightMeasureSpec) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= this.mLayoutWidget.m37890()) {
                this.mOnMeasureWidthMeasureSpec = i;
                this.mOnMeasureHeightMeasureSpec = i2;
                resolveMeasuredDimension(i, i2, this.mLayoutWidget.m37911(), this.mLayoutWidget.m37890(), this.mLayoutWidget.m50906(), this.mLayoutWidget.m50910());
                return;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.m50914(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (m43402()) {
                this.mLayoutWidget.m50907();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.m37911(), this.mLayoutWidget.m37890(), this.mLayoutWidget.m50906(), this.mLayoutWidget.m50910());
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    /* JADX INFO: renamed from: ֫ */
    private int m43395() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0053 A[PHI: r2
      0x0053: PHI (r2v4 l.۠۠) = (r2v3 l.۠۠), (r2v0 l.۠۠) binds: [B:21:0x004a, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    public void setSelfDimensionBehaviour(C1906 c1906, int i, int i2, int i3, int i4) {
        EnumC1241 enumC1241;
        C1750 c1750 = this.mMeasurer;
        int i5 = c1750.f60153;
        int i6 = c1750.f60155;
        EnumC1241 enumC1242 = EnumC1241.FIXED;
        int childCount = getChildCount();
        if (i == Integer.MIN_VALUE) {
            enumC1241 = EnumC1241.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        } else if (i == 0) {
            enumC1241 = EnumC1241.WRAP_CONTENT;
            i2 = childCount == 0 ? Math.max(0, this.mMinWidth) : 0;
        } else if (i != 1073741824) {
            enumC1241 = enumC1242;
        } else {
            i2 = Math.min(this.mMaxWidth - i6, i2);
            enumC1241 = enumC1242;
        }
        if (i3 == Integer.MIN_VALUE) {
            enumC1242 = EnumC1241.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        } else if (i3 == 0) {
            enumC1242 = EnumC1241.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            } else {
                i4 = 0;
            }
        } else if (i3 != 1073741824) {
            i4 = 0;
        } else {
            i4 = Math.min(this.mMaxHeight - i5, i4);
        }
        if (i2 != c1906.m37911() || i4 != c1906.m37890()) {
            c1906.f71747.m41574();
        }
        c1906.m37864(0);
        c1906.m37889(0);
        c1906.m37895(this.mMaxWidth - i6);
        c1906.m37897(this.mMaxHeight - i5);
        c1906.m37883(0);
        c1906.m37913(0);
        c1906.m37875(enumC1241);
        c1906.m37928(i2);
        c1906.m37904(enumC1242);
        c1906.m37891(i4);
        c1906.m37883(this.mMinWidth - i6);
        c1906.m37913(this.mMinHeight - i5);
    }

    public void setState(int i, int i2, int i3) {
        C1190 c1190 = this.mConstraintLayoutSpec;
        if (c1190 != null) {
            c1190.m20947(i2, i3, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View viewM24084;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C1680 c1680 = (C1680) childAt.getLayoutParams();
            C1591 c1591 = c1680.f55082;
            if ((childAt.getVisibility() != 8 || c1680.f55092 || c1680.f55081 || zIsInEditMode) && !c1680.f55096) {
                int iM37932 = c1591.m37932();
                int iM37933 = c1591.m37933();
                int iM37911 = c1591.m37911() + iM37932;
                int iM37890 = c1591.m37890() + iM37933;
                childAt.layout(iM37932, iM37933, iM37911, iM37890);
                if ((childAt instanceof C1260) && (viewM24084 = ((C1260) childAt).m24084()) != null) {
                    viewM24084.setVisibility(0);
                    viewM24084.layout(iM37932, iM37933, iM37911, iM37890);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC1216) this.mConstraintHelpers.get(i6)).mo17838();
            }
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.m50909(i);
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.m50917();
    }

    @Override // android.view.ViewGroup
    public C1680 generateLayoutParams(AttributeSet attributeSet) {
        return new C1680(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C1680 generateDefaultLayoutParams() {
        return new C1680(-2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1680(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1680;
    }

    public void setConstraintSet(C1050 c1050) {
        this.mConstraintSet = c1050;
    }

    public View getViewById(int i) {
        return (View) this.mChildrenByIds.get(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC1216) this.mConstraintHelpers.get(i)).mo22213(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void setOnConstraintsChanged(AbstractC0875 abstractC0875) {
        C1190 c1190 = this.mConstraintLayoutSpec;
        if (c1190 != null) {
            c1190.getClass();
        }
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new C1190(getContext(), this, i);
                return;
            } catch (Resources.NotFoundException unused) {
                this.mConstraintLayoutSpec = null;
                return;
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        m43400();
        super.requestLayout();
    }

    @Override // android.view.View
    public void forceLayout() {
        m43400();
        super.forceLayout();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m43400() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }
}
