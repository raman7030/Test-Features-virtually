package l;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V97Y */
/* JADX INFO: loaded from: classes4.dex */
public class C12644 extends C19546 {
    public C12644(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m30923();
    }

    public C12644(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30923();
    }

    public C12644(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30923();
    }

    public C12644(Context context) {
        super(context);
        m30923();
    }

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    private void m30923() {
        Resources resources = m6886().getResources();
        m44954(new CharSequence[]{resources.getString(R.string.MT_Protector), resources.getQuantityString(R.plurals.MT_Protector, 1, 1), resources.getQuantityString(R.plurals.MT_Protector, 3, 3), resources.getQuantityString(R.plurals.MT_Protector, 7, 7), resources.getQuantityString(R.plurals.MT_Protector, 14, 14), resources.getQuantityString(R.plurals.MT_Protector, 30, 30), resources.getQuantityString(R.plurals.MT_Protector, 60, 60), resources.getQuantityString(R.plurals.MT_Protector, 90, 90)});
        m44955(new CharSequence[]{"0", "1", "3", "7", "14", "30", "60", "90"});
    }
}
