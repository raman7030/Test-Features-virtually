package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۜ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC6792 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21074;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21075;

    public /* synthetic */ DialogInterfaceOnClickListenerC6792(int i, Object obj) {
        this.f21074 = i;
        this.f21075 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f21074) {
            case 0:
                ((C3264) this.f21075).m9992((C18673) null, (DialogInterfaceC0206) null);
                break;
            case 1:
                C10114.m25394((C10114) this.f21075);
                break;
            default:
                ActivityC10582.m26592((ActivityC10582) this.f21075);
                break;
        }
    }
}
