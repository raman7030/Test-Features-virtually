package l;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: l.᩹᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC22555 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72947;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72948;

    public /* synthetic */ DialogInterfaceOnClickListenerC22555(int i, Object obj) {
        this.f72947 = i;
        this.f72948 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f72947) {
            case 0:
                ViewOnLayoutChangeListenerC7738.m20744((ViewOnLayoutChangeListenerC7738) this.f72948);
                break;
            case 1:
                AbstractActivityC12266.m29782((AbstractActivityC12266) this.f72948);
                break;
            case 2:
                AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) this.f72948;
                abstractActivityC3346.startActivity(new Intent(abstractActivityC3346, (Class<?>) ActivityC3339.class));
                break;
            case 3:
                C12720.m31001((C12720) this.f72948);
                break;
            default:
                ActivityC17169.m40334((ActivityC17169) this.f72948);
                break;
        }
    }
}
