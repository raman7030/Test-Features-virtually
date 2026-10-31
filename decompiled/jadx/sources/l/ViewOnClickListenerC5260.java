package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: S696 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC5260 implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8082 f16464;

    public ViewOnClickListenerC5260(C8082 c8082) {
        this.f16464 = c8082;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ((C0320) adapterView.getAdapter()).getClass();
        C8082 c8082 = this.f16464;
        c8082.m21446();
        C0320 c0320 = c8082.f24897;
        c0320.getClass();
        c0320.getClass();
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C8082 c8082 = this.f16464;
        C0320 c0320 = c8082.f24897;
        if (view == c8082.f24891) {
            c8082.m21446();
            c0320.getClass();
            throw null;
        }
        if (view == c8082.f24896) {
            c0320.getClass();
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        throw new IllegalArgumentException();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C8082 c8082 = this.f16464;
        if (view == c8082.f24891) {
            c8082.f24897.getClass();
            throw null;
        }
        throw new IllegalArgumentException();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C8082 c8082 = this.f16464;
        c8082.getClass();
        c8082.getClass();
    }
}
