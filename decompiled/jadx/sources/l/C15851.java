package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܺۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5UN */
/* JADX INFO: loaded from: classes4.dex */
public final class C15851 extends AbstractC2968 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2447 f48964;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f48965;

    public C15851(C2447 c2447, View view) {
        this.f48964 = c2447;
        this.f48965 = view;
    }

    @Override // l.AbstractC2968
    public final void onChanged() {
        C2447 c2447 = this.f48964;
        AbstractC19902 adapter = c2447.getAdapter();
        boolean z = adapter == null || adapter.getItemCount() == 0;
        View view = this.f48965;
        if (view == null) {
            c2447.setVisibility(0);
        } else if (z) {
            view.setVisibility(0);
            c2447.setVisibility(4);
        } else {
            view.setVisibility(8);
            c2447.setVisibility(0);
        }
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
