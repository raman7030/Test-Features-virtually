package l;

import android.content.DialogInterface;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ۘ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC3616 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11460;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11461;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f11462;

    public /* synthetic */ DialogInterfaceOnClickListenerC3616(C22372 c22372, Object obj, int i) {
        this.f11461 = i;
        this.f11462 = c22372;
        this.f11460 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f11461;
        Object obj = this.f11460;
        C22372 c22372 = this.f11462;
        switch (i2) {
            case 0:
                MenuItem menuItem = (MenuItem) obj;
                menuItem.setChecked(!menuItem.isChecked());
                boolean zIsChecked = menuItem.isChecked();
                int i3 = ActivityC16315.f50233;
                C22870.m50970(ApplicationC20075.f65008, "axml_id_2_name", zIsChecked);
                c22372.m50218(-1, false, true);
                break;
            default:
                c22372.getClass();
                c22372.m50218(((int[]) obj)[0], false, false);
                break;
        }
    }
}
