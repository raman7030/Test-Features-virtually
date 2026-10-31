package l;

import android.content.DialogInterface;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۜ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC7018 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21658;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21659;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21660;

    public /* synthetic */ DialogInterfaceOnClickListenerC7018(int i, Object obj, Object obj2) {
        this.f21659 = i;
        this.f21660 = obj;
        this.f21658 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f21659) {
            case 0:
                ActivityC1748.m5834((ActivityC1748) this.f21660, (MenuItem) this.f21658);
                break;
            default:
                C11083.m27499((C11083) this.f21660, (String) this.f21658);
                break;
        }
    }
}
