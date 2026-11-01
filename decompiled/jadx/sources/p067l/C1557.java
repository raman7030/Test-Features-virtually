package p067l;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ܳۡ */
/* JADX INFO: compiled from: J4W4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1557 extends PopupWindow {
    public C1557(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m36567(context, attributeSet, i);
    }

    public C1557(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        m36567(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m36567(Context context, AttributeSet attributeSet, int i) {
        C1970 c1970M53129 = C1970.m53129(context, attributeSet, C1010.f13519, i, 0);
        if (c1970M53129.m53135(2)) {
            C3129.m5337(this, c1970M53129.m53134(2, false));
        }
        setBackgroundDrawable(c1970M53129.m53148(0));
        c1970M53129.m53146();
    }
}
