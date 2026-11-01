package p067l;

import android.content.DialogInterface;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۜ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC9039 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f24539;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f24540;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f24541;

    public /* synthetic */ DialogInterfaceOnClickListenerC9039(int i, Object obj, Object obj2) {
        this.f24540 = i;
        this.f24541 = obj;
        this.f24539 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f24540) {
            case 0:
                ActivityC4030.m8044((ActivityC4030) this.f24541, (MenuItem) this.f24539);
                break;
            default:
                C12902.m29561((C12902) this.f24541, (String) this.f24539);
                break;
        }
    }
}
