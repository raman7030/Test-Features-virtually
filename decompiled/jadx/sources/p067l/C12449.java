package p067l;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12449 {

    /* JADX INFO: renamed from: ֫ */
    public TextView f34797;

    /* JADX INFO: renamed from: ۧ */
    public View f34798;

    /* JADX INFO: renamed from: ܳ */
    public View f34799;

    /* JADX INFO: renamed from: ܽ */
    public TextView f34800;

    /* JADX INFO: renamed from: ܿ */
    public C22508 f34801;

    /* JADX INFO: renamed from: ᩳ */
    public View f34802;

    /* JADX INFO: renamed from: ᩻ */
    public Spinner f34803;

    /* JADX INFO: renamed from: ֫ */
    public final void m28664(int i) {
        TextView textView = this.f34797;
        View view = this.f34802;
        View view2 = this.f34798;
        View view3 = this.f34799;
        C22508 c22508 = this.f34801;
        TextView textView2 = this.f34800;
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
            C21167 c21167 = c22508.f70974;
            if (c21167.f66492.m44476() && c21167.f66496.m44476() && c21167.f66498.m44476()) {
                textView2.setText(c22508.f70974.m47775());
                textView2.setVisibility(0);
                return;
            } else {
                textView2.setVisibility(8);
                return;
            }
        }
        C25189 c25189 = c22508.f70972;
        if (c25189.f80565.m44476() && c25189.f80567.m44476() && c25189.f80571.m44476()) {
            textView2.setText(c22508.f70972.m55258());
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
    }
}
