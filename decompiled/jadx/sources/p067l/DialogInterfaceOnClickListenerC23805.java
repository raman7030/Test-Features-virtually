package p067l;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: renamed from: l.᩹᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC23805 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f75674;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f75675;

    public /* synthetic */ DialogInterfaceOnClickListenerC23805(int i, Object obj) {
        this.f75674 = i;
        this.f75675 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f75674) {
            case 0:
                ViewOnLayoutChangeListenerC9723.m22724((ViewOnLayoutChangeListenerC9723) this.f75675);
                break;
            case 1:
                AbstractActivityC14026.m31844((AbstractActivityC14026) this.f75675);
                break;
            case 2:
                AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) this.f75675;
                abstractActivityC5549.startActivity(new Intent(abstractActivityC5549, (Class<?>) ActivityC5542.class));
                break;
            case 3:
                C14458.m33081((C14458) this.f75675);
                break;
            default:
                ActivityC18686.m42579((ActivityC18686) this.f75675);
                break;
        }
    }
}
