package l;

import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16350 extends AbstractC2968 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9296 f50319;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f50320;

    public C16350(ActivityC9296 activityC9296, TextView textView) {
        this.f50319 = activityC9296;
        this.f50320 = textView;
    }

    @Override // l.AbstractC2968
    public final void onChanged() {
        this.f50320.setVisibility(((ArrayList) this.f50319.f28177).isEmpty() ? 0 : 8);
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
