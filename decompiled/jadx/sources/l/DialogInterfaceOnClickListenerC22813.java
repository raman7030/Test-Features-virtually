package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩺ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC22813 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73657;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f73658;

    public /* synthetic */ DialogInterfaceOnClickListenerC22813(int i, Object obj) {
        this.f73657 = i;
        this.f73658 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f73657;
        Object obj = this.f73658;
        switch (i2) {
            case 0:
                C3764 c3764 = (C3764) obj;
                c3764.m11404(3);
                c3764.m11402();
                break;
            case 1:
                C9719.m24703((C9719) obj);
                break;
            case 2:
                ViewOnClickListenerC0380.m1829((ViewOnClickListenerC0380) obj);
                break;
            default:
                int i3 = ActivityC10582.f31759;
                ((ActivityC10582) obj).finish();
                break;
        }
    }
}
