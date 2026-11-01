package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۧۛܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4I7 */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC12648 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final String f35512;

    /* JADX INFO: renamed from: ֫ */
    public static void m29079(int i, AbstractActivityC5549 abstractActivityC5549, String str) {
        m29080(abstractActivityC5549, str, abstractActivityC5549.getString(i), false);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m29081(int i, AbstractActivityC5549 abstractActivityC5549, String str) {
        m29080(abstractActivityC5549, str, abstractActivityC5549.getString(i), true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29080(AbstractActivityC5549 abstractActivityC5549, String str, String str2, boolean z) {
        String strConcat = "forbid_tip_".concat(str);
        if (ApplicationC21448.f67649.getBoolean(strConcat, false)) {
            return;
        }
        new DialogInterfaceOnClickListenerC12648(abstractActivityC5549, strConcat, str2, z);
    }

    public DialogInterfaceOnClickListenerC12648(AbstractActivityC5549 abstractActivityC5549, String str, String str2, boolean z) {
        this.f35512 = str;
        boolean z2 = true;
        if (!z) {
            byte bMo20199 = ApplicationC21448.f67649.mo20199((byte) 0, str + "_count");
            if (bMo20199 <= 1) {
                ApplicationC21448.f67649.edit().mo27874((byte) (bMo20199 + 1), C17588.m40053(str, "_count")).apply();
                z2 = false;
            }
        }
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46727(R.string.MT_Protector);
        c20671.m46718(str2);
        c20671.m46736(R.string.MT_Protector, null);
        if (z2) {
            c20671.m46734(R.string.MT_Protector, this);
        }
        c20671.m46732();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ApplicationC21448.f67649.edit().putBoolean(this.f35512, true).apply();
    }
}
