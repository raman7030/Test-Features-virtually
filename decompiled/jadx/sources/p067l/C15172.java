package p067l;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: l.ܰ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAP3 */
/* JADX INFO: loaded from: classes4.dex */
public class C15172 extends C1567 {
    public C15172(Context context) {
        super(context);
        m34587(context);
    }

    public C15172(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m34587(context);
    }

    public C15172(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m34587(context);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m34587(Context context) {
        C21272.m48052(this);
        setGravity(17);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        int i = (int) ((8.0f * f) + 0.5f);
        int i2 = (int) ((6.0f * f) + 0.5f);
        int i3 = (i2 * 2) + ((int) ((displayMetrics.scaledDensity * 180.0f) + 0.5f));
        setPadding(i2, i, i2, i);
        setMinWidth((int) ((f * 48.0f) + 0.5f));
        setMaxWidth(i3);
        setEllipsize(TextUtils.TruncateAt.END);
        setSingleLine();
        setTextSize(16.0f);
    }
}
