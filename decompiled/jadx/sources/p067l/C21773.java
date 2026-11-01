package p067l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.᩶᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9TO */
/* JADX INFO: loaded from: classes5.dex */
public class C21773 extends C0997 {

    /* JADX INFO: renamed from: ۨ */
    public View.OnClickListener f68555;

    public C21773(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C21773(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.AdapterView, android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f68555 = onClickListener;
    }

    @Override // p067l.C0997, android.widget.Spinner, android.view.View
    public final boolean performClick() {
        View.OnClickListener onClickListener = this.f68555;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            return true;
        }
        return super.performClick();
    }
}
