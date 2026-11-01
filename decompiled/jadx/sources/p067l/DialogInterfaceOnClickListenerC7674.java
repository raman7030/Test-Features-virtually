package p067l;

import android.content.DialogInterface;
import android.widget.BaseAdapter;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۚ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC7674 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f20126;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f20127;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f20128;

    public /* synthetic */ DialogInterfaceOnClickListenerC7674(int i, Object obj, Object obj2) {
        this.f20127 = i;
        this.f20128 = obj;
        this.f20126 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f20127) {
            case 0:
                C17969 c17969 = (C17969) this.f20128;
                BaseAdapter baseAdapter = (BaseAdapter) this.f20126;
                synchronized (c17969) {
                    c17969.f53664.clear();
                    break;
                }
                baseAdapter.notifyDataSetChanged();
                return;
            default:
                Callable callable = (Callable) this.f20128;
                AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) this.f20126;
                try {
                    callable.call();
                    return;
                } catch (Exception e) {
                    abstractActivityC5549.m12259(e, (DialogInterface.OnDismissListener) null);
                    return;
                }
        }
    }
}
