package l;

import android.content.DialogInterface;
import android.widget.BaseAdapter;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۚ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC5582 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17286;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17287;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17288;

    public /* synthetic */ DialogInterfaceOnClickListenerC5582(int i, Object obj, Object obj2) {
        this.f17287 = i;
        this.f17288 = obj;
        this.f17286 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f17287) {
            case 0:
                C16415 c16415 = (C16415) this.f17288;
                BaseAdapter baseAdapter = (BaseAdapter) this.f17286;
                synchronized (c16415) {
                    c16415.f50492.clear();
                    break;
                }
                baseAdapter.notifyDataSetChanged();
                return;
            default:
                Callable callable = (Callable) this.f17288;
                AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) this.f17286;
                try {
                    callable.call();
                    return;
                } catch (Exception e) {
                    abstractActivityC3346.m10223(e, (DialogInterface.OnDismissListener) null);
                    return;
                }
        }
    }
}
