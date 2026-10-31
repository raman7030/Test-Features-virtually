package l;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ܺۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5NF */
/* JADX INFO: loaded from: classes5.dex */
public class C15651 extends C21488 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f48174;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f48175;

    public C15651(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48174 = true;
    }

    public C15651(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48174 = true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f48174;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36850(boolean z) {
        this.f48174 = z;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setThreshold(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f48175 = i;
    }

    @Override // android.widget.AutoCompleteTextView
    public final int getThreshold() {
        return this.f48175;
    }
}
