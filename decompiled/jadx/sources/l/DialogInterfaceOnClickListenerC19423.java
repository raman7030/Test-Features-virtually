package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩵ۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: P67V */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC19423 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62827;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62828;

    public /* synthetic */ DialogInterfaceOnClickListenerC19423(int i, Object obj) {
        this.f62827 = i;
        this.f62828 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f62827) {
            case 0:
                C3764 c3764 = (C3764) this.f62828;
                c3764.m11413(3);
                c3764.m11412();
                break;
            case 1:
                AbstractViewOnClickListenerC5230.m15022((AbstractViewOnClickListenerC5230) this.f62828, i);
                break;
            default:
                ((Runnable) this.f62828).run();
                break;
        }
    }
}
