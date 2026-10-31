package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۙ۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4650 implements InterfaceC1008 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f14748;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f14749;

    public /* synthetic */ C4650(int i, Object obj) {
        this.f14748 = i;
        this.f14749 = obj;
    }

    @Override // l.InterfaceC1008
    /* JADX INFO: renamed from: ֫ */
    public final void mo1617(Object obj) {
        switch (this.f14748) {
            case 0:
                ((DialogInterfaceOnClickListenerC19407) this.f14749).m44719();
                break;
            default:
                ((ActivityC17169) this.f14749).m10223((Throwable) obj, (DialogInterface.OnDismissListener) null);
                break;
        }
    }
}
