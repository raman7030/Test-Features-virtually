package l;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10606 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public TextView f31826;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public View f31827;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public View f31828;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TextView f31829;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C21190 f31830;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public View f31831;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Spinner f31832;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26625(int i) {
        TextView textView = this.f31826;
        View view = this.f31831;
        View view2 = this.f31827;
        View view3 = this.f31828;
        C21190 c21190 = this.f31830;
        TextView textView2 = this.f31829;
        if (i == 0) {
            view3.setVisibility(0);
            view2.setVisibility(8);
            view.setVisibility(8);
            textView.setText(R.string.MT_Protector);
        } else if (i == 1) {
            view3.setVisibility(0);
            view2.setVisibility(0);
            view.setVisibility(8);
            textView.setText(R.string.MT_Protector);
        } else if (i == 2) {
            view3.setVisibility(8);
            view2.setVisibility(8);
            view.setVisibility(0);
            textView.setText(R.string.MT_Protector);
        } else {
            throw new RuntimeException();
        }
        if (i != 2) {
            C19779 c19779 = c21190.f68292;
            if (c19779.f63854.m42217() && c19779.f63858.m42217() && c19779.f63860.m42217()) {
                textView2.setText(c21190.f68292.m45464());
                textView2.setVisibility(0);
                return;
            } else {
                textView2.setVisibility(8);
                return;
            }
        }
        C24011 c24011 = c21190.f68290;
        if (c24011.f77813.m42217() && c24011.f77815.m42217() && c24011.f77819.m42217()) {
            textView2.setText(c21190.f68290.m52852());
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
    }
}
