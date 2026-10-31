package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 83VR */
/* JADX INFO: loaded from: classes4.dex */
public class C19724 extends ViewGroup {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C4201 f63745;

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public C19724(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public C19724(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C19018(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C19018();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C16900(layoutParams);
    }
}
