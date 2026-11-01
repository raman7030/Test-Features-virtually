package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۙ۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6788 implements InterfaceC3326 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f17575;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f17576;

    public /* synthetic */ C6788(int i, Object obj) {
        this.f17575 = i;
        this.f17576 = obj;
    }

    @Override // p067l.InterfaceC3326
    /* JADX INFO: renamed from: ֫ */
    public final void mo4017(Object obj) {
        switch (this.f17575) {
            case 0:
                ((DialogInterfaceOnClickListenerC20813) this.f17576).m47013();
                break;
            default:
                ((ActivityC18686) this.f17576).m12259((Throwable) obj, (DialogInterface.OnDismissListener) null);
                break;
        }
    }
}
