package l;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Y0 */
/* JADX INFO: loaded from: classes4.dex */
public class C11268 extends AbstractC3506 {
    @Override // l.C2095
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo6936() {
        return false;
    }

    public C11268(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public C11268(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C11268(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2958.m9017(context, R.attr.MT_Protector, android.R.attr.preferenceCategoryStyle));
    }

    public C11268(Context context) {
        this(context, null);
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ܿ֫ */
    public final boolean mo6932() {
        return !super.mo6936();
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo2792(C21167 c21167) {
        super.mo2792(c21167);
        if (Build.VERSION.SDK_INT >= 28) {
            c21167.itemView.setAccessibilityHeading(true);
        }
    }
}
