package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC10998 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f33071;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f33072;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f33073;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f33074;

    public /* synthetic */ DialogInterfaceOnClickListenerC10998(Object obj, Object obj2, Object obj3, int i) {
        this.f33073 = i;
        this.f33074 = obj;
        this.f33072 = obj2;
        this.f33071 = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f33073) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f33074;
                ArrayList arrayList2 = (ArrayList) this.f33072;
                Runnable runnable = (Runnable) this.f33071;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.set(i2, (InterfaceC17889) arrayList2.get(i2));
                }
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                final C10737 c10737 = (C10737) this.f33074;
                AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) this.f33072;
                final int[] iArr = (int[]) this.f33071;
                C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
                c19258BuildDialog.m44433(R.string.MT_Protector);
                c19258BuildDialog.m44416(R.string.MT_Protector);
                c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܰۙ᩷
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface2, int i3) {
                        C10737.m26922(c10737, iArr);
                    }
                });
                c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c19258BuildDialog.m44438();
                break;
        }
    }
}
