package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19AV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19133 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Main mainM36593 = C15528.m36593();
        if (mainM36593 != null) {
            C19258 c19258BuildDialog = mainM36593.buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44416(R.string.MT_Protector);
            c19258BuildDialog.m44442(R.string.MT_Protector, null);
            c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC0081(0, mainM36593));
            c19258BuildDialog.m44437("Shizuku", (DialogInterface.OnClickListener) null);
            DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
            C8960.m23095(dialogInterfaceC0206M44438);
            dialogInterfaceC0206M44438.m1448().setOnClickListener(new ViewOnClickListenerC5021(0, mainM36593));
        }
    }
}
