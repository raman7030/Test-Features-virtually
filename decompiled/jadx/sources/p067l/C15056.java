package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۬᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K6KF */
/* JADX INFO: loaded from: classes4.dex */
public class C15056 extends AbstractC5907 {
    public C15056(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9024((InterfaceC9544) new C9057(context));
    }

    @Override // p067l.AbstractC5907
    /* JADX INFO: renamed from: ֫ */
    public final void mo8363(final AbstractActivityC5549 abstractActivityC5549) {
        int i;
        final String string = ApplicationC21448.f67649.getString("ais", "");
        String[] strArr = {abstractActivityC5549.getString(R.string.MT_Protector), abstractActivityC5549.getString(R.string.MT_Protector), abstractActivityC5549.getString(R.string.MT_Protector)};
        if (string.isEmpty()) {
            i = 0;
        } else {
            i = string.equals("com.android.vending") ? 1 : 2;
        }
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46733(R.layout.MT_Protector);
        c20671BuildDialog.m46723(strArr, i, new DialogInterface.OnClickListener() { // from class: l.ۙ᩶᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f18264.m34422(abstractActivityC5549, string, dialogInterface, i2);
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m34422(AbstractActivityC5549 abstractActivityC5549, String str, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (i != 2) {
            C13161.m30150(i == 0 ? "" : "com.android.vending");
            mo9048();
            return;
        }
        C5669 c5669 = new C5669(this, abstractActivityC5549);
        c5669.m33344(R.string.MT_Protector);
        c5669.m33342(R.string.MT_Protector);
        c5669.m33351(abstractActivityC5549.getString(R.string.MT_Protector));
        c5669.m33362(524289);
        c5669.m33336((CharSequence) str);
        c5669.m33330();
        c5669.m33352(true);
    }
}
