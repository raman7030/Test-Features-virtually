package p067l;

import android.content.DialogInterface;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩵۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnCancelListenerC20744 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC6386 f64016;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ JSONObject f64017;

    public DialogInterfaceOnCancelListenerC20744(InterfaceC6386 interfaceC6386, JSONObject jSONObject) {
        this.f64016 = interfaceC6386;
        this.f64017 = jSONObject;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        InterfaceC6386 interfaceC6386 = this.f64016;
        if (interfaceC6386 != null) {
            interfaceC6386.mo5758(this.f64017);
        }
    }
}
