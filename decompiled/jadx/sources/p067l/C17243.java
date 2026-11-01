package p067l;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ܺۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NF */
/* JADX INFO: loaded from: classes5.dex */
public class C17243 extends C1908 {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f51314;

    /* JADX INFO: renamed from: ᩹ */
    public int f51315;

    public C17243(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51314 = true;
    }

    public C17243(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51314 = true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f51314;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39016(boolean z) {
        this.f51314 = z;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setThreshold(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f51315 = i;
    }

    @Override // android.widget.AutoCompleteTextView
    public final int getThreshold() {
        return this.f51315;
    }
}
