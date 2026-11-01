package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC19782 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f60181;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f60182;

    public /* synthetic */ DialogInterfaceOnClickListenerC19782(int i, Object obj) {
        this.f60181 = i;
        this.f60182 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f60181;
        Object obj = this.f60182;
        switch (i2) {
            case 0:
                ((Runnable) obj).run();
                break;
            case 1:
                C23631 c23631 = (C23631) obj;
                c23631.m52563((ActivityC17874) c23631.requireActivity(), (DialogInterfaceC1814) dialogInterface);
                break;
            case 2:
                C15957.m36245((C15957) obj);
                break;
            case 3:
                C21954.m49478((C21954) obj);
                break;
            default:
                ViewOnClickListenerC7928 viewOnClickListenerC7928 = (ViewOnClickListenerC7928) obj;
                int i3 = ViewOnClickListenerC7928.f20793;
                C14853 c14853 = new C14853(viewOnClickListenerC7928, R.string.MT_Protector);
                c14853.m33956();
                new Thread(new RunnableC15185(0, viewOnClickListenerC7928, new C12583(c14853, viewOnClickListenerC7928))).start();
                break;
        }
    }
}
