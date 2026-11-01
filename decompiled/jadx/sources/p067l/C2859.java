package p067l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.֡ܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes2.dex */
public final class C2859 extends AbstractC5189 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC5542 f4940;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ TextView f4941;

    public C2859(ActivityC5542 activityC5542, TextView textView) {
        this.f4940 = activityC5542;
        this.f4941 = textView;
    }

    @Override // p067l.AbstractC5189
    public final void onChanged() {
        this.f4941.setVisibility(this.f4940.f13365.isEmpty() ? 0 : 8);
    }

    @Override // p067l.AbstractC5189
    public final void onItemRangeChanged(int i, int i2) {
        onChanged();
    }

    @Override // p067l.AbstractC5189
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        onChanged();
    }

    @Override // p067l.AbstractC5189
    public final void onItemRangeInserted(int i, int i2) {
        onChanged();
    }

    @Override // p067l.AbstractC5189
    public final void onItemRangeRemoved(int i, int i2) {
        onChanged();
    }

    @Override // p067l.AbstractC5189
    public final void onItemRangeMoved(int i, int i2, int i3) {
        onChanged();
    }
}
