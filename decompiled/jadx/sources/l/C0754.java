package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: renamed from: l.֡᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0754 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object f2807;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f2808;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f2809;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextView f2810;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2978 f2811;

    public C0754(View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        this.f2808 = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(0);
        this.f2810 = (TextView) viewGroup2.getChildAt(0);
        this.f2809 = viewGroup2.getChildCount() > 1 ? (TextView) viewGroup2.getChildAt(1) : null;
        C2978 c2978 = viewGroup.getChildCount() > 1 ? (C2978) viewGroup.getChildAt(1) : null;
        this.f2811 = c2978;
        if (c2978 != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.᩵᩻᩻
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C2978 c2979 = this.f63959.f2811;
                    c2979.setChecked(!c2979.isChecked());
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2892(boolean z) {
        ViewGroup viewGroup = this.f2808;
        viewGroup.setFocusable(z);
        viewGroup.setClickable(z);
        this.f2810.setEnabled(z);
        TextView textView = this.f2809;
        if (textView != null) {
            textView.setAlpha(z ? 1.0f : 0.3f);
        }
        C2978 c2978 = this.f2811;
        if (c2978 != null) {
            c2978.setEnabled(z);
        }
    }
}
