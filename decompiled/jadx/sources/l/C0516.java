package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.֡ܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes2.dex */
public final class C0516 extends AbstractC2968 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3339 f2167;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f2168;

    public C0516(ActivityC3339 activityC3339, TextView textView) {
        this.f2167 = activityC3339;
        this.f2168 = textView;
    }

    @Override // l.AbstractC2968
    public final void onChanged() {
        this.f2168.setVisibility(this.f2167.f10555.isEmpty() ? 0 : 8);
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
