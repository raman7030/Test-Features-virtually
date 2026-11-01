package p067l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.util.AttributeSet;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: LAIU */
/* JADX INFO: loaded from: classes4.dex */
public class C12573 extends AbstractC5907 {

    /* JADX INFO: renamed from: ۫֫ */
    public C3855 f35326;

    public C12573(Context context) {
        super(context);
        m28968();
    }

    public C12573(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28968();
    }

    public C12573(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28968();
    }

    public C12573(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m28968();
    }

    /* JADX INFO: renamed from: ۢ֫ */
    private void m28968() {
        this.f35326 = new C3855(m9012());
        m28967();
    }

    /* JADX INFO: renamed from: ۡ֫ */
    private void m28967() {
        int i = this.f35326.f8301;
        if (i == 0) {
            m9056(R.string.MT_Protector);
        } else if (i == 1) {
            m9056(R.string.MT_Protector);
        } else {
            if (i != 2) {
                return;
            }
            m9056(R.string.MT_Protector);
        }
    }

    @Override // p067l.AbstractC5907
    /* JADX INFO: renamed from: ֫ */
    public final void mo8363(AbstractActivityC5549 abstractActivityC5549) {
        final int[] iArr = {this.f35326.f8301};
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46711(R.array.MT_Protector, this.f35326.f8301, new DialogInterface.OnClickListener() { // from class: l.᩺ۙ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                iArr[0] = i;
            }
        });
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC12821(this, abstractActivityC5549, iArr, 1));
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28966(C12573 c12573, int[] iArr) {
        c12573.f35326.f8301 = iArr[0];
        PackageManager packageManagerM16217 = C7050.m16217();
        ArrayList<C9259> arrayList = new ArrayList(3);
        int i = c12573.f35326.f8301;
        if (i == 0) {
            arrayList.add(new C9259(c12573.f35326.f8298, 2, 1));
            arrayList.add(new C9259(c12573.f35326.f8300, 2, 1));
            arrayList.add(new C9259(c12573.f35326.f8299, 1, 0));
        } else if (i == 1) {
            arrayList.add(new C9259(c12573.f35326.f8299, 2, 1));
            arrayList.add(new C9259(c12573.f35326.f8300, 2, 1));
            arrayList.add(new C9259(c12573.f35326.f8298, 1, 0));
        } else if (i == 2) {
            arrayList.add(new C9259(c12573.f35326.f8299, 2, 1));
            arrayList.add(new C9259(c12573.f35326.f8298, 2, 1));
            arrayList.add(new C9259(c12573.f35326.f8300, 1, 0));
        }
        for (C9259 c9259 : arrayList) {
            packageManagerM16217.setComponentEnabledSetting(c9259.f25137, c9259.f25139, c9259.f25138);
        }
        c12573.m28967();
    }
}
