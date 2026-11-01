package p067l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۚۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7229 extends AbstractC5189 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC21312 f18861;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ TextView f18862;

    public C7229(ActivityC21312 activityC21312, TextView textView) {
        this.f18861 = activityC21312;
        this.f18862 = textView;
    }

    @Override // p067l.AbstractC5189
    public final void onChanged() {
        this.f18862.setVisibility(this.f18861.f67168.isEmpty() ? 0 : 8);
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
