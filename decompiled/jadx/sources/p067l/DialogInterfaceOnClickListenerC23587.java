package p067l;

import android.content.DialogInterface;
import android.widget.Spinner;

/* JADX INFO: renamed from: l.᩹ܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1K5 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC23587 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Spinner f75089;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C4697 f75090;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C0990 f75091;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C0990 f75092;

    static {
        ApplicationC14266.m56479(157);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public native void onClick(DialogInterface dialogInterface, int i);

    public DialogInterfaceOnClickListenerC23587(Spinner spinner, C4697 c4697, C0990 c0990, C0990 c0991) {
        this.f75089 = spinner;
        this.f75090 = c4697;
        this.f75091 = c0990;
        this.f75092 = c0991;
    }
}
