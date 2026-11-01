package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: renamed from: l.֡᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3086 {

    /* JADX INFO: renamed from: ֫ */
    public Object f5579;

    /* JADX INFO: renamed from: ۧ */
    public final ViewGroup f5580;

    /* JADX INFO: renamed from: ܽ */
    public final TextView f5581;

    /* JADX INFO: renamed from: ܿ */
    public final TextView f5582;

    /* JADX INFO: renamed from: ᩳ */
    public final C0990 f5583;

    public C3086(View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        this.f5580 = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(0);
        this.f5582 = (TextView) viewGroup2.getChildAt(0);
        this.f5581 = viewGroup2.getChildCount() > 1 ? (TextView) viewGroup2.getChildAt(1) : null;
        C0990 c0990 = viewGroup.getChildCount() > 1 ? (C0990) viewGroup.getChildAt(1) : null;
        this.f5583 = c0990;
        if (c0990 != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.᩵᩻᩻
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C0990 c0991 = this.f66596.f5583;
                    c0991.setChecked(!c0991.isChecked());
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5221(boolean z) {
        ViewGroup viewGroup = this.f5580;
        viewGroup.setFocusable(z);
        viewGroup.setClickable(z);
        this.f5582.setEnabled(z);
        TextView textView = this.f5581;
        if (textView != null) {
            textView.setAlpha(z ? 1.0f : 0.3f);
        }
        C0990 c0990 = this.f5583;
        if (c0990 != null) {
            c0990.setEnabled(z);
        }
    }
}
