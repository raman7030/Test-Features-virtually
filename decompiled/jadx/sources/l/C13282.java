package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import bin.mt.json.JSONObject;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.editor.TextEditorFunction;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬ᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13282 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f39764;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f39765;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FrameLayout f39766;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12577 f39767;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f39768;

    public C13282(C12577 c12577, FrameLayout frameLayout, String str, String str2, JSONObject jSONObject) {
        this.f39767 = c12577;
        this.f39766 = frameLayout;
        this.f39765 = str;
        this.f39768 = str2;
        this.f39764 = jSONObject;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        FrameLayout frameLayout = this.f39766;
        frameLayout.removeAllViews();
        frameLayout.setTag(R.id.MT_Protector, null);
        C12577 c12577 = this.f39767;
        C6227 c6227 = (C6227) c12577.f37922.get(i);
        C10220 c10220M17151 = c6227.m17151();
        PluginContext pluginContextM39304 = ((C16709) c10220M17151.f30697).m39304();
        ActivityC0477 activityC0477 = c12577.f37923;
        try {
            PluginView pluginViewBuildOptionsView = ((TextEditorFunction) c10220M17151.f30698).buildOptionsView(new C17979(pluginContextM39304, activityC0477), c6227.m17150(this.f39765, this.f39768) ? this.f39764 : null);
            if (pluginViewBuildOptionsView != null) {
                frameLayout.setTag(R.id.MT_Protector, pluginViewBuildOptionsView);
                frameLayout.addView(((C7312) pluginViewBuildOptionsView).m19595());
            }
        } catch (Throwable th) {
            ((C16709) c10220M17151.f30697).m39290(th);
            activityC0477.m10223(th, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        FrameLayout frameLayout = this.f39766;
        frameLayout.removeAllViews();
        frameLayout.setTag(R.id.MT_Protector, null);
    }
}
