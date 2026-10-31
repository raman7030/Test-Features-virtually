package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.Positioning;
import java.util.HashMap;
import java.util.Map;
import l.C14077;
import l.C16519;
import l.C17648;
import l.C18333;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public Map importantForAccessibilityMap;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public FabTransformationBehavior.FabTransformationSpec onCreateMotionSpec(Context context, boolean z) {
        int i;
        if (z) {
            i = C16519.f50767;
        } else {
            i = C16519.f50776;
        }
        FabTransformationBehavior.FabTransformationSpec fabTransformationSpec = new FabTransformationBehavior.FabTransformationSpec();
        fabTransformationSpec.timings = MotionSpec.createFromResource(context, i);
        fabTransformationSpec.positioning = new Positioning(17, 0.0f, 0.0f);
        return fabTransformationSpec;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean onExpandedStateChange(View view, View view2, boolean z, boolean z2) {
        updateImportantForAccessibility(view2, z);
        return super.onExpandedStateChange(view, view2, z, z2);
    }

    private void updateImportantForAccessibility(View view, boolean z) {
        int iIntValue;
        ViewParent parent = view.getParent();
        if (parent instanceof C18333) {
            C18333 c18333 = (C18333) parent;
            int childCount = c18333.getChildCount();
            if (z) {
                this.importantForAccessibilityMap = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = c18333.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof C14077) && (((C14077) childAt.getLayoutParams()).m33687() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map map = this.importantForAccessibilityMap;
                        if (map != null && map.containsKey(childAt)) {
                            iIntValue = ((Integer) this.importantForAccessibilityMap.get(childAt)).intValue();
                            int i2 = C17648.f53953;
                        }
                    } else {
                        this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        int i3 = C17648.f53953;
                        iIntValue = 4;
                    }
                    childAt.setImportantForAccessibility(iIntValue);
                }
            }
            if (z) {
                return;
            }
            this.importantForAccessibilityMap = null;
        }
    }
}
