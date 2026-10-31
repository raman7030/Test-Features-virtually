package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.᩶᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9TO */
/* JADX INFO: loaded from: classes5.dex */
public class C20417 extends C3122 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public View.OnClickListener f65880;

    public C20417(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C20417(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.AdapterView, android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f65880 = onClickListener;
    }

    @Override // l.C3122, android.widget.Spinner, android.view.View
    public final boolean performClick() {
        View.OnClickListener onClickListener = this.f65880;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            return true;
        }
        return super.performClick();
    }
}
