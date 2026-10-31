package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۡ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94PF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC9152 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27699;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27700;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27701;

    public /* synthetic */ DialogInterfaceOnClickListenerC9152(int i, Object obj, Object obj2) {
        this.f27700 = i;
        this.f27701 = obj;
        this.f27699 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f27700) {
            case 0:
                ((C0684) this.f27701).f37526.notifyItemChanged(((C19736) this.f27699).getBindingAdapterPosition());
                break;
            default:
                C11083.m27503((C11083) this.f27701, (String) this.f27699);
                break;
        }
    }
}
