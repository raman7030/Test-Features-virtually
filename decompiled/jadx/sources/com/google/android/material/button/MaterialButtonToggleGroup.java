package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import l.C14369;
import l.C16445;
import l.C16486;
import l.C17648;
import l.C17898;
import l.C17931;
import l.C18637;
import l.C19343;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final int DEF_STYLE_RES = C18637.f58461;
    public static final String LOG_TAG = "MButtonToggleGroup";
    public Set checkedIds;
    public Integer[] childOrder;
    public final Comparator childOrderComparator;
    public final int defaultCheckId;
    public final LinkedHashSet onButtonCheckedListeners;
    public final List originalCornerData;
    public final PressedStateTracker pressedStateTracker;
    public boolean selectionRequired;
    public boolean singleSelection;
    public boolean skipCheckedStateTracker;

    public interface OnButtonCheckedListener {
        void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C17931.f55184);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.originalCornerData = new ArrayList();
        this.pressedStateTracker = new PressedStateTracker();
        this.onButtonCheckedListeners = new LinkedHashSet();
        this.childOrderComparator = new Comparator() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.1
            @Override // java.util.Comparator
            public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
                int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
            }
        };
        this.skipCheckedStateTracker = false;
        this.checkedIds = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, C19343.f61414, i, i2, new int[0]);
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(C19343.f62193, false));
        this.defaultCheckId = typedArrayObtainStyledAttributes.getResourceId(C19343.f61659, -1);
        this.selectionRequired = typedArrayObtainStyledAttributes.getBoolean(C19343.f62085, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(C19343.f60969, true));
        typedArrayObtainStyledAttributes.recycle();
        int i3 = C17648.f53953;
        setImportantForAccessibility(1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.defaultCheckId;
        if (i != -1) {
            updateCheckedIds(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        updateChildOrder();
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            checkInternal(materialButton.getId(), materialButton.isChecked());
            ShapeAppearanceModel shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.originalCornerData.add(new CornerData(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel.getBottomRightCornerSize()));
            materialButton.setEnabled(isEnabled());
            C17648.m41309(materialButton, new C16445() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.2
                @Override // l.C16445
                public void onInitializeAccessibilityNodeInfo(View view2, C14369 c14369) {
                    super.onInitializeAccessibilityNodeInfo(view2, c14369);
                    c14369.m34286(C17898.m41877(0, 1, MaterialButtonToggleGroup.this.getIndexWithinVisibleButtons(view2), 1, false, ((MaterialButton) view2).isChecked()));
                }
            });
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.originalCornerData.remove(iIndexOfChild);
        }
        updateChildShapes();
        adjustChildMarginsAndUpdateLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        updateChildShapes();
        adjustChildMarginsAndUpdateLayout();
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C14369.m34264(accessibilityNodeInfo).m34284(C16486.m38850(1, getVisibleButtonCount(), isSingleSelection() ? 1 : 2, false));
    }

    public void check(int i) {
        checkInternal(i, true);
    }

    public void uncheck(int i) {
        checkInternal(i, false);
    }

    public void clearChecked() {
        updateCheckedIds(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.singleSelection || this.checkedIds.isEmpty()) {
            return -1;
        }
        return ((Integer) this.checkedIds.iterator().next()).intValue();
    }

    public List getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = getChildButton(i).getId();
            if (this.checkedIds.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public void addOnButtonCheckedListener(OnButtonCheckedListener onButtonCheckedListener) {
        this.onButtonCheckedListeners.add(onButtonCheckedListener);
    }

    public void removeOnButtonCheckedListener(OnButtonCheckedListener onButtonCheckedListener) {
        this.onButtonCheckedListeners.remove(onButtonCheckedListener);
    }

    public void clearOnButtonCheckedListeners() {
        this.onButtonCheckedListeners.clear();
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void setSingleSelection(boolean z) {
        if (this.singleSelection != z) {
            this.singleSelection = z;
            clearChecked();
        }
        updateChildrenA11yClassName();
    }

    private void updateChildrenA11yClassName() {
        for (int i = 0; i < getChildCount(); i++) {
            getChildButton(i).setA11yClassName((this.singleSelection ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSelectionRequired(boolean z) {
        this.selectionRequired = z;
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    private void setCheckedStateForView(int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof MaterialButton) {
            this.skipCheckedStateTracker = true;
            ((MaterialButton) viewFindViewById).setChecked(z);
            this.skipCheckedStateTracker = false;
        }
    }

    private void adjustChildMarginsAndUpdateLayout() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton childButton = getChildButton(i);
            int iMin = Math.min(childButton.getStrokeWidth(), getChildButton(i - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsBuildLayoutParams = buildLayoutParams(childButton);
            if (getOrientation() == 0) {
                layoutParamsBuildLayoutParams.setMarginEnd(0);
                layoutParamsBuildLayoutParams.setMarginStart(-iMin);
                layoutParamsBuildLayoutParams.topMargin = 0;
            } else {
                layoutParamsBuildLayoutParams.bottomMargin = 0;
                layoutParamsBuildLayoutParams.topMargin = -iMin;
                layoutParamsBuildLayoutParams.setMarginStart(0);
            }
            childButton.setLayoutParams(layoutParamsBuildLayoutParams);
        }
        resetChildMargins(firstVisibleChildIndex);
    }

    private MaterialButton getChildButton(int i) {
        return (MaterialButton) getChildAt(i);
    }

    private void resetChildMargins(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildButton(i).getLayoutParams();
        if (getOrientation() != 1) {
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
            return;
        }
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
    }

    public void updateChildShapes() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton childButton = getChildButton(i);
            if (childButton.getVisibility() != 8) {
                ShapeAppearanceModel.Builder builder = childButton.getShapeAppearanceModel().toBuilder();
                updateBuilderWithCornerData(builder, getNewCornerData(i, firstVisibleChildIndex, lastVisibleChildIndex));
                childButton.setShapeAppearanceModel(builder.build());
            }
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (isChildVisible(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        int childCount = getChildCount();
        do {
            childCount--;
            if (childCount < 0) {
                return -1;
            }
        } while (!isChildVisible(childCount));
        return childCount;
    }

    private boolean isChildVisible(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && isChildVisible(i2)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getIndexWithinVisibleButtons(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && isChildVisible(i2)) {
                i++;
            }
        }
        return -1;
    }

    private CornerData getNewCornerData(int i, int i2, int i3) {
        CornerData cornerData = (CornerData) this.originalCornerData.get(i);
        if (i2 == i3) {
            return cornerData;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            return z ? CornerData.start(cornerData, this) : CornerData.top(cornerData);
        }
        if (i == i3) {
            return z ? CornerData.end(cornerData, this) : CornerData.bottom(cornerData);
        }
        return null;
    }

    public static void updateBuilderWithCornerData(ShapeAppearanceModel.Builder builder, CornerData cornerData) {
        if (cornerData == null) {
            builder.setAllCornerSizes(0.0f);
        } else {
            builder.setTopLeftCornerSize(cornerData.topLeft).setBottomLeftCornerSize(cornerData.bottomLeft).setTopRightCornerSize(cornerData.topRight).setBottomRightCornerSize(cornerData.bottomRight);
        }
    }

    private void checkInternal(int i, boolean z) {
        if (i == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.checkedIds);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.singleSelection && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.selectionRequired || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        updateCheckedIds(hashSet);
    }

    private void updateCheckedIds(Set set) {
        Set set2 = this.checkedIds;
        this.checkedIds = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = getChildButton(i).getId();
            setCheckedStateForView(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                dispatchOnButtonChecked(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void dispatchOnButtonChecked(int i, boolean z) {
        Iterator it = this.onButtonCheckedListeners.iterator();
        while (it.hasNext()) {
            ((OnButtonCheckedListener) it.next()).onButtonChecked(this, i, z);
        }
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            int i = C17648.f53953;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.pressedStateTracker);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private LinearLayout.LayoutParams buildLayoutParams(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.childOrder;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    private void updateChildOrder() {
        TreeMap treeMap = new TreeMap(this.childOrderComparator);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(getChildButton(i), Integer.valueOf(i));
        }
        this.childOrder = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void onButtonCheckedStateChanged(MaterialButton materialButton, boolean z) {
        if (this.skipCheckedStateTracker) {
            return;
        }
        checkInternal(materialButton.getId(), z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            getChildButton(i).setEnabled(z);
        }
    }

    public class PressedStateTracker implements MaterialButton.OnPressedChangeListener {
        public PressedStateTracker() {
        }

        @Override // com.google.android.material.button.MaterialButton.OnPressedChangeListener
        public void onPressedChanged(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public class CornerData {
        public static final CornerSize noCorner = new AbsoluteCornerSize(0.0f);
        public CornerSize bottomLeft;
        public CornerSize bottomRight;
        public CornerSize topLeft;
        public CornerSize topRight;

        public CornerData(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
            this.topLeft = cornerSize;
            this.topRight = cornerSize3;
            this.bottomRight = cornerSize4;
            this.bottomLeft = cornerSize2;
        }

        public static CornerData start(CornerData cornerData, View view) {
            return ViewUtils.isLayoutRtl(view) ? right(cornerData) : left(cornerData);
        }

        public static CornerData end(CornerData cornerData, View view) {
            return ViewUtils.isLayoutRtl(view) ? left(cornerData) : right(cornerData);
        }

        public static CornerData left(CornerData cornerData) {
            CornerSize cornerSize = cornerData.topLeft;
            CornerSize cornerSize2 = cornerData.bottomLeft;
            CornerSize cornerSize3 = noCorner;
            return new CornerData(cornerSize, cornerSize2, cornerSize3, cornerSize3);
        }

        public static CornerData right(CornerData cornerData) {
            CornerSize cornerSize = noCorner;
            return new CornerData(cornerSize, cornerSize, cornerData.topRight, cornerData.bottomRight);
        }

        public static CornerData top(CornerData cornerData) {
            CornerSize cornerSize = cornerData.topLeft;
            CornerSize cornerSize2 = noCorner;
            return new CornerData(cornerSize, cornerSize2, cornerData.topRight, cornerSize2);
        }

        public static CornerData bottom(CornerData cornerData) {
            CornerSize cornerSize = noCorner;
            return new CornerData(cornerSize, cornerData.bottomLeft, cornerSize, cornerData.bottomRight);
        }
    }
}
