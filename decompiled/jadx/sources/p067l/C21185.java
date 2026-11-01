package p067l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.᩵᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes5.dex */
public final class C21185 extends AbstractC5189 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC7102 f66583;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ TextView f66584;

    public C21185(ActivityC7102 activityC7102, TextView textView) {
        this.f66583 = activityC7102;
        this.f66584 = textView;
    }

    @Override // p067l.AbstractC5189
    public final void onChanged() {
        this.f66584.setVisibility(this.f66583.f18522.isEmpty() ? 0 : 8);
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
