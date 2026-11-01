package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۡ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94PF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC11067 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f30639;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f30640;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f30641;

    public /* synthetic */ DialogInterfaceOnClickListenerC11067(int i, Object obj, Object obj2) {
        this.f30640 = i;
        this.f30641 = obj;
        this.f30639 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f30640) {
            case 0:
                ((C3019) this.f30641).f40549.notifyItemChanged(((C21126) this.f30639).getBindingAdapterPosition());
                break;
            default:
                C12902.m29565((C12902) this.f30641, (String) this.f30639);
                break;
        }
    }
}
