package p067l;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۧ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Y0 */
/* JADX INFO: loaded from: classes4.dex */
public class C13078 extends AbstractC5701 {
    @Override // p067l.C4360
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo9062() {
        return false;
    }

    public C13078(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public C13078(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C13078(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0989.m11085(context, R.attr.MT_Protector, android.R.attr.preferenceCategoryStyle));
    }

    public C13078(Context context) {
        this(context, null);
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ܿ֫ */
    public final boolean mo9058() {
        return !super.mo9062();
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo5137(C22486 c22486) {
        super.mo5137(c22486);
        if (Build.VERSION.SDK_INT >= 28) {
            c22486.itemView.setAccessibilityHeading(true);
        }
    }
}
