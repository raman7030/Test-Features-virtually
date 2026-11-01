package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۢܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC11521 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f32134;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractActivityC5549 f32135;

    public /* synthetic */ DialogInterfaceOnClickListenerC11521(AbstractActivityC5549 abstractActivityC5549, int i) {
        this.f32134 = i;
        this.f32135 = abstractActivityC5549;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f32134;
        AbstractActivityC5549 abstractActivityC5549 = this.f32135;
        switch (i2) {
            case 0:
                int i3 = ViewOnClickListenerC7497.f19594;
                ((ViewOnClickListenerC7497) abstractActivityC5549).finish();
                break;
            case 1:
                ((ActivityC18686) abstractActivityC5549).finish();
                break;
            default:
                ViewOnLayoutChangeListenerC9723.m22703((ViewOnLayoutChangeListenerC9723) abstractActivityC5549, dialogInterface, i);
                break;
        }
    }
}
