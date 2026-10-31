package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۚۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5114 extends AbstractC2968 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19932 f16027;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f16028;

    public C5114(ActivityC19932 activityC19932, TextView textView) {
        this.f16027 = activityC19932;
        this.f16028 = textView;
    }

    @Override // l.AbstractC2968
    public final void onChanged() {
        this.f16028.setVisibility(this.f16027.f64531.isEmpty() ? 0 : 8);
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
