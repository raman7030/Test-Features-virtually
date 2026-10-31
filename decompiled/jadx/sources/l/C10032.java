package l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V6YU */
/* JADX INFO: loaded from: classes4.dex */
public class C10032 extends AbstractC3723 {
    public C10032(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6904();
        m6898((InterfaceC7550) new C4736(1, this));
    }

    @Override // l.AbstractC3723
    /* JADX INFO: renamed from: ֫ */
    public final void mo6161(AbstractActivityC3346 abstractActivityC3346) {
        String[] strArrM22131 = C8453.m22131(m6886());
        int i = m11313().getInt(m6911(), 0);
        final boolean[] zArr = new boolean[3];
        for (int i2 = 0; i2 < 3; i2++) {
            boolean z = true;
            if (((1 << i2) & i) == 0) {
                z = false;
            }
            zArr[i2] = z;
        }
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44436(m6909());
        c19258BuildDialog.m44431(strArrM22131, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.۬ۗ᩷
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i3, boolean z2) {
                zArr[i3] = z2;
            }
        });
        c19258BuildDialog.m44439(R.layout.MT_Protector);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC12148(0, this, zArr));
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438().m1433(R.id.MT_Protector).setMinimumHeight(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25206(C10032 c10032, boolean[] zArr) {
        int i = 0;
        for (int i2 = 0; i2 < zArr.length; i2++) {
            if (zArr[i2]) {
                i |= 1 << i2;
            }
        }
        c10032.m11313().edit().putInt(c10032.m6911(), i).apply();
        c10032.mo6922();
    }
}
