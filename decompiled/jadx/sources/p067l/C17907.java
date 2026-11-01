package p067l;

import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17907 extends AbstractC5189 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC11203 f53492;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ TextView f53493;

    public C17907(ActivityC11203 activityC11203, TextView textView) {
        this.f53492 = activityC11203;
        this.f53493 = textView;
    }

    @Override // p067l.AbstractC5189
    public final void onChanged() {
        this.f53493.setVisibility(((ArrayList) this.f53492.f31126).isEmpty() ? 0 : 8);
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
