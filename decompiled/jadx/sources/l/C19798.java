package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.᩵᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes5.dex */
public final class C19798 extends AbstractC2968 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC4980 f63946;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f63947;

    public C19798(ActivityC4980 activityC4980, TextView textView) {
        this.f63946 = activityC4980;
        this.f63947 = textView;
    }

    @Override // l.AbstractC2968
    public final void onChanged() {
        this.f63947.setVisibility(this.f63946.f15688.isEmpty() ? 0 : 8);
    }

    @Override // l.AbstractC2968
    public final void onItemRangeChanged(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC2968
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        onChanged();
    }

    @Override // l.AbstractC2968
    public final void onItemRangeInserted(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC2968
    public final void onItemRangeRemoved(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC2968
    public final void onItemRangeMoved(int i, int i2, int i3) {
        onChanged();
    }
}
