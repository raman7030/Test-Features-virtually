package p067l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ۚۢ */
/* JADX INFO: compiled from: S696 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC1103 implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1243 f19301;

    public ViewOnClickListenerC1103(C1243 c1243) {
        this.f19301 = c1243;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ((C0858) adapterView.getAdapter()).getClass();
        C1243 c1243 = this.f19301;
        c1243.m23414();
        C0858 c0858 = c1243.f27808;
        c0858.getClass();
        c0858.getClass();
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1243 c1243 = this.f19301;
        C0858 c0858 = c1243.f27808;
        if (view == c1243.f27802) {
            c1243.m23414();
            c0858.getClass();
            throw null;
        }
        if (view == c1243.f27807) {
            c0858.getClass();
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        throw new IllegalArgumentException();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C1243 c1243 = this.f19301;
        if (view == c1243.f27802) {
            c1243.f27808.getClass();
            throw null;
        }
        throw new IllegalArgumentException();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1243 c1243 = this.f19301;
        c1243.getClass();
        c1243.getClass();
    }
}
