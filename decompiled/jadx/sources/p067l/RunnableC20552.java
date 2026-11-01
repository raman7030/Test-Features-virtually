package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19AV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC20552 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Main mainM38753 = C17127.m38753();
        if (mainM38753 != null) {
            C20671 c20671BuildDialog = mainM38753.buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46710(R.string.MT_Protector);
            c20671BuildDialog.m46736(R.string.MT_Protector, null);
            c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC2445(0, mainM38753));
            c20671BuildDialog.m46731("Shizuku", (DialogInterface.OnClickListener) null);
            DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
            C10884.m25069(dialogInterfaceC2564M46732);
            dialogInterfaceC2564M46732.m3861().setOnClickListener(new ViewOnClickListenerC7140(0, mainM38753));
        }
    }
}
