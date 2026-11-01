package p067l;

import android.content.DialogInterface;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۘ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC5805 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f14264;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f14265;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C23631 f14266;

    public /* synthetic */ DialogInterfaceOnClickListenerC5805(C23631 c23631, Object obj, int i) {
        this.f14265 = i;
        this.f14266 = c23631;
        this.f14264 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f14265;
        Object obj = this.f14264;
        C23631 c23631 = this.f14266;
        switch (i2) {
            case 0:
                MenuItem menuItem = (MenuItem) obj;
                menuItem.setChecked(!menuItem.isChecked());
                boolean zIsChecked = menuItem.isChecked();
                int i3 = ActivityC17874.f53400;
                C24104.m53360(ApplicationC21448.f67649, "axml_id_2_name", zIsChecked);
                c23631.m52558(-1, false, true);
                break;
            default:
                c23631.getClass();
                c23631.m52558(((int[]) obj)[0], false, false);
                break;
        }
    }
}
