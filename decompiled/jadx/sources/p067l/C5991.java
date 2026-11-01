package p067l;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۘ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C5991 extends AbstractViewOnClickListenerC2637 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C7332 f14825;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ JSONObject f14826;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC6386 f14827;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5991(C7332 c7332, Dialog dialog, InterfaceC6386 interfaceC6386, JSONObject jSONObject) {
        super(dialog);
        this.f14825 = c7332;
        this.f14827 = interfaceC6386;
        this.f14826 = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity activity;
        C10014 c10014 = this.f14825.f19206;
        Bundle bundleM54856 = c10014.m54856();
        if (c10014.f27718 != null && (activity = (Activity) c10014.f27718.get()) != null) {
            C23130.m51586(c10014.f79699, activity, bundleM54856);
        }
        Dialog dialog = this.f4407;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
        InterfaceC6386 interfaceC6386 = this.f14827;
        if (interfaceC6386 != null) {
            interfaceC6386.mo5758(this.f14826);
        }
    }
}
