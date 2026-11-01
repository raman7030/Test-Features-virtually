package p067l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۢ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes3.dex */
public final class C11705 extends AbstractC5189 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C4999 f32632;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ TextView f32633;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C14849 f32634;

    public C11705(C4999 c4999, C14849 c14849, TextView textView) {
        this.f32632 = c4999;
        this.f32634 = c14849;
        this.f32633 = textView;
    }

    @Override // p067l.AbstractC5189
    public final void onChanged() {
        int size = this.f32632.f11391.size();
        TextView textView = this.f32633;
        C14849 c14849 = this.f32634;
        if (size == 0) {
            c14849.setVisibility(8);
            textView.setVisibility(0);
        } else {
            c14849.setVisibility(0);
            textView.setVisibility(8);
        }
    }
}
