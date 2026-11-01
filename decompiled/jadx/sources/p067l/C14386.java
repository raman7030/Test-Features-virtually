package p067l;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۫᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V97Y */
/* JADX INFO: loaded from: classes4.dex */
public class C14386 extends C20945 {
    public C14386(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m33001();
    }

    public C14386(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m33001();
    }

    public C14386(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m33001();
    }

    public C14386(Context context) {
        super(context);
        m33001();
    }

    /* JADX INFO: renamed from: ֨֫ */
    private void m33001() {
        Resources resources = m9012().getResources();
        m47254(new CharSequence[]{resources.getString(R.string.MT_Protector), resources.getQuantityString(R.plurals.MT_Protector, 1, 1), resources.getQuantityString(R.plurals.MT_Protector, 3, 3), resources.getQuantityString(R.plurals.MT_Protector, 7, 7), resources.getQuantityString(R.plurals.MT_Protector, 14, 14), resources.getQuantityString(R.plurals.MT_Protector, 30, 30), resources.getQuantityString(R.plurals.MT_Protector, 60, 60), resources.getQuantityString(R.plurals.MT_Protector, 90, 90)});
        m47255(new CharSequence[]{"0", "1", "3", "7", "14", "30", "60", "90"});
    }
}
