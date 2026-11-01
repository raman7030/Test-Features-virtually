package p067l;

import android.app.Dialog;
import android.view.View;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩴ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public final class C20073 extends AbstractViewOnClickListenerC2637 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ JSONObject f61010;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC6386 f61011;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20073(Dialog dialog, InterfaceC6386 interfaceC6386, JSONObject jSONObject) {
        super(dialog);
        this.f61011 = interfaceC6386;
        this.f61010 = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Dialog dialog = this.f4407;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
        InterfaceC6386 interfaceC6386 = this.f61011;
        if (interfaceC6386 != null) {
            interfaceC6386.mo5758(this.f61010);
        }
    }
}
