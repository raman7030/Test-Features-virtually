package l;

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

/* JADX INFO: renamed from: l.ܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1JV */
/* JADX INFO: loaded from: classes4.dex */
public class C17606 extends ViewGroup {
    public static final boolean DEBUG = false;
    public static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    public static final boolean MEASURE = false;
    public static final String TAG = "ConstraintLayout";
    public static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.0.4";
    public SparseArray mChildrenByIds;
    public ArrayList mConstraintHelpers;
    public C7023 mConstraintLayoutSpec;
    public C4201 mConstraintSet;
    public int mConstraintSetId;
    public AbstractC0672 mConstraintsChangedListener;
    public HashMap mDesignIds;
    public boolean mDirtyHierarchy;
    public int mLastMeasureHeight;
    public int mLastMeasureHeightMode;
    public int mLastMeasureHeightSize;
    public int mLastMeasureWidth;
    public int mLastMeasureWidthMode;
    public int mLastMeasureWidthSize;
    public C21446 mLayoutWidget;
    public int mMaxHeight;
    public int mMaxWidth;
    public C18312 mMeasurer;
    public C14389 mMetrics;
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

    public C17606(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C21446();
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
        this.mMeasurer = new C18312(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m41152(null, 0, 0);
    }

    public C17606(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C21446();
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
        this.mMeasurer = new C18312(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m41152(attributeSet, 0, 0);
    }

    public C17606(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C21446();
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
        this.mMeasurer = new C18312(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m41152(attributeSet, i, 0);
    }

    @TargetApi(21)
    public C17606(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mLayoutWidget = new C21446();
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
        this.mMeasurer = new C18312(this, this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        m41152(attributeSet, i, i2);
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41152(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.m35712(this);
        this.mLayoutWidget.m48567(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21840.f69980, i, i2);
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
                        C4201 c4201 = new C4201();
                        this.mConstraintSet = c4201;
                        c4201.m12671(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.m48572(this.mOptimizationLevel);
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new C7023(getContext(), this, i);
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
        C15094 viewWidget = getViewWidget(view);
        if ((view instanceof C1378) && !(viewWidget instanceof C3101)) {
            C16900 c16900 = (C16900) view.getLayoutParams();
            C3101 c3101 = new C3101();
            c16900.f51902 = c3101;
            c16900.f51912 = true;
            c3101.m9462(c16900.f51941);
        }
        if (view instanceof AbstractC7539) {
            AbstractC7539 abstractC7539 = (AbstractC7539) view;
            abstractC7539.m20236();
            ((C16900) view.getLayoutParams()).f51901 = true;
            if (!this.mConstraintHelpers.contains(abstractC7539)) {
                this.mConstraintHelpers.add(abstractC7539);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        C15094 viewWidget = getViewWidget(view);
        this.mLayoutWidget.f18169.remove(viewWidget);
        viewWidget.mo16611();
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

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m41156() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
        }
        if (z) {
            m41155();
        }
        return z;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m41155() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C15094 viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.mo16611();
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
                    m41151(childAt.getId()).m35713(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof C19724)) {
                    C19724 c19724 = (C19724) childAt2;
                    if (c19724.f63745 == null) {
                        c19724.f63745 = new C4201();
                    }
                    c19724.f63745.m12677(c19724);
                    this.mConstraintSet = c19724.f63745;
                }
            }
        }
        C4201 c4201 = this.mConstraintSet;
        if (c4201 != null) {
            c4201.m12682(this);
        }
        this.mLayoutWidget.f18169.clear();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ((AbstractC7539) this.mConstraintHelpers.get(i4)).m20238(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof C8434) {
                ((C8434) childAt3).m22116(this);
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
            C15094 viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                C16900 c16900 = (C16900) childAt5.getLayoutParams();
                C21446 c21446 = this.mLayoutWidget;
                c21446.f18169.add(viewWidget2);
                C15094 c15094 = viewWidget2.f46132;
                if (c15094 != null) {
                    ((C5923) c15094).f18169.remove(viewWidget2);
                    viewWidget2.mo16611();
                }
                viewWidget2.f46132 = c21446;
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, c16900, this.mTempMapIdToWidget);
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
    public void applyConstraintsFromLayoutParams(boolean z, View view, C15094 c15094, C16900 c16900, SparseArray sparseArray) {
        float f;
        C15094 c15095;
        boolean z2;
        boolean z3;
        C15094 c15096;
        int i;
        int i2;
        C15094 c15097;
        int i3;
        int i4;
        C15094 c15098;
        int i5;
        float f2;
        ?? r2;
        float f3;
        View view2;
        C15094 c15099;
        C15094 c150910;
        C15094 c150911;
        C15094 c150912;
        int i6;
        c16900.m39760();
        c15094.m35768(view.getVisibility());
        if (c16900.f51916) {
            c15094.m35759();
            c15094.m35768(8);
        }
        c15094.m35712(view);
        if (view instanceof AbstractC7539) {
            ((AbstractC7539) view).mo17041(c15094, this.mLayoutWidget.m48578());
        }
        if (c16900.f51912) {
            C3101 c3101 = (C3101) c15094;
            int i7 = c16900.f51927;
            int i8 = c16900.f51892;
            float f4 = c16900.f51896;
            if (f4 != -1.0f) {
                c3101.m9460(f4);
                return;
            } else if (i7 != -1) {
                c3101.m9455(i7);
                return;
            } else {
                if (i8 != -1) {
                    c3101.m9459(i8);
                    return;
                }
                return;
            }
        }
        int i9 = c16900.f51937;
        int i10 = c16900.f51886;
        int i11 = c16900.f51900;
        int i12 = c16900.f51888;
        int i13 = c16900.f51911;
        int i14 = c16900.f51909;
        float f5 = c16900.f51935;
        int i15 = c16900.f51930;
        if (i15 != -1) {
            C15094 c150913 = (C15094) sparseArray.get(i15);
            if (c150913 != null) {
                c15094.m35718(c150913, c16900.f51932, c16900.f51922);
            }
            f3 = 0.0f;
            r2 = 1;
        } else {
            if (i9 != -1) {
                C15094 c150914 = (C15094) sparseArray.get(i9);
                if (c150914 != null) {
                    EnumC0278 enumC0278 = EnumC0278.LEFT;
                    f = 0.0f;
                    c15094.m35715(enumC0278, c150914, enumC0278, ((ViewGroup.MarginLayoutParams) c16900).leftMargin, i13);
                } else {
                    z2 = true;
                    f = 0.0f;
                }
                if (i11 != -1) {
                    c150912 = (C15094) sparseArray.get(i11);
                    if (c150912 != null) {
                        z3 = z2;
                        c15094.m35715(EnumC0278.RIGHT, c150912, EnumC0278.LEFT, ((ViewGroup.MarginLayoutParams) c16900).rightMargin, i14);
                    } else {
                        z3 = z2;
                    }
                } else {
                    z3 = z2;
                    if (i12 != -1 && (c15096 = (C15094) sparseArray.get(i12)) != null) {
                        EnumC0278 enumC0279 = EnumC0278.RIGHT;
                        c15094.m35715(enumC0279, c15096, enumC0279, ((ViewGroup.MarginLayoutParams) c16900).rightMargin, i14);
                    }
                }
                i = c16900.f51898;
                if (i != -1) {
                    c150911 = (C15094) sparseArray.get(i);
                    if (c150911 != null) {
                        EnumC0278 enumC02710 = EnumC0278.TOP;
                        c15094.m35715(enumC02710, c150911, enumC02710, ((ViewGroup.MarginLayoutParams) c16900).topMargin, c16900.f51924);
                    }
                } else {
                    i2 = c16900.f51939;
                    if (i2 != -1 && (c15097 = (C15094) sparseArray.get(i2)) != null) {
                        c15094.m35715(EnumC0278.TOP, c15097, EnumC0278.BOTTOM, ((ViewGroup.MarginLayoutParams) c16900).topMargin, c16900.f51924);
                    }
                }
                i3 = c16900.f51928;
                if (i3 != -1) {
                    c150910 = (C15094) sparseArray.get(i3);
                    if (c150910 != null) {
                        c15094.m35715(EnumC0278.BOTTOM, c150910, EnumC0278.TOP, ((ViewGroup.MarginLayoutParams) c16900).bottomMargin, c16900.f51936);
                    }
                } else {
                    i4 = c16900.f51914;
                    if (i4 != -1 && (c15098 = (C15094) sparseArray.get(i4)) != null) {
                        EnumC0278 enumC02711 = EnumC0278.BOTTOM;
                        c15094.m35715(enumC02711, c15098, enumC02711, ((ViewGroup.MarginLayoutParams) c16900).bottomMargin, c16900.f51936);
                    }
                }
                i5 = c16900.f51889;
                if (i5 != -1) {
                    view2 = (View) this.mChildrenByIds.get(i5);
                    c15099 = (C15094) sparseArray.get(c16900.f51889);
                    if (c15099 != null && view2 != null && (view2.getLayoutParams() instanceof C16900)) {
                        C16900 c16901 = (C16900) view2.getLayoutParams();
                        c16900.f51904 = z3;
                        c16901.f51904 = z3;
                        EnumC0278 enumC02712 = EnumC0278.BASELINE;
                        c15094.mo9453(enumC02712).m15000(c15099.mo9453(enumC02712), 0, -1, z3);
                        c15094.m35721(z3);
                        c16901.f51902.m35721(z3);
                        c15094.mo9453(EnumC0278.TOP).m15003();
                        c15094.mo9453(EnumC0278.BOTTOM).m15003();
                    }
                }
                if (f5 >= f) {
                    c15094.m35709(f5);
                }
                f2 = c16900.f51894;
                if (f2 >= f) {
                    c15094.m35743(f2);
                }
                r2 = z3;
                f3 = f;
            } else {
                f = 0.0f;
                if (i10 != -1 && (c15095 = (C15094) sparseArray.get(i10)) != null) {
                    c15094.m35715(EnumC0278.LEFT, c15095, EnumC0278.RIGHT, ((ViewGroup.MarginLayoutParams) c16900).leftMargin, i13);
                }
            }
            z2 = true;
            if (i11 != -1) {
                c150912 = (C15094) sparseArray.get(i11);
                if (c150912 != null) {
                    z3 = z2;
                    c15094.m35715(EnumC0278.RIGHT, c150912, EnumC0278.LEFT, ((ViewGroup.MarginLayoutParams) c16900).rightMargin, i14);
                } else {
                    z3 = z2;
                }
            } else {
                z3 = z2;
                if (i12 != -1) {
                    EnumC0278 enumC02713 = EnumC0278.RIGHT;
                    c15094.m35715(enumC02713, c15096, enumC02713, ((ViewGroup.MarginLayoutParams) c16900).rightMargin, i14);
                }
            }
            i = c16900.f51898;
            if (i != -1) {
                c150911 = (C15094) sparseArray.get(i);
                if (c150911 != null) {
                    EnumC0278 enumC02714 = EnumC0278.TOP;
                    c15094.m35715(enumC02714, c150911, enumC02714, ((ViewGroup.MarginLayoutParams) c16900).topMargin, c16900.f51924);
                }
            } else {
                i2 = c16900.f51939;
                if (i2 != -1) {
                    c15094.m35715(EnumC0278.TOP, c15097, EnumC0278.BOTTOM, ((ViewGroup.MarginLayoutParams) c16900).topMargin, c16900.f51924);
                }
            }
            i3 = c16900.f51928;
            if (i3 != -1) {
                c150910 = (C15094) sparseArray.get(i3);
                if (c150910 != null) {
                    c15094.m35715(EnumC0278.BOTTOM, c150910, EnumC0278.TOP, ((ViewGroup.MarginLayoutParams) c16900).bottomMargin, c16900.f51936);
                }
            } else {
                i4 = c16900.f51914;
                if (i4 != -1) {
                    EnumC0278 enumC02715 = EnumC0278.BOTTOM;
                    c15094.m35715(enumC02715, c15098, enumC02715, ((ViewGroup.MarginLayoutParams) c16900).bottomMargin, c16900.f51936);
                }
            }
            i5 = c16900.f51889;
            if (i5 != -1) {
                view2 = (View) this.mChildrenByIds.get(i5);
                c15099 = (C15094) sparseArray.get(c16900.f51889);
                if (c15099 != null) {
                    C16900 c16902 = (C16900) view2.getLayoutParams();
                    c16900.f51904 = z3;
                    c16902.f51904 = z3;
                    EnumC0278 enumC02716 = EnumC0278.BASELINE;
                    c15094.mo9453(enumC02716).m15000(c15099.mo9453(enumC02716), 0, -1, z3);
                    c15094.m35721(z3);
                    c16902.f51902.m35721(z3);
                    c15094.mo9453(EnumC0278.TOP).m15003();
                    c15094.mo9453(EnumC0278.BOTTOM).m15003();
                }
            }
            if (f5 >= f) {
                c15094.m35709(f5);
            }
            f2 = c16900.f51894;
            if (f2 >= f) {
                c15094.m35743(f2);
            }
            r2 = z3;
            f3 = f;
        }
        if (z && ((i6 = c16900.f51926) != -1 || c16900.f51891 != -1)) {
            c15094.m35765(i6, c16900.f51891);
        }
        if (!c16900.f51919) {
            if (((ViewGroup.MarginLayoutParams) c16900).width == -1) {
                if (c16900.f51903) {
                    c15094.m35717(EnumC8040.MATCH_CONSTRAINT);
                } else {
                    c15094.m35717(EnumC8040.MATCH_PARENT);
                }
                c15094.mo9453(EnumC0278.LEFT).f16343 = ((ViewGroup.MarginLayoutParams) c16900).leftMargin;
                c15094.mo9453(EnumC0278.RIGHT).f16343 = ((ViewGroup.MarginLayoutParams) c16900).rightMargin;
            } else {
                c15094.m35717(EnumC8040.MATCH_CONSTRAINT);
                c15094.m35770(0);
            }
        } else {
            c15094.m35717(EnumC8040.FIXED);
            c15094.m35770(((ViewGroup.MarginLayoutParams) c16900).width);
            if (((ViewGroup.MarginLayoutParams) c16900).width == -2) {
                c15094.m35717(EnumC8040.WRAP_CONTENT);
            }
        }
        if (!c16900.f51918) {
            if (((ViewGroup.MarginLayoutParams) c16900).height == -1) {
                if (c16900.f51947) {
                    c15094.m35746(EnumC8040.MATCH_CONSTRAINT);
                } else {
                    c15094.m35746(EnumC8040.MATCH_PARENT);
                }
                c15094.mo9453(EnumC0278.TOP).f16343 = ((ViewGroup.MarginLayoutParams) c16900).topMargin;
                c15094.mo9453(EnumC0278.BOTTOM).f16343 = ((ViewGroup.MarginLayoutParams) c16900).bottomMargin;
            } else {
                c15094.m35746(EnumC8040.MATCH_CONSTRAINT);
                c15094.m35733(0);
            }
        } else {
            c15094.m35746(EnumC8040.FIXED);
            c15094.m35733(((ViewGroup.MarginLayoutParams) c16900).height);
            if (((ViewGroup.MarginLayoutParams) c16900).height == -2) {
                c15094.m35746(EnumC8040.WRAP_CONTENT);
            }
        }
        c15094.m35745(c16900.f51910);
        float f6 = c16900.f51917;
        float[] fArr = c15094.f46167;
        fArr[0] = f6;
        fArr[r2] = c16900.f51913;
        c15094.m35773(c16900.f51893);
        c15094.m35728(c16900.f51920);
        int i16 = c16900.f51890;
        int i17 = c16900.f51931;
        int i18 = c16900.f51929;
        float f7 = c16900.f51948;
        c15094.f46145 = i16;
        c15094.f46153 = i17;
        if (i18 == Integer.MAX_VALUE) {
            i18 = 0;
        }
        c15094.f46113 = i18;
        c15094.f46155 = f7;
        if (f7 > f3 && f7 < 1.0f && i16 == 0) {
            c15094.f46145 = 2;
        }
        int i19 = c16900.f51905;
        int i20 = c16900.f51933;
        int i21 = c16900.f51915;
        float f8 = c16900.f51923;
        c15094.f46170 = i19;
        c15094.f46138 = i20;
        c15094.f46128 = i21 != Integer.MAX_VALUE ? i21 : 0;
        c15094.f46157 = f8;
        if (f8 <= f3 || f8 >= 1.0f || i19 != 0) {
            return;
        }
        c15094.f46170 = 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final C15094 m41151(int i) {
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
        return ((C16900) viewFindViewById.getLayoutParams()).f51902;
    }

    public final C15094 getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((C16900) view.getLayoutParams()).f51902;
    }

    public void fillMetrics(C14389 c14389) {
        this.mLayoutWidget.m48581();
    }

    public void resolveSystem(C21446 c21446, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i4 = iMax + iMax2;
        int iM41149 = m41149();
        C18312 c18312 = this.mMeasurer;
        c18312.f56933 = iMax;
        c18312.f56936 = iMax2;
        c18312.f56937 = iM41149;
        c18312.f56935 = i4;
        c18312.f56934 = i2;
        c18312.f56932 = i3;
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (isRtl()) {
                iMax3 = iMax4;
            }
        } else {
            iMax3 = Math.max(0, getPaddingLeft());
        }
        int i5 = size - iM41149;
        int i6 = size2 - i4;
        setSelfDimensionBehaviour(c21446, mode, i5, mode2, i6);
        c21446.m48565(i, mode, i5, mode2, i6, iMax3, iMax);
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C18312 c18312 = this.mMeasurer;
        int i5 = c18312.f56935;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + c18312.f56937, i, 0);
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
                resolveMeasuredDimension(i, i2, this.mLayoutWidget.m35753(), this.mLayoutWidget.m35732(), this.mLayoutWidget.m48569(), this.mLayoutWidget.m48573());
                return;
            }
            if (i4 == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.mOnMeasureHeightMeasureSpec) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= this.mLayoutWidget.m35732()) {
                this.mOnMeasureWidthMeasureSpec = i;
                this.mOnMeasureHeightMeasureSpec = i2;
                resolveMeasuredDimension(i, i2, this.mLayoutWidget.m35753(), this.mLayoutWidget.m35732(), this.mLayoutWidget.m48569(), this.mLayoutWidget.m48573());
                return;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.m48577(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (m41156()) {
                this.mLayoutWidget.m48570();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.m35753(), this.mLayoutWidget.m35732(), this.mLayoutWidget.m48569(), this.mLayoutWidget.m48573());
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m41149() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0053 A[PHI: r2
      0x0053: PHI (r2v4 l.۠۠) = (r2v3 l.۠۠), (r2v0 l.۠۠) binds: [B:21:0x004a, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    public void setSelfDimensionBehaviour(C21446 c21446, int i, int i2, int i3, int i4) {
        EnumC8040 enumC8040;
        C18312 c18312 = this.mMeasurer;
        int i5 = c18312.f56935;
        int i6 = c18312.f56937;
        EnumC8040 enumC8041 = EnumC8040.FIXED;
        int childCount = getChildCount();
        if (i == Integer.MIN_VALUE) {
            enumC8040 = EnumC8040.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        } else if (i == 0) {
            enumC8040 = EnumC8040.WRAP_CONTENT;
            i2 = childCount == 0 ? Math.max(0, this.mMinWidth) : 0;
        } else if (i != 1073741824) {
            enumC8040 = enumC8041;
        } else {
            i2 = Math.min(this.mMaxWidth - i6, i2);
            enumC8040 = enumC8041;
        }
        if (i3 == Integer.MIN_VALUE) {
            enumC8041 = EnumC8040.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        } else if (i3 == 0) {
            enumC8041 = EnumC8040.WRAP_CONTENT;
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
        if (i2 != c21446.m35753() || i4 != c21446.m35732()) {
            c21446.f69049.m39338();
        }
        c21446.m35706(0);
        c21446.m35731(0);
        c21446.m35737(this.mMaxWidth - i6);
        c21446.m35739(this.mMaxHeight - i5);
        c21446.m35725(0);
        c21446.m35755(0);
        c21446.m35717(enumC8040);
        c21446.m35770(i2);
        c21446.m35746(enumC8041);
        c21446.m35733(i4);
        c21446.m35725(this.mMinWidth - i6);
        c21446.m35755(this.mMinHeight - i5);
    }

    public void setState(int i, int i2, int i3) {
        C7023 c7023 = this.mConstraintLayoutSpec;
        if (c7023 != null) {
            c7023.m18990(i2, i3, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View viewM22115;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C16900 c16900 = (C16900) childAt.getLayoutParams();
            C15094 c15094 = c16900.f51902;
            if ((childAt.getVisibility() != 8 || c16900.f51912 || c16900.f51901 || zIsInEditMode) && !c16900.f51916) {
                int iM35774 = c15094.m35774();
                int iM35775 = c15094.m35775();
                int iM35753 = c15094.m35753() + iM35774;
                int iM35732 = c15094.m35732() + iM35775;
                childAt.layout(iM35774, iM35775, iM35753, iM35732);
                if ((childAt instanceof C8434) && (viewM22115 = ((C8434) childAt).m22115()) != null) {
                    viewM22115.setVisibility(0);
                    viewM22115.layout(iM35774, iM35775, iM35753, iM35732);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC7539) this.mConstraintHelpers.get(i6)).mo15917();
            }
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.m48572(i);
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.m48580();
    }

    @Override // android.view.ViewGroup
    public C16900 generateLayoutParams(AttributeSet attributeSet) {
        return new C16900(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C16900 generateDefaultLayoutParams() {
        return new C16900(-2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C16900(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C16900;
    }

    public void setConstraintSet(C4201 c4201) {
        this.mConstraintSet = c4201;
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
                ((AbstractC7539) this.mConstraintHelpers.get(i)).mo20237(this);
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

    public void setOnConstraintsChanged(AbstractC0672 abstractC0672) {
        C7023 c7023 = this.mConstraintLayoutSpec;
        if (c7023 != null) {
            c7023.getClass();
        }
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new C7023(getContext(), this, i);
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
        m41154();
        super.requestLayout();
    }

    @Override // android.view.View
    public void forceLayout() {
        m41154();
        super.forceLayout();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m41154() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }
}
