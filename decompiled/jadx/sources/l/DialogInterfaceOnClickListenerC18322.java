package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC18322 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56963;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56964;

    public /* synthetic */ DialogInterfaceOnClickListenerC18322(int i, Object obj) {
        this.f56963 = i;
        this.f56964 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f56963;
        Object obj = this.f56964;
        switch (i2) {
            case 0:
                ((Runnable) obj).run();
                break;
            case 1:
                C22372 c22372 = (C22372) obj;
                c22372.m50223((ActivityC16315) c22372.requireActivity(), (DialogInterfaceC19598) dialogInterface);
                break;
            case 2:
                C14298.m34112((C14298) obj);
                break;
            case 3:
                C20608.m47152((C20608) obj);
                break;
            default:
                ViewOnClickListenerC5850 viewOnClickListenerC5850 = (ViewOnClickListenerC5850) obj;
                int i3 = ViewOnClickListenerC5850.f17941;
                C13136 c13136 = new C13136(viewOnClickListenerC5850, R.string.MT_Protector);
                c13136.m31864();
                new Thread(new RunnableC13486(0, viewOnClickListenerC5850, new C10748(c13136, viewOnClickListenerC5850))).start();
                break;
        }
    }
}
