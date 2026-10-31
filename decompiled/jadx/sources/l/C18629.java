package l;

import android.app.Dialog;
import android.view.View;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩴ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public final class C18629 extends AbstractViewOnClickListenerC0283 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f57787;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4227 f57788;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18629(Dialog dialog, InterfaceC4227 interfaceC4227, JSONObject jSONObject) {
        super(dialog);
        this.f57788 = interfaceC4227;
        this.f57787 = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Dialog dialog = this.f1629;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
        InterfaceC4227 interfaceC4227 = this.f57788;
        if (interfaceC4227 != null) {
            interfaceC4227.mo3455(this.f57787);
        }
    }
}
