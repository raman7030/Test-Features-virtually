package l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.util.AttributeSet;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: LAIU */
/* JADX INFO: loaded from: classes4.dex */
public class C10737 extends AbstractC3723 {

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public C1564 f32351;

    public C10737(Context context) {
        super(context);
        m26924();
    }

    public C10737(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26924();
    }

    public C10737(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26924();
    }

    public C10737(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m26924();
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    private void m26924() {
        this.f32351 = new C1564(m6886());
        m26923();
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    private void m26923() {
        int i = this.f32351.f5520;
        if (i == 0) {
            m6930(R.string.MT_Protector);
        } else if (i == 1) {
            m6930(R.string.MT_Protector);
        } else {
            if (i != 2) {
                return;
            }
            m6930(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC3723
    /* JADX INFO: renamed from: ֫ */
    public final void mo6161(AbstractActivityC3346 abstractActivityC3346) {
        final int[] iArr = {this.f32351.f5520};
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44417(R.array.MT_Protector, this.f32351.f5520, new DialogInterface.OnClickListener() { // from class: l.᩺ۙ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                iArr[0] = i;
            }
        });
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10998(this, abstractActivityC3346, iArr, 1));
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26922(C10737 c10737, int[] iArr) {
        c10737.f32351.f5520 = iArr[0];
        PackageManager packageManagerM14320 = C4925.m14320();
        ArrayList<C7250> arrayList = new ArrayList(3);
        int i = c10737.f32351.f5520;
        if (i == 0) {
            arrayList.add(new C7250(c10737.f32351.f5517, 2, 1));
            arrayList.add(new C7250(c10737.f32351.f5519, 2, 1));
            arrayList.add(new C7250(c10737.f32351.f5518, 1, 0));
        } else if (i == 1) {
            arrayList.add(new C7250(c10737.f32351.f5518, 2, 1));
            arrayList.add(new C7250(c10737.f32351.f5519, 2, 1));
            arrayList.add(new C7250(c10737.f32351.f5517, 1, 0));
        } else if (i == 2) {
            arrayList.add(new C7250(c10737.f32351.f5518, 2, 1));
            arrayList.add(new C7250(c10737.f32351.f5517, 2, 1));
            arrayList.add(new C7250(c10737.f32351.f5519, 1, 0));
        }
        for (C7250 c7250 : arrayList) {
            packageManagerM14320.setComponentEnabledSetting(c7250.f22247, c7250.f22249, c7250.f22248);
        }
        c10737.m26923();
    }
}
