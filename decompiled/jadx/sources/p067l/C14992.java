package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.editor.TextEditorFunction;
import bin.p000mt.plugin.api.p002ui.PluginView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۬ᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14992 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ JSONObject f42829;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ String f42830;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ FrameLayout f42831;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14322 f42832;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ String f42833;

    public C14992(C14322 c14322, FrameLayout frameLayout, String str, String str2, JSONObject jSONObject) {
        this.f42832 = c14322;
        this.f42831 = frameLayout;
        this.f42830 = str;
        this.f42833 = str2;
        this.f42829 = jSONObject;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        FrameLayout frameLayout = this.f42831;
        frameLayout.removeAllViews();
        frameLayout.setTag(R.id.MT_Protector, null);
        C14322 c14322 = this.f42832;
        C8287 c8287 = (C8287) c14322.f40948.get(i);
        C1349 c1349M19083 = c8287.m19083();
        PluginContext pluginContextM41540 = ((C18249) c1349M19083.f33658).m41540();
        ActivityC2822 activityC2822 = c14322.f40949;
        try {
            PluginView pluginViewBuildOptionsView = ((TextEditorFunction) c1349M19083.f33659).buildOptionsView(new C19456(pluginContextM41540, activityC2822), c8287.m19082(this.f42830, this.f42833) ? this.f42829 : null);
            if (pluginViewBuildOptionsView != null) {
                frameLayout.setTag(R.id.MT_Protector, pluginViewBuildOptionsView);
                frameLayout.addView(((C9318) pluginViewBuildOptionsView).m21563());
            }
        } catch (Throwable th) {
            ((C18249) c1349M19083.f33658).m41526(th);
            activityC2822.m12259(th, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        FrameLayout frameLayout = this.f42831;
        frameLayout.removeAllViews();
        frameLayout.setTag(R.id.MT_Protector, null);
    }
}
