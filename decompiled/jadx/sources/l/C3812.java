package l;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۘ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C3812 extends AbstractViewOnClickListenerC0283 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5223 f12017;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f12018;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4227 f12019;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3812(C5223 c5223, Dialog dialog, InterfaceC4227 interfaceC4227, JSONObject jSONObject) {
        super(dialog);
        this.f12017 = c5223;
        this.f12019 = interfaceC4227;
        this.f12018 = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity activity;
        C8045 c8045 = this.f12017.f16366;
        Bundle bundleM52447 = c8045.m52447();
        if (c8045.f24804 != null && (activity = (Activity) c8045.f24804.get()) != null) {
            C21845.m49235(c8045.f76946, activity, bundleM52447);
        }
        Dialog dialog = this.f1629;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
        InterfaceC4227 interfaceC4227 = this.f12019;
        if (interfaceC4227 != null) {
            interfaceC4227.mo3455(this.f12018);
        }
    }
}
