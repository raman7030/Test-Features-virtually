package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.widget.CheckBox;

/* JADX INFO: renamed from: l.۫۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC12415 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f37391;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f37392;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f37393;

    public /* synthetic */ DialogInterfaceOnClickListenerC12415(int i, Object obj, Object obj2) {
        this.f37392 = i;
        this.f37393 = obj;
        this.f37391 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f37392) {
            case 0:
                ActivityC17169.m40276((ActivityC17169) this.f37393, (CheckBox) this.f37391);
                break;
            case 1:
                ActivityC0477.m2099((ActivityC0477) this.f37393, (boolean[]) this.f37391);
                break;
            default:
                String str = (String) this.f37393;
                InterfaceC13223 interfaceC13223 = (InterfaceC13223) this.f37391;
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                intent.setFlags(195);
                String strM27505 = C11083.m27505();
                intent.setPackage(strM27505);
                intent.putExtra("android.provider.extra.INITIAL_URI", C14609.m34868(str + ":", true));
                try {
                    interfaceC13223.mo115(intent);
                    break;
                } catch (Exception e) {
                    if (strM27505 == null) {
                        interfaceC13223.mo10222(e);
                        return;
                    } else {
                        interfaceC13223.mo10220(strM27505);
                    }
                }
                break;
        }
    }
}
