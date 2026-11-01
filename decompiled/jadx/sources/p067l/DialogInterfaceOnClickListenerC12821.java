package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC12821 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f36065;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f36066;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f36067;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f36068;

    public /* synthetic */ DialogInterfaceOnClickListenerC12821(Object obj, Object obj2, Object obj3, int i) {
        this.f36067 = i;
        this.f36068 = obj;
        this.f36066 = obj2;
        this.f36065 = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f36067) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f36068;
                ArrayList arrayList2 = (ArrayList) this.f36066;
                Runnable runnable = (Runnable) this.f36065;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.set(i2, (InterfaceC19370) arrayList2.get(i2));
                }
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                final C12573 c12573 = (C12573) this.f36068;
                AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) this.f36066;
                final int[] iArr = (int[]) this.f36065;
                C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46710(R.string.MT_Protector);
                c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܰۙ᩷
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i3) {
                        C12573.m28966(c12573, iArr);
                    }
                });
                c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20671BuildDialog.m46732();
                break;
        }
    }
}
