package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ܺۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5UN */
/* JADX INFO: loaded from: classes4.dex */
public final class C17433 extends AbstractC5189 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C4694 f52102;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ View f52103;

    public C17433(C4694 c4694, View view) {
        this.f52102 = c4694;
        this.f52103 = view;
    }

    @Override // p067l.AbstractC5189
    public final void onChanged() {
        C4694 c4694 = this.f52102;
        AbstractC21283 adapter = c4694.getAdapter();
        boolean z = adapter == null || adapter.getItemCount() == 0;
        View view = this.f52103;
        if (view == null) {
            c4694.setVisibility(0);
        } else if (z) {
            view.setVisibility(0);
            c4694.setVisibility(4);
        } else {
            view.setVisibility(8);
            c4694.setVisibility(0);
        }
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
