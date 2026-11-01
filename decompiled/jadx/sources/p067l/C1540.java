package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܰ᩸ */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C1540 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ֡ */
    public int f45593;

    /* JADX INFO: renamed from: ֫ */
    public int f45594;

    /* JADX INFO: renamed from: ۖ */
    public boolean f45595;

    /* JADX INFO: renamed from: ۘ */
    public boolean f45596;

    /* JADX INFO: renamed from: ۚ */
    public final Rect f45597;

    /* JADX INFO: renamed from: ۜ */
    public View f45598;

    /* JADX INFO: renamed from: ۡ */
    public Object f45599;

    /* JADX INFO: renamed from: ۢ */
    public boolean f45600;

    /* JADX INFO: renamed from: ۧ */
    public int f45601;

    /* JADX INFO: renamed from: ܳ */
    public View f45602;

    /* JADX INFO: renamed from: ܺ */
    public boolean f45603;

    /* JADX INFO: renamed from: ܽ */
    public int f45604;

    /* JADX INFO: renamed from: ܿ */
    public int f45605;

    /* JADX INFO: renamed from: ᩳ */
    public int f45606;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f45607;

    /* JADX INFO: renamed from: ᩵ */
    public int f45608;

    /* JADX INFO: renamed from: ᩷ */
    public AbstractC1155 f45609;

    /* JADX INFO: renamed from: ᩻ */
    public int f45610;

    public C1540() {
        super(-2, -2);
        this.f45600 = false;
        this.f45604 = 0;
        this.f45594 = 0;
        this.f45605 = -1;
        this.f45610 = -1;
        this.f45606 = 0;
        this.f45601 = 0;
        this.f45597 = new Rect();
    }

    public C1540(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45600 = false;
        this.f45604 = 0;
        this.f45594 = 0;
        this.f45605 = -1;
        this.f45610 = -1;
        this.f45606 = 0;
        this.f45601 = 0;
        this.f45597 = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1505.f43064);
        this.f45604 = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f45610 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f45594 = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f45605 = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f45606 = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f45601 = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f45600 = zHasValue;
        if (zHasValue) {
            this.f45609 = C1751.m44975(context, attributeSet, typedArrayObtainStyledAttributes.getString(3));
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC1155 abstractC1155 = this.f45609;
        if (abstractC1155 != null) {
            abstractC1155.onAttachedToLayoutParams(this);
        }
    }

    public C1540(C1540 c1540) {
        super((ViewGroup.MarginLayoutParams) c1540);
        this.f45600 = false;
        this.f45604 = 0;
        this.f45594 = 0;
        this.f45605 = -1;
        this.f45610 = -1;
        this.f45606 = 0;
        this.f45601 = 0;
        this.f45597 = new Rect();
    }

    public C1540(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f45600 = false;
        this.f45604 = 0;
        this.f45594 = 0;
        this.f45605 = -1;
        this.f45610 = -1;
        this.f45606 = 0;
        this.f45601 = 0;
        this.f45597 = new Rect();
    }

    public C1540(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f45600 = false;
        this.f45604 = 0;
        this.f45594 = 0;
        this.f45605 = -1;
        this.f45610 = -1;
        this.f45606 = 0;
        this.f45601 = 0;
        this.f45597 = new Rect();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m35810() {
        return this.f45610;
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC1155 m35812() {
        return this.f45609;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35805(AbstractC1155 abstractC1155) {
        AbstractC1155 abstractC1156 = this.f45609;
        if (abstractC1156 != abstractC1155) {
            if (abstractC1156 != null) {
                abstractC1156.onDetachedFromLayoutParams();
            }
            this.f45609 = abstractC1155;
            this.f45599 = null;
            this.f45600 = true;
            if (abstractC1155 != null) {
                abstractC1155.onAttachedToLayoutParams(this);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35807() {
        if (this.f45609 == null) {
            this.f45596 = false;
        }
        return this.f45596;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35809(C1751 c1751, View view) {
        boolean z = this.f45596;
        if (z) {
            return true;
        }
        AbstractC1155 abstractC1155 = this.f45609;
        boolean zBlocksInteractionBelow = (abstractC1155 != null ? abstractC1155.blocksInteractionBelow(c1751, view) : false) | z;
        this.f45596 = zBlocksInteractionBelow;
        return zBlocksInteractionBelow;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m35811() {
        this.f45596 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35804(int i, boolean z) {
        if (i == 0) {
            this.f45595 = z;
        } else {
            if (i != 1) {
                return;
            }
            this.f45603 = z;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35808(int i) {
        if (i == 0) {
            return this.f45595;
        }
        if (i != 1) {
            return false;
        }
        return this.f45603;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m35814() {
        return this.f45607;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35806(boolean z) {
        this.f45607 = z;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m35813() {
        this.f45607 = false;
    }
}
