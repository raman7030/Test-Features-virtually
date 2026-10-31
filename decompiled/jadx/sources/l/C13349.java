package l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K6KF */
/* JADX INFO: loaded from: classes4.dex */
public class C13349 extends AbstractC3723 {
    public C13349(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6898((InterfaceC7550) new C7037(context));
    }

    @Override // l.AbstractC3723
    /* JADX INFO: renamed from: ֫ */
    public final void mo6161(final AbstractActivityC3346 abstractActivityC3346) {
        int i;
        final String string = ApplicationC20075.f65008.getString("ais", "");
        String[] strArr = {abstractActivityC3346.getString(R.string.MT_Protector), abstractActivityC3346.getString(R.string.MT_Protector), abstractActivityC3346.getString(R.string.MT_Protector)};
        if (string.isEmpty()) {
            i = 0;
        } else {
            i = string.equals("com.android.vending") ? 1 : 2;
        }
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44439(R.layout.MT_Protector);
        c19258BuildDialog.m44429(strArr, i, new DialogInterface.OnClickListener() { // from class: l.ۙ᩶᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f15429.m32321(abstractActivityC3346, string, dialogInterface, i2);
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m32321(AbstractActivityC3346 abstractActivityC3346, String str, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (i != 2) {
            C11356.m28106(i == 0 ? "" : "com.android.vending");
            mo6922();
            return;
        }
        C3472 c3472 = new C3472(this, abstractActivityC3346);
        c3472.m31258(R.string.MT_Protector);
        c3472.m31256(R.string.MT_Protector);
        c3472.m31265(abstractActivityC3346.getString(R.string.MT_Protector));
        c3472.m31276(524289);
        c3472.m31250((CharSequence) str);
        c3472.m31244();
        c3472.m31266(true);
    }
}
