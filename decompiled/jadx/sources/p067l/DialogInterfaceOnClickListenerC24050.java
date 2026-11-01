package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩺ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC24050 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f76389;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f76390;

    public /* synthetic */ DialogInterfaceOnClickListenerC24050(int i, Object obj) {
        this.f76389 = i;
        this.f76390 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f76389;
        Object obj = this.f76390;
        switch (i2) {
            case 0:
                C5946 c5946 = (C5946) obj;
                c5946.m13340(3);
                c5946.m13338();
                break;
            case 1:
                C11606.m26717((C11606) obj);
                break;
            case 2:
                ViewOnClickListenerC2730.m4236((ViewOnClickListenerC2730) obj);
                break;
            default:
                int i3 = ActivityC12426.f34729;
                ((ActivityC12426) obj).finish();
                break;
        }
    }
}
