package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V6YU */
/* JADX INFO: loaded from: classes4.dex */
public class C11903 extends AbstractC5907 {
    public C11903(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9030();
        m9024((InterfaceC9544) new C6870(1, this));
    }

    @Override // p067l.AbstractC5907
    /* JADX INFO: renamed from: ֫ */
    public final void mo8363(AbstractActivityC5549 abstractActivityC5549) {
        String[] strArrM24100 = C10403.m24100(m9012());
        int i = m13265().getInt(m9037(), 0);
        final boolean[] zArr = new boolean[3];
        for (int i2 = 0; i2 < 3; i2++) {
            boolean z = true;
            if (((1 << i2) & i) == 0) {
                z = false;
            }
            zArr[i2] = z;
        }
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46730(m9035());
        c20671BuildDialog.m46725(strArrM24100, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.۬ۗ᩷
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i3, boolean z2) {
                zArr[i3] = z2;
            }
        });
        c20671BuildDialog.m46733(R.layout.MT_Protector);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13914(0, this, zArr));
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732().m3846(R.id.MT_Protector).setMinimumHeight(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m27223(C11903 c11903, boolean[] zArr) {
        int i = 0;
        for (int i2 = 0; i2 < zArr.length; i2++) {
            if (zArr[i2]) {
                i |= 1 << i2;
            }
        }
        c11903.m13265().edit().putInt(c11903.m9037(), i).apply();
        c11903.mo9048();
    }
}
