package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.widget.CheckBox;

/* JADX INFO: renamed from: l.۫۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC14168 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f40408;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f40409;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f40410;

    public /* synthetic */ DialogInterfaceOnClickListenerC14168(int i, Object obj, Object obj2) {
        this.f40409 = i;
        this.f40410 = obj;
        this.f40408 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f40409) {
            case 0:
                ActivityC18686.m42521((ActivityC18686) this.f40410, (CheckBox) this.f40408);
                break;
            case 1:
                ActivityC2822.m4480((ActivityC2822) this.f40410, (boolean[]) this.f40408);
                break;
            default:
                String str = (String) this.f40410;
                InterfaceC14936 interfaceC14936 = (InterfaceC14936) this.f40408;
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                intent.setFlags(195);
                String strM29567 = C12902.m29567();
                intent.setPackage(strM29567);
                intent.putExtra("android.provider.extra.INITIAL_URI", C16253.m37019(str + ":", true));
                try {
                    interfaceC14936.mo113(intent);
                    break;
                } catch (Exception e) {
                    if (strM29567 == null) {
                        interfaceC14936.mo12258(e);
                        return;
                    } else {
                        interfaceC14936.mo12256(strM29567);
                    }
                }
                break;
        }
    }
}
